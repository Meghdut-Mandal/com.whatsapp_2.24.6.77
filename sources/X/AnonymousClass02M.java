package X;

import java.util.Set;

/* renamed from: X.02M  reason: invalid class name */
public abstract class AnonymousClass02M {
    public static final C13560k4 A00(Set set) {
        C13560k4 r2 = (C13560k4) set;
        C12460i5 r1 = r2.backing;
        r1.A05();
        r1.isReadOnly = true;
        if (r1.size() <= 0) {
            AnonymousClass00C.A0E(C12460i5.A00, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        if (r2.size() <= 0) {
            return C13560k4.A00;
        }
        return r2;
    }
}
