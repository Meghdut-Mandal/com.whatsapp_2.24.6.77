package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.9lk  reason: invalid class name and case insensitive filesystem */
public class C202399lk {
    public static final Handler A00 = C36341k9.A0H();

    public static void A00(Runnable runnable) {
        if (A02()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }

    public static void A01(String str) {
        if (A02()) {
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append(" Current thread: ");
            throw new IllegalThreadStateException(AnonymousClass000.A0q(Thread.currentThread().getName(), A0v));
        }
    }

    public static boolean A02() {
        return C36361kB.A1a(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
