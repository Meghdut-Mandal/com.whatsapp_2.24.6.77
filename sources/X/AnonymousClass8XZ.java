package X;

/* renamed from: X.8XZ  reason: invalid class name */
public final class AnonymousClass8XZ extends C193369Le {
    public final boolean A00;

    public AnonymousClass8XZ(boolean z) {
        super(AnonymousClass8XV.A00, z, false, false);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8XZ) && this.A00 == ((AnonymousClass8XZ) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CategoryList(isCategoriesEnabled=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
