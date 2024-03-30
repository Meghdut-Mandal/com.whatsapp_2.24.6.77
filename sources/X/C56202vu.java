package X;

/* renamed from: X.2vu  reason: invalid class name and case insensitive filesystem */
public abstract class C56202vu {
    public static final String A00;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("   SELECT ");
        A0u.append(C56842wy.A01);
        A0u.append(" FROM ");
        C36381kD.A1O(A0u, "available_message_view");
        A0u.append("_id > ? ");
        A0u.append(" ORDER BY ");
        A0u.append("_id ASC");
        A00 = AnonymousClass000.A0q(" LIMIT ?", A0u);
    }
}
