package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Iv  reason: invalid class name and case insensitive filesystem */
public final class C63123Iv {
    public final AnonymousClass147 A00;
    public final UserJid A01;
    public final AnonymousClass147 A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63123Iv) {
                C63123Iv r5 = (C63123Iv) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C36391kE.A0A(this.A02)) + AnonymousClass000.A0H(this.A01);
    }

    public C63123Iv(AnonymousClass147 r1, AnonymousClass147 r2, UserJid userJid) {
        C36321k7.A0x(r1, r2);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SubgroupSuggestionKey(parentGroupJid=");
        A0u.append(this.A02);
        A0u.append(", groupJid=");
        A0u.append(this.A00);
        A0u.append(", creatorJid=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
