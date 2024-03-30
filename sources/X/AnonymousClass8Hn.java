package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;

/* renamed from: X.8Hn  reason: invalid class name */
public abstract class AnonymousClass8Hn<E> extends C170808Ho<E> implements NavigableSet<E>, B6Q<E> {
    public final transient Comparator comparator;
    public transient AnonymousClass8Hn descendingSet;

    public abstract Object ceiling(Object obj);

    public abstract AnonymousClass8Hn createDescendingSet();

    public abstract /* bridge */ /* synthetic */ Iterator descendingIterator();

    public abstract Object first();

    public abstract Object floor(Object obj);

    public abstract AnonymousClass8Hn headSetImpl(Object obj, boolean z);

    public abstract Object higher(Object obj);

    public abstract Object last();

    public abstract Object lower(Object obj);

    public AnonymousClass8Hn subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract AnonymousClass8Hn subSetImpl(Object obj, boolean z, Object obj2, boolean z2);

    public abstract AnonymousClass8Hn tailSetImpl(Object obj, boolean z);

    public static AnonymousClass8Hn construct(Comparator comparator2, int i, Object... objArr) {
        if (i == 0) {
            return emptySet(comparator2);
        }
        C23921Aj.checkElementsNotNull(objArr, i);
        Arrays.sort(objArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator2.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        AnonymousClass8Hm r0 = AnonymousClass8Hm.NATURAL_EMPTY_SET;
        return new AnonymousClass8Hm(C23931Ak.asImmutableList(objArr, i2), comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public AnonymousClass8Hn descendingSet() {
        AnonymousClass8Hn r0 = this.descendingSet;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass8Hn createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    public Object writeReplace() {
        return new AUH(this.comparator, toArray());
    }

    public AnonymousClass8Hn(Comparator comparator2) {
        this.comparator = comparator2;
    }

    public static AnonymousClass8Hm emptySet(Comparator comparator2) {
        if (AXU.natural().equals(comparator2)) {
            return AnonymousClass8Hm.NATURAL_EMPTY_SET;
        }
        AnonymousClass8Hm r0 = AnonymousClass8Hm.NATURAL_EMPTY_SET;
        return new AnonymousClass8Hm(C23931Ak.of(), comparator2);
    }

    public Comparator comparator() {
        return this.comparator;
    }

    public AnonymousClass8Hn headSet(Object obj, boolean z) {
        Objects.requireNonNull(obj);
        return headSetImpl(obj, z);
    }

    @Deprecated
    public final Object pollFirst() {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final Object pollLast() {
        throw AnonymousClass001.A0D();
    }

    public AnonymousClass8Hn tailSet(Object obj, boolean z) {
        Objects.requireNonNull(obj);
        return tailSetImpl(obj, z);
    }

    public static int unsafeCompare(Comparator comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    public AnonymousClass8Hn headSet(Object obj) {
        return headSet(obj, false);
    }

    public AnonymousClass8Hn subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        C20740y5.A06(C90484aE.A1Q(this.comparator.compare(obj, obj2)));
        return subSetImpl(obj, z, obj2, z2);
    }

    public AnonymousClass8Hn tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
