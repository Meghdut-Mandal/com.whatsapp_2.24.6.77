package X;

/* renamed from: X.654  reason: invalid class name */
public class AnonymousClass654 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;
    public final byte[] A08;
    public final byte[] A09;

    public AnonymousClass654(String str, String str2, String str3, String str4, String str5, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A08 = bArr;
        this.A07 = bArr2;
        this.A09 = bArr3;
        this.A02 = str4;
        this.A04 = str5;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamsysMMSDownloadRequest{mediaType=");
        A0u.append(this.A01);
        A0u.append(", downloadMode=");
        A0u.append(this.A00);
        A0u.append(", transferOption=");
        A0u.append(7);
        A0u.append(", temporaryFilePath='");
        char A002 = C90484aE.A00(this.A06, A0u);
        A0u.append(", outputFilePath='");
        A0u.append(this.A05);
        A0u.append(A002);
        A0u.append(", directPath='");
        A0u.append(this.A03);
        A0u.append(A002);
        A0u.append(", hashIdentifier=");
        C90474aD.A1O(A0u, this.A07);
        A0u.append(", plaintextHashIdentifier=");
        C90474aD.A1O(A0u, this.A09);
        A0u.append(", connBlockJSONStr='");
        A0u.append(this.A02);
        A0u.append(A002);
        A0u.append(", loggingIdentifier='");
        A0u.append(this.A04);
        A0u.append(A002);
        return AnonymousClass000.A0s(A0u);
    }
}
