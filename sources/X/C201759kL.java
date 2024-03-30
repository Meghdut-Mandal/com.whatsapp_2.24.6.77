package X;

import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9kL  reason: invalid class name and case insensitive filesystem */
public abstract class C201759kL {
    public static final HashMap A00(C184818t3 r6) {
        C183998rj r1;
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put(C108355Te.SUCCESS_FLAG.key, C36371kC.A0m());
        C184068rq r0 = (C184068rq) ((C184328sG) r6.A00).A03;
        if (!(r0 == null || (r1 = (C183998rj) r0.A00) == null)) {
            String str = C108355Te.SCREEN_DATA.key;
            Object Bmq = C200759iB.A01(r1.A00).Bmq("$", new C22902AyE[0]);
            AnonymousClass00C.A08(Bmq);
            A0J.put(str, Bmq);
        }
        return A0J;
    }

    public static final void A02(C203639oR r2, C184818t3 r3) {
        C184068rq r0 = (C184068rq) ((C184328sG) r3.A00).A01;
        if (r0 != null) {
            Iterator A14 = C90514aH.A14((List) ((C184038rn) r0.A00).A00);
            while (A14.hasNext()) {
                C184578sf r02 = (C184578sf) A14.next();
                AnonymousClass00C.A0B(r02);
                r2.A0D(r02);
            }
        }
    }

    public static final void A03(C203639oR r6, C184818t3 r7, String str) {
        C184828t4 r2;
        C184068rq r0 = (C184068rq) ((C184328sG) r7.A00).A04;
        if (!(r0 == null || (r2 = (C184828t4) r0.A00) == null)) {
            C203639oR.A06(r6, C203639oR.A01(r6, r2, str));
            C203619oP r5 = r6.A00;
            if (r5 != null) {
                String str2 = r2.A01;
                AnonymousClass00C.A08(str2);
                long size = (long) ((List) r2.A00).size();
                AnonymousClass9S8 r02 = r5.A01;
                if (r02 == null) {
                    throw C36331k8.A0d("flowManager");
                }
                ((Deque) C165607th.A0n(r02.A04)).addLast(str2);
                C203619oP.A07(r5, "queueStates");
                r5.A0G.A01(r5.A00, "num_states_queued", size);
                C203619oP.A00(r5);
            }
        }
        A02(r6, r7);
    }

    public static final LinkedHashMap A01(Integer num, String str, String str2, Map map) {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C108355Te.SUCCESS_FLAG.key, C36381kD.A0j());
        LinkedHashMap A1G2 = C36431kI.A1G();
        String str3 = C108355Te.ERROR_NAME.key;
        if (str == null) {
            str = "";
        }
        A1G2.put(str3, str);
        if (num != null) {
            A1G2.put(C108355Te.ERROR_CODE.key, Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            A1G2.put(C108355Te.ERROR_MESSAGE.key, str2);
        }
        if (map != null) {
            A1G2.put(C108355Te.ERROR_PARAMS.key, map);
        }
        A1G.put(C108355Te.ERROR.key, A1G2);
        return A1G;
    }
}
