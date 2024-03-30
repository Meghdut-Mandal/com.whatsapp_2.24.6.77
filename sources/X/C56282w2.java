package X;

/* renamed from: X.2w2  reason: invalid class name and case insensitive filesystem */
public abstract class C56282w2 {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        C36361kB.A1R("message", A0z, C56842wy.A03);
        A0z.append(" FROM ");
        A0z.append("available_message_view AS message");
        A0z.append(" JOIN ");
        A0z.append("chat AS chat");
        C36381kD.A1O(A0z, " ON message.chat_row_id = chat._id");
        String A0r = C36401kF.A0r("message.from_me = 0", A0z);
        A0z.append("status != 16");
        A0z.append(A0r);
        A0z.append("status != 10");
        A0z.append(A0r);
        A0z.append("(chat.last_read_message_sort_id >= message.sort_id OR status = 17)");
        A0z.append(A0r);
        A0z.append("chat.last_read_receipt_sent_message_sort_id < message.sort_id");
        A0z.append(A0r);
        A0z.append("chat.last_read_receipt_sent_message_row_id > 0");
        A0z.append(A0r);
        A0z.append("message.message_type NOT IN ('8', '10', '15')");
        A0z.append(A0r);
        A0z.append("(chat.hidden IS NULL OR chat.hidden = 0)");
        A0z.append(" ORDER BY message.sort_id DESC");
        A00 = AnonymousClass000.A0q(" LIMIT 4096", A0z);
    }
}
