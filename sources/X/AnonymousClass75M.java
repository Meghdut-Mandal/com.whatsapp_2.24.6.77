package X;

import java.lang.Thread;

/* renamed from: X.75M  reason: invalid class name */
public class AnonymousClass75M implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        new IllegalStateException(th);
    }
}
