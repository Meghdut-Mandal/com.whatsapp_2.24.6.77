package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.69d  reason: invalid class name and case insensitive filesystem */
public final class C1276569d {
    public final UserJid A00;
    public final String A01;

    public C1276569d(UserJid userJid, String str) {
        AnonymousClass00C.A0D(str, 2);
        this.A00 = userJid;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1276569d) {
                C1276569d r5 = (C1276569d) obj;
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsCatalogCollectionRequest(bizJid=");
        A0u.append(this.A00);
        A0u.append(", collectionId=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
