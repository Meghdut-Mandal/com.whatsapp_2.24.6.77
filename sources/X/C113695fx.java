package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5fx  reason: invalid class name and case insensitive filesystem */
public abstract class C113695fx {
    public static final ThreadPoolExecutor A00;
    public static final ThreadFactory A01;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        AnonymousClass77M r7 = AnonymousClass77M.A00;
        A01 = r7;
        A00 = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), r7);
    }
}
