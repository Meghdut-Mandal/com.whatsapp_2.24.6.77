package X;

import java.util.List;

/* renamed from: X.68Z  reason: invalid class name */
public final class AnonymousClass68Z {
    public final List A00;

    public AnonymousClass68Z(List list) {
        AnonymousClass00C.A0D(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass68Z) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass68Z) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksComponentQueryNetworkParseResponse(results=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
