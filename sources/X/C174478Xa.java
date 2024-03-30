package X;

/* renamed from: X.8Xa  reason: invalid class name and case insensitive filesystem */
public final class C174478Xa extends C193369Le {
    public final AnonymousClass9HX A00;

    public C174478Xa(AnonymousClass9HX r2) {
        super(r2, false, false, false);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174478Xa) && AnonymousClass00C.A0J(this.A00, ((C174478Xa) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(errorBehaviour=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
