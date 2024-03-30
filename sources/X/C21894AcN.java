package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: X.AcN  reason: case insensitive filesystem */
public abstract class C21894AcN<K, V, T> extends AbstractSet<T> {
    public final C21891AcK biMap;

    public abstract Object forEntry(int i);

    public void clear() {
        this.biMap.clear();
    }

    public Iterator iterator() {
        return new AY6(this);
    }

    public int size() {
        return this.biMap.size;
    }

    public C21894AcN(C21891AcK acK) {
        this.biMap = acK;
    }
}
