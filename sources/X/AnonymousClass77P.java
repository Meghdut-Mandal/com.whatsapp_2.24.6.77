package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.77P  reason: invalid class name */
public class AnonymousClass77P implements ThreadFactory {
    public static final AtomicInteger A03 = C90514aH.A17();
    public final String A00;
    public final ThreadGroup A01;
    public final AtomicInteger A02 = C90514aH.A17();

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        Thread thread = new Thread(threadGroup, runnable, C36381kD.A10(A0u, this.A02.getAndIncrement()), 0);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public AnonymousClass77P() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.A01 = threadGroup;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("lottie-");
        A0u.append(A03.getAndIncrement());
        this.A00 = AnonymousClass000.A0q("-thread-", A0u);
    }
}
