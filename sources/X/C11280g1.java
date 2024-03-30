package X;

import android.app.NotificationManager;
import android.content.Context;

/* renamed from: X.0g1  reason: invalid class name and case insensitive filesystem */
public final class C11280g1 implements Runnable {
    public final /* synthetic */ C10300e1 A00;

    public C11280g1(C10300e1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        Context context = this.A00.A0B;
        if (!C02620Be.A02.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
