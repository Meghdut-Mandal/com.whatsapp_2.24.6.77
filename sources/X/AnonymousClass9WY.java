package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9WY  reason: invalid class name */
public class AnonymousClass9WY {
    public C22880Axb A00;
    public long A01 = 5000;
    public Condition A02;
    public final ReentrantLock A03 = new ReentrantLock();

    public void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.await(this.A01, TimeUnit.MILLISECONDS);
            }
            if (this.A02 != null) {
                this.A02 = null;
                C22880Axb axb = this.A00;
                if (axb != null) {
                    axb.Bj9();
                }
            }
            reentrantLock.unlock();
        } catch (InterruptedException e) {
            throw new C21829Ab6("Operation blocker interrupted. ", e);
        } catch (Throwable th) {
            if (this.A02 != null) {
                this.A02 = null;
                C22880Axb axb2 = this.A00;
                if (axb2 != null) {
                    axb2.Bj9();
                }
            }
            reentrantLock.unlock();
            throw th;
        }
    }

    public void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public void A02(long j) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 == null) {
            this.A02 = reentrantLock.newCondition();
            if (j <= 0) {
                j = 5000;
            }
            this.A01 = j;
            reentrantLock.unlock();
            return;
        }
        throw AnonymousClass001.A09("There is already a block condition being used.");
    }
}
