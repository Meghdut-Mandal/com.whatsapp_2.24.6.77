package X;

import java.util.ListIterator;

public final class AYI implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ C21883Ac9 A01;

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

    public AYI(C21883Ac9 ac9, int i) {
        this.A01 = ac9;
        this.A00 = ac9.A00.listIterator(i);
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
