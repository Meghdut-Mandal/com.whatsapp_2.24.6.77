package X;

/* renamed from: X.3kk  reason: invalid class name and case insensitive filesystem */
public final class C73903kk implements AnonymousClass15z {
    public static String[] A00 = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_chat_row_id", "parent_from_me", "parent_key_id", "parent_sender_jid_row_id", "timestamp", "orphan_message_data", "orphan_message_type", "orphan_message_stanza_data", "orphan_message_reason"};

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_orphan_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_orphan_key_index ON message_orphan (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.A07("message_orphan_parent_key_index", "CREATE INDEX IF NOT EXISTS message_orphan_parent_key_index ON message_orphan (parent_chat_row_id, parent_from_me, parent_key_id, parent_sender_jid_row_id)");
        r5.A07("message_orphan_message_type_index", "CREATE INDEX IF NOT EXISTS message_orphan_message_type_index ON message_orphan (orphan_message_type)");
        r5.A07("message_orphan_reason_index", "CREATE INDEX IF NOT EXISTS message_orphan_reason_index ON message_orphan (orphan_message_reason)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A03(r6, "chat", "message_orphan", "parent_chat_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r4 = new C64563Om[14];
        C52502pX A012 = C52502pX.A01(A01);
        boolean A0f = C63573Ko.A0f(A01, A012, r4);
        C63573Ko.A0Q(A01, A012, "chat_row_id", r4, A0f ? 1 : 0);
        C63573Ko.A08(A01, A012, "from_me", r4);
        A01.A02 = "key_id";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0Z(A01, r1, r4, A0f);
        C63573Ko.A0A(A01, A012, "sender_jid_row_id", r4);
        C63573Ko.A0B(A01, A012, "parent_chat_row_id", r4);
        C63573Ko.A0C(A01, A012, "parent_from_me", r4);
        C63573Ko.A0D(A01, r1, "parent_key_id", r4);
        C63573Ko.A0E(A01, A012, "parent_sender_jid_row_id", r4);
        C63573Ko.A0F(A01, A012, "timestamp", r4);
        A01.A02 = "orphan_message_data";
        C52502pX r2 = C52502pX.BLOB;
        A01.A00 = r2;
        r4[10] = A01.A0r();
        C63573Ko.A0H(A01, A012, "orphan_message_type", r4);
        C63573Ko.A0I(A01, r2, "orphan_message_stanza_data", r4);
        C63573Ko.A0J(A01, A012, "orphan_message_reason", r4);
        r8.A0B("message_orphan", r4);
    }
}
