package X;

/* renamed from: X.2w5  reason: invalid class name and case insensitive filesystem */
public abstract class C56312w5 {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(C56842wy.A01);
        A0z.append(" FROM ");
        A0z.append("message_edit_info");
        A0z.append(" JOIN message_view ON ");
        C36381kD.A1O(A0z, "message_view._id = message_edit_info.message_row_id");
        A0z.append("original_key_id = ? AND ");
        A0z.append("chat_row_id = ? AND ");
        A00 = AnonymousClass000.A0q("from_me = ?", A0z);
    }
}
