package X;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.02o  reason: invalid class name and case insensitive filesystem */
public final class C005802o extends C005602m implements C005702n {
    public final Executor A00;

    public void A03(Runnable runnable, C005102h r5) {
        try {
            this.A00.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            C07570Yj.A02(cancellationException, r5);
            C006702x.A01.A03(runnable, r5);
        }
    }

    public AnonymousClass03l BL6(Runnable runnable, C005102h r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    return new C12900iq(schedule);
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C07570Yj.A02(cancellationException, r5);
            }
        }
        return AnonymousClass03J.A00.BL6(runnable, r5, j);
    }

    public void BpP(AnonymousClass0AP r5, long j) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.A00;
        if ((executor instanceof ScheduledExecutorService) && (scheduledExecutorService = (ScheduledExecutorService) executor) != null) {
            C11680gp r1 = new C11680gp(r5, this);
            C005102h context = r5.getContext();
            try {
                ScheduledFuture<?> schedule = scheduledExecutorService.schedule(r1, j, TimeUnit.MILLISECONDS);
                if (schedule != null) {
                    AnonymousClass0AR.A05(new C15160mn(schedule), (AnonymousClass0AR) r5);
                    return;
                }
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                C07570Yj.A02(cancellationException, context);
            }
        }
        AnonymousClass03J.A00.BpP(r5, j);
    }

    public void close() {
        ExecutorService executorService;
        Executor executor = this.A00;
        if ((executor instanceof ExecutorService) && (executorService = (ExecutorService) executor) != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C005802o) || ((C005802o) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public String toString() {
        return this.A00.toString();
    }

    public C005802o(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.A00 = executor;
        try {
            if ((executor instanceof ScheduledThreadPoolExecutor) && (scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor) != null && (method = C05790Rb.A00) != null) {
                method.invoke(scheduledThreadPoolExecutor, new Object[]{true});
            }
        } catch (Throwable unused) {
        }
    }
}
