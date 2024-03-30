package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9LU  reason: invalid class name */
public final class AnonymousClass9LU {
    public final AnonymousClass007 A00 = new AnonymousClass007(0);
    public final AnonymousClass007 A01 = new AnonymousClass007(0);
    public final AnonymousClass007 A02 = new AnonymousClass007(0);
    public final ExecutorService A03;

    public AnonymousClass9LU() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A03 = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
