package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class A1Z implements C22784Avv {
    public final Executor A00;
    public final Executor A01;
    public final Executor A02;
    public final Executor A03;
    public final ScheduledExecutorService A04;

    public A1Z(int i) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2, new AnonymousClass77I("FrescoIoBoundExecutor"));
        AnonymousClass00C.A08(newFixedThreadPool);
        this.A03 = newFixedThreadPool;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(i, new AnonymousClass77I("FrescoDecodeExecutor"));
        AnonymousClass00C.A08(newFixedThreadPool2);
        this.A00 = newFixedThreadPool2;
        ExecutorService newFixedThreadPool3 = Executors.newFixedThreadPool(i, new AnonymousClass77I("FrescoBackgroundExecutor"));
        AnonymousClass00C.A08(newFixedThreadPool3);
        this.A02 = newFixedThreadPool3;
        ExecutorService newFixedThreadPool4 = Executors.newFixedThreadPool(1, new AnonymousClass77I("FrescoLightWeightBackgroundExecutor"));
        AnonymousClass00C.A08(newFixedThreadPool4);
        this.A01 = newFixedThreadPool4;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i, new AnonymousClass77I("FrescoBackgroundExecutor"));
        AnonymousClass00C.A08(newScheduledThreadPool);
        this.A04 = newScheduledThreadPool;
    }
}
