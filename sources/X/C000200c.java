package X;

import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.00c  reason: invalid class name and case insensitive filesystem */
public abstract class C000200c {
    public static final Object A00(Object obj, Map map) {
        if (map instanceof C12470i7) {
            C12470i7 r3 = (C12470i7) map;
            Map map2 = r3.A00;
            Object obj2 = map2.get(obj);
            if (obj2 != null || map2.containsKey(obj)) {
                return obj2;
            }
            return r3.A01.invoke(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(obj);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0i7, java.util.Map] */
    public static final Map A01(Map map, C006302t r2) {
        if (map instanceof C12470i7) {
            return A01(((C12470i7) map).A00, r2);
        }
        return new C12470i7(map, r2);
    }
}
