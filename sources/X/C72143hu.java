package X;

/* renamed from: X.3hu  reason: invalid class name and case insensitive filesystem */
public class C72143hu implements AnonymousClass15z {
    public void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("call_log_participant_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS call_log_participant_key_index ON call_log_participant_v2 (call_log_row_id, jid_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A05(r6, "call_log", "call_log_participant_v2", "call_log_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "call_log_row_id", A0m, C63573Ko.A0g(A00, r2, A0m) ? 1 : 0);
        C63573Ko.A08(A00, r2, "jid_row_id", A0m);
        C63573Ko.A09(A00, r2, "call_result", A0m);
        r7.A0B("call_log_participant_v2", A0m);
    }
}
