package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0jj  reason: invalid class name and case insensitive filesystem */
public abstract class C13350jj<K, V> extends AbstractMap<K, V> implements Map<K, V>, C17930sJ {
    public abstract /* bridge */ int A00();

    public abstract /* bridge */ Collection A01();

    public abstract Set A02();

    public abstract /* bridge */ Set A03();

    public abstract Object put(Object obj, Object obj2);

    public final /* bridge */ Set entrySet() {
        return A02();
    }

    public final /* bridge */ Set keySet() {
        return A03();
    }

    public final /* bridge */ int size() {
        return A00();
    }

    public final /* bridge */ Collection values() {
        return A01();
    }
}
