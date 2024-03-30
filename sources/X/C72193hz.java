package X;

/* renamed from: X.3hz  reason: invalid class name and case insensitive filesystem */
public final class C72193hz implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A05(r6, "chat", "community_chat", "chat_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[5];
        A00.A02 = "chat_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0i = C63573Ko.A0i(A00, r2, r3);
        C63573Ko.A0Q(A00, r2, "last_activity_ts", r3, A0i ? 1 : 0);
        C63573Ko.A08(A00, r2, "last_activity_seen_ts", r3);
        C63573Ko.A09(A00, r2, "join_ts", r3);
        C63573Ko.A07(A00, r2, "closed", A0i);
        C63573Ko.A0c(A00, r3);
        r7.A0B("community_chat", r3);
    }
}
