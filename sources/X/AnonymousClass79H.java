package X;

import android.os.Handler;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.79H  reason: invalid class name */
public class AnonymousClass79H extends AbstractExecutorService implements ScheduledExecutorService {
    public static AnonymousClass79H A01;
    public final Handler A00 = C36341k9.A0H();

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        AnonymousClass77D r2 = new AnonymousClass77D(handler, (Object) null, runnable);
        handler.postDelayed(r2, timeUnit.toMillis(j));
        return r2;
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        Objects.requireNonNull(runnable);
        AnonymousClass77D r0 = new AnonymousClass77D(this.A00, (Object) null, runnable);
        execute(r0);
        return r0;
    }

    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return new AnonymousClass77D(this.A00, callable);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw AnonymousClass001.A0D();
    }

    public void execute(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0D();
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0D();
    }

    public void shutdown() {
        throw AnonymousClass001.A0D();
    }

    public List shutdownNow() {
        throw AnonymousClass001.A0D();
    }

    public /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new AnonymousClass77D(this.A00, obj, runnable);
    }

    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        AnonymousClass77D r2 = new AnonymousClass77D(handler, callable);
        handler.postDelayed(r2, timeUnit.toMillis(j));
        return r2;
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        Objects.requireNonNull(runnable);
        AnonymousClass77D r0 = new AnonymousClass77D(this.A00, obj, runnable);
        execute(r0);
        return r0;
    }

    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        Objects.requireNonNull(callable);
        AnonymousClass77D r0 = new AnonymousClass77D(this.A00, callable);
        execute(r0);
        return r0;
    }
}
