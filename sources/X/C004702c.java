package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.02c  reason: invalid class name and case insensitive filesystem */
public final class C004702c implements Set, Serializable, AnonymousClass00W {
    public static final C004702c A00 = new C004702c();
    public static final long serialVersionUID = 3406603774387020532L;

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        return collection.isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
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

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        AnonymousClass00C.A0D(objArr, 0);
        return C07390Xl.A01(this, objArr);
    }

    public String toString() {
        return "[]";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    private final Object readResolve() {
        return A00;
    }

    public Iterator iterator() {
        return C004802d.A00;
    }

    public final /* bridge */ int size() {
        return 0;
    }
}
