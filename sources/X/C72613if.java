package X;

/* renamed from: X.3if  reason: invalid class name and case insensitive filesystem */
public class C72613if implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_payment_status_update");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[6];
        boolean A0i = C63573Ko.A0i(A00, C52502pX.A02(A00), r3);
        A00.A02 = "transaction_info";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0V(A00, r1, r3, A0i ? 1 : 0);
        C63573Ko.A08(A00, r1, "transaction_data", r3);
        C63573Ko.A09(A00, r1, "init_timestamp", r3);
        C63573Ko.A0A(A00, r1, "update_timestamp", r3);
        C63573Ko.A0B(A00, r1, "amount_data", r3);
        r7.A0B("message_payment_status_update", r3);
    }
}
