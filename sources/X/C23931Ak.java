package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.1Ak  reason: invalid class name and case insensitive filesystem */
public abstract class C23931Ak<E> extends C20750y6<E> implements List<E>, RandomAccess {
    public static final AnonymousClass152 EMPTY_ITR = new C23951Am(C23941Al.EMPTY, 0);

    public static C23931Ak asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static C23931Ak of(Object obj, Object obj2, Object obj3) {
        return construct(obj, obj2, obj3);
    }

    @Deprecated
    public final C23931Ak asList() {
        return this;
    }

    public C23931Ak subListUnchecked(int i, int i2) {
        return new AnonymousClass8He(this, i, i2 - i);
    }

    public static AnonymousClass8Hc builder() {
        return new AnonymousClass8Hc();
    }

    public static C23931Ak copyOf(Collection collection) {
        if (!(collection instanceof C20750y6)) {
            return construct(collection.toArray());
        }
        C23931Ak asList = ((C20750y6) collection).asList();
        if (asList.isPartialView()) {
            return asImmutableList(asList.toArray());
        }
        return asList;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AnonymousClass6XV.indexOfImpl(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AnonymousClass6XV.lastIndexOfImpl(this, obj);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static C23931Ak construct(Object... objArr) {
        C23921Aj.checkElementsNotNull(objArr);
        return asImmutableList(objArr);
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        return AnonymousClass6XV.equalsImpl(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public C225614x iterator() {
        return listIterator();
    }

    public AnonymousClass152 listIterator(int i) {
        C20740y5.A02(i, size());
        if (isEmpty()) {
            return EMPTY_ITR;
        }
        return new C23951Am(this, i);
    }

    public C23931Ak reverse() {
        if (size() <= 1) {
            return this;
        }
        return new AnonymousClass8Hf(this);
    }

    public C23931Ak subList(int i, int i2) {
        C20740y5.A03(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return subListUnchecked(i, i2);
    }

    public Object writeReplace() {
        return new AUG(toArray());
    }

    public static C23931Ak asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return of();
        }
        return new C23941Al(objArr, i);
    }

    public static C23931Ak copyOf(Object[] objArr) {
        if (objArr.length == 0) {
            return of();
        }
        return construct((Object[]) objArr.clone());
    }

    public static C23931Ak of(Object obj, Object obj2) {
        return construct(obj, obj2);
    }

    public static C23931Ak of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(obj, obj2, obj3, obj4, obj5);
    }

    public static C23931Ak of(Object obj, Object obj2, Object obj3, Object obj4) {
        return construct(obj, obj2, obj3, obj4);
    }

    public AnonymousClass152 listIterator() {
        return listIterator(0);
    }

    public static C23931Ak of(Object obj) {
        return construct(obj);
    }

    public static C23931Ak of() {
        return C23941Al.EMPTY;
    }
}
