package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.03U  reason: invalid class name */
public abstract class AnonymousClass03U extends AnonymousClass03T {
    public static final int A06(Iterable iterable, int i) {
        AnonymousClass00C.A0D(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static final ArrayList A07(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AnonymousClass03Y.A0B((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
