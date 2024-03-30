package X;

/* renamed from: X.2wd  reason: invalid class name and case insensitive filesystem */
public abstract class C56632wd {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("\n           SELECT ");
        String[] strArr = C73903kk.A00;
        C36361kB.A1R("message_orphan", A0u, strArr);
        A00 = AnonymousClass000.A0q("\n           FROM message_orphan\n           WHERE \n              orphan_message_type = ? \n              AND _id > ?\n           ORDER BY _id ASC \n           LIMIT ?\n      ", A0u);
        StringBuilder A0v = AnonymousClass000.A0v("\n           SELECT ");
        C36361kB.A1R("message_orphan", A0v, strArr);
        A01 = AnonymousClass000.A0q("\n           FROM message_orphan\n           WHERE \n              orphan_message_type = ? \n              AND _id > ?\n              AND parent_chat_row_id = ?\n              AND parent_from_me = ?\n              And parent_key_id = ?\n           ORDER BY _id ASC \n           LIMIT ?\n      ", A0v);
        AnonymousClass1M2.A01("message_orphan", strArr);
    }
}
