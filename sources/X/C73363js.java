package X;

/* renamed from: X.3js  reason: invalid class name and case insensitive filesystem */
public class C73363js implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_quoted_vcard_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_quoted_vcard_index ON message_quoted_vcard (message_row_id, vcard)");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_quoted", "message_quoted_vcard");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "message_row_id", A0l, C63573Ko.A0g(A00, r2, A0l) ? 1 : 0);
        A00.A02 = "vcard";
        C63573Ko.A0T(A00, C52502pX.TEXT, A0l);
        r7.A0B("message_quoted_vcard", A0l);
    }
}
