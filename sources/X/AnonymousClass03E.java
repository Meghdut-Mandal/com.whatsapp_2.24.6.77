package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.03E  reason: invalid class name */
public final class AnonymousClass03E extends C005502l implements C005702n {
    public static final AtomicIntegerFieldUpdater A05 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass03E.class, "runningWorkers");
    public final int A00;
    public final Object A01;
    public final C005502l A02;
    public final AnonymousClass036 A03;
    public final /* synthetic */ C005702n A04;
    public volatile int runningWorkers;

    public AnonymousClass03l BL6(Runnable runnable, C005102h r3, long j) {
        return this.A04.BL6(runnable, r3, j);
    }

    public void BpP(AnonymousClass0AP r2, long j) {
        this.A04.BpP(r2, j);
    }

    public static final Runnable A00(AnonymousClass03E r4) {
        Runnable runnable;
        while (true) {
            AnonymousClass036 r3 = r4.A03;
            runnable = (Runnable) r3.A01();
            if (runnable != null) {
                break;
            }
            synchronized (r4.A01) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
                atomicIntegerFieldUpdater.decrementAndGet(r4);
                if (r3.A00() == 0) {
                    runnable = null;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(r4);
                }
            }
        }
        return runnable;
    }

    public void A02(Runnable runnable, C005102h r6) {
        boolean z;
        Runnable A002;
        this.A03.A02(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
        int i = atomicIntegerFieldUpdater.get(this);
        int i2 = this.A00;
        if (i < i2) {
            synchronized (this.A01) {
                if (atomicIntegerFieldUpdater.get(this) >= i2) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (z && (A002 = A00(this)) != null) {
                this.A02.A02(new C11700gr(A002, this), this);
            }
        }
    }

    public void A03(Runnable runnable, C005102h r6) {
        boolean z;
        Runnable A002;
        this.A03.A02(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A05;
        int i = atomicIntegerFieldUpdater.get(this);
        int i2 = this.A00;
        if (i < i2) {
            synchronized (this.A01) {
                if (atomicIntegerFieldUpdater.get(this) >= i2) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (z && (A002 = A00(this)) != null) {
                this.A02.A03(new C11700gr(A002, this), this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = (X.C005702n) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass03E(X.C005502l r2, int r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.A02 = r2
            r1.A00 = r3
            boolean r0 = r2 instanceof X.C005702n
            if (r0 == 0) goto L_0x000f
            X.02n r2 = (X.C005702n) r2
            if (r2 != 0) goto L_0x0011
        L_0x000f:
            X.02n r2 = X.AnonymousClass03F.A00
        L_0x0011:
            r1.A04 = r2
            X.036 r0 = new X.036
            r0.<init>()
            r1.A03 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03E.<init>(X.02l, int):void");
    }

    public C005502l A01(int i) {
        AnonymousClass03D.A00(i);
        if (i >= this.A00) {
            return this;
        }
        AnonymousClass03D.A00(i);
        return new AnonymousClass03E(this, i);
    }
}
