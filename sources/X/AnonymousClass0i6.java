package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0i6  reason: invalid class name */
public abstract class AnonymousClass0i6<K, V> implements Map<K, V>, AnonymousClass00W {
    public abstract int A00();

    public abstract C17860sB A01();

    public abstract Collection A02();

    public abstract Set A03();

    public abstract boolean containsKey(Object obj);

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    Set entrySet = map.entrySet();
                    if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                        Iterator it = entrySet.iterator();
                        while (it.hasNext()) {
                            Map.Entry A11 = AnonymousClass000.A11(it);
                            if (A11 == null) {
                                return false;
                            }
                            Object key = A11.getKey();
                            Object value = A11.getValue();
                            Object obj2 = get(key);
                            if (!AnonymousClass00C.A0J(value, obj2)) {
                                return false;
                            }
                            if (obj2 == null && !containsKey(key)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object get(Object obj);

    public void clear() {
        throw AnonymousClass000.A0x();
    }

    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                if (AnonymousClass00C.A0J(AnonymousClass000.A11(it).getValue(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final /* bridge */ Set entrySet() {
        return A01();
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(size());
    }

    public final /* bridge */ Set keySet() {
        return A03();
    }

    public Object put(Object obj, Object obj2) {
        throw AnonymousClass000.A0x();
    }

    public void putAll(Map map) {
        throw AnonymousClass000.A0x();
    }

    public Object remove(Object obj) {
        throw AnonymousClass000.A0x();
    }

    public final /* bridge */ int size() {
        return A00();
    }

    public String toString() {
        return C007103b.A0Q(", ", "{", "}", entrySet(), new C14580lr(this));
    }

    public final /* bridge */ Collection values() {
        return A02();
    }
}
