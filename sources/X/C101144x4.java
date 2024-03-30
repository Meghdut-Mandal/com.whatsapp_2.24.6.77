package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Random;

/* renamed from: X.4x4  reason: invalid class name and case insensitive filesystem */
public class C101144x4 extends C129096Ez {
    public final C236519h A00;
    public final C19970wo A01;
    public final C19420v0 A02;
    public final C20720y3 A03;
    public final Random A04;

    public static void A01(C101144x4 r11) {
        long A002 = C19970wo.A00(r11.A01);
        C19420v0 r10 = r11.A02;
        AnonymousClass005 r9 = r10.A00;
        if (!C36391kE.A0H(r9).contains("last_heartbeat_login")) {
            long nextInt = A002 - (((long) r11.A04.nextInt(86400)) * 1000);
            C36341k9.A0w(C19420v0.A00(r10), "last_heartbeat_login", nextInt);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("no last heartbeat known; setting to ");
            C36321k7.A1a(A0u, AnonymousClass6XI.A02(nextInt));
        }
        long A0B = C36341k9.A0B(C36391kE.A0H(r9), "last_heartbeat_login");
        if (A0B <= A002) {
            long j = 86400000 + A0B;
            if (j >= A002) {
                long elapsedRealtime = (j - A002) + SystemClock.elapsedRealtime();
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("HeartbeatWakeupAction; elapsedRealTimeHeartbeatLogin=");
                C36321k7.A1a(A0u2, AnonymousClass6XI.A02(elapsedRealtime));
                if (!r11.A00.A00(r11.A03("com.whatsapp.action.HEARTBEAT_WAKEUP", 134217728), 2, elapsedRealtime)) {
                    Log.w("HeartbeatWakeupAction; AlarmManager is null");
                    return;
                }
                return;
            }
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("HeartbeatWakeupAction/last heart beat login=");
        A0u3.append(A0B);
        A0u3.append(" server time=");
        A0u3.append(A002);
        A0u3.append(" client time=");
        A0u3.append(System.currentTimeMillis());
        C36321k7.A1T(" interval=", A0u3, 86400);
        A00((Intent) null, r11);
    }

    public C101144x4(Context context, C236519h r2, C19970wo r3, C19420v0 r4, C20720y3 r5, Random random) {
        super(context);
        this.A01 = r3;
        this.A04 = random;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
    }

    public static void A00(Intent intent, C101144x4 r8) {
        C36321k7.A1K(intent, "HeartbeatWakeupAction; intent=", AnonymousClass000.A0u());
        long A002 = C19970wo.A00(r8.A01);
        r8.A03.A0C(0, false, true, true, true);
        C36321k7.A1V("HeartbeatWakeupAction/setting last heart beat login time: ", AnonymousClass000.A0u(), A002);
        C36341k9.A0w(C19420v0.A00(r8.A02), "last_heartbeat_login", A002);
        A01(r8);
    }
}
