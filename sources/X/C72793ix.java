package X;

/* renamed from: X.3ix  reason: invalid class name and case insensitive filesystem */
public class C72793ix implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message_system", "message_system_chat_assignment", "message_row_id=old.message_row_id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0p = C63573Ko.A0p(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, A0p);
        A00.A02 = "agent_name";
        C63573Ko.A0V(A00, C52502pX.TEXT, A0p, A0i ? 1 : 0);
        C63573Ko.A08(A00, r2, "is_unassigned_chat", A0p);
        r7.A0B("message_system_chat_assignment", A0p);
    }
}
