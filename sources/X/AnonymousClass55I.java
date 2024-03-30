package X;

import java.util.List;

/* renamed from: X.55I  reason: invalid class name */
public final class AnonymousClass55I extends C110635az {
    public final C125415zs A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass55I) {
                AnonymousClass55I r5 = (AnonymousClass55I) obj;
                if (!(AnonymousClass00C.A0J(this.A01, r5.A01) && AnonymousClass00C.A0J(this.A00, r5.A00) && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36351kA.A05(this.A00, C36391kE.A0A(this.A01)) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass55I(C125415zs r1, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = list;
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShowItems(items=");
        A0u.append(this.A01);
        A0u.append(", selectedCategory=");
        A0u.append(this.A00);
        A0u.append(", recentEnabled=");
        A0u.append(this.A03);
        A0u.append(", starredEnabled=");
        A0u.append(this.A04);
        A0u.append(", togetherEnabled=");
        A0u.append(this.A05);
        A0u.append(", moveToSelectedCategory=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
