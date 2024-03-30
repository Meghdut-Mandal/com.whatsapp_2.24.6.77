package X;

/* renamed from: X.3kp  reason: invalid class name and case insensitive filesystem */
public class C73953kp implements AnonymousClass15z {
    public static final String[] A00 = {"reaction", "sender_timestamp"};

    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A05(r6, "message_add_on", "message_add_on_reaction", "message_add_on_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A002 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[3];
        A002.A02 = "message_add_on_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A002, r2, r3);
        A002.A02 = "reaction";
        C63573Ko.A0V(A002, C52502pX.TEXT, r3, A0i ? 1 : 0);
        C63573Ko.A08(A002, r2, "sender_timestamp", r3);
        r7.A0B("message_add_on_reaction", r3);
    }
}
