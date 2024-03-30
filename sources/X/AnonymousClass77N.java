package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.77N  reason: invalid class name */
public final class AnonymousClass77N implements ThreadFactory {
    public static final AnonymousClass77N A00 = new AnonymousClass77N();

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("IOScheduler-duplex-write-");
        thread.setName(C36411kG.A11(A0u, thread.getId()));
        return thread;
    }
}
