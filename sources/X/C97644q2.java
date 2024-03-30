package X;

/* renamed from: X.4q2  reason: invalid class name and case insensitive filesystem */
public abstract class C97644q2 extends C97654q3 {
    public final C161127mE A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(24:7|8|9|(5:11|(1:13)|14|(3:16|(1:18)(1:24)|19)|20)|21|(2:23|(2:45|(4:47|(4:43|26|(1:40)(2:169|34)|41)|168|44)(1:174)))(0)|25|35|(1:37)(1:39)|38|48|(1:50)(1:55)|51|(2:53|(4:56|57|14a|(6:83|84|85|(1:87)|133|(2:137|(2:139|140)))))|106|107|108|109|110|111|112|113|(2:115|116)|(2:119|(2:121|(5:123|(1:125)|126|(2:127|(3:129|(2:131|179)(1:178)|176)(1:177))|140)(2:141|142))(1:183))(1:182)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:100|101) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        X.AnonymousClass6TY.A0A.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d6, code lost:
        if (r2 != null) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d8, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01db, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0239, code lost:
        if (r2 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        X.AnonymousClass6TY.A0K.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025e, code lost:
        if (r1 != null) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0265, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0266, code lost:
        if (r1 != null) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x026b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x026c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x026d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ce, code lost:
        r2 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x01cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0259 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6VI A07(int r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            X.7mE r7 = r0.A00
            X.4qK r7 = (X.C97824qK) r7
            r12 = r22
            if (r22 < 0) goto L_0x02a2
            r9 = r23
            if (r23 < 0) goto L_0x029b
            r3 = 2
            r8 = r24
            int r0 = r24 + -1
            int r3 = r3 << r0
            java.lang.String r2 = " for zoom level "
            if (r12 > r3) goto L_0x028a
            if (r9 > r3) goto L_0x0279
            r6 = r7
            X.4q7 r6 = (X.C97694q7) r6
            java.lang.String r0 = r6.A00     // Catch:{ MalformedURLException -> 0x026e }
            r18 = r0
            boolean r0 = r18.isEmpty()     // Catch:{ MalformedURLException -> 0x026e }
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "&_nc_client_caller="
            java.lang.StringBuilder r3 = X.C90524aI.A0i(r0)     // Catch:{ MalformedURLException -> 0x026e }
            X.5yJ r2 = r6.A03     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = r2.A03     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = android.net.Uri.encode(r0)     // Catch:{ MalformedURLException -> 0x026e }
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r1 = r2.A04     // Catch:{ MalformedURLException -> 0x026e }
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = "&_nc_client_id="
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = android.net.Uri.encode(r1)     // Catch:{ MalformedURLException -> 0x026e }
            r3.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
        L_0x0048:
            java.lang.String r0 = r6.A01     // Catch:{ MalformedURLException -> 0x026e }
            if (r0 != 0) goto L_0x0054
            boolean r0 = r2.A06     // Catch:{ MalformedURLException -> 0x026e }
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "dark"
        L_0x0052:
            r6.A01 = r0     // Catch:{ MalformedURLException -> 0x026e }
        L_0x0054:
            java.lang.String r18 = r3.toString()     // Catch:{ MalformedURLException -> 0x026e }
            r0 = r18
            r6.A00 = r0     // Catch:{ MalformedURLException -> 0x026e }
        L_0x005c:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ MalformedURLException -> 0x026e }
            boolean r0 = X.AnonymousClass6UZ.A06     // Catch:{ MalformedURLException -> 0x026e }
            X.AnonymousClass6UZ.A02(r0)     // Catch:{ MalformedURLException -> 0x026e }
            X.5xY r17 = X.AnonymousClass6UZ.A0B     // Catch:{ MalformedURLException -> 0x026e }
            r0 = r17
            java.lang.String[] r14 = r0.A05     // Catch:{ MalformedURLException -> 0x026e }
            if (r14 == 0) goto L_0x0078
            r13 = 1
            int r13 = r13 << r24
            int r0 = r14.length     // Catch:{ MalformedURLException -> 0x026e }
            r20 = r0
            r4 = 0
            goto L_0x00fa
        L_0x0076:
            r0 = 0
            goto L_0x0052
        L_0x0078:
            r0 = r17
            java.lang.String r0 = r0.A01     // Catch:{ MalformedURLException -> 0x026e }
            goto L_0x009c
        L_0x007d:
            r0 = r16[r4]     // Catch:{ MalformedURLException -> 0x026e }
            r11 = r0[r10]     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r11.A01     // Catch:{ MalformedURLException -> 0x026e }
            double r2 = (double) r13     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x026e }
            if (r15 > r12) goto L_0x00f1
            double r0 = r11.A02     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x026e }
            if (r12 > r15) goto L_0x00f1
            double r0 = r11.A03     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r0 * r2
            int r15 = (int) r0     // Catch:{ MalformedURLException -> 0x026e }
            if (r15 > r9) goto L_0x00f1
            double r0 = r11.A00     // Catch:{ MalformedURLException -> 0x026e }
            double r0 = r0 * r2
            int r2 = (int) r0     // Catch:{ MalformedURLException -> 0x026e }
            if (r9 > r2) goto L_0x00f1
            r0 = r14[r4]     // Catch:{ MalformedURLException -> 0x026e }
        L_0x009c:
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&x="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r12)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&y="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r9)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&z="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r8)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&size="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            int r0 = r6.A00     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&ppi="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            int r0 = r6.A02     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&language="
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = X.AnonymousClass6UZ.A04     // Catch:{ MalformedURLException -> 0x026e }
            r5.append(r0)     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r2 = r6.A01     // Catch:{ MalformedURLException -> 0x026e }
            if (r2 == 0) goto L_0x00ee
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ MalformedURLException -> 0x026e }
            java.lang.String r0 = "&theme="
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ MalformedURLException -> 0x026e }
        L_0x00e3:
            r0 = r18
            java.lang.String r0 = X.AnonymousClass000.A0p(r1, r0, r5)     // Catch:{ MalformedURLException -> 0x026e }
            java.net.URL r11 = X.C90524aI.A0j(r0)     // Catch:{ MalformedURLException -> 0x026e }
            goto L_0x010b
        L_0x00ee:
            java.lang.String r1 = ""
            goto L_0x00e3
        L_0x00f1:
            int r10 = r10 + 1
        L_0x00f3:
            r0 = r19
            if (r10 >= r0) goto L_0x00f8
            goto L_0x007d
        L_0x00f8:
            int r4 = r4 + 1
        L_0x00fa:
            r0 = r20
            if (r4 >= r0) goto L_0x0078
            r0 = r17
            X.6Ms[][] r0 = r0.A06     // Catch:{ MalformedURLException -> 0x026e }
            r16 = r0
            r0 = r0[r4]     // Catch:{ MalformedURLException -> 0x026e }
            int r0 = r0.length     // Catch:{ MalformedURLException -> 0x026e }
            r19 = r0
            r10 = 0
            goto L_0x00f3
        L_0x010b:
            java.lang.StringBuilder r2 = X.C90504aG.A0q(r12)
            java.lang.String r1 = "_"
            r2.append(r1)
            r2.append(r9)
            r2.append(r1)
            r2.append(r8)
            r2.append(r1)
            java.lang.String r0 = X.AnonymousClass6UZ.A05
            r2.append(r0)
            r2.append(r1)
            X.5xY r0 = X.AnonymousClass6UZ.A0B
            java.lang.String r0 = r0.A02
            r2.append(r0)
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = X.C36321k7.A0D(r1, r0)
        L_0x0137:
            java.lang.String r6 = X.AnonymousClass000.A0q(r0, r2)
            X.71y r0 = X.C97824qK.A05
            if (r0 == 0) goto L_0x01dc
            X.71y r0 = X.C97824qK.A05
            r3 = 0
            if (r0 == 0) goto L_0x01dc
            goto L_0x0148
        L_0x0145:
            java.lang.String r0 = ""
            goto L_0x0137
        L_0x0148:
            X.71y r4 = X.C97824qK.A05     // Catch:{ IOException -> 0x01ce, all -> 0x01cc }
            monitor-enter(r4)     // Catch:{ IOException -> 0x01ce, all -> 0x01cc }
            java.io.Writer r0 = r4.A03     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01c2
            X.C1495971y.A05(r6)     // Catch:{ all -> 0x01c9 }
            java.util.LinkedHashMap r0 = r4.A09     // Catch:{ all -> 0x01c9 }
            java.lang.Object r8 = r0.get(r6)     // Catch:{ all -> 0x01c9 }
            X.67g r8 = (X.C1271767g) r8     // Catch:{ all -> 0x01c9 }
            r2 = 0
            if (r8 == 0) goto L_0x01b3
            boolean r0 = r8.A02     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01b3
            int r10 = r4.A05     // Catch:{ all -> 0x01c9 }
            java.io.InputStream[] r5 = new java.io.InputStream[r10]     // Catch:{ all -> 0x01c9 }
            r9 = 0
            r1 = 0
        L_0x0167:
            if (r1 >= r10) goto L_0x0182
            java.io.File r0 = r8.A00()     // Catch:{ FileNotFoundException -> 0x0175 }
            java.io.FileInputStream r0 = X.C90524aI.A0U(r0)     // Catch:{ FileNotFoundException -> 0x0175 }
            r5[r1] = r0     // Catch:{ FileNotFoundException -> 0x0175 }
            r1 = 1
            goto L_0x0167
        L_0x0175:
            if (r9 >= r10) goto L_0x01b3
            r0 = r5[r9]     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01b3
            r0 = r5[r9]     // Catch:{ all -> 0x01c9 }
            X.C1495971y.A02(r0)     // Catch:{ all -> 0x01c9 }
            r9 = 1
            goto L_0x0175
        L_0x0182:
            int r0 = r4.A00     // Catch:{ all -> 0x01c9 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x01c9 }
            java.io.Writer r2 = r4.A03     // Catch:{ all -> 0x01c9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "READ "
            r1.append(r0)     // Catch:{ all -> 0x01c9 }
            r1.append(r6)     // Catch:{ all -> 0x01c9 }
            r0 = 10
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r0)     // Catch:{ all -> 0x01c9 }
            r2.append(r0)     // Catch:{ all -> 0x01c9 }
            boolean r0 = X.C1495971y.A06(r4)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x01ac
            java.util.concurrent.ThreadPoolExecutor r1 = r4.A0B     // Catch:{ all -> 0x01c9 }
            java.util.concurrent.Callable r0 = r4.A0A     // Catch:{ all -> 0x01c9 }
            r1.submit(r0)     // Catch:{ all -> 0x01c9 }
        L_0x01ac:
            long[] r0 = r8.A04     // Catch:{ all -> 0x01c9 }
            X.71m r2 = new X.71m     // Catch:{ all -> 0x01c9 }
            r2.<init>(r4, r0, r5)     // Catch:{ all -> 0x01c9 }
        L_0x01b3:
            monitor-exit(r4)     // Catch:{ IOException -> 0x01ce, all -> 0x01cc }
            if (r2 == 0) goto L_0x01dc
            r1 = 0
            java.io.InputStream[] r0 = r2.A00     // Catch:{ IOException -> 0x01cf }
            r0 = r0[r1]     // Catch:{ IOException -> 0x01cf }
            if (r0 == 0) goto L_0x023b
            X.5sA r3 = X.C139316ja.A00(r0, r1)     // Catch:{ IOException -> 0x01cf }
            goto L_0x023b
        L_0x01c2:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x01c9 }
            throw r0     // Catch:{ all -> 0x01c9 }
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x01ce, all -> 0x01cc }
            throw r0     // Catch:{ IOException -> 0x01ce, all -> 0x01cc }
        L_0x01cc:
            r0 = move-exception
            throw r0
        L_0x01ce:
            r2 = r3
        L_0x01cf:
            X.6TY r0 = X.AnonymousClass6TY.A0A     // Catch:{ all -> 0x01d5 }
            r0.A03()     // Catch:{ all -> 0x01d5 }
            goto L_0x0239
        L_0x01d5:
            r0 = move-exception
            if (r2 == 0) goto L_0x01db
            r2.close()
        L_0x01db:
            throw r0
        L_0x01dc:
            java.util.concurrent.atomic.AtomicLong r0 = r7.A01
            r0.incrementAndGet()
            r1 = 0
            long r2 = java.lang.System.nanoTime()
            java.io.InputStream r1 = r11.openStream()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01eb }
            goto L_0x01ef
        L_0x01eb:
            java.io.InputStream r1 = r11.openStream()     // Catch:{ IOException -> 0x0259, all -> 0x026c }
        L_0x01ef:
            r0 = 1
            X.5sA r5 = X.C139316ja.A00(r1, r0)     // Catch:{ IOException -> 0x0259 }
            if (r1 == 0) goto L_0x01f9
            r1.close()     // Catch:{ IOException -> 0x01f9 }
        L_0x01f9:
            if (r5 == 0) goto L_0x0263
            java.util.concurrent.atomic.AtomicLong r4 = r7.A01
            int r0 = r5.A00
            long r0 = (long) r0
            r4.getAndAdd(r0)
            X.6TY r4 = X.AnonymousClass6TY.A0L
            int r0 = r5.A00
            long r0 = (long) r0
            r4.A05(r0)
            X.6TY r0 = X.AnonymousClass6TY.A0M
            X.AnonymousClass6TY.A02(r0, r2)
            int r1 = r5.A00
            if (r1 == 0) goto L_0x0263
            byte[] r0 = r5.A02
            X.6VI r2 = X.AnonymousClass6VI.A00(r0, r1)
            if (r2 == 0) goto L_0x0255
            X.71y r0 = X.C97824qK.A05
            if (r0 != 0) goto L_0x0223
            X.C139316ja.A01(r5)
        L_0x0223:
            r5.A01 = r6
        L_0x0225:
            java.util.concurrent.BlockingQueue r1 = X.C97824qK.A03
            boolean r0 = r1.offer(r5)
            if (r0 != 0) goto L_0x0254
            java.lang.Object r0 = r1.poll()
            X.5sA r0 = (X.C120845sA) r0
            if (r0 == 0) goto L_0x0225
            X.C139316ja.A01(r0)
            goto L_0x0225
        L_0x0239:
            if (r2 == 0) goto L_0x01dc
        L_0x023b:
            r2.close()
            if (r3 == 0) goto L_0x01dc
            int r1 = r3.A00
            if (r1 == 0) goto L_0x01dc
            byte[] r0 = r3.A02
            X.6VI r2 = X.AnonymousClass6VI.A00(r0, r1)
            X.C139316ja.A01(r3)
            if (r2 == 0) goto L_0x01dc
            java.util.concurrent.atomic.AtomicLong r0 = r7.A00
            r0.incrementAndGet()
        L_0x0254:
            return r2
        L_0x0255:
            X.C139316ja.A01(r5)
            return r2
        L_0x0259:
            X.6TY r0 = X.AnonymousClass6TY.A0K     // Catch:{ all -> 0x0265 }
            r0.A03()     // Catch:{ all -> 0x0265 }
            if (r1 == 0) goto L_0x0263
            r1.close()     // Catch:{ IOException -> 0x0263 }
        L_0x0263:
            r2 = 0
            return r2
        L_0x0265:
            r0 = move-exception
            if (r1 == 0) goto L_0x026d
            r1.close()     // Catch:{ IOException -> 0x026d }
            throw r0
        L_0x026c:
            r0 = move-exception
        L_0x026d:
            throw r0
        L_0x026e:
            r2 = move-exception
            java.lang.String r1 = "MapTileProvider"
            java.lang.String r0 = "Broken URL provided"
            android.util.Log.e(r1, r0, r2)
            X.6VI r2 = X.C161127mE.A00
            return r2
        L_0x0279:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "y cannot exceed "
            r1.append(r0)
            r1.append(r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r2, r1, r8)
            throw r0
        L_0x028a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "x cannot exceed "
            r1.append(r0)
            r1.append(r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r2, r1, r8)
            throw r0
        L_0x029b:
            java.lang.String r0 = "y cannot deceed 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x02a2:
            java.lang.String r0 = "x cannot deceed 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97644q2.A07(int, int, int):X.6VI");
    }

    public C97644q2(C139266jV r2, AnonymousClass6TZ r3, C114645ha r4) {
        super(r2, r3);
        this.A04 = true;
        this.A00 = r4.A00;
    }
}
