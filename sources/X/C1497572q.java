package X;

/* renamed from: X.72q  reason: invalid class name and case insensitive filesystem */
public class C1497572q implements Runnable {
    public Object A00;
    public final int A01;

    public C1497572q(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0648, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x064b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0709, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x070a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        X.AnonymousClass88P.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07d5, code lost:
        r1.postFrameCallback(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x07d8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r3 = r16
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0081;
                case 2: goto L_0x0088;
                case 3: goto L_0x0088;
                case 4: goto L_0x0090;
                case 5: goto L_0x009d;
                case 6: goto L_0x070e;
                case 7: goto L_0x00be;
                case 8: goto L_0x00d9;
                case 9: goto L_0x0042;
                case 10: goto L_0x00f4;
                case 11: goto L_0x010b;
                case 12: goto L_0x011c;
                case 13: goto L_0x03f6;
                case 14: goto L_0x03fe;
                case 15: goto L_0x004d;
                case 16: goto L_0x0432;
                case 17: goto L_0x0448;
                case 18: goto L_0x045e;
                case 19: goto L_0x0474;
                case 20: goto L_0x048a;
                case 21: goto L_0x04a0;
                case 22: goto L_0x0581;
                case 23: goto L_0x058b;
                case 24: goto L_0x059d;
                case 25: goto L_0x05f2;
                case 26: goto L_0x0636;
                case 27: goto L_0x0007;
                case 28: goto L_0x0007;
                case 29: goto L_0x064c;
                case 30: goto L_0x0658;
                case 31: goto L_0x066b;
                case 32: goto L_0x06b5;
                case 33: goto L_0x06be;
                case 34: goto L_0x06ce;
                case 35: goto L_0x06dd;
                case 36: goto L_0x06e7;
                case 37: goto L_0x06ef;
                case 38: goto L_0x06fa;
                case 39: goto L_0x0727;
                case 40: goto L_0x0776;
                case 41: goto L_0x0782;
                case 42: goto L_0x078d;
                case 43: goto L_0x07d9;
                case 44: goto L_0x07e3;
                case 45: goto L_0x07eb;
                case 46: goto L_0x0814;
                case 47: goto L_0x0839;
                case 48: goto L_0x0841;
                case 49: goto L_0x084d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r3.A00
            X.63w r5 = (X.C1264163w) r5
            long r6 = java.lang.System.currentTimeMillis()
        L_0x000f:
            java.util.concurrent.ConcurrentLinkedQueue r1 = r5.A03
            java.lang.Object r0 = r1.peek()
            X.4qe r0 = (X.C97984qe) r0
            if (r0 == 0) goto L_0x0838
            long r3 = r0.A01
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0032
            long r2 = r5.A01
            java.lang.Object r0 = r1.poll()
            X.4qe r0 = (X.C97984qe) r0
            if (r0 == 0) goto L_0x0030
            int r0 = r0.A00
        L_0x002b:
            long r0 = (long) r0
            long r2 = r2 - r0
            r5.A01 = r2
            goto L_0x000f
        L_0x0030:
            r0 = 0
            goto L_0x002b
        L_0x0032:
            long r3 = r3 - r6
            java.util.concurrent.ScheduledExecutorService r2 = r5.A04
            r0 = 28
            X.72q r1 = new X.72q
            r1.<init>(r5, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.schedule(r1, r3, r0)
            return
        L_0x0042:
            java.lang.Object r1 = r3.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r0 = "Unhandled camera exception"
            java.lang.RuntimeException r1 = X.C90524aI.A0e(r0, r1)
            throw r1
        L_0x004d:
            java.lang.Object r4 = r3.A00     // Catch:{ all -> 0x006d }
            X.6Kv r4 = (X.C130376Kv) r4     // Catch:{ all -> 0x006d }
            java.util.List r2 = r4.A01     // Catch:{ all -> 0x006d }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x0835
            monitor-enter(r2)     // Catch:{ all -> 0x006d }
            X.897 r1 = new X.897     // Catch:{ all -> 0x006a }
            r1.<init>(r2)     // Catch:{ all -> 0x006a }
            r2.clear()     // Catch:{ all -> 0x006a }
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            X.60H r0 = r4.A00     // Catch:{ all -> 0x006d }
            r0.A00(r1)     // Catch:{ all -> 0x006d }
            goto L_0x0835
        L_0x006a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            java.lang.Object r0 = r3.A00
            X.6Kv r0 = (X.C130376Kv) r0
            X.C130376Kv.A00(r0)
            throw r1
        L_0x0076:
            java.lang.Object r0 = r3.A00
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.unscheduleSelf(r3)
            r0.invalidateSelf()
            return
        L_0x0081:
            java.lang.Object r0 = r3.A00
            X.6lE r0 = (X.C140216lE) r0
            X.88P r0 = r0.A00
            goto L_0x008c
        L_0x0088:
            java.lang.Object r0 = r3.A00
            X.88P r0 = (X.AnonymousClass88P) r0
        L_0x008c:
            X.AnonymousClass88P.A00(r0)
            return
        L_0x0090:
            java.lang.Object r0 = r3.A00
            X.61X r0 = (X.AnonymousClass61X) r0
            X.A0j r2 = r0.A00
            X.9HW r1 = r0.A01
            r0 = 5
            X.C20952A0j.A04(r2, r1, r0)
            return
        L_0x009d:
            java.lang.Object r0 = r3.A00
            X.9n4 r0 = (X.C202989n4) r0
            X.9VB r0 = r0.A0M
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x00aa:
            if (r1 >= r2) goto L_0x0838
            java.lang.Object r0 = r3.get(r1)
            X.5hh r0 = (X.C114715hh) r0
            X.A0j r0 = r0.A00
            X.7ec r0 = r0.A0B
            if (r0 == 0) goto L_0x00bb
            r0.Bej()
        L_0x00bb:
            int r1 = r1 + 1
            goto L_0x00aa
        L_0x00be:
            java.lang.Object r0 = r3.A00
            X.9PG r0 = (X.AnonymousClass9PG) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x00c8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0838
            r2.next()
            java.lang.String r1 = "Camera1Lifecycle"
            java.lang.String r0 = "Camera Lifecycle: onStartPreview"
            android.util.Log.d(r1, r0)
            goto L_0x00c8
        L_0x00d9:
            java.lang.Object r0 = r3.A00
            X.9PG r0 = (X.AnonymousClass9PG) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x00e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0838
            r2.next()
            java.lang.String r1 = "Camera1Lifecycle"
            java.lang.String r0 = "Camera Lifecycle: onStopPreview"
            android.util.Log.d(r1, r0)
            goto L_0x00e3
        L_0x00f4:
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            boolean r0 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ Exception -> 0x0100 }
            if (r0 == 0) goto L_0x0838
            com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeLoggerLoop()     // Catch:{ Exception -> 0x0100 }
            return
        L_0x0100:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "StackFrameThread"
            android.util.Log.e(r0, r1, r2)
            return
        L_0x010b:
            java.lang.Object r1 = r3.A00
            X.757 r1 = (X.AnonymousClass757) r1
            r1.run()
            java.lang.Class<X.6UV> r2 = X.AnonymousClass6UV.class
            monitor-enter(r2)
            java.util.List r0 = X.AnonymousClass6UV.A01     // Catch:{ all -> 0x070b }
            r0.remove(r1)     // Catch:{ all -> 0x070b }
            goto L_0x0709
        L_0x011c:
            java.lang.Object r1 = r3.A00
            X.4rR r1 = (X.C98444rR) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.5uJ r10 = r1.A01
            X.00T r0 = r10.A00
            java.lang.Object r4 = r0.getValue()
            X.6mM r4 = (X.C140906mM) r4
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            X.6EQ r0 = r4.A02
            java.util.HashMap r0 = r0.A00()
            java.util.Iterator r14 = X.C36371kC.A10(r0)
        L_0x013c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01c9
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r14)
            java.lang.String r13 = X.C90494aF.A0f(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x013c
            java.lang.Object r5 = r1.getValue()
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r0 = "size_config"
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            r7 = 0
            if (r0 == 0) goto L_0x01c7
            X.4rX r6 = X.C98504rX.A00(r0)
        L_0x0163:
            java.lang.String r0 = "staleness_config"
            org.json.JSONObject r9 = r5.optJSONObject(r0)
            if (r9 == 0) goto L_0x01c5
            java.lang.String r2 = "stale_age_s"
            r0 = -1
            long r0 = r9.optLong(r2, r0)
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r8 = r7
            if (r2 < 0) goto L_0x0186
            r8 = 0
            java.lang.String r2 = "is_itemized"
            boolean r2 = r9.optBoolean(r2, r8)
            X.4rV r8 = new X.4rV
            r8.<init>(r0, r2)
        L_0x0186:
            if (r6 != 0) goto L_0x018b
            if (r8 != 0) goto L_0x018b
            goto L_0x013c
        L_0x018b:
            java.lang.String r0 = "cache_name"
            java.lang.String r2 = r5.optString(r0)
            java.lang.String r1 = "eviction_type"
            java.lang.String r0 = "file"
            java.lang.String r1 = r5.optString(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x01a0
            r7 = r2
        L_0x01a0:
            X.4rU r2 = new X.4rU
            r2.<init>(r6, r8, r1, r7)
            X.4rV r0 = r2.A02
            if (r0 != 0) goto L_0x01ae
            X.4rX r0 = r2.A01
            if (r0 != 0) goto L_0x01ae
            goto L_0x013c
        L_0x01ae:
            java.lang.String r0 = r2.A00
            if (r0 != 0) goto L_0x01bc
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = "n/a"
            java.lang.String r0 = r5.optString(r1, r0)
            r2.A00 = r0
        L_0x01bc:
            java.io.File r0 = X.C90524aI.A0S(r13)
            r3.put(r0, r2)
            goto L_0x013c
        L_0x01c5:
            r8 = r7
            goto L_0x0186
        L_0x01c7:
            r6 = r7
            goto L_0x0163
        L_0x01c9:
            java.util.Map r0 = r4.A04
            monitor-enter(r0)
            r3.putAll(r0)     // Catch:{ all -> 0x03f3 }
            monitor-exit(r0)     // Catch:{ all -> 0x03f3 }
            java.util.Iterator r3 = X.C36371kC.A10(r3)
        L_0x01d4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r2 = r3.next()
            java.util.concurrent.Executor r1 = r4.A05
            r0 = 3
            X.74N r0 = X.AnonymousClass74N.A00(r4, r2, r0)
            r1.execute(r0)
            goto L_0x01d4
        L_0x01e9:
            X.00T r0 = r10.A01
            java.lang.Object r9 = r0.getValue()
            X.6mN r9 = (X.C140916mN) r9
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            X.6EQ r8 = r9.A00
            java.util.HashMap r0 = r8.A00()
            java.util.Iterator r4 = X.C36371kC.A10(r0)
        L_0x01ff:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x023a
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r4)
            java.lang.String r3 = X.C90494aF.A0f(r0)
            java.lang.Object r1 = r0.getValue()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01ff
            X.4rX r2 = X.C98504rX.A00(r1)
            if (r2 != 0) goto L_0x0223
            r8.A01(r3)
            goto L_0x01ff
        L_0x0223:
            java.lang.String r0 = "feature_name"
            java.lang.String r1 = r1.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0231
            java.lang.String r1 = "n/a"
        L_0x0231:
            X.4rZ r0 = new X.4rZ
            r0.<init>(r2, r1)
            r7.put(r3, r0)
            goto L_0x01ff
        L_0x023a:
            int[] r11 = X.C131716Qg.A02()
            r6 = 12
            r5 = 0
        L_0x0241:
            r1 = r11[r5]
            java.lang.String r4 = X.C131716Qg.A01(r1)
            X.4rX r3 = X.C131716Qg.A00(r1)
            if (r3 == 0) goto L_0x0285
            if (r4 == 0) goto L_0x0285
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0285
            X.7ey r0 = r9.A01
            X.7ex r0 = (X.C157947ex) r0
            X.6O6 r0 = r0.B8f()
            java.util.Set r0 = r0.A02(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x0263:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0285
            java.io.File r0 = X.C90504aG.A0a(r2)
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0272 }
            goto L_0x0276
        L_0x0272:
            java.lang.String r1 = r0.getAbsolutePath()
        L_0x0276:
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x0263
            X.4rZ r0 = new X.4rZ
            r0.<init>(r3, r4)
            r7.put(r1, r0)
            goto L_0x0263
        L_0x0285:
            int r5 = r5 + 1
            if (r5 < r6) goto L_0x0241
            java.util.Iterator r15 = X.C36371kC.A10(r7)
            r13 = 0
        L_0x028f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x02db
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r15)
            java.lang.String r7 = X.C90494aF.A0f(r0)
            java.lang.Object r11 = r0.getValue()
            X.4rZ r11 = (X.C98524rZ) r11
            X.5za r12 = r11.A00
            X.4rX r12 = (X.C98504rX) r12
            X.7ey r6 = r9.A01
            r0 = r6
            X.7il r0 = (X.C159077il) r0
            boolean r0 = r0.BMJ()
            if (r0 == 0) goto L_0x02d8
            long r4 = r12.A01
        L_0x02b4:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x028f
            java.io.File r3 = X.C90524aI.A0S(r7)
            X.5sN r0 = X.AnonymousClass6Qf.A01(r3)
            long r1 = r0.A02
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x02ca
            r9.A00(r11, r3, r1)
            goto L_0x028f
        L_0x02ca:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x028f
            r6.B5E(r3)
            r8.A01(r7)
            r3.mkdirs()
            goto L_0x028f
        L_0x02d8:
            long r4 = r12.A00
            goto L_0x02b4
        L_0x02db:
            X.00T r0 = r10.A02
            java.lang.Object r7 = r0.getValue()
            X.6mK r7 = (X.C140886mK) r7
            java.util.HashMap r12 = X.AnonymousClass001.A0J()
            X.6EQ r6 = r7.A00
            java.util.HashMap r0 = r6.A00()
            java.util.Iterator r10 = X.C36371kC.A10(r0)
        L_0x02f1:
            boolean r0 = r10.hasNext()
            r1 = -1
            if (r0 == 0) goto L_0x0344
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r10)
            java.lang.String r8 = X.C90494aF.A0f(r0)
            java.lang.Object r9 = r0.getValue()
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x02f1
            java.lang.String r0 = "stale_age_s"
            long r3 = r9.optLong(r0, r1)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x031b
            r6.A01(r8)
            goto L_0x02f1
        L_0x031b:
            r5 = 0
            java.lang.String r0 = "is_itemized"
            boolean r0 = r9.optBoolean(r0, r5)
            X.4rV r5 = new X.4rV
            r5.<init>(r3, r0)
            java.lang.String r0 = "feature_name"
            java.lang.String r3 = r9.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0335
            java.lang.String r3 = "n/a"
        L_0x0335:
            java.lang.String r0 = "usage_timestamp_s"
            long r1 = r9.optLong(r0, r1)
            X.4rY r0 = new X.4rY
            r0.<init>(r5, r3, r1)
            r12.put(r8, r0)
            goto L_0x02f1
        L_0x0344:
            int[] r15 = X.C131716Qg.A02()
            r11 = 12
            r10 = 0
        L_0x034b:
            r3 = r15[r10]
            java.lang.String r5 = X.C131716Qg.A01(r3)
            switch(r3) {
                case 100: goto L_0x03ab;
                case 101: goto L_0x03ab;
                case 102: goto L_0x03ab;
                case 103: goto L_0x03ab;
                case 104: goto L_0x03ab;
                case 105: goto L_0x03ab;
                case 106: goto L_0x03ad;
                case 107: goto L_0x03b0;
                case 108: goto L_0x03b0;
                case 109: goto L_0x03b0;
                case 110: goto L_0x03b3;
                default: goto L_0x0354;
            }
        L_0x0354:
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x034b
            java.util.Iterator r14 = X.C36371kC.A10(r12)
            r12 = 0
        L_0x035e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0838
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r14)
            java.lang.String r5 = X.C90494aF.A0f(r0)
            java.lang.Object r1 = r0.getValue()
            X.4rY r1 = (X.C98514rY) r1
            java.io.File r4 = X.C90524aI.A0S(r5)
            long r10 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r8
            long r2 = r1.A00
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0388
            long r2 = r4.lastModified()
            long r2 = r2 / r8
        L_0x0388:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x035e
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x035e
            X.5za r0 = r1.A00
            X.4rV r0 = (X.C98484rV) r0
            long r0 = r0.A00
            long r2 = r2 + r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x035e
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x035e
            X.7ey r0 = r7.A01
            r0.B5E(r4)
            r6.A01(r5)
            r4.mkdirs()
            goto L_0x035e
        L_0x03ab:
            r0 = 0
            goto L_0x03b4
        L_0x03ad:
            r0 = 90
            goto L_0x03b4
        L_0x03b0:
            r0 = 28
            goto L_0x03b4
        L_0x03b3:
            r0 = 1
        L_0x03b4:
            long r8 = (long) r0
            r13 = 86400(0x15180, double:4.26873E-319)
            long r8 = r8 * r13
            r0 = 0
            X.4rV r4 = new X.4rV
            r4.<init>(r8, r0)
            if (r5 == 0) goto L_0x0354
            X.7ey r0 = r7.A01
            X.7ex r0 = (X.C157947ex) r0
            X.6O6 r0 = r0.B8f()
            java.util.Set r0 = r0.A02(r3)
            java.util.Iterator r8 = r0.iterator()
        L_0x03d1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0354
            java.io.File r0 = X.C90504aG.A0a(r8)
            java.lang.String r3 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x03e0 }
            goto L_0x03e4
        L_0x03e0:
            java.lang.String r3 = r0.getAbsolutePath()
        L_0x03e4:
            boolean r0 = r12.containsKey(r3)
            if (r0 != 0) goto L_0x03d1
            X.4rY r0 = new X.4rY
            r0.<init>(r4, r5, r1)
            r12.put(r3, r0)
            goto L_0x03d1
        L_0x03f3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x03f3 }
            throw r1
        L_0x03f6:
            java.lang.Object r0 = r3.A00
            X.9jy r0 = (X.C201619jy) r0
            r0.A05()
            return
        L_0x03fe:
            java.lang.Object r3 = r3.A00
            X.9jy r3 = (X.C201619jy) r3
            X.AUR r0 = r3.A0C
            X.AUD r0 = r0.cache
            boolean r0 = r0.cacheManagerWaitForCacheInitialization
            if (r0 == 0) goto L_0x042e
            X.896 r2 = r3.A03
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x042e
            java.lang.Object r1 = r2.A01     // Catch:{ InterruptedException -> 0x041f }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x041f }
            boolean r0 = r2.A02     // Catch:{ all -> 0x041c }
            if (r0 != 0) goto L_0x041a
            r1.wait()     // Catch:{ all -> 0x041c }
        L_0x041a:
            monitor-exit(r1)     // Catch:{ all -> 0x041c }
            goto L_0x042e
        L_0x041c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x041c }
            throw r0     // Catch:{ InterruptedException -> 0x041f }
        L_0x041f:
            java.lang.String r2 = "CacheManager_default"
            java.lang.Object[] r1 = X.C90524aI.A0w()
            java.lang.String r0 = "mCache.waitForInit() has been interrupted"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r2, r0)
        L_0x042e:
            r3.A05()
            return
        L_0x0432:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.C90494aF.A0h(r0)
        L_0x0438:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0838
            java.lang.Object r0 = r1.next()
            X.7m6 r0 = (X.C161067m6) r0
            r0.BWF()
            goto L_0x0438
        L_0x0448:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.C90494aF.A0h(r0)
        L_0x044e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0838
            java.lang.Object r0 = r1.next()
            X.7m6 r0 = (X.C161067m6) r0
            r0.BkJ()
            goto L_0x044e
        L_0x045e:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.C90494aF.A0h(r0)
        L_0x0464:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0838
            java.lang.Object r0 = r1.next()
            X.7m6 r0 = (X.C161067m6) r0
            r0.BkK()
            goto L_0x0464
        L_0x0474:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.C90494aF.A0h(r0)
        L_0x047a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0838
            java.lang.Object r0 = r1.next()
            X.7m6 r0 = (X.C161067m6) r0
            r0.BdQ()
            goto L_0x047a
        L_0x048a:
            java.lang.Object r0 = r3.A00
            java.util.Iterator r1 = X.C90494aF.A0h(r0)
        L_0x0490:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0838
            java.lang.Object r0 = r1.next()
            X.7m6 r0 = (X.C161067m6) r0
            r0.Bcl()
            goto L_0x0490
        L_0x04a0:
            java.lang.Object r1 = r3.A00
            X.9lT r1 = (X.C202289lT) r1
            X.AUR r2 = r1.A0B
            boolean r0 = r2.preventPreallocateIfNotEmpty
            r3 = 1
            if (r0 == 0) goto L_0x04b5
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0H
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 != 0) goto L_0x04b5
            return
        L_0x04b5:
            X.5zO r1 = new X.5zO
            r1.<init>()
            r1.A0L = r3
            r1.A0K = r3
            int r0 = r2.maxMediaCodecInstancesPerCodecName
            r1.A02 = r0
            int r0 = r2.maxMediaCodecInstancesTotal
            r1.A03 = r0
            boolean r0 = r2.skipMediaCodecStopOnRelease
            r1.A0P = r0
            boolean r0 = r2.skipAudioMediaCodecStopOnRelease
            r1.A0O = r0
            boolean r0 = r2.enableCodecDeadlockFix
            r1.A0B = r0
            boolean r0 = r2.enableAsynchronousBufferQueueing
            r1.A09 = r0
            boolean r0 = r2.enableSynchronizeCodecInteractionsWithQueueing
            r1.A0N = r0
            boolean r0 = r2.enableSeamlessAudioCodecAdaptation
            r1.A0M = r0
            boolean r0 = r2.enableDrmSessionStore
            r1.A0F = r0
            boolean r0 = r2.enableLowLatencyDecoding
            r1.A0G = r0
            boolean r0 = r2.enableLowLatencyDecodingOverrideSDKGating
            r1.A0H = r0
            boolean r0 = r2.enableMediaCodecReuseOptimizeLock
            r1.A0I = r0
            java.lang.String r0 = r2.useMediaCodecPoolingForCodecByName
            r1.A07 = r0
            boolean r0 = r2.enableMediaCodecReuseOptimizeRelease
            r1.A0J = r0
            boolean r0 = r2.useVersion2_18Workarounds
            r1.A0R = r0
            boolean r0 = r2.useCodecNeedsEosBufferTimestampWorkaround
            r1.A0Q = r0
            int r0 = r2.releaseThreadInterval
            r1.A04 = r0
            boolean r0 = r2.disablePoolingForDav1dMediaCodec
            r1.A08 = r0
            boolean r0 = r2.enableAudioTrackRetry
            r1.A0A = r0
            X.5zM r10 = new X.5zM
            r10.<init>(r1)
            boolean r0 = r2.enableVp9CodecPreallocation
            java.lang.String r1 = "video/avc"
            if (r0 == 0) goto L_0x052b
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            java.lang.String[] r7 = new java.lang.String[]{r1, r0}
        L_0x051b:
            boolean r1 = r10.A09
            r3 = 0
            boolean r0 = r10.A0N
            X.6jI r2 = new X.6jI
            r2.<init>(r1, r0)
            java.lang.String r6 = "audio/mp4a-latm"
            X.6V0 r8 = X.AnonymousClass6V0.A04
            monitor-enter(r8)
            goto L_0x0530
        L_0x052b:
            java.lang.String[] r7 = new java.lang.String[]{r1}
            goto L_0x051b
        L_0x0530:
            int r0 = r8.A00     // Catch:{ all -> 0x057e }
            monitor-exit(r8)
            if (r0 > 0) goto L_0x0838
            boolean r0 = r10.A0L
            if (r0 == 0) goto L_0x0838
            int r5 = r7.length     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            r4 = 0
        L_0x053b:
            r0 = r7[r4]     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            java.util.List r1 = X.C203599oN.A03(r0, r3)     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            boolean r0 = r1.isEmpty()     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            if (r0 != 0) goto L_0x055b
            java.lang.Object r0 = r1.get(r3)     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            X.9l7 r0 = (X.C202149l7) r0     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            if (r0 == 0) goto L_0x055b
            r13 = 1
            java.lang.Integer r11 = X.C023109s.A00     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            java.lang.String r12 = r0.A02     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            X.B3l r9 = r8.A02(r2, r10, r12, r13)     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            r8.A03(r9, r10, r11, r12, r13)     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
        L_0x055b:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x053b
            java.util.List r1 = X.C203599oN.A03(r6, r3)     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            boolean r0 = r1.isEmpty()     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            if (r0 != 0) goto L_0x0838
            java.lang.Object r0 = r1.get(r3)     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            X.9l7 r0 = (X.C202149l7) r0     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            if (r0 == 0) goto L_0x0838
            java.lang.Integer r11 = X.C023109s.A00     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            java.lang.String r12 = r0.A02     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            X.B3l r9 = r8.A02(r2, r10, r12, r3)     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            r13 = 0
            r8.A03(r9, r10, r11, r12, r13)     // Catch:{ 5UT | 5Uq | IllegalStateException -> 0x0838 }
            return
        L_0x057e:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        L_0x0581:
            java.lang.Object r0 = r3.A00
            X.4rb r0 = (X.C98544rb) r0
            X.A2g r0 = r0.A00
            r0.BWF()
            return
        L_0x058b:
            java.lang.Object r3 = r3.A00
            X.5yV r3 = (X.C124615yV) r3
            android.os.MessageQueue r2 = android.os.Looper.myQueue()
            r1 = 1
            X.7sA r0 = new X.7sA
            r0.<init>(r3, r1)
            r2.addIdleHandler(r0)
            return
        L_0x059d:
            java.lang.Object r6 = r3.A00
            X.5yV r6 = (X.C124615yV) r6
            java.lang.Object[] r5 = X.AnonymousClass001.A0L()
            java.util.concurrent.ConcurrentLinkedQueue r4 = r6.A05
            int r1 = r4.size()
            java.util.Map r3 = r6.A04
            int r0 = r3.size()
            int r1 = r1 + r0
            X.AnonymousClass000.A1J(r5, r1)
            java.lang.String r2 = "PlayerWarmupScheduler"
            java.lang.String r0 = "processQueue, queueSize=%d"
            X.C131916Rh.A01(r2, r0, r5)
            java.util.concurrent.atomic.AtomicReference r0 = r6.A06
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0838
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x05d0
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0838
        L_0x05d0:
            boolean r0 = r6.A09
            r1 = 0
            if (r0 == 0) goto L_0x0838
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x05ee
            java.util.Iterator r0 = X.AnonymousClass000.A10(r3)
            r0.next()
            r0 = 0
            r3.remove(r0)
        L_0x05e6:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "warmup queue is empty"
            X.C131916Rh.A01(r2, r0, r1)
            return
        L_0x05ee:
            r4.poll()
            goto L_0x05e6
        L_0x05f2:
            java.lang.String r4 = "LinkSetup"
            java.lang.String r0 = "Encrypt link timed out!"
            X.AnonymousClass6YR.A05(r4, r0)
            java.lang.Object r3 = r3.A00
            X.9mB r3 = (X.C202559mB) r3
            r0 = 0
            r3.A01 = r0
            int r1 = r3.A00
            r0 = 1
            if (r1 >= r0) goto L_0x062e
            int r2 = r1 + 1
            r3.A00 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Retrying with new channel! #"
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            X.AnonymousClass6YR.A05(r4, r0)
            com.facebook.wearable.datax.LocalChannel r1 = r3.A02
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.close()     // Catch:{ all -> 0x061f }
        L_0x061f:
            com.facebook.wearable.datax.LocalChannel r0 = r3.A03()
            r3.A02 = r0
            X.Afp r0 = new X.Afp
            r0.<init>(r3)
            X.C202559mB.A00(r3, r0)
            return
        L_0x062e:
            X.02t r1 = r3.A0G
            X.89J r0 = new X.89J
            r0.<init>()
            goto L_0x0648
        L_0x0636:
            java.lang.String r1 = "LinkSetup"
            java.lang.String r0 = "Set link timed out!"
            X.AnonymousClass6YR.A05(r1, r0)
            java.lang.Object r0 = r3.A00
            X.9mB r0 = (X.C202559mB) r0
            X.02t r1 = r0.A0G
            X.89L r0 = new X.89L
            r0.<init>()
        L_0x0648:
            r1.invoke(r0)
            return
        L_0x064c:
            java.lang.Object r0 = r3.A00
            X.9SV r0 = (X.AnonymousClass9SV) r0
            java.nio.channels.ReadableByteChannel r0 = r0.A02
            if (r0 == 0) goto L_0x0838
            r0.close()
            return
        L_0x0658:
            java.lang.Object r0 = r3.A00
            X.9gt r0 = (X.C200219gt) r0
            android.os.Looper r0 = r0.A06
            if (r0 != 0) goto L_0x0667
            java.lang.String r0 = "looper"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0667:
            r0.quit()
            return
        L_0x066b:
            java.lang.Object r4 = r3.A00
            X.6T2 r4 = (X.AnonymousClass6T2) r4
            java.lang.Object r3 = r4.A09
            monitor-enter(r3)
            boolean r0 = r4.A01()     // Catch:{ all -> 0x06b2 }
            if (r0 == 0) goto L_0x06b0
            java.lang.String r2 = "WakeLock"
            java.lang.String r0 = r4.A0A     // Catch:{ all -> 0x06b2 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x06b2 }
            java.lang.String r0 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x06b2 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x06b2 }
            java.util.Set r2 = r4.A0C     // Catch:{ all -> 0x06b2 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x06b2 }
            if (r0 != 0) goto L_0x06a4
            java.util.ArrayList r1 = X.C36441kJ.A15(r2)     // Catch:{ all -> 0x06b2 }
            r2.clear()     // Catch:{ all -> 0x06b2 }
            int r0 = r1.size()     // Catch:{ all -> 0x06b2 }
            if (r0 <= 0) goto L_0x06a4
            r0 = 0
            r1.get(r0)     // Catch:{ all -> 0x06b2 }
            r0 = 0
            throw r0     // Catch:{ all -> 0x06b2 }
        L_0x06a4:
            boolean r0 = r4.A01()     // Catch:{ all -> 0x06b2 }
            if (r0 == 0) goto L_0x06b0
            r0 = 1
            r4.A00 = r0     // Catch:{ all -> 0x06b2 }
            X.AnonymousClass6T2.A00(r4)     // Catch:{ all -> 0x06b2 }
        L_0x06b0:
            monitor-exit(r3)     // Catch:{ all -> 0x06b2 }
            return
        L_0x06b2:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x06b2 }
            throw r1
        L_0x06b5:
            java.lang.Object r1 = r3.A00
            X.4tB r1 = (X.C99374tB) r1
            r0 = 1
            X.C99374tB.A00(r1, r0)
            return
        L_0x06be:
            java.lang.Object r1 = r3.A00
            X.4tC r1 = (X.C99384tC) r1
            android.widget.AutoCompleteTextView r0 = r1.A04
            boolean r0 = r0.isPopupShowing()
            X.C99384tC.A01(r1, r0)
            r1.A05 = r0
            return
        L_0x06ce:
            java.lang.Object r0 = r3.A00
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            X.4fP r0 = r0.A15
            com.google.android.material.internal.CheckableImageButton r0 = r0.A0G
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L_0x06dd:
            java.lang.Object r0 = r3.A00
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.A0B
            r0.requestLayout()
            return
        L_0x06e7:
            java.lang.Object r0 = r3.A00
            com.google.android.material.timepicker.ClockFaceView r0 = (com.google.android.material.timepicker.ClockFaceView) r0
            r0.A06()
            return
        L_0x06ef:
            java.lang.Object r2 = r3.A00
            X.6ZH r2 = (X.AnonymousClass6ZH) r2
            r1 = 2
            java.lang.String r0 = "Service disconnected"
            r2.A01(r1, r0)
            return
        L_0x06fa:
            java.lang.Object r2 = r3.A00
            X.6ZH r2 = (X.AnonymousClass6ZH) r2
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x070b }
            r1 = 1
            if (r0 != r1) goto L_0x0709
            java.lang.String r0 = "Timed out while binding"
            r2.A01(r1, r0)     // Catch:{ all -> 0x070b }
        L_0x0709:
            monitor-exit(r2)
            return
        L_0x070b:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x070e:
            java.lang.Object r0 = r3.A00
            X.9n4 r0 = (X.C202989n4) r0
            X.9VB r0 = r0.A0N
            java.util.List r2 = r0.A00
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L_0x0838
            r2.get(r0)
            java.lang.String r0 = "onPreviewStopped"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x0727:
            java.lang.Object r8 = r3.A00
            X.64X r8 = (X.AnonymousClass64X) r8
            X.5uH r7 = r8.A04
            java.lang.ref.WeakReference r6 = r7.A03
            java.lang.Object r5 = r6.get()
            if (r5 == 0) goto L_0x074b
            X.7ku r4 = r7.A01
            X.68b r2 = X.C1273868b.A00()
            r1 = 0
            java.lang.String r0 = r7.A02
            r2.A09(r0, r1)
            r0 = 1
            X.6MO r1 = X.C1273868b.A05(r2, r5, r0)
            X.4vP r0 = r7.A00
            X.AnonymousClass6JI.A00(r0, r1, r4)
        L_0x074b:
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x075f
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0838
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0838
            android.os.Handler r2 = r8.A03
            long r0 = r8.A02
            r2.postDelayed(r3, r0)
            return
        L_0x075f:
            java.lang.Object r2 = r6.get()
            X.67i r2 = (X.C1271967i) r2
            if (r2 == 0) goto L_0x0838
            java.lang.String r1 = r7.A02
            r0 = 2131428027(0x7f0b02bb, float:1.8477687E38)
            java.lang.Object r0 = r2.A01(r0)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.remove(r1)
            return
        L_0x0776:
            java.lang.Object r1 = r3.A00
            X.6WZ r1 = (X.AnonymousClass6WZ) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0838
            r1.A05()
            return
        L_0x0782:
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            java.lang.Object r0 = r3.A00
            X.6LF r0 = (X.AnonymousClass6LF) r0
            android.view.Choreographer$FrameCallback r0 = r0.A02
            goto L_0x07d5
        L_0x078d:
            java.lang.Object r2 = r3.A00
            X.6LF r2 = (X.AnonymousClass6LF) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x07a8
            X.00T r0 = r2.A05
            android.os.Handler r0 = X.C90524aI.A0C(r0)
            r0.removeCallbacks(r3)
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            android.view.Choreographer$FrameCallback r0 = r2.A02
            r1.removeFrameCallback(r0)
            return
        L_0x07a8:
            r0 = 1
            r2.A01 = r0
            java.util.LinkedList r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
            X.AnonymousClass00C.A08(r1)
        L_0x07b4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07c8
            java.lang.Object r0 = r1.next()
            X.AnonymousClass00C.A08(r0)
            X.C36411kG.A1O(r0)
            r1.remove()
            goto L_0x07b4
        L_0x07c8:
            r0 = 0
            r2.A01 = r0
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0838
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            android.view.Choreographer$FrameCallback r0 = r2.A02
        L_0x07d5:
            r1.postFrameCallback(r0)
            return
        L_0x07d9:
            java.lang.Object r1 = r3.A00
            X.5sb r1 = (X.C121105sb) r1
            X.02t r0 = r1.A02
            r0.invoke(r1)
            return
        L_0x07e3:
            java.lang.Object r0 = r3.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x07eb:
            java.lang.Object r0 = r3.A00
            X.ASf r0 = (X.C21613ASf) r0
            X.1WR r1 = r0.A01
            r0 = 0
            r1.A01 = r0
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x0808
            java.lang.String r0 = "mystatus/onError Not notifying observers because mystatus hasn't been initialized (the value is null) #mexmigrationperftracker"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wN r3 = r1.A03
            r2 = 1
            java.lang.String r1 = "my-status-failed-init"
            java.lang.String r0 = "fetching MyStatus resulted in an error causing the value to never get initialized. This can lead to looping as other areas of the app indirectly attempt to fetch the missing status because `getMyStatus()` has a side-effect of triggering a network call when myStatus is null."
            r3.A0E(r1, r0, r2)
            return
        L_0x0808:
            X.005 r0 = r1.A06
            java.lang.Object r0 = r0.get()
            X.2ZK r0 = (X.AnonymousClass2ZK) r0
            r0.A00()
            return
        L_0x0814:
            java.lang.Object r2 = r3.A00
            X.1m1 r2 = (X.C37221m1) r2
            com.whatsapp.CodeInputField r1 = r2.A04
            java.lang.String r0 = r1.getCode()
            r1.setCode(r0)
            android.os.Handler r0 = r1.getHandler()
            if (r0 == 0) goto L_0x0838
            java.lang.Runnable r0 = r2.A01
            if (r0 == 0) goto L_0x0838
            android.os.Handler r1 = r1.getHandler()
            java.lang.Runnable r0 = r2.A01
            r1.removeCallbacks(r0)
            return
        L_0x0835:
            X.C130376Kv.A00(r4)
        L_0x0838:
            return
        L_0x0839:
            java.lang.Object r0 = r3.A00
            java.util.Set r0 = (java.util.Set) r0
            r0.clear()
            return
        L_0x0841:
            java.lang.Object r0 = r3.A00
            X.2Ht r0 = (X.C43472Ht) r0
            X.155 r0 = r0.BoP()
            r0.onBackPressed()
            return
        L_0x084d:
            java.lang.Object r0 = r3.A00
            X.4Ow r0 = (X.C87454Ow) r0
            r0.BVJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1497572q.run():void");
    }
}
