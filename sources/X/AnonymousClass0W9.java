package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0W9  reason: invalid class name */
public abstract class AnonymousClass0W9 {
    public static final Handler A00 = new Handler(Looper.getMainLooper());
    public static final Field A01;
    public static final Field A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r6 == 27) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.app.Activity r11) {
        /*
            int r6 = android.os.Build.VERSION.SDK_INT
            r10 = 1
            r0 = 28
            if (r6 < r0) goto L_0x000b
            r11.recreate()
            return r10
        L_0x000b:
            r0 = 26
            if (r6 == r0) goto L_0x0014
            r1 = 27
            r0 = 0
            if (r6 != r1) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            r5 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.reflect.Method r0 = A05
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            return r5
        L_0x001d:
            java.lang.reflect.Method r0 = A03
            if (r0 != 0) goto L_0x0026
            java.lang.reflect.Method r0 = A04
            if (r0 != 0) goto L_0x0026
            return r5
        L_0x0026:
            java.lang.reflect.Field r0 = A02     // Catch:{ all -> 0x0094 }
            java.lang.Object r1 = r0.get(r11)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x001c
            java.lang.reflect.Field r0 = A01     // Catch:{ all -> 0x0094 }
            java.lang.Object r8 = r0.get(r11)     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x001c
            android.app.Application r4 = r11.getApplication()     // Catch:{ all -> 0x0094 }
            X.0ZO r3 = new X.0ZO     // Catch:{ all -> 0x0094 }
            r3.<init>(r11)     // Catch:{ all -> 0x0094 }
            r4.registerActivityLifecycleCallbacks(r3)     // Catch:{ all -> 0x0094 }
            android.os.Handler r2 = A00     // Catch:{ all -> 0x0094 }
            X.0gH r0 = new X.0gH     // Catch:{ all -> 0x0094 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0094 }
            r2.post(r0)     // Catch:{ all -> 0x0094 }
            r0 = 26
            if (r6 == r0) goto L_0x0058
            r0 = 27
            if (r6 == r0) goto L_0x0058
            r11.recreate()     // Catch:{ all -> 0x008a }
            goto L_0x0081
        L_0x0058:
            java.lang.reflect.Method r9 = A05     // Catch:{ all -> 0x008a }
            r0 = 9
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ all -> 0x008a }
            r7[r5] = r1     // Catch:{ all -> 0x008a }
            r6 = 0
            r7[r10] = r6     // Catch:{ all -> 0x008a }
            r0 = 2
            r7[r0] = r6     // Catch:{ all -> 0x008a }
            r0 = 3
            X.AnonymousClass000.A1L(r7, r5, r0)     // Catch:{ all -> 0x008a }
            r0 = 4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x008a }
            r7[r0] = r1     // Catch:{ all -> 0x008a }
            r0 = 5
            r7[r0] = r6     // Catch:{ all -> 0x008a }
            r0 = 6
            r7[r0] = r6     // Catch:{ all -> 0x008a }
            r0 = 7
            r7[r0] = r1     // Catch:{ all -> 0x008a }
            r0 = 8
            r7[r0] = r1     // Catch:{ all -> 0x008a }
            r9.invoke(r8, r7)     // Catch:{ all -> 0x008a }
        L_0x0081:
            X.0gI r0 = new X.0gI     // Catch:{ all -> 0x0094 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x0094 }
            r2.post(r0)     // Catch:{ all -> 0x0094 }
            return r10
        L_0x008a:
            r1 = move-exception
            X.0gI r0 = new X.0gI     // Catch:{ all -> 0x0094 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x0094 }
            r2.post(r0)     // Catch:{ all -> 0x0094 }
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W9.A00(android.app.Activity):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r2 == 27) goto L_0x0077;
     */
    static {
        /*
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            A00 = r0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r5 = 0
        L_0x0013:
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mMainThread"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0020 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            A01 = r1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mToken"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x0030 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            A02 = r1
            r6 = 0
            if (r5 == 0) goto L_0x0050
            java.lang.String r4 = "performStopActivity"
            r0 = 3
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ all -> 0x0050 }
            r1 = 0
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r3[r1] = r0     // Catch:{ all -> 0x0050 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0050 }
            r2 = 1
            r3[r2] = r0     // Catch:{ all -> 0x0050 }
            r1 = 2
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0H(r5, r0, r4, r3, r1)     // Catch:{ all -> 0x0050 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0050 }
            r6 = r0
        L_0x0050:
            A04 = r6
            r4 = 0
            if (r5 == 0) goto L_0x006a
            java.lang.String r3 = "performStopActivity"
            r0 = 2
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x006a }
            r1 = 0
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r2[r1] = r0     // Catch:{ all -> 0x006a }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006a }
            r1 = 1
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0H(r5, r0, r3, r2, r1)     // Catch:{ all -> 0x006a }
            r0.setAccessible(r1)     // Catch:{ all -> 0x006a }
            r4 = r0
        L_0x006a:
            A03 = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 == r0) goto L_0x0077
            r1 = 27
            r0 = 0
            if (r2 != r1) goto L_0x0078
        L_0x0077:
            r0 = 1
        L_0x0078:
            r7 = 0
            if (r0 == 0) goto L_0x00af
            if (r5 == 0) goto L_0x00af
            java.lang.String r6 = "requestRelaunchActivity"
            r0 = 9
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x00af }
            r1 = 0
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r4[r1] = r0     // Catch:{ all -> 0x00af }
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r3 = 1
            r4[r3] = r1     // Catch:{ all -> 0x00af }
            r0 = 2
            r4[r0] = r1     // Catch:{ all -> 0x00af }
            r1 = 3
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00af }
            r4[r1] = r0     // Catch:{ all -> 0x00af }
            r0 = 4
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00af }
            r4[r0] = r2     // Catch:{ all -> 0x00af }
            r0 = 5
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r4[r0] = r1     // Catch:{ all -> 0x00af }
            r0 = 6
            r4[r0] = r1     // Catch:{ all -> 0x00af }
            r0 = 7
            r4[r0] = r2     // Catch:{ all -> 0x00af }
            r0 = 8
            java.lang.reflect.Method r0 = X.AnonymousClass001.A0H(r5, r2, r6, r4, r0)     // Catch:{ all -> 0x00af }
            r0.setAccessible(r3)     // Catch:{ all -> 0x00af }
            r7 = r0
        L_0x00af:
            A05 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W9.<clinit>():void");
    }
}
