package X;

/* renamed from: X.3kQ  reason: invalid class name and case insensitive filesystem */
public final class C73703kQ implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("request_creation_time_index", " CREATE INDEX IF NOT EXISTS request_creation_time_index ON group_membership_approval_requests(request_creation_time);");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[6];
        A01.A02 = "group_jid";
        C52502pX r2 = C52502pX.TEXT;
        A01.A00 = r2;
        A01.A04 = true;
        C63573Ko.A0e(A01, r3, 0);
        C63573Ko.A0R(A01, r2, "requester_jid", r3, true);
        C63573Ko.A0S(A01, r2, "request_method", r3, true);
        A01.A02 = "request_creation_time";
        C63573Ko.A0U(A01, C52502pX.INTEGER, r3);
        C63573Ko.A0A(A01, r2, "parent_group_jid", r3);
        C63573Ko.A0B(A01, r2, "requested_by_jid", r3);
        r8.A0A("group_membership_approval_requests", AnonymousClass03T.A03(r3), AnonymousClass03T.A03("PRIMARY KEY (group_jid,requester_jid)"));
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}