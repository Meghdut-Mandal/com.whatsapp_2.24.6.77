package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0k0  reason: invalid class name and case insensitive filesystem */
public final class C13520k0<V> extends C13320jg<V> implements Collection<V>, AnonymousClass00Y {
    public final C12460i5 A00;

    public boolean removeAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        this.A00.A05();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        this.A00.A05();
        return super.retainAll(collection);
    }

    public int A00() {
        return this.A00.size();
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new C13670kF(this.A00);
    }

    public boolean remove(Object obj) {
        C12460i5 r2 = this.A00;
        r2.A05();
        int i = r2.length;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            if (r2.presenceArray[i] >= 0) {
                Object[] objArr = r2.valuesArray;
                AnonymousClass00C.A0B(objArr);
                if (AnonymousClass00C.A0J(objArr[i], obj)) {
                    C12460i5.A03(r2, i);
                    return true;
                }
            }
        }
    }

    public C13520k0(C12460i5 r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass001.A0D();
    }
}
