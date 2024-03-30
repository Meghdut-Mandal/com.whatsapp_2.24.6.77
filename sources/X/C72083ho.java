package X;

/* renamed from: X.3ho  reason: invalid class name and case insensitive filesystem */
public final class C72083ho implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r3 = new C64563Om[3];
        A01.A02 = "chat_row_id";
        boolean A0h = C63573Ko.A0h(A01, C52502pX.INTEGER, r3);
        A01.A02 = "pip_enabled";
        C52502pX r1 = C52502pX.BOOLEAN;
        A01.A00 = r1;
        A01.A0u(0);
        C63573Ko.A0e(A01, r3, A0h ? 1 : 0);
        C63573Ko.A08(A01, r1, "welcome_request_message_sent", r3);
        r8.A0B("bot_chat_info", r3);
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A08("chat_bd_for_bot_chat_info_trigger", "CREATE TRIGGER chat_bd_for_bot_chat_info_trigger BEFORE DELETE ON chat BEGIN DELETE FROM bot_chat_info WHERE chat_row_id = old._id; END");
    }
}
