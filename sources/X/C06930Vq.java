package X;

/* renamed from: X.0Vq  reason: invalid class name and case insensitive filesystem */
public final class C06930Vq {
    public static volatile C10820fH A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:65|66) */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x014b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C10820fH A00(android.content.Context r14) {
        /*
            java.lang.Class<X.0Vq> r13 = X.C06930Vq.class
            monitor-enter(r13)
            X.0fH r1 = A00     // Catch:{ all -> 0x0163 }
            if (r1 != 0) goto L_0x0161
            java.lang.String r2 = android.os.Build.TYPE     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = android.os.Build.TAGS     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "eng"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "userdebug"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x015d
        L_0x001b:
            java.lang.String r0 = "dev-keys"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x015d
        L_0x002b:
            boolean r0 = X.AnonymousClass0YS.A00()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x003b
            boolean r0 = r14.isDeviceProtectedStorage()     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x003b
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0163 }
        L_0x003b:
            android.os.StrictMode$ThreadPolicy r12 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0163 }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0158 }
            r5 = 0
            java.lang.String r0 = "phenotype_hermetic"
            java.io.File r1 = r14.getDir(r0, r5)     // Catch:{ RuntimeException -> 0x0051 }
            java.lang.String r0 = "overrides.txt"
            java.io.File r2 = new java.io.File     // Catch:{ RuntimeException -> 0x0051 }
            r2.<init>(r1, r0)     // Catch:{ RuntimeException -> 0x0051 }
            goto L_0x005c
        L_0x0051:
            r2 = move-exception
            java.lang.String r1 = "HermeticFileOverrides"
            java.lang.String r0 = "no data dir"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0158 }
            X.0M0 r1 = X.AnonymousClass0M0.A00     // Catch:{ all -> 0x0158 }
            goto L_0x0067
        L_0x005c:
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x0074
            X.0Lz r1 = new X.0Lz     // Catch:{ all -> 0x0158 }
            r1.<init>(r2)     // Catch:{ all -> 0x0158 }
        L_0x0067:
            boolean r0 = r1.A01()     // Catch:{ all -> 0x0158 }
            if (r0 == 0) goto L_0x0152
            java.lang.Object r10 = r1.A00()     // Catch:{ all -> 0x0158 }
            java.io.File r10 = (java.io.File) r10     // Catch:{ all -> 0x0158 }
            goto L_0x0077
        L_0x0074:
            X.0M0 r1 = X.AnonymousClass0M0.A00     // Catch:{ all -> 0x0158 }
            goto L_0x0067
        L_0x0077:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x014c }
            r1.<init>(r10)     // Catch:{ IOException -> 0x014c }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x014c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x014c }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x014c }
            r7.<init>(r0)     // Catch:{ IOException -> 0x014c }
            r6 = 1
            X.007 r4 = new X.007     // Catch:{ all -> 0x0132 }
            r4.<init>(r5)     // Catch:{ all -> 0x0132 }
            java.util.HashMap r9 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0132 }
        L_0x0090:
            java.lang.String r3 = r7.readLine()     // Catch:{ all -> 0x0132 }
            if (r3 == 0) goto L_0x0103
            java.lang.String r0 = " "
            r1 = 3
            java.lang.String[] r2 = r3.split(r0, r1)     // Catch:{ all -> 0x0132 }
            int r0 = r2.length     // Catch:{ all -> 0x0132 }
            if (r0 == r1) goto L_0x00b6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "Invalid: "
            r2.append(r0)     // Catch:{ all -> 0x0132 }
            r2.append(r3)     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = "HermeticFileOverrides"
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0132 }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0132 }
            goto L_0x0090
        L_0x00b6:
            r0 = r2[r5]     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r11.<init>(r0)     // Catch:{ all -> 0x0132 }
            r1 = r2[r6]     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r0.<init>(r1)     // Catch:{ all -> 0x0132 }
            java.lang.String r8 = android.net.Uri.decode(r0)     // Catch:{ all -> 0x0132 }
            r1 = 2
            r0 = r2[r1]     // Catch:{ all -> 0x0132 }
            java.lang.Object r3 = r9.get(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0132 }
            if (r3 != 0) goto L_0x00eb
            r0 = r2[r1]     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r2.<init>(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = android.net.Uri.decode(r2)     // Catch:{ all -> 0x0132 }
            int r1 = r3.length()     // Catch:{ all -> 0x0132 }
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 < r0) goto L_0x00e8
            if (r3 != r2) goto L_0x00eb
        L_0x00e8:
            r9.put(r2, r3)     // Catch:{ all -> 0x0132 }
        L_0x00eb:
            boolean r0 = r4.containsKey(r11)     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x00f9
            X.007 r0 = new X.007     // Catch:{ all -> 0x0132 }
            r0.<init>(r5)     // Catch:{ all -> 0x0132 }
            r4.put(r11, r0)     // Catch:{ all -> 0x0132 }
        L_0x00f9:
            java.lang.Object r0 = r4.get(r11)     // Catch:{ all -> 0x0132 }
            X.007 r0 = (X.AnonymousClass007) r0     // Catch:{ all -> 0x0132 }
            r0.put(r8, r3)     // Catch:{ all -> 0x0132 }
            goto L_0x0090
        L_0x0103:
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = r14.getPackageName()     // Catch:{ all -> 0x0132 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "Parsed "
            r1.append(r0)     // Catch:{ all -> 0x0132 }
            r1.append(r3)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = " for Android package "
            r1.append(r0)     // Catch:{ all -> 0x0132 }
            r1.append(r2)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "HermeticFileOverrides"
            X.AnonymousClass000.A1A(r1, r0)     // Catch:{ all -> 0x0132 }
            X.0SS r0 = new X.0SS     // Catch:{ all -> 0x0132 }
            r0.<init>(r4)     // Catch:{ all -> 0x0132 }
            r7.close()     // Catch:{ IOException -> 0x014c }
            X.0Lz r1 = new X.0Lz     // Catch:{ all -> 0x0158 }
            r1.<init>(r0)     // Catch:{ all -> 0x0158 }
            goto L_0x0154
        L_0x0132:
            r4 = move-exception
            r7.close()     // Catch:{ all -> 0x0137 }
            goto L_0x014b
        L_0x0137:
            r3 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x014b }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r2[r5] = r1     // Catch:{ Exception -> 0x014b }
            java.lang.String r0 = "addSuppressed"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r0, r2)     // Catch:{ Exception -> 0x014b }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x014b }
            r0[r5] = r3     // Catch:{ Exception -> 0x014b }
            r1.invoke(r4, r0)     // Catch:{ Exception -> 0x014b }
        L_0x014b:
            throw r4     // Catch:{ IOException -> 0x014c }
        L_0x014c:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ all -> 0x0158 }
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0152:
            X.0M0 r1 = X.AnonymousClass0M0.A00     // Catch:{ all -> 0x0158 }
        L_0x0154:
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x0163 }
            goto L_0x015f
        L_0x0158:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x015d:
            X.0M0 r1 = X.AnonymousClass0M0.A00     // Catch:{ all -> 0x0163 }
        L_0x015f:
            A00 = r1     // Catch:{ all -> 0x0163 }
        L_0x0161:
            monitor-exit(r13)     // Catch:{ all -> 0x0163 }
            return r1
        L_0x0163:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0163 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06930Vq.A00(android.content.Context):X.0fH");
    }
}
