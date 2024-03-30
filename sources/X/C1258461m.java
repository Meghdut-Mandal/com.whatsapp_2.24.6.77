package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.61m  reason: invalid class name and case insensitive filesystem */
public class C1258461m {
    public final Handler A00;
    public final Executor A01;

    public C1258461m() {
        Handler A0H = C36341k9.A0H();
        this.A00 = A0H;
        Objects.requireNonNull(A0H);
        this.A01 = new C164217rS(A0H, 3);
    }

    public void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
