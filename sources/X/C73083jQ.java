package X;

/* renamed from: X.3jQ  reason: invalid class name and case insensitive filesystem */
public final class C73083jQ implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_newsletter_admin_invite_newsletter_jid_row_id_index", "CREATE INDEX IF NOT EXISTS message_newsletter_admin_invite_newsletter_jid_row_id_index ON message_newsletter_admin_invite (newsletter_jid_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        AnonymousClass00C.A0D(r4, 0);
        C63843Lq.A01(r4, "message_newsletter_admin_invite");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0q = C63573Ko.A0q(A01);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0h = C63573Ko.A0h(A01, r2, A0q);
        C63573Ko.A0R(A01, r2, "newsletter_jid_row_id", A0q, A0h);
        A01.A02 = "newsletter_name";
        C63573Ko.A0Y(A01, C52502pX.TEXT, A0q, A0h);
        A01.A02 = "expiration";
        C63573Ko.A0Z(A01, r2, A0q, A0h);
        r7.A0B("message_newsletter_admin_invite", A0q);
    }
}
