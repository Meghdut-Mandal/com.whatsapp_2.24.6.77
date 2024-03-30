package X;

/* renamed from: X.0W0  reason: invalid class name */
public abstract class AnonymousClass0W0 {
    public static final Object A00 = new Object();
    public static volatile C10820fH A01 = AnonymousClass0M0.A00;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r8, android.net.Uri r9) {
        /*
            java.lang.String r1 = r9.getAuthority()
            java.lang.String r7 = "com.google.android.gms.phenotype"
            boolean r0 = r7.equals(r1)
            r5 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r2 = "PhenotypeClientHelper"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.e(r2, r0)
            return r5
        L_0x001d:
            X.0fH r0 = A01
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0084
            java.lang.Object r6 = A00
            monitor-enter(r6)
            X.0fH r0 = A01     // Catch:{ all -> 0x0081 }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x003c
            X.0fH r0 = A01     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = r0.A00()     // Catch:{ all -> 0x0081 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ all -> 0x0081 }
            monitor-exit(r6)     // Catch:{ all -> 0x0081 }
            return r0
        L_0x003c:
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r0 = r8.getPackageName()     // Catch:{ all -> 0x0081 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0056
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ all -> 0x0081 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0081 }
            r1 = 29
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 >= r1) goto L_0x0066
            r0 = 0
            goto L_0x0066
        L_0x0056:
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ all -> 0x0081 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0074 }
            int r0 = r0.flags     // Catch:{ all -> 0x0081 }
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L_0x0074
            r5 = 1
            goto L_0x0074
        L_0x0066:
            android.content.pm.ProviderInfo r0 = r3.resolveContentProvider(r7, r0)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x0081 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0056
        L_0x0074:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0081 }
            X.0Lz r0 = new X.0Lz     // Catch:{ all -> 0x0081 }
            r0.<init>(r1)     // Catch:{ all -> 0x0081 }
            A01 = r0     // Catch:{ all -> 0x0081 }
            monitor-exit(r6)     // Catch:{ all -> 0x0081 }
            goto L_0x0084
        L_0x0081:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0081 }
            throw r0
        L_0x0084:
            X.0fH r0 = A01
            java.lang.Object r0 = r0.A00()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W0.A00(android.content.Context, android.net.Uri):boolean");
    }
}
