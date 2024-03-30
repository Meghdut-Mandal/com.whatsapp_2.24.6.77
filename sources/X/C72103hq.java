package X;

/* renamed from: X.3hq  reason: invalid class name and case insensitive filesystem */
public final class C72103hq implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] A0q = C63573Ko.A0q(A01);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0h = C63573Ko.A0h(A01, r2, A0q);
        A01.A02 = "chat_row_id";
        C63573Ko.A0X(A01, r2, A0q, A0h);
        A01.A02 = "prompts";
        C63573Ko.A0T(A01, C52502pX.TEXT, A0q);
        A0q[3] = C63573Ko.A03(A01, r2, "impression_logged", 0);
        r8.A0B("bot_message_prompts", A0q);
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A03(r6, "message", "bot_message_prompts", "message_row_id=old._id");
    }
}
