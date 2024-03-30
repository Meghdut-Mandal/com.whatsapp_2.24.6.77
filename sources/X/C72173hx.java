package X;

/* renamed from: X.3hx  reason: invalid class name and case insensitive filesystem */
public final class C72173hx implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "chat", "chat_ephemeral", "chat_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] r3 = new C64563Om[3];
        A01.A02 = "chat_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        C63573Ko.A0Q(A01, r2, "ephemeral_trigger", r3, C63573Ko.A0h(A01, r2, r3) ? 1 : 0);
        A01.A02 = "ephemeral_initiated_by_me";
        C63573Ko.A0T(A01, C52502pX.BOOLEAN, r3);
        r7.A0B("chat_ephemeral", r3);
    }
}
