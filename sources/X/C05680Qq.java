package X;

import java.util.Map;

/* renamed from: X.0Qq  reason: invalid class name and case insensitive filesystem */
public abstract class C05680Qq {
    public static final void A00(Object obj, C019108d r4) {
        boolean isInstance;
        AnonymousClass00C.A0D(r4, 0);
        Class cls = ((C019308f) r4).A00;
        Map map = C019308f.A02;
        AnonymousClass00C.A0E(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Number number = (Number) map.get(cls);
        if (number != null) {
            isInstance = C07710Yz.A06(obj, number.intValue());
        } else {
            if (cls.isPrimitive()) {
                cls = C05620Qk.A00(new C019308f(cls));
            }
            isInstance = cls.isInstance(obj);
        }
        if (isInstance) {
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Value cannot be cast to ");
        throw new ClassCastException(AnonymousClass000.A0q(r4.BGN(), A0u));
    }
}
