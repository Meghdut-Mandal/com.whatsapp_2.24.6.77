package X;

/* renamed from: X.2wt  reason: invalid class name and case insensitive filesystem */
public abstract class C56792wt {
    public static final String A00;
    public static final String A01;
    public static final String A02;

    static {
        String[] strArr = C56842wy.A03;
        String A012 = AnonymousClass1M2.A01("available_message_view", strArr);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("\n              SELECT ");
        A0u.append(A012);
        A02 = AnonymousClass091.A01(AnonymousClass000.A0q("\n              FROM message_comment\n              JOIN available_message_view\n              WHERE message_comment.message_row_id = available_message_view._id\n                AND\n                parent_message_row_id = ?\n                AND\n                sort_id < ?\n              ORDER BY sort_id DESC\n              LIMIT ?\n          ", A0u));
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("\n        SELECT\n            ");
        C36361kB.A1R("available_message_view", A0u2, strArr);
        A00 = AnonymousClass091.A01(AnonymousClass000.A0q("\n        FROM message_comment\n        JOIN available_message_view \n        WHERE\n            message_comment.message_row_id = available_message_view._id\n            AND\n            parent_message_row_id = ?\n        ORDER BY sort_id\n        DESC\n        ", A0u2));
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("\n        SELECT \n            ");
        C36361kB.A1R("available_message_view", A0u3, strArr);
        A01 = AnonymousClass091.A01(AnonymousClass000.A0q("\n        FROM message_comment \n        JOIN available_message_view \n        WHERE\n            message_comment.message_row_id = available_message_view._id\n            AND\n            parent_message_row_id = ?\n        ORDER BY sort_id\n        DESC \n        LIMIT ?\n        ", A0u3));
    }
}
