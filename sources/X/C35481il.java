package X;

/* renamed from: X.1il  reason: invalid class name and case insensitive filesystem */
public class C35481il implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public C35481il(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010d, code lost:
        if (((java.lang.System.currentTimeMillis() - r6.A00) / 1000) < ((long) X.C20800yB.A00(X.C21000yV.A02, r6.A0F, 2640))) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0204, code lost:
        if (r11 != null) goto L_0x016e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r7 = r17
            int r0 = r7.A02
            switch(r0) {
                case 1: goto L_0x004c;
                case 2: goto L_0x005d;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00d7;
                case 5: goto L_0x03bc;
                case 6: goto L_0x03c8;
                case 7: goto L_0x03db;
                case 8: goto L_0x03f9;
                case 9: goto L_0x0007;
                case 10: goto L_0x0007;
                case 11: goto L_0x04c2;
                case 12: goto L_0x054e;
                case 13: goto L_0x0558;
                case 14: goto L_0x0564;
                case 15: goto L_0x0587;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r7.A00
            X.1aa r5 = (X.C30671aa) r5
            java.lang.String r6 = r7.A01
            monitor-enter(r5)
            java.util.Map r1 = r5.A02     // Catch:{ all -> 0x0049 }
            java.lang.Object r4 = r1.get(r6)     // Catch:{ all -> 0x0049 }
            X.3Dm r4 = (X.C61803Dm) r4     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0599
            int r0 = r4.A00     // Catch:{ all -> 0x0049 }
            if (r0 <= 0) goto L_0x0044
            java.lang.String r3 = r4.A01     // Catch:{ all -> 0x0049 }
            r4.A00()     // Catch:{ all -> 0x0049 }
            X.0wN r2 = r5.A00     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r4.A00()     // Catch:{ all -> 0x0049 }
            r1 = 0
            r2.A0E(r3, r0, r1)     // Catch:{ all -> 0x0049 }
            java.util.List r0 = r4.A02     // Catch:{ all -> 0x0049 }
            r0.clear()     // Catch:{ all -> 0x0049 }
            r4.A00 = r1     // Catch:{ all -> 0x0049 }
            X.0wI r4 = r5.A01     // Catch:{ all -> 0x0049 }
            r0 = 9
            X.1il r3 = new X.1il     // Catch:{ all -> 0x0049 }
            r3.<init>(r0, r6, r5)     // Catch:{ all -> 0x0049 }
            r1 = 30000(0x7530, double:1.4822E-319)
            android.os.Handler r0 = r4.A00     // Catch:{ all -> 0x0049 }
            r0.postDelayed(r3, r1)     // Catch:{ all -> 0x0049 }
            goto L_0x0599
        L_0x0044:
            r1.remove(r6)     // Catch:{ all -> 0x0049 }
            goto L_0x0599
        L_0x0049:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x004c:
            java.lang.Object r3 = r7.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            java.lang.String r2 = r7.A01
            r1 = 2000(0x7d0, float:2.803E-42)
            r0 = 0
            X.3ZU r0 = r3.A3u(r2, r1, r0)
            r0.A02()
            return
        L_0x005d:
            java.lang.Object r6 = r7.A00
            X.1R8 r6 = (X.AnonymousClass1R8) r6
            java.lang.String r4 = r7.A01
            com.google.android.material.button.MaterialButton r5 = r6.A06
            if (r5 == 0) goto L_0x059a
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x059a
            android.view.ViewParent r3 = r5.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.07n r2 = new X.07n
            r2.<init>()
            r2.A08(r5)
            r0 = 300(0x12c, double:1.48E-321)
            r2.A06(r0)
            X.C018607y.A02(r3, r2)
            r5.setText(r4)
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r4 = r0.getResources()
            X.0ts r0 = r6.A07
            X.1Kv r0 = X.C18820ts.A00(r0)
            boolean r0 = r0.A06
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00bb
            int r3 = r5.getPaddingLeft()
            int r2 = r5.getPaddingTop()
            r0 = 2131168378(0x7f070c7a, float:1.7951056E38)
            int r1 = r4.getDimensionPixelSize(r0)
        L_0x00a9:
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r3, r2, r1, r0)
            r0 = 2131168377(0x7f070c79, float:1.7951054E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r5.setIconPadding(r0)
            return
        L_0x00bb:
            r0 = 2131168378(0x7f070c7a, float:1.7951056E38)
            int r3 = r4.getDimensionPixelSize(r0)
            int r2 = r5.getPaddingTop()
            int r1 = r5.getPaddingRight()
            goto L_0x00a9
        L_0x00cb:
            java.lang.Object r6 = r7.A00
            X.18Z r6 = (X.AnonymousClass18Z) r6
            java.lang.String r7 = r7.A01
            r0 = 0
            r6.A0A = r0
            java.lang.String r8 = "foreground"
            goto L_0x00df
        L_0x00d7:
            java.lang.Object r6 = r7.A00
            X.18Z r6 = (X.AnonymousClass18Z) r6
            java.lang.String r7 = r7.A01
            java.lang.String r8 = "background"
        L_0x00df:
            java.lang.String r0 = "background"
            boolean r0 = r8.equals(r0)
            r16 = r0 ^ 1
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x010f
            java.lang.Integer r5 = r6.A06
            X.9MG r0 = r6.A02
            X.C18740tg.A06(r0)
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0145
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r6.A00
            long r3 = r3 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            X.0yC r2 = r6.A0F
            r1 = 2640(0xa50, float:3.7E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0145
        L_0x010f:
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x059a
            X.0v0 r9 = r6.A0D
            X.005 r0 = r9.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r5 = "network_statistics_last_report_time"
            r0 = -1
            long r10 = r2.getLong(r5, r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r14 = r1 - r10
            r3 = 157680000000(0x24b675dc00, double:7.79042710362E-313)
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0139
            long r14 = android.os.SystemClock.uptimeMillis()
            long r14 = r14 - r10
        L_0x0139:
            X.0yH r4 = r6.A0H
            X.14L r3 = r4.A00
            if (r3 == 0) goto L_0x02bd
            X.C18740tg.A06(r3)
            monitor-enter(r3)
            goto L_0x02ab
        L_0x0145:
            X.9MG r3 = r6.A02
            boolean r2 = r3.A02
            X.0zn r1 = r3.A04
            X.103 r0 = r3.A00
            boolean r0 = r1.A02(r0)
            r2 = r2 & r0
            r3.A02 = r2
            if (r2 != 0) goto L_0x0208
            r9 = 0
        L_0x0157:
            X.83P r9 = (X.AnonymousClass83P) r9
            if (r9 == 0) goto L_0x010f
            java.lang.Class<X.83M> r0 = X.AnonymousClass83M.class
            X.103 r4 = r9.A03(r0)
            X.83M r4 = (X.AnonymousClass83M) r4
            java.lang.Class<X.83O> r0 = X.AnonymousClass83O.class
            X.103 r3 = r9.A03(r0)
            X.83O r3 = (X.AnonymousClass83O) r3
            if (r5 == 0) goto L_0x01f1
            r11 = r5
        L_0x016e:
            X.2SP r2 = new X.2SP
            r2.<init>()
            r2.A09 = r8
            long r0 = r4.realtimeMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
            long r0 = r4.uptimeMs
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            double r0 = r3.systemTimeS
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A00 = r0
            double r0 = r3.userTimeS
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A01 = r0
            java.lang.Class<X.83N> r0 = X.AnonymousClass83N.class
            X.103 r8 = r9.A03(r0)
            X.83N r8 = (X.AnonymousClass83N) r8
            long r0 = r8.mobileBytesRx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
            long r0 = r8.mobileBytesTx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A03 = r0
            long r0 = r8.wifiBytesRx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            long r0 = r8.wifiBytesTx
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            r2.A0A = r7
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A07
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            X.0yW r10 = r6.A0G
            int r0 = r11.intValue()
            r10.Blz(r2, r0)
        L_0x01d4:
            double r7 = r3.systemTimeS
            double r0 = r3.userTimeS
            double r7 = r7 + r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r7 = r7 * r0
            long r2 = r4.realtimeMs
            double r0 = (double) r2
            double r7 = r7 / r0
            r0 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            double r7 = r7 * r0
            X.0yf r0 = r6.A0C
            X.0yk r1 = X.C21100yf.A10
            java.lang.Class<X.0yf> r3 = X.C21100yf.class
            monitor-enter(r3)
            goto L_0x021b
        L_0x01f1:
            X.2SP r2 = r6.A03
            if (r2 != 0) goto L_0x01fc
            X.2SP r2 = new X.2SP
            r2.<init>()
            r6.A03 = r2
        L_0x01fc:
            X.0yW r10 = r6.A0G
            r1 = 0
            r0 = 0
            java.lang.Integer r11 = r10.B3I(r2, r1, r0)
            if (r11 == 0) goto L_0x01d4
            goto L_0x016e
        L_0x0208:
            X.103 r1 = r3.A00
            X.103 r0 = r3.A01
            X.103 r9 = r3.A03
            r1.A02(r0, r9)
            X.103 r1 = r3.A01
            X.103 r0 = r3.A00
            r3.A01 = r0
            r3.A00 = r1
            goto L_0x0157
        L_0x021b:
            android.content.SharedPreferences r2 = r0.A00     // Catch:{ all -> 0x03b9 }
            java.lang.Boolean r0 = X.C18750th.A03     // Catch:{ all -> 0x03b9 }
            java.lang.String r1 = r1.A00     // Catch:{ all -> 0x03b9 }
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r0 = r2.getFloat(r1, r0)     // Catch:{ all -> 0x03b9 }
            monitor-exit(r3)     // Catch:{ all -> 0x03b9 }
            double r0 = (double) r0     // Catch:{ all -> 0x03b9 }
            r2 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x023a
            X.0wN r3 = r6.A0B
            java.lang.String r1 = java.lang.Double.toString(r7)
            java.lang.String r0 = "CriticalBatteryUsageEvent"
            r3.A0E(r0, r1, r2)
        L_0x023a:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A07
            r0.set(r2)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r4.realtimeMs
            long r11 = r3.toSeconds(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            X.0wU r0 = r6.A0J
            boolean r0 = r0 instanceof X.C19780wV
            if (r0 == 0) goto L_0x010f
            if (r5 != 0) goto L_0x025d
            X.2Qc r1 = r6.A04
            X.C18740tg.A06(r1)
            r0 = 0
            java.lang.Integer r5 = r10.B3I(r1, r0, r2)
        L_0x025d:
            X.0wY r0 = X.C19780wV.A06
            X.0wZ r7 = r0.A00
            java.util.concurrent.atomic.AtomicLong r0 = r7.A03
            r3 = 0
            long r0 = r0.getAndSet(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.concurrent.atomic.AtomicLong r0 = r7.A04
            long r0 = r0.getAndSet(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r7 = android.util.Pair.create(r2, r0)
            X.16J r0 = r6.A0E
            long r1 = r0.A00
            r0.A00 = r3
            if (r5 == 0) goto L_0x010f
            X.2Qc r3 = new X.2Qc
            r3.<init>()
            r3.A00 = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r3.A04 = r0
            java.lang.Object r0 = r7.first
            java.lang.Long r0 = (java.lang.Long) r0
            r3.A02 = r0
            java.lang.Object r0 = r7.second
            java.lang.Long r0 = (java.lang.Long) r0
            r3.A03 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A01 = r0
            int r0 = r5.intValue()
            r10.Blz(r3, r0)
            goto L_0x010f
        L_0x02ab:
            X.AnonymousClass14L.A00(r3)     // Catch:{ all -> 0x02dc }
            java.util.HashMap r0 = X.C64133Mt.A00     // Catch:{ all -> 0x02dc }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x02dc }
            r8.<init>(r0)     // Catch:{ all -> 0x02dc }
            r0.clear()     // Catch:{ all -> 0x02dc }
            monitor-exit(r3)
            X.C20860yH.A00(r4)
            goto L_0x02c2
        L_0x02bd:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        L_0x02c2:
            X.14L r3 = r4.A00
            if (r3 == 0) goto L_0x02df
            X.C18740tg.A06(r3)
            monitor-enter(r3)
            X.AnonymousClass14L.A00(r3)     // Catch:{ all -> 0x02dc }
            java.util.HashMap r0 = X.C64133Mt.A01     // Catch:{ all -> 0x02dc }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x02dc }
            r7.<init>(r0)     // Catch:{ all -> 0x02dc }
            r0.clear()     // Catch:{ all -> 0x02dc }
            monitor-exit(r3)
            X.C20860yH.A00(r4)
            goto L_0x02e4
        L_0x02dc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x02df:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
        L_0x02e4:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r9)
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r1)
            r0.apply()
            r1 = -1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x059a
            r1 = 0
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x059a
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0307
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x059a
        L_0x0307:
            X.2Qe r2 = r6.A05
            if (r2 != 0) goto L_0x0312
            X.2Qe r2 = new X.2Qe
            r2.<init>()
            r6.A05 = r2
        L_0x0312:
            X.0yW r6 = r6.A0G
            r1 = 0
            r0 = 0
            java.lang.Integer r13 = r6.B3I(r2, r1, r0)
            if (r13 == 0) goto L_0x059a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r0 = r8.keySet()
            r1.addAll(r0)
            java.util.Set r0 = r7.keySet()
            r1.addAll(r0)
            java.util.Iterator r12 = r1.iterator()
        L_0x0333:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x059a
            java.lang.Object r5 = r12.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            boolean r0 = r8.containsKey(r5)
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r9 = 0
            if (r0 == 0) goto L_0x03b7
            java.lang.Object r0 = r8.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x03b7
            long r2 = r0.longValue()
            double r0 = (double) r2
            double r0 = r0 / r10
            double r2 = java.lang.Math.ceil(r0)
            long r0 = (long) r2
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L_0x0362:
            boolean r0 = r7.containsKey(r5)
            if (r0 == 0) goto L_0x037f
            java.lang.Object r0 = r7.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x037f
            long r2 = r0.longValue()
            double r0 = (double) r2
            double r0 = r0 / r10
            double r2 = java.lang.Math.ceil(r0)
            long r0 = (long) r2
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x037f:
            if (r4 == 0) goto L_0x03aa
            long r10 = r4.longValue()
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03aa
        L_0x038b:
            X.2Qe r1 = new X.2Qe
            r1.<init>()
            r1.A00 = r5
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r1.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A01 = r0
            r1.A02 = r4
            r1.A03 = r9
            int r0 = r13.intValue()
            r6.Blz(r1, r0)
            goto L_0x0333
        L_0x03aa:
            if (r9 == 0) goto L_0x0333
            long r10 = r9.longValue()
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0333
            goto L_0x038b
        L_0x03b7:
            r4 = r9
            goto L_0x0362
        L_0x03b9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03b9 }
            throw r0
        L_0x03bc:
            java.lang.Object r0 = r7.A00
            X.1cL r0 = (X.C31761cL) r0
            java.lang.String r1 = r7.A01
            X.1cM r0 = r0.A0A
            r0.A00(r1)
            return
        L_0x03c8:
            java.lang.Object r2 = r7.A00
            X.1PZ r2 = (X.AnonymousClass1PZ) r2
            java.lang.String r1 = r7.A01
            if (r1 != 0) goto L_0x03d4
            r0 = 0
        L_0x03d1:
            r2.A00 = r0
            return
        L_0x03d4:
            X.1PY r0 = r2.A02
            java.lang.String r0 = r0.A00(r1)
            goto L_0x03d1
        L_0x03db:
            java.lang.Object r0 = r7.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.String r2 = r7.A01
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x03e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x059a
            java.lang.Object r0 = r1.next()
            X.3LD r0 = (X.AnonymousClass3LD) r0
            r0.A05(r2)
            goto L_0x03e9
        L_0x03f9:
            java.lang.Object r4 = r7.A00
            X.0zv r4 = (X.C21860zv) r4
            java.lang.String r1 = r7.A01
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x059a
            byte[] r3 = r1.getBytes()
            int r5 = r3.length
            r0 = 100
            r10 = 1
            r1 = 0
            if (r5 >= r0) goto L_0x040f
            r1 = 1
        L_0x040f:
            java.lang.String r0 = "Log entry too large"
            X.C18740tg.A0D(r1, r0)
            int r1 = r5 + 1
            java.nio.MappedByteBuffer r0 = r4.A01
            int r0 = r0.position()
            int r1 = r1 + r0
            long r6 = (long) r1
            r1 = 1024(0x400, double:5.06E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0484
            java.nio.MappedByteBuffer r0 = r4.A01
            int r6 = X.C21860zv.A07
            r0.position(r6)
            java.nio.MappedByteBuffer r0 = r4.A01
            byte[] r1 = X.C21860zv.A08
            r0.put(r1)
            X.106 r0 = r4.A00
            int r0 = r0.byteSize
            int r8 = r6 + r0
            java.nio.MappedByteBuffer r0 = r4.A01
            r0.position(r8)
            java.nio.MappedByteBuffer r0 = r4.A01
            r0.put(r1)
            X.106 r0 = r4.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x0448:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0478
            java.lang.Object r7 = r9.next()
            byte[] r7 = (byte[]) r7
            java.nio.MappedByteBuffer r1 = r4.A01
            int r0 = r8 + -1
            r1.position(r0)
            java.nio.MappedByteBuffer r1 = r4.A01
            r0 = 10
            r1.put(r0)
            java.nio.MappedByteBuffer r2 = r4.A01
            int r0 = r2.position()
            int r0 = r0 + -1
            int r1 = r7.length
            int r0 = r0 - r1
            r2.position(r0)
            java.nio.MappedByteBuffer r0 = r4.A01
            r0.put(r7)
            int r0 = r1 + 1
            int r8 = r8 - r0
            goto L_0x0448
        L_0x0478:
            java.nio.MappedByteBuffer r1 = r4.A01
            X.106 r0 = r4.A00
            int r0 = r0.byteSize
            int r6 = r6 + r0
            int r0 = r6 + 2
            r1.position(r0)
        L_0x0484:
            java.nio.MappedByteBuffer r1 = r4.A01
            int r0 = r1.position()
            r2 = 2
            int r0 = r0 - r2
            int r0 = r0 + r5
            r1.position(r0)
            java.nio.MappedByteBuffer r1 = r4.A01
            r0 = 10
            r1.put(r0)
            java.nio.MappedByteBuffer r1 = r4.A01
            byte[] r0 = X.C21860zv.A08
            r1.put(r0)
            java.nio.MappedByteBuffer r1 = r4.A01
            int r0 = r1.position()
            int r0 = r0 - r2
            int r0 = r0 - r10
            int r0 = r0 - r5
            r1.position(r0)
            java.nio.MappedByteBuffer r0 = r4.A01
            r0.put(r3)
            java.nio.MappedByteBuffer r1 = r4.A01
            int r0 = r1.position()
            int r0 = r0 + 1
            int r0 = r0 + 2
            r1.position(r0)
            X.106 r0 = r4.A00
            r0.add(r3)
            return
        L_0x04c2:
            java.lang.Object r4 = r7.A00
            X.1Wx r4 = (X.C29511Wx) r4
            java.lang.String r3 = r7.A01
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0543 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0543 }
            java.lang.String r1 = r2.getHost()     // Catch:{ IOException -> 0x0543 }
            java.lang.String r0 = ".whatsapp.net"
            boolean r0 = r1.endsWith(r0)     // Catch:{ IOException -> 0x0543 }
            if (r0 == 0) goto L_0x052e
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0543 }
            boolean r0 = r2 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0543 }
            if (r0 == 0) goto L_0x0519
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0543 }
            r1.<init>()     // Catch:{ IOException -> 0x0543 }
            java.lang.String r0 = "sonar connection success; url="
            r1.append(r0)     // Catch:{ IOException -> 0x0543 }
            r1.append(r3)     // Catch:{ IOException -> 0x0543 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0543 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0543 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException -> 0x0543 }
            X.0yd r0 = r4.A00
            X.8qR r0 = r0.A02()
            r2.setSSLSocketFactory(r0)
            int r2 = r2.getResponseCode()     // Catch:{ IOException -> 0x0547 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0547 }
            r1.<init>()     // Catch:{ IOException -> 0x0547 }
            java.lang.String r0 = "sonar response code: "
            r1.append(r0)     // Catch:{ IOException -> 0x0547 }
            r1.append(r2)     // Catch:{ IOException -> 0x0547 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0547 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0547 }
            return
        L_0x0519:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0543 }
            r1.<init>()     // Catch:{ IOException -> 0x0543 }
            java.lang.String r0 = "sonar pingback failed to open https url connection; url="
            r1.append(r0)     // Catch:{ IOException -> 0x0543 }
            r1.append(r3)     // Catch:{ IOException -> 0x0543 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0543 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0543 }
            return
        L_0x052e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0543 }
            r1.<init>()     // Catch:{ IOException -> 0x0543 }
            java.lang.String r0 = "sonar pingback url did not end with *.whatsapp.net actual; url="
            r1.append(r0)     // Catch:{ IOException -> 0x0543 }
            r1.append(r3)     // Catch:{ IOException -> 0x0543 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0543 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0543 }
            return
        L_0x0543:
            r1 = move-exception
            java.lang.String r0 = "IOException on sonar pingback"
            goto L_0x054a
        L_0x0547:
            r1 = move-exception
            java.lang.String r0 = "sonar IOException"
        L_0x054a:
            com.whatsapp.util.Log.i(r0, r1)
            return
        L_0x054e:
            java.lang.Object r1 = r7.A00
            X.1YM r1 = (X.AnonymousClass1YM) r1
            java.lang.String r0 = r7.A01
            X.AnonymousClass1YM.A01(r1, r0)
            return
        L_0x0558:
            java.lang.Object r0 = r7.A00
            X.1Zu r0 = (X.C30251Zu) r0
            java.lang.String r1 = r7.A01
            X.1Bs r0 = r0.A04
            r0.A00(r1)
            return
        L_0x0564:
            java.lang.Object r2 = r7.A00
            X.1Fv r2 = (X.C25321Fv) r2
            java.lang.String r3 = "fmessage-protobuf-subsystem-deserialize"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SlowMethodWatcher found a thread stuck for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wN r2 = r2.A00
            java.lang.String r1 = "slow-method-watcher"
            r0 = 1
            r2.A0E(r1, r3, r0)
            return
        L_0x0587:
            java.lang.Object r2 = r7.A00
            X.1dR r2 = (X.C32371dR) r2
            java.lang.String r1 = r7.A01
            java.util.LinkedHashMap r0 = r2.A03
            java.lang.Object r0 = r0.remove(r1)
            if (r0 == 0) goto L_0x059a
            X.C32371dR.A01(r2)
            return
        L_0x0599:
            monitor-exit(r5)
        L_0x059a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35481il.run():void");
    }

    public C35481il(C25321Fv r2) {
        this.A02 = 14;
        this.A00 = r2;
        this.A01 = "fmessage-protobuf-subsystem-deserialize";
    }
}
