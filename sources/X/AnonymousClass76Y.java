package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.76Y  reason: invalid class name */
public final class AnonymousClass76Y<T> implements List<T>, C004902e {
    public final C1506776e A00;

    public Iterator iterator() {
        return new C1506376a(this, 0);
    }

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    public boolean add(Object obj) {
        return this.A00.A0D(obj);
    }

    public boolean addAll(Collection collection) {
        C1506776e r1 = this.A00;
        return r1.A0C(r1.A00, collection);
    }

    public void clear() {
        this.A00.A06();
    }

    public boolean contains(Object obj) {
        return this.A00.A0E(obj);
    }

    public boolean containsAll(Collection collection) {
        C1506776e r2 = this.A00;
        for (Object A0E : collection) {
            if (!r2.A0E(A0E)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(Object obj) {
        C1506776e r0 = this.A00;
        int i = r0.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = r0.A01;
            while (!AnonymousClass00C.A0J(obj, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                }
            }
            return i2;
        }
        return -1;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(this.A00.A00);
    }

    public int lastIndexOf(Object obj) {
        C1506776e r1 = this.A00;
        int i = r1.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = r1.A01;
            while (!AnonymousClass00C.A0J(obj, objArr[i2])) {
                i2--;
                if (i2 < 0) {
                }
            }
            return i2;
        }
        return -1;
    }

    public ListIterator listIterator(int i) {
        return new C1506376a(this, i);
    }

    public boolean removeAll(Collection collection) {
        C1506776e r4 = this.A00;
        if (collection.isEmpty()) {
            return false;
        }
        int i = r4.A00;
        for (Object A0F : collection) {
            r4.A0F(A0F);
        }
        if (i != r4.A00) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection collection) {
        C1506776e r4 = this.A00;
        int i = r4.A00;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(r4.A01[i2])) {
                r4.A04(i2);
            }
        }
        if (i == r4.A00) {
            return false;
        }
        return true;
    }

    public final /* bridge */ int size() {
        return this.A00.A00;
    }

    public AnonymousClass76Y(C1506776e r1) {
        this.A00 = r1;
    }

    public Object get(int i) {
        AnonymousClass6G4.A00(this, i);
        return this.A00.A01[i];
    }

    public final /* bridge */ Object remove(int i) {
        AnonymousClass6G4.A00(this, i);
        return this.A00.A04(i);
    }

    public Object set(int i, Object obj) {
        AnonymousClass6G4.A00(this, i);
        Object[] objArr = this.A00.A01;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public List subList(int i, int i2) {
        AnonymousClass6G4.A01(this, i, i2);
        return new AnonymousClass76Z(this, i, i2);
    }

    public void add(int i, Object obj) {
        this.A00.A09(i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        return this.A00.A0C(i, collection);
    }

    public ListIterator listIterator() {
        return new C1506376a(this, 0);
    }

    public boolean remove(Object obj) {
        return this.A00.A0F(obj);
    }
}
