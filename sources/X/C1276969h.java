package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.69h  reason: invalid class name and case insensitive filesystem */
public final class C1276969h {
    public final C128506Cn A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1276969h) {
                C1276969h r5 = (C1276969h) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public C1276969h(C128506Cn r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (C128506Cn r0 : this.A01) {
            A0u.append(r0.A01);
            A0u.append(",");
        }
        Object[] objArr = new Object[2];
        C90494aF.A1H(this.A00.A01, A0u, objArr);
        return C90504aG.A0m("CategoryResponse{responseCategoryId=%s, subCategories=%s}", Arrays.copyOf(objArr, 2));
    }
}
