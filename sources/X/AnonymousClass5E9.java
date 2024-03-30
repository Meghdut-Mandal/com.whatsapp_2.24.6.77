package X;

/* renamed from: X.5E9  reason: invalid class name */
public final class AnonymousClass5E9 extends AnonymousClass5EQ {
    public final C144426sA A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5E9) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5E9) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5E9(C144426sA r2) {
        super(75);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MapViewBusinessShimmerItem(tag=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
