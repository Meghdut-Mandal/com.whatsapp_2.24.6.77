package X;

import java.util.Map;

/* renamed from: X.01h  reason: invalid class name and case insensitive filesystem */
public class C003201h implements Map.Entry {
    public C003201h A00;
    public C003201h A01;
    public final Object A02;
    public final Object A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C003201h)) {
            return false;
        }
        C003201h r4 = (C003201h) obj;
        return this.A02.equals(r4.A02) && this.A03.equals(r4.A03);
    }

    public int hashCode() {
        return this.A02.hashCode() ^ this.A03.hashCode();
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append("=");
        sb.append(this.A03);
        return sb.toString();
    }

    public C003201h(Object obj, Object obj2) {
        this.A02 = obj;
        this.A03 = obj2;
    }

    public Object getKey() {
        return this.A02;
    }

    public Object getValue() {
        return this.A03;
    }
}
