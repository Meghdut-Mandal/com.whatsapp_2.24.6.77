package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.AcF  reason: case insensitive filesystem */
public class C21887AcF extends AbstractList<String> implements B6Z, RandomAccess {
    public final B6Z A00;

    public B6Z BIh() {
        return this;
    }

    public Object BGR(int i) {
        return this.A00.BGR(i);
    }

    public List BIg() {
        return this.A00.BIg();
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public Iterator iterator() {
        return new C21722AXz(this);
    }

    public ListIterator listIterator(int i) {
        return new AYK(this, i);
    }

    public int size() {
        return this.A00.size();
    }

    public C21887AcF(B6Z b6z) {
        this.A00 = b6z;
    }

    public void B0D(C21674AUx aUx) {
        throw AnonymousClass001.A0D();
    }
}
