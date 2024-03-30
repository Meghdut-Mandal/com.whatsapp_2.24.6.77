package X;

/* renamed from: X.8XN  reason: invalid class name */
public final class AnonymousClass8XN extends AnonymousClass9ET {
    public final AnonymousClass96H A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8XN) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass8XN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8XN(AnonymousClass96H r2) {
        super(C023409w.A00);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FailedContinueSearch(failureType=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
