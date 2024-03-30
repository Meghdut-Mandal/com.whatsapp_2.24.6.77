package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.69c  reason: invalid class name and case insensitive filesystem */
public final class C1276469c {
    public final UserJid A00;
    public final Collection A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1276469c) {
                C1276469c r5 = (C1276469c) obj;
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

    public C1276469c(UserJid userJid, Collection collection) {
        this.A00 = userJid;
        this.A01 = collection;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsSubCatalogCategoriesRequest(bizJid=");
        A0u.append(this.A00);
        A0u.append(", categoryIds=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
