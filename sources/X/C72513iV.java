package X;

/* renamed from: X.3iV  reason: invalid class name and case insensitive filesystem */
public class C72513iV implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "message_ephemeral_setting", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[6];
        C52502pX A02 = C52502pX.A02(A00);
        C63573Ko.A0Q(A00, A02, "setting_duration", r3, C63573Ko.A0i(A00, A02, r3) ? 1 : 0);
        C63573Ko.A08(A00, A02, "setting_reason", r3);
        A00.A02 = "user_jid_row_id_csv";
        C63573Ko.A0U(A00, C52502pX.TEXT, r3);
        C63573Ko.A0A(A00, A02, "ephemeral_trigger", r3);
        C63573Ko.A0B(A00, A02, "ephemeral_initiated_by_me", r3);
        r7.A0B("message_ephemeral_setting", r3);
    }
}
