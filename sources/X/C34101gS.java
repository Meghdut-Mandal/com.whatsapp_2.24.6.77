package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import java.util.List;

/* renamed from: X.1gS  reason: invalid class name and case insensitive filesystem */
public class C34101gS {
    public static int A00(boolean z) {
        return z ? 3 : 4;
    }

    public static NotificationChannel A01(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static List A02(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static void A03(NotificationChannel notificationChannel, NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void A05(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static void A04(NotificationManager notificationManager) {
        notificationManager.getNotificationChannelGroups();
    }
}
