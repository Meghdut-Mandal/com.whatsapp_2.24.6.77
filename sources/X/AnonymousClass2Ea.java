package X;

/* renamed from: X.2Ea  reason: invalid class name */
public final class AnonymousClass2Ea extends C53522rS {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2Ea) && this.A00 == ((AnonymousClass2Ea) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass2Ea(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(errorCode=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
