package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6EO  reason: invalid class name */
public final class AnonymousClass6EO {
    public final Object A00 = C36441kJ.A11();
    public final Map A01 = C36431kI.A1G();

    public final C114465hI A00(AnonymousClass69L r3) {
        C114465hI r0;
        AnonymousClass00C.A0D(r3, 0);
        synchronized (this.A00) {
            r0 = (C114465hI) this.A01.remove(r3);
        }
        return r0;
    }

    public final List A02(String str) {
        List A0Y;
        AnonymousClass00C.A0D(str, 0);
        synchronized (this.A00) {
            Map map = this.A01;
            LinkedHashMap A1G = C36431kI.A1G();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (AnonymousClass00C.A0J(((AnonymousClass69L) A11.getKey()).A01, str)) {
                    C36411kG.A1T(A1G, A11);
                }
            }
            Iterator A10 = AnonymousClass000.A10(A1G);
            while (A10.hasNext()) {
                map.remove((AnonymousClass69L) A10.next());
            }
            A0Y = C007103b.A0Y(A1G.values());
        }
        return A0Y;
    }

    public final C114465hI A01(AnonymousClass69L r4) {
        C114465hI r0;
        synchronized (this.A00) {
            Map map = this.A01;
            Object obj = map.get(r4);
            if (obj == null) {
                obj = new C114465hI(r4);
                map.put(r4, obj);
            }
            r0 = (C114465hI) obj;
        }
        return r0;
    }

    public final boolean A03(AnonymousClass69L r3) {
        boolean containsKey;
        synchronized (this.A00) {
            containsKey = this.A01.containsKey(r3);
        }
        return containsKey;
    }
}
