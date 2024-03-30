package X;

/* renamed from: X.4pp  reason: invalid class name and case insensitive filesystem */
public final class C97524pp extends C109505Xv {
    public final AnonymousClass6GO A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97524pp) && AnonymousClass00C.A0J(this.A00, ((C97524pp) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97524pp(AnonymousClass6GO r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failure(error=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
