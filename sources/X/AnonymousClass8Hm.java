package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: X.8Hm  reason: invalid class name */
public final class AnonymousClass8Hm<E> extends AnonymousClass8Hn<E> {
    public static final AnonymousClass8Hm NATURAL_EMPTY_SET = new AnonymousClass8Hm(C23931Ak.of(), AXU.natural());
    public final transient C23931Ak elements;

    public Object ceiling(Object obj) {
        int tailIndex = tailIndex(obj, true);
        if (tailIndex == size()) {
            return null;
        }
        return this.elements.get(tailIndex);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return unsafeBinarySearch(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 == r6) goto L_0x0048
            boolean r0 = r7 instanceof java.util.Set
            r4 = 0
            if (r0 == 0) goto L_0x0047
            java.util.Set r7 = (java.util.Set) r7
            int r1 = r6.size()
            int r0 = r7.size()
            if (r1 != r0) goto L_0x0047
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0048
            java.util.Comparator r0 = r6.comparator
            boolean r0 = X.AnonymousClass9ZF.hasSameComparator(r0, r7)
            if (r0 == 0) goto L_0x0042
            java.util.Iterator r3 = r7.iterator()
            X.14x r2 = r6.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
        L_0x002a:
            boolean r0 = r2.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r2.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
            java.lang.Object r0 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
            if (r0 == 0) goto L_0x0047
            int r0 = r6.unsafeCompare(r1, r0)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0041 }
            if (r0 == 0) goto L_0x002a
            return r4
        L_0x0041:
            return r4
        L_0x0042:
            boolean r0 = r6.containsAll(r7)
            return r0
        L_0x0047:
            return r4
        L_0x0048:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Hm.equals(java.lang.Object):boolean");
    }

    public Object floor(Object obj) {
        int headIndex = headIndex(obj, true) - 1;
        if (headIndex == -1) {
            return null;
        }
        return this.elements.get(headIndex);
    }

    public Object higher(Object obj) {
        int tailIndex = tailIndex(obj, false);
        if (tailIndex == size()) {
            return null;
        }
        return this.elements.get(tailIndex);
    }

    public Object lower(Object obj) {
        int headIndex = headIndex(obj, false) - 1;
        if (headIndex == -1) {
            return null;
        }
        return this.elements.get(headIndex);
    }

    private int unsafeBinarySearch(Object obj) {
        return Collections.binarySearch(this.elements, obj, unsafeComparator());
    }

    public boolean containsAll(Collection collection) {
        if (collection instanceof B6T) {
            collection = ((B6T) collection).elementSet();
        }
        if (!AnonymousClass9ZF.hasSameComparator(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C225614x it = iterator();
        Iterator it2 = collection.iterator();
        if (it.hasNext()) {
            Object next = it2.next();
            Object next2 = it.next();
            while (true) {
                try {
                    int unsafeCompare = unsafeCompare(next2, next);
                    if (unsafeCompare >= 0) {
                        if (unsafeCompare != 0) {
                            break;
                        } else if (!it2.hasNext()) {
                            return true;
                        } else {
                            next = it2.next();
                        }
                    } else if (!it.hasNext()) {
                        break;
                    } else {
                        next2 = it.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return this.elements.copyIntoArray(objArr, i);
    }

    public AnonymousClass8Hn createDescendingSet() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return AnonymousClass8Hn.emptySet(reverseOrder);
        }
        return new AnonymousClass8Hm(this.elements.reverse(), reverseOrder);
    }

    public C225614x descendingIterator() {
        return this.elements.reverse().iterator();
    }

    public AnonymousClass8Hm getSubSet(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new AnonymousClass8Hm(this.elements.subList(i, i2), this.comparator);
        }
        return AnonymousClass8Hn.emptySet(this.comparator);
    }

    public int headIndex(Object obj, boolean z) {
        C23931Ak r1 = this.elements;
        Objects.requireNonNull(obj);
        int binarySearch = Collections.binarySearch(r1, obj, comparator());
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    public Object[] internalArray() {
        return this.elements.internalArray();
    }

    public int internalArrayEnd() {
        return this.elements.internalArrayEnd();
    }

    public int internalArrayStart() {
        return this.elements.internalArrayStart();
    }

    public boolean isPartialView() {
        return this.elements.isPartialView();
    }

    public C225614x iterator() {
        return this.elements.iterator();
    }

    public int size() {
        return this.elements.size();
    }

    public int tailIndex(Object obj, boolean z) {
        C23931Ak r1 = this.elements;
        Objects.requireNonNull(obj);
        int binarySearch = Collections.binarySearch(r1, obj, comparator());
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (!z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    public AnonymousClass8Hm(C23931Ak r1, Comparator comparator) {
        super(comparator);
        this.elements = r1;
    }

    public C23931Ak asList() {
        return this.elements;
    }

    public Object first() {
        if (!isEmpty()) {
            return C36391kE.A0t(this.elements);
        }
        throw C165617ti.A0e();
    }

    public AnonymousClass8Hn headSetImpl(Object obj, boolean z) {
        return getSubSet(0, headIndex(obj, z));
    }

    public Object last() {
        if (!isEmpty()) {
            return this.elements.get(size() - 1);
        }
        throw C165617ti.A0e();
    }

    public AnonymousClass8Hn subSetImpl(Object obj, boolean z, Object obj2, boolean z2) {
        return tailSetImpl(obj, z).headSetImpl(obj2, z2);
    }

    public AnonymousClass8Hn tailSetImpl(Object obj, boolean z) {
        return getSubSet(tailIndex(obj, z), size());
    }

    public Comparator unsafeComparator() {
        return this.comparator;
    }
}
