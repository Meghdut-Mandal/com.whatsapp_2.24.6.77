package X;

/* renamed from: X.3kl  reason: invalid class name and case insensitive filesystem */
public class C73913kl implements AnonymousClass15z {
    public static final String[] A00 = {"keep_in_chat_state", "sender_timestamp", "keep_count", "actor_device_jid_row_id"};

    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message_add_on", "message_add_on_keep_in_chat", "message_add_on_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A002 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[5];
        A002.A02 = "message_add_on_row_id";
        C52502pX r3 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A002, r3, r4);
        C63573Ko.A06(A002, r3, "keep_in_chat_state", A0i);
        A002.A01 = "0";
        C63573Ko.A0e(A002, r4, A0i ? 1 : 0);
        C63573Ko.A08(A002, r3, "sender_timestamp", r4);
        C63573Ko.A06(A002, r3, "keep_count", A0i);
        C63573Ko.A0a(A002, "0", r4);
        C63573Ko.A0A(A002, r3, "actor_device_jid_row_id", r4);
        r8.A0B("message_add_on_keep_in_chat", r4);
    }
}
