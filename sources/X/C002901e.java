package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.01e  reason: invalid class name and case insensitive filesystem */
public class C002901e implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final /* synthetic */ C002801d A01;

    public C002901e(C002801d r3) {
        this.A01 = r3;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.A00.getAndIncrement())}));
        return thread;
    }
}
