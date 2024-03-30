package X;

import java.util.List;

/* renamed from: X.69k  reason: invalid class name and case insensitive filesystem */
public final class C1277269k {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277269k) {
                C1277269k r5 = (C1277269k) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public C1277269k(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TypeaheadRecentSearch(categories=");
        A0u.append(this.A01);
        A0u.append(", businesses=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
