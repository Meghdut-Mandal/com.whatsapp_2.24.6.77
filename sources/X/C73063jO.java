package X;

/* renamed from: X.3jO  reason: invalid class name and case insensitive filesystem */
public class C73063jO implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("missed_call_logs_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS missed_call_logs_key_index ON missed_call_logs (message_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "missed_call_logs");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[8];
        C52502pX A01 = C52502pX.A01(A00);
        boolean A0g = C63573Ko.A0g(A00, A01, r3);
        C63573Ko.A0Q(A00, A01, "message_row_id", r3, A0g ? 1 : 0);
        C63573Ko.A08(A00, A01, "timestamp", r3);
        C63573Ko.A09(A00, A01, "video_call", r3);
        C63573Ko.A07(A00, A01, "group_jid_row_id", A0g);
        C63573Ko.A0c(A00, r3);
        C63573Ko.A0B(A00, A01, "is_joinable_group_call", r3);
        C63573Ko.A0C(A00, A01, "is_dnd_mode_on", r3);
        C63573Ko.A0D(A00, A01, "offer_silence_reason", r3);
        r7.A0B("missed_call_logs", r3);
    }
}
