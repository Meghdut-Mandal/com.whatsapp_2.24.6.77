package X;

/* renamed from: X.9B4  reason: invalid class name */
public abstract class AnonymousClass9B4 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String[] strArr = AnonymousClass99c.A00;
        A0u.append(AnonymousClass96W.A00(strArr));
        A0u.append(" FROM ");
        A0u.append("methods");
        A0u.append(" WHERE ");
        A00 = AnonymousClass000.A0q("credential_id = ?", A0u);
        StringBuilder A0v = AnonymousClass000.A0v("SELECT ");
        AnonymousClass000.A1D(AnonymousClass96W.A00(strArr), " FROM ", "methods", A0v);
        A0v.append(" ORDER BY ");
        A03 = AnonymousClass000.A0q("debit_mode DESC", A0v);
        StringBuilder A0v2 = AnonymousClass000.A0v("SELECT ");
        C36321k7.A1O(AnonymousClass96W.A00(strArr), " FROM ", "methods", " WHERE ", A0v2);
        AnonymousClass000.A1D("type != ? AND type != ?", " ORDER BY ", "debit_mode DESC", A0v2);
        A02 = A0v2.toString();
        StringBuilder A0v3 = AnonymousClass000.A0v("SELECT ");
        C36321k7.A1O(AnonymousClass96W.A00(strArr), " FROM ", "methods", " WHERE ", A0v3);
        A01 = AnonymousClass000.A0q("type = ?", A0v3);
    }
}
