package X;

/* renamed from: X.5IH  reason: invalid class name */
public final class AnonymousClass5IH extends C111375cB {
    public final String A00;

    public AnonymousClass5IH(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5IH) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5IH) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SearchQuery(query=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
