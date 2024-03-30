package X;

import java.util.ListIterator;

public class AYK implements ListIterator {
    public ListIterator A00;
    public final /* synthetic */ C21887AcF A01;

    public AYK(C21887AcF acF, int i) {
        this.A01 = acF;
        this.A00 = acF.A00.listIterator(i);
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public int nextIndex() {
        return this.A00.nextIndex();
    }

    public /* bridge */ /* synthetic */ Object previous() {
        return this.A00.previous();
    }

    public int previousIndex() {
        return this.A00.previousIndex();
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public void remove() {
        throw AnonymousClass001.A0D();
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw AnonymousClass001.A0D();
    }
}
