package X;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: X.1Un  reason: invalid class name and case insensitive filesystem */
public final class C28901Un extends BroadcastReceiver {
    public static final C28901Un A04 = new C28901Un(0);
    public C21060yb A00;
    public AnonymousClass1G4 A01;
    public final Object A02;
    public volatile boolean A03;

    public static boolean A00(C21060yb r2) {
        C21060yb.A0P = true;
        PowerManager A0G = r2.A0G();
        KeyguardManager A06 = r2.A06();
        C21060yb.A0P = false;
        if (A0G == null || !A0G.isScreenOn()) {
            return true;
        }
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        Boolean bool = C18750th.A03;
        if (!A06.isKeyguardLocked() || !A06.inKeyguardRestrictedInputMode()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0033
            java.lang.Object r2 = r5.A02
            monitor-enter(r2)
            boolean r0 = r5.A03     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002e
            java.lang.Object r0 = X.C56042vd.A01(r6)     // Catch:{ all -> 0x0030 }
            X.0tq r0 = (X.C18800tq) r0     // Catch:{ all -> 0x0030 }
            X.0tq r0 = r0.AfI     // Catch:{ all -> 0x0030 }
            X.0tt r0 = r0.A00     // Catch:{ all -> 0x0030 }
            X.0tq r1 = r0.ADO     // Catch:{ all -> 0x0030 }
            X.004 r0 = r1.A8W     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0030 }
            X.0yb r0 = (X.C21060yb) r0     // Catch:{ all -> 0x0030 }
            r5.A00 = r0     // Catch:{ all -> 0x0030 }
            X.004 r0 = r1.A7Z     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0030 }
            X.1G4 r0 = (X.AnonymousClass1G4) r0     // Catch:{ all -> 0x0030 }
            r5.A01 = r0     // Catch:{ all -> 0x0030 }
            r0 = 1
            r5.A03 = r0     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            X.1G4 r0 = r5.A01
            boolean r4 = r0.A01()
            java.lang.String r1 = r7.getAction()
            if (r1 == 0) goto L_0x0046
            int r0 = r1.hashCode()
            switch(r0) {
                case -2128145023: goto L_0x008e;
                case -1454123155: goto L_0x0083;
                case 823795052: goto L_0x0078;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.String r3 = "unknown"
        L_0x0048:
            X.0yb r0 = r5.A00
            boolean r2 = A00(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ScreenLockReceiver; tag="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; locked="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; oldLocked="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1G4 r0 = r5.A01
            r0.A00(r2)
            return
        L_0x0078:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r3 = "unlock"
            goto L_0x0048
        L_0x0083:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r3 = "on"
            goto L_0x0048
        L_0x008e:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r3 = "off"
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28901Un.onReceive(android.content.Context, android.content.Intent):void");
    }

    public C28901Un(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    public C28901Un() {
        this(0);
    }
}
