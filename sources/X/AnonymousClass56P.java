package X;

import java.util.List;

/* renamed from: X.56P  reason: invalid class name */
public final class AnonymousClass56P extends C110725b8 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass56P) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass56P) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass56P(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShowSearchResults(items=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
