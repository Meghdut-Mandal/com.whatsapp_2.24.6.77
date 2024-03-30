package X;

/* renamed from: X.3ig  reason: invalid class name and case insensitive filesystem */
public class C72623ig implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_payment");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[8];
        C52502pX A02 = C52502pX.A02(A00);
        C63573Ko.A0Q(A00, A02, "sender_jid_row_id", r3, C63573Ko.A0i(A00, A02, r3) ? 1 : 0);
        C63573Ko.A08(A00, A02, "receiver_jid_row_id", r3);
        A00.A02 = "amount_with_symbol";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0U(A00, r1, r3);
        C63573Ko.A0A(A00, r1, "remote_resource", r3);
        C63573Ko.A0B(A00, A02, "remote_message_sender_jid_row_id", r3);
        C63573Ko.A0C(A00, A02, "remote_message_from_me", r3);
        C63573Ko.A0D(A00, r1, "remote_message_key", r3);
        r7.A0B("message_payment", r3);
    }
}
