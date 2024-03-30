package androidx.core.app;

import X.AnonymousClass001;
import X.AnonymousClass0YE;
import X.C09580cb;
import X.C15690np;
import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat$InboxStyle extends AnonymousClass0YE {
    public ArrayList A00 = AnonymousClass001.A0I();

    public static Notification.InboxStyle A01(Notification.InboxStyle inboxStyle) {
        return inboxStyle.setBigContentTitle((CharSequence) null);
    }

    public String A09() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    public static Notification.InboxStyle A00(Notification.Builder builder) {
        return new Notification.InboxStyle(builder);
    }

    public void A0B(C15690np r4) {
        Notification.InboxStyle A01 = A01(A00(((C09580cb) r4).A02));
        if (this.A02) {
            A03(A01, this.A01);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            A02(A01, (CharSequence) it.next());
        }
    }

    public static void A02(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
        inboxStyle.addLine(charSequence);
    }

    public static void A03(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
        inboxStyle.setSummaryText(charSequence);
    }
}
