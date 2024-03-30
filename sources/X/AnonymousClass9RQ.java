package X;

/* renamed from: X.9RQ  reason: invalid class name */
public class AnonymousClass9RQ {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass9RQ(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (bArr != null) {
            bArr2 = (byte[]) bArr.clone();
        } else {
            bArr2 = null;
        }
        this.A02 = bArr2;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WtWriteParams{offset=");
        A0u.append(this.A01);
        A0u.append(", len=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
