package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.7tN  reason: invalid class name and case insensitive filesystem */
public class C165407tN implements AnonymousClass7g0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C165407tN(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj4;
        this.A03 = obj3;
    }

    public final void Be6() {
        if (this.A04 != 0) {
            C95404kp r8 = (C95404kp) this.A00;
            C144426sA r7 = (C144426sA) this.A01;
            Set set = (Set) this.A02;
            List list = (List) this.A03;
            C36321k7.A0z(set, list);
            ArrayList A0I = AnonymousClass001.A0I();
            int i = 0;
            int i2 = 0;
            for (Object next : (List) list.get(0)) {
                if (A0I.size() < 35) {
                    boolean contains = set.contains(next);
                    boolean contains2 = r8.A0B.contains(next);
                    if (contains) {
                        if (contains2) {
                            A0I.add(next);
                            i2++;
                        } else if (i2 <= 5) {
                            A0I.add(next);
                            i2++;
                        }
                    } else if (contains2 && i <= 30) {
                        A0I.add(next);
                    }
                    i++;
                }
            }
            C95404kp.A04(r7, r8, A0I);
            r8.A0C = A0I;
            return;
        }
        C132406Tm r4 = (C132406Tm) this.A00;
        C124875yw r3 = (C124875yw) this.A01;
        ArrayList arrayList = (ArrayList) this.A02;
        C006302t r1 = (C006302t) this.A03;
        C36321k7.A0z(arrayList, r1);
        if (r4 != null) {
            r4.A06("qpl_business_ranking_end");
        }
        List list2 = r3.A0C;
        list2.clear();
        list2.addAll(arrayList);
        r1.invoke(new AnonymousClass51A(r3));
    }
}
