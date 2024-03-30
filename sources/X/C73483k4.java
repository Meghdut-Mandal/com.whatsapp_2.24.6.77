package X;

/* renamed from: X.3k4  reason: invalid class name and case insensitive filesystem */
public class C73483k4 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("group_participant_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_participant_device_index ON group_participant_device (group_participant_row_id, device_jid_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A05(r6, "group_participant_user", "group_participant_device", "group_participant_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0n = C63573Ko.A0n(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r2, A0n);
        C63573Ko.A0R(A00, r2, "group_participant_row_id", A0n, A0g);
        C63573Ko.A0S(A00, r2, "device_jid_row_id", A0n, A0g);
        C63573Ko.A09(A00, r2, "sent_sender_key", A0n);
        C63573Ko.A0A(A00, r2, "sent_add_on_sender_key", A0n);
        r7.A0B("group_participant_device", A0n);
    }
}
