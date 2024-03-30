package X;

/* renamed from: X.8XB  reason: invalid class name */
public final class AnonymousClass8XB extends AnonymousClass96F {
    public final C21112A8x A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8XB) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass8XB) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8XB(C21112A8x a8x) {
        this.A00 = a8x;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CatalogSearchPageSuccessResult(catalogPage=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
