package X;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.ATv  reason: case insensitive filesystem */
public class C21654ATv implements Closeable {
    public static final ByteOrder A04 = ByteOrder.BIG_ENDIAN;
    public static final ByteOrder A05 = ByteOrder.LITTLE_ENDIAN;
    public int A00;
    public DataInputStream A01;
    public ByteOrder A02 = ByteOrder.BIG_ENDIAN;
    public final int A03;

    public byte A00() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i <= this.A03) {
            int read = this.A01.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw C165617ti.A0T();
        }
        throw C165617ti.A0T();
    }

    public int A01() {
        int i = this.A00 + 4;
        this.A00 = i;
        if (i <= this.A03) {
            DataInputStream dataInputStream = this.A01;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.A02;
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
        throw C165617ti.A0T();
    }

    public int A02() {
        int i = this.A00 + 2;
        this.A00 = i;
        if (i <= this.A03) {
            DataInputStream dataInputStream = this.A01;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.A02;
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
        throw C165617ti.A0T();
    }

    public int A03(int i) {
        int min = Math.min(i, this.A03 - this.A00);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.A01.skipBytes(min - i2);
        }
        this.A00 += i2;
        return i2;
    }

    public short A04() {
        int i;
        int i2 = this.A00 + 2;
        this.A00 = i2;
        if (i2 <= this.A03) {
            DataInputStream dataInputStream = this.A01;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.A02;
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
        throw C165617ti.A0T();
    }

    public void A05(long j) {
        long j2 = (long) this.A00;
        if (j2 > j) {
            this.A00 = 0;
            DataInputStream dataInputStream = this.A01;
            dataInputStream.reset();
            dataInputStream.mark(this.A03);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (A03(i) != i) {
            throw C90524aI.A0X("Couldn't seek up to the byteCount");
        }
    }

    public void A06(byte[] bArr) {
        int i = this.A00;
        int length = bArr.length;
        int i2 = i + length;
        this.A00 = i2;
        if (i2 > this.A03) {
            throw C165617ti.A0T();
        } else if (this.A01.read(bArr, 0, length) != length) {
            throw C90524aI.A0X("Couldn't read up to the length of buffer");
        }
    }

    public void close() {
        this.A01.close();
    }

    public C21654ATv(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A01 = dataInputStream;
        int available = dataInputStream.available();
        this.A03 = available;
        this.A00 = 0;
        this.A01.mark(available);
    }
}
