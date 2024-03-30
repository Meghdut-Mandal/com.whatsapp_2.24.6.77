package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0Cd  reason: invalid class name and case insensitive filesystem */
public class C02850Cd implements Executor {
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
