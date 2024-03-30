package X;

/* renamed from: X.3iF  reason: invalid class name and case insensitive filesystem */
public class C72353iF implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("joinable_call_log_group_jid_row_id_index", "CREATE INDEX IF NOT EXISTS joinable_call_log_group_jid_row_id_index ON joinable_call_log (group_jid_row_id)");
        r5.A07("joinable_call_log_call_id_index", "CREATE UNIQUE INDEX IF NOT EXISTS joinable_call_log_call_id_index ON joinable_call_log (call_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A05(r6, "call_log", "joinable_call_log", "call_log_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r5 = new C64563Om[4];
        A00.A02 = "call_log_row_id";
        C52502pX r4 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r4, r5);
        A00.A02 = "call_id";
        C63573Ko.A0W(A00, C52502pX.TEXT, r5, A0i);
        C63573Ko.A06(A00, r4, "joinable_video_call", A0i);
        A00.A01 = "0";
        r5[2] = A00.A0r();
        C63573Ko.A06(A00, r4, "group_jid_row_id", A0i);
        C63573Ko.A0a(A00, "0", r5);
        r9.A0B("joinable_call_log", r5);
    }
}
