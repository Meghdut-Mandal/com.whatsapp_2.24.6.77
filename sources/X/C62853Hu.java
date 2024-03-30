package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Hu  reason: invalid class name and case insensitive filesystem */
public final class C62853Hu {
    public final AnonymousClass147 A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62853Hu) {
                C62853Hu r5 = (C62853Hu) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public C62853Hu(AnonymousClass147 r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ActionContainer(groupJid=");
        A0u.append(this.A00);
        A0u.append(", creator=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
