package X;

/* renamed from: X.3iZ  reason: invalid class name and case insensitive filesystem */
public class C72553iZ implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_link_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_link_index ON message_link (message_row_id, link_index)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A01(r6, "message_link");
        C63843Lq.A05(r6, "chat", "message_link", "chat_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "chat_row_id", A0m, C63573Ko.A0g(A00, r2, A0m) ? 1 : 0);
        C63573Ko.A08(A00, r2, "message_row_id", A0m);
        C63573Ko.A09(A00, r2, "link_index", A0m);
        r7.A0B("message_link", A0m);
    }
}
