package X;

import android.os.ConditionVariable;
import java.util.concurrent.Executor;

/* renamed from: X.1jf  reason: invalid class name and case insensitive filesystem */
public class C36041jf extends C19840wb {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C36041jf(java.util.concurrent.BlockingQueue r9, java.util.concurrent.ThreadFactory r10, java.util.concurrent.TimeUnit r11, int r12) {
        /*
            r8 = this;
            r0 = r8
            r8.A00 = r12
            r6 = r9
            r7 = r10
            r5 = r11
            if (r12 == 0) goto L_0x0012
            r1 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 120(0x78, double:5.93E-322)
        L_0x000e:
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
        L_0x0012:
            r1 = 5
            r2 = 128(0x80, float:1.794E-43)
            r3 = 1
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36041jf.<init>(java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.TimeUnit, int):void");
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        if (this.A00 == 0) {
            Executor executor = C19780wV.A07;
        }
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        if (this.A00 == 0) {
            Executor executor = C19780wV.A07;
        }
    }

    public void execute(Runnable runnable) {
        if (this.A00 == 0) {
            Executor executor = C19780wV.A07;
            ConditionVariable conditionVariable = C18740tg.A00;
        }
        super.execute(runnable);
    }
}
