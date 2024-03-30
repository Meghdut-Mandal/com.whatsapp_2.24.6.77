package X;

/* renamed from: X.AZm  reason: case insensitive filesystem */
public class C21758AZm implements C16590pl {
    public byte[] A00;

    public C21758AZm(byte[] bArr) {
        int length = bArr.length;
        if (length <= 255) {
            byte[] bArr2 = new byte[length];
            this.A00 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        throw AnonymousClass001.A08("RC5 key length can be no greater than 255");
    }
}
