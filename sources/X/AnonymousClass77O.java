package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.77O  reason: invalid class name */
public final class AnonymousClass77O implements ThreadFactory {
    public static final AnonymousClass77O A00 = new AnonymousClass77O();

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IOScheduler-duplex-read-");
        thread.setName(C36411kG.A11(A0u, thread.getId()));
        return thread;
    }
}
