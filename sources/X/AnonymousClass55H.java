package X;

import java.util.List;

/* renamed from: X.55H  reason: invalid class name */
public final class AnonymousClass55H extends C110635az {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass55H) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass55H) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass55H(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShowSearchResults(items=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
