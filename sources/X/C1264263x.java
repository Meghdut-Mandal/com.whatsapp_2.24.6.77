package X;

/* renamed from: X.63x  reason: invalid class name and case insensitive filesystem */
public class C1264263x {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C1264263x(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.A03 = bArr;
        this.A00 = str;
        this.A04 = bArr2;
        this.A02 = bArr3;
        this.A01 = bArr4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BackupCipher [cipherVersion=");
        C90474aD.A1O(A0u, this.A03);
        A0u.append(" keyVersion=");
        A0u.append(this.A00);
        A0u.append(", serverSalt=");
        C90474aD.A1O(A0u, this.A04);
        A0u.append(", googleIdSalt=");
        C90474aD.A1O(A0u, this.A02);
        A0u.append(", encryptionIv=");
        C90474aD.A1O(A0u, this.A01);
        return C90474aD.A0g(A0u);
    }
}
