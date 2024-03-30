package X;

/* renamed from: X.3k3  reason: invalid class name and case insensitive filesystem */
public class C73473k3 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "suggested_replies", "message_row_id=old._id OR customer_message_row_id=old._id");
        r6.A08("suggested_replies_delete_oldest_trigger", "CREATE TRIGGER IF NOT EXISTS suggested_replies_delete_oldest_trigger BEFORE INSERT ON suggested_replies FOR EACH ROW WHEN (SELECT COUNT(*) FROM suggested_replies ) > 2000 BEGIN DELETE FROM suggested_replies WHERE message_row_id = (SELECT MIN(message_row_id) FROM suggested_replies); END;");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0R(A00, r2, "customer_message_row_id", A0q, C63573Ko.A0i(A00, r2, A0q));
        A00.A02 = "tokenized_customer_message";
        C63573Ko.A0T(A00, C52502pX.STRING, A0q);
        A00.A02 = "customer_message_embedding";
        C63573Ko.A0U(A00, C52502pX.BLOB, A0q);
        r7.A0B("suggested_replies", A0q);
    }
}
