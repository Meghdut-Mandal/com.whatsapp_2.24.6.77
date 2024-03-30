package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.68c  reason: invalid class name and case insensitive filesystem */
public final class C1273968c {
    public final UserJid A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1273968c) && AnonymousClass00C.A0J(this.A00, ((C1273968c) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1273968c(UserJid userJid) {
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsCatalogProductCatalogRequest(bizJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
