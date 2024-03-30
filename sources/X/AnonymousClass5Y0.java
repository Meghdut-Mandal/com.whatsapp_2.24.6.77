package X;

/* renamed from: X.5Y0  reason: invalid class name */
public abstract class AnonymousClass5Y0 {
    public static int A00(C140456lc r2) {
        String A0O = C140456lc.A0O(r2);
        if (A0O == null || A0O.equals("column")) {
            return 1;
        }
        if (A0O.equals("row")) {
            return 0;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Unknown direction: ");
        throw AnonymousClass000.A0c(A0O, A0u);
    }
}
