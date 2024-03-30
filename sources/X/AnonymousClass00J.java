package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.00J  reason: invalid class name */
public class AnonymousClass00J implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new AnonymousClass00K(runnable));
        newThread.setName(this.A00);
        return newThread;
    }

    public AnonymousClass00J(String str) {
        AnonymousClass006.A02(str, "Name must not be null");
        this.A00 = str;
    }
}
