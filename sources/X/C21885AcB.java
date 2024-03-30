package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.AcB  reason: case insensitive filesystem */
public final class C21885AcB extends AbstractList<String> implements B6X, RandomAccess {
    public final B6X A00;

    public final B6X Bym() {
        return this;
    }

    public final Object ByU(int i) {
        return this.A00.ByU(i);
    }

    public final List Byi() {
        return this.A00.Byi();
    }

    public final /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final Iterator iterator() {
        return new C21720AXv(this);
    }

    public final ListIterator listIterator(int i) {
        return new AYJ(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C21885AcB(B6X b6x) {
        this.A00 = b6x;
    }

    public final void ByG(C21673AUw aUw) {
        throw AnonymousClass001.A0D();
    }
}
