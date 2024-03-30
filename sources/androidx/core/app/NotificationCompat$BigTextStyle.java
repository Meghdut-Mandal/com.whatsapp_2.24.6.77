package androidx.core.app;

import X.AnonymousClass0YE;
import X.C07700Yy;
import X.C09580cb;
import X.C15690np;
import android.app.Notification;

public class NotificationCompat$BigTextStyle extends AnonymousClass0YE {
    public CharSequence A00;

    public static Notification.BigTextStyle A00(Notification.BigTextStyle bigTextStyle) {
        return bigTextStyle.setBigContentTitle((CharSequence) null);
    }

    public String A09() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public static Notification.BigTextStyle A02(Notification.Builder builder) {
        return new Notification.BigTextStyle(builder);
    }

    public void A0B(C15690np r3) {
        Notification.BigTextStyle A01 = A01(A00(A02(((C09580cb) r3).A02)), this.A00);
        if (this.A02) {
            A03(A01, this.A01);
        }
    }

    public static Notification.BigTextStyle A01(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.bigText(charSequence);
    }

    public void A0C(CharSequence charSequence) {
        this.A00 = C07700Yy.A04(charSequence);
    }

    public static void A03(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        bigTextStyle.setSummaryText(charSequence);
    }
}
