package X;

/* renamed from: X.2we  reason: invalid class name and case insensitive filesystem */
public abstract class C56642we {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String[] strArr = C56842wy.A03;
        C36361kB.A1R("available_message_view", A0u, strArr);
        A00 = AnonymousClass000.A0q(" FROM newsletter_message_enforcements JOIN available_message_view WHERE newsletter_message_enforcements.message_row_id = available_message_view._id AND available_message_view.chat_row_id = ? AND available_message_view.message_type != 15", A0u);
        StringBuilder A0v = AnonymousClass000.A0v("SELECT ");
        C36361kB.A1R("available_message_view", A0v, strArr);
        A01 = AnonymousClass000.A0q(" FROM newsletter_message_enforcements JOIN available_message_view WHERE newsletter_message_enforcements.message_row_id = available_message_view._id AND available_message_view.chat_row_id = ?", A0v);
    }
}
