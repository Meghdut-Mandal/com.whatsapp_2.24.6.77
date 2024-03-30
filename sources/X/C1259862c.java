package X;

/* renamed from: X.62c  reason: invalid class name and case insensitive filesystem */
public class C1259862c {
    public final C1264263x A00;
    public final byte[] A01;
    public final byte[] A02;

    public C1259862c(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.A00 = new C1264263x(str, bArr, bArr2, bArr3, bArr5);
        this.A02 = bArr4;
        this.A01 = bArr6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BackupKey [");
        C36351kA.A1K(this.A00, A0u);
        A0u.append(", hashedGoogleId=");
        C90474aD.A1O(A0u, this.A02);
        A0u.append(", cipherKey=");
        C90474aD.A1O(A0u, this.A01);
        return C90474aD.A0g(A0u);
    }
}
