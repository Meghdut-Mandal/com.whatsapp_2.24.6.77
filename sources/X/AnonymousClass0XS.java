package X;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* renamed from: X.0XS  reason: invalid class name */
public abstract class AnonymousClass0XS {
    public static void A00(Notification.BigPictureStyle bigPictureStyle) {
        bigPictureStyle.setContentDescription((CharSequence) null);
    }

    public static void A01(Notification.BigPictureStyle bigPictureStyle) {
        bigPictureStyle.showBigPictureWhenCollapsed(false);
    }

    public static void A02(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }
}
