package X;

/* renamed from: X.2qJ  reason: invalid class name and case insensitive filesystem */
public final class C52872qJ extends Exception {
    public final C52552pc error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52872qJ) && this.error == ((C52872qJ) obj).error);
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public C52872qJ(C52552pc r1) {
        this.error = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CancelRequestError(error=");
        return AnonymousClass000.A0m(this.error, A0u);
    }
}
