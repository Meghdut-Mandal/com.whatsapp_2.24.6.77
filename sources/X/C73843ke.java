package X;

/* renamed from: X.3ke  reason: invalid class name and case insensitive filesystem */
public final class C73843ke implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("user_jid_index", " CREATE INDEX IF NOT EXISTS user_jid_index ON recently_accepted_deeplink_invites (user_jid);");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[3];
        A01.A02 = "user_jid";
        C52502pX r2 = C52502pX.TEXT;
        A01.A00 = r2;
        A01.A04 = true;
        C63573Ko.A0e(A01, r3, 0);
        A01.A02 = "invite_accepted_time";
        C63573Ko.A0V(A01, C52502pX.INTEGER, r3, 1);
        C63573Ko.A08(A01, r2, "invite_receiver_reason", r3);
        r8.A0A("recently_accepted_deeplink_invites", AnonymousClass03T.A03(r3), AnonymousClass03T.A03("PRIMARY KEY (user_jid)"));
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
