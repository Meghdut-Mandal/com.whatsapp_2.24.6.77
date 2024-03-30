package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1aJ  reason: invalid class name and case insensitive filesystem */
public class C30501aJ {
    public final AnonymousClass187 A00;
    public final ThreadPoolExecutor A01;

    public void A00(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = this.A01;
        if (threadPoolExecutor == null) {
            threadPoolExecutor = this.A00.A00;
        }
        threadPoolExecutor.execute(runnable);
    }

    public C30501aJ(AnonymousClass187 r9, C20810yC r10) {
        ThreadPoolExecutor threadPoolExecutor;
        this.A00 = r9;
        if (C20800yB.A01(C21000yV.A02, r10, 2233)) {
            threadPoolExecutor = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), C81883xn.A00);
        } else {
            threadPoolExecutor = null;
        }
        this.A01 = threadPoolExecutor;
    }
}
