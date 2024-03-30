package X;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.66g  reason: invalid class name and case insensitive filesystem */
public abstract class C1269266g {
    public RunnableFuture A00;
    public Object A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public final Object A00() {
        RunnableFuture runnableFuture;
        Object obj;
        synchronized (this) {
            runnableFuture = this.A00;
            obj = this.A01;
        }
        if (obj != null) {
            return obj;
        }
        if (runnableFuture != null) {
            AtomicInteger atomicInteger = this.A02;
            if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                runnableFuture.run();
            }
            Object A002 = C132926Vv.A00(runnableFuture, atomicInteger.get());
            synchronized (this) {
                this.A01 = A002;
                this.A00 = null;
            }
            if (this instanceof C98264r9) {
                AnonymousClass00C.A0D(A002, 0);
                ((C98264r9) this).A01 = null;
            }
            return A002;
        }
        throw C36381kD.A0k();
    }

    public C1269266g(Callable callable) {
        this.A00 = new FutureTask(callable);
    }
}
