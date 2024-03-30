package X;

/* renamed from: X.3kD  reason: invalid class name and case insensitive filesystem */
public class C73573kD implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_vcard_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_index ON message_vcard (message_row_id, vcard)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_vcard");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "message_row_id", A0l, C63573Ko.A0g(A00, r2, A0l) ? 1 : 0);
        A00.A02 = "vcard";
        C63573Ko.A0T(A00, C52502pX.TEXT, A0l);
        r7.A0B("message_vcard", A0l);
    }
}
