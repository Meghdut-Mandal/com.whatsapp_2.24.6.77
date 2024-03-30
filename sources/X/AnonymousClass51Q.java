package X;

import java.util.Set;

/* renamed from: X.51Q  reason: invalid class name */
public final class AnonymousClass51Q extends C125345zl {
    public final Set A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass51Q) {
                AnonymousClass51Q r5 = (AnonymousClass51Q) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass51Q(Set set, boolean z) {
        this.A00 = set;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupedCategoriesChip(categories=");
        A0u.append(this.A00);
        A0u.append(", isSelected=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
