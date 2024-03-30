package X;

/* renamed from: X.1Ov  reason: invalid class name and case insensitive filesystem */
public final class C27581Ov extends Exception {
    public final C201259jD error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27581Ov) && AnonymousClass00C.A0J(this.error, ((C27581Ov) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        return this.error.toString();
    }

    public C27581Ov(C201259jD r1) {
        this.error = r1;
    }
}
