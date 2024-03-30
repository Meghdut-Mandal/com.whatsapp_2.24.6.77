package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Bv  reason: invalid class name and case insensitive filesystem */
public final class C128336Bv {
    public List A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public C128336Bv(String str, List list, List list2, boolean z) {
        C36331k8.A1G(list, 3, list2);
        this.A01 = str;
        this.A03 = z;
        this.A02 = list;
        this.A00 = list2;
        boolean isEmpty = list2.isEmpty();
        ArrayList arrayList = list2;
        if (isEmpty) {
            int size = list.size();
            ArrayList A14 = C36441kJ.A14(size);
            for (int i = 0; i < size; i++) {
                A14.add("ASC");
            }
            arrayList = A14;
        }
        this.A00 = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C128336Bv) {
            C128336Bv r6 = (C128336Bv) obj;
            if (this.A03 == r6.A03 && AnonymousClass00C.A0J(this.A02, r6.A02) && AnonymousClass00C.A0J(this.A00, r6.A00)) {
                String str = this.A01;
                boolean A07 = AnonymousClass098.A07(str, "index_", false);
                String str2 = r6.A01;
                if (A07) {
                    return AnonymousClass098.A07(str2, "index_", false);
                }
                return AnonymousClass00C.A0J(str, str2);
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.A01;
        if (AnonymousClass098.A07(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return C36401kF.A02(this.A00, C36351kA.A05(this.A02, ((hashCode * 31) + (this.A03 ? 1 : 0)) * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Index{name='");
        A0u.append(this.A01);
        A0u.append("', unique=");
        A0u.append(this.A03);
        A0u.append(", columns=");
        A0u.append(this.A02);
        A0u.append(", orders=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("'}", A0u);
    }
}
