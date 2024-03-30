package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class AYH<T> implements List<T>, C004902e {
    public int A00;
    public int A01;
    public final int A02;
    public final AYG A03;

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

    public Object[] toArray() {
        return C07390Xl.A00(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C07390Xl.A01(this, objArr);
    }

    private final void A00() {
        if (this.A03.A02() != this.A01) {
            throw new ConcurrentModificationException();
        }
    }

    public List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw AnonymousClass001.A08("fromIndex or toIndex are out of bounds");
        }
        A00();
        AYG ayg = this.A03;
        int i3 = this.A02;
        return new AYH(ayg, i + i3, i2 + i3);
    }

    public AYH(AYG ayg, int i, int i2) {
        this.A03 = ayg;
        this.A02 = i;
        this.A01 = ayg.A02();
        this.A00 = i2 - i;
    }

    public void add(int i, Object obj) {
        A00();
        AYG ayg = this.A03;
        ayg.add(this.A02 + i, obj);
        this.A00 = size() + 1;
        this.A01 = ayg.A02();
    }

    public boolean addAll(int i, Collection collection) {
        A00();
        AYG ayg = this.A03;
        boolean addAll = ayg.addAll(i + this.A02, collection);
        if (addAll) {
            this.A00 = size() + collection.size();
            this.A01 = ayg.A02();
        }
        return addAll;
    }

    public void clear() {
        int i;
        B6U b6u;
        Snapshot A002;
        boolean z;
        if (size() > 0) {
            A00();
            AYG ayg = this.A03;
            int i2 = this.A02;
            int size = size() + i2;
            do {
                Object obj = C196369Zj.A00;
                synchronized (obj) {
                    C166677wd A0L = C165577te.A0L(ayg.A00);
                    i = A0L.A00;
                    b6u = A0L.A02;
                }
                AnonymousClass00C.A0B(b6u);
                C21921Acr B27 = b6u.B27();
                B27.subList(i2, size).clear();
                B6U A0N = B27.A0N();
                if (AnonymousClass00C.A0J(A0N, b6u)) {
                    break;
                }
                AnonymousClass666 r0 = ayg.A00;
                AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AnonymousClass6YQ.A07) {
                    A002 = AnonymousClass6YQ.A00();
                    C166677wd r2 = (C166677wd) AnonymousClass6YQ.A02(A002, ayg, r0);
                    synchronized (obj) {
                        int i3 = r2.A00;
                        z = true;
                        if (i3 == i) {
                            r2.A02 = A0N;
                            r2.A00 = i3 + 1;
                            r2.A01++;
                        } else {
                            z = false;
                        }
                    }
                }
                AnonymousClass6YQ.A0F(A002, ayg);
            } while (!z);
            this.A00 = 0;
            this.A01 = ayg.A02();
        }
    }

    public boolean contains(Object obj) {
        return C36401kF.A1U(indexOf(obj));
    }

    public Object get(int i) {
        A00();
        C196369Zj.A00(i, size());
        return this.A03.get(this.A02 + i);
    }

    public int indexOf(Object obj) {
        A00();
        int i = this.A02;
        Iterator it = C15040mb.A05(i, size() + i).iterator();
        while (it.hasNext()) {
            int A05 = C165617ti.A05(it);
            if (AnonymousClass00C.A0J(obj, this.A03.get(A05))) {
                return A05 - i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(size());
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        A00();
        int i = this.A02;
        int size = i + size();
        do {
            size--;
            if (size < i) {
                return -1;
            }
        } while (!AnonymousClass00C.A0J(obj, this.A03.get(size)));
        return size - i;
    }

    public ListIterator listIterator(int i) {
        A00();
        C10790fE r1 = new C10790fE();
        r1.element = i - 1;
        return new AYN(this, r1);
    }

    public final /* bridge */ Object remove(int i) {
        A00();
        AYG ayg = this.A03;
        Object remove = ayg.remove(this.A02 + i);
        this.A00 = size() - 1;
        this.A01 = ayg.A02();
        return remove;
    }

    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection collection) {
        int i;
        B6U b6u;
        Snapshot A002;
        boolean z;
        A00();
        AYG ayg = this.A03;
        int i2 = this.A02;
        int size = size() + i2;
        int size2 = ayg.size();
        do {
            Object obj = C196369Zj.A00;
            synchronized (obj) {
                C166677wd A0L = C165577te.A0L(ayg.A00);
                i = A0L.A00;
                b6u = A0L.A02;
            }
            AnonymousClass00C.A0B(b6u);
            C21921Acr B27 = b6u.B27();
            B27.subList(i2, size).retainAll(collection);
            B6U A0N = B27.A0N();
            if (AnonymousClass00C.A0J(A0N, b6u)) {
                break;
            }
            AnonymousClass666 r0 = ayg.A00;
            AnonymousClass00C.A0E(r0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AnonymousClass6YQ.A07) {
                A002 = AnonymousClass6YQ.A00();
                C166677wd r2 = (C166677wd) AnonymousClass6YQ.A02(A002, ayg, r0);
                synchronized (obj) {
                    int i3 = r2.A00;
                    z = true;
                    if (i3 == i) {
                        r2.A02 = A0N;
                        r2.A00 = i3 + 1;
                        r2.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            AnonymousClass6YQ.A0F(A002, ayg);
        } while (!z);
        int size3 = size2 - ayg.size();
        if (size3 <= 0) {
            return false;
        }
        this.A01 = ayg.A02();
        this.A00 = size() - size3;
        return true;
    }

    public Object set(int i, Object obj) {
        C196369Zj.A00(i, size());
        A00();
        AYG ayg = this.A03;
        Object obj2 = ayg.set(i + this.A02, obj);
        this.A01 = ayg.A02();
        return obj2;
    }

    public final /* bridge */ int size() {
        return this.A00;
    }

    public boolean add(Object obj) {
        A00();
        AYG ayg = this.A03;
        ayg.add(this.A02 + size(), obj);
        this.A00 = size() + 1;
        this.A01 = ayg.A02();
        return true;
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
