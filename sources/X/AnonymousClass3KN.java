package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3KN  reason: invalid class name */
public final class AnonymousClass3KN {
    public final long A00;
    public final long A01;
    public final AnonymousClass147 A02;
    public final AnonymousClass147 A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KN) {
                AnonymousClass3KN r8 = (AnonymousClass3KN) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A07 != r8.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A03);
        return C36321k7.A00(this.A01, C36321k7.A00(this.A00, C36351kA.A05(this.A04, (((C36351kA.A05(this.A02, A0A) + C36341k9.A09(this.A06)) * 31) + C36421kH.A05(this.A05)) * 31))) + C36341k9.A01(this.A07 ? 1 : 0);
    }

    public AnonymousClass3KN(AnonymousClass147 r2, AnonymousClass147 r3, UserJid userJid, String str, String str2, long j, long j2, boolean z) {
        C36321k7.A0x(r2, r3);
        AnonymousClass00C.A0D(userJid, 5);
        this.A03 = r2;
        this.A02 = r3;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = j2;
        this.A07 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SubgroupSuggestion(parentGroup=");
        A0u.append(this.A03);
        A0u.append(", groupJid=");
        A0u.append(this.A02);
        A0u.append(", subject=");
        A0u.append(this.A06);
        A0u.append(", description=");
        A0u.append(this.A05);
        A0u.append(", creator=");
        A0u.append(this.A04);
        A0u.append(", creation=");
        A0u.append(this.A00);
        A0u.append(", participantCount=");
        A0u.append(this.A01);
        A0u.append(", isExistingGroup=");
        return C36321k7.A0H(A0u, this.A07);
    }
}
