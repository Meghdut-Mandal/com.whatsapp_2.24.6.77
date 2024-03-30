package X;

/* renamed from: X.6fe  reason: invalid class name and case insensitive filesystem */
public final class C137136fe implements C157597dn {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C137136fe) && AnonymousClass00C.A0J(this.A00, ((C137136fe) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public C137136fe(Object obj) {
        this.A00 = obj;
    }

    public Object getValue() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StaticValueHolder(value=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
