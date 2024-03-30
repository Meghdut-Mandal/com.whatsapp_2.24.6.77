package X;

import java.util.Objects;

/* renamed from: X.0zx  reason: invalid class name and case insensitive filesystem */
public class C21880zx implements Runnable {
    public final C19970wo A00;
    public final C21540zP A01;
    public final C21580zT A02;
    public final C21470zI A03;
    public final C21600zV A04;
    public final C21430zE A05;
    public final C19770wU A06;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c4, code lost:
        if (r1.A03() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c6, code lost:
        r2 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01cc, code lost:
        if (r2.BJs() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ce, code lost:
        r8.A03.Bvx(r2.B8X());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e0, code lost:
        if (r4 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r4.BpM(r3, r0, 50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        if (r5.length < r10) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r9 = new java.io.File(r12, r15);
        r5 = new java.io.PrintWriter(new java.io.FileWriter(r9, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r11 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r10 = new org.json.JSONObject();
        java.util.Objects.requireNonNull("2.24.6.77");
        r10.put("app_version", "2.24.6.77");
        r10.put("app_build_number", 581200649);
        r0 = r10.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0142, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r11.A04.BNs(-1, r0.getMessage());
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0154, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0155, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r6.A03.B6p(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015f, code lost:
        if (r5 != null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r5.flush();
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0167, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0185, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0187, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0188, code lost:
        if (r5 != null) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r5.flush();
        r5.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0161 A[SYNTHETIC, Splitter:B:74:0x0161] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0173 A[Catch:{ Exception -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a3 A[SYNTHETIC, Splitter:B:98:0x01a3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r2 = 0
        L_0x0001:
            r8 = r22
            X.0zP r1 = r8.A01
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x01c0
            X.0zE r7 = r8.A05
            boolean r0 = r7.BJs()
            if (r0 == 0) goto L_0x01c0
            int r21 = r2 + 1
            r0 = 20
            if (r2 >= r0) goto L_0x01c0
            java.lang.Integer r10 = r7.BlM()
            if (r10 == 0) goto L_0x005e
            X.0zV r0 = r8.A04
            java.util.concurrent.ConcurrentHashMap r9 = r0.A05
            java.lang.Object r0 = r9.get(r10)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r3 = 0
            if (r0 == 0) goto L_0x0033
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x0033
            r3 = 1
        L_0x0033:
            r1 = 50
            if (r3 == 0) goto L_0x005f
            java.lang.Long r0 = r7.BlL()
            if (r0 == 0) goto L_0x005e
            long r5 = android.os.SystemClock.elapsedRealtimeNanos()
            long r3 = r0.longValue()
            long r5 = r5 - r3
            r3 = 200000000(0xbebc200, double:9.8813129E-316)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            X.0wU r4 = r8.A06
            java.util.Objects.requireNonNull(r7)
            r0 = 25
            X.1jA r3 = new X.1jA
            r3.<init>((java.lang.Object) r7, (int) r0)
            java.lang.String r0 = "QplFSWriter/write-closed-markers"
        L_0x005b:
            r4.BpM(r3, r0, r1)
        L_0x005e:
            return
        L_0x005f:
            r9.remove(r10)
            X.0zT r6 = r8.A02
            java.util.concurrent.Semaphore r3 = r6.A04
            boolean r0 = r3.tryAcquire()
            if (r0 == 0) goto L_0x01b0
            java.lang.String r8 = r7.Bli()     // Catch:{ all -> 0x01e9 }
            if (r8 != 0) goto L_0x0074
            goto L_0x01d8
        L_0x0074:
            java.lang.String r2 = "2.24.6.77"
            r20 = 0
            r4 = 0
            X.0wG r0 = r6.A00     // Catch:{ Exception -> 0x0197 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0197 }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "qpl"
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x0197 }
            r12.<init>(r1, r0)     // Catch:{ Exception -> 0x0197 }
            r12.mkdirs()     // Catch:{ Exception -> 0x0197 }
            X.0zP r0 = r6.A01     // Catch:{ Exception -> 0x0197 }
            X.0yC r5 = r0.A00     // Catch:{ Exception -> 0x0197 }
            r0 = 213(0xd5, float:2.98E-43)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ Exception -> 0x0197 }
            int r11 = X.C20800yB.A00(r1, r5, r0)     // Catch:{ Exception -> 0x0197 }
            r0 = 214(0xd6, float:3.0E-43)
            int r10 = X.C20800yB.A00(r1, r5, r0)     // Catch:{ Exception -> 0x0197 }
            java.io.File[] r5 = r12.listFiles()     // Catch:{ Exception -> 0x0197 }
            r7 = 1
            if (r5 == 0) goto L_0x00a9
            int r0 = r5.length     // Catch:{ Exception -> 0x0197 }
            r19 = 0
            if (r0 >= r10) goto L_0x00ab
        L_0x00a9:
            r19 = 1
        L_0x00ab:
            java.io.File r9 = r6.A06     // Catch:{ Exception -> 0x0197 }
            r17 = 1024(0x400, double:5.06E-321)
            if (r9 == 0) goto L_0x00ce
            boolean r0 = r9.exists()     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x00ce
            long r14 = r9.length()     // Catch:{ Exception -> 0x0197 }
            long r14 = r14 / r17
            long r0 = (long) r11     // Catch:{ Exception -> 0x0197 }
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x00ce
        L_0x00c2:
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x0197 }
            r0.<init>(r9, r7)     // Catch:{ Exception -> 0x0197 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0197 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0197 }
            goto L_0x0175
        L_0x00ce:
            r6.A06 = r4     // Catch:{ Exception -> 0x0197 }
            r14 = 0
        L_0x00d1:
            if (r14 >= r10) goto L_0x0191
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0197 }
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0197 }
            r1[r20] = r2     // Catch:{ Exception -> 0x0197 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0197 }
            r1[r7] = r0     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "qpl_%s_%d.txt"
            java.lang.String r15 = java.lang.String.format(r9, r0, r1)     // Catch:{ Exception -> 0x0197 }
            if (r5 == 0) goto L_0x010c
            int r13 = r5.length     // Catch:{ Exception -> 0x0197 }
            r1 = 0
        L_0x00ea:
            if (r1 >= r13) goto L_0x010c
            r9 = r5[r1]     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = r9.getName()     // Catch:{ Exception -> 0x0197 }
            boolean r0 = r0.equals(r15)     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0106
            long r15 = r9.length()     // Catch:{ Exception -> 0x0197 }
            long r15 = r15 / r17
            long r0 = (long) r11     // Catch:{ Exception -> 0x0197 }
            int r13 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0109
            r6.A06 = r9     // Catch:{ Exception -> 0x0197 }
            goto L_0x00c2
        L_0x0106:
            int r1 = r1 + 1
            goto L_0x00ea
        L_0x0109:
            int r14 = r14 + 1
            goto L_0x00d1
        L_0x010c:
            if (r19 == 0) goto L_0x010f
            goto L_0x0117
        L_0x010f:
            X.0zI r0 = r6.A03     // Catch:{ Exception -> 0x0197 }
            r0.BPT()     // Catch:{ Exception -> 0x0197 }
            r6.A06 = r4     // Catch:{ Exception -> 0x0197 }
            goto L_0x00d1
        L_0x0117:
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0154, all -> 0x0185 }
            r9.<init>(r12, r15)     // Catch:{ Exception -> 0x0154, all -> 0x0185 }
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ Exception -> 0x0154, all -> 0x0185 }
            r0.<init>(r9, r7)     // Catch:{ Exception -> 0x0154, all -> 0x0185 }
            java.io.PrintWriter r5 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0154, all -> 0x0185 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0154, all -> 0x0185 }
            X.0zL r11 = r6.A02     // Catch:{ Exception -> 0x0152 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0142 }
            r10.<init>()     // Catch:{ Exception -> 0x0142 }
            java.lang.String r0 = "app_version"
            java.util.Objects.requireNonNull(r2)     // Catch:{ Exception -> 0x0142 }
            r10.put(r0, r2)     // Catch:{ Exception -> 0x0142 }
            java.lang.String r2 = "app_build_number"
            r0 = 581200649(0x22a46b09, double:2.87151274E-315)
            r10.put(r2, r0)     // Catch:{ Exception -> 0x0142 }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x0142 }
            goto L_0x014e
        L_0x0142:
            r0 = move-exception
            X.0zI r2 = r11.A04     // Catch:{ Exception -> 0x0152 }
            r1 = -1
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0152 }
            r2.BNs(r1, r0)     // Catch:{ Exception -> 0x0152 }
            r0 = 0
        L_0x014e:
            r5.println(r0)     // Catch:{ Exception -> 0x0152 }
            goto L_0x0169
        L_0x0152:
            r0 = move-exception
            goto L_0x0156
        L_0x0154:
            r0 = move-exception
            r5 = r4
        L_0x0156:
            X.0zI r1 = r6.A03     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0187 }
            r1.B6p(r0)     // Catch:{ all -> 0x0187 }
            if (r5 == 0) goto L_0x0167
            r5.flush()     // Catch:{ Exception -> 0x0197 }
            r5.close()     // Catch:{ Exception -> 0x0197 }
        L_0x0167:
            r9 = r4
            goto L_0x016f
        L_0x0169:
            r5.flush()     // Catch:{ Exception -> 0x0197 }
            r5.close()     // Catch:{ Exception -> 0x0197 }
        L_0x016f:
            r6.A06 = r9     // Catch:{ Exception -> 0x0197 }
            if (r9 == 0) goto L_0x01a9
            goto L_0x00c2
        L_0x0175:
            r1.println()     // Catch:{ Exception -> 0x0182, all -> 0x01dc }
            r1.println(r8)     // Catch:{ Exception -> 0x0182, all -> 0x01dc }
            r1.flush()     // Catch:{ all -> 0x01e9 }
            r1.close()     // Catch:{ all -> 0x01e9 }
            goto L_0x01a9
        L_0x0182:
            r0 = move-exception
            r4 = r1
            goto L_0x0198
        L_0x0185:
            r0 = move-exception
            goto L_0x0190
        L_0x0187:
            r0 = move-exception
            if (r5 == 0) goto L_0x0190
            r5.flush()     // Catch:{ Exception -> 0x0197 }
            r5.close()     // Catch:{ Exception -> 0x0197 }
        L_0x0190:
            throw r0     // Catch:{ Exception -> 0x0197 }
        L_0x0191:
            X.0zI r0 = r6.A03     // Catch:{ Exception -> 0x0197 }
            r0.BPT()     // Catch:{ Exception -> 0x0197 }
            goto L_0x01a9
        L_0x0197:
            r0 = move-exception
        L_0x0198:
            X.0zI r1 = r6.A03     // Catch:{ all -> 0x01df }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01df }
            r1.B6p(r0)     // Catch:{ all -> 0x01df }
            if (r4 == 0) goto L_0x01a9
            r4.flush()     // Catch:{ all -> 0x01e9 }
            r4.close()     // Catch:{ all -> 0x01e9 }
        L_0x01a9:
            r3.release()
            r2 = r21
            goto L_0x0001
        L_0x01b0:
            X.0wU r4 = r8.A06
            java.util.Objects.requireNonNull(r7)
            r0 = 25
            X.1jA r3 = new X.1jA
            r3.<init>((java.lang.Object) r7, (int) r0)
            java.lang.String r0 = "QplFSWriter/write-closed-markers-2"
            goto L_0x005b
        L_0x01c0:
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x005e
            X.0zE r2 = r8.A05
            boolean r0 = r2.BJs()
            if (r0 == 0) goto L_0x005e
            X.0zI r1 = r8.A03
            java.util.Collection r0 = r2.B8X()
            r1.Bvx(r0)
            return
        L_0x01d8:
            r3.release()
            return
        L_0x01dc:
            r0 = move-exception
            r4 = r1
            goto L_0x01e2
        L_0x01df:
            r0 = move-exception
            if (r4 == 0) goto L_0x01e8
        L_0x01e2:
            r4.flush()     // Catch:{ all -> 0x01e9 }
            r4.close()     // Catch:{ all -> 0x01e9 }
        L_0x01e8:
            throw r0     // Catch:{ all -> 0x01e9 }
        L_0x01e9:
            r0 = move-exception
            r3.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21880zx.run():void");
    }

    public C21880zx(C19970wo r2, C21540zP r3, C21580zT r4, C21470zI r5, C21600zV r6, C21430zE r7, C19770wU r8) {
        this.A00 = r2;
        this.A06 = r8;
        this.A05 = r7;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        Objects.requireNonNull("2.24.6.77");
    }
}
