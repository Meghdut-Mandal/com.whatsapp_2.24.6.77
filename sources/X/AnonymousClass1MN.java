package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1MN  reason: invalid class name */
public class AnonymousClass1MN {
    public int A00;
    public AnonymousClass2LO A01;
    public AnonymousClass2LP A02;
    public C31901cZ A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final C21100yf A08;
    public final AnonymousClass19J A09;
    public final C236519h A0A;
    public final C21060yb A0B;
    public final C19970wo A0C;
    public final C19630wG A0D;
    public final C20810yC A0E;
    public final AnonymousClass19A A0F;
    public volatile long A0G;

    public static void A02(AnonymousClass1MN r6) {
        Log.i("ClientPingManager/on-disconnected");
        Handler handler = r6.A07;
        C18740tg.A02(handler);
        if (!r6.A05) {
            Log.w("ClientPingManager/on-disconnected; not connected, ignoring...");
            return;
        }
        if (r6.A0G > 0) {
            A01(r6);
        }
        C18740tg.A02(handler);
        AnonymousClass2LP r1 = r6.A02;
        if (r1 != null) {
            r6.A0D.A00.unregisterReceiver(r1);
            r6.A02 = null;
        }
        r6.A00();
        C18740tg.A02(handler);
        AnonymousClass2LO r12 = r6.A01;
        if (r12 != null) {
            r6.A0D.A00.unregisterReceiver(r12);
            r6.A01 = null;
        }
        r6.A03 = null;
        r6.A05 = false;
    }

    public static void A03(AnonymousClass1MN r2) {
        String str;
        Log.i("ClientPingManager/ping-timeout");
        C18740tg.A02(r2.A07);
        if (!r2.A05 || r2.A03 == null) {
            str = "ClientPingManager/ping-timeout; not connected, ignoring.";
        } else if (!r2.A09.A06) {
            str = "ClientPingManager/ping-timeout; xmpp connection is not ready, ignoring.";
        } else if (r2.A06) {
            str = "ClientPingManager/ping-timeout; already notified about timeout, ignoring.";
        } else {
            ((Handler) r2.A03).obtainMessage(8).sendToTarget();
            r2.A06 = true;
            A01(r2);
            return;
        }
        Log.w(str);
    }

    public static void A04(AnonymousClass1MN r7) {
        Log.i("ClientPingManager/send-ping");
        Handler handler = r7.A07;
        C18740tg.A02(handler);
        if (!r7.A05 || r7.A03 == null) {
            Log.w("ClientPingManager/send-ping; not connected, ignoring.");
        } else if (r7.A0G > 0) {
            Log.w("ClientPingManager/send-ping; skipping ping request, pending ping already exists.");
            if (r7.A0G > 0 && SystemClock.elapsedRealtime() > r7.A0G + r7.A07()) {
                A03(r7);
            }
        } else {
            r7.A00();
            r7.A0G = SystemClock.elapsedRealtime();
            r7.A06 = false;
            if (A06(r7)) {
                Log.i("ClientPingManager/timeout/schedule-handler");
                handler.removeMessages(2);
                handler.sendEmptyMessageDelayed(2, r7.A07());
            } else {
                Log.i("ClientPingManager/timeout/schedule-alarm");
                if (!r7.A0A.A00(C65743Th.A01(r7.A0D.A00, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"), 134217728), 2, SystemClock.elapsedRealtime() + r7.A07())) {
                    Log.w("ClientPingManager/timeout/schedule-alarm; failed to schedule alarm");
                }
            }
            r7.A0B((Runnable) null);
            r7.A00++;
        }
    }

    public static boolean A06(AnonymousClass1MN r2) {
        if (r2.A04) {
            if (!C20800yB.A01(C21000yV.A01, r2.A0E, 6493)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public long A07() {
        return Math.min(32000, Math.max(8000, (long) (this.A08.A04(C21100yf.A1p) * 1000)));
    }

    public void A08() {
        Log.i("ClientPingManager/on-demand-ping");
        this.A07.post(new C35711j8(this, 15));
    }

    public void A09(Intent intent) {
        PendingIntent A012 = C65743Th.A01(this.A0D.A00, 0, intent, 536870912);
        if (A012 != null) {
            AlarmManager A052 = this.A0B.A05();
            if (A052 == null) {
                Log.w("ClientPingManager/cancel-alarm; service is null");
                return;
            }
            A052.cancel(A012);
            A012.cancel();
        }
    }

    public void A0A(C236119d r10, long j) {
        AnonymousClass19A r2 = this.A0F;
        String A092 = r2.A09();
        r2.A0E(r10, new C35911jS(A092, 13).A00, A092, 22, j);
    }

    public void A0B(Runnable runnable) {
        AnonymousClass19A r2 = this.A0F;
        String A092 = r2.A09();
        C35911jS r0 = new C35911jS(A092, 13);
        r2.A0E(new C76633pC(this, r0, runnable), r0.A00, A092, 22, 32000);
    }

    public AnonymousClass1MN(C21100yf r4, AnonymousClass19J r5, C236519h r6, C21060yb r7, C19970wo r8, C19630wG r9, C20810yC r10, AnonymousClass19A r11) {
        Looper mainLooper = Looper.getMainLooper();
        this.A0C = r8;
        this.A0E = r10;
        this.A0A = r6;
        this.A0D = r9;
        this.A08 = r4;
        this.A0F = r11;
        this.A0B = r7;
        this.A07 = new Handler(mainLooper, new AnonymousClass1MO(this));
        this.A09 = r5;
    }

    private void A00() {
        if (A06(this)) {
            Log.i("ClientPingManager/periodic/cancel-handler");
            this.A07.removeMessages(1);
            return;
        }
        Log.i("ClientPingManager/periodic/cancel-alarm");
        A09(new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"));
    }

    public static void A01(AnonymousClass1MN r2) {
        if (A06(r2)) {
            Log.i("ClientPingManager/timeout/cancel-handler");
            r2.A07.removeMessages(2);
            return;
        }
        Log.i("ClientPingManager/timeout/cancel-alarm");
        r2.A09(new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"));
    }

    public static void A05(AnonymousClass1MN r6) {
        long j;
        long j2;
        if (A06(r6)) {
            Log.i("ClientPingManager/periodic/schedule-handler");
            Handler handler = r6.A07;
            if (r6.A00 == 0) {
                j2 = 15000;
            } else {
                j2 = 240000;
            }
            handler.sendEmptyMessageDelayed(1, j2);
            return;
        }
        Log.i("ClientPingManager/periodic/schedule-alarm");
        Context context = r6.A0D.A00;
        AlarmManager A052 = r6.A0B.A05();
        if (A052 == null) {
            Log.w("ClientPingManager/periodic/schedule-alarm; alarm manager is null");
            return;
        }
        PendingIntent A012 = C65743Th.A01(context, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"), 134217728);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (r6.A00 == 0) {
            j = 15000;
        } else {
            j = 240000;
        }
        long j3 = elapsedRealtime + j;
        int i = 2;
        if (r6.A04) {
            i = 3;
        }
        A052.set(i, j3, A012);
    }
}
