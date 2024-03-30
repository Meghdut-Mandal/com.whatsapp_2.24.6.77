package X;

/* renamed from: X.2wc  reason: invalid class name and case insensitive filesystem */
public abstract class C56622wc {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String str = C56842wy.A01;
        A0u.append(str);
        A0u.append(" FROM ");
        A0u.append("message_ephemeral ephemeral");
        A0u.append(" JOIN ");
        A0u.append("message_view messages");
        A0u.append(" ON ");
        String A1C = C36431kI.A1C("ephemeral.message_row_id = messages._id", A0u);
        String A0r = C36401kF.A0r("ephemeral.keep_in_chat != 1", A0u);
        A0u.append("ephemeral.expire_timestamp < ?");
        A00 = AnonymousClass000.A0q(" LIMIT ?", A0u);
        StringBuilder A0I = C36321k7.A0I("SELECT ", str, " FROM ", "message_ephemeral ephemeral", " JOIN ");
        C36321k7.A1O("available_message_view messages", A1C, "ephemeral.message_row_id = messages._id", A0r, A0I);
        C36321k7.A1O("ephemeral.keep_in_chat != 1", A0r, "ephemeral.expire_timestamp < ?", " LIMIT ?", A0I);
        A01 = A0I.toString();
    }
}
