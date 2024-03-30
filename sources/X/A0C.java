package X;

public class A0C implements B2C {
    public A0D A00;
    public A0E A01;

    public void Bkt(C202189lD r2) {
        this.A00.Bkt(r2);
        this.A01.Bkt(r2);
    }

    public void close() {
        A0D.A00(this.A00);
        this.A01.close();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A00.write(bArr, i, i2);
        this.A01.write(bArr, i, i2);
    }

    public A0C(A0D a0d, A0E a0e) {
        this.A00 = a0d;
        this.A01 = a0e;
    }
}
