package X;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0k1  reason: invalid class name and case insensitive filesystem */
public final class C13530k1<T> extends AnonymousClass02f<T> {
    public final List A00;

    public Iterator iterator() {
        return listIterator(0);
    }

    public int A0K() {
        return this.A00.size();
    }

    public Object A0L(int i) {
        return this.A00.remove(AnonymousClass03Z.A0F(this, i));
    }

    public void add(int i, Object obj) {
        this.A00.add(AnonymousClass03Z.A0G(this, i), obj);
    }

    public void clear() {
        this.A00.clear();
    }

    public Object get(int i) {
        return this.A00.get(AnonymousClass03Z.A0F(this, i));
    }

    public ListIterator listIterator(int i) {
        return new C12420i1(this, i);
    }

    public Object set(int i, Object obj) {
        return this.A00.set(AnonymousClass03Z.A0F(this, i), obj);
    }

    public C13530k1(List list) {
        this.A00 = list;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
