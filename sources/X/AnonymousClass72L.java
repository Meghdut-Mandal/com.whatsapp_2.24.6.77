package X;

import java.util.List;

/* renamed from: X.72L  reason: invalid class name */
public final class AnonymousClass72L implements CharSequence {
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass72L) {
                AnonymousClass72L r5 = (AnonymousClass72L) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: A00 */
    public AnonymousClass72L subSequence(int i, int i2) {
        if (i > i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("start (");
            A0u.append(i);
            A0u.append(") should be less or equal to end (");
            throw AnonymousClass001.A08(C36321k7.A0G(A0u, i2));
        } else if (i == 0 && i2 == this.A00.length()) {
            return this;
        } else {
            return new AnonymousClass72L(C36431kI.A16(i, i2, this.A00), AnonymousClass6RF.A00(this.A03, i, i2), AnonymousClass6RF.A00(this.A02, i, i2), AnonymousClass6RF.A00(this.A01, i, i2));
        }
    }

    public final /* bridge */ char charAt(int i) {
        return this.A00.charAt(i);
    }

    public int hashCode() {
        int i = 0;
        int A04 = (((C36421kH.A04(this.A00) + AnonymousClass000.A0J(this.A03)) * 31) + AnonymousClass000.A0J(this.A02)) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        return A04 + i;
    }

    public final /* bridge */ int length() {
        return this.A00.length();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass72L(String str, List list, List list2) {
        this(str, list.isEmpty() ? null : list, list2.isEmpty() ? null : list2, (List) null);
    }

    public String toString() {
        return this.A00;
    }

    public AnonymousClass72L(String str, List list, List list2, List list3) {
        List A002;
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        if (list2 != null && (A002 = C163907qx.A00(list2, 1)) != null) {
            int size = A002.size();
            int i = -1;
            int i2 = 0;
            while (i2 < size) {
                C128326Bu r3 = (C128326Bu) A002.get(i2);
                if (r3.A01 >= i) {
                    int i3 = r3.A00;
                    if (i3 <= this.A00.length()) {
                        i = r3.A00;
                        i2++;
                    } else {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("ParagraphStyle range [");
                        A0u.append(r3.A01);
                        C90504aG.A1M(A0u);
                        A0u.append(i3);
                        throw AnonymousClass000.A0c(") is out of boundary", A0u);
                    }
                } else {
                    throw AnonymousClass001.A08("ParagraphStyle should not overlap");
                }
            }
        }
    }
}
