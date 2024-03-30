package X;

/* renamed from: X.3kr  reason: invalid class name and case insensitive filesystem */
public class C73973kr implements AnonymousClass15z {
    public static final String[] A00 = {"_id", "chat_row_id", "from_me", "key_id", "sender_jid_row_id", "parent_message_row_id", "timestamp", "status", "message_add_on_type", "received_timestamp", "expiry_duration_in_secs", "server_timestamp", "expiry_timestamp"};

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_add_on_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_key_index ON message_add_on (chat_row_id, from_me, key_id, sender_jid_row_id)");
        r5.A07("message_add_on_status_index", "CREATE INDEX IF NOT EXISTS message_add_on_status_index ON message_add_on (status)");
        r5.A07("message_add_on_chat_status_index", "CREATE INDEX IF NOT EXISTS message_add_on_chat_status_index ON message_add_on (chat_row_id, status)");
        r5.A07("message_add_on_parent_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_add_on_parent_message_row_id_index ON message_add_on (parent_message_row_id)");
        r5.A07("message_add_on_expiry_timestamp_index", "CREATE INDEX IF NOT EXISTS message_add_on_expiry_timestamp_index ON message_add_on (expiry_timestamp)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "message_add_on", "parent_message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A002 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[13];
        C52502pX A01 = C52502pX.A01(A002);
        boolean A0g = C63573Ko.A0g(A002, A01, r2);
        C63573Ko.A0Q(A002, A01, "chat_row_id", r2, A0g ? 1 : 0);
        C63573Ko.A08(A002, A01, "from_me", r2);
        A002.A02 = "key_id";
        C63573Ko.A0Z(A002, C52502pX.TEXT, r2, A0g);
        C63573Ko.A0A(A002, A01, "sender_jid_row_id", r2);
        C63573Ko.A0B(A002, A01, "parent_message_row_id", r2);
        C63573Ko.A0C(A002, A01, "timestamp", r2);
        C63573Ko.A0D(A002, A01, "status", r2);
        C63573Ko.A0E(A002, A01, "message_add_on_type", r2);
        C63573Ko.A0F(A002, A01, "received_timestamp", r2);
        C63573Ko.A0G(A002, A01, "expiry_duration_in_secs", r2);
        C63573Ko.A0H(A002, A01, "server_timestamp", r2);
        C63573Ko.A0I(A002, A01, "expiry_timestamp", r2);
        r7.A0B("message_add_on", r2);
    }
}
