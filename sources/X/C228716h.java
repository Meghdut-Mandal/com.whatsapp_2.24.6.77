package X;

import java.util.Map;

/* renamed from: X.16h  reason: invalid class name and case insensitive filesystem */
public final class C228716h {
    public final Map A00;
    public final Map A01;

    public C228716h(Map map, Map map2) {
        AnonymousClass00C.A0D(map, 1);
        AnonymousClass00C.A0D(map2, 2);
        this.A01 = map;
        this.A00 = map2;
    }

    public final Object A00(Class cls) {
        StringBuilder sb;
        AnonymousClass005 r1 = (AnonymousClass005) this.A01.get(cls);
        Map map = this.A00;
        if (r1 == null) {
            if (map.containsKey(cls)) {
                sb.append("Binding for ");
                sb.append(cls);
                sb.append(" is overridden without a default implementation. This is likely a mistake.");
            } else {
                sb = new StringBuilder();
                sb.append("No binding found for ");
                sb.append(cls);
                sb.append('.');
            }
            throw new IllegalStateException(sb.toString());
        }
        AnonymousClass005 r0 = (AnonymousClass005) map.get(cls);
        if (r0 != null) {
            r1 = r0;
        }
        return r1.get();
    }
}
