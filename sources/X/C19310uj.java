package X;

import java.util.concurrent.Executor;

/* renamed from: X.0uj  reason: invalid class name and case insensitive filesystem */
public final class C19310uj {
    public final C18960u7 A00;
    public final C19270uf A01;
    public final C19320uk A02;
    public final C19080uL A03;
    public final Executor A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.String] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0156  */
    public static final com.google.android.gms.tasks.zzw A00(android.os.Bundle r11, X.C19310uj r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "scope"
            r11.putString(r0, r15)
            java.lang.String r0 = "sender"
            r11.putString(r0, r14)
            java.lang.String r0 = "subtype"
            r11.putString(r0, r14)
            java.lang.String r0 = "appid"
            r11.putString(r0, r13)
            X.0u7 r0 = r12.A00
            X.C18960u7.A02(r0)
            X.0uB r0 = r0.A01
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "gmp_app_id"
            r11.putString(r0, r1)
            X.0uf r2 = r12.A01
            int r0 = r2.A05()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "gmsv"
            r11.putString(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "osv"
            r11.putString(r0, r1)
            java.lang.String r1 = r2.A06()
            java.lang.String r0 = "app_ver"
            r11.putString(r0, r1)
            monitor-enter(r2)
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x01c7 }
            if (r0 != 0) goto L_0x004d
            X.C19270uf.A03(r2)     // Catch:{ all -> 0x01c7 }
        L_0x004d:
            java.lang.String r1 = r2.A00     // Catch:{ all -> 0x01c7 }
            monitor-exit(r2)
            java.lang.String r0 = "app_ver_name"
            r11.putString(r0, r1)
            X.0WO r1 = X.AnonymousClass0WO.A01
            java.lang.String r5 = "firebase-iid"
            java.lang.String r9 = "Failed to get app version for libraryName: "
            java.lang.String r4 = "LibraryVersion"
            java.lang.String r0 = "Please provide a valid libraryName"
            X.AnonymousClass006.A05(r5, r0)
            java.util.concurrent.ConcurrentHashMap r3 = r1.A00
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r7 = r3.get(r5)
        L_0x006e:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x008c
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r0 = 19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "unknown_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r7 = r1.toString()
        L_0x008c:
            java.lang.String r2 = "fiid-"
            java.lang.String r1 = java.lang.String.valueOf(r7)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00aa
            java.lang.String r1 = r2.concat(r1)
        L_0x009c:
            java.lang.String r0 = "cliv"
            r11.putString(r0, r1)
            X.0uL r3 = r12.A03
            X.0ud r0 = r3.A00
            java.util.Set r2 = r0.A00
            monitor-enter(r2)
            goto L_0x0171
        L_0x00aa:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x009c
        L_0x00b0:
            java.util.Properties r6 = new java.util.Properties
            r6.<init>()
            r0 = 1
            r7 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x0129 }
            r0 = 0
            r2[r0] = r5     // Catch:{ IOException -> 0x0129 }
            java.lang.Class<X.0WO> r1 = X.AnonymousClass0WO.class
            java.lang.String r0 = "/%s.properties"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ IOException -> 0x0129 }
            java.io.InputStream r8 = r1.getResourceAsStream(r0)     // Catch:{ IOException -> 0x0129 }
            if (r8 == 0) goto L_0x00fc
            r6.load(r8)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            java.lang.String r0 = "version"
            java.lang.String r7 = r6.getProperty(r0, r7)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            X.0SR r6 = X.AnonymousClass0WO.A02     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            r1.<init>()     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            r1.append(r5)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            java.lang.String r0 = " version is "
            r1.append(r0)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            r1.append(r7)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = r6.A00     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
        L_0x00f8:
            android.util.Log.v(r4, r1)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            goto L_0x011f
        L_0x00fc:
            X.0SR r6 = X.AnonymousClass0WO.A02     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            r0.<init>()     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            r0.append(r9)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            r0.append(r5)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = r6.A00     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
            if (r0 == 0) goto L_0x011c
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
        L_0x011c:
            android.util.Log.w(r4, r1)     // Catch:{ IOException -> 0x0125, all -> 0x01bd }
        L_0x011f:
            if (r8 == 0) goto L_0x0154
            r8.close()     // Catch:{ IOException -> 0x0154 }
            goto L_0x0154
        L_0x0125:
            r2 = move-exception
            r10 = r7
            r7 = r8
            goto L_0x012b
        L_0x0129:
            r2 = move-exception
            r10 = r7
        L_0x012b:
            X.0SR r6 = X.AnonymousClass0WO.A02     // Catch:{ all -> 0x01c0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c0 }
            r0.<init>()     // Catch:{ all -> 0x01c0 }
            r0.append(r9)     // Catch:{ all -> 0x01c0 }
            r0.append(r5)     // Catch:{ all -> 0x01c0 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x01c0 }
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x014e
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x014b
            java.lang.String r1 = r0.concat(r1)     // Catch:{ all -> 0x01c0 }
        L_0x014b:
            android.util.Log.e(r4, r1, r2)     // Catch:{ all -> 0x01c0 }
        L_0x014e:
            if (r7 == 0) goto L_0x0153
            r7.close()     // Catch:{ IOException -> 0x0153 }
        L_0x0153:
            r7 = r10
        L_0x0154:
            if (r7 != 0) goto L_0x016c
            java.lang.String r1 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x016a
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0167
            java.lang.String r1 = r0.concat(r1)
        L_0x0167:
            android.util.Log.d(r4, r1)
        L_0x016a:
            java.lang.String r7 = "UNKNOWN"
        L_0x016c:
            r3.put(r5, r7)
            goto L_0x006e
        L_0x0171:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)     // Catch:{ all -> 0x01ba }
            monitor-exit(r2)     // Catch:{ all -> 0x01ba }
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0196
            java.lang.String r1 = r3.A01
        L_0x017e:
            java.lang.String r0 = "Firebase-Client"
            r11.putString(r0, r1)
            com.google.android.gms.tasks.TaskCompletionSource r3 = new com.google.android.gms.tasks.TaskCompletionSource
            r3.<init>()
            java.util.concurrent.Executor r2 = r12.A04
            r1 = 0
            X.1iV r0 = new X.1iV
            r0.<init>(r12, r11, r3, r1)
            r2.execute(r0)
            com.google.android.gms.tasks.zzw r0 = r3.zza
            return r0
        L_0x0196:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.A01
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            monitor-enter(r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)     // Catch:{ all -> 0x01b7 }
            monitor-exit(r2)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = X.C19080uL.A00(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L_0x017e
        L_0x01b7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01b7 }
            throw r0
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ba }
            throw r0
        L_0x01bd:
            r0 = move-exception
            r7 = r8
            goto L_0x01c1
        L_0x01c0:
            r0 = move-exception
        L_0x01c1:
            if (r7 == 0) goto L_0x01c6
            r7.close()     // Catch:{ IOException -> 0x01c6 }
        L_0x01c6:
            throw r0
        L_0x01c7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19310uj.A00(android.os.Bundle, X.0uj, java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.tasks.zzw");
    }

    public C19310uj(C18960u7 r3, C19270uf r4, C19080uL r5, Executor executor) {
        C18960u7.A02(r3);
        C19320uk r0 = new C19320uk(r3.A00, r4);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r0;
        this.A04 = executor;
        this.A03 = r5;
    }
}
