package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.635  reason: invalid class name */
public class AnonymousClass635 {
    public Object A00;
    public final Condition A01;
    public final ReentrantLock A02;

    public AnonymousClass635() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.A02 = reentrantLock;
        this.A01 = reentrantLock.newCondition();
    }

    public boolean A00(Object obj) {
        boolean z;
        C18740tg.A06(obj);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            if (this.A00 != null) {
                z = false;
            } else {
                this.A00 = obj;
                this.A01.signal();
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }
}
