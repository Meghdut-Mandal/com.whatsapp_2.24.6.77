package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: X.0jf  reason: invalid class name and case insensitive filesystem */
public abstract class C13310jf extends AbstractCollection implements Serializable {
    public static final Object[] A00 = new Object[0];

    public abstract C12200hf A07();

    public Object[] A08() {
        return null;
    }

    public abstract boolean contains(Object obj);

    public int A04() {
        throw AnonymousClass001.A0D();
    }

    public int A05() {
        throw AnonymousClass001.A0D();
    }

    public int A06(Object[] objArr, int i) {
        C12200hf A07 = A07();
        int i2 = 0;
        while (A07.hasNext()) {
            objArr[i2] = A07.next();
            i2++;
        }
        return i2;
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final void clear() {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw AnonymousClass001.A0D();
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A08 = A08();
            if (A08 != null) {
                return Arrays.copyOfRange(A08, A05(), A04(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        A06(objArr, 0);
        return objArr;
    }

    public final Object[] toArray() {
        return toArray(A00);
    }
}
