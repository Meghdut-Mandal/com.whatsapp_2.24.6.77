package X;

/* renamed from: X.2w6  reason: invalid class name and case insensitive filesystem */
public abstract class C56322w6 {
    public static final String A00;

    static {
        StringBuilder A0z = C36391kE.A0z();
        A0z.append(C56842wy.A01);
        A0z.append(", ");
        A0z.append("links.link_index AS link_index");
        A0z.append(" FROM ");
        A0z.append("available_message_view AS message, ");
        C36381kD.A1O(A0z, "(SELECT message_row_id, link_index FROM message_link AS link WHERE link.chat_row_id = ?) links");
        A0z.append("message._id = links.message_row_id");
        A00 = AnonymousClass000.A0q(" ORDER BY sort_id DESC", A0z);
    }
}
