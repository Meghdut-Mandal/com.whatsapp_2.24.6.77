package X;

import android.app.Notification;

/* renamed from: X.0XW  reason: invalid class name */
public abstract class AnonymousClass0XW {
    public static void A00(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void A01(Notification.Builder builder) {
        builder.setBubbleMetadata((Notification.BubbleMetadata) null);
    }

    public static void A02(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }
}
