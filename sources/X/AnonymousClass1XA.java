package X;

/* renamed from: X.1XA  reason: invalid class name */
public class AnonymousClass1XA implements AnonymousClass1X9 {
    public boolean A00;
    public final AnonymousClass1XB A01;
    public final AnonymousClass1EV A02;
    public final AnonymousClass1EU A03;
    public final C24611Dc A04 = C24611Dc.A00("PaymentsLifecycleManager", "network", "COMMON");
    public final AnonymousClass13I A05;

    public synchronized void A00() {
        if (this.A00) {
            this.A04.A06("payments was already initialized");
        } else if (this.A02.A03()) {
            this.A04.A06("initializing payments");
            AnonymousClass1XB r3 = this.A01;
            synchronized (r3) {
                r3.A00 = true;
                r3.A02.A0H(new C35711j8(r3, 48));
            }
            this.A05.registerObserver(this);
            this.A00 = true;
        }
    }

    public synchronized void A01(boolean z, boolean z2) {
        this.A04.A06("reinitializing payments");
        this.A00 = false;
        this.A03.A08(z, z2);
        this.A05.unregisterObserver(this);
        AnonymousClass1XB r3 = this.A01;
        synchronized (r3) {
            r3.A00 = false;
            r3.A02.A0H(new C35711j8(r3, 49));
        }
        A00();
    }

    public void BaM(boolean z) {
        if (z) {
            this.A03.A08(true, false);
        }
    }

    public AnonymousClass1XA(C29221Vu r4, AnonymousClass1XB r5, AnonymousClass1EV r6, AnonymousClass1EU r7, AnonymousClass13I r8) {
        this.A05 = r8;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r5;
        r4.A00 = this;
    }
}
