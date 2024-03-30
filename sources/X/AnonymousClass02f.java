package X;

import java.util.AbstractList;
import java.util.List;

/* renamed from: X.02f  reason: invalid class name */
public abstract class AnonymousClass02f<E> extends AbstractList<E> implements List<E>, C004902e {
    public abstract int A0K();

    public abstract Object A0L(int i);

    public abstract void add(int i, Object obj);

    public abstract Object set(int i, Object obj);

    public final /* bridge */ Object remove(int i) {
        return A0L(i);
    }

    public final /* bridge */ int size() {
        return A0K();
    }
}
