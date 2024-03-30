package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.6I2  reason: invalid class name */
public abstract class AnonymousClass6I2 {
    public static final String A00;

    static {
        String A01 = AnonymousClass6VD.A01("WakeLocks");
        AnonymousClass00C.A08(A01);
        A00 = A01;
    }

    public static final PowerManager.WakeLock A00(Context context, String str) {
        boolean A1a = C36331k8.A1a(context, str);
        Object systemService = context.getApplicationContext().getSystemService("power");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String A0p = AnonymousClass000.A0p("WorkManager: ", str, AnonymousClass000.A0u());
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(A1a ? 1 : 0, A0p);
        synchronized (C129816Io.A00) {
            C129816Io.A01.put(newWakeLock, A0p);
        }
        AnonymousClass00C.A08(newWakeLock);
        return newWakeLock;
    }
}
