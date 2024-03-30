package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.79g  reason: invalid class name and case insensitive filesystem */
public final class C1513679g<K, V> extends C13370jl<K> implements Set<K>, AnonymousClass00Z {
    public final C1513479e A00;

    public int A00() {
        return this.A00.size();
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public Iterator iterator() {
        return new C166607wW(this.A00);
    }

    public boolean remove(Object obj) {
        C1513479e r1 = this.A00;
        if (!r1.containsKey(obj)) {
            return false;
        }
        r1.remove(obj);
        return true;
    }

    public C1513679g(C1513479e r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw AnonymousClass001.A0D();
    }
}
