package X;

import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.77B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass77B implements RejectedExecutionHandler {
    public static final /* synthetic */ AnonymousClass77B A00 = new AnonymousClass77B();

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            Log.e((Throwable) e);
        }
    }
}
