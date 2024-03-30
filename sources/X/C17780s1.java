package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0s1  reason: invalid class name and case insensitive filesystem */
public class C17780s1 implements ThreadFactory {
    public Object A00;
    public final int A01;

    public C17780s1(AtomicInteger atomicInteger) {
        this.A01 = 1;
        this.A00 = atomicInteger;
    }

    public Thread newThread(Runnable runnable) {
        if (this.A01 != 0) {
            Thread thread = new Thread(runnable, "reCaptcha");
            thread.setDaemon(true);
            return thread;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ModernAsyncTask #");
        A0u.append(((AtomicInteger) this.A00).getAndIncrement());
        return new Thread(runnable, A0u.toString());
    }

    public C17780s1() {
        this.A01 = 0;
        this.A00 = new AtomicInteger(1);
    }
}
