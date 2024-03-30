package X;

/* renamed from: X.3iO  reason: invalid class name and case insensitive filesystem */
public class C72443iO implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("mentions_index", "CREATE UNIQUE INDEX IF NOT EXISTS mentions_index ON message_mentions (message_row_id, jid_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_mentions");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "message_row_id", A0m, C63573Ko.A0g(A00, r2, A0m) ? 1 : 0);
        C63573Ko.A08(A00, r2, "jid_row_id", A0m);
        A00.A02 = "display_name";
        C63573Ko.A0U(A00, C52502pX.STRING, A0m);
        r7.A0B("message_mentions", A0m);
    }
}
