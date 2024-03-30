package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.770  reason: invalid class name */
public final class AnonymousClass770 implements Executor {
    public final Handler A00;

    public void execute(Runnable runnable) {
        AnonymousClass00C.A0D(runnable, 0);
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public AnonymousClass770(Handler handler) {
        this.A00 = handler;
    }
}
