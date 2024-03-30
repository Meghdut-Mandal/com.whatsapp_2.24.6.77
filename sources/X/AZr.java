package X;

public class AZr implements C16590pl {
    public byte[] A00;

    public AZr(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public AZr(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.A00 = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
