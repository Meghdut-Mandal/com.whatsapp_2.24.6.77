package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.0g5  reason: invalid class name and case insensitive filesystem */
public final class C11320g5 implements Runnable {
    public final /* synthetic */ C10330e4 A00;

    public C11320g5(C10330e4 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C10330e4 r0 = this.A00;
        Lock lock = r0.A0B;
        lock.lock();
        try {
            C10330e4.A02(r0);
        } finally {
            lock.unlock();
        }
    }
}
