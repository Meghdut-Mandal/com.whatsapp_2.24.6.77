package X;

/* renamed from: X.2w7  reason: invalid class name and case insensitive filesystem */
public abstract class C56332w7 {
    public static final String A00;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("\n        SELECT\n            ");
        C36361kB.A1R("available_message_view", A0u, C56842wy.A03);
        A00 = AnonymousClass091.A01(AnonymousClass000.A0q("\n        FROM message_parent_association\n        JOIN available_message_view \n        WHERE\n            message_parent_association.message_row_id = available_message_view._id\n            AND\n            parent_message_row_id = ?\n            AND\n            association_type = ?\n        ORDER BY sort_id\n        DESC\n        ", A0u));
    }
}
