package X;

import android.os.Build;
import android.os.UserManager;

/* renamed from: X.0YS  reason: invalid class name */
public final class AnonymousClass0YS {
    public static UserManager A00;
    public static volatile boolean A01 = (!A00());

    public static boolean A00() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0053, code lost:
        if (r0 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0055, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.content.Context r8) {
        /*
            boolean r0 = A00()
            r7 = 0
            if (r0 == 0) goto L_0x0059
            boolean r0 = A01
            if (r0 != 0) goto L_0x0059
            java.lang.Class<X.0YS> r6 = X.AnonymousClass0YS.class
            monitor-enter(r6)
            boolean r0 = A01     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            return r7
        L_0x0014:
            r5 = 1
            r4 = 1
        L_0x0016:
            r0 = 2
            r3 = 0
            if (r4 > r0) goto L_0x004c
            android.os.UserManager r1 = A00     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x002c
            java.lang.Class<android.os.UserManager> r0 = android.os.UserManager.class
            java.lang.Object r1 = r8.getSystemService(r0)     // Catch:{ all -> 0x0056 }
            android.os.UserManager r1 = (android.os.UserManager) r1     // Catch:{ all -> 0x0056 }
            A00 = r1     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x002c
            r0 = 1
            goto L_0x0050
        L_0x002c:
            boolean r0 = r1.isUserUnlocked()     // Catch:{ NullPointerException -> 0x003d }
            if (r0 != 0) goto L_0x004a
            android.os.UserHandle r0 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x003d }
            boolean r0 = r1.isUserRunning(r0)     // Catch:{ NullPointerException -> 0x003d }
            if (r0 != 0) goto L_0x004c
            goto L_0x004a
        L_0x003d:
            r2 = move-exception
            java.lang.String r1 = "DirectBootUtils"
            java.lang.String r0 = "Failed to check if user is unlocked."
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x0056 }
            A00 = r3     // Catch:{ all -> 0x0056 }
            int r4 = r4 + 1
            goto L_0x0016
        L_0x004a:
            r0 = 1
            goto L_0x004e
        L_0x004c:
            r0 = 0
            goto L_0x0052
        L_0x004e:
            A00 = r3     // Catch:{ all -> 0x0056 }
        L_0x0050:
            A01 = r5     // Catch:{ all -> 0x0056 }
        L_0x0052:
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0059
            return r5
        L_0x0056:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            throw r0
        L_0x0059:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YS.A01(android.content.Context):boolean");
    }
}
