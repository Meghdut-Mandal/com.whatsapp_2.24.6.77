package X;

/* renamed from: X.3id  reason: invalid class name and case insensitive filesystem */
public class C72593id implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_media_vcard_count_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_vcard_count_index ON message_media_vcard_count(message_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_media", "message_media_vcard_count");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0l = C63573Ko.A0l(A00);
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A00, r2, "message_row_id", A0l, C63573Ko.A0g(A00, r2, A0l) ? 1 : 0);
        C63573Ko.A08(A00, r2, "count", A0l);
        r7.A0B("message_media_vcard_count", A0l);
    }
}
