package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6S2  reason: invalid class name */
public final class AnonymousClass6S2 {
    public boolean A00;
    public final C1506776e A01 = C1506776e.A02(new AnonymousClass00S[16]);
    public final Map A02 = C36431kI.A1G();

    public static final void A00(AnonymousClass6S2 r6) {
        C1506776e r5 = r6.A01;
        int i = r5.A00;
        if (i > 0) {
            Object[] objArr = r5.A01;
            int i2 = 0;
            do {
                ((AnonymousClass00S) objArr[i2]).invoke();
                i2++;
            } while (i2 < i);
        }
        r5.A06();
        r6.A02.clear();
        r6.A00 = false;
    }

    public static final void A01(AnonymousClass6S2 r4) {
        Map map = r4.A02;
        Iterator A10 = AnonymousClass000.A10(map);
        while (A10.hasNext()) {
            C94214hq r1 = (C94214hq) A10.next();
            AnonymousClass5U8 r0 = (AnonymousClass5U8) AnonymousClass6VZ.A01(r1).A05.A02.get(r1);
            if (r0 != null) {
                r1.A00 = r0;
            } else {
                throw AnonymousClass001.A09("committing a node that was not updated in the current transaction");
            }
        }
        map.clear();
        r4.A00 = false;
    }
}
