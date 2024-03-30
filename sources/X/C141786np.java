package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6np  reason: invalid class name and case insensitive filesystem */
public final class C141786np implements C17880sD {
    public final C97484pl A00;
    public final C007403e A01;

    public void B0P(Runnable runnable, Executor executor) {
        this.A00.B0P(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    public Object get() {
        return this.A00.get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public boolean isDone() {
        return this.A00.isDone();
    }

    public /* synthetic */ C141786np(C007403e r2) {
        C97484pl r0 = new C97484pl();
        this.A01 = r2;
        this.A00 = r0;
        r2.BL4(new C154217Ri(this));
    }
}
