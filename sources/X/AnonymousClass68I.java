package X;

/* renamed from: X.68I  reason: invalid class name */
public final class AnonymousClass68I {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass68I) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass68I) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass68I(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OpaqueKey(key=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
