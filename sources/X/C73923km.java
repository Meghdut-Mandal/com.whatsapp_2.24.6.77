package X;

/* renamed from: X.3km  reason: invalid class name and case insensitive filesystem */
public class C73923km implements AnonymousClass15z {
    public static final String[] A00 = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_chat_row_id", "parent_from_me", "parent_key_id", "parent_sender_jid_row_id", "timestamp", "orphan_message_data"};

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_add_on_orphan_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_orphan_key_index ON message_add_on_orphan (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.A07("message_add_on_orphan_parent_key_index", "CREATE INDEX IF NOT EXISTS message_add_on_orphan_parent_key_index ON message_add_on_orphan (parent_chat_row_id, parent_from_me, parent_key_id, parent_sender_jid_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "chat", "message_add_on_orphan", "parent_chat_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A002 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[11];
        C52502pX A01 = C52502pX.A01(A002);
        boolean A0g = C63573Ko.A0g(A002, A01, r2);
        C63573Ko.A0Q(A002, A01, "chat_row_id", r2, A0g ? 1 : 0);
        C63573Ko.A08(A002, A01, "from_me", r2);
        A002.A02 = "key_id";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0Z(A002, r1, r2, A0g);
        C63573Ko.A0A(A002, A01, "sender_jid_row_id", r2);
        C63573Ko.A0B(A002, A01, "parent_chat_row_id", r2);
        C63573Ko.A0C(A002, A01, "parent_from_me", r2);
        r2[7] = C63573Ko.A05(A002, r1, "parent_key_id", A0g);
        C63573Ko.A0E(A002, A01, "parent_sender_jid_row_id", r2);
        C63573Ko.A0F(A002, A01, "timestamp", r2);
        r2[10] = C52502pX.A00(A002, "orphan_message_data");
        r8.A0B("message_add_on_orphan", r2);
    }
}
