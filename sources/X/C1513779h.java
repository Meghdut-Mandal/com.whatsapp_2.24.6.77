package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.79h  reason: invalid class name and case insensitive filesystem */
public final class C1513779h<K, V> extends C13450jt<Map.Entry<? extends K, ? extends V>> implements C17860sB<Map.Entry<? extends K, ? extends V>> {
    public final C1513279c A00;

    public int A08() {
        return this.A00.size();
    }

    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        C1513279c r2 = this.A00;
        Object obj2 = r2.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != null) {
            return obj2.equals(value);
        }
        if (value != null || !r2.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return new C166577wT(this.A00.A00);
    }

    public C1513779h(C1513279c r1) {
        this.A00 = r1;
    }
}
