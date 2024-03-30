package X;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.0iB  reason: invalid class name and case insensitive filesystem */
public class C12500iB implements Executor {
    public final Handler A00;

    public void execute(Runnable runnable) {
        Handler handler = this.A00;
        Objects.requireNonNull(runnable);
        if (!handler.post(runnable)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(handler);
            throw new RejectedExecutionException(AnonymousClass000.A0q(" is shutting down", A0u));
        }
    }

    public C12500iB(Handler handler) {
        Objects.requireNonNull(handler);
        this.A00 = handler;
    }
}
