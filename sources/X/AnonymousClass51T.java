package X;

/* renamed from: X.51T  reason: invalid class name */
public final class AnonymousClass51T extends C125345zl {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass51T) && this.A00 == ((AnonymousClass51T) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass51T(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OpenNowChip(isSelected=");
        return C36321k7.A0H(A0u, this.A00);
    }

    public AnonymousClass51T() {
        this(false);
    }
}
