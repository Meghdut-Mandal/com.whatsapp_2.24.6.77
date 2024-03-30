package X;

/* renamed from: X.630  reason: invalid class name */
public class AnonymousClass630 {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass630(byte[] bArr, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EncryptedMessage{ciphertextVersion=");
        A0u.append(this.A01);
        A0u.append(", ciphertextType=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
