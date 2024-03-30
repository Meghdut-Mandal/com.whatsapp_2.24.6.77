package X;

/* renamed from: X.3k5  reason: invalid class name and case insensitive filesystem */
public class C73493k5 implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("group_past_participant_user_timestamp_index", "CREATE INDEX IF NOT EXISTS group_past_participant_user_timestamp_index ON group_past_participant_user (timestamp)");
        r5.A07("group_past_participant_user_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_past_participant_user_index ON group_past_participant_user (group_jid_row_id, user_jid_row_id)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0n = C63573Ko.A0n(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r2, A0n);
        C63573Ko.A0R(A00, r2, "group_jid_row_id", A0n, A0g);
        C63573Ko.A0S(A00, r2, "user_jid_row_id", A0n, A0g);
        A00.A02 = "is_leave";
        C63573Ko.A0Z(A00, r2, A0n, A0g);
        C63573Ko.A0A(A00, r2, "timestamp", A0n);
        r7.A0B("group_past_participant_user", A0n);
    }
}
