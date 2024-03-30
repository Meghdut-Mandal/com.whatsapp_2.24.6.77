package X;

import java.io.DataInputStream;
import java.io.File;

/* renamed from: X.6wF  reason: invalid class name and case insensitive filesystem */
public class C146836wF implements C23074B3e {
    public long A00 = 0;
    public final long A01;
    public final DataInputStream A02;

    public boolean BK5() {
        return C36431kI.A1P((this.A00 > this.A01 ? 1 : (this.A00 == this.A01 ? 0 : -1)));
    }

    public void Bmr(byte[] bArr) {
        this.A02.read(bArr);
        this.A00 += (long) bArr.length;
    }

    public long BnX() {
        return this.A01 - this.A00;
    }

    public void Bre(long j) {
        Bmr(new byte[((int) (j - this.A00))]);
    }

    public void close() {
        this.A02.close();
    }

    public byte readByte() {
        byte readByte = this.A02.readByte();
        this.A00++;
        return readByte;
    }

    public int readInt() {
        int readInt = this.A02.readInt();
        this.A00 += 4;
        return readInt;
    }

    public long readLong() {
        this.A00 += 8;
        return this.A02.readLong();
    }

    public short readShort() {
        short readShort = this.A02.readShort();
        this.A00 += 2;
        return readShort;
    }

    public C146836wF(File file) {
        this.A01 = file.length();
        this.A02 = new DataInputStream(C90474aD.A0U(file));
    }

    public long position() {
        return this.A00;
    }
}
