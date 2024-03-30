package X;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.2uN  reason: invalid class name and case insensitive filesystem */
public abstract class C55282uN {
    public static final void A00(C07700Yy r3, AnonymousClass141 r4, C20600xp r5, String str, String str2, long j) {
        IconCompat iconCompat;
        AnonymousClass0TO r1 = new AnonymousClass0TO();
        r1.A01 = str2;
        Bitmap A0C = r5.A0C(r4);
        if (A0C != null) {
            iconCompat = IconCompat.A03(A0C);
        } else {
            iconCompat = null;
        }
        r1.A00 = iconCompat;
        AnonymousClass0UW r2 = new AnonymousClass0UW(r1);
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r5.A0D());
        notificationCompat$MessagingStyle.A0C(new C07210Wt(r2, str, j));
        r3.A0C(notificationCompat$MessagingStyle);
    }
}
