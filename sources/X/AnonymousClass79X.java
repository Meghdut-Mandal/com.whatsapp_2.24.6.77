package X;

import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.79X  reason: invalid class name */
public class AnonymousClass79X extends ReentrantLock implements Closeable {
    public final /* synthetic */ AnonymousClass18I this$0;
    public final AtomicLong threadId = new AtomicLong(-1);

    public AnonymousClass79X(AnonymousClass18I r4) {
        this.this$0 = r4;
    }

    private void A00() {
        AtomicLong atomicLong = this.threadId;
        Thread currentThread = Thread.currentThread();
        atomicLong.compareAndSet(-1, currentThread.getId());
        C20700y1 r0 = this.this$0.A02;
        if (r0 != null && r0.A00()) {
            if (getHoldCount() == 0 || this.threadId.get() != currentThread.getId()) {
                Log.e("SignalLock/getLock/trying to acquire lock from a transaction");
                this.this$0.A00.A0E("signal-lock-in-transaction", (String) null, true);
            }
        }
    }

    public void close() {
        unlock();
    }

    public void lock() {
        A00();
        super.lock();
    }

    public boolean tryLock(long j, TimeUnit timeUnit) {
        A00();
        return super.tryLock(j, timeUnit);
    }

    public void unlock() {
        super.unlock();
        if (getHoldCount() == 0) {
            this.threadId.set(-1);
        }
        Iterator it = new LinkedList(this.this$0.A05).iterator();
        while (it.hasNext()) {
            ((CountDownLatch) it.next()).countDown();
        }
    }

    public boolean tryLock() {
        A00();
        return super.tryLock();
    }
}
