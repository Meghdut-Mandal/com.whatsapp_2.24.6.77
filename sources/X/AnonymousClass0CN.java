package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0CN  reason: invalid class name */
public final class AnonymousClass0CN<T> implements Collection<T>, AnonymousClass00W {
    public final Object[] A00;
    public final boolean A01;

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        return C07390Xl.A01(this, objArr);
    }

    public boolean contains(Object obj) {
        return AnonymousClass02R.A0F(obj, this.A00);
    }

    public boolean isEmpty() {
        if (this.A00.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new C12310hq(this.A00);
    }

    public final /* bridge */ int size() {
        return this.A00.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.A00;
        if (this.A01 && AnonymousClass00C.A0J(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AnonymousClass00C.A08(copyOf);
        return copyOf;
    }

    public AnonymousClass0CN(Object[] objArr, boolean z) {
        this.A00 = objArr;
        this.A01 = z;
    }
}
