package X;

/* renamed from: X.3TN  reason: invalid class name */
public abstract class AnonymousClass3TN {
    public static String A00 = A01(68);
    public static String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;

    public static String A00(int i) {
        String A012;
        String str;
        StringBuilder A0v;
        String str2 = "message_add_on_event_response";
        if (i == 56) {
            A012 = AnonymousClass1M2.A01("message_add_on_reaction", C73953kp.A00);
            str = "message_add_on_reaction.message_add_on_row_id";
            str2 = "message_add_on_reaction";
        } else if (i == 67) {
            A012 = AnonymousClass1M2.A01("message_add_on_poll_vote", C73943ko.A00);
            str = "message_add_on_poll_vote.message_add_on_row_id";
            str2 = "message_add_on_poll_vote";
        } else if (i == 68) {
            A012 = AnonymousClass1M2.A01("message_add_on_keep_in_chat", C73913kl.A00);
            str = "message_add_on_keep_in_chat.message_add_on_row_id";
            str2 = "message_add_on_keep_in_chat";
        } else if (i == 79) {
            A012 = AnonymousClass1M2.A01("message_add_on_pin_in_chat", C73933kn.A00);
            str = "message_add_on_pin_in_chat.message_add_on_row_id";
            str2 = "message_add_on_pin_in_chat";
        } else if (i == 74) {
            A0v = AnonymousClass000.A0v("SELECT ");
            C36321k7.A1O(AnonymousClass1M2.A01("message_add_on", C73973kr.A00), " FROM ", "message_add_on", " ", A0v);
            return A0v.toString();
        } else if (i == 86) {
            A012 = AnonymousClass1M2.A01("message_add_on_scheduled_call_edit", C73963kq.A00);
            str = "message_add_on_scheduled_call_edit.message_add_on_row_id";
            str2 = "message_add_on_scheduled_call_edit";
        } else if (i == 93) {
            A012 = AnonymousClass1M2.A01(str2, C56302w4.A00);
            str = "message_add_on_event_response.message_add_on_row_id";
        } else {
            throw AnonymousClass000.A0d("Not supported type :", AnonymousClass000.A0u(), i);
        }
        A0v = AnonymousClass000.A0v("SELECT ");
        C36361kB.A1R("message_add_on", A0v, C73973kr.A00);
        C36321k7.A1O(",", A012, " FROM ", "message_add_on", A0v);
        A0v.append(" LEFT JOIN ");
        A0v.append(str2);
        A0v.append(" ON ");
        AnonymousClass000.A1D("message_add_on._id = ", str, " ", A0v);
        return A0v.toString();
    }

