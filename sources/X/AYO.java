package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

public final class AYO implements ListIterator, AnonymousClass00W {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final AYG A03;

    private final void A00() {
        if (this.A03.A02() != this.A02) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        if (this.A00 >= this.A03.size() - 1) {
            return false;
        }
        return true;
    }

    public boolean hasPrevious() {
        return C36401kF.A1U(this.A00);
    }

    public int nextIndex() {
        return this.A00 + 1;
    }

    public AYO(AYG ayg, int i) {
        this.A03 = ayg;
        this.A00 = i - 1;
        this.A02 = ayg.A02();
    }

    public void add(Object obj) {
        A00();
        AYG ayg = this.A03;
        ayg.add(this.A00 + 1, obj);
        this.A01 = -1;
        this.A00++;
        this.A02 = ayg.A02();
    }

    public Object next() {
        A00();
        int i = this.A00 + 1;
        this.A01 = i;
        AYG ayg = this.A03;
        C196369Zj.A00(i, ayg.size());
        Object obj = ayg.get(i);
        this.A00 = i;
        return obj;
    }

    public Object previous() {
        A00();
        int i = this.A00;
        AYG ayg = this.A03;
        C196369Zj.A00(i, ayg.size());
        int i2 = this.A00;
        this.A01 = i2;
        this.A00--;
        return ayg.get(i2);
    }

    public int previousIndex() {
        return this.A00;
    }

    public void remove() {
        A00();
        AYG ayg = this.A03;
        ayg.remove(this.A00);
        this.A00--;
        this.A01 = -1;
        this.A02 = ayg.A02();
    }

    public void set(Object obj) {
        A00();
        int i = this.A01;
        if (i >= 0) {
            AYG ayg = this.A03;
            ayg.set(i, obj);
            this.A02 = ayg.A02();
            return;
        }
        throw AnonymousClass001.A09("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }
}
