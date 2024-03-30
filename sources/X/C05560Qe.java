package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0Qe  reason: invalid class name and case insensitive filesystem */
public abstract class C05560Qe {
    public static final Map A00(C17140qn r5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator BuI = r5.BuI();
        while (BuI.hasNext()) {
            Object BNv = r5.BNv(BuI.next());
            Object obj = linkedHashMap.get(BNv);
            if (obj == null && !linkedHashMap.containsKey(BNv)) {
                obj = new C10790fE();
            }
            C10790fE r1 = (C10790fE) obj;
            r1.element++;
            linkedHashMap.put(BNv, r1);
        }
        Iterator A0y = AnonymousClass000.A0y(linkedHashMap);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            AnonymousClass00C.A0E(A11, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            if (!(A11 instanceof AnonymousClass00W) || (A11 instanceof C17920sI)) {
                A11.setValue(Integer.valueOf(((C10790fE) A11.getValue()).element));
            } else {
                C07710Yz.A04(A11, "kotlin.collections.MutableMap.MutableEntry");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
        return C07710Yz.A02(linkedHashMap);
    }
}
