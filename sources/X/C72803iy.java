package X;

/* renamed from: X.3iy  reason: invalid class name and case insensitive filesystem */
public class C72803iy implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_system_chat_participant_index", "CREATE INDEX IF NOT EXISTS message_system_chat_participant_index ON message_system_chat_participant (message_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_system_chat_participant");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0o = C63573Ko.A0o(A00);
        C52502pX r2 = C52502pX.INTEGER;
        A00.A00 = r2;
        A0o[0] = A00.A0r();
        A0o[1] = C63573Ko.A02(A00, r2, "user_jid_row_id");
        r7.A0B("message_system_chat_participant", A0o);
    }
}
