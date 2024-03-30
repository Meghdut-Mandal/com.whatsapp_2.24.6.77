package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.77D  reason: invalid class name */
public class AnonymousClass77D implements RunnableFuture, ScheduledFuture {
    public final Handler A00;
    public final FutureTask A01;

    public boolean cancel(boolean z) {
        return this.A01.cancel(z);
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.A01.isCancelled();
    }

    public boolean isDone() {
        return this.A01.isDone();
    }

    public void run() {
        this.A01.run();
    }

    public AnonymousClass77D(Handler handler, Object obj, Runnable runnable) {
        this.A00 = handler;
        this.A01 = new FutureTask(runnable, obj);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw AnonymousClass001.A0D();
    }

    public long getDelay(TimeUnit timeUnit) {
        throw AnonymousClass001.A0D();
    }

    public AnonymousClass77D(Handler handler, Callable callable) {
        this.A00 = handler;
        this.A01 = new FutureTask(callable);
    }

    public Object get() {
        return this.A01.get();
    }
}
