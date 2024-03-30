package X;

import java.util.Set;

/* renamed from: X.2x2  reason: invalid class name and case insensitive filesystem */
public abstract class C56882x2 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT ");
        String str = C56842wy.A01;
        A0u.append(str);
        A0u.append(" FROM ");
        A0u.append("message_view");
        A02 = AnonymousClass000.A0q(" WHERE chat_row_id=? AND from_me=? AND key_id=?", A0u);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        C36321k7.A1O("SELECT ", str, " FROM ", "message_view", A0u2);
        A0u2.append(" WHERE ");
        String A0r = C36401kF.A0r("chat_row_id = ?", A0u2);
        A0u2.append("from_me = ?");
        A0u2.append(A0r);
        A03 = AnonymousClass000.A0q("key_id = ?", A0u2);
        StringBuilder A0u3 = AnonymousClass000.A0u();
        AnonymousClass000.A1D("SELECT ", str, " FROM ", A0u3);
        A0u3.append("message_system AS message_system");
        A0u3.append(" JOIN ");
        A0u3.append("available_message_view AS message");
        C36321k7.A1O(" ON message_system.message_row_id = message._id", " WHERE ", "chat_row_id = ?", A0r, A0u3);
        A0u3.append("from_me = 1");
        A0u3.append(A0r);
        A0u3.append("message_type = 7");
        A0u3.append(A0r);
        A0u3.append("message_system.action_type = 6");
        A0u3.append(" ORDER BY sort_id DESC");
        A00 = AnonymousClass000.A0q(" LIMIT 1", A0u3);
        StringBuilder A0I = C36321k7.A0I("SELECT ", str, " FROM ", "message_system AS message_system", " JOIN ");
        A0I.append("available_message_view AS message");
        AnonymousClass000.A1D(" WHERE message_system.message_row_id = message._id", A0r, "chat_row_id = ?", A0I);
        A0I.append(A0r);
        A0I.append("from_me = 1");
        A0I.append(A0r);
        C36321k7.A1O("message_type = 7", A0r, "message_system.action_type = 6", " ORDER BY sort_id DESC", A0I);
        A01 = AnonymousClass000.A0q(" LIMIT 1", A0I);
        StringBuilder A0u4 = AnonymousClass000.A0u();
        C36321k7.A1O("SELECT ", str, " FROM ", "available_message_view AS message", A0u4);
        A0u4.append(" LEFT JOIN ");
        A0u4.append("message_system");
        AnonymousClass000.A1D(" AS message_system", " ON message_system.message_row_id = message._id", " LEFT JOIN ", A0u4);
        A0u4.append("message_system_group");
        A0u4.append(" AS system_group");
        A0u4.append(" ON message_system.message_row_id = system_group.message_row_id");
        A0u4.append(" WHERE ");
        A0u4.append("message.chat_row_id = ?");
        A0u4.append(A0r);
        A0u4.append("message.message_type NOT IN ('8' , '10' , '36' , '77' , '90' , '12')");
        A0u4.append(" AND (");
        A0u4.append("message.from_me = 0 OR (message_system.action_type = 4 AND system_group.is_me_joined = 1) OR (message_system.action_type = 12 AND system_group.is_me_joined = 1))");
        A0u4.append(" AND (view_mode IS NULL OR view_mode = 0) ");
        A0u4.append(" ORDER BY sort_id");
        A04 = AnonymousClass000.A0q(" DESC LIMIT ?", A0u4);
        StringBuilder A0u5 = AnonymousClass000.A0u();
        A0u5.append("SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE _id > ?  AND chat_row_id = ?  AND action_type IN ");
        A05 = AnonymousClass000.A0q(AnonymousClass1M2.A00(((Set) C56672wh.A00.get()).size()), A0u5);
    }
}
