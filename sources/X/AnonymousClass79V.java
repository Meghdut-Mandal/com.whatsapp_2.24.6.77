package X;

import android.text.TextUtils;
import com.facebook.wearable.companion.fury.StellaFury;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.79V  reason: invalid class name */
public class AnonymousClass79V extends ThreadPoolExecutor {
    public final /* synthetic */ AnonymousClass9N4 A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass79V(X.AnonymousClass9N4 r9, java.util.concurrent.BlockingQueue r10, java.util.concurrent.ThreadFactory r11, java.util.concurrent.TimeUnit r12, int r13, int r14, long r15) {
        /*
            r8 = this;
            r0 = r8
            r8.A00 = r9
            r6 = r10
            r7 = r11
            r5 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79V.<init>(X.9N4, java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.TimeUnit, int, int, long):void");
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        String str;
        AnonymousClass00C.A0D(runnable, 0);
        if (th == null) {
            if (runnable instanceof Future) {
                try {
                    ((Future) runnable).get();
                    return;
                } catch (CancellationException e) {
                    if (AnonymousClass6YR.A01.BMH(2)) {
                        AnonymousClass6YR.A01.BxF("CrashingExecutorPolicy", "Runnable is canceled", e);
                        return;
                    }
                    return;
                } catch (ExecutionException e2) {
                    th = e2.getCause();
                    if (th == null) {
                        return;
                    }
                } catch (InterruptedException unused) {
                    C90484aE.A0z();
                    return;
                }
            } else {
                return;
            }
        }
        if ((th instanceof Error) || (th instanceof RuntimeException)) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler == null) {
                str = "Received otherwise fatal exception, but no uncaught exception handler to fire!";
            } else {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
                return;
            }
        } else {
            str = AnonymousClass000.A0l(runnable, "Uncaught checked exception during ", AnonymousClass000.A0u());
        }
        AnonymousClass6YR.A0A("CrashingExecutorPolicy", str, th);
    }

    public void execute(Runnable runnable) {
        String A0k;
        try {
            AnonymousClass00C.A0D(runnable, 0);
            super.execute(StellaFury.INSTANCE.decorateOnSchedule(AnonymousClass6RO.A00(runnable), runnable, 0));
        } catch (RejectedExecutionException e) {
            BlockingQueue<Runnable> queue = getQueue();
            boolean A1V = C36371kC.A1V(queue);
            StringBuilder A0i = C90524aI.A0i("Flushing Executor queue [runnable: count]:\n");
            LinkedHashMap A1G = C36431kI.A1G();
            while (true) {
                Runnable poll = queue.poll();
                if (poll == null) {
                    break;
                }
                if (poll instanceof AnonymousClass79R) {
                    A0k = AnonymousClass6RO.A00(((AnonymousClass79R) poll).A00);
                } else {
                    A0k = AnonymousClass000.A0k(poll);
                }
                AnonymousClass00C.A0B(A0k);
                C36341k9.A1K(A0k, A1G, AnonymousClass000.A0I(A1G.getOrDefault(A0k, Integer.valueOf(A1V ? 1 : 0))) + 1);
            }
            ArrayList A14 = C36441kJ.A14(A1G.size());
            Iterator A0y = AnonymousClass000.A0y(A1G);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append('[');
                C90494aF.A1M(A0u, C90494aF.A0f(A11));
                A0u.append(C90484aE.A0G(A11));
                A14.add(AnonymousClass000.A0t(A0u, ']'));
            }
            AnonymousClass6YR.A05("FWAExecutors", AnonymousClass000.A0q(TextUtils.join("\n", A14), A0i));
            throw e;
        }
    }

    public RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        AnonymousClass00C.A0D(runnable, 0);
        return new AnonymousClass79R(runnable, obj);
    }
}
