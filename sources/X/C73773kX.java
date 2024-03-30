package X;

/* renamed from: X.3kX  reason: invalid class name and case insensitive filesystem */
public final class C73773kX implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[8];
        A01.A02 = "group_jid";
        C52502pX r1 = C52502pX.TEXT;
        A01.A00 = r1;
        A01.A04 = true;
        C63573Ko.A0e(A01, r3, 0);
        C63573Ko.A0R(A01, r1, "parent_group_jid", r3, true);
        C63573Ko.A0S(A01, r1, "subject", r3, true);
        C63573Ko.A09(A01, r1, "description", r3);
        C63573Ko.A06(A01, r1, "creator_jid", true);
        C63573Ko.A0c(A01, r3);
        A01.A02 = "request_creation_time";
        C52502pX r12 = C52502pX.INTEGER;
        A01.A00 = r12;
        A01.A04 = true;
        C63573Ko.A0d(A01, r3);
        r3[6] = C63573Ko.A04(A01, r12, "participant_count", 0, true);
        A01.A02 = "is_existing_group";
        A01.A00 = C52502pX.BOOLEAN;
        A01.A04 = true;
        A01.A0u(0);
        r3[7] = A01.A0r();
        r8.A0A("member_suggested_groups_v2", AnonymousClass03T.A03(r3), AnonymousClass03T.A03("PRIMARY KEY (parent_group_jid,group_jid,creator_jid)"));
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
