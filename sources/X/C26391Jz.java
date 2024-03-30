package X;

import android.os.Build;

/* renamed from: X.1Jz  reason: invalid class name and case insensitive filesystem */
public class C26391Jz {
    public static int A00 = -1;
    public static Boolean A01;
    public static final String[] A02 = {"GT-N7100", "GT-I9305"};

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int A00(X.C21060yb r3) {
        /*
            java.lang.Class<X.1Jz> r2 = X.C26391Jz.class
            monitor-enter(r2)
            int r1 = A00     // Catch:{ all -> 0x0025 }
            r0 = -1
            if (r1 != r0) goto L_0x0023
            android.app.ActivityManager r1 = r3.A04()     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "memoryclassprovider am=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0025 }
            goto L_0x001f
        L_0x0014:
            int r0 = r1.getMemoryClass()     // Catch:{ all -> 0x0025 }
            A00 = r0     // Catch:{ all -> 0x0025 }
            int r0 = r1.getMemoryClass()     // Catch:{ all -> 0x0025 }
            goto L_0x0021
        L_0x001f:
            r0 = 16
        L_0x0021:
            monitor-exit(r2)
            return r0
        L_0x0023:
            monitor-exit(r2)
            return r1
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26391Jz.A00(X.0yb):int");
    }

    public static boolean A01() {
        Boolean bool = A01;
        if (bool == null) {
            String[] strArr = A02;
            boolean z = false;
            for (int i = 0; i < 2; i++) {
                if (Build.MODEL.equals(strArr[i])) {
                    A01 = true;
                    return true;
                }
            }
            int i2 = A00;
            if (i2 < 0) {
                return false;
            }
            if (i2 <= 48) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            A01 = bool;
        }
        return bool.booleanValue();
    }
}
