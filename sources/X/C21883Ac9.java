package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Ac9  reason: case insensitive filesystem */
public final class C21883Ac9 extends AbstractList<String> implements B6W, RandomAccess {
    public final B6W A00;

    public C21883Ac9(B6W b6w) {
        this.A00 = b6w;
    }

    public final Object BGR(int i) {
        return this.A00.BGR(i);
    }

    public final List Byb() {
        return this.A00.Byb();
    }

    public final B6W Byc() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final Iterator iterator() {
        return new C21719AXu(this);
    }

    public final ListIterator listIterator(int i) {
        return new AYI(this, i);
    }

    public final int size() {
        return this.A00.size();
    }
}
