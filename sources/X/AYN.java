package X;

import java.util.ListIterator;

public final class AYN implements ListIterator, AnonymousClass00W {
    public final /* synthetic */ AYH A00;
    public final /* synthetic */ C10790fE A01;

    public AYN(AYH ayh, C10790fE r2) {
        this.A01 = r2;
        this.A00 = ayh;
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw AnonymousClass001.A09("Cannot modify a state list through an iterator");
    }

    public boolean hasNext() {
        if (this.A01.element >= this.A00.size() - 1) {
            return false;
        }
        return true;
    }

    public boolean hasPrevious() {
        return C36401kF.A1U(this.A01.element);
    }

    public Object next() {
        C10790fE r3 = this.A01;
        int i = r3.element + 1;
        AYH ayh = this.A00;
        C196369Zj.A00(i, ayh.size());
        r3.element = i;
        return ayh.get(i);
    }

    public int nextIndex() {
        return this.A01.element + 1;
    }

    public Object previous() {
        C10790fE r3 = this.A01;
        int i = r3.element;
        AYH ayh = this.A00;
        C196369Zj.A00(i, ayh.size());
        r3.element = i - 1;
        return ayh.get(i);
    }

    public int previousIndex() {
        return this.A01.element;
    }

    public /* bridge */ /* synthetic */ void remove() {
        throw AnonymousClass001.A09("Cannot modify a state list through an iterator");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw AnonymousClass001.A09("Cannot modify a state list through an iterator");
    }
}
