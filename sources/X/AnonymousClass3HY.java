package X;

/* renamed from: X.3HY  reason: invalid class name */
public final class AnonymousClass3HY {
    public final String A00;

    public AnonymousClass3HY(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HY) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass3HY) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterGeosuspendedCountry(isoCode=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
