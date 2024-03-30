package X;

/* renamed from: X.2w8  reason: invalid class name and case insensitive filesystem */
public abstract class C56342w8 {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        C36361kB.A1R("message", A0z, C56842wy.A03);
        A0z.append(" FROM ");
        A0z.append("message_view AS message");
        A0z.append(" JOIN ");
        A0z.append("status AS status_list");
        A0z.append(" ON ");
        C36381kD.A1O(A0z, "status_list.jid_row_id = message.sender_jid_row_id");
        String A0r = C36401kF.A0r("message.chat_row_id = ?", A0z);
        A0z.append("message.from_me = 0");
        A0z.append(A0r);
        A0z.append("status_list.last_read_message_table_id >= message._id");
        A0z.append(A0r);
        A0z.append("status_list.last_read_receipt_sent_message_table_id < message._id");
        A0z.append(A0r);
        A0z.append("status_list.last_read_receipt_sent_message_table_id > 0");
        A0z.append(A0r);
        A0z.append("message.message_type != 15");
        A0z.append(" ORDER BY message.");
        A0z.append("_id");
        A00 = AnonymousClass000.A0q(" DESC LIMIT 4096", A0z);
    }
}
