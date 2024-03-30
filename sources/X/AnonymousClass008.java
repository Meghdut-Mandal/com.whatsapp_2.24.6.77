package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.008  reason: invalid class name */
public class AnonymousClass008<K, V> extends AnonymousClass007<K, V> implements Map<K, V> {
    public C13360jk A00;
    public C12480i8 A01;
    public C12110hW A02;

    public AnonymousClass008(AnonymousClass007 r2) {
        super(0);
        A09(r2);
    }

    public Set entrySet() {
        C13360jk r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C13360jk r02 = new C13360jk(this);
        this.A00 = r02;
        return r02;
    }

    public Set keySet() {
        C12480i8 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C12480i8 r02 = new C12480i8(this);
        this.A01 = r02;
        return r02;
    }

    public Collection values() {
        C12110hW r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C12110hW r02 = new C12110hW(this);
        this.A02 = r02;
        return r02;
    }

    public boolean A0A(Collection collection) {
        int size = size();
        for (int i = size - 1; i >= 0; i--) {
            if (!collection.contains(A04(i))) {
                A05(i);
            }
        }
        if (size == size()) {
            return false;
        }
        return true;
    }

    public void putAll(Map map) {
        A08(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public AnonymousClass008(int i) {
        super(i);
    }

    public AnonymousClass008() {
        super(0);
    }
}
