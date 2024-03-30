package X;

import android.util.Base64;

/* renamed from: X.54m  reason: invalid class name and case insensitive filesystem */
public class C1032354m extends C201669k5 {
    public int A00;
    public final C1266464w A01;
    public final boolean A02;

    public String A07() {
        return "favoriteSticker";
    }

    public C1032354m(C1266464w r11, C201539jo r12, String str, int i, long j, boolean z, boolean z2) {
        super(C199769fw.A03, r12, str, "regular_low", 7, j, z2);
        this.A02 = z;
        this.A00 = i;
        this.A01 = r11;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = C100054uO.DEFAULT_INSTANCE.A0p();
        C1266464w r3 = this.A01;
        String str = r3.A08;
        if (str != null) {
            C100054uO r1 = (C100054uO) C90524aI.A0H(A0p);
            r1.bitField0_ |= 1;
            r1.url_ = str;
        }
        String str2 = r3.A04;
        if (str2 != null) {
            byte[] decode = Base64.decode(str2, 0);
            AnonymousClass8I5 A012 = C21674AUx.A01(decode, 0, decode.length);
            C100054uO r12 = (C100054uO) C90524aI.A0H(A0p);
            r12.bitField0_ |= 2;
            r12.fileEncSha256_ = A012;
        }
        String str3 = r3.A05;
        if (str3 != null) {
            AnonymousClass8I5 A0O = C90474aD.A0O(A0p, Base64.decode(str3, 1));
            C100054uO r13 = (C100054uO) A0p.A00;
            r13.bitField0_ |= 4;
            r13.mediaKey_ = A0O;
        }
        String str4 = r3.A06;
        if (str4 != null) {
            C100054uO r14 = (C100054uO) C90524aI.A0H(A0p);
            r14.bitField0_ |= 8;
            r14.mimetype_ = str4;
        }
        int i = r3.A00;
        C100054uO r15 = (C100054uO) C90524aI.A0H(A0p);
        r15.bitField0_ |= 16;
        r15.height_ = i;
        int i2 = r3.A01;
        C100054uO r16 = (C100054uO) C90524aI.A0H(A0p);
        r16.bitField0_ |= 32;
        r16.width_ = i2;
        String str5 = r3.A03;
        if (str5 != null) {
            C100054uO r17 = (C100054uO) C90524aI.A0H(A0p);
            r17.bitField0_ |= 64;
            r17.directPath_ = str5;
        }
        long j = r3.A02;
        C100054uO r18 = (C100054uO) C90524aI.A0H(A0p);
        r18.bitField0_ |= 128;
        r18.fileLength_ = j;
        boolean z = this.A02;
        C100054uO r19 = (C100054uO) C90524aI.A0H(A0p);
        r19.bitField0_ |= 256;
        r19.isFavorite_ = z;
        int i3 = this.A00;
        if (i3 >= 0) {
            C100054uO r110 = (C100054uO) C90524aI.A0H(A0p);
            r110.bitField0_ |= 512;
            r110.deviceIdHint_ = i3;
        }
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8SS r2 = (AnonymousClass8SS) C90524aI.A0H(A04);
        C100054uO r111 = (C100054uO) A0p.A0R();
        int i4 = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r111.getClass();
        r2.stickerAction_ = r111;
        r2.bitField0_ |= 134217728;
        return A04;
    }

    public String A06() {
        String str = this.A01.A07;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[\"favoriteSticker\",\"");
        A0u.append(str);
        return AnonymousClass000.A0q("\"]", A0u);
    }

    public String[] A0A() {
        String[] A1S = C36441kJ.A1S();
        A1S[0] = "favoriteSticker";
        A1S[1] = this.A01.A07;
        return A1S;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FavoriteStickerMutation{isFavorite=");
        A0u.append(this.A02);
        A0u.append(", setterId=");
        A0u.append(this.A00);
        A0u.append(", metadata=");
        return C90464aC.A0X(this.A01, A0u);
    }
}
