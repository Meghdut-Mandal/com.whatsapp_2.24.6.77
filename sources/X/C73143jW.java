package X;

/* renamed from: X.3jW  reason: invalid class name and case insensitive filesystem */
public final class C73143jW implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("newsletter_subscribers_by_type_index", "CREATE INDEX IF NOT EXISTS newsletter_subscribers_by_type_index ON newsletter_subscribers (chat_row_id, type_of_fetch)");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A01 = C63573Ko.A01(r9);
        C64563Om[] r3 = new C64563Om[9];
        C52502pX A012 = C52502pX.A01(A01);
        boolean A0h = C63573Ko.A0h(A01, A012, r3);
        C63573Ko.A0R(A01, A012, "chat_row_id", r3, A0h);
        C63573Ko.A08(A01, A012, "jid_row_id", r3);
        A01.A02 = "display_name";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0U(A01, r1, r3);
        C63573Ko.A0A(A01, r1, "profile_picture_direct_path", r3);
        C63573Ko.A0B(A01, A012, "subscription_time", r3);
        r3[6] = C63573Ko.A04(A01, A012, "role", 0, A0h);
        r3[7] = C63573Ko.A04(A01, A012, "type_of_fetch", 0, A0h);
        r3[8] = C63573Ko.A04(A01, A012, "fetched_time", 0, A0h);
        r9.A0B("newsletter_subscribers", r3);
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "newsletter", "newsletter_subscribers", "chat_row_id=old.chat_row_id");
    }
}
