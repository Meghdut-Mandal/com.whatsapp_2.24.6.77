package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0ZV  reason: invalid class name */
public final class AnonymousClass0ZV implements ServiceConnection, C15940oI {
    public int A00 = 2;
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final AnonymousClass0YA A04;
    public final Map A05 = AnonymousClass001.A0J();
    public final /* synthetic */ C07520Yb A06;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r11 != null) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r17) {
        /*
            r16 = this;
            r9 = 0
            r0 = 3
            r12 = r16
            r12.A00 = r0
            android.os.StrictMode$VmPolicy r4 = android.os.StrictMode.getVmPolicy()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0020
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r4)
            android.os.StrictMode$VmPolicy$Builder r0 = r0.permitUnsafeIntentLaunch()
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
        L_0x0020:
            X.0Yb r2 = r12.A06     // Catch:{ all -> 0x00ad }
            X.0Ya r13 = r2.A01     // Catch:{ all -> 0x00ad }
            android.content.Context r10 = r2.A00     // Catch:{ all -> 0x00ad }
            X.0YA r3 = r12.A04     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = "ConnectionStatusConfig"
            java.lang.String r5 = r3.A01     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x0059
            boolean r0 = r3.A03     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x007c
            android.os.Bundle r8 = X.AnonymousClass001.A07()     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "serviceActionBundleKey"
            r8.putString(r0, r5)     // Catch:{ all -> 0x00ad }
            android.content.ContentResolver r7 = r10.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x004a }
            android.net.Uri r1 = X.AnonymousClass0YA.A04     // Catch:{ IllegalArgumentException -> 0x004a }
            java.lang.String r0 = "serviceIntentCall"
            android.os.Bundle r1 = r7.call(r1, r0, r9, r8)     // Catch:{ IllegalArgumentException -> 0x004a }
            if (r1 == 0) goto L_0x006f
            goto L_0x0065
        L_0x004a:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "Dynamic intent resolution failed: "
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x00ad }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00ad }
            goto L_0x006f
        L_0x0059:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00ad }
            r1.<init>()     // Catch:{ all -> 0x00ad }
            android.content.ComponentName r0 = r3.A00     // Catch:{ all -> 0x00ad }
            android.content.Intent r11 = r1.setComponent(r0)     // Catch:{ all -> 0x00ad }
            goto L_0x0087
        L_0x0065:
            java.lang.String r0 = "serviceResponseIntentKey"
            android.os.Parcelable r11 = r1.getParcelable(r0)     // Catch:{ all -> 0x00ad }
            android.content.Intent r11 = (android.content.Intent) r11     // Catch:{ all -> 0x00ad }
            if (r11 != 0) goto L_0x0087
        L_0x006f:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "Dynamic lookup for intent failed for action: "
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x00ad }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00ad }
        L_0x007c:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00ad }
            r1.<init>(r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x00ad }
            android.content.Intent r11 = r1.setPackage(r0)     // Catch:{ all -> 0x00ad }
        L_0x0087:
            r15 = 4225(0x1081, float:5.92E-42)
            r1 = 1
            r14 = r17
            boolean r0 = X.C07510Ya.A01(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ad }
            r12.A03 = r0     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a3
            android.os.Handler r0 = r2.A04     // Catch:{ all -> 0x00ad }
            android.os.Message r3 = r0.obtainMessage(r1, r3)     // Catch:{ all -> 0x00ad }
            android.os.Handler r2 = r2.A04     // Catch:{ all -> 0x00ad }
            r0 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x00ad }
            goto L_0x00a9
        L_0x00a3:
            r0 = 2
            r12.A00 = r0     // Catch:{ all -> 0x00ad }
            r13.A02(r10, r12)     // Catch:{ IllegalArgumentException -> 0x00a9 }
        L_0x00a9:
            android.os.StrictMode.setVmPolicy(r4)
            return
        L_0x00ad:
            r0 = move-exception
            android.os.StrictMode.setVmPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZV.A00(java.lang.String):void");
    }

    public AnonymousClass0ZV(AnonymousClass0YA r2, C07520Yb r3) {
        this.A06 = r3;
        this.A04 = r2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C07520Yb r0 = this.A06;
        synchronized (r0.A02) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            Iterator A0z = AnonymousClass000.A0z(this.A05);
            while (A0z.hasNext()) {
                ((ServiceConnection) A0z.next()).onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C07520Yb r0 = this.A06;
        synchronized (r0.A02) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            Iterator A0z = AnonymousClass000.A0z(this.A05);
            while (A0z.hasNext()) {
                ((ServiceConnection) A0z.next()).onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }
}
