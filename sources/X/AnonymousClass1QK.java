package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.1QK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QK implements ThreadFactory {
    public static final /* synthetic */ AnonymousClass1QK A00 = new AnonymousClass1QK();

    public final Thread newThread(Runnable runnable) {
        return new C19950wm(runnable, "EphremeralExecutor");
    }
}
