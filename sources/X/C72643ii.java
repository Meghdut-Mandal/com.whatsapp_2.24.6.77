package X;

/* renamed from: X.3ii  reason: invalid class name and case insensitive filesystem */
public class C72643ii implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_poll_option_message_row_id_index", "CREATE INDEX IF NOT EXISTS message_poll_option_message_row_id_index ON message_poll_option (message_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_poll", "message_poll_option");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0n = C63573Ko.A0n(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "message_row_id", A0n, C63573Ko.A0g(A00, r2, A0n) ? 1 : 0);
        A00.A02 = "option_sha256";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0T(A00, r1, A0n);
        C63573Ko.A09(A00, r1, "option_name", A0n);
        C63573Ko.A0A(A00, r2, "vote_total", A0n);
        r7.A0B("message_poll_option", A0n);
    }
}
