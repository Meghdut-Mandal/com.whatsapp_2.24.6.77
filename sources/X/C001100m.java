package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.00m  reason: invalid class name and case insensitive filesystem */
public abstract class C001100m<E> extends C001000l<E> implements List<E>, AnonymousClass00W {
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract Object get(int i);

    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        AnonymousClass00C.A0D(collection, 1);
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            if (!AnonymousClass00C.A0J(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator iterator() {
        return new C12290ho(this);
    }

    public ListIterator listIterator(int i) {
        return new C13490jx(this, i);
    }

    public List subList(int i, int i2) {
        return new C13500jy(this, i, i2);
    }

    public int hashCode() {
        int i;
        Iterator it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (AnonymousClass00C.A0J(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AnonymousClass00C.A0J(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C13490jx(this, 0);
    }
}
