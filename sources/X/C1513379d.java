package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.79d  reason: invalid class name and case insensitive filesystem */
public final class C1513379d<K, V> extends C13320jg<V> implements Collection<V>, AnonymousClass00Y {
    public final C1513479e A00;

    public int A00() {
        return this.A00.size();
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public Iterator iterator() {
        return new C166617wX(this.A00);
    }

    public C1513379d(C1513479e r1) {
        this.A00 = r1;
    }

    public boolean add(Object obj) {
        throw AnonymousClass001.A0D();
    }
}
