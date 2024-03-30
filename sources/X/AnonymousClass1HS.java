package X;

/* renamed from: X.1HS  reason: invalid class name */
public class AnonymousClass1HS {
    public final C002000v A00 = new C002000v(1000);
    public final C002000v A01 = new C002000v(1000);

    public void A00(C107265Nh r4) {
        C002000v r2 = this.A01;
        synchronized (r2) {
            r2.A08(Long.valueOf(r4.A02()), r4);
        }
        C002000v r1 = this.A00;
        synchronized (r1) {
            r1.A08(r4.A04, r4);
        }
    }

    public void A01(C107265Nh r4) {
        C002000v r2 = this.A01;
        synchronized (r2) {
            r2.A05(Long.valueOf(r4.A02()));
        }
        C002000v r1 = this.A00;
        synchronized (r1) {
            r1.A05(r4.A04);
        }
    }
}
