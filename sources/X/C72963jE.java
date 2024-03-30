package X;

/* renamed from: X.3jE  reason: invalid class name and case insensitive filesystem */
public class C72963jE implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message_system", "message_system_scheduled_call_start", "message_row_id=old.message_row_id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, A0q);
        C63573Ko.A06(A00, r2, "creation_message_row_id", A0i);
        A00.A06 = A0i;
        C63573Ko.A0e(A00, A0q, A0i ? 1 : 0);
        A00.A02 = "call_title";
        C63573Ko.A0Y(A00, C52502pX.TEXT, A0q, A0i);
        A00.A02 = "call_timestamp_ms";
        C63573Ko.A0Z(A00, r2, A0q, A0i);
        r7.A0B("message_system_scheduled_call_start", A0q);
    }
}
