package X;

import java.util.List;

/* renamed from: X.56O  reason: invalid class name */
public final class AnonymousClass56O extends C110725b8 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass56O) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass56O) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass56O(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShowPlaceholderResults(items=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
