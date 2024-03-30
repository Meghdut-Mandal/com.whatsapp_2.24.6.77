package X;

import java.util.ListIterator;

public final class AYJ implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ C21885AcB A01;

    public AYJ(C21885AcB acB, int i) {
        this.A01 = acB;
        this.A00 = acB.A00.listIterator(i);
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    public final /* synthetic */ Object previous() {
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
