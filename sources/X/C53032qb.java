package X;

import android.app.Notification;
import android.app.Service;

/* renamed from: X.2qb  reason: invalid class name and case insensitive filesystem */
public abstract class C53032qb {
    public static void A00(Notification notification, Service service, int i, int i2) {
        service.startForeground(i, notification, i2);
    }
}
