package X;

/* renamed from: X.3jl  reason: invalid class name and case insensitive filesystem */
public class C73293jl implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "quick_replies", "quick_reply_usage", "quick_reply_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0m = C63573Ko.A0m(A00);
        C52502pX r2 = C52502pX.INTEGER;
        boolean A0g = C63573Ko.A0g(A00, r2, A0m);
        A00.A02 = "quick_reply_id";
        C63573Ko.A0W(A00, C52502pX.TEXT, A0m, A0g);
        A00.A02 = "usage_date";
        C63573Ko.A0T(A00, C52502pX.DATE, A0m);
        C63573Ko.A09(A00, r2, "usage_count", A0m);
        r7.A0B("quick_reply_usage", A0m);
    }
}
