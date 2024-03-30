package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6HW  reason: invalid class name */
public abstract class AnonymousClass6HW {
    public static final Handler A00 = C36341k9.A0H();

    public static void A00(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
