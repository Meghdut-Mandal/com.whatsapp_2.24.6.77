package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.AcX  reason: case insensitive filesystem */
public final class C21903AcX<K, V> extends LinkedHashMap<K, V> {
    public static final C21903AcX A00;
    public boolean isMutable = true;

    static {
        C21903AcX acX = new C21903AcX();
        A00 = acX;
        acX.isMutable = false;
    }

    public static int A00(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = AnonymousClass9BD.A04;
            int i = r3;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C22899AyB)) {
            return obj.hashCode();
        } else {
            throw AnonymousClass001.A0D();
        }
    }

    public void clear() {
        if (this.isMutable) {
            super.clear();
            return;
        }
        throw AnonymousClass001.A0D();
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator A10 = C36371kC.A10(this);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            if (!map.containsKey(A11.getKey())) {
                return false;
            }
            Object value = A11.getValue();
            Object obj2 = map.get(A11.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                equals = value.equals(obj2);
                continue;
            } else {
                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public Object put(Object obj, Object obj2) {
        if (this.isMutable) {
            Charset charset = AnonymousClass9BD.A04;
            Objects.requireNonNull(obj);
            Objects.requireNonNull(obj2);
            return super.put(obj, obj2);
        }
        throw AnonymousClass001.A0D();
    }

    public void putAll(Map map) {
        if (this.isMutable) {
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                Object next = A10.next();
                Charset charset = AnonymousClass9BD.A04;
                Objects.requireNonNull(next);
                Objects.requireNonNull(map.get(next));
            }
            super.putAll(map);
            return;
        }
        throw AnonymousClass001.A0D();
    }

    public Object remove(Object obj) {
        if (this.isMutable) {
            return super.remove(obj);
        }
        throw AnonymousClass001.A0D();
    }

    public C21903AcX(Map map) {
        super(map);
    }

    public Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public int hashCode() {
        Iterator A10 = C36371kC.A10(this);
        int i = 0;
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            i += A00(A11.getValue()) ^ A00(A11.getKey());
        }
        return i;
    }

    public C21903AcX() {
    }
}
