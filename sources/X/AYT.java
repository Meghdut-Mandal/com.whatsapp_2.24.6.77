package X;

import java.util.Map;

public class AYT implements Map.Entry, AnonymousClass00W {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !AnonymousClass00C.A0J(entry.getKey(), getKey()) || !AnonymousClass00C.A0J(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public Object getValue() {
        if (this instanceof C166567wS) {
            return ((C166567wS) this).A00;
        }
        return this.A01;
    }

    public Object setValue(Object obj) {
        if (this instanceof C166567wS) {
            C166567wS r1 = (C166567wS) this;
            Object value = r1.getValue();
            r1.A00 = obj;
            AYE aye = r1.A01;
            Object key = r1.getKey();
            C166627wY r5 = aye.A00;
            C1513479e r4 = r5.A03;
            if (r4.containsKey(key)) {
                if (r5.hasNext()) {
                    Object A03 = r5.A03();
                    r4.put(key, obj);
                    C166627wY.A00(r5, r4.A01, A03, AnonymousClass000.A0J(A03), 0);
                } else {
                    r4.put(key, obj);
                }
                r5.A00 = r4.A00;
            }
            return value;
        }
        throw AnonymousClass001.A0E("Operation is not supported for read-only collection");
    }

    public AYT(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public Object getKey() {
        return this.A00;
    }

    public int hashCode() {
        int i = 0;
        int A0J = AnonymousClass000.A0J(getKey());
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return A0J ^ i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(getKey());
        A0u.append('=');
        return AnonymousClass000.A0o(getValue(), A0u);
    }
}
