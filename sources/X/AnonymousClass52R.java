package X;

/* renamed from: X.52R  reason: invalid class name */
public final class AnonymousClass52R extends C110285aQ {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass52R) && this.A00 == ((AnonymousClass52R) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass52R(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Fetching(shouldApplyLoadingState=");
        return C36321k7.A0H(A0u, this.A00);
    }

    public AnonymousClass52R() {
        this(true);
    }
}
