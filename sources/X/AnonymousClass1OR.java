package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1OR  reason: invalid class name */
public final class AnonymousClass1OR implements AnonymousClass1OJ {
    public final C237819v A00;
    public final C236419g A01;

    public AnonymousClass1OR(C237819v r2, C236419g r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public Object Bot(C107995Rt r5, C023509x r6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        AnonymousClass0AR r2 = new AnonymousClass0AR(1, AnonymousClass0AA.A01(r6));
        r2.A0J();
        C236419g r1 = this.A01;
        if (!r1.A09().isEmpty()) {
            r1.registerObserver(new C145106tM(this, r2));
            r1.A0D("hosted_device_removal_initiated", true);
        } else {
            r2.resumeWith(new C119485pt(C108095Sd.UNKNOWN, true));
        }
        return r2.A0G();
    }
}
