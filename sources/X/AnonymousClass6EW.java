package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.6EW  reason: invalid class name */
public class AnonymousClass6EW {
    public final Map A00 = new WeakHashMap();
    public final Map A01 = AnonymousClass001.A0J();

    public synchronized void A01(C158597hl r4, Class cls, Object obj) {
        synchronized (this) {
            Map map = this.A01;
            Map A15 = C90514aH.A15(cls, map);
            if (A15 == null) {
                A15 = new WeakHashMap();
                map.put(cls, A15);
            }
            A15.put(obj, r4);
            Map map2 = this.A00;
            Set A0r = C90524aI.A0r(obj, map2);
            if (A0r == null) {
                A0r = C36441kJ.A16();
                map2.put(obj, A0r);
            }
            A0r.add(cls);
        }
    }

    public synchronized void A02(C16360p7 r4) {
        String.format("UIObserver.fire: %s", AnonymousClass000.A1b(r4));
        Map A15 = C90514aH.A15(r4.getClass(), this.A01);
        if (A15 != null) {
            Iterator A10 = AnonymousClass000.A10(A15);
            while (A10.hasNext()) {
                C158597hl r0 = (C158597hl) A15.get(A10.next());
                if (r0 != null) {
                    r0.BX5(r4);
                }
            }
        }
    }

    public synchronized void A03(Class cls, Object obj) {
        Map A15 = C90514aH.A15(cls, this.A01);
        if (A15 != null) {
            A15.remove(obj);
        }
        Set A0r = C90524aI.A0r(obj, this.A00);
        if (A0r != null) {
            A0r.remove(cls);
        }
    }

    public synchronized void A04(Object obj) {
        Set A0r = C90524aI.A0r(obj, this.A00);
        if (A0r != null) {
            Iterator it = C90524aI.A0k(A0r).iterator();
            while (it.hasNext()) {
                A03((Class) it.next(), obj);
            }
        }
    }

    public static void A00(AnonymousClass6EW r1, Class cls, Object obj, int i) {
        r1.A01(new C163227pr(obj, i), cls, obj);
    }
}
