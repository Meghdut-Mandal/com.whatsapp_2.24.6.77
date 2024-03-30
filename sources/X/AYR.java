package X;

import java.util.Map;

public class AYR implements Map.Entry, Comparable {
    public Object A00;
    public final Comparable A01;
    public final /* synthetic */ C21889AcH A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.A01;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.A00;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public AYR(C21889AcH acH, Comparable comparable, Object obj) {
        this.A02 = acH;
        this.A01 = comparable;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.compareTo(((AYR) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A01) ^ C36411kG.A09(this.A00);
    }

    public Object setValue(Object obj) {
        C21889AcH.A03(this.A02);
        Object obj2 = this.A00;
        this.A00 = obj;
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public Object getValue() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A01);
        A0u.append("=");
        return AnonymousClass000.A0o(this.A00, A0u);
    }
}
