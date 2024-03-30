package X;

import android.app.Notification;
import android.widget.RemoteViews;

/* renamed from: X.0XV  reason: invalid class name */
public abstract class AnonymousClass0XV {
    public static void A01(Notification.Builder builder) {
        builder.setRemoteInputHistory((CharSequence[]) null);
    }

    public static void A00(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void A02(Notification.Builder builder, RemoteViews remoteViews) {
        builder.setCustomContentView(remoteViews);
    }
}
