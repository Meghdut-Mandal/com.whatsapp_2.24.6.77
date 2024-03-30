package X;

import java.util.Set;

/* renamed from: X.76g  reason: invalid class name and case insensitive filesystem */
public abstract class C1506976g<K, V, E> implements Set<E>, AnonymousClass00Z {
    public final C1506676d A00;

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public C1506976g(C1506676d r1) {
        this.A00 = r1;
    }
}
