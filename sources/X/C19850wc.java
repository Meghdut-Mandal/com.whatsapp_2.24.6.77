package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0wc  reason: invalid class name and case insensitive filesystem */
public class C19850wc implements RejectedExecutionHandler {
    public final AtomicBoolean A00 = new AtomicBoolean();

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C19700wN r2;
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (!this.A00.getAndSet(true) && (r2 = C19780wV.A04) != null) {
            r2.A0E("waworkers-task-queued", String.valueOf(threadPoolExecutor.getActiveCount()), true);
        }
    }
}
