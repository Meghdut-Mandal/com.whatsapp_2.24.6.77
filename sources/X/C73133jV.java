package X;

/* renamed from: X.3jV  reason: invalid class name and case insensitive filesystem */
public final class C73133jV implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("newsletter_my_reaction_orphan_message_index", "CREATE UNIQUE INDEX IF NOT EXISTS newsletter_my_reaction_orphan_message_index ON newsletter_my_reaction_orphan_message (chat_row_id, server_message_id)");
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] r3 = new C64563Om[7];
        C52502pX A012 = C52502pX.A01(A01);
        boolean A0f = C63573Ko.A0f(A01, A012, r3);
        C63573Ko.A0R(A01, A012, "chat_row_id", r3, A0f);
        C63573Ko.A0S(A01, A012, "server_message_id", r3, A0f);
        A01.A02 = "reaction_from_me";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0U(A01, r1, r3);
        C63573Ko.A0A(A01, A012, "reactions_from_me_ts", r3);
        C63573Ko.A0B(A01, r1, "votes_from_me", r3);
        C63573Ko.A0C(A01, A012, "votes_from_me_ts", r3);
        r7.A0B("newsletter_my_reaction_orphan_message", r3);
    }
}
