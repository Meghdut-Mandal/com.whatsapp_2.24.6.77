package X;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.2qc  reason: invalid class name and case insensitive filesystem */
public abstract class C53042qc {
    public static void A00(Notification notification, Service service, int i, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            AnonymousClass6VD.A00();
            Log.w(SystemForegroundService.A05, "Unable to start foreground service", e);
        }
    }
}
