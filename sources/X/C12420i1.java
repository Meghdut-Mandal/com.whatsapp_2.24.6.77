package X;

import java.util.ListIterator;

/* renamed from: X.0i1  reason: invalid class name and case insensitive filesystem */
public final class C12420i1 implements ListIterator, AnonymousClass00W {
    public final ListIterator A00;
    public final /* synthetic */ C13530k1 A01;

    public C12420i1(C13530k1 r3, int i) {
        this.A01 = r3;
        this.A00 = r3.A00.listIterator(AnonymousClass03Z.A0G(r3, i));
    }

    public void add(Object obj) {
        ListIterator listIterator = this.A00;
        listIterator.add(obj);
        listIterator.previous();
    }

    public boolean hasNext() {
        return this.A00.hasPrevious();
    }

    public boolean hasPrevious() {
        return this.A00.hasNext();
    }

    public Object next() {
        return this.A00.previous();
    }

    public int nextIndex() {
        C13530k1 r2 = this.A01;
        return (r2.size() - 1) - this.A00.previousIndex();
    }

    public Object previous() {
        return this.A00.next();
    }

    public int previousIndex() {
        C13530k1 r2 = this.A01;
        return (r2.size() - 1) - this.A00.nextIndex();
    }

    public void remove() {
        this.A00.remove();
    }

    public void set(Object obj) {
        this.A00.set(obj);
    }
}
