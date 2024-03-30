package X;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.79f  reason: invalid class name and case insensitive filesystem */
public final class C1513579f<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {
    public final C1513479e A00;

    public int A00() {
        return this.A00.size();
    }

    public void clear() {
        this.A00.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        C1513479e r2 = this.A00;
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
        return new AYE(this.A00);
    }

    public final /* bridge */ boolean remove(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        return this.A00.remove(entry.getKey(), entry.getValue());
    }

    public C1513579f(C1513479e r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public C1513579f() {
    }
}
