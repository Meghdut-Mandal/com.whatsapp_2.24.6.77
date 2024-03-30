package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MutableMapWithDefault;

/* renamed from: X.0i7  reason: invalid class name and case insensitive filesystem */
public final class C12470i7<K, V> implements MutableMapWithDefault<K, V>, AnonymousClass00W, C17930sJ {
    public final Map A00;
    public final C006302t A01;

    public void putAll(Map map) {
        AnonymousClass00C.A0D(map, 0);
        this.A00.putAll(map);
    }

    public void clear() {
        this.A00.clear();
    }

    public boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.A00.entrySet();
    }

    public boolean equals(Object obj) {
        return this.A00.equals(obj);
    }

    public Object get(Object obj) {
        return this.A00.get(obj);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return this.A00.keySet();
    }

    public Object put(Object obj, Object obj2) {
        return this.A00.put(obj, obj2);
    }

    public Object remove(Object obj) {
        return this.A00.remove(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public String toString() {
        return this.A00.toString();
    }

    public final /* bridge */ Collection values() {
        return this.A00.values();
    }

    public C12470i7(Map map, C006302t r2) {
        this.A00 = map;
        this.A01 = r2;
    }
}
