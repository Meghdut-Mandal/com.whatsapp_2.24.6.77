package com.whatsapp.location;

import X.AnonymousClass1BN;
import X.AnonymousClass1P5;
import X.AnonymousClass5KI;
import X.C07700Yy;
import X.C111795cr;
import X.C133576Zb;
import X.C1503074t;
import X.C157357cp;
import X.C19420v0;
import X.C19770wU;
import X.C19970wo;
import X.C20830yE;
import X.C21060yb;
import X.C21390zA;
import X.C227815t;
import X.C237019m;
import X.C36341k9;
import X.C36361kB;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C65743Th;
import X.C90494aF;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class LocationSharingService extends AnonymousClass5KI implements C157357cp {
    public static volatile boolean A0H;
    public long A00;
    public C21390zA A01;
    public C237019m A02;
    public C227815t A03;
    public AnonymousClass1BN A04;
    public C21060yb A05;
    public C19970wo A06;
    public C20830yE A07;
    public C19420v0 A08;
    public AnonymousClass1P5 A09;
    public C19770wU A0A;
    public C133576Zb A0B;
    public final Handler A0C = C36341k9.A0H();
    public final Runnable A0D = new C1503074t((Object) this, 11);
    public final Runnable A0E = new C1503074t((Object) this, 12);
    public volatile boolean A0F;
    public volatile boolean A0G;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void A00(Context context) {
        if (A0H) {
            C111795cr.A01(context, C36441kJ.A0H(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING"));
        }
    }

    public static void A02(Context context, AnonymousClass1P5 r3) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (r3.A0d()) {
            A01(context, C36441kJ.A0H(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_PERSISTENT_LOCATION_REPORTING"));
        } else if (A0H) {
            A00(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r3.A09.A0d() == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.location.LocationSharingService r3) {
        /*
            boolean r0 = r3.A0F
            if (r0 != 0) goto L_0x0016
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x0016
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0045
            X.1P5 r0 = r3.A09
            boolean r0 = r0.A0d()
            if (r0 == 0) goto L_0x0045
        L_0x0016:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationSharingService/stopSelfIfNeeded/service not stopped: "
            r2.append(r0)
            boolean r0 = r3.A0F
            r2.append(r0)
            java.lang.String r1 = "|"
            r2.append(r1)
            boolean r0 = r3.A0G
            r2.append(r0)
            r2.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0040
            X.1P5 r0 = r3.A09
            boolean r1 = r0.A0d()
            r0 = 1
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            X.C36331k8.A1S(r2, r0)
            return
        L_0x0045:
            r3.stopSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.A03(com.whatsapp.location.LocationSharingService):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r21 = this;
            java.lang.String r0 = "LocationSharingService/onCreate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r21
            super.onCreate()
            X.0wo r3 = r5.A06
            X.0yb r2 = r5.A05
            X.0v0 r1 = r5.A08
            X.15t r15 = r5.A03
            X.19m r14 = r5.A02
            X.1BN r0 = r5.A04
            X.6Zb r13 = new X.6Zb
            r17 = r2
            r18 = r3
            r19 = r1
            r20 = r5
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r5.A0B = r13
            X.0yb r0 = r13.A08     // Catch:{ RuntimeException -> 0x0052 }
            android.os.PowerManager r2 = r0.A0G()     // Catch:{ RuntimeException -> 0x0052 }
            if (r2 != 0) goto L_0x0035
            java.lang.String r0 = "MyLocationUpdater/onCreate pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0052 }
            goto L_0x0058
        L_0x0035:
            android.os.PowerManager$WakeLock r0 = r13.A02     // Catch:{ RuntimeException -> 0x0052 }
            if (r0 != 0) goto L_0x0044
            r1 = 1
            java.lang.String r0 = "ShareLocationService"
            android.os.PowerManager$WakeLock r0 = X.C111765co.A00(r2, r0, r1)     // Catch:{ RuntimeException -> 0x0052 }
            r13.A02 = r0     // Catch:{ RuntimeException -> 0x0052 }
            if (r0 == 0) goto L_0x0058
        L_0x0044:
            boolean r0 = r0.isHeld()     // Catch:{ RuntimeException -> 0x0052 }
            if (r0 != 0) goto L_0x0058
            android.os.PowerManager$WakeLock r2 = r13.A02     // Catch:{ RuntimeException -> 0x0052 }
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.acquire(r0)     // Catch:{ RuntimeException -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r1 = move-exception
            java.lang.String r0 = "MyLocationUpdater/onCreate/PowerManager exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0058:
            X.0v0 r0 = r13.A09
            android.content.SharedPreferences r2 = X.C36341k9.A0E(r0)
            java.lang.String r1 = "location_shared_duration"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.getString(r1, r0)
            long r11 = java.lang.System.currentTimeMillis()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = ";"
            java.lang.String[] r8 = r1.split(r0)
            int r7 = r8.length
            r10 = 0
            r6 = 0
        L_0x0079:
            if (r6 >= r7) goto L_0x00a8
            r1 = r8[r6]
            java.lang.String r0 = ","
            java.lang.String[] r9 = r1.split(r0)
            int r1 = r9.length
            r0 = 2
            if (r1 != r0) goto L_0x00a5
            r0 = r9[r10]
            int r4 = java.lang.Integer.parseInt(r0)
            long r2 = X.C36371kC.A07(r4)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00a5
            r0 = 1
            r0 = r9[r0]
            int r1 = java.lang.Integer.parseInt(r0)
            android.util.SparseIntArray r0 = r13.A04
            r0.put(r4, r1)
        L_0x00a5:
            int r6 = r6 + 1
            goto L_0x0079
        L_0x00a8:
            android.os.Handler r3 = r5.A0C
            java.lang.Runnable r2 = r5.A0D
            r0 = 42000(0xa410, double:2.0751E-319)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.onCreate():void");
    }

    public void onDestroy() {
        Log.i("LocationSharingService/onDestroy");
        AnonymousClass1P5 r0 = this.A09;
        synchronized (r0.A0P) {
            r0.A00 = 0;
        }
        stopForeground(true);
        A0H = false;
        this.A02.A08 = false;
        Handler handler = this.A0C;
        handler.removeCallbacks(this.A0D);
        handler.removeCallbacks(this.A0E);
        C133576Zb r1 = this.A0B;
        r1.A05.A05(r1);
        C133576Zb.A01(r1);
        PowerManager.WakeLock wakeLock = r1.A02;
        if (wakeLock != null && wakeLock.isHeld()) {
            r1.A02.release();
            r1.A02 = null;
        }
    }

    public static void A01(Context context, Intent intent) {
        if (!C111795cr.A01(context, intent)) {
            C07700Yy A0F2 = C36421kH.A0F(context);
            A0F2.A0F(context.getString(R.string.f12nameremoved));
            A0F2.A0E(context.getString(R.string.f12nameremoved));
            Intent A0D2 = C36431kI.A0D();
            A0D2.setClassName(context.getPackageName(), "com.whatsapp.location.LiveLocationPrivacyActivity");
            A0F2.A0D = C65743Th.A00(context, 0, A0D2, 0);
            A0F2.A09 = C90494aF.A0p();
            C36361kB.A1A(A0F2);
            ((NotificationManager) context.getSystemService("notification")).notify(12, A0F2.A05());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f4, code lost:
        if (r8 == Integer.MIN_VALUE) goto L_0x01f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01db A[LOOP:1: B:55:0x01d5->B:57:0x01db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1 A[EDGE_INSN: B:92:0x01d1->B:54:0x01d1 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationSharingService/onStartCommand intent="
            r1.append(r0)
            r8 = r20
            r1.append(r8)
            java.lang.String r0 = " permission="
            r1.append(r0)
            r6 = r19
            X.0yE r0 = r6.A07
            boolean r0 = r0.A05()
            r1.append(r0)
            java.lang.String r0 = " foreground="
            r1.append(r0)
            X.0zA r0 = r6.A01
            boolean r0 = r0.A00
            X.C36331k8.A1S(r1, r0)
            X.0Yy r3 = X.C36421kH.A0F(r6)
            r0 = 2131891748(0x7f121624, float:1.9418225E38)
            r1 = 2131891748(0x7f121624, float:1.9418225E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A0G(r0)
            java.lang.String r0 = r6.getString(r1)
            r3.A0F(r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.location.LiveLocationPrivacyActivity"
            r2.setClassName(r1, r0)
            r7 = 0
            android.app.PendingIntent r0 = X.C65743Th.A00(r6, r7, r2, r7)
            r3.A0D = r0
            short r0 = X.C90494aF.A0p()
            r3.A09 = r0
            X.0yE r0 = r6.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x01c2
            r0 = 2131891743(0x7f12161f, float:1.9418215E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A0E(r0)
            r1 = 2131231294(0x7f08023e, float:1.8078665E38)
        L_0x0071:
            android.app.Notification r0 = r3.A0B
            r0.icon = r1
            boolean r0 = X.C19550w8.A0A()
            r2 = 12
            android.app.Notification r1 = r3.A05()
            if (r0 == 0) goto L_0x01bd
            r0 = 8
            r6.startForeground(r2, r1, r0)
        L_0x0086:
            r5 = 1
            A0H = r5
            X.19m r0 = r6.A02
            r0.A08 = r5
            if (r20 == 0) goto L_0x00ad
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_SEND_LOCATION_WEB_RESPONSE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ad
            r6.A0F = r7
        L_0x00a9:
            A03(r6)
            return r5
        L_0x00ad:
            java.lang.String r2 = "duration"
            r3 = 42000(0xa410, double:2.0751E-319)
            if (r20 == 0) goto L_0x018c
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_START_LOCATION_UPDATES_FOR_WEB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0173
            long r2 = r8.getLongExtra(r2, r3)
            android.os.Handler r1 = r6.A0C
            java.lang.Runnable r0 = r6.A0E
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r2)
            r6.A0G = r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationSharingService/onStartCommand/start location updates; duration="
            X.C36321k7.A1V(r0, r1, r2)
            X.6Zb r7 = r6.A0B
            java.lang.String r6 = "web-client-updates"
        L_0x00dd:
            android.location.Location r0 = r7.A01
            r16 = 7200000(0x6ddd00, double:3.5572727E-317)
            if (r0 == 0) goto L_0x00f4
            long r3 = r0.getTime()
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0120
        L_0x00f4:
            X.19m r0 = r7.A05
            android.location.Location r6 = r0.A02(r6)
            if (r6 == 0) goto L_0x010b
            long r3 = r6.getTime()
            long r3 = r3 + r16
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x010b
            r6 = 0
        L_0x010b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MyLocationUpdater/onStartCommand/start; "
            r2.append(r0)
            if (r6 != 0) goto L_0x0161
            java.lang.String r0 = "location=null"
        L_0x0118:
            X.C36321k7.A1a(r2, r0)
            if (r6 == 0) goto L_0x0120
            X.C133576Zb.A00(r6, r7)
        L_0x0120:
            long r3 = r7.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x012b
            X.C133576Zb.A01(r7)
        L_0x012b:
            long r3 = java.lang.System.currentTimeMillis()
            r7.A00 = r3
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            r3 = 0
            r12 = 0
        L_0x0138:
            android.util.SparseIntArray r8 = r7.A04
            int r0 = r8.size()
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r12 >= r0) goto L_0x01d1
            int r14 = r8.keyAt(r12)
            int r6 = r8.get(r14)
            long r8 = (long) r14
            long r8 = r8 * r10
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 + r10
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x015d
            long r8 = (long) r6
            long r3 = r3 + r8
        L_0x015a:
            int r12 = r12 + 1
            goto L_0x0138
        L_0x015d:
            X.AnonymousClass000.A1F(r13, r14)
            goto L_0x015a
        L_0x0161:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "location.provider="
            r1.append(r0)
            java.lang.String r0 = r6.getProvider()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x0118
        L_0x0173:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "LocationSharingService/onStartCommand/stop location updates"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A0G = r7
            goto L_0x00a9
        L_0x0188:
            long r3 = r8.getLongExtra(r2, r3)
        L_0x018c:
            android.os.Handler r1 = r6.A0C
            java.lang.Runnable r0 = r6.A0D
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r3)
            X.0wo r0 = r6.A06
            long r0 = X.C19970wo.A00(r0)
            long r0 = r0 + r3
            r6.A00 = r0
            r6.A0F = r5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationSharingService/onStartCommand/start; duration="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "; maxEndTime="
            r2.append(r0)
            long r0 = r6.A00
            X.C36351kA.A1S(r2, r0)
            X.6Zb r7 = r6.A0B
            java.lang.String r6 = "location-sharing-service"
            goto L_0x00dd
        L_0x01bd:
            r6.startForeground(r2, r1)
            goto L_0x0086
        L_0x01c2:
            r0 = 2131890804(0x7f121274, float:1.941631E38)
            java.lang.String r0 = r6.getString(r0)
            r3.A0E(r0)
            r1 = 2131231579(0x7f08035b, float:1.8079243E38)
            goto L_0x0071
        L_0x01d1:
            java.util.Iterator r6 = r13.iterator()
        L_0x01d5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01e3
            int r0 = X.C36341k9.A0A(r6)
            r8.delete(r0)
            goto L_0x01d5
        L_0x01e3:
            X.1BN r0 = r7.A07
            boolean r9 = r0.A00()
            X.15t r0 = r7.A06
            X.15u r10 = r0.A00
            int r8 = r10.A02
            if (r8 == 0) goto L_0x01f6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            if (r8 != r0) goto L_0x01f7
        L_0x01f6:
            r6 = 0
        L_0x01f7:
            double r14 = r10.A00()
            boolean r0 = java.lang.Double.isNaN(r14)
            if (r0 == 0) goto L_0x0203
            r14 = 4636737291354636288(0x4059000000000000, double:100.0)
        L_0x0203:
            if (r9 != 0) goto L_0x0226
            r12 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r6 == 0) goto L_0x021a
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x021a
            r7.A00 = r1
        L_0x020f:
            r17 = 1000(0x3e8, double:4.94E-321)
            r0 = 5000(0x1388, double:2.4703E-320)
            r6 = 3
        L_0x0214:
            X.19m r10 = r7.A05
            r10.A05(r7)
            goto L_0x0241
        L_0x021a:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0226
            if (r6 != 0) goto L_0x022e
            r10 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x022e
        L_0x0226:
            r7.A00 = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            r17 = 10000(0x2710, double:4.9407E-320)
            r6 = 0
            goto L_0x0214
        L_0x022e:
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x023b
            if (r6 != 0) goto L_0x020f
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x020f
        L_0x023b:
            r17 = 5000(0x1388, double:2.4703E-320)
            r0 = 10000(0x2710, double:4.9407E-320)
            r6 = 2
            goto L_0x0214
        L_0x0241:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x026c }
            java.lang.String r2 = "MyLocationUpdater/onStartCommand/request location updates; powerSaveMode="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x026c }
            r8.append(r9)     // Catch:{ IllegalArgumentException -> 0x026c }
            java.lang.String r2 = "; duration="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x026c }
            r8.append(r3)     // Catch:{ IllegalArgumentException -> 0x026c }
            java.lang.String r2 = "; locationProviders="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x026c }
            r8.append(r6)     // Catch:{ IllegalArgumentException -> 0x026c }
            java.lang.String r2 = "; updateInterval="
            X.C36321k7.A1V(r2, r8, r0)     // Catch:{ IllegalArgumentException -> 0x026c }
            r13 = 0
            java.lang.String r12 = "location-updater"
            r11 = r7
            r14 = r6
            r15 = r0
            r10.A06(r11, r12, r13, r14, r15, r17)     // Catch:{ IllegalArgumentException -> 0x026c }
            return r5
        L_0x026c:
            r1 = move-exception
            java.lang.String r0 = "MyLocationUpdater/onCreate/GPS error "
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.onStartCommand(android.content.Intent, int, int):int");
    }
}
