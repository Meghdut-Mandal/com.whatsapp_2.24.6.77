package X;

import java.util.Map;

/* renamed from: X.6Ow  reason: invalid class name and case insensitive filesystem */
public final class C131396Ow {
    public int[] A00;
    public Object[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            try {
                return (obj instanceof C131396Ow) || ((obj instanceof Map) && 0 == ((Map) obj).size());
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public C131396Ow(int i) {
        this.A00 = C113605fo.A00;
        this.A01 = C113605fo.A01;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public C131396Ow() {
        this(0);
    }
}
