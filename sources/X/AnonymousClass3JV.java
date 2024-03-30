package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3JV  reason: invalid class name */
public final class AnonymousClass3JV {
    public final long A00;
    public final AnonymousClass147 A01;
    public final UserJid A02;
    public final UserJid A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JV) {
                AnonymousClass3JV r8 = (AnonymousClass3JV) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36351kA.A05(this.A03, (C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A02)) * 31));
    }

    public AnonymousClass3JV(AnonymousClass147 r1, UserJid userJid, UserJid userJid2, long j) {
        C36321k7.A0y(r1, userJid2);
        this.A01 = r1;
        this.A02 = userJid;
        this.A03 = userJid2;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NonAdminGJR(groupJid=");
        A0u.append(this.A01);
        A0u.append(", requestedByJid=");
        A0u.append(this.A02);
        A0u.append(", requestedForJid=");
        A0u.append(this.A03);
        A0u.append(", creationTimeMillis=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
