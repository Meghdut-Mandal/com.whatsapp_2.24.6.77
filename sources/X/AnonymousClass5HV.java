package X;

/* renamed from: X.5HV  reason: invalid class name */
public final class AnonymousClass5HV extends C111345c8 {
    public final Throwable A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5HV) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5HV) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5HV(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DeliveryError(throwable=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
