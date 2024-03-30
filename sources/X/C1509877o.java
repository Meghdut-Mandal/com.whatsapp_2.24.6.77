package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.77o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1509877o implements C009003v {
    public final /* synthetic */ C131426Oz A00;
    public final /* synthetic */ C143516qg A01;

    public /* synthetic */ C1509877o(C131426Oz r1, C143516qg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object invoke(Object obj, Object obj2) {
        C143516qg r5 = this.A01;
        C131426Oz r3 = this.A00;
        List list = (List) obj;
        List list2 = (List) obj2;
        C125025zC r2 = r5.A09;
        C123735x0 r1 = r2.A06;
        if (r1 != null) {
            r1.A03 = list.size();
            r2.A06.A05 = list2;
        }
        r3.A01.clear();
        r2.A0I = !list.isEmpty();
        r2.A0G.clear();
        r2.A0G.addAll(list);
        if (r2.A0I) {
            r2.A03 = 13;
            if (r5.A05 == 1) {
                C121395t4 r4 = r5.A0F;
                C145896uh r32 = r4.A00;
                List<C144426sA> A0a = C007103b.A0a(list, 5);
                ArrayList A0J = C36321k7.A0J(A0a);
                for (C144426sA r0 : A0a) {
                    A0J.add(r0.A0B.A0A);
                }
                r32.A06(A0J, r4.A01);
            } else {
                C143516qg.A07(r5, 2);
            }
            r5.A0B();
            C143516qg.A06(r5);
        }
        return null;
    }
}
