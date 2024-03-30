package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1MV  reason: invalid class name */
public class AnonymousClass1MV {
    public C20720y3 A00;
    public final BroadcastReceiver A01 = new C36011jc(this, 2);
    public final Handler A02;
    public final C21390zA A03;
    public final C19630wG A04;
    public final C20810yC A05;
    public final AnonymousClass1MN A06;
    public final AnonymousClass1MT A07;
    public final AnonymousClass19O A08;
    public final C19700wN A09;
    public final C236519h A0A;
    public final C21060yb A0B;
    public final C19970wo A0C;

    private PendingIntent A00(String str, int i) {
        return C65743Th.A01(this.A04.A00, 0, new Intent(str).setPackage("com.whatsapp"), i);
    }

    public static void A01(AnonymousClass1MV r2, String str) {
        Log.i("xmpp/handler/logout-timer/cancel");
        try {
            PendingIntent A002 = r2.A00(str, 536870912);
            if (A002 != null) {
                AlarmManager A052 = r2.A0B.A05();
                if (A052 != null) {
                    A052.cancel(A002);
                } else {
                    Log.w("MessageHandler/cancelLogoutTimer AlarmManager is null");
                }
                A002.cancel();
            }
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                r2.A09.A0E("messagehandler/deadOS", (String) null, false);
                return;
            }
            throw e;
        }
    }

    public static void A02(AnonymousClass1MV r7, String str) {
        Log.i("xmpp/handler/logout-timer/start");
        PendingIntent A002 = r7.A00(str, 134217728);
        C18740tg.A06(A002);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C20810yC r4 = r7.A05;
        if (!r7.A0A.A00(A002, 2, elapsedRealtime + (((long) C20800yB.A00(C21000yV.A02, r4, 431)) * 60 * 1000))) {
            Log.w("MessageHandler/startLogoutTimer AlarmManager is null");
        }
    }

    public static boolean A03(AnonymousClass1MV r1, String str) {
        PendingIntent A002 = r1.A00(str, 536870912);
        boolean z = false;
        if (A002 != null) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("xmpp/handler/logout-timer/has=");
        sb.append(z);
        Log.i(sb.toString());
        return z;
    }

    public AnonymousClass1MV(C21390zA r4, C19700wN r5, C236519h r6, C21060yb r7, C19970wo r8, C19630wG r9, C20810yC r10, AnonymousClass1MN r11, AnonymousClass1MT r12, AnonymousClass19W r13, AnonymousClass19O r14) {
        this.A0C = r8;
        this.A05 = r10;
        this.A0A = r6;
        this.A09 = r5;
        this.A04 = r9;
        this.A0B = r7;
        this.A06 = r11;
        this.A07 = r12;
        this.A08 = r14;
        this.A03 = r4;
        this.A02 = new Handler(r13.A00(), new AnonymousClass1MY(this));
    }
}
