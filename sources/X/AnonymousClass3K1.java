package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3K1  reason: invalid class name */
public final class AnonymousClass3K1 {
    public final long A00;
    public final AnonymousClass147 A01;
    public final AnonymousClass147 A02;
    public final UserJid A03;
    public final UserJid A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3K1) {
                AnonymousClass3K1 r8 = (AnonymousClass3K1) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A05, C36321k7.A00(this.A00, C36351kA.A05(this.A04, C36391kE.A0A(this.A01)))) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A03);
    }

    public AnonymousClass3K1(AnonymousClass147 r2, AnonymousClass147 r3, UserJid userJid, UserJid userJid2, String str, long j) {
        C36321k7.A0x(r2, userJid);
        AnonymousClass00C.A0D(str, 4);
        this.A01 = r2;
        this.A04 = userJid;
        this.A00 = j;
        this.A05 = str;
        this.A02 = r3;
        this.A03 = userJid2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupMembershipApprovalRequest(groupJid=");
        A0u.append(this.A01);
        A0u.append(", requesterJid=");
        A0u.append(this.A04);
        A0u.append(", creationTimeMillis=");
        A0u.append(this.A00);
        A0u.append(", requestMethod=");
        A0u.append(this.A05);
        A0u.append(", parentGroupJid=");
        A0u.append(this.A02);
        A0u.append(", requestedByJid=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
