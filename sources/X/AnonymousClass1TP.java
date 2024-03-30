package X;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1TP  reason: invalid class name */
public abstract class AnonymousClass1TP extends AnonymousClass1GM {
    public final C20810yC A00;

    /* renamed from: A0A */
    public synchronized C101334xN A04(C101334xN r6, AnonymousClass3T1 r7) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A00.get();
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int max = Math.max(1, Math.min(10, C20800yB.A00(C21000yV.A02, this.A00, 49)));
        if (corePoolSize != max) {
            if (max > corePoolSize) {
                threadPoolExecutor.setMaximumPoolSize(max);
                threadPoolExecutor.setCorePoolSize(max);
            } else {
                threadPoolExecutor.setCorePoolSize(max);
                threadPoolExecutor.setMaximumPoolSize(max);
            }
        }
        return (C101334xN) super.A04(r7, r6);
    }

    public AnonymousClass1TP(C20810yC r4, C19770wU r5) {
        super(new C18910u1((Object) null, new C36251k0(r5, 13)));
        this.A00 = r4;
    }
}
