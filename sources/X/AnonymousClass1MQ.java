package X;

import android.os.Handler;

/* renamed from: X.1MQ  reason: invalid class name */
public final class AnonymousClass1MQ {
    public final AnonymousClass1MN A00;
    public final AnonymousClass19B A01;
    public final AnonymousClass19W A02;
    public final AnonymousClass00T A03 = new AnonymousClass00U(new AnonymousClass1MR(this));
    public final AnonymousClass00T A04 = new AnonymousClass00U(new AnonymousClass1MS(this));

    public AnonymousClass1MQ(AnonymousClass1MN r3, AnonymousClass19B r4, AnonymousClass19W r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r5, 3);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
    }

    public final void A00() {
        AnonymousClass00T r3 = this.A03;
        AnonymousClass00T r1 = this.A04;
        ((Handler) r3.getValue()).removeCallbacks((Runnable) r1.getValue());
        ((Handler) r3.getValue()).postDelayed((Runnable) r1.getValue(), C10920fR.A00(C06790Vc.A01(AnonymousClass0Nh.SECONDS, 60)));
    }
}
