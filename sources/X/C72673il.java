package X;

/* renamed from: X.3il  reason: invalid class name and case insensitive filesystem */
public final class C72673il implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        C63843Lq.A02(r5, "message_quoted", "message_quoted_call_log");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0p = C63573Ko.A0p(A01);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0h = C63573Ko.A0h(A01, r2, A0p);
        A01.A02 = "video_call";
        C63573Ko.A0V(A01, C52502pX.BOOLEAN, A0p, A0h ? 1 : 0);
        C63573Ko.A08(A01, r2, "call_result", A0p);
        r7.A0B("message_quoted_call_log", A0p);
    }
}
