package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Calendar;

/* renamed from: X.4x5  reason: invalid class name and case insensitive filesystem */
public class C101154x5 extends C129096Ez {
    public final C1263863s A00;
    public final C21060yb A01;
    public final C19420v0 A02;
    public final C119535py A03;
    public final AnonymousClass1A2 A04;
    public final C21380z9 A05;
    public final Context A06;
    public final AnonymousClass6KC A07;
    public final C236519h A08;
    public final C20810yC A09;

    public static void A00(C101154x5 r15) {
        AlarmManager A052 = r15.A01.A05();
        if (A052 == null) {
            Log.w("DailyCronAction/dailyCatchupCron; AlarmManager is null");
            return;
        }
        PendingIntent A032 = r15.A03("com.whatsapp.action.DAILY_CATCHUP_CRON", 536870912);
        if (!A02(r15)) {
            long currentTimeMillis = System.currentTimeMillis();
            C19420v0 r10 = r15.A02;
            AnonymousClass005 r9 = r10.A00;
            long j = C36391kE.A0H(r9).getLong("next_daily_cron_catchup", 0);
            long j2 = j - currentTimeMillis;
            if (A032 == null || j2 <= 0 || j2 >= 900000) {
                long j3 = currentTimeMillis + 900000;
                r15.A08.A00(r15.A03("com.whatsapp.action.DAILY_CATCHUP_CRON", 0), 1, j3);
                C36341k9.A0w(C19420v0.A00(r10), "next_daily_cron_catchup", j3);
                AnonymousClass6XI.A02(j3);
                AnonymousClass6XI.A02(C36391kE.A0H(r9).getLong("last_daily_cron", 0));
                return;
            }
            AnonymousClass6XI.A02(j);
        } else if (A032 != null) {
            A052.cancel(A032);
            A032.cancel();
        }
    }

    public static boolean A02(C101154x5 r10) {
        long j = C36341k9.A0E(r10.A02).getLong("last_daily_cron", 0);
        Calendar instance = Calendar.getInstance();
        C90474aD.A1Q(instance, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        long j2 = 86400000 + timeInMillis;
        if (j >= timeInMillis && j < j2) {
            return true;
        }
        long A0A = C36441kJ.A0A(j);
        if (A0A <= 0 || A0A >= 21600000) {
            return false;
        }
        return true;
    }

    public C101154x5(Context context, C1263863s r2, AnonymousClass6KC r3, C236519h r4, C21060yb r5, C19420v0 r6, C119535py r7, C20810yC r8, AnonymousClass1A2 r9, C21380z9 r10) {
        super(context);
        this.A06 = context;
        this.A09 = r8;
        this.A08 = r4;
        this.A01 = r5;
        this.A04 = r9;
        this.A03 = r7;
        this.A02 = r6;
        this.A07 = r3;
        this.A00 = r2;
        this.A05 = r10;
    }

    public static void A01(C101154x5 r6) {
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        C90474aD.A1Q(instance, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis() + AnonymousClass6KC.A00(r6.A07, 5528, 5529);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DailyCronAction/setupDailyCronAlarm; alarmTimeMillis=");
        C36321k7.A1a(A0u, AnonymousClass6XI.A02(timeInMillis));
        if (!r6.A08.A00(r6.A03("com.whatsapp.action.DAILY_CRON", 134217728), 0, timeInMillis)) {
            Log.w("DailyCronAction/setupDailyCronAlarm AlarmManager is null");
        }
    }
}
