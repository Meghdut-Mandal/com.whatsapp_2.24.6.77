package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.9dc  reason: invalid class name and case insensitive filesystem */
public final class C198469dc {
    public final AnonymousClass007 A00 = new AnonymousClass007(0);

    public boolean A01(Object obj, Object obj2) {
        AnonymousClass007 r1 = this.A00;
        if (!r1.containsKey(obj) || !r1.containsKey(obj2)) {
            throw AnonymousClass001.A08("All nodes must be present in the graph before being added as an edge");
        }
        List list = (List) r1.get(obj);
        if (list == null) {
            list = AnonymousClass001.A0I();
            r1.put(obj, list);
        }
        return list.add(obj2);
    }

    public static void A00(C198469dc r2, Object obj, List list, Set set) {
        if (list.contains(obj)) {
            return;
        }
        if (!set.contains(obj)) {
            set.add(obj);
            List<Object> list2 = (List) r2.A00.get(obj);
            if (list2 != null) {
                for (Object A002 : list2) {
                    A00(r2, A002, list, set);
                }
            }
            set.remove(obj);
            list.add(obj);
            return;
        }
        throw new AnonymousClass91Z();
    }
}
