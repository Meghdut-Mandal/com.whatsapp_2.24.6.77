package X;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Ac8  reason: case insensitive filesystem */
public abstract class C21882Ac8<E> extends AbstractList<E> implements C23120B6a<E> {
    public boolean A00 = true;

    public boolean add(Object obj) {
        A01();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        A01();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        A01();
        return super.addAll(collection);
    }

    public void clear() {
        A01();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                if (!(obj instanceof RandomAccess)) {
                    return super.equals(obj);
                }
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    int i = 0;
                    while (i < size) {
                        if (get(i).equals(list.get(i))) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean remove(Object obj) {
        A01();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        A01();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        A01();
        return super.retainAll(collection);
    }

    public final void A01() {
        if (!this.A00) {
            throw AnonymousClass001.A0D();
        }
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = C36401kF.A02(get(i2), i * 31);
        }
        return i;
    }
}
