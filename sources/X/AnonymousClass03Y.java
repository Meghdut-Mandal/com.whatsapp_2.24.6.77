package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: X.03Y  reason: invalid class name */
public abstract class AnonymousClass03Y extends AnonymousClass03X {
    public static final Object A09(List list) {
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final void A0B(Iterable iterable, Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        AnonymousClass00C.A0D(iterable, 1);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static final void A0C(Iterable iterable, C006302t r4) {
        AnonymousClass00C.A0D(iterable, 0);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) r4.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public static final void A0D(Collection collection, Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 1);
        List asList = Arrays.asList(objArr);
        AnonymousClass00C.A08(asList);
        collection.addAll(asList);
    }

    public static final void A0E(List list, C006302t r6, boolean z) {
        int i;
        if (list instanceof RandomAccess) {
            C13590k7 A00 = new C15020mZ(0, list.size() - 1).iterator();
            int i2 = 0;
            while (A00.hasNext()) {
                int A002 = A00.A00();
                Object obj = list.get(A002);
                if (((Boolean) r6.invoke(obj)).booleanValue() != z) {
                    if (i2 != A002) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
            }
            if (i2 < list.size() && i2 <= list.size() - 1) {
                while (true) {
                    list.remove(i);
                    if (i != i2) {
                        i--;
                    } else {
                        return;
                    }
                }
            }
        } else if (!(list instanceof AnonymousClass00W) || (list instanceof AnonymousClass00X)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) r6.invoke(it.next())).booleanValue() == z) {
                    it.remove();
                }
            }
        } else {
            C07710Yz.A04(list, "kotlin.collections.MutableIterable");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static final Object A0A(List list) {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }
}
