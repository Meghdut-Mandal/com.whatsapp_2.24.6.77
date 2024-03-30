package X;

import java.util.List;

/* renamed from: X.3KI  reason: invalid class name */
public final class AnonymousClass3KI {
    public final long A00;
    public final long A01;
    public final C28981Uw A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final List A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KI) {
                AnonymousClass3KI r8 = (AnonymousClass3KI) obj;
                if (this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A02, r8.A02) || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36321k7.A00(this.A01, C36351kA.A05(this.A02, AnonymousClass000.A08(this.A00) * 31)) + C36341k9.A09(this.A05)) * 31) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + C36411kG.A09(this.A04);
    }

    public AnonymousClass3KI(C28981Uw r1, Long l, Long l2, String str, List list, long j, long j2) {
        this.A00 = j;
        this.A02 = r1;
        this.A01 = j2;
        this.A05 = str;
        this.A03 = l;
        this.A06 = list;
        this.A04 = l2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterMyOrphanAddOns(id=");
        A0u.append(this.A00);
        A0u.append(", newsletterJid=");
        A0u.append(this.A02);
        A0u.append(", serverMessageId=");
        A0u.append(this.A01);
        A0u.append(", myReaction=");
        A0u.append(this.A05);
        A0u.append(", myReactionMs=");
        A0u.append(this.A03);
        A0u.append(", myVotes=");
        A0u.append(this.A06);
        A0u.append(", myVotesMs=");
        return AnonymousClass000.A0m(this.A04, A0u);
    }
}