    public static String A01(int i) {
        String str;
        if (i == 68) {
            str = "SELECT COUNT(message_add_on._id) as unread_count, MAX(message_add_on._id) as last_message_add_on_row_id, message_add_on.parent_message_row_id as parent_message_row_id FROM message_add_on LEFT JOIN message_add_on_keep_in_chat ON message_add_on._id=message_add_on_keep_in_chat.message_add_on_row_id";
        } else {
            str = "SELECT COUNT(message_add_on._id) as unread_count, MAX(message_add_on._id) as last_message_add_on_row_id, message_add_on.parent_message_row_id as parent_message_row_id FROM message_add_on";
        }
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(" WHERE ");
        String A0r = C36401kF.A0r("message_add_on.chat_row_id = ?", A0v);
        C36351kA.A1M("message_add_on.message_add_on_type = ", A0r, A0v, i);
        A0v.append("message_add_on.status = ?");
        A0v.append(A0r);
        A0v.append("message_add_on.from_me = 0");
        A0v.append(A0r);
        A0v.append("message_add_on._id > ?");
        A0v.append(A0r);
        String A0q = AnonymousClass000.A0q("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0v);
        if (i == 68) {
            StringBuilder A0k = C36331k8.A0k(A0q, A0r);
            A0k.append("message_add_on_keep_in_chat.keep_in_chat_state=1");
            A0k.append(A0r);
            A0q = AnonymousClass000.A0q("message_add_on_keep_in_chat.keep_count <= 1", A0k);
        }
        StringBuilder A0v2 = AnonymousClass000.A0v(A0q);
        A0v2.append(" GROUP BY ");
        A0v2.append("message_add_on.parent_message_row_id");
        A0v2.append(" ORDER BY ");
        A0v2.append("last_message_add_on_row_id");
        return AnonymousClass000.A0q(" DESC LIMIT ?", A0v2);
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String[] strArr = C73973kr.A00;
        C36361kB.A1R("message_add_on", A0u, strArr);
        A0u.append(" FROM ");
        String A1C = C36431kI.A1C("message_add_on", A0u);
        A0u.append("message_add_on.chat_row_id");
        A0u.append(" = ? AND ");
        A0u.append("message_add_on.key_id");
        A0u.append(" = ? AND ");
        A0u.append("message_add_on.from_me");
        A0u.append(" = ? AND ");
        A05 = AnonymousClass000.A0q("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0u);
        StringBuilder A0v = AnonymousClass000.A0v("SELECT ");
        C36321k7.A1O(AnonymousClass1M2.A01("message_add_on", strArr), " FROM ", "message_add_on", A1C, A0v);
        A0v.append("message_add_on._id = ?");
        A04 = AnonymousClass000.A0p(" AND ", "(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0v);
        StringBuilder A0v2 = AnonymousClass000.A0v("SELECT ");
        AnonymousClass000.A1D(AnonymousClass1M2.A01("message_add_on_orphan", C73923km.A00), " FROM ", "message_add_on_orphan", A0v2);
        A03 = A0v2.toString();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("SELECT DISTINCT ");
        AnonymousClass000.A1D(AnonymousClass1M2.A01("message_view", C56842wy.A03), " FROM ", "message_add_on", A0u2);
        A0u2.append(" JOIN ");
        A0u2.append("message_view");
        A0u2.append(" ON ");
        A0u2.append("message_add_on.parent_message_row_id");
        A0u2.append(" = ");
        A0u2.append("message_view._id");
        A0u2.append(A1C);
        A0u2.append("message_add_on.expiry_timestamp <= ? AND message_add_on.expiry_timestamp != 0 AND message_add_on.expiry_timestamp is not null");
        A06 = AnonymousClass000.A0q(" LIMIT ?", A0u2);
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("SELECT COUNT(*) as count FROM message_add_on JOIN message_add_on_pin_in_chat ON message_add_on._id = message_add_on_pin_in_chat.message_add_on_row_id ");
        A02 = AnonymousClass000.A0q(" WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1", A0u3);
        StringBuilder A0u4 = AnonymousClass000.A0u();
        A0u4.append("SELECT _id FROM message_add_on WHERE ");
        A01 = AnonymousClass000.A0q("message_add_on_type=11 AND key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", A0u4);
    }

    public static String A02(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36381kD.A1O(A0u, A00(i));
        String A0r = C36401kF.A0r("message_add_on.chat_row_id = ?", A0u);
        C36351kA.A1M("message_add_on.message_add_on_type = ", A0r, A0u, i);
        A0u.append("message_add_on._id > ?");
        A0u.append(A0r);
        A0u.append("message_add_on.from_me = 0");
        A0u.append(A0r);
        return AnonymousClass000.A0q("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0u);
    }

    public static String A03(int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT  DISTINCT (message_add_on.sender_jid_row_id), message_add_on.parent_message_row_id FROM message_add_on WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = ");
        A0u.append(i2);
        A0u.append(" AND ");
        A0u.append("message_add_on.status = ?");
        A0u.append(" AND ");
        A0u.append("message_add_on.from_me = 0");
        A0u.append(" AND ");
        A0u.append("message_add_on._id > ?");
        A0u.append(" AND ");
        C36351kA.A1O("message_add_on.parent_message_row_id IN ", A0u, i);
        A0u.append(" AND ");
        return AnonymousClass000.A0q("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0u);
    }
}
