package X;

/* renamed from: X.3iA  reason: invalid class name and case insensitive filesystem */
public class C72303iA implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("group_notification_version_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_notification_version_index ON group_notification_version (group_jid_row_id)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[4];
        A00.A02 = "group_jid_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, r3);
        C63573Ko.A0R(A00, r2, "subject_timestamp", r3, A0i);
        C63573Ko.A0S(A00, r2, "announcement_version", r3, A0i);
        A00.A02 = "participant_version";
        C63573Ko.A0Z(A00, r2, r3, A0i);
        r7.A0B("group_notification_version", r3);
    }
}
