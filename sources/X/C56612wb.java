package X;

/* renamed from: X.2wb  reason: invalid class name and case insensitive filesystem */
public abstract class C56612wb {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String[] strArr = C56212vv.A00;
        A0u.append(C54132sS.A00(strArr));
        A0u.append(" FROM ");
        C36381kD.A1O(A0u, "settings");
        A01 = AnonymousClass000.A0q("jid = ?", A0u);
        StringBuilder A0v = AnonymousClass000.A0v("SELECT ");
        AnonymousClass000.A1D(C54132sS.A00(strArr), " FROM ", "settings", A0v);
        A00 = A0v.toString();
    }
}
