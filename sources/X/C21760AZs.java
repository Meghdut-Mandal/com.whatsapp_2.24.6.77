package X;

/* renamed from: X.AZs  reason: case insensitive filesystem */
public class C21760AZs implements C16590pl {
    public C16590pl A00;
    public byte[] A01;

    public C21760AZs(C16590pl r3, byte[] bArr) {
        this(r3, bArr, 0, bArr.length);
    }

    public C21760AZs(C16590pl r3, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.A01 = bArr2;
        this.A00 = r3;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
