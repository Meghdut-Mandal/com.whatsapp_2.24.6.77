package X;

import java.util.Map;

/* renamed from: X.9Ue  reason: invalid class name and case insensitive filesystem */
public class C195409Ue {
    public AnonymousClass67E A00;
    public Map A01;
    public C183788rM A02;
    public final int A03;
    public final C198559dm A04 = new C198559dm();
    public final C22925Ayb A05;
    public final AnonymousClass7gK A06;
    public volatile boolean A07 = false;

    public synchronized void A00() {
        if (this.A07) {
            this.A07 = false;
            C183788rM r0 = this.A02;
            C18740tg.A06(r0);
            r0.interrupt();
            this.A02 = null;
        }
    }

    public synchronized void A01() {
        if (!this.A07) {
            this.A07 = true;
            C183788rM r0 = new C183788rM(this);
            this.A02 = r0;
            r0.start();
        }
    }

    public C195409Ue(C22925Ayb ayb, AnonymousClass7gK r3, int i) {
        this.A03 = i;
        this.A06 = r3;
        this.A05 = ayb;
    }
}
