package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5zt  reason: invalid class name and case insensitive filesystem */
public final class C125425zt {
    public final AnonymousClass6KU A00(String str, Map map) {
        Set set;
        AnonymousClass6KU r0;
        Object obj;
        AnonymousClass00C.A0D(str, 0);
        ArrayList A0I = AnonymousClass001.A0I();
        if (map == null || (set = map.entrySet()) == null) {
            set = C004702c.A00;
        }
        Iterator it = set.iterator();
        while (true) {
            Map map2 = null;
            if (!it.hasNext()) {
                return new AnonymousClass6KU(str, (AnonymousClass6KU[]) A0I.toArray(new AnonymousClass6KU[0]));
            }
            Map.Entry A11 = AnonymousClass000.A11(it);
            if (A11.getValue() == null || !(A11.getValue() instanceof Map)) {
                r0 = new AnonymousClass6KU(C90494aF.A0f(A11), (AnonymousClass6KU[]) null);
            } else {
                String A0f = C90494aF.A0f(A11);
                if (map != null) {
                    obj = map.get(A11.getKey());
                } else {
                    obj = null;
                }
                if (obj instanceof Map) {
                    map2 = (Map) obj;
                }
                r0 = A00(A0f, map2);
            }
            A0I.add(r0);
        }
    }
}
