package X;

/* renamed from: X.962  reason: invalid class name */
public abstract class AnonymousClass962 {
    public static final int A00(String str) {
        if (str == null || AnonymousClass098.A06(str) || "approved".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("deleted".equalsIgnoreCase(str)) {
            return 3;
        }
        return 1;
    }
}
