package X;

import java.util.ListIterator;

/* renamed from: X.0i0  reason: invalid class name and case insensitive filesystem */
public final class C12410i0 implements ListIterator {
    public final ListIterator A00;
    public final /* synthetic */ C13340ji A01;

    public C12410i0(C13340ji r2, int i) {
        this.A01 = r2;
        this.A00 = r2.A00.listIterator(i);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    public final /* synthetic */ void add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }

    public final /* synthetic */ void set(Object obj) {
        throw AnonymousClass001.A0D();
    }
}
