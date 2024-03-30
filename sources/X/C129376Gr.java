package X;

import java.util.Map;

/* renamed from: X.6Gr  reason: invalid class name and case insensitive filesystem */
public abstract class C129376Gr {
    public static final C134656bO A00(C134606bJ r1, C134606bJ r2, Map map) {
        AnonymousClass00C.A0D(r1, 1);
        C134656bO r0 = (C134656bO) map.get(C36441kJ.A19(r1, r2));
        if (r0 != null) {
            return r0;
        }
        if (r2 != null) {
            return (C134656bO) map.get(C36441kJ.A19(r2, r1));
        }
        return null;
    }

    public static final C134606bJ A01(C134746bX r3, int i) {
        return new C134606bJ(r3.A00, ((C134456b4) r3.A01.get(i)).A00());
    }
}
