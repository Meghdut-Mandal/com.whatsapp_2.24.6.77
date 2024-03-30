package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.63w  reason: invalid class name and case insensitive filesystem */
public final class C1264163w {
    public long A00 = System.currentTimeMillis();
    public long A01;
    public final long A02;
    public final ConcurrentLinkedQueue A03 = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService A04 = Executors.newSingleThreadScheduledExecutor();

    public C1264163w(long j) {
        this.A02 = j;
    }
}
