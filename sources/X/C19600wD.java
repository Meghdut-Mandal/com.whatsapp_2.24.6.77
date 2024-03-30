package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0wD  reason: invalid class name and case insensitive filesystem */
public class C19600wD extends C19590wC {
    public AnonymousClass3K7 A00;
    public final C19630wG A01;
    public final C19670wK A02 = new C19670wK();
    public final C19650wI A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final Object A07 = new Object();
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public volatile C91444c1 A09;

    public boolean A0C(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        if (connectivityManager != null) {
            try {
                C91444c1 A002 = A00();
                connectivityManager.registerDefaultNetworkCallback(A002);
                A002.A02 = connectivityManager;
                A002.A04 = telephonyManager;
                return true;
            } catch (RuntimeException e) {
                Log.e("ConnectivityStateProvider/registerForNetworkCallbacks", e);
            }
        }
        return false;
    }

    private C91444c1 A00() {
        if (this.A09 == null) {
            synchronized (this) {
                if (this.A09 == null) {
                    this.A09 = new C91444c1(this, (C20830yE) this.A06.get());
                }
            }
        }
        return this.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r2 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01() {
        /*
            java.lang.String r1 = X.AnonymousClass6JD.A0K
            r0 = 3
            r3 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0043 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0043 }
            r0.<init>(r1)     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0043 }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0043 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException | SecurityException -> 0x003f, all -> 0x0043 }
            r2.setInstanceFollowRedirects(r3)     // Catch:{ IOException | SecurityException -> 0x0038, all -> 0x0031 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setConnectTimeout(r0)     // Catch:{ IOException | SecurityException -> 0x0038, all -> 0x0031 }
            r2.setReadTimeout(r0)     // Catch:{ IOException | SecurityException -> 0x0038, all -> 0x0031 }
            r2.setUseCaches(r3)     // Catch:{ IOException | SecurityException -> 0x0038, all -> 0x0031 }
            r2.getInputStream()     // Catch:{ IOException | SecurityException -> 0x0038, all -> 0x0031 }
            int r1 = r2.getResponseCode()     // Catch:{ IOException | SecurityException -> 0x0038, all -> 0x0031 }
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 == r0) goto L_0x003c
            java.lang.String r0 = "captive portal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | SecurityException -> 0x0038, all -> 0x0031 }
            goto L_0x003b
        L_0x0031:
            r0 = move-exception
            if (r2 == 0) goto L_0x0044
            r2.disconnect()
            goto L_0x0044
        L_0x0038:
            if (r2 == 0) goto L_0x003f
            goto L_0x003c
        L_0x003b:
            r3 = 1
        L_0x003c:
            r2.disconnect()
        L_0x003f:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L_0x0043:
            r0 = move-exception
        L_0x0044:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19600wD.A01():boolean");
    }

    public int A03(boolean z) {
        Boolean bool = C18750th.A03;
        if (A0B()) {
            return A00().A01();
        }
        return ((AnonymousClass1M6) this.A04.get()).A00(z);
    }

    public AnonymousClass3K7 A05() {
        AnonymousClass3K7 r0;
        synchronized (this.A07) {
            r0 = this.A00;
        }
        return r0;
    }

    public void A07(AnonymousClass1M8 r3) {
        this.A08.set(true);
        C91444c1 A002 = A00();
        if (r3 != null) {
            A002.A00.set(r3.A03);
        }
    }

    public void A08(AnonymousClass3K7 r6) {
        long j;
        AnonymousClass3K7 r0 = this.A00;
        if (r0 != null) {
            j = r0.A00;
        } else {
            j = 0;
        }
        if (r6.A00 >= j) {
            synchronized (this.A07) {
                this.A00 = r6;
            }
            for (C19680wL BUP : getObservers()) {
                BUP.BUP(r6);
            }
        }
    }

    public boolean A09() {
        Boolean bool = C18750th.A03;
        if (A0B()) {
            return A00().A04();
        }
        return ((AnonymousClass1M6) this.A04.get()).A02();
    }

    public boolean A0B() {
        if (Build.VERSION.SDK_INT < 29 || !this.A08.get()) {
            return false;
        }
        return true;
    }

    public C19600wD(C19630wG r3, C19650wI r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        super(r8);
        this.A01 = r3;
        this.A05 = r5;
        this.A04 = r6;
        this.A06 = r7;
        this.A03 = r4;
    }

    public static boolean A02(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r2 != 2) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1M8 A04() {
        /*
            r10 = this;
            boolean r0 = r10.A0B()
            r6 = 1
            if (r0 == 0) goto L_0x00b6
            X.4c1 r3 = r10.A00()
            int r2 = r3.A01()
            X.005 r0 = r10.A06
            java.lang.Object r1 = r0.get()
            X.0yE r1 = (X.C20830yE) r1
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x009f
            int r5 = r3.A02()
        L_0x0023:
            if (r2 == r6) goto L_0x002a
            r6 = 0
            r0 = 2
            r7 = 1
            if (r2 == r0) goto L_0x002b
        L_0x002a:
            r7 = 0
        L_0x002b:
            boolean r8 = r3.A04()
            r0 = 3
            if (r2 != r0) goto L_0x0090
            r9 = 1
            java.lang.String r3 = "ROAMING"
        L_0x0035:
            switch(r5) {
                case 1: goto L_0x0054;
                case 2: goto L_0x0057;
                case 3: goto L_0x005a;
                case 4: goto L_0x005d;
                case 5: goto L_0x0060;
                case 6: goto L_0x0063;
                case 7: goto L_0x0066;
                case 8: goto L_0x0069;
                case 9: goto L_0x006c;
                case 10: goto L_0x006f;
                case 11: goto L_0x0072;
                case 12: goto L_0x0075;
                case 13: goto L_0x0078;
                case 14: goto L_0x007b;
                case 15: goto L_0x007e;
                case 16: goto L_0x0081;
                case 17: goto L_0x0084;
                case 18: goto L_0x0087;
                case 19: goto L_0x008a;
                case 20: goto L_0x008d;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UNDEFINED("
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r4 = r1.toString()
        L_0x004e:
            X.1M8 r2 = new X.1M8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0054:
            java.lang.String r4 = "GPRS"
            goto L_0x004e
        L_0x0057:
            java.lang.String r4 = "EDGE"
            goto L_0x004e
        L_0x005a:
            java.lang.String r4 = "UMTS"
            goto L_0x004e
        L_0x005d:
            java.lang.String r4 = "CDMA"
            goto L_0x004e
        L_0x0060:
            java.lang.String r4 = "EVDO_0"
            goto L_0x004e
        L_0x0063:
            java.lang.String r4 = "EVDO_A"
            goto L_0x004e
        L_0x0066:
            java.lang.String r4 = "1xRTT"
            goto L_0x004e
        L_0x0069:
            java.lang.String r4 = "HSDPA"
            goto L_0x004e
        L_0x006c:
            java.lang.String r4 = "HSUPA"
            goto L_0x004e
        L_0x006f:
            java.lang.String r4 = "HSPA"
            goto L_0x004e
        L_0x0072:
            java.lang.String r4 = "IDEN"
            goto L_0x004e
        L_0x0075:
            java.lang.String r4 = "EVDO_B"
            goto L_0x004e
        L_0x0078:
            java.lang.String r4 = "LTE"
            goto L_0x004e
        L_0x007b:
            java.lang.String r4 = "EHRPD"
            goto L_0x004e
        L_0x007e:
            java.lang.String r4 = "HSPAP"
            goto L_0x004e
        L_0x0081:
            java.lang.String r4 = "GSM"
            goto L_0x004e
        L_0x0084:
            java.lang.String r4 = "TD_SCDMA"
            goto L_0x004e
        L_0x0087:
            java.lang.String r4 = "IWLAN"
            goto L_0x004e
        L_0x008a:
            java.lang.String r4 = "LTE_CA"
            goto L_0x004e
        L_0x008d:
            java.lang.String r4 = "NR"
            goto L_0x004e
        L_0x0090:
            r9 = 0
            if (r2 == 0) goto L_0x009c
            r0 = 1
            if (r2 == r0) goto L_0x0099
            java.lang.String r3 = "CELLULAR"
            goto L_0x0035
        L_0x0099:
            java.lang.String r3 = "WIFI"
            goto L_0x0035
        L_0x009c:
            java.lang.String r3 = "NONE"
            goto L_0x0035
        L_0x009f:
            X.005 r0 = r10.A04
            java.lang.Object r0 = r0.get()
            X.1M6 r0 = (X.AnonymousClass1M6) r0
            android.net.NetworkInfo r0 = r0.A01()
            if (r0 == 0) goto L_0x00b3
            int r5 = r0.getSubtype()
            goto L_0x0023
        L_0x00b3:
            r5 = 0
            goto L_0x0023
        L_0x00b6:
            X.005 r0 = r10.A04
            java.lang.Object r0 = r0.get()
            X.1M6 r0 = (X.AnonymousClass1M6) r0
            android.net.NetworkInfo r2 = r0.A01()
            if (r2 == 0) goto L_0x00eb
            int r1 = r2.getType()
            r0 = 1
            r6 = 0
            if (r1 != r0) goto L_0x00cd
            r6 = 1
        L_0x00cd:
            int r0 = r2.getType()
            r7 = 0
            if (r0 != 0) goto L_0x00d5
            r7 = 1
        L_0x00d5:
            int r5 = r2.getSubtype()
            boolean r8 = r2.isConnected()
            boolean r9 = r2.isRoaming()
            java.lang.String r3 = r2.getTypeName()
            java.lang.String r4 = r2.getSubtypeName()
            goto L_0x004e
        L_0x00eb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19600wD.A04():X.1M8");
    }

    public void A06() {
        AnonymousClass1M8 A042 = A04();
        this.A03.A00(new C35321iV(this, new AnonymousClass3K7(A042, C19970wo.A00((C19970wo) this.A05.get())), A042, 29));
    }

    public boolean A0A() {
        if (A0B()) {
            return A00().A03();
        }
        return ((AnonymousClass1M6) this.A04.get()).A03();
    }
}
