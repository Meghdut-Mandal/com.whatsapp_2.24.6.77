package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3q6  reason: invalid class name and case insensitive filesystem */
public final class C77193q6 implements C161247mR {
    public final C19420v0 A00;
    public final C29501Ww A01;

    public boolean BtD(C1267065d r9, Long l, String str) {
        boolean equals = "PostRegSMBTakeover".equals(str);
        boolean equals2 = "PostRegistration".equals(str);
        AnonymousClass005 r3 = this.A00.A00;
        if ((C36391kE.A0H(r3).getInt("migration_state_on_provider_side", 0) != 1 || !equals) && equals2) {
            if (l == null || TimeUnit.MILLISECONDS.toSeconds(l.longValue()) >= C36371kC.A08(C36391kE.A0H(r3), "last_login_time") + ((long) 60)) {
                return true;
            }
            Log.i("PostRegistrationIncomingPushObserver/post-registration-notification/notification-delayed");
        }
        return false;
    }

    public C77193q6(C19420v0 r1, C29501Ww r2) {
        C36321k7.A0x(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BJc(String str, Map map) {
        C18740tg.A06(str);
        if (str != null) {
            C29501Ww r5 = this.A01;
            Log.i("RegistrationManager/checkIfNeedToPostPostRegistrationNotification");
            r5.A0E.A03(20, str);
            C19420v0 r4 = r5.A0F;
            C36341k9.A0w(C19420v0.A00(r4), "post_reg_notification_time", C19970wo.A00(r5.A0C));
            r4.A25(true);
            SharedPreferences.Editor A002 = C19420v0.A00(r4);
            A002.remove("show_pre_reg_do_not_share_code_warning");
            A002.apply();
            r5.A06();
        }
    }
}
