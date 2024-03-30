package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Acc  reason: case insensitive filesystem */
public class C21906Acc extends FutureTask implements C17880sD {
    public final C200859iM A00 = new C200859iM();

    public void B0P(Runnable runnable, Executor executor) {
        C200859iM r2 = this.A00;
        C20740y5.A04(runnable, "Runnable was null.");
        C20740y5.A04(executor, "Executor was null.");
        synchronized (r2) {
            if (!r2.A01) {
                r2.A00 = new C192949Jg(r2.A00, runnable, executor);
            } else {
                C200859iM.A00(runnable, executor);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r0 = r1.A00;
        r1.A00 = r2;
        r2 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r2 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        X.C200859iM.A00(r2.A01, r2.A02);
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void done() {
        /*
            r4 = this;
            X.9iM r3 = r4.A00
            monitor-enter(r3)
            boolean r0 = r3.A01     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            return
        L_0x0009:
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x0028 }
            X.9Jg r1 = r3.A00     // Catch:{ all -> 0x0028 }
            r2 = 0
            r3.A00 = r2     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
        L_0x0012:
            if (r1 == 0) goto L_0x001b
            X.9Jg r0 = r1.A00
            r1.A00 = r2
            r2 = r1
            r1 = r0
            goto L_0x0012
        L_0x001b:
            if (r2 == 0) goto L_0x0027
            java.lang.Runnable r1 = r2.A01
            java.util.concurrent.Executor r0 = r2.A02
            X.C200859iM.A00(r1, r0)
            X.9Jg r2 = r2.A00
            goto L_0x001b
        L_0x0027:
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21906Acc.done():void");
    }

    public C21906Acc(Callable callable) {
        super(callable);
    }

    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos > 2147483647999999999L) {
            j = Math.min(nanos, 2147483647999999999L);
            timeUnit = TimeUnit.NANOSECONDS;
        }
        return super.get(j, timeUnit);
    }
}
