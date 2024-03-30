package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.0wI  reason: invalid class name and case insensitive filesystem */
public class C19650wI implements C19640wH {
    public final Handler A00;
    public final Executor A01;

    public void A00(Runnable runnable) {
        this.A00.post(runnable);
    }

    public C19650wI() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A00 = handler;
        Objects.requireNonNull(handler);
        this.A01 = new C36131jo(handler, 3);
    }

    public void Bp3(Runnable runnable) {
        if (C224714l.A02()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
