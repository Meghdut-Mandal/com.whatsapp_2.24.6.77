package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.00f  reason: invalid class name and case insensitive filesystem */
public final class C000500f implements Map, Serializable, AnonymousClass00W {
    public static final C000500f A00 = new C000500f();
    public static final long serialVersionUID = 8246714829545688274L;

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return "{}";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        return false;
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    private final Object readResolve() {
        return A00;
    }

    public final /* bridge */ Set entrySet() {
        return C004702c.A00;
    }

    public final /* bridge */ Set keySet() {
        return C004702c.A00;
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final /* bridge */ Collection values() {
        return C023409w.A00;
    }
}
