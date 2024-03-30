package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;

/* renamed from: X.1M7  reason: invalid class name */
public class AnonymousClass1M7 extends BroadcastReceiver {
    public final Context A00;
    public final C19600wD A01;
    public final C20500xf A02;
    public final C19650wI A03;
    public final AnonymousClass19W A04;
    public final AnonymousClass1M6 A05;
    public final C21060yb A06;
    public final C19970wo A07;

    public static AnonymousClass1M8 A00(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        boolean z = true;
        boolean z2 = false;
        if (networkInfo.getType() == 1) {
            z2 = true;
        }
        if (networkInfo.getType() != 0) {
            z = false;
        }
        return new AnonymousClass1M8(networkInfo.getTypeName(), networkInfo.getSubtypeName(), networkInfo.getSubtype(), z2, z, networkInfo.isConnected(), networkInfo.isRoaming());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass1M7 r10) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r5 = r10
            if (r1 < r0) goto L_0x0042
            X.0xf r0 = r10.A02
            X.0yC r2 = r0.A00
            r1 = 614(0x266, float:8.6E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0042
            boolean r3 = r10.A02()
        L_0x0019:
            X.1M6 r0 = r5.A05
            android.net.NetworkInfo r0 = r0.A01()
            X.1M8 r4 = A00(r0)
            long r1 = android.os.SystemClock.uptimeMillis()
            if (r3 == 0) goto L_0x002e
            X.0wD r0 = r5.A01
            r0.A07(r4)
        L_0x002e:
            java.lang.Boolean r0 = X.C18750th.A03
            X.3K7 r3 = new X.3K7
            r3.<init>(r4, r1)
            X.0wI r2 = r5.A03
            r1 = 31
            X.1j2 r0 = new X.1j2
            r0.<init>(r5, r3, r1)
            r2.A00(r0)
            return
        L_0x0042:
            r3 = 0
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>(r0)
            android.content.Context r6 = r10.A00
            X.19W r0 = r10.A04
            android.os.Looper r0 = r0.A00()
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r0)
            r9 = 0
            r10 = 1
            X.C26981Mg.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M7.A01(X.1M7):void");
    }

    private boolean A02() {
        C21060yb r1 = this.A06;
        C21060yb.A0P = true;
        ConnectivityManager A0E = r1.A0E();
        TelephonyManager A0K = r1.A0K();
        C21060yb.A0P = false;
        return this.A01.A0C(A0E, A0K);
    }

    public void onReceive(Context context, Intent intent) {
        this.A03.A00(new C35651j2(this, new AnonymousClass3K7(this.A01.A04(), SystemClock.uptimeMillis()), 31));
    }

    public AnonymousClass1M7(Context context, C19600wD r2, AnonymousClass1M6 r3, C21060yb r4, C19970wo r5, C20500xf r6, C19650wI r7, AnonymousClass19W r8) {
        this.A07 = r5;
        this.A00 = context;
        this.A02 = r6;
        this.A06 = r4;
        this.A03 = r7;
        this.A05 = r3;
        this.A04 = r8;
        this.A01 = r2;
    }
}
