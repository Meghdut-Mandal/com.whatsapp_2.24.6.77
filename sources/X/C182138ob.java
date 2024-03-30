package X;

/* renamed from: X.8ob  reason: invalid class name and case insensitive filesystem */
public final class C182138ob extends AnonymousClass97X {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C182138ob) && AnonymousClass00C.A0J(this.A00, ((C182138ob) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C182138ob(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Err(error=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
