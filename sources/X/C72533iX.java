package X;

/* renamed from: X.3iX  reason: invalid class name and case insensitive filesystem */
public class C72533iX implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_ephemeral_expire_timestamp_index", "CREATE INDEX IF NOT EXISTS message_ephemeral_expire_timestamp_index ON message_ephemeral(expire_timestamp)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message", "message_ephemeral", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[6];
        C52502pX A02 = C52502pX.A02(A00);
        boolean A0i = C63573Ko.A0i(A00, A02, r3);
        C63573Ko.A0R(A00, A02, "duration", r3, A0i);
        C63573Ko.A0S(A00, A02, "expire_timestamp", r3, A0i);
        C63573Ko.A07(A00, A02, "keep_in_chat", A0i);
        r3[3] = A00.A0r();
        C63573Ko.A0A(A00, A02, "ephemeral_trigger", r3);
        C63573Ko.A0B(A00, A02, "ephemeral_initiated_by_me", r3);
        r7.A0B("message_ephemeral", r3);
    }
}
