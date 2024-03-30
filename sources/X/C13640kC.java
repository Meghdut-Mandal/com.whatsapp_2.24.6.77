package X;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.0kC  reason: invalid class name and case insensitive filesystem */
public abstract class C13640kC extends AnonymousClass02N {
    public static final LinkedHashSet A04(Iterable iterable, Set set) {
        int size;
        AnonymousClass00C.A0D(set, 0);
        AnonymousClass00C.A0D(iterable, 1);
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (Integer.valueOf(size2) != null) {
                size = set.size() + size2;
                LinkedHashSet linkedHashSet = new LinkedHashSet(C000300d.A02(size));
                linkedHashSet.addAll(set);
                AnonymousClass03Y.A0B(iterable, linkedHashSet);
                return linkedHashSet;
            }
        }
        size = set.size() * 2;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(C000300d.A02(size));
        linkedHashSet2.addAll(set);
        AnonymousClass03Y.A0B(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static final Set A05(Iterable iterable, Set set) {
        LinkedHashSet linkedHashSet;
        if (!(iterable instanceof Collection)) {
            iterable = C007103b.A0Y(iterable);
        }
        Collection collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return C007103b.A0f(set);
        }
        if (collection instanceof Set) {
            for (Object next : set) {
                if (!collection.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
        } else {
            linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collection);
        }
        return linkedHashSet;
    }

    public static final Set A06(Object obj, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C000300d.A02(set.size()));
        boolean z = false;
        for (Object next : set) {
            if (z || !AnonymousClass00C.A0J(next, obj)) {
                linkedHashSet.add(next);
            } else {
                z = true;
            }
        }
        return linkedHashSet;
    }
}
