package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1OL  reason: invalid class name */
public final class AnonymousClass1OL implements AnonymousClass1OJ {
    public final C25921Ie A00;
    public final C25931If A01;

    public AnonymousClass1OL(C25921Ie r2, C25931If r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public Object Bot(C107995Rt r5, C023509x r6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AnonymousClass0AR.A02;
        AnonymousClass0AR r3 = new AnonymousClass0AR(1, AnonymousClass0AA.A01(r6));
        r3.A0J();
        this.A01.registerObserver(new C144306ry(this, r3));
        C25921Ie r2 = this.A00;
        if (!r2.A04()) {
            r2.A02(8);
            r2.A03(true);
        }
        return r3.A0G();
    }
}
