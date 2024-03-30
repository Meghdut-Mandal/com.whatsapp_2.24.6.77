package X;

/* renamed from: X.3ib  reason: invalid class name and case insensitive filesystem */
public final class C72573ib implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_media_interactive_annotation_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_index ON message_media_interactive_annotation (message_row_id, sort_order)");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[12];
        C52502pX A012 = C52502pX.A01(A01);
        boolean A0f = C63573Ko.A0f(A01, A012, r3);
        C63573Ko.A0Q(A01, A012, "message_row_id", r3, A0f ? 1 : 0);
        r3[2] = C63573Ko.A04(A01, A012, "skip_confirmation", 0, A0f);
        A01.A02 = "location_latitude";
        C52502pX r1 = C52502pX.REAL;
        C63573Ko.A0U(A01, r1, r3);
        C63573Ko.A0A(A01, r1, "location_longitude", r3);
        A01.A02 = "location_name";
        C52502pX r12 = C52502pX.TEXT;
        A01.A00 = r12;
        C63573Ko.A0d(A01, r3);
        C63573Ko.A0C(A01, A012, "newsletter_jid_row_id", r3);
        C63573Ko.A0D(A01, A012, "newsletter_server_message_id", r3);
        C63573Ko.A0E(A01, r12, "newsletter_name", r3);
        C63573Ko.A0F(A01, A012, "newsletter_content_type", r3);
        C63573Ko.A0G(A01, r12, "newsletter_accessibility_text", r3);
        C63573Ko.A0H(A01, A012, "sort_order", r3);
        r8.A0B("message_media_interactive_annotation", r3);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        C63843Lq.A02(r5, "message_media", "message_media_interactive_annotation");
    }
}
