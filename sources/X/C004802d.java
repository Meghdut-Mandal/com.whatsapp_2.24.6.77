package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.02d  reason: invalid class name and case insensitive filesystem */
public final class C004802d implements ListIterator, AnonymousClass00W {
    public static final C004802d A00 = new C004802d();

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    public /* bridge */ /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }
}
