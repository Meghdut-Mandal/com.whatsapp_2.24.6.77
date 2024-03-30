package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.AbstractMapBuilderEntrySet;

/* renamed from: X.0k3  reason: invalid class name and case insensitive filesystem */
public final class C13550k3<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {
    public final C12460i5 A00;

    public boolean containsAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        C12460i5 r2 = this.A00;
        for (Object next : collection) {
            if (next == null) {
                return false;
            }
            try {
                if (!r2.A06((Map.Entry) next)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractSet, X.0k3] */
    public boolean removeAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        this.A00.A05();
        return C13550k3.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, X.0k3] */
    public boolean retainAll(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        this.A00.A05();
        return C13550k3.super.retainAll(collection);
    }

    public int A00() {
        return this.A00.size();
    }

    public void clear() {
        this.A00.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        AnonymousClass00C.A0D(entry, 0);
        return this.A00.A06(entry);
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Iterator iterator() {
        return new C13650kD(this.A00);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        AnonymousClass00C.A0D(entry, 0);
        C12460i5 r3 = this.A00;
        r3.A05();
        int A002 = C12460i5.A00(entry.getKey(), r3);
        if (A002 < 0) {
            return false;
        }
        Object[] objArr = r3.valuesArray;
        AnonymousClass00C.A0B(objArr);
        if (!AnonymousClass00C.A0J(objArr[A002], entry.getValue())) {
            return false;
        }
        C12460i5.A03(r3, A002);
        return true;
    }

    public C13550k3(C12460i5 r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public boolean addAll(Collection collection) {
        throw AnonymousClass001.A0D();
    }

    public C13550k3() {
    }
}
