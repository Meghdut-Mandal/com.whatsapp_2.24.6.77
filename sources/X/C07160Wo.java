package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0Wo  reason: invalid class name and case insensitive filesystem */
public final class C07160Wo {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C07160Wo.class, "notCompletedCount");
    public final C17990sP[] A00;
    public volatile int notCompletedCount;

    public C07160Wo(C17990sP[] r2) {
        this.A00 = r2;
        this.notCompletedCount = r2.length;
    }

    public final Object A00(C023509x r9) {
        AnonymousClass0AR A02 = AnonymousClass0AA.A02(r9);
        C17990sP[] r7 = this.A00;
        int length = r7.length;
        AnonymousClass0n4[] r4 = new AnonymousClass0n4[length];
        for (int i = 0; i < length; i++) {
            C17990sP r0 = r7[i];
            r0.BuM();
            AnonymousClass0n4 r1 = new AnonymousClass0n4(this, A02);
            r1.A00 = r0.BL4(r1);
            r4[i] = r1;
        }
        C15190mq r2 = new C15190mq(this, r4);
        for (int i2 = 0; i2 < length; i2++) {
            AnonymousClass0n4.A03.set(r4[i2], r2);
        }
        if (!(AnonymousClass0AR.A04.get(A02) instanceof C16560pR)) {
            r2.A05();
        } else {
            AnonymousClass0AR.A05(r2, A02);
        }
        return A02.A0G();
    }
}
