package X;

import android.util.Log;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.8xw  reason: invalid class name and case insensitive filesystem */
public class C187478xw extends InputStream implements DataInput {
    public static final ByteOrder A04 = ByteOrder.BIG_ENDIAN;
    public static final ByteOrder A05 = ByteOrder.LITTLE_ENDIAN;
    public int A00;
    public ByteOrder A01;
    public byte[] A02;
    public final DataInputStream A03;

    public void A00(int i) {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.A03;
            int i3 = i - i2;
            int skip = (int) dataInputStream.skip((long) i3);
            if (skip <= 0) {
                byte[] bArr = this.A02;
                if (bArr == null) {
                    bArr = new byte[DefaultCrypto.BUFFER_SIZE];
                    this.A02 = bArr;
                }
                skip = dataInputStream.read(bArr, 0, Math.min(DefaultCrypto.BUFFER_SIZE, i3));
                if (skip == -1) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Reached EOF while skipping ");
                    A0u.append(i);
                    throw new EOFException(AnonymousClass000.A0q(" bytes.", A0u));
                }
            }
            i2 += skip;
        }
        this.A00 += i2;
    }

    public int available() {
        return this.A03.available();
    }

    public void mark(int i) {
        throw AnonymousClass001.A0E("Mark is currently unsupported");
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A03.read(bArr, i, i2);
        this.A00 += read;
        return read;
    }

    public boolean readBoolean() {
        this.A00++;
        return this.A03.readBoolean();
    }

    public byte readByte() {
        this.A00++;
        int read = this.A03.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw C165617ti.A0T();
    }

    public char readChar() {
        this.A00 += 2;
        return this.A03.readChar();
    }

    public void readFully(byte[] bArr, int i, int i2) {
        this.A00 += i2;
        this.A03.readFully(bArr, i, i2);
    }

    public int readInt() {
        this.A00 += 4;
        DataInputStream dataInputStream = this.A03;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.A01;
            if (byteOrder == A05) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == A04) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw C165567td.A0L(byteOrder);
        }
        throw C165617ti.A0T();
    }

    public String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public long readLong() {
        long j;
        long j2;
        this.A00 += 8;
        DataInputStream dataInputStream = this.A03;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.A01;
            if (byteOrder == A05) {
                j = (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8);
                j2 = (long) read;
            } else if (byteOrder == A04) {
                j = (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8);
                j2 = (long) read8;
            } else {
                throw C165567td.A0L(byteOrder);
            }
            return j + j2;
        }
        throw C165617ti.A0T();
    }

    public short readShort() {
        int i;
        this.A00 += 2;
        DataInputStream dataInputStream = this.A03;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.A01;
            if (byteOrder == A05) {
                i = (read2 << 8) + read;
            } else if (byteOrder == A04) {
                i = (read << 8) + read2;
            } else {
                throw C165567td.A0L(byteOrder);
            }
            return (short) i;
        }
        throw C165617ti.A0T();
    }

    public String readUTF() {
        this.A00 += 2;
        return this.A03.readUTF();
    }

    public int readUnsignedByte() {
        this.A00++;
        return this.A03.readUnsignedByte();
    }

    public int readUnsignedShort() {
        this.A00 += 2;
        DataInputStream dataInputStream = this.A03;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.A01;
            if (byteOrder == A05) {
                return (read2 << 8) + read;
            }
            if (byteOrder == A04) {
                return (read << 8) + read2;
            }
            throw C165567td.A0L(byteOrder);
        }
        throw C165617ti.A0T();
    }

    public void reset() {
        throw AnonymousClass001.A0E("Reset is currently unsupported");
    }

    public int skipBytes(int i) {
        throw AnonymousClass001.A0E("skipBytes is currently unsupported");
    }

    public C187478xw(InputStream inputStream, ByteOrder byteOrder) {
        this.A01 = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A03 = dataInputStream;
        dataInputStream.mark(0);
        this.A00 = 0;
        this.A01 = byteOrder;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public C187478xw(byte[] bArr) {
        this(C90524aI.A0P(bArr), ByteOrder.BIG_ENDIAN);
    }

    public int read() {
        this.A00++;
        return this.A03.read();
    }

    public void readFully(byte[] bArr) {
        this.A00 += bArr.length;
        this.A03.readFully(bArr);
    }
}
