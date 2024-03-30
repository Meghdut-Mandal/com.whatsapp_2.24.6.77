package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* renamed from: X.0Mc  reason: invalid class name and case insensitive filesystem */
public final class C04810Mc extends C04820Md implements NavigableSet, C17830s6 {
    public static final C04810Mc A03 = new C04810Mc(AnonymousClass0MY.A02, C04890Mk.A00);
    public transient C04810Mc A00;
    public final transient AnonymousClass0MZ A01;
    public final transient Comparator A02;

    public final AnonymousClass0MZ A0A() {
        return this.A01;
    }

    public final Object ceiling(Object obj) {
        int A0C = A0C(obj, true);
        AnonymousClass0MZ r1 = this.A01;
        if (A0C == r1.size()) {
            return null;
        }
        return r1.get(A0C);
    }

    public final Comparator comparator() {
        return this.A02;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.A01, obj, this.A02) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x004a
            boolean r0 = r8 instanceof java.util.Set
            r5 = 0
            if (r0 == 0) goto L_0x0049
            java.util.Set r8 = (java.util.Set) r8
            X.0MZ r2 = r7.A01
            int r1 = r2.size()
            int r0 = r8.size()
            if (r1 != r0) goto L_0x0049
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x004a
            java.util.Comparator r4 = r7.A02
            boolean r0 = A01(r4, r8)
            if (r0 == 0) goto L_0x0044
            java.util.Iterator r3 = r8.iterator()
            X.0Mo r2 = r2.listIterator(r5)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
        L_0x002c:
            boolean r0 = r2.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x004a
            java.lang.Object r1 = r2.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            java.lang.Object r0 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x0049
            int r0 = r4.compare(r1, r0)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0043 }
            if (r0 == 0) goto L_0x002c
            return r5
        L_0x0043:
            return r5
        L_0x0044:
            boolean r0 = r7.containsAll(r8)
            return r0
        L_0x0049:
            return r5
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04810Mc.equals(java.lang.Object):boolean");
    }

    public final Object floor(Object obj) {
        int A0D = A0D(obj, true) - 1;
        if (A0D == -1) {
            return null;
        }
        return this.A01.get(A0D);
    }

    public final Object higher(Object obj) {
        int A0C = A0C(obj, false);
        AnonymousClass0MZ r1 = this.A01;
        if (A0C == r1.size()) {
            return null;
        }
        return r1.get(A0C);
    }

    public final Object lower(Object obj) {
        int A0D = A0D(obj, false) - 1;
        if (A0D == -1) {
            return null;
        }
        return this.A01.get(A0D);
    }

    static {
        C04930Mo r0 = AnonymousClass0MZ.A00;
    }

    public static C04810Mc A00(Comparator comparator) {
        if (C04890Mk.A00.equals(comparator)) {
            return A03;
        }
        C04930Mo r0 = AnonymousClass0MZ.A00;
        return new C04810Mc(AnonymousClass0MY.A02, comparator);
    }

    public final int A04() {
        return this.A01.A04();
    }

    public final int A05() {
        return this.A01.A05();
    }

    public final int A06(Object[] objArr, int i) {
        return this.A01.A06(objArr, 0);
    }

    public final C12200hf A07() {
        return this.A01.listIterator(0);
    }

    public final Object[] A08() {
        return this.A01.A08();
    }

    public final int A0C(Object obj, boolean z) {
        AnonymousClass0MZ r1 = this.A01;
        Objects.requireNonNull(obj);
        int binarySearch = Collections.binarySearch(r1, obj, this.A02);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (!z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    public final int A0D(Object obj, boolean z) {
        AnonymousClass0MZ r1 = this.A01;
        Objects.requireNonNull(obj);
        int binarySearch = Collections.binarySearch(r1, obj, this.A02);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    /* renamed from: A0E */
    public final C04810Mc descendingSet() {
        C04810Mc r2 = this.A00;
        if (r2 == null) {
            Comparator reverseOrder = Collections.reverseOrder(this.A02);
            if (isEmpty()) {
                r2 = A00(reverseOrder);
            } else {
                r2 = new C04810Mc(this.A01.A09(), reverseOrder);
            }
            this.A00 = r2;
            r2.A00 = this;
        }
        return r2;
    }

    public final C04810Mc A0F(int i, int i2) {
        if (i == 0) {
            if (i2 == this.A01.size()) {
                return this;
            }
            i = 0;
        }
        if (i < i2) {
            return new C04810Mc(this.A01.subList(i, i2), this.A02);
        }
        return A00(this.A02);
    }

    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.A02;
        if (!A01(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C04930Mo A0B = this.A01.listIterator(0);
        Iterator it = collection.iterator();
        if (A0B.hasNext()) {
            Object next = it.next();
            Object next2 = A0B.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        } else if (!it.hasNext()) {
                            return true;
                        } else {
                            next = it.next();
                        }
                    } else if (!A0B.hasNext()) {
                        break;
                    } else {
                        next2 = A0B.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return this.A01.A09().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.A01.listIterator(0);
    }

    public final int size() {
        return this.A01.size();
    }

    public C04810Mc(AnonymousClass0MZ r1, Comparator comparator) {
        this.A02 = comparator;
        this.A01 = r1;
    }

    public static boolean A01(Comparator comparator, Iterable iterable) {
        Object obj;
        Objects.requireNonNull(comparator);
        Objects.requireNonNull(iterable);
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = C04890Mk.A00;
            }
        } else if (!(iterable instanceof C17830s6)) {
            return false;
        } else {
            obj = ((C04810Mc) ((C17830s6) iterable)).A02;
        }
        return comparator.equals(obj);
    }

    /* renamed from: A0G */
    public final C04810Mc subSet(Object obj, Object obj2, boolean z, boolean z2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        if (this.A02.compare(obj, obj2) <= 0) {
            C04810Mc A0F = A0F(A0C(obj, z), this.A01.size());
            return A0F.A0F(0, A0F.A0D(obj2, z2));
        }
        throw new IllegalArgumentException();
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.A01.get(0);
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        Objects.requireNonNull(obj);
        return A0F(0, A0D(obj, z));
    }

    public final Object last() {
        if (!isEmpty()) {
            AnonymousClass0MZ r1 = this.A01;
            return r1.get(r1.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Deprecated
    public final Object pollFirst() {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final Object pollLast() {
        throw AnonymousClass001.A0D();
    }

    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        Objects.requireNonNull(obj);
        return A0F(A0C(obj, z), this.A01.size());
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        Objects.requireNonNull(obj);
        return A0F(0, A0D(obj, false));
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, obj2, true, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        Objects.requireNonNull(obj);
        return A0F(A0C(obj, true), this.A01.size());
    }
}
