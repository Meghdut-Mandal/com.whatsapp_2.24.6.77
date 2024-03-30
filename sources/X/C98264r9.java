package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.4r9  reason: invalid class name and case insensitive filesystem */
public final class C98264r9 extends C1269266g {
    public final long A00;
    public volatile C130326Kq A01;

    public final C130326Kq A01() {
        RunnableFuture runnableFuture;
        synchronized (this) {
            runnableFuture = this.A00;
        }
        if (runnableFuture == null || runnableFuture.isDone()) {
            return (C130326Kq) A00();
        }
        return this.A01;
    }

    public C98264r9(C130326Kq r1, Callable callable, long j) {
        super(callable);
        this.A01 = r1;
        this.A00 = j;
    }
}
