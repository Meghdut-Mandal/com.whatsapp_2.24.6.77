package X;

/* renamed from: X.3i6  reason: invalid class name and case insensitive filesystem */
public final class C72263i6 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        AnonymousClass00C.A0D(r4, 0);
        C63843Lq.A01(r4, "forwarded_newsletter_message_info");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0q = C63573Ko.A0q(A01);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0h = C63573Ko.A0h(A01, r2, A0q);
        C63573Ko.A0R(A01, r2, "newsletter_jid_row_id", A0q, A0h);
        C63573Ko.A0S(A01, r2, "newsletter_server_message_id", A0q, A0h);
        A01.A02 = "newsletter_name";
        A01.A00 = C52502pX.TEXT;
        A01.A04 = A0h;
        C63573Ko.A0a(A01, "''", A0q);
        r7.A0B("forwarded_newsletter_message_info", A0q);
    }
}
