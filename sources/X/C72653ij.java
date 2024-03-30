package X;

/* renamed from: X.3ij  reason: invalid class name and case insensitive filesystem */
public class C72653ij implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_poll");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[5];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0i = C63573Ko.A0i(A00, A02, r4);
        A00.A02 = "enc_key";
        C63573Ko.A0V(A00, C52502pX.BLOB, r4, A0i ? 1 : 0);
        C63573Ko.A08(A00, A02, "selectable_options_count", r4);
        C63573Ko.A06(A00, A02, "invalid_state", A0i);
        C63573Ko.A0a(A00, "0", r4);
        C63573Ko.A06(A00, A02, "poll_logging_id", A0i);
        A00.A01 = "0";
        C63573Ko.A0c(A00, r4);
        r8.A0B("message_poll", r4);
    }
}
