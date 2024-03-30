package X;

/* renamed from: X.3j7  reason: invalid class name and case insensitive filesystem */
public class C72893j7 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_system_linked_group_call");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, A0q);
        A00.A02 = "call_id";
        C63573Ko.A0V(A00, C52502pX.TEXT, A0q, A0i ? 1 : 0);
        C63573Ko.A08(A00, r2, "is_video_call", A0q);
        C63573Ko.A09(A00, r2, "call_type", A0q);
        r7.A0B("message_system_linked_group_call", A0q);
    }
}
