package X;

/* renamed from: X.67c  reason: invalid class name and case insensitive filesystem */
public class C1271367c {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public final C135066c4 A04;

    public void A00(C135066c4 r3) {
        C135066c4 r1 = this.A04;
        r1.A0E = r3.A0E;
        r1.A0B = r3.A0B;
        r1.A0H = r3.A0H;
        String str = r3.A09;
        if (str != null) {
            r1.A09 = str;
        }
        r1.A07 = r3.A07;
        String str2 = r3.A0D;
        if (str2 != null) {
            r1.A0D = str2;
        }
        String str3 = r3.A0C;
        if (str3 != null) {
            r1.A0C = str3;
        }
        r1.A00 = r3.A00;
        r1.A03 = r3.A03;
        r1.A02 = r3.A02;
        r1.A0B = r3.A0B;
        r1.A0N = r3.A0N;
    }

    public C1271367c(C135066c4 r1, String str, String str2, String str3, long j) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = r1;
        this.A00 = j;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecentStickerIdentifier{fileHash='");
        char A002 = C90484aE.A00(this.A02, A0u);
        A0u.append(", imageHash='");
        A0u.append(this.A03);
        A0u.append(A002);
        A0u.append(", sticker=");
        A0u.append(this.A04);
        A0u.append(", lastStickerSentTs=");
        A0u.append(this.A00);
        A0u.append(", avatarTemplateId='");
        A0u.append(this.A01);
        A0u.append(A002);
        return AnonymousClass000.A0s(A0u);
    }
}
