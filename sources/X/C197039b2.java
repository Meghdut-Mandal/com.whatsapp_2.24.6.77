package X;

import java.util.Iterator;

/* renamed from: X.9b2  reason: invalid class name and case insensitive filesystem */
public abstract class C197039b2 {
    public static C201179j1 A00 = C201179j1.A06;
    public static final C201309jJ A01 = new C201309jJ();
    public static final C194789Rg A02 = new C194789Rg();

    public static void A00(Appendable appendable, Object obj, C201179j1 r7) {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        C201309jJ r3 = A01;
        B0G b0g = (B0G) r3.A01.get(cls);
        if (b0g == null) {
            if (!cls.isArray()) {
                Iterator it = r3.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        b0g = C201309jJ.A0A;
                        break;
                    }
                    C192699If r1 = (C192699If) it.next();
                    if (r1.A00.isAssignableFrom(cls)) {
                        b0g = r1.A01;
                        break;
                    }
                }
            } else {
                b0g = C201309jJ.A09;
            }
            r3.A01(b0g, cls);
        }
        b0g.Bxd(appendable, obj, r7);
    }
}
