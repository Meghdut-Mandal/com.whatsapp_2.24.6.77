package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.77H  reason: invalid class name */
public class AnonymousClass77H implements ThreadFactory {
    public final AtomicInteger A00 = C90514aH.A17();

    public Thread newThread(Runnable runnable) {
        C1498272x r2 = new C1498272x(runnable, this, 19);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("JobRunner");
        A0u.append(" #");
        return new Thread(r2, C36381kD.A10(A0u, this.A00.getAndIncrement()));
    }
}
