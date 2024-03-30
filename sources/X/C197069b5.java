package X;

/* renamed from: X.9b5  reason: invalid class name and case insensitive filesystem */
public abstract class C197069b5 {
    @Deprecated
    public static final C06190Sq A00 = new C06190Sq(AnonymousClass9AV.A00, AnonymousClass9AV.A01, "Nearby.CONNECTIONS_API");
    @Deprecated
    public static final C06190Sq A01 = new C06190Sq(A48.A00, A48.A01, "Nearby.MESSAGES_API");
    @Deprecated
    public static final C06190Sq A02 = new C06190Sq(AnonymousClass9AW.A00, AnonymousClass9AW.A01, "Nearby.BOOTSTRAP_API");
    @Deprecated
    public static final C22812AwN A03 = A48.A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Boolean} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public static boolean A00(android.content.Context r20) {
        /*
            X.0Bh r0 = X.C02640Bg.A00(r20)
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            android.content.Context r0 = r0.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            r10 = 1
            if (r0 != 0) goto L_0x011c
            android.content.ContentResolver r14 = r20.getContentResolver()
            java.lang.String r5 = "gms:nearby:requires_gms_check"
            X.AwG r4 = X.C190889As.A02
            X.A3i r4 = (X.C21019A3i) r4
            if (r14 == 0) goto L_0x0115
            monitor-enter(r4)
            X.C21019A3i.A00(r14, r4)     // Catch:{ all -> 0x0112 }
            java.lang.Object r6 = r4.A00     // Catch:{ all -> 0x0112 }
            java.util.HashMap r3 = r4.A02     // Catch:{ all -> 0x0112 }
            r13 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x0112 }
            r20 = r2
            boolean r0 = r3.containsKey(r5)     // Catch:{ all -> 0x0112 }
            r7 = 0
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r3.get(r5)     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x003a
            r2 = r0
            goto L_0x003a
        L_0x0039:
            r2 = r7
        L_0x003a:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0112 }
            monitor-exit(r4)     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x0044
            boolean r13 = r2.booleanValue()
            return r13
        L_0x0044:
            monitor-enter(r4)
            X.C21019A3i.A00(r14, r4)     // Catch:{ all -> 0x010f }
            java.lang.Object r8 = r4.A00     // Catch:{ all -> 0x010f }
            java.util.HashMap r0 = r4.A01     // Catch:{ all -> 0x010f }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x005d
            java.util.HashMap r0 = r4.A01     // Catch:{ all -> 0x010f }
            java.lang.String r0 = X.C90504aG.A0l(r5, r0)     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x005b
            r7 = r0
        L_0x005b:
            monitor-exit(r4)     // Catch:{ all -> 0x010f }
            goto L_0x00c3
        L_0x005d:
            monitor-exit(r4)     // Catch:{ all -> 0x010f }
            android.net.Uri r15 = X.AnonymousClass9B1.A00     // Catch:{ 91y -> 0x00c3 }
            r16 = 0
            java.lang.String[] r18 = new java.lang.String[]{r5}     // Catch:{ 91y -> 0x00c3 }
            r19 = r16
            r17 = r16
            android.database.Cursor r9 = r14.query(r15, r16, r17, r18, r19)     // Catch:{ 91y -> 0x00c3 }
            if (r9 == 0) goto L_0x009b
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = r9.getString(r10)     // Catch:{ all -> 0x00a3 }
            r9.close()     // Catch:{ 91y -> 0x00c3 }
            goto L_0x0083
        L_0x007e:
            r9.close()     // Catch:{ 91y -> 0x00c3 }
            r1 = r7
            goto L_0x008c
        L_0x0083:
            if (r1 == 0) goto L_0x008c
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x008c
            r1 = r7
        L_0x008c:
            monitor-enter(r4)
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x0098 }
            if (r8 != r0) goto L_0x0096
            java.util.HashMap r0 = r4.A01     // Catch:{ all -> 0x0098 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            goto L_0x00c0
        L_0x0098:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            throw r0
        L_0x009b:
            java.lang.String r1 = "Failed to connect to GservicesProvider"
            X.91y r0 = new X.91y     // Catch:{ all -> 0x00a3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a3 }
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r12 = move-exception
            if (r9 == 0) goto L_0x00bf
            r9.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00bf
        L_0x00aa:
            r11 = move-exception
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x00bf }
            r8 = 0
            r0[r8] = r9     // Catch:{ Exception -> 0x00bf }
            java.lang.reflect.Method r1 = r9.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x00bf }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00bf }
            r0[r8] = r11     // Catch:{ Exception -> 0x00bf }
            r1.invoke(r12, r0)     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            throw r12     // Catch:{ 91y -> 0x00c3 }
        L_0x00c0:
            if (r1 == 0) goto L_0x00d6
            r7 = r1
        L_0x00c3:
            r1 = 0
            if (r7 == 0) goto L_0x00d6
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00d6
            java.util.regex.Pattern r0 = X.AnonymousClass9B1.A02
            boolean r0 = X.C36361kB.A1Z(r7, r0)
            if (r0 == 0) goto L_0x00d8
            r2 = r20
        L_0x00d6:
            monitor-enter(r4)
            goto L_0x00fe
        L_0x00d8:
            java.util.regex.Pattern r0 = X.AnonymousClass9B1.A03
            boolean r0 = X.C36361kB.A1Z(r7, r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r13 = 0
            goto L_0x00d6
        L_0x00e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "attempt to read Gservices key gms:nearby:requires_gms_check (value \""
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "\") as boolean"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "Gservices"
            android.util.Log.w(r0, r1)
            goto L_0x00d6
        L_0x00fe:
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x010c }
            if (r6 != r0) goto L_0x010a
            r3.put(r5, r2)     // Catch:{ all -> 0x010c }
            java.util.HashMap r0 = r4.A01     // Catch:{ all -> 0x010c }
            r0.remove(r5)     // Catch:{ all -> 0x010c }
        L_0x010a:
            monitor-exit(r4)     // Catch:{ all -> 0x010c }
            return r13
        L_0x010c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010c }
            throw r0
        L_0x010f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010f }
            throw r0
        L_0x0112:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0112 }
            throw r0
        L_0x0115:
            java.lang.String r0 = "ContentResolver needed with GservicesDelegateSupplier.init()"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x011c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197069b5.A00(android.content.Context):boolean");
    }
}
