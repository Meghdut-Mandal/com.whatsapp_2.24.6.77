package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5aU  reason: invalid class name and case insensitive filesystem */
public abstract class C110325aU {
    public static final int A00(Map map) {
        AnonymousClass00C.A0D(map, 0);
        Set entrySet = map.entrySet();
        int i = 0;
        if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass6EE) C36351kA.A0u(it)).A02 == 1 && (i = i + 1) < 0) {
                    throw C36371kC.A0s();
                }
            }
        }
        return i;
    }
}
