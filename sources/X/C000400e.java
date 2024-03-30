package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.00e  reason: invalid class name and case insensitive filesystem */
public abstract class C000400e extends C000300d {
    public static final HashMap A05(AnonymousClass011... r2) {
        HashMap hashMap = new HashMap(C000300d.A02(r2.length));
        A0E(hashMap, r2);
        return hashMap;
    }

    public static final LinkedHashMap A06(Map map) {
        AnonymousClass00C.A0D(map, 0);
        return new LinkedHashMap(map);
    }

    public static final LinkedHashMap A07(AnonymousClass011... r2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C000300d.A02(r2.length));
        A0E(linkedHashMap, r2);
        return linkedHashMap;
    }

    public static final LinkedHashMap A08(AnonymousClass011... r2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C000300d.A02(r2.length));
        A0E(linkedHashMap, r2);
        return linkedHashMap;
    }

    public static final Map A09(Iterable iterable) {
        Object next;
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                C000500f r3 = C000500f.A00;
                AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                return r3;
            } else if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C000300d.A02(collection.size()));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    AnonymousClass011 r0 = (AnonymousClass011) it.next();
                    linkedHashMap.put(r0.first, r0.second);
                }
                return linkedHashMap;
            } else {
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return C000300d.A03((AnonymousClass011) next);
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                AnonymousClass011 r02 = (AnonymousClass011) it2.next();
                linkedHashMap2.put(r02.first, r02.second);
            }
            return A0A(linkedHashMap2);
        }
    }

    public static final Map A0B(Map map) {
        AnonymousClass00C.A0D(map, 0);
        int size = map.size();
        if (size == 0) {
            C000500f r1 = C000500f.A00;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return r1;
        } else if (size != 1) {
            return new LinkedHashMap(map);
        } else {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            AnonymousClass00C.A08(singletonMap);
            return singletonMap;
        }
    }

    public static final void A0E(Map map, AnonymousClass011[] r5) {
        for (AnonymousClass011 r0 : r5) {
            map.put(r0.first, r0.second);
        }
    }

    public static final C000500f A0D() {
        C000500f r1 = C000500f.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r1;
    }

    public static final Map A0A(Map map) {
        int size = map.size();
        if (size == 0) {
            C000500f r2 = C000500f.A00;
            AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            return r2;
        } else if (size != 1) {
            return map;
        } else {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            AnonymousClass00C.A08(singletonMap);
            return singletonMap;
        }
    }

    public static final Map A0C(Map map, AnonymousClass011 r4) {
        if (map.isEmpty()) {
            return C000300d.A03(r4);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(r4.first, r4.second);
        return linkedHashMap;
    }
}
