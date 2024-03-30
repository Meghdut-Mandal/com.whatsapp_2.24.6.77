package X;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9a3  reason: invalid class name and case insensitive filesystem */
public abstract class C196559a3 {
    public static AtomicBoolean A00 = C36431kI.A1H();

    public static void A00() {
        boolean isEnabled = Trace.isEnabled();
        if (A00.compareAndSet(!isEnabled, isEnabled)) {
            C201899kg.A00(false);
        }
    }
}
