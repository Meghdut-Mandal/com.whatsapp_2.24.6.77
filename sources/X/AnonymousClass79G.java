package X;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.79G  reason: invalid class name */
public class AnonymousClass79G extends AbstractExecutorService {
    public final String A00 = "SerialExecutor";
    public final BlockingQueue A01;
    public final AtomicInteger A02;
    public final AnonymousClass759 A03;
    public final Executor A04;
    public final AtomicInteger A05;
    public volatile int A06;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public AnonymousClass79G(BlockingQueue blockingQueue, Executor executor) {
        this.A04 = executor;
        this.A06 = 1;
        this.A01 = blockingQueue;
        this.A03 = new AnonymousClass759((Object) this, 44);
        this.A02 = new AtomicInteger(0);
        this.A05 = new AtomicInteger(0);
    }

    public static void A00(AnonymousClass79G r5) {
        AtomicInteger atomicInteger = r5.A02;
        while (true) {
            int i = atomicInteger.get();
            if (i < r5.A06) {
                int i2 = i + 1;
                Class<AnonymousClass79G> cls = AnonymousClass79G.class;
                if (atomicInteger.compareAndSet(i, i2)) {
                    C132886Vq.A00(cls, r5.A00, Integer.valueOf(i2), Integer.valueOf(r5.A06), "%s: starting worker %d of %d");
                    r5.A04.execute(r5.A03);
                    return;
                }
                C132886Vq.A02(cls, r5.A00, "%s: race in startWorkerIfNeeded; retrying");
            } else {
                return;
            }
        }
    }

    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        BlockingQueue blockingQueue = this.A01;
        if (blockingQueue.offer(runnable)) {
            int size = blockingQueue.size();
            AtomicInteger atomicInteger = this.A05;
            int i = atomicInteger.get();
            if (size > i && atomicInteger.compareAndSet(i, size)) {
                C132886Vq.A01(AnonymousClass79G.class, this.A00, Integer.valueOf(size), "%s: max pending work in queue = %d");
            }
            A00(this);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append(" queue is full, size=");
        throw new RejectedExecutionException(C36381kD.A10(A0u, blockingQueue.size()));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AnonymousClass001.A0D();
    }

    public void shutdown() {
        throw AnonymousClass001.A0D();
    }

    public List shutdownNow() {
        throw AnonymousClass001.A0D();
    }
}
