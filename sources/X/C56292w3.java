package X;

/* renamed from: X.2w3  reason: invalid class name and case insensitive filesystem */
public abstract class C56292w3 {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(C56842wy.A01);
        A0z.append(", deleted_msg.remove_files AS remove_files FROM ");
        A0z.append("deleted_messages_view");
        A0z.append(" AS deleted_msg  WHERE ");
        A0z.append("chat_row_id");
        A0z.append(" = ? AND ");
        A0z.append("message_type");
        A0z.append(" != ");
        A0z.append(8);
        A0z.append(" ORDER BY sort_id ASC");
        A00 = AnonymousClass000.A0q(" LIMIT ?", A0z);
    }
}
