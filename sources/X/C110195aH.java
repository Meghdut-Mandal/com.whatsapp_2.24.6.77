package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5aH  reason: invalid class name and case insensitive filesystem */
public abstract class C110195aH {
    public static final void A00(String str, HashMap hashMap, HashSet hashSet, List list) {
        List A0n;
        if (hashSet.contains(str)) {
            throw new AnonymousClass78L("Dependency cycle detected in biz_value_features");
        } else if (!list.contains(str) && (A0n = C90524aI.A0n(str, hashMap)) != null) {
            hashSet.add(str);
            Iterator it = A0n.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                if (!AnonymousClass00C.A0J(A0C, str)) {
                    A00(A0C, hashMap, hashSet, list);
                }
            }
            hashSet.remove(str);
            list.add(str);
        }
    }
}
