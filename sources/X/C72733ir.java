package X;

/* renamed from: X.3ir  reason: invalid class name and case insensitive filesystem */
public class C72733ir implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "message_scheduled_call", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "scheduled_timestamp_ms", A0q, C63573Ko.A0i(A00, r2, A0q) ? 1 : 0);
        C63573Ko.A08(A00, r2, "call_type", A0q);
        A00.A02 = "title";
        C63573Ko.A0U(A00, C52502pX.TEXT, A0q);
        r7.A0B("message_scheduled_call", A0q);
    }
}