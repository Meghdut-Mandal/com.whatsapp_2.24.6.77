package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0k4  reason: invalid class name and case insensitive filesystem */
public final class C13560k4<E> extends C13370jl<E> implements Set<E>, Serializable, AnonymousClass00Z {
    public static final C13560k4 A00 = new C13560k4(C12460i5.A00);
    public final C12460i5 backing;

    public C13560k4(C12460i5 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.backing = r2;
    }

    public boolean addAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        this.backing.A05();
        return super.addAll(collection);
    }

    public boolean removeAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        this.backing.A05();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        this.backing.A05();
        return super.retainAll(collection);
    }

    private final Object writeReplace() {
        if (this.backing.isReadOnly) {
            return new C10760fB(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public int A00() {
        return this.backing.size();
    }

    public boolean add(Object obj) {
        if (this.backing.A04(obj) >= 0) {
            return true;
        }
        return false;
    }

    public void clear() {
        this.backing.clear();
    }

    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public Iterator iterator() {
        return new C13660kE(this.backing);
    }

    public boolean remove(Object obj) {
        C12460i5 r1 = this.backing;
        r1.A05();
        int A002 = C12460i5.A00(obj, r1);
        if (A002 < 0) {
            return false;
        }
        C12460i5.A03(r1, A002);
        return true;
    }

    public C13560k4() {
        this(new C12460i5());
    }
}
