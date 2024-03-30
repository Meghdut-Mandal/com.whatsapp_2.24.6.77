package X;

/* renamed from: X.552  reason: invalid class name */
public final class AnonymousClass552 extends C110605aw {
    public final C129196Ft A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass552) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass552) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass552(C129196Ft r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OnShapeSelected(shape=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
