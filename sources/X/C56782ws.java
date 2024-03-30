package X;

/* renamed from: X.2ws  reason: invalid class name and case insensitive filesystem */
public abstract class C56782ws {
    public static final String A00;
    public static final String A01;
    public static final String A02;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String[] strArr = C56842wy.A03;
        C36361kB.A1R("message", A0u, strArr);
        A0u.append(" FROM ");
        A0u.append("message_view AS message");
        A0u.append(" LEFT JOIN ");
        A0u.append("message_ui_elements AS content");
        A0u.append(" ON ");
        String A1C = C36431kI.A1C("message._id = content.message_row_id", A0u);
        String A0r = C36401kF.A0r("content.element_type = ?", A0u);
        A0u.append("message.chat_row_id = ?");
        A0u.append(A0r);
        A0u.append("message.timestamp > ?");
        A0u.append(" ORDER BY message.sort_id DESC ");
        A00 = AnonymousClass000.A0q(" LIMIT 100", A0u);
        AnonymousClass1M2.A01("message", strArr);
        StringBuilder A0v = AnonymousClass000.A0v("SELECT ");
        C36321k7.A1O(AnonymousClass1M2.A01("message", strArr), " FROM ", "message_view AS message", " LEFT JOIN ", A0v);
        C36321k7.A1O("message_ui_elements AS content", " ON ", "message._id = content.message_row_id", A1C, A0v);
        A0v.append("content.element_type = 4");
        A02 = AnonymousClass000.A0p(" ORDER BY message.sort_id DESC ", " LIMIT 100", A0v);
        StringBuilder A0v2 = AnonymousClass000.A0v("SELECT ");
        C36361kB.A1R("message", A0v2, strArr);
        A0v2.append(" FROM ");
        A0v2.append("message_view");
        A0v2.append(" AS message WHERE ");
        A0v2.append("key_id = ?");
        A0v2.append(A0r);
        A01 = AnonymousClass000.A0q("_id IN ( SELECT DISTINCT message_row_id FROM message_ui_elements WHERE element_type = 4)", A0v2);
    }
}
