package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.77M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass77M implements ThreadFactory {
    public static final /* synthetic */ AnonymousClass77M A00 = new AnonymousClass77M();

    public final Thread newThread(Runnable runnable) {
        ThreadFactory threadFactory = C113695fx.A01;
        Thread thread = new Thread(runnable);
        thread.setPriority(9);
        return thread;
    }
}
