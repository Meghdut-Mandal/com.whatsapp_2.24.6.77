package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.00l  reason: invalid class name and case insensitive filesystem */
public abstract class C001000l<E> implements Collection<E>, AnonymousClass00W {
    public abstract int A08();

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

    public abstract Iterator iterator();

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
        if (!(this instanceof Collection) || !isEmpty()) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (AnonymousClass00C.A0J(it.next(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return C007103b.A0Q(", ", "[", "]", this, new C14570lq(this));
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ int size() {
        return A08();
    }

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }
}
