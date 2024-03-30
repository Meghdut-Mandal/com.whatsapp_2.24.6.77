package X;

/* renamed from: X.2w0  reason: invalid class name and case insensitive filesystem */
public abstract class C56262w0 {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(C54132sS.A00(C56272w1.A00));
        A0z.append(" FROM ");
        C36381kD.A1O(A0z, "location_sharer");
        A0z.append("from_me = ? AND expires >= ?");
        A0z.append(" ORDER BY ");
        A00 = AnonymousClass000.A0q("_id DESC", A0z);
    }
}
