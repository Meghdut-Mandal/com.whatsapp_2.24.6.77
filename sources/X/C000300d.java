package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.00d  reason: invalid class name and case insensitive filesystem */
public abstract class C000300d extends C000200c {
    public static final int A02(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map A03(AnonymousClass011 r2) {
        AnonymousClass00C.A0D(r2, 0);
        Map singletonMap = Collections.singletonMap(r2.first, r2.second);
        AnonymousClass00C.A08(singletonMap);
        return singletonMap;
    }

    public static final C12460i5 A04(Map map) {
        C12460i5 r1 = (C12460i5) map;
        r1.A05();
        r1.isReadOnly = true;
        if (r1.size() > 0) {
            return r1;
        }
        C12460i5 r12 = C12460i5.A00;
        AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return r12;
    }
}
