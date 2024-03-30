package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.AYr  reason: case insensitive filesystem */
public final /* synthetic */ class C21738AYr implements Executor {
    public final /* synthetic */ Handler A00;

    public /* synthetic */ C21738AYr(Handler handler) {
        this.A00 = handler;
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
