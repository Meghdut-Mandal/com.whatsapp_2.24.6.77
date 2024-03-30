package X;

import java.util.Arrays;

/* renamed from: X.0yQ  reason: invalid class name and case insensitive filesystem */
public final class C20950yQ {
    public final Object A00;

    public boolean equals(Object obj) {
        Object obj2;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C20950yQ r5 = (C20950yQ) obj;
            Object obj3 = this.A00;
            return (obj3 == null || (obj2 = r5.A00) == null) ? obj3 == r5.A00 : obj3 == obj2 || obj3.equals(obj2);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public C20950yQ(Object obj) {
        double doubleValue;
        if (obj == null) {
            obj = null;
        } else {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    doubleValue = 1.0d;
                } else {
                    doubleValue = 0.0d;
                }
            } else if (obj instanceof Number) {
                doubleValue = ((Number) obj).doubleValue();
            } else if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Attribute type must be Boolean, Number, or String");
            }
            obj = Double.valueOf(doubleValue);
        }
        this.A00 = obj;
    }
}
