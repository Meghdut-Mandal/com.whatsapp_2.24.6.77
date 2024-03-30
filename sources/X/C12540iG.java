package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0iG  reason: invalid class name and case insensitive filesystem */
public class C12540iG implements ThreadFactory {
    public final ThreadFactory A00 = Executors.defaultThreadFactory();
    public final AtomicInteger A01 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.A00.newThread(new AnonymousClass00K(runnable));
        int andIncrement = this.A01.getAndIncrement();
        StringBuilder A0v = AnonymousClass000.A0v("GAC_Executor");
        A0v.append("[");
        A0v.append(andIncrement);
        newThread.setName(AnonymousClass000.A0q("]", A0v));
        return newThread;
    }
}
