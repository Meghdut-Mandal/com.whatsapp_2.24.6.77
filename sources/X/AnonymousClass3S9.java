package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat$InboxStyle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3S9  reason: invalid class name */
public final class AnonymousClass3S9 {
    public final C19630wG A00;
    public final C25271Fq A01;
    public final AnonymousClass6TO A02;
    public final C21060yb A03;

    public final void A03(Intent intent, C07250Wx r7, CharSequence charSequence, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        if (!z && Build.VERSION.SDK_INT >= 26) {
            NotificationManager A07 = this.A03.A07();
            C18740tg.A06(A07);
            AnonymousClass00C.A0B(A07);
            if (!A01(A07)) {
                A00();
            }
        }
        Context context = this.A00.A00;
        if (z) {
            str3 = "critical_app_alerts@1";
        } else {
            str3 = "inactive_accounts";
        }
        C07700Yy r3 = new C07700Yy(context, str3);
        r3.A06 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        r3.A06(3);
        r3.A0X = !z2;
        C36361kB.A1B(r3, str2, charSequence, true);
        r3.A0B.icon = i;
        C36341k9.A14(r3, charSequence);
        r3.A0D = C65743Th.A03(context, intent, 0);
        r3.A09 = 1;
        r3.A0G(charSequence);
        if (r7 != null) {
            r3.A0Q.add(r7);
        }
        this.A01.A07(str, 64, r3.A05());
        this.A02.A02((Boolean) null, i2, 15);
    }

    public final void A04(Intent intent, C07250Wx r8, String str, String str2, String str3, List list, boolean z) {
        AnonymousClass00C.A0D(list, 2);
        AnonymousClass00C.A0D(str3, 3);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager A07 = this.A03.A07();
            C18740tg.A06(A07);
            AnonymousClass00C.A0B(A07);
            if (!A01(A07)) {
                A00();
            }
        }
        NotificationCompat$InboxStyle notificationCompat$InboxStyle = new NotificationCompat$InboxStyle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (charSequence != null) {
                notificationCompat$InboxStyle.A00.add(C07700Yy.A04(charSequence));
            }
        }
        Context context = this.A00.A00;
        C07700Yy r4 = new C07700Yy(context, "inactive_accounts");
        r4.A06 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        r4.A06(3);
        r4.A0X = !z;
        C36361kB.A1B(r4, str2, str3, true);
        C36361kB.A1A(r4);
        r4.A0C(notificationCompat$InboxStyle);
        r4.A0D = C65743Th.A03(context, intent, 0);
        r4.A09 = 1;
        r4.A0Q.add(r8);
        this.A01.A07(str, 64, r4.A05());
        this.A02.A02((Boolean) null, 3, 15);
    }

    private final void A00() {
        NotificationManager A07 = this.A03.A07();
        C18740tg.A06(A07);
        NotificationChannel notificationChannel = new NotificationChannel("inactive_accounts", this.A00.A01(R.string.f12nameremoved), 4);
        notificationChannel.setLockscreenVisibility(0);
        notificationChannel.setShowBadge(true);
        A07.createNotificationChannel(notificationChannel);
    }

    public final void A02() {
        NotificationManager A07 = this.A03.A07();
        C18740tg.A06(A07);
        AnonymousClass00C.A0B(A07);
        if (A01(A07)) {
            A07.deleteNotificationChannel("inactive_accounts");
        }
    }

    public final void A05(String str) {
        AnonymousClass00C.A0D(str, 1);
        try {
            this.A01.A04(64, str, "clear inactive account notifications");
        } catch (RuntimeException e) {
            Log.e("InactiveAccountNotification/clearNotifications/cancelfailed", e);
        }
    }

    public AnonymousClass3S9(AnonymousClass6TO r1, C21060yb r2, C19630wG r3, C25271Fq r4) {
        C36321k7.A18(r3, r2, r4, r1);
        this.A00 = r3;
        this.A03 = r2;
        this.A01 = r4;
        this.A02 = r1;
    }

    public static final boolean A01(NotificationManager notificationManager) {
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        AnonymousClass00C.A08(notificationChannels);
        if (!(notificationChannels instanceof Collection) || !notificationChannels.isEmpty()) {
            for (NotificationChannel id : notificationChannels) {
                if (AnonymousClass00C.A0J(id.getId(), "inactive_accounts")) {
                    return true;
                }
            }
        }
        return false;
    }
}
