package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.79U  reason: invalid class name */
public class AnonymousClass79U extends ScheduledThreadPoolExecutor {
    public final /* synthetic */ C19780wV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass79U(C19780wV r1, ThreadFactory threadFactory, int i) {
        super(i, threadFactory);
        this.A00 = r1;
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (runnable instanceof Future) {
            Future future = (Future) runnable;
            if (future.isDone()) {
                try {
                    future.get();
                } catch (InterruptedException unused) {
                } catch (ExecutionException e) {
                    th = e.getCause();
                }
            }
        }
        if (th != null) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
    }
}
