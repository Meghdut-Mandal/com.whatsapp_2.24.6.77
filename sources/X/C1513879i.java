package X;

import java.util.Iterator;

/* renamed from: X.79i  reason: invalid class name and case insensitive filesystem */
public final class C1513879i<K, V> extends C13450jt<K> implements C17860sB<K> {
    public final C1513279c A00;

    public int A08() {
        return this.A00.size();
    }

    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public Iterator iterator() {
        return new C166587wU(this.A00.A00);
    }

    public C1513879i(C1513279c r1) {
        this.A00 = r1;
    }
}
