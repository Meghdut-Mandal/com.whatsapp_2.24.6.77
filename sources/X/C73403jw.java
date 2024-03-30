package X;

/* renamed from: X.3jw  reason: invalid class name and case insensitive filesystem */
public class C73403jw implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("scheduled_calls_chat_row_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_chat_row_id_index ON scheduled_calls (key_chat_row_id, scheduled_timestamp, is_upcoming)");
        r5.A07("scheduled_calls_key_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_key_id_index ON scheduled_calls (key_chat_row_id, key_id)");
        r5.A07("scheduled_calls_timestamp_index_v2", "CREATE INDEX IF NOT EXISTS scheduled_calls_timestamp_index_v2 ON scheduled_calls (is_upcoming, scheduled_timestamp)");
        r5.A07("scheduled_calls_call_log_row_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_call_log_row_id_index ON scheduled_calls (call_log_row_id)");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[10];
        A00.A02 = "creation_message_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, r3);
        A00.A02 = "key_id";
        C52502pX r6 = C52502pX.TEXT;
        C63573Ko.A0W(A00, r6, r3, A0i);
        C63573Ko.A0S(A00, r2, "key_from_me", r3, A0i);
        A00.A02 = "key_chat_row_id";
        C63573Ko.A0Z(A00, r2, r3, A0i);
        C63573Ko.A06(A00, r2, "call_type", A0i);
        C63573Ko.A0c(A00, r3);
        r3[5] = C63573Ko.A05(A00, r2, "scheduled_timestamp", A0i);
        r3[6] = C63573Ko.A05(A00, r6, "call_title", A0i);
        r3[7] = C63573Ko.A05(A00, r2, "creator_jid_row_id", A0i);
        A00.A02 = "is_upcoming";
        A00.A00 = C52502pX.BOOLEAN;
        A00.A04 = A0i;
        r3[8] = A00.A0r();
        C63573Ko.A0F(A00, r2, "call_log_row_id", r3);
        r9.A0B("scheduled_calls", r3);
    }
}
