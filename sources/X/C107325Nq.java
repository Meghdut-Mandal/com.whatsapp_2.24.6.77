package X;

/* renamed from: X.5Nq  reason: invalid class name and case insensitive filesystem */
public final class C107325Nq extends C111855cx {
    public final Exception A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C107325Nq) && AnonymousClass00C.A0J(this.A00, ((C107325Nq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C107325Nq(Exception exc) {
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnknownError(error=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
