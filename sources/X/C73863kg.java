package X;

/* renamed from: X.3kg  reason: invalid class name and case insensitive filesystem */
public class C73863kg implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("subgroup_raw_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS subgroup_raw_jid_index ON subgroup_info (subgroup_raw_jid)");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[5];
        A00.A02 = "subgroup_raw_jid";
        C52502pX r1 = C52502pX.TEXT;
        A00.A00 = r1;
        C63573Ko.A0b(A00, r4);
        C63573Ko.A0R(A00, r1, "subject", r4, true);
        A00.A02 = "subject_ts";
        C52502pX r2 = C52502pX.INTEGER;
        A00.A00 = r2;
        r4[2] = A00.A0r();
        r4[3] = C63573Ko.A04(A00, r2, "group_type", 2, true);
        C63573Ko.A0A(A00, r2, "group_membership_approval_state", r4);
        r8.A0B("subgroup_info", r4);
    }
}
