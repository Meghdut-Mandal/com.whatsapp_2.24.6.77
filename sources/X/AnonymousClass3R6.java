package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.3R6  reason: invalid class name */
public abstract class AnonymousClass3R6 {
    public static final Object A00(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (!collection.isEmpty()) {
            return collection.iterator().next();
        }
        throw new NoSuchElementException();
    }

    public static final LinkedHashMap A01(Map map) {
        AnonymousClass00C.A0D(map, 0);
        Set entrySet = map.entrySet();
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            ((List) C36391kE.A0s(A11.getValue(), A1G)).add(A11.getKey());
        }
        return A1G;
    }

    public static final void A02(Map map, Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 1);
        for (Object remove : objArr) {
            map.remove(remove);
        }
    }
}
