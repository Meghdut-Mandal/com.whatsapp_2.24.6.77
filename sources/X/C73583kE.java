package X;

/* renamed from: X.3kE  reason: invalid class name and case insensitive filesystem */
public class C73583kE implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_add_on_poll_vote_selected_option_message_add_on_row_id_index", "CREATE INDEX IF NOT EXISTS message_add_on_poll_vote_selected_option_message_add_on_row_id_index ON message_add_on_poll_vote_selected_option (message_add_on_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message_add_on", "message_add_on_poll_vote_selected_option", "message_add_on_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "message_add_on_row_id", A0l, C63573Ko.A0g(A00, r2, A0l) ? 1 : 0);
        C63573Ko.A08(A00, r2, "message_poll_option_id", A0l);
        r7.A0B("message_add_on_poll_vote_selected_option", A0l);
    }
}
