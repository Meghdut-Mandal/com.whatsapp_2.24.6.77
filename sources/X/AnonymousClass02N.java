package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.02N  reason: invalid class name */
public abstract class AnonymousClass02N extends AnonymousClass02M {
    public static final HashSet A01(Object... objArr) {
        HashSet hashSet = new HashSet(C000300d.A02(r3));
        for (Object add : objArr) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public static final Set A02(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C000300d.A02(r3));
        for (Object add : objArr) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    public static final Set A03(Object... objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        if (objArr.length > 0) {
            return AnonymousClass02R.A0E(objArr);
        }
        return C004702c.A00;
    }
}
