package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Objects;

/* renamed from: X.0y6  reason: invalid class name and case insensitive filesystem */
public abstract class C20750y6<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] EMPTY_ARRAY = new Object[0];

    public abstract C23931Ak asList();

    public abstract boolean contains(Object obj);

    public abstract int copyIntoArray(Object[] objArr, int i);

    public Object[] internalArray() {
        return null;
    }

    public abstract boolean isPartialView();

    public abstract C225614x iterator();

    public abstract Object writeReplace();

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return C201739kJ.copy(internalArray, internalArrayStart(), internalArrayEnd(), objArr);
            }
            objArr = C23921Aj.newArray(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        copyIntoArray(objArr, 0);
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }
}
