package X;

/* renamed from: X.3kS  reason: invalid class name and case insensitive filesystem */
public class C73723kS implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("group_relationship_parent_raw_jid_index", "CREATE INDEX IF NOT EXISTS group_relationship_parent_raw_jid_index ON group_relationship (parent_raw_jid)");
        r5.A07("group_relationship_subgroup_raw_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_relationship_subgroup_raw_jid_index ON group_relationship (subgroup_raw_id)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[2];
        A00.A02 = "parent_raw_jid";
        C52502pX r2 = C52502pX.TEXT;
        A00.A00 = r2;
        C63573Ko.A0b(A00, r3);
        C63573Ko.A0R(A00, r2, "subgroup_raw_id", r3, true);
        r7.A0B("group_relationship", r3);
    }
}
