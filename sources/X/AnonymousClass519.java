package X;

/* renamed from: X.519  reason: invalid class name */
public final class AnonymousClass519 extends C110155aD {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass519) && this.A00 == ((AnonymousClass519) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass519(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Failure(errorCode=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
