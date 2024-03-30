package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Acq  reason: case insensitive filesystem */
public abstract class C21920Acq<E> extends C001100m<E> implements B6U<E> {
    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new C21919Acp(this, i, i2);
    }

    public boolean contains(Object obj) {
        return C36381kD.A1U(indexOf(obj), -1);
    }

    public Iterator iterator() {
        return listIterator();
    }
}
