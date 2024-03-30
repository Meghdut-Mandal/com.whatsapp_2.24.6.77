package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AcR  reason: case insensitive filesystem */
public class C21897AcR extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C21889AcH A00;

    public C21897AcR(C21889AcH acH) {
        this.A00 = acH;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.A00.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.A00.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null || !obj2.equals(value)) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return new AY2(this.A00);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.A00.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.A00.size();
    }
}
