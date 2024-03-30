package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1YV  reason: invalid class name */
public class AnonymousClass1YV {
    public AnonymousClass2LQ A00;
    public final Handler A01;
    public final AnonymousClass1YX A02;
    public final AnonymousClass1ML A03;
    public final AnonymousClass1YW A04;
    public final AnonymousClass19J A05;
    public final C236519h A06;
    public final C21060yb A07;
    public final C19970wo A08;
    public final C19630wG A09;
    public final C20810yC A0A;
    public final AnonymousClass1G4 A0B;
    public final C19770wU A0C;
    public final AnonymousClass005 A0D;

    public static synchronized AnonymousClass2LQ A00(AnonymousClass1YV r8) {
        AnonymousClass2LQ r0;
        AnonymousClass1YV r6 = r8;
        synchronized (r6) {
            r0 = r8.A00;
            if (r0 == null) {
                C19970wo r4 = r8.A08;
                C236519h r2 = r8.A06;
                C19630wG r5 = r8.A09;
                r0 = new AnonymousClass2LQ(r6.A02, r2, r8.A07, r4, r5, r6, r8.A03, r8.A04);
                r6.A00 = r0;
            }
        }
        return r0;
    }

    public static void A01(AnonymousClass1YV r4) {
        if (C20800yB.A01(C21000yV.A02, r4.A0A, 6494)) {
            r4.A01.removeMessages(2);
            return;
        }
        AnonymousClass2LQ A002 = A00(r4);
        PendingIntent A012 = C65743Th.A01(A002.A02.A00, 0, new Intent("com.whatsapp.alarm.AVAILABLE_TIMEOUT").setPackage("com.whatsapp"), 536870912);
        if (A012 != null) {
            C21060yb r1 = A002.A01;
            C21060yb.A0P = true;
            AlarmManager A052 = r1.A05();
            C21060yb.A0P = false;
            if (A052 != null) {
                A052.cancel(A012);
            } else {
                Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/cancelAvailableTimeoutAlarm AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public static void A02(AnonymousClass1YV r6, boolean z) {
        Context context = r6.A09.A00;
        AnonymousClass1G4 r3 = r6.A0B;
        C21060yb r1 = r6.A07;
        C18740tg.A01();
        if (r3.A01()) {
            boolean A002 = C28901Un.A00(r1);
            StringBuilder sb = new StringBuilder();
            sb.append("ScreenLockReceiver manual check; locked=");
            sb.append(A002);
            Log.i(sb.toString());
            r3.A00(A002);
        }
        AnonymousClass1ML r4 = r6.A03;
        int i = r4.A00;
        if (i != 1) {
            if (i == 2) {
                A01(r6);
                r4.A00 = 1;
            } else if (z) {
                r4.A00 = 1;
                AnonymousClass19J r32 = r6.A05;
                if (r32.A04 != 1) {
                    r6.A04.A00();
                }
                if (r32.A04 != 2) {
                    r6.A0C.Box(new C49312iu(context, r32, (C20720y3) r6.A0D.get()), new Void[0]);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("presencestatemanager/setAvailable/new-state: ");
        sb2.append(r4);
        sb2.append(" setIfUnavailable:");
        sb2.append(z);
        Log.i(sb2.toString());
    }

    public void A04() {
        AnonymousClass1ML r6 = this.A03;
        if (r6.A00 == 1) {
            r6.A00 = 2;
            if (C20800yB.A01(C21000yV.A02, this.A0A, 6494)) {
                this.A01.sendEmptyMessageDelayed(2, 15000);
            } else {
                AnonymousClass2LQ A002 = A00(this);
                PendingIntent A012 = C65743Th.A01(A002.A02.A00, 0, new Intent("com.whatsapp.alarm.AVAILABLE_TIMEOUT").setPackage("com.whatsapp"), 134217728);
                if (!A002.A00.A00(A012, 2, SystemClock.elapsedRealtime() + 15000)) {
                    Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/startAvailableTimeoutAlarm AlarmManager is null");
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("presencestatemanager/startTransitionToUnavailable/new-state ");
        sb.append(r6);
        Log.i(sb.toString());
    }

    public AnonymousClass1YV(AnonymousClass19J r4, AnonymousClass1YX r5, C236519h r6, C21060yb r7, C19970wo r8, C19630wG r9, C20810yC r10, AnonymousClass1ML r11, AnonymousClass1YW r12, AnonymousClass1G4 r13, C19770wU r14, AnonymousClass005 r15) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A08 = r8;
        this.A0A = r10;
        this.A06 = r6;
        this.A09 = r9;
        this.A0C = r14;
        this.A07 = r7;
        this.A03 = r11;
        this.A05 = r4;
        this.A04 = r12;
        this.A0D = r15;
        this.A0B = r13;
        this.A02 = r5;
        this.A01 = new Handler(Looper.getMainLooper(), new AnonymousClass1YY(this, r13));
    }

    public void A03() {
        A01(this);
        StringBuilder sb = new StringBuilder();
        sb.append("presencestatemanager/setUnavailable previous-state: ");
        AnonymousClass1ML r1 = this.A03;
        sb.append(r1);
        Log.i(sb.toString());
        r1.A00 = 3;
    }
}
