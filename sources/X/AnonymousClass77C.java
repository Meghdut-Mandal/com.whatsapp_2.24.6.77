package X;

import android.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.77C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass77C implements RejectedExecutionHandler {
    public static final /* synthetic */ AnonymousClass77C A00 = new AnonymousClass77C();

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("The task ");
        A0u.append(runnable);
        Log.d("JobConsumer", AnonymousClass000.A0q(" has been rejected as it is executed after shutdown", A0u));
    }
}
