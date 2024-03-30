package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.09i  reason: invalid class name and case insensitive filesystem */
public final class C022109i {
    public static final C022109i A02;
    public final Map A00;
    public final Set A01;

    public C022109i(Map map, Set set) {
        AnonymousClass00C.A0D(set, 1);
        AnonymousClass00C.A0D(map, 3);
        this.A01 = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.A00 = linkedHashMap;
    }

    static {
        C004702c r2 = C004702c.A00;
        C000500f r1 = C000500f.A00;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A02 = new C022109i(r1, r2);
    }
}
