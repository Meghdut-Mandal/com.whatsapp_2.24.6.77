package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9XP  reason: invalid class name */
public final class AnonymousClass9XP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass9W6 A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9XP) {
                AnonymousClass9XP r5 = (AnonymousClass9XP) obj;
                if (!AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A01 != r5.A01 || this.A02 != r5.A02 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A05, r5.A05) || this.A08 != r5.A08 || this.A09 != r5.A09 || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C53202qw.A00(C53202qw.A00((((((((((C36351kA.A05(this.A04, C36421kH.A04(this.A06)) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31) + C36341k9.A09(this.A07)) * 31) + C36341k9.A09(this.A05)) * 31, this.A08), this.A09) + C36411kG.A09(this.A03);
    }

    public AnonymousClass9XP(AnonymousClass9W6 r1, UserJid userJid, String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2) {
        C36321k7.A0x(str, userJid);
        this.A06 = str;
        this.A04 = userJid;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A07 = str2;
        this.A05 = str3;
        this.A08 = z;
        this.A09 = z2;
        this.A03 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CollectionProductListRequest(collectionId=");
        A0u.append(this.A06);
        A0u.append(", businessId=");
        A0u.append(this.A04);
        A0u.append(", limit=");
        A0u.append(this.A01);
        A0u.append(", width=");
        A0u.append(this.A02);
        A0u.append(", height=");
        A0u.append(this.A00);
        A0u.append(", sessionId=");
        A0u.append(this.A07);
        A0u.append(", afterCursor=");
        A0u.append(this.A05);
        A0u.append(", isCategory=");
        A0u.append(this.A08);
        A0u.append(", isSkipDirectConnectionEncryptedInfoCheck=");
        A0u.append(this.A09);
        A0u.append(", catalogVariantsRequestData=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
