package X;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.5Xg  reason: invalid class name and case insensitive filesystem */
public abstract class C109355Xg {
    public static final C138686iW A00(String str, int i) {
        AnonymousClass00C.A0D(str, 0);
        TreeMap treeMap = C138686iW.A08;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C138686iW r0 = (C138686iW) ceilingEntry.getValue();
                r0.A07 = str;
                r0.A00 = i;
                return r0;
            }
            C138686iW r02 = new C138686iW(i);
            r02.A07 = str;
            r02.A00 = i;
            return r02;
        }
    }

    public static C138686iW A01(String str, String str2) {
        TreeMap treeMap = C138686iW.A08;
        C138686iW A00 = A00(str, 1);
        if (str2 == null) {
            A00.B1p(1);
            return A00;
        }
        A00.B1q(1, str2);
        return A00;
    }
}
