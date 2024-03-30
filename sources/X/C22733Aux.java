package X;

/* renamed from: X.Aux  reason: case insensitive filesystem */
public final class C22733Aux extends AUM {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public boolean equals(Object obj) {
        if (obj instanceof C22733Aux) {
            return this.reference.equals(((C22733Aux) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public C22733Aux(Object obj) {
        this.reference = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Optional.of(");
        A0u.append(this.reference);
        return C90474aD.A0f(A0u);
    }
}
