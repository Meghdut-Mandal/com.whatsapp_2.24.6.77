package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6CF  reason: invalid class name */
public final class AnonymousClass6CF {
    public final int A00;
    public final UserJid A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass6CF(UserJid userJid, int i, boolean z, boolean z2) {
        AnonymousClass00C.A0D(userJid, 1);
        this.A01 = userJid;
        this.A03 = z;
        this.A00 = i;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CF) {
                AnonymousClass6CF r5 = (AnonymousClass6CF) obj;
                if (!(AnonymousClass00C.A0J(this.A01, r5.A01) && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36391kE.A0A(this.A01) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + this.A00) * 31) + 1237) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParticipantListInfo(jid=");
        A0u.append(this.A01);
        A0u.append(", pendingJoin=");
        A0u.append(this.A03);
        A0u.append(", state=");
        A0u.append(this.A00);
        C90474aD.A1N(A0u, ", isSelf=");
        A0u.append(", isInvitedBySelf=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
