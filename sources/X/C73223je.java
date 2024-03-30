package X;

/* renamed from: X.3je  reason: invalid class name and case insensitive filesystem */
public class C73223je implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "played_self_receipt", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, A0q);
        C63573Ko.A0R(A00, r2, "to_jid_row_id", A0q, A0i);
        C63573Ko.A08(A00, r2, "participant_jid_row_id", A0q);
        A00.A02 = "message_id";
        C63573Ko.A0Z(A00, C52502pX.TEXT, A0q, A0i);
        r7.A0B("played_self_receipt", A0q);
    }
}
