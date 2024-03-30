package X;

/* renamed from: X.64w  reason: invalid class name and case insensitive filesystem */
public class C1266464w {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C1266464w(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, long j) {
        this.A07 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str6;
        this.A02 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerSyncMetadata{fileHash=");
        long j = this.A02;
        A0u.append(j);
        A0u.append(", url=");
        A0u.append(this.A08);
        A0u.append(", encFileHash=");
        A0u.append(this.A04);
        A0u.append(", mediaKey=");
        A0u.append(this.A05);
        A0u.append(", mimeType=");
        A0u.append(this.A06);
        A0u.append(", width=");
        A0u.append(this.A01);
        A0u.append(", height=");
        A0u.append(this.A00);
        A0u.append(", directPath=");
        A0u.append(this.A03);
        A0u.append(", fileSize=");
        A0u.append(j);
        return AnonymousClass000.A0q("}", A0u);
    }
}
