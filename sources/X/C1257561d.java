package X;

import java.util.Map;

/* renamed from: X.61d  reason: invalid class name and case insensitive filesystem */
public class C1257561d {
    public final Object A00 = C36441kJ.A11();
    public final Map A01 = AnonymousClass001.A0J();

    public int A00(C140456lc r5, C140456lc r6, String str) {
        int incrementAndGet;
        AnonymousClass3GD r3 = new AnonymousClass3GD(r6.A03, r5.A03, str);
        synchronized (this.A00) {
            Map map = this.A01;
            Integer num = (Integer) map.get(r3);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = C113005eq.A00.incrementAndGet();
                C36421kH.A1M(r3, map, incrementAndGet);
            }
        }
        return incrementAndGet;
    }
}
