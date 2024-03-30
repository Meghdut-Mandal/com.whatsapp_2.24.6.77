package X;

/* renamed from: X.9MW  reason: invalid class name */
public class AnonymousClass9MW {
    public final C199769fw A00;
    public final C201539jo A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public AnonymousClass9MW(C199769fw r5, C201539jo r6, byte[] bArr, byte[] bArr2) {
        this.A01 = r6;
        this.A03 = bArr;
        this.A00 = r5;
        this.A02 = bArr2;
        byte[] bArr3 = new byte[32];
        int length = bArr2.length;
        if (length < 32) {
            System.arraycopy(bArr2, 0, bArr3, 32 - length, length);
        } else {
            System.arraycopy(bArr2, length - 32, bArr3, 0, 32);
        }
        this.A04 = bArr3;
    }
}
