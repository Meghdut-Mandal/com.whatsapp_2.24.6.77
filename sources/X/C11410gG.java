package X;

import android.view.View;

/* renamed from: X.0gG  reason: invalid class name and case insensitive filesystem */
public class C11410gG implements Runnable {
    public C03460Fe A00;
    public final /* synthetic */ C09460cP A01;

    public C11410gG(C03460Fe r1, C09460cP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass02T r0;
        C09460cP r2 = this.A01;
        C016307a r1 = r2.A08;
        if (!(r1 == null || (r0 = r1.A03) == null)) {
            r0.Bar(r1);
        }
        View view = (View) r2.A0A;
        if (!(view == null || view.getWindowToken() == null)) {
            C03460Fe r12 = this.A00;
            if (r12.A03()) {
                r2.A0F = r12;
            }
        }
        r2.A0D = null;
    }
}
