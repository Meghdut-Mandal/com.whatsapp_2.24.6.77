package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.0iC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12510iC implements Executor {
    public final /* synthetic */ Handler A00;

    public /* synthetic */ C12510iC(Handler handler) {
        this.A00 = handler;
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
