package X;

import android.app.NotificationChannel;

/* renamed from: X.3ML  reason: invalid class name */
public abstract class AnonymousClass3ML {
    public static /* synthetic */ void A00(NotificationChannel notificationChannel, AnonymousClass11F r4) {
        String str;
        String rawString = r4.getRawString();
        boolean A0G = AnonymousClass143.A0G(r4);
        C24491Cq r1 = C24481Cp.A0L;
        if (A0G) {
            str = "group_chat_defaults";
        } else {
            str = "individual_chat_defaults";
        }
        String A00 = r1.A00(str);
        if (A00 != null) {
            notificationChannel.setConversationId(A00, rawString);
            C24481Cp.A01(A00);
        }
    }
}
