package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Qm  reason: invalid class name */
public abstract class AnonymousClass6Qm {
    public static C140456lc A00(C140456lc r5, C140456lc r6, Object obj, int i) {
        C140456lc r3 = r6;
        C140456lc r1 = r5;
        if (r5 != r6 || !AnonymousClass5Z0.A00(C140456lc.A0I(r6, i), obj)) {
            if (r5 == r6) {
                int i2 = r6.A03;
                r1 = new C140456lc(r3.A01, r3, r3, r3.A08, i2);
            }
            r1.A05.put(i, obj);
        }
        return r1;
    }

    public static C140456lc A01(C140456lc r5, List list, int i) {
        if (list != null) {
            if (i < list.size()) {
                C140456lc A0K = C90504aG.A0K(list, i);
                if (A0K.A03 == r5.A03) {
                    return A0K;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C140456lc A0Y = C90514aH.A0Y(it);
                if (A0Y.A03 == r5.A03) {
                    return A0Y;
                }
            }
        }
        return null;
    }

    public static String A02(C140456lc r4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        String A0Y = r4.A0Y();
        if (A0Y != null) {
            A0u.append(" id: ");
            A0u.append(A0Y);
        }
        List list = r4.A08;
        if (list != null && !list.isEmpty()) {
            A0u.append(" keyPath: ");
            A0u.append(C36391kE.A0t(list));
            for (int i = 1; i < list.size(); i++) {
                A0u.append("/");
                A0u.append(list.get(i));
            }
        }
        A0u.append(" styleId: ");
        return C36381kD.A10(A0u, r4.A04);
    }
}
