package X;

/* renamed from: X.3jN  reason: invalid class name and case insensitive filesystem */
public class C73053jN implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("missed_call_log_participants_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS missed_call_log_participants_key_index ON missed_call_log_participant (call_logs_row_id, jid)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A05(r6, "missed_call_logs", "missed_call_log_participant", "call_logs_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "call_logs_row_id", A0m, C63573Ko.A0g(A00, r2, A0m) ? 1 : 0);
        A00.A02 = "jid";
        C63573Ko.A0T(A00, C52502pX.TEXT, A0m);
        C63573Ko.A09(A00, r2, "call_result", A0m);
        r7.A0B("missed_call_log_participant", A0m);
    }
}
