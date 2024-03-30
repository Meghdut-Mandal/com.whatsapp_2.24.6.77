package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6XG  reason: invalid class name */
public abstract class AnonymousClass6XG {
    public static final C129686Ib A00 = C129686Ib.A00;

    public static int A00(Object obj, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean A03(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static void A01(C16670pt r2, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (r2.BvZ(it.next())) {
                it.remove();
            }
        }
    }

    public static boolean A02(C16670pt r2, Collection collection) {
        for (Object BvZ : collection) {
            if (r2.BvZ(BvZ)) {
                return true;
            }
        }
        return false;
    }
}
