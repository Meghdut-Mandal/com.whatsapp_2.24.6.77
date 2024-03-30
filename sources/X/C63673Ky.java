package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ky  reason: invalid class name and case insensitive filesystem */
public final class C63673Ky {
    public AnonymousClass141 A00;
    public final UserJid A01;

    public C63673Ky(AnonymousClass141 r2, UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 1);
        this.A01 = userJid;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63673Ky) {
                C63673Ky r5 = (C63673Ky) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A00);
    }

    public final UserJid A00() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessMessageForwardInfo(businessOwnerJid=");
        A0u.append(this.A01);
        A0u.append(", businessOwnerContact=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public final void A01(AnonymousClass141 r1) {
        this.A00 = r1;
    }
}
