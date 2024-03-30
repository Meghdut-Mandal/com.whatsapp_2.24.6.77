package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.14v  reason: invalid class name and case insensitive filesystem */
public abstract class C225414v {
    public static Iterator concat(Iterator it) {
        return new AnonymousClass151(it);
    }

    public static Iterator consumingForArray(Iterator... itArr) {
        return new AnonymousClass150(itArr);
    }

    public static C225614x singletonIterator(Object obj) {
        return new AnonymousClass21W(obj);
    }

    public static String toString(Iterator it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean addAll(Collection collection, Iterator it) {
        Objects.requireNonNull(collection);
        Objects.requireNonNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static int advance(Iterator it, int i) {
        Objects.requireNonNull(it);
        int i2 = 0;
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(String.valueOf("numberToAdvance must be nonnegative"));
        }
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean elementsEqual(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L_0x0000:
            boolean r1 = r3.hasNext()
            boolean r0 = r4.hasNext()
            if (r1 == 0) goto L_0x001c
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r3.next()
            java.lang.Object r0 = r4.next()
            boolean r0 = X.C1897595l.A00(r1, r0)
            if (r0 != 0) goto L_0x0000
        L_0x001b:
            return r2
        L_0x001c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C225414v.elementsEqual(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static C225614x emptyIterator() {
        return emptyListIterator();
    }

    public static AnonymousClass152 emptyListIterator() {
        return AnonymousClass154.EMPTY;
    }

    public static boolean removeAll(Iterator it, Collection collection) {
        Objects.requireNonNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static C225614x unmodifiableIterator(Iterator it) {
        Objects.requireNonNull(it);
        return new AnonymousClass156(it);
    }

    public static Iterator concat(Iterator it, Iterator it2) {
        Objects.requireNonNull(it);
        Objects.requireNonNull(it2);
        return concat(consumingForArray(it, it2));
    }
}
