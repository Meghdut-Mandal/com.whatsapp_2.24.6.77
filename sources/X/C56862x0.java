package X;

/* renamed from: X.2x0  reason: invalid class name and case insensitive filesystem */
public abstract class C56862x0 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String[] strArr = C56842wy.A03;
        C36361kB.A1R("message", A0u, strArr);
        A0u.append(", ");
        A0u.append("file_size");
        A0u.append(" FROM ");
        A0u.append("message_media AS message_media");
        A0u.append(" JOIN ");
        A0u.append("available_message_view AS message");
        A0u.append(" ON message_media.message_row_id = message._id");
        A0u.append(" JOIN ");
        A0u.append("message_forwarded AS message_forwarded");
        A0u.append(" ON message_forwarded.message_row_id = message_media.message_row_id");
        A0u.append(" LEFT JOIN ");
        A0u.append("chat");
        A0u.append(" AS chat ON message.");
        A0u.append("chat_row_id");
        A0u.append(" = chat.");
        String A1C = C36431kI.A1C("_id", A0u);
        String A0r = C36401kF.A0r("message_forwarded.forward_score > ?", A0u);
        A0u.append("message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')");
        A0u.append(" AND (chat.chat_lock = 0");
        A0u.append(" OR chat.chat_lock is NULL)");
        A01 = AnonymousClass000.A0q(" ORDER BY file_size DESC", A0u);
        StringBuilder A0v = AnonymousClass000.A0v("SELECT ");
        C36321k7.A1O(AnonymousClass1M2.A01("message", strArr), ", ", "file_size", " FROM ", A0v);
        A0v.append("message_media AS message_media");
        A0v.append(" JOIN ");
        C36321k7.A1O("available_message_view AS message", " JOIN ", "message_forwarded AS message_forwarded", " LEFT JOIN ", A0v);
        A0v.append("chat AS chat");
        A0v.append(" WHERE message_media.message_row_id = message._id");
        A0v.append(" AND message_forwarded.message_row_id = message_media.message_row_id");
        A0v.append(" AND message.chat_row_id = chat._id");
        A0v.append(A0r);
        C36321k7.A1O("message_forwarded.forward_score > ?", A0r, "message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')", " AND (chat.chat_lock = 0", A0v);
        A02 = AnonymousClass000.A0p(" OR chat.chat_lock is NULL)", " ORDER BY file_size DESC", A0v);
        StringBuilder A0v2 = AnonymousClass000.A0v("SELECT ");
        C36361kB.A1R("message", A0v2, strArr);
        A0v2.append(", ");
        C36321k7.A1O("message_forwarded.forward_score", " FROM ", "available_message_view AS message", " JOIN ", A0v2);
        A0v2.append("message_forwarded AS message_forwarded");
        C36321k7.A1O(" ON message_forwarded.message_row_id = message._id", " LEFT JOIN ", "chat", " AS chat ON message.", A0v2);
        C36321k7.A1O("chat_row_id", " = chat.", "_id", A1C, A0v2);
        C36321k7.A1O("message_forwarded.forward_score >= ?", A0r, "message_type IN ('2', '1', '25', '3', '81', '28', '13', '29', '9', '26')", " AND (chat.chat_lock = 0", A0v2);
        String A0q = AnonymousClass000.A0q(" OR chat.chat_lock is NULL)", A0v2);
        A04 = AnonymousClass000.A0q(" ORDER BY sort_id DESC", AnonymousClass000.A0v(A0q));
        A03 = AnonymousClass000.A0q(" ORDER BY sort_id ASC", AnonymousClass000.A0v(A0q));
        A00 = AnonymousClass000.A0q(" ORDER BY message_forwarded.forward_score DESC", AnonymousClass000.A0v(A0q));
    }
}
