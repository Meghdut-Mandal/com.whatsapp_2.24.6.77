package X;

/* renamed from: X.3iJ  reason: invalid class name and case insensitive filesystem */
public class C72393iJ implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("labeled_messages_index", "CREATE UNIQUE INDEX IF NOT EXISTS labeled_messages_index ON labeled_messages (label_id, message_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "labeled_messages", "message_row_id=old._id");
        C63843Lq.A03(r6, "labels", "labeled_messages", "label_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r2, A0l);
        C63573Ko.A0R(A00, r2, "label_id", A0l, A0g);
        C63573Ko.A0S(A00, r2, "message_row_id", A0l, A0g);
        r7.A0B("labeled_messages", A0l);
    }
}
