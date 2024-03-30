package X;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: X.0tj  reason: invalid class name and case insensitive filesystem */
public abstract class C18760tj {
    public static volatile String A00;

    public static String A00(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("/processing time: ");
        sb.append(SystemClock.uptimeMillis() - j);
        sb.append(" ms");
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|33|34|36|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.content.Context r9) {
        /*
            boolean r0 = r9 instanceof android.content.ContextWrapper
            r8 = 0
            if (r0 == 0) goto L_0x000f
            r0 = r9
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            return r8
        L_0x000f:
            long r6 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = A00
            if (r0 != 0) goto L_0x00cc
            java.lang.String r3 = "ProcessNameUtil"
            r5 = 0
            java.lang.String r0 = "getMyProcessName"
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x00ab }
            boolean r0 = X.C19550w8.A05()     // Catch:{ Exception -> 0x00ab }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = android.app.Application.getProcessName()     // Catch:{ Exception -> 0x00ab }
            goto L_0x00ca
        L_0x002b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
            r1.<init>()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = "getMyProcessName/1"
            r1.append(r0)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = A00(r6)     // Catch:{ Exception -> 0x00ab }
            r1.append(r0)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00ab }
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x00ab }
            int r4 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch:{ Exception -> 0x00ab }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ Exception -> 0x00ab }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ Exception -> 0x00ab }
            if (r0 == 0) goto L_0x006c
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x00ab }
        L_0x0059:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x00ab }
            if (r0 == 0) goto L_0x006c
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x00ab }
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch:{ Exception -> 0x00ab }
            int r0 = r1.pid     // Catch:{ Exception -> 0x00ab }
            if (r0 != r4) goto L_0x0059
            java.lang.String r0 = r1.processName     // Catch:{ Exception -> 0x00ab }
            goto L_0x00ca
        L_0x006c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
            r1.<init>()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = "getMyProcessName/2"
            r1.append(r0)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = A00(r6)     // Catch:{ Exception -> 0x00ab }
            r1.append(r0)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00ab }
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = "/proc/self/cmdline"
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x00a9 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a9 }
            r0 = 128(0x80, float:1.794E-43)
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x00a9 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x00a0, all -> 0x00a4 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x00a0, all -> 0x00a4 }
            r1.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00ca
        L_0x00a0:
            r1.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00b1
        L_0x00a4:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00aa
        L_0x00a9:
            r0 = move-exception
        L_0x00aa:
            throw r0     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            java.lang.String r0 = "exception"
            android.util.Log.e(r3, r0, r1)
        L_0x00b1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "getMyProcessName/3"
            r1.append(r0)
            java.lang.String r0 = A00(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.i(r3, r0)
            r0 = r5
        L_0x00ca:
            A00 = r0
        L_0x00cc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "isSecondaryProcess/process name: "
            r1.append(r0)
            java.lang.String r0 = A00
            r1.append(r0)
            java.lang.String r0 = A00(r6)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ProcessNameUtil"
            android.util.Log.i(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r9.getPackageName()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r0 = A00
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = A00
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = A00
            int r1 = r0.length()
            int r0 = r2.length()
            if (r1 <= r0) goto L_0x000e
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18760tj.A02(android.content.Context):boolean");
    }

    public static String A01(Context context) {
        if (!A02(context)) {
            return null;
        }
        String str = A00;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(":");
        if (!str.substring(sb.toString().length()).equals("account_switching")) {
            return "unknown_process_name";
        }
        return "account_switching";
    }
}
