package X;

import android.app.NotificationChannel;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: X.2dt  reason: invalid class name and case insensitive filesystem */
public class C47192dt extends AnonymousClass3LI {
    public final C24481Cp A00;

    public long A00() {
        NotificationChannel A02;
        if (!this.A0L || (A02 = this.A00.A02(this.A0F)) == null || A02.getImportance() >= 3) {
            return A01();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("chat-settings-store/getMuteEndTime notification channel muted for:");
        C36321k7.A1a(A0u, AnonymousClass143.A04(this.A0F));
        return -1;
    }

    public boolean A0B() {
        NotificationChannel A02;
        if (Build.VERSION.SDK_INT < 26 || (A02 = this.A00.A02(this.A0F)) == null || A02.getImportance() != 0) {
            return super.A0B();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("chat-settings-store/getShowNotifications notification channel disabled for:");
        C36321k7.A1a(A0u, AnonymousClass143.A04(this.A0F));
        return false;
    }

    public String A0D() {
        String A002 = C24481Cp.A0L.A00("channel_notification");
        if (A002 != null) {
            return A002;
        }
        C24481Cp r0 = this.A00;
        return r0.A05(Settings.System.DEFAULT_NOTIFICATION_URI, r0.A07("channel_notification"), "channel_notification", "FFFFFF", "1", (String) null, 4);
    }

    public String A0E() {
        String str;
        C24491Cq r1 = C24481Cp.A0L;
        String A002 = r1.A00(this.A0F);
        if (!TextUtils.isEmpty(A002)) {
            return A002;
        }
        if (this.A0L) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("chat-settings-store/getNotificationChannelId missing channel for chat with custom notifications:");
            C36321k7.A1a(A0u, AnonymousClass143.A04(this.A0F));
            C24481Cp r2 = this.A00;
            String str2 = this.A0F;
            String A07 = r2.A07(str2);
            int A01 = C36431kI.A01(A0C() ? 1 : 0);
            r2.A05(r2.A04(this.A0D), A07, str2, this.A0B, this.A0E, "channel_group_chats", A01);
            str = this.A0F;
        } else if (AnonymousClass143.A0G(C36421kH.A0N(this.A0F))) {
            str = "group_chat_defaults";
        } else {
            str = "individual_chat_defaults";
        }
        return r1.A00(str);
    }

    public String A0F() {
        return this.A00.A06(C24481Cp.A0L.A00("silent_notifications"));
    }

    public boolean A0G() {
        return this.A00.A0J(C24481Cp.A0L.A00("voip_notification"));
    }

    public C47192dt(C21060yb r1, C19970wo r2, C20830yE r3, AnonymousClass1CR r4, C24481Cp r5) {
        super(r1, r2, r3, r4);
        this.A00 = r5;
    }
}
