package X;

/* renamed from: X.2dI  reason: invalid class name */
public final class AnonymousClass2dI extends C55302uP {
    public final Exception A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2dI) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2dI) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2dI(Exception exc) {
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(exception=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
