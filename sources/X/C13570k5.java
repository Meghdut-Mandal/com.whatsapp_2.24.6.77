package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0k5  reason: invalid class name and case insensitive filesystem */
public final class C13570k5<E> extends C13370jl<E> implements Set<E>, AnonymousClass00Z {
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
        return this.A00.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new C13660kE(this.A00);
    }

    public boolean remove(Object obj) {
        C12460i5 r1 = this.A00;
        r1.A05();
        int A002 = C12460i5.A00(obj, r1);
        if (A002 < 0) {
            return false;
        }
        C12460i5.A03(r1, A002);
        return true;
    }

    public C13570k5(C12460i5 r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass001.A0D();
    }
}
