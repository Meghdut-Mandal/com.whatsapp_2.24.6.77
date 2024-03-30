package X;

import java.util.List;

/* renamed from: X.2gn  reason: invalid class name and case insensitive filesystem */
public final class C48152gn extends C55652uy {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48152gn) {
                C48152gn r5 = (C48152gn) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public C48152gn(List list, boolean z, boolean z2, boolean z3) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecommendedNewslettersListDataItem(recommendedNewsletters=");
        A0u.append(this.A00);
        A0u.append(", hasNewsletterSubscriptions=");
        A0u.append(this.A01);
        A0u.append(", isCollapsed=");
        A0u.append(this.A02);
        A0u.append(", isCollapsingAvailable=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
