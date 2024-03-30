package X;

/* renamed from: X.55l  reason: invalid class name */
public final class AnonymousClass55l extends C110685b4 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass55l) && this.A00 == ((AnonymousClass55l) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass55l(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Loading(amount=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
