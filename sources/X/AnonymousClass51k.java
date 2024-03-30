package X;

/* renamed from: X.51k  reason: invalid class name */
public final class AnonymousClass51k extends C1255960m {
    public static final C110245aM A01 = new C110245aM();
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass51k) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass51k) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass51k(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecentSearchQuery(query=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
