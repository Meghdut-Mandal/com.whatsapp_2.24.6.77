package X;

/* renamed from: X.52M  reason: invalid class name */
public final class AnonymousClass52M extends C110285aQ {
    public final C110275aP A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass52M) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass52M) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass52M(C110275aP r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Suspended(reason=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
