package X;

/* renamed from: X.5Z8  reason: invalid class name */
public abstract class AnonymousClass5Z8 {
    public static int A00(C1271967i r1, C140456lc r2) {
        return A01(r1, r2, 0);
    }

    public static int A01(C1271967i r0, C140456lc r1, int i) {
        try {
            if (r0.A03) {
                String A0J = C140456lc.A0J(r1);
                if (A0J != null) {
                    return AnonymousClass6Y7.A04(A0J);
                }
                return i;
            }
            String A0K = C140456lc.A0K(r1);
            if (A0K != null) {
                return AnonymousClass6Y7.A04(A0K);
            }
            return i;
        } catch (AnonymousClass5R5 unused) {
            AnonymousClass6RS.A01("ThemedColorUtils", "Error parsing themed color");
            return i;
        }
    }
}
