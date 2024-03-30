package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.0hO  reason: invalid class name and case insensitive filesystem */
public abstract class C12030hO implements Runnable {
    public final /* synthetic */ C10300e1 A00;

    public /* synthetic */ C12030hO(C10300e1 r1) {
        this.A00 = r1;
    }

    public abstract void A00();

    public final void run() {
        C10300e1 r1 = this.A00;
        Lock lock = r1.A0G;
        lock.lock();
        try {
            if (!Thread.interrupted()) {
                A00();
            }
        } catch (RuntimeException e) {
            AnonymousClass000.A14(r1.A0D.A08, e, 2);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
        lock.unlock();
    }
}
