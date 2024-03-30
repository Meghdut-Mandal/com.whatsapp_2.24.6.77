package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.0i2  reason: invalid class name and case insensitive filesystem */
public final class C12430i2 implements ListIterator, AnonymousClass00W {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final C13540k2 A03;

    private final void A00() {
        if (this.A03.modCount != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        int i = this.A01;
        C13540k2 r1 = this.A03;
        C13540k2 r0 = C13540k2.A00;
        return AnonymousClass000.A1T(i, r1.length);
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A01);
    }

    public int previousIndex() {
        return this.A01 - 1;
    }

    public C12430i2(C13540k2 r2, int i) {
        this.A03 = r2;
        this.A01 = i;
        this.A00 = r2.modCount;
    }

    public void add(Object obj) {
        A00();
        C13540k2 r2 = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        r2.add(i, obj);
        this.A02 = -1;
        this.A00 = r2.modCount;
    }

    public Object next() {
        A00();
        int i = this.A01;
        C13540k2 r2 = this.A03;
        C13540k2 r0 = C13540k2.A00;
        if (i < r2.length) {
            this.A01 = i + 1;
            this.A02 = i;
            return r2.array[r2.offset + i];
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        A00();
        int i = this.A01;
        if (i > 0) {
            int i2 = i - 1;
            this.A01 = i2;
            this.A02 = i2;
            C13540k2 r2 = this.A03;
            C13540k2 r0 = C13540k2.A00;
            return r2.array[r2.offset + i2];
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        A00();
        int i = this.A02;
        if (i != -1) {
            C13540k2 r1 = this.A03;
            r1.remove(i);
            this.A01 = this.A02;
            this.A02 = -1;
            this.A00 = r1.modCount;
            return;
        }
        throw AnonymousClass001.A09("Call next() or previous() before removing element from the iterator.");
    }

    public void set(Object obj) {
        A00();
        int i = this.A02;
        if (i != -1) {
            this.A03.set(i, obj);
            return;
        }
        throw AnonymousClass001.A09("Call next() or previous() before replacing element from the iterator.");
    }

    public int nextIndex() {
        return this.A01;
    }
}
