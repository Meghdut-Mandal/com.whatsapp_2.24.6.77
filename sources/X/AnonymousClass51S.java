package X;

/* renamed from: X.51S  reason: invalid class name */
public final class AnonymousClass51S extends C125345zl {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass51S) && this.A00 == ((AnonymousClass51S) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public AnonymousClass51S(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("HasCatalogChip(isSelected=");
        return C36321k7.A0H(A0u, this.A00);
    }

    public AnonymousClass51S() {
        this(false);
    }
}
