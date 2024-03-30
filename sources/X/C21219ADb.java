package X;

import java.io.DataOutputStream;

/* renamed from: X.ADb  reason: case insensitive filesystem */
public class C21219ADb implements C23074B3e {
    public final C23074B3e A00;
    public final DataOutputStream A01;

    public boolean BK5() {
        return this.A00.BK5();
    }

    public void Bmr(byte[] bArr) {
        this.A00.Bmr(bArr);
        this.A01.write(bArr);
    }

    public long BnX() {
        return this.A00.BnX();
    }

    public void Bre(long j) {
        Bmr(new byte[((int) (j - this.A00.position()))]);
    }

    public void close() {
        this.A00.close();
        this.A01.close();
    }

    public long position() {
        return this.A00.position();
    }

    public byte readByte() {
        byte readByte = this.A00.readByte();
        this.A01.write(readByte);
        return readByte;
    }

    public int readInt() {
        int readInt = this.A00.readInt();
        this.A01.writeInt(readInt);
        return readInt;
    }

    public long readLong() {
        long readLong = this.A00.readLong();
        this.A01.writeLong(readLong);
        return readLong;
    }

    public short readShort() {
        short readShort = this.A00.readShort();
        this.A01.writeShort(readShort);
        return readShort;
    }

    public C21219ADb(C23074B3e b3e, DataOutputStream dataOutputStream) {
        this.A00 = b3e;
        this.A01 = dataOutputStream;
    }
}
