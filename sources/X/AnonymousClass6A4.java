package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6A4  reason: invalid class name */
public final class AnonymousClass6A4 {
    public final UserJid A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6A4) {
                AnonymousClass6A4 r5 = (AnonymousClass6A4) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass6A4(UserJid userJid, String str) {
        this.A00 = userJid;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CatalogSearchPageRequest(bizJid=");
        A0u.append(this.A00);
        A0u.append(", searchQuery=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
