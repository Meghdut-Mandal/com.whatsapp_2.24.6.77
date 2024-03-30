package X;

/* renamed from: X.3jY  reason: invalid class name and case insensitive filesystem */
public class C73163jY implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_orphaned_edit_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_orphaned_edit_key_index ON message_orphaned_edit (key_id, from_me, chat_row_id, sender_jid_row_id)");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[11];
        C52502pX A01 = C52502pX.A01(A00);
        A00.A00 = A01;
        boolean A0j = C63573Ko.A0j(A00, r2);
        A00.A02 = "key_id";
        C52502pX r5 = C52502pX.TEXT;
        C63573Ko.A0W(A00, r5, r2, true);
        C63573Ko.A0S(A00, A01, "from_me", r2, true);
        A00.A02 = "chat_row_id";
        C63573Ko.A0Z(A00, A01, r2, true);
        r2[4] = C63573Ko.A04(A00, A01, "sender_jid_row_id", A0j ? 1 : 0, true);
        C63573Ko.A0B(A00, A01, "timestamp", r2);
        r2[6] = C63573Ko.A05(A00, A01, "message_type", true);
        C63573Ko.A0D(A00, r5, "revoked_key_id", r2);
        C63573Ko.A0E(A00, A01, "retry_count", r2);
        C63573Ko.A0F(A00, A01, "admin_jid_row_id", r2);
        r2[10] = C52502pX.A00(A00, "orphan_message_data");
        r9.A0B("message_orphaned_edit", r2);
    }
}
