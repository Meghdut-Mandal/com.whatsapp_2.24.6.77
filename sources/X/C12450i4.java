package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0i4  reason: invalid class name and case insensitive filesystem */
public abstract class C12450i4 implements Map, Serializable {
    public static final Map.Entry[] A01 = new Map.Entry[0];
    public transient C04860Mh A00;

    public final boolean containsValue(Object obj) {
        return ((C04800Mb) this).A00.contains(obj);
    }

    public abstract /* bridge */ /* synthetic */ Set entrySet();

    public abstract Object get(Object obj);

    public abstract /* bridge */ /* synthetic */ Set keySet();

    public abstract /* bridge */ /* synthetic */ Collection values();

    public final C04860Mh A02() {
        C04860Mh r0 = this.A00;
        if (r0 == null) {
            C04800Mb r1 = (C04800Mb) this;
            if (r1.isEmpty()) {
                r0 = C04850Mg.A05;
            } else {
                r0 = new C04840Mf(r1);
            }
            this.A00 = r0;
        }
        return r0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Deprecated
    public final void clear() {
        throw AnonymousClass001.A0D();
    }

    public final boolean containsKey(Object obj) {
        return AnonymousClass000.A1V(get(obj));
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        int i = 0;
        for (Object A0J : A02()) {
            i += AnonymousClass000.A0J(A0J);
        }
        return i;
    }

    public final boolean isEmpty() {
        return AnonymousClass000.A1Q(size());
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw AnonymousClass001.A0D();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
            sb.append('{');
            Iterator it = entrySet().iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(it);
                if (!z) {
                    sb.append(", ");
                }
                sb.append(A11.getKey());
                sb.append('=');
                sb.append(A11.getValue());
                z = false;
            }
            return AnonymousClass000.A0s(sb);
        }
        throw AnonymousClass000.A0d("size cannot be negative but was: ", AnonymousClass000.A0u(), size);
    }
}
