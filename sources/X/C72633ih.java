package X;

/* renamed from: X.3ih  reason: invalid class name and case insensitive filesystem */
public class C72633ih implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_payment_transaction_reminder");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[7];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0i = C63573Ko.A0i(A00, A02, r4);
        A00.A02 = "web_stub";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0V(A00, r1, r4, A0i ? 1 : 0);
        C63573Ko.A08(A00, r1, "amount", r4);
        C63573Ko.A09(A00, r1, "transfer_date", r4);
        C63573Ko.A0A(A00, r1, "payment_sender_name", r4);
        C63573Ko.A0B(A00, A02, "expiration", r4);
        C63573Ko.A0C(A00, r1, "remote_message_key", r4);
        r8.A0B("message_payment_transaction_reminder", r4);
    }
}
