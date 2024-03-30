package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Y2  reason: invalid class name */
public class AnonymousClass1Y2 {
    public final AnonymousClass005 A00;
    public final Map A01 = new HashMap();

    private synchronized AnonymousClass3GN A00(AnonymousClass11F r4) {
        AnonymousClass3GN r1;
        Map map = this.A01;
        r1 = (AnonymousClass3GN) map.get(r4.getRawString());
        if (r1 == null) {
            r1 = new AnonymousClass3GN(this);
            map.put(r4.getRawString(), r1);
        }
        return r1;
    }

    public void A01(AnonymousClass3T1 r4) {
        C64933Qa r2 = r4.A1J;
        AnonymousClass11F r0 = r2.A00;
        C18740tg.A06(r0);
        AnonymousClass3GN A002 = A00(r0);
        synchronized (A002) {
            A002.A01.put(r2, r4);
            A002.toString();
        }
    }

    public void A02(AnonymousClass3T1 r5) {
        C64933Qa r3 = r5.A1J;
        AnonymousClass11F r0 = r3.A00;
        C18740tg.A06(r0);
        AnonymousClass3GN A002 = A00(r0);
        synchronized (A002) {
            boolean z = false;
            if (A002.A01.remove(r3) != null) {
                z = true;
            }
            A002.A00.remove(r3);
            A002.toString();
            if (z) {
                A002.A00();
            }
        }
    }

    public void A03(AnonymousClass3T1 r5) {
        C64933Qa r3 = r5.A1J;
        AnonymousClass11F r1 = r3.A00;
        C18740tg.A06(r1);
        AnonymousClass3GN A002 = A00(r1);
        synchronized (A002) {
            if (!A002.A01.containsKey(r3)) {
                A002.toString();
                boolean z = r1 instanceof C28981Uw;
                C20280xJ r0 = (C20280xJ) A002.A02.A00.get();
                if (z) {
                    r0.A02(r5);
                } else {
                    r0.A01(r5);
                }
            } else {
                A002.toString();
                A002.A00.add(r3);
                A002.A00();
            }
        }
    }

    public AnonymousClass1Y2(AnonymousClass005 r2) {
        this.A00 = r2;
    }
}
