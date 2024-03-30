package X;

/* renamed from: X.68Q  reason: invalid class name */
public final class AnonymousClass68Q {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass68Q) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass68Q) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass68Q(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UrlAnnotation(url=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
