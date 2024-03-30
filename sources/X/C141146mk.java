package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.6mk  reason: invalid class name and case insensitive filesystem */
public class C141146mk implements C159087in {
    public final CountDownLatch A00 = C90484aE.A0u();
    public volatile C125135zN A01;

    public void cancel() {
        C125135zN r2 = this.A01;
        if (r2 != null) {
            r2.A0Q = true;
            C160937lp r0 = r2.A09;
            if (r0 != null) {
                r0.cancel();
            }
            AnonymousClass6V3 r1 = r2.A06;
            if (r1 != null) {
                r1.A0G = true;
            }
            AnonymousClass6ED r02 = r2.A05;
            if (r02 != null) {
                r02.A00();
            }
            this.A01 = null;
        }
    }

    public void BxQ() {
        this.A00.await();
    }

    public C141146mk(C125135zN r2) {
        this.A01 = r2;
    }
}
