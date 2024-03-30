package X;

/* renamed from: X.51R  reason: invalid class name */
public final class AnonymousClass51R extends C125345zl {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass51R) && this.A00 == ((AnonymousClass51R) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass51R(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DistanceChip(isSelected=");
        return C36321k7.A0H(A0u, this.A00);
    }

    public AnonymousClass51R() {
        this(false);
    }
}
