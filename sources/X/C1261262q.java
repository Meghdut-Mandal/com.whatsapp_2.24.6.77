package X;

/* renamed from: X.62q  reason: invalid class name and case insensitive filesystem */
public class C1261262q {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;

    public C1261262q(byte[] bArr, byte[] bArr2, int i) {
        this.A00 = i;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GetCipherKeyResult [code=");
        A0u.append(this.A00);
        A0u.append(", key=");
        C90474aD.A1O(A0u, this.A02);
        A0u.append(", accountHash=");
        C90474aD.A1O(A0u, this.A01);
        return C90474aD.A0g(A0u);
    }
}
