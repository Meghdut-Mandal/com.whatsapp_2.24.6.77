package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5gM  reason: invalid class name and case insensitive filesystem */
public abstract class C113925gM {
    public static final ThreadPoolExecutor A00;
    public static final BlockingQueue A01;
    public static final ThreadFactory A02;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(4);
        A01 = linkedBlockingQueue;
        AnonymousClass77F r8 = new AnonymousClass77F();
        A02 = r8;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 1, TimeUnit.SECONDS, linkedBlockingQueue, r8);
        A00 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new AnonymousClass778());
    }
}
