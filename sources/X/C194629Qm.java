package X;

/* renamed from: X.9Qm  reason: invalid class name and case insensitive filesystem */
public final class C194629Qm {
    public final C24611Dc A00 = C165607th.A0a("IndiaUpiPaymentCheckoutMessageReceiver");
    public final C198199d4 A01;

    public C194629Qm(C198199d4 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public void A00(AnonymousClass2bZ r4) {
        C24611Dc r2 = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onMessageReceived - ");
        r2.A04(AnonymousClass000.A0q(r4.A1J.A01, A0u));
        C198199d4 r22 = this.A01;
        if (r22.A01.A0E(7302)) {
            AVb.A00(r22.A07, r4, r22, 23);
        }
    }
}
