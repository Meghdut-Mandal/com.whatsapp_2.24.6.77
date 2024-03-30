package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ZH  reason: invalid class name */
public abstract class AnonymousClass5ZH {
    public static final C1273768a A00(Map map) {
        AnonymousClass00C.A0D(map, 0);
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            A1G.put(A11.getKey(), new C142256oa((AnonymousClass6IL) null, C90514aH.A10(A11), (List) null));
        }
        return new C1273768a(A1G);
    }
}
