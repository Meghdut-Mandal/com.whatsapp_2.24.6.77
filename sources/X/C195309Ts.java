package X;

/* renamed from: X.9Ts  reason: invalid class name and case insensitive filesystem */
public final class C195309Ts {
    public Runnable A00;
    public final C19770wU A01;

    public synchronized void A00() {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A01.Bnx(runnable);
            this.A00 = null;
        }
    }

    public synchronized void A01(long j) {
        A00();
        this.A00 = this.A01.BpM(new C80303vB(this, j, 3), "LiteCameraView/GarbageCollector", j);
    }

    public C195309Ts(C19770wU r1) {
        this.A01 = r1;
    }
}
