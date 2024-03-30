package X;

/* renamed from: X.3kn  reason: invalid class name and case insensitive filesystem */
public final class C73933kn implements AnonymousClass15z {
    public static String[] A00 = {"pin_in_chat_state", "sender_timestamp"};

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_add_on_pin_in_chat_state_index", "CREATE INDEX IF NOT EXISTS message_add_on_pin_in_chat_state_index ON message_add_on_pin_in_chat (pin_in_chat_state)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "message_add_on", "message_add_on_pin_in_chat", "message_add_on_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] r3 = new C64563Om[3];
        A01.A02 = "message_add_on_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0h = C63573Ko.A0h(A01, r2, r3);
        C63573Ko.A07(A01, r2, "pin_in_chat_state", A0h);
        C63573Ko.A0e(A01, r3, A0h ? 1 : 0);
        C63573Ko.A08(A01, r2, "sender_timestamp", r3);
        r7.A0B("message_add_on_pin_in_chat", r3);
    }
}
