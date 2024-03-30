package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0hW  reason: invalid class name and case insensitive filesystem */
public final class C12110hW implements Collection<V> {
    public final /* synthetic */ AnonymousClass008 A00;

    public C12110hW(AnonymousClass008 r1) {
        this.A00 = r1;
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        if (this.A00.A03(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new AnonymousClass0G4(this.A00);
    }

    public boolean remove(Object obj) {
        AnonymousClass008 r1 = this.A00;
        int A03 = r1.A03(obj);
        if (A03 < 0) {
            return false;
        }
        r1.A05(A03);
        return true;
    }

    public boolean removeAll(Collection collection) {
        AnonymousClass008 r4 = this.A00;
        int size = r4.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (collection.contains(r4.A06(i))) {
                r4.A05(i);
                i--;
                size--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        AnonymousClass008 r4 = this.A00;
        int size = r4.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (!collection.contains(r4.A06(i))) {
                r4.A05(i);
                i--;
                size--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public int size() {
        return this.A00.size();
    }

    public boolean add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass001.A0D();
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = this.A00.A06(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public Object[] toArray() {
        AnonymousClass008 r4 = this.A00;
        int size = r4.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = r4.A06(i);
        }
        return objArr;
    }
}
