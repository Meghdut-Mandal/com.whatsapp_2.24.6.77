package X;

/* renamed from: X.51A  reason: invalid class name */
public final class AnonymousClass51A extends C110155aD {
    public final C124875yw A00;

    public AnonymousClass51A(C124875yw r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass51A) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass51A) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(content=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
