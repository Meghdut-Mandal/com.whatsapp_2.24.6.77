package X;

/* renamed from: X.72T  reason: invalid class name */
public class AnonymousClass72T implements Comparable {
    public final Class A00;
    public final Object A01;

    public AnonymousClass72T(Object obj) {
        Class<String> cls = String.class;
        if (cls.isInstance(obj)) {
            this.A01 = obj;
            this.A00 = cls;
            return;
        }
        throw AnonymousClass001.A08("Mismatched args: value is not an instance of type");
    }

    public int compareTo(Object obj) {
        if (obj instanceof AnonymousClass72T) {
            AnonymousClass72T r4 = (AnonymousClass72T) obj;
            Object obj2 = r4.A01;
            Class cls = r4.A00;
            Class<Float> cls2 = this.A00;
            if (!cls2.equals(cls)) {
                throw AnonymousClass001.A08("compareTo objects have mismatched types");
            } else if (cls2 == Boolean.class) {
                throw AnonymousClass001.A08("compareTo should not be called on boolean types");
            } else if (cls2 == String.class) {
                return ((String) this.A01).compareTo((String) obj2);
            } else {
                if (cls2 == Integer.class) {
                    return Integer.compare(AnonymousClass000.A0I(this.A01), AnonymousClass000.A0I(obj2));
                }
                if (cls2 == Float.class) {
                    return Float.compare(C36441kJ.A03(this.A01), C36441kJ.A03(obj2));
                }
                throw AnonymousClass001.A09("Invalid type: must be one of {Boolean, Integer, Float, String}");
            }
        } else {
            throw AnonymousClass001.A08("compareTo o should be an instance of ConfigPrimitive");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass72T)) {
            return false;
        }
        AnonymousClass72T r5 = (AnonymousClass72T) obj;
        Object obj2 = r5.A01;
        if (!this.A00.equals(r5.A00) || !this.A01.equals(obj2)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.A01.toString();
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A01;
        return AnonymousClass000.A0L(this.A00, A0M);
    }
}
