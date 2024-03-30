package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.6Vn  reason: invalid class name and case insensitive filesystem */
public abstract class C132856Vn {
    public static final String A00 = AnonymousClass6VD.A01("Alarms");

    public static void A00(AlarmManager alarmManager, PendingIntent pendingIntent, long j) {
        alarmManager.setExact(0, j, pendingIntent);
    }

    public static void A02(Context context, AnonymousClass69L r7, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent A0H = C36441kJ.A0H(context, SystemAlarmService.class);
        A0H.setAction("ACTION_DELAY_MET");
        C138806ij.A00(A0H, r7);
        int i2 = 536870912;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        }
        PendingIntent service = PendingIntent.getService(context, i, A0H, i2);
        if (service != null && alarmManager != null) {
            AnonymousClass6VD A002 = AnonymousClass6VD.A00();
            String str = A00;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Cancelling existing alarm with (workSpecId, systemId) (");
            A0u.append(r7);
            C90504aG.A1M(A0u);
            A0u.append(i);
            AnonymousClass6VD.A03(A002, ")", str, A0u);
            alarmManager.cancel(service);
        }
    }

    public static void A03(Context context, AnonymousClass69L r5, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = 134217728;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        }
        Intent A0H = C36441kJ.A0H(context, SystemAlarmService.class);
        A0H.setAction("ACTION_DELAY_MET");
        C138806ij.A00(A0H, r5);
        PendingIntent service = PendingIntent.getService(context, i, A0H, i2);
        if (alarmManager != null) {
            A00(alarmManager, service, j);
        }
    }

    public static void A01(Context context, WorkDatabase workDatabase, AnonymousClass69L r7, long j) {
        C158967iX A0A = workDatabase.A0A();
        C128086Au BI6 = A0A.BI6(r7);
        if (BI6 != null) {
            int i = BI6.A01;
            A02(context, r7, i);
            A03(context, r7, i, j);
            return;
        }
        C114475hJ r3 = new C114475hJ(workDatabase);
        Object A03 = r3.A00.A03(new C163727qf(r3, 1));
        AnonymousClass00C.A08(A03);
        int A0I = AnonymousClass000.A0I(A03);
        A0A.BKk(new C128086Au(r7.A01, r7.A00, A0I));
        A03(context, r7, A0I, j);
    }
}
