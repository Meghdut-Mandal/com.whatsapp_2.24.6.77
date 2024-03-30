package X;

/* renamed from: X.6Gk  reason: invalid class name and case insensitive filesystem */
public abstract class C129316Gk {
    public static Number A00(double d) {
        int i = (int) d;
        if (((double) i) == d) {
            return Integer.valueOf(i);
        }
        return Double.valueOf(d);
    }

    public static boolean A01(Object obj) {
        String obj2;
        if (obj instanceof Number) {
            return AnonymousClass000.A1P(AnonymousClass000.A0I(obj));
        }
        if (obj instanceof Boolean) {
            return AnonymousClass000.A1X(obj);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Expected Number or Boolean: ");
        if (obj == null) {
            obj2 = "null";
        } else {
            obj2 = obj.toString();
        }
        throw AnonymousClass000.A0c(obj2, A0u);
    }
}
