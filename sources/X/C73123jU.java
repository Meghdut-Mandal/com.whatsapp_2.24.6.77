package X;

/* renamed from: X.3jU  reason: invalid class name and case insensitive filesystem */
public final class C73123jU implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("newsletter_message_index", "CREATE UNIQUE INDEX IF NOT EXISTS newsletter_message_index ON newsletter_message (chat_row_id, server_message_id)");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A01 = C63573Ko.A01(r9);
        C64563Om[] r3 = new C64563Om[9];
        C52502pX A02 = C52502pX.A02(A01);
        boolean A0h = C63573Ko.A0h(A01, A02, r3);
        C63573Ko.A0R(A01, A02, "chat_row_id", r3, A0h);
        C63573Ko.A0S(A01, A02, "server_message_id", r3, A0h);
        r3[3] = C63573Ko.A04(A01, A02, "comments_count", 0, A0h);
        A01.A02 = "reaction_from_me";
        A01.A00 = C52502pX.TEXT;
        C63573Ko.A0c(A01, r3);
        r3[5] = C63573Ko.A04(A01, A02, "extra_newsletter_tables", 0, A0h);
        C63573Ko.A0C(A01, A02, "extra_table_last_update_ts", r3);
        C63573Ko.A0D(A01, A02, "reactions_from_me_ts", r3);
        C63573Ko.A0E(A01, A02, "view_count", r3);
        r9.A0B("newsletter_message", r3);
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "message", "newsletter_message", "message_row_id=old._id");
    }
}
