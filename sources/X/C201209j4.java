package X;

/* renamed from: X.9j4  reason: invalid class name and case insensitive filesystem */
public class C201209j4 {
    public static C201209j4 A07;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C199529fT A04;
    public C197969cg A05;
    public final B40 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x041c, code lost:
        if (r50 != null) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023b, code lost:
        if (r48.shouldUseLowPassWithWeightedEMAForBWEstimation() == false) goto L_0x023d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0399 A[LOOP:8: B:145:0x0391->B:147:0x0399, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03c3 A[LOOP:9: B:149:0x03bd->B:151:0x03c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02e0 A[EDGE_INSN: B:181:0x02e0->B:118:0x02e0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate A00(com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r50) {
        /*
            r49 = this;
            r33 = r49
            monitor-enter(r33)
            r0 = r33
            X.9cg r13 = r0.A05     // Catch:{ all -> 0x0427 }
            monitor-enter(r13)     // Catch:{ all -> 0x0427 }
            X.C197969cg.A00(r13)     // Catch:{ all -> 0x0424 }
            boolean r0 = r13.A03     // Catch:{ all -> 0x0424 }
            if (r0 != 0) goto L_0x0013
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r6 = r13.A00     // Catch:{ all -> 0x0424 }
            goto L_0x0421
        L_0x0013:
            java.util.Deque r0 = r13.A01     // Catch:{ all -> 0x0424 }
            r35 = r0
            boolean r0 = r35.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r0 != 0) goto L_0x0413
            java.util.Deque r0 = r13.A02     // Catch:{ all -> 0x0424 }
            r34 = r0
            boolean r0 = r34.isEmpty()     // Catch:{ all -> 0x0424 }
            if (r0 != 0) goto L_0x0413
            r48 = r50
            if (r50 == 0) goto L_0x0220
            boolean r0 = r48.shouldUseLowPassEMAForBWEstimation()     // Catch:{ all -> 0x0424 }
            if (r0 == 0) goto L_0x0220
            java.util.Iterator r5 = r35.iterator()     // Catch:{ all -> 0x0411 }
            r16 = 0
            r20 = 0
            r3 = r16
            r11 = 0
            r0 = 0
        L_0x003f:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x0411 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0411 }
            X.84I r4 = (X.AnonymousClass84I) r4     // Catch:{ all -> 0x0411 }
            if (r3 == 0) goto L_0x0055
            long r2 = r4.A01     // Catch:{ all -> 0x0411 }
            double r0 = (double) r2     // Catch:{ all -> 0x0411 }
            double r2 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0411 }
            double r11 = r11 + r2
        L_0x0055:
            r3 = r4
            goto L_0x003f
        L_0x0057:
            int r2 = r35.size()     // Catch:{ all -> 0x0411 }
            r5 = 1
            if (r2 <= r5) goto L_0x006a
            double r2 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0411 }
            double r11 = r11 - r2
            int r2 = r35.size()     // Catch:{ all -> 0x0411 }
            int r2 = r2 - r5
            double r2 = (double) r2     // Catch:{ all -> 0x0411 }
            double r11 = r11 / r2
        L_0x006a:
            int r4 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r4 >= 0) goto L_0x0076
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r14 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x0411 }
            goto L_0x007d
        L_0x0076:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r14 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x0411 }
        L_0x007d:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            boolean r2 = r48.shouldUseLowPassEMAAsymmetryForBWEstimation()     // Catch:{ all -> 0x0411 }
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r2 == 0) goto L_0x0098
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r9 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x0411 }
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r2 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x0411 }
            double r9 = r9 / r2
            goto L_0x009a
        L_0x0098:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x009a:
            int r2 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ac
            if (r4 >= 0) goto L_0x00a2
            r2 = r9
            goto L_0x00a4
        L_0x00a2:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x00a4:
            double r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0411 }
            double r0 = r0 / r11
            double r2 = r2 + r0
            double r6 = r6 / r2
            double r14 = r14 * r6
        L_0x00ac:
            java.util.Iterator r8 = r34.iterator()     // Catch:{ all -> 0x0411 }
            r6 = 0
            r2 = 0
        L_0x00b4:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x0411 }
            X.84J r4 = (X.AnonymousClass84J) r4     // Catch:{ all -> 0x0411 }
            if (r16 == 0) goto L_0x00ca
            long r0 = r4.A00     // Catch:{ all -> 0x0411 }
            double r2 = (double) r0     // Catch:{ all -> 0x0411 }
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0411 }
            double r6 = r6 + r0
        L_0x00ca:
            r16 = r4
            goto L_0x00b4
        L_0x00cd:
            int r0 = r34.size()     // Catch:{ all -> 0x0411 }
            if (r0 <= r5) goto L_0x00df
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0411 }
            double r6 = r6 - r0
            int r0 = r34.size()     // Catch:{ all -> 0x0411 }
            int r0 = r0 - r5
            double r0 = (double) r0     // Catch:{ all -> 0x0411 }
            double r6 = r6 / r0
        L_0x00df:
            int r4 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e4
            goto L_0x00ec
        L_0x00e4:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r18 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x0411 }
            goto L_0x00f3
        L_0x00ec:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r18 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x0411 }
        L_0x00f3:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            boolean r0 = r48.shouldUseLowPassEMAAsymmetryForBWEstimation()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x010b
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r9 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x0411 }
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r0 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x0411 }
            double r9 = r9 / r0
        L_0x010b:
            int r0 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x011e
            if (r4 >= 0) goto L_0x0113
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0113:
            double r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0411 }
            double r0 = r0 / r6
            double r9 = r9 + r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 / r9
            double r18 = r18 * r0
        L_0x011e:
            java.lang.Object r6 = r35.peekLast()     // Catch:{ all -> 0x0411 }
            X.84I r6 = (X.AnonymousClass84I) r6     // Catch:{ all -> 0x0411 }
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r14
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0411 }
            r0 = 0
            double r4 = (double) r0     // Catch:{ all -> 0x0411 }
            double r2 = r2 * r4
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0411 }
            long r6 = r6.A00     // Catch:{ all -> 0x0411 }
            double r0 = (double) r6     // Catch:{ all -> 0x0411 }
            double r0 = r0 * r14
            double r2 = r2 + r0
            long r8 = (long) r2     // Catch:{ all -> 0x0411 }
            java.lang.Object r0 = r34.peekLast()     // Catch:{ all -> 0x0411 }
            X.84J r0 = (X.AnonymousClass84J) r0     // Catch:{ all -> 0x0411 }
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r18
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0411 }
            double r2 = r2 * r4
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0411 }
            long r4 = r0.A01     // Catch:{ all -> 0x0411 }
            double r0 = (double) r4     // Catch:{ all -> 0x0411 }
            double r0 = r0 * r18
            double r2 = r2 + r0
            long r4 = (long) r2     // Catch:{ all -> 0x0411 }
            java.util.Iterator r12 = r35.iterator()     // Catch:{ all -> 0x0411 }
            r10 = 0
        L_0x0155:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0411 }
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0171
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0411 }
            X.84I r0 = (X.AnonymousClass84I) r0     // Catch:{ all -> 0x0411 }
            long r0 = r0.A00     // Catch:{ all -> 0x0411 }
            long r0 = r0 - r8
            long r0 = r0 / r6
            double r2 = (double) r0     // Catch:{ all -> 0x0411 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x0411 }
            double r20 = r20 + r10
            goto L_0x0155
        L_0x0171:
            int r0 = r35.size()     // Catch:{ all -> 0x0411 }
            r1 = 1
            if (r0 <= r1) goto L_0x0182
            double r20 = r20 - r10
            int r0 = r35.size()     // Catch:{ all -> 0x0411 }
            int r0 = r0 - r1
            double r0 = (double) r0     // Catch:{ all -> 0x0411 }
            double r20 = r20 / r0
        L_0x0182:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r1 = r48.getMaxAlphaLowPassEMABwVol()     // Catch:{ all -> 0x0411 }
            r16 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0199
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r14 = r48.getMaxAlphaLowPassEMABwVol()     // Catch:{ all -> 0x0411 }
        L_0x0199:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r14
            double r2 = java.lang.Math.sqrt(r20)     // Catch:{ all -> 0x0411 }
            double r0 = r0 * r2
            double r2 = java.lang.Math.sqrt(r10)     // Catch:{ all -> 0x0411 }
            double r14 = r14 * r2
            double r0 = r0 + r14
            long r2 = (long) r0     // Catch:{ all -> 0x0411 }
            long r2 = r2 * r6
            java.util.Iterator r12 = r34.iterator()     // Catch:{ all -> 0x0411 }
            r14 = 0
            r10 = 0
        L_0x01b1:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x0411 }
            X.84J r0 = (X.AnonymousClass84J) r0     // Catch:{ all -> 0x0411 }
            long r0 = r0.A01     // Catch:{ all -> 0x0411 }
            long r0 = r0 - r4
            double r6 = (double) r0     // Catch:{ all -> 0x0411 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.pow(r6, r0)     // Catch:{ all -> 0x0411 }
            double r10 = r10 + r14
            goto L_0x01b1
        L_0x01c9:
            int r0 = r34.size()     // Catch:{ all -> 0x0411 }
            r1 = 1
            if (r0 <= r1) goto L_0x01d8
            double r10 = r10 - r14
            int r0 = r34.size()     // Catch:{ all -> 0x0411 }
            int r0 = r0 - r1
            double r0 = (double) r0     // Catch:{ all -> 0x0411 }
            double r10 = r10 / r0
        L_0x01d8:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r6 = r48.getMaxAlphaLowPassEMATtfbVol()     // Catch:{ all -> 0x0411 }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ea
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r18 = r48.getMaxAlphaLowPassEMATtfbVol()     // Catch:{ all -> 0x0411 }
        L_0x01ea:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 - r18
            double r0 = java.lang.Math.sqrt(r10)     // Catch:{ all -> 0x0411 }
            double r6 = r6 * r0
            double r0 = java.lang.Math.sqrt(r14)     // Catch:{ all -> 0x0411 }
            double r18 = r18 * r0
            double r6 = r6 + r18
            long r0 = (long) r6     // Catch:{ all -> 0x0411 }
            r37 = 1000(0x3e8, double:4.94E-321)
            int r7 = r35.size()     // Catch:{ all -> 0x0411 }
            int r6 = r34.size()     // Catch:{ all -> 0x0411 }
            int r7 = r7 + r6
            int r7 = r7 / 2
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r6 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x0411 }
            r43 = 1000(0x3e8, double:4.94E-321)
            r34 = r6
            r35 = r4
            r39 = r0
            r41 = r8
            r45 = r2
            r47 = r7
            r34.<init>(r35, r37, r39, r41, r43, r45, r47, r48)     // Catch:{ all -> 0x0411 }
            r13.A00 = r6     // Catch:{ all -> 0x0411 }
            goto L_0x041e
        L_0x0220:
            int r0 = r34.size()     // Catch:{ all -> 0x0411 }
            double[] r0 = new double[r0]     // Catch:{ all -> 0x0411 }
            r32 = r0
            int r0 = r35.size()     // Catch:{ all -> 0x0411 }
            double[] r0 = new double[r0]     // Catch:{ all -> 0x0411 }
            r31 = r0
            if (r50 == 0) goto L_0x023d
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            boolean r0 = r48.shouldUseLowPassWithWeightedEMAForBWEstimation()     // Catch:{ all -> 0x0411 }
            r20 = 1
            if (r0 != 0) goto L_0x023f
        L_0x023d:
            r20 = 0
        L_0x023f:
            r4 = 0
            if (r20 == 0) goto L_0x0262
            java.util.Iterator r2 = r35.iterator()     // Catch:{ all -> 0x0411 }
            r8 = 0
        L_0x0249:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x025d
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0411 }
            X.84I r0 = (X.AnonymousClass84I) r0     // Catch:{ all -> 0x0411 }
            long r0 = r0.A01     // Catch:{ all -> 0x0411 }
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0411 }
            long r8 = r8 + r0
            goto L_0x0249
        L_0x025d:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0262
            goto L_0x0265
        L_0x0262:
            r8 = 1
            goto L_0x026b
        L_0x0265:
            int r0 = r35.size()     // Catch:{ all -> 0x0411 }
            long r0 = (long) r0     // Catch:{ all -> 0x0411 }
            long r8 = r8 / r0
        L_0x026b:
            long r29 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0411 }
            java.util.Iterator r17 = r35.iterator()     // Catch:{ all -> 0x0411 }
            r11 = 0
            r27 = 0
            r16 = 0
        L_0x0279:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0411 }
            r25 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L_0x02e0
            java.lang.Object r10 = r17.next()     // Catch:{ all -> 0x0411 }
            X.84I r10 = (X.AnonymousClass84I) r10     // Catch:{ all -> 0x0411 }
            long r2 = r10.A00     // Catch:{ all -> 0x0411 }
            long r0 = r29 - r2
            double r6 = (double) r0     // Catch:{ all -> 0x0411 }
            double r6 = r6 / r25
            if (r20 == 0) goto L_0x02af
            long r0 = r10.A01     // Catch:{ all -> 0x0411 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x02a3
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r14 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x0411 }
            goto L_0x02aa
        L_0x02a3:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r14 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x0411 }
        L_0x02aa:
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x02bd
            goto L_0x02b2
        L_0x02af:
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x02bd
        L_0x02b2:
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0411 }
            double r2 = (double) r0     // Catch:{ all -> 0x0411 }
            double r0 = (double) r8     // Catch:{ all -> 0x0411 }
            double r2 = r2 / r0
            double r2 = r2 + r23
            double r23 = r23 / r2
        L_0x02bd:
            r0 = -4631501856787818086(0xbfb999999999999a, double:-0.1)
            double r6 = r6 * r0
            double r4 = java.lang.Math.exp(r6)     // Catch:{ all -> 0x0411 }
            long r2 = r10.A01     // Catch:{ all -> 0x0411 }
            double r0 = (double) r2     // Catch:{ all -> 0x0411 }
            double r4 = r4 * r0
            double r4 = r4 * r23
            double r4 = r4 * r14
            long r2 = r10.A00     // Catch:{ all -> 0x0411 }
            double r0 = (double) r2     // Catch:{ all -> 0x0411 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x0411 }
            double r0 = r0 * r4
            double r27 = r27 + r0
            double r11 = r11 + r4
            r31[r16] = r4     // Catch:{ all -> 0x0411 }
            int r16 = r16 + 1
            r4 = 0
            goto L_0x0279
        L_0x02e0:
            if (r20 == 0) goto L_0x0301
            java.util.Iterator r2 = r34.iterator()     // Catch:{ all -> 0x0411 }
        L_0x02e6:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x02fa
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0411 }
            X.84J r0 = (X.AnonymousClass84J) r0     // Catch:{ all -> 0x0411 }
            long r0 = r0.A00     // Catch:{ all -> 0x0411 }
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0411 }
            long r4 = r4 + r0
            goto L_0x02e6
        L_0x02fa:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0301
            goto L_0x0304
        L_0x0301:
            r4 = 1
            goto L_0x030a
        L_0x0304:
            int r0 = r34.size()     // Catch:{ all -> 0x0411 }
            long r0 = (long) r0     // Catch:{ all -> 0x0411 }
            long r4 = r4 / r0
        L_0x030a:
            java.util.Iterator r19 = r34.iterator()     // Catch:{ all -> 0x0411 }
            r6 = 0
            r18 = 0
            r21 = 0
        L_0x0314:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0411 }
            if (r0 == 0) goto L_0x037a
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x0411 }
            X.84J r10 = (X.AnonymousClass84J) r10     // Catch:{ all -> 0x0411 }
            long r2 = r10.A00     // Catch:{ all -> 0x0411 }
            long r0 = r29 - r2
            double r8 = (double) r0     // Catch:{ all -> 0x0411 }
            double r8 = r8 / r25
            if (r20 == 0) goto L_0x034a
            r20 = 1
            long r0 = r10.A00     // Catch:{ all -> 0x0411 }
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x033b
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r16 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x0411 }
            goto L_0x0342
        L_0x033b:
            java.util.Objects.requireNonNull(r48)     // Catch:{ all -> 0x0411 }
            double r16 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x0411 }
        L_0x0342:
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x0347
            goto L_0x0351
        L_0x0347:
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x035c
        L_0x034a:
            r20 = 0
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x035c
        L_0x0351:
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0411 }
            double r2 = (double) r0     // Catch:{ all -> 0x0411 }
            double r0 = (double) r4     // Catch:{ all -> 0x0411 }
            double r2 = r2 / r0
            double r2 = r2 + r23
            double r14 = r23 / r2
        L_0x035c:
            r0 = -4625196817309499392(0xbfd0000000000000, double:-0.25)
            double r8 = r8 * r0
            double r8 = java.lang.Math.exp(r8)     // Catch:{ all -> 0x0411 }
            long r2 = r10.A01     // Catch:{ all -> 0x0411 }
            double r0 = (double) r2     // Catch:{ all -> 0x0411 }
            double r8 = r8 * r0
            double r8 = r8 * r14
            double r8 = r8 * r16
            long r2 = r10.A01     // Catch:{ all -> 0x0411 }
            double r0 = (double) r2     // Catch:{ all -> 0x0411 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x0411 }
            double r0 = r0 * r8
            double r21 = r21 + r0
            double r6 = r6 + r8
            r32[r18] = r8     // Catch:{ all -> 0x0411 }
            int r18 = r18 + 1
            goto L_0x0314
        L_0x037a:
            double r27 = r27 / r11
            double r2 = java.lang.Math.exp(r27)     // Catch:{ all -> 0x0411 }
            long r0 = (long) r2     // Catch:{ all -> 0x0411 }
            r19 = r0
            double r21 = r21 / r6
            double r0 = java.lang.Math.exp(r21)     // Catch:{ all -> 0x0411 }
            long r14 = (long) r0     // Catch:{ all -> 0x0411 }
            java.util.Iterator r16 = r35.iterator()     // Catch:{ all -> 0x0411 }
            r4 = -1
            r10 = 0
        L_0x0391:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0411 }
            r45 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x03b6
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x0411 }
            X.84I r0 = (X.AnonymousClass84I) r0     // Catch:{ all -> 0x0411 }
            double r2 = (double) r4     // Catch:{ all -> 0x0411 }
            r8 = r31[r10]     // Catch:{ all -> 0x0411 }
            long r0 = r0.A00     // Catch:{ all -> 0x0411 }
            long r0 = r0 - r19
            long r0 = r0 / r45
            double r4 = (double) r0     // Catch:{ all -> 0x0411 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r4, r0)     // Catch:{ all -> 0x0411 }
            double r8 = r8 * r0
            double r8 = r8 / r11
            double r2 = r2 + r8
            long r4 = (long) r2     // Catch:{ all -> 0x0411 }
            int r10 = r10 + 1
            goto L_0x0391
        L_0x03b6:
            java.util.Iterator r18 = r34.iterator()     // Catch:{ all -> 0x0411 }
            r0 = -1
            r10 = 0
        L_0x03bd:
            boolean r2 = r18.hasNext()     // Catch:{ all -> 0x0411 }
            if (r2 == 0) goto L_0x03e0
            java.lang.Object r8 = r18.next()     // Catch:{ all -> 0x0411 }
            X.84J r8 = (X.AnonymousClass84J) r8     // Catch:{ all -> 0x0411 }
            double r2 = (double) r0     // Catch:{ all -> 0x0411 }
            r16 = r32[r10]     // Catch:{ all -> 0x0411 }
            long r0 = r8.A01     // Catch:{ all -> 0x0411 }
            long r0 = r0 - r14
            double r8 = (double) r0     // Catch:{ all -> 0x0411 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r8, r0)     // Catch:{ all -> 0x0411 }
            double r16 = r16 * r0
            double r16 = r16 / r6
            double r2 = r2 + r16
            long r0 = (long) r2     // Catch:{ all -> 0x0411 }
            int r10 = r10 + 1
            goto L_0x03bd
        L_0x03e0:
            double r2 = (double) r0     // Catch:{ all -> 0x0411 }
            double r0 = java.lang.Math.sqrt(r2)     // Catch:{ all -> 0x0411 }
            long r8 = (long) r0     // Catch:{ all -> 0x0411 }
            double r0 = (double) r4     // Catch:{ all -> 0x0411 }
            double r2 = java.lang.Math.sqrt(r0)     // Catch:{ all -> 0x0411 }
            long r0 = (long) r2     // Catch:{ all -> 0x0411 }
            long r45 = r45 * r0
            long r0 = (long) r6     // Catch:{ all -> 0x0411 }
            long r2 = (long) r11     // Catch:{ all -> 0x0411 }
            int r5 = r35.size()     // Catch:{ all -> 0x0411 }
            int r4 = r34.size()     // Catch:{ all -> 0x0411 }
            int r5 = r5 + r4
            int r4 = r5 / 2
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r6 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x0411 }
            r34 = r6
            r35 = r14
            r37 = r0
            r39 = r8
            r41 = r19
            r43 = r2
            r47 = r4
            r34.<init>(r35, r37, r39, r41, r43, r45, r47, r48)     // Catch:{ all -> 0x0411 }
            r13.A00 = r6     // Catch:{ all -> 0x0411 }
            goto L_0x041b
        L_0x0411:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0424 }
        L_0x0413:
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r6 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x0424 }
            r6.<init>()     // Catch:{ all -> 0x0424 }
            r13.A00 = r6     // Catch:{ all -> 0x0424 }
            goto L_0x041e
        L_0x041b:
            r0 = 1
            if (r50 == 0) goto L_0x041f
        L_0x041e:
            r0 = 0
        L_0x041f:
            r13.A03 = r0     // Catch:{ all -> 0x0424 }
        L_0x0421:
            monitor-exit(r13)     // Catch:{ all -> 0x0427 }
            monitor-exit(r33)
            return r6
        L_0x0424:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0427 }
            throw r0     // Catch:{ all -> 0x0427 }
        L_0x0427:
            r0 = move-exception
            monitor-exit(r33)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201209j4.A00(com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration):com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate");
    }

    public C201209j4(B40 b40) {
        this();
        this.A06 = b40;
    }

    public C201209j4() {
        this.A02 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = new C199529fT();
        this.A05 = new C197969cg(B40.A00);
    }
}
