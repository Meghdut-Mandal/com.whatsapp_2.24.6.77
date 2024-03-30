package X;

/* renamed from: X.2x1  reason: invalid class name and case insensitive filesystem */
public abstract class C56872x1 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        String str = C56842wy.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1D("SELECT ", str, " FROM ", A0u);
        A0u.append("message_view");
        A0u.append(" WHERE ");
        String A0r = C36401kF.A0r("chat_row_id = ?", A0u);
        A0u.append("sort_id > ?");
        A0u.append(A0r);
        A0u.append("sort_id <= ?");
        A0u.append("ORDER BY ");
        A0u.append("sort_id");
        A00 = AnonymousClass000.A0q(" ASC LIMIT 1024", A0u);
        StringBuilder A0I = C36321k7.A0I("SELECT ", str, " FROM ", "message_view", " WHERE ");
        A0I.append("chat_row_id = ?");
        A01 = AnonymousClass000.A0q(" ORDER BY sort_id ASC", A0I);
        StringBuilder A0I2 = C36321k7.A0I("SELECT ", str, " FROM ", "message_view", " WHERE ");
        A0I2.append("chat_row_id = ?");
        A0I2.append(A0r);
        A0I2.append("(sender_jid_row_id = ? OR sender_jid_raw_string = ?) ");
        A0I2.append(" ORDER BY ");
        A03 = AnonymousClass000.A0q("sort_id ASC", A0I2);
        StringBuilder A0I3 = C36321k7.A0I("SELECT ", str, " FROM ", "message_view", " WHERE ");
        C36321k7.A1O("from_me = 1", A0r, "chat_row_id = ?", " ORDER BY ", A0I3);
        A0I3.append("sort_id");
        A04 = AnonymousClass000.A0q(" ASC", A0I3);
        StringBuilder A0I4 = C36321k7.A0I("SELECT ", str, " FROM ", "message_view", " WHERE ");
        A0I4.append("chat_row_id = ?");
        AnonymousClass000.A1D(A0r, "sort_id > ?", " ORDER BY ", A0I4);
        A02 = AnonymousClass000.A0q("sort_id ASC", A0I4);
    }
}
