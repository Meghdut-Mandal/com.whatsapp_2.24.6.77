package X;

/* renamed from: X.3jr  reason: invalid class name and case insensitive filesystem */
public class C73353jr implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_quoted");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[12];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0g = C63573Ko.A0g(A00, A02, r3);
        C63573Ko.A0R(A00, A02, "chat_row_id", r3, A0g);
        C63573Ko.A0S(A00, A02, "parent_message_chat_row_id", r3, A0g);
        A00.A02 = "from_me";
        C63573Ko.A0Z(A00, A02, r3, A0g);
        C63573Ko.A0A(A00, A02, "sender_jid_row_id", r3);
        A00.A02 = "key_id";
        C52502pX r1 = C52502pX.TEXT;
        A00.A00 = r1;
        A00.A04 = A0g;
        C63573Ko.A0d(A00, r3);
        C63573Ko.A0C(A00, A02, "timestamp", r3);
        C63573Ko.A0D(A00, A02, "message_type", r3);
        C63573Ko.A0E(A00, A02, "origin", r3);
        C63573Ko.A0F(A00, r1, "text_data", r3);
        C63573Ko.A0G(A00, r1, "payment_transaction_id", r3);
        C63573Ko.A0H(A00, A02, "lookup_tables", r3);
        r8.A0B("message_quoted", r3);
    }
}
