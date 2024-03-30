package X;

/* renamed from: X.3jb  reason: invalid class name and case insensitive filesystem */
public class C73193jb implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "payment_background", "payment_background_order", "background_id=old.background_id");
    }

    public void B7q(AnonymousClass38H r5, C65063Qo r6) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[2];
        A00.A02 = "background_id";
        boolean A0i = C63573Ko.A0i(A00, C52502pX.TEXT, r2);
        A00.A02 = "background_order";
        C63573Ko.A0V(A00, C52502pX.INTEGER, r2, A0i ? 1 : 0);
        r6.A0B("payment_background_order", r2);
    }
}
