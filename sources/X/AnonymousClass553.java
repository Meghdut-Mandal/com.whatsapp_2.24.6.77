package X;

/* renamed from: X.553  reason: invalid class name */
public final class AnonymousClass553 extends C110605aw {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass553) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass553) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass553(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OpenSearchWithQuery(query=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
