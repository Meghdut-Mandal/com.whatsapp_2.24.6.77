package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6B5  reason: invalid class name */
public final class AnonymousClass6B5 {
    public final UserJid A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B5) {
                AnonymousClass6B5 r5 = (AnonymousClass6B5) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36381kD.A08(this.A02, C36391kE.A0A(this.A00)));
    }

    public AnonymousClass6B5(UserJid userJid, String str, String str2) {
        C36321k7.A0z(str, str2);
        this.A00 = userJid;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsCatalogCollectionAdditionalPageRequest(bizJid=");
        A0u.append(this.A00);
        A0u.append(", collectionId=");
        A0u.append(this.A02);
        A0u.append(", afterCursor=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
