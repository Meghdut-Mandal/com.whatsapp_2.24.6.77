package androidx.core.app;

import X.AnonymousClass0XS;
import X.AnonymousClass0YE;
import X.C09580cb;
import X.C15690np;
import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

public class NotificationCompat$BigPictureStyle extends AnonymousClass0YE {
    public IconCompat A00;
    public boolean A01;

    public static Notification.BigPictureStyle A00(Notification.BigPictureStyle bigPictureStyle) {
        return bigPictureStyle.setBigContentTitle((CharSequence) null);
    }

    public String A09() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public static Notification.BigPictureStyle A02(Notification.Builder builder) {
        return new Notification.BigPictureStyle(builder);
    }

    public void A0B(C15690np r7) {
        C09580cb r72 = (C09580cb) r7;
        Notification.BigPictureStyle A002 = A00(A02(r72.A02));
        IconCompat iconCompat = this.A00;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AnonymousClass0XS.A02(A002, iconCompat.A09(r72.A03));
            } else if (iconCompat.A05() == 1) {
                A002 = A01(A002, this.A00.A06());
            }
        }
        if (this.A01) {
            A002.bigLargeIcon((Bitmap) null);
        }
        if (this.A02) {
            A002.setSummaryText(this.A01);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AnonymousClass0XS.A01(A002);
            AnonymousClass0XS.A00(A002);
        }
    }

    public static Notification.BigPictureStyle A01(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
        return bigPictureStyle.bigPicture(bitmap);
    }
}
