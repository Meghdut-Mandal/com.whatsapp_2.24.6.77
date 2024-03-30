package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6BL  reason: invalid class name */
public final class AnonymousClass6BL {
    public final UserJid A00;
    public final String A01;
    public final boolean A02;

    public AnonymousClass6BL(UserJid userJid, String str, boolean z) {
        AnonymousClass00C.A0D(str, 2);
        this.A00 = userJid;
        this.A01 = str;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BL) {
                AnonymousClass6BL r5 = (AnonymousClass6BL) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A01, C36391kE.A0A(this.A00)) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MutationKey(callCreatorJid=");
        A0u.append(this.A00);
        A0u.append(", callId=");
        A0u.append(this.A01);
        A0u.append(", isIncoming=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
