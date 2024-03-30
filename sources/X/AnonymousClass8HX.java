package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8HX  reason: invalid class name */
public abstract class AnonymousClass8HX<E> extends AnonymousClass9TF implements Collection<E> {
    public abstract boolean add(Object obj);

    public abstract boolean addAll(Collection collection);

    public abstract Collection delegate();

    public void clear() {
        delegate().clear();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return delegate().containsAll(collection);
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator iterator() {
        return delegate().iterator();
    }

    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return delegate().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return delegate().retainAll(collection);
    }

    public int size() {
        return delegate().size();
    }

    public boolean standardAddAll(Collection collection) {
        return C225414v.addAll(this, collection.iterator());
    }

    public Object[] toArray(Object[] objArr) {
        return delegate().toArray(objArr);
    }

    public Object[] toArray() {
        return delegate().toArray();
    }
}
