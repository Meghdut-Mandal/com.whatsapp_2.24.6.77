package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9QO  reason: invalid class name */
public class AnonymousClass9QO {
    public int A00 = 0;
    public final ReentrantLock A01 = new ReentrantLock();

    public boolean A00() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return AnonymousClass000.A1Q(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }
}
