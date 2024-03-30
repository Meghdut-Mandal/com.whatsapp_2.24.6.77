package X;

import android.os.SystemClock;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class A1D implements B5W {
    public int A00 = 0;
    public int A01;
    public int A02;
    public long A03 = 0;
    public long A04;
    public long A05 = -1;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = 0;
    public long A09;
    public long A0A;
    public String A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C22774Avk A0H;
    public final B40 A0I;
    public final /* synthetic */ A0B A0J;

    public void BY4(C188528zj r1, long j, long j2, long j3) {
    }

    public void BY5(long j, long j2) {
    }

    public void BZB(C188528zj r1) {
    }

    public void BZC() {
    }

    public void BjU() {
        A00(true);
    }

    public void Bqc(long j) {
    }

    public A1D(C22774Avk avk, B40 b40, A0B a0b, boolean z) {
        this.A0J = a0b;
        this.A0I = b40;
        this.A0H = avk;
        this.A0D = z;
    }

    public void BSX(C202189lD r7, Object obj, int i, boolean z) {
        int i2;
        int i3 = this.A02 + i;
        this.A02 = i3;
        if (this.A08 <= 0 && this.A0G && (i2 = this.A00) > 0 && i3 >= i2) {
            this.A08 = SystemClock.elapsedRealtime();
            this.A0C = true;
        }
    }

    public void BjV(C202189lD r6, Object obj, boolean z) {
        if (this.A09 != 0) {
            A00(false);
        }
    }

    public void BjW(IOException iOException) {
        if (this.A09 != 0) {
            A00(true);
        }
    }

    public void BjX(String str, Object obj) {
        if (this.A0F && "x-fb-response-time-ms".equalsIgnoreCase(str) && obj != null) {
            try {
                this.A03 = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        if ("x-bwe-mean".equalsIgnoreCase(str) && obj != null) {
            try {
                String[] split = ((String) obj).split(";");
                this.A06 = 0;
                this.A07 = 0;
                this.A05 = 0;
                for (String split2 : split) {
                    String[] split3 = split2.split(":");
                    if (split3.length != 2) {
                        break;
                    }
                    if (split3[0].equalsIgnoreCase("aggressive")) {
                        this.A06 = Long.parseLong(split3[1]);
                    }
                    if (split3[0].equalsIgnoreCase("mean")) {
                        this.A07 = Long.parseLong(split3[1]);
                    }
                    if (split3[0].equalsIgnoreCase("conservative")) {
                        this.A05 = Long.parseLong(split3[1]);
                    }
                }
            } catch (NumberFormatException unused2) {
            }
        }
        if ("x-bwe-std-dev".equalsIgnoreCase(str) && obj != null) {
            try {
                Long.parseLong((String) obj);
            } catch (NumberFormatException unused3) {
            }
        }
        if ("x-mrtt-ms".equalsIgnoreCase(str) && obj != null) {
            try {
                Long.parseLong((String) obj);
            } catch (NumberFormatException unused4) {
            }
        }
        if ("x-fb-dynamic-predictive-response-chunk-size".equalsIgnoreCase(str) && obj != null) {
            try {
                this.A00 = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused5) {
            }
        }
    }

    public void BjY(C202189lD r5, C188528zj r6) {
        String obj = r5.A04.toString();
        C199149em r0 = r5.A05;
        int i = r0.A06;
        boolean z = r0.A0Q;
        try {
            this.A0B = new URL(obj).getHost();
        } catch (MalformedURLException unused) {
            this.A0B = null;
        }
        this.A0E = C36371kC.A1W(r6, C188528zj.NOT_CACHED);
        this.A09 = SystemClock.elapsedRealtime();
        this.A01 = i;
        this.A03 = 0;
        this.A0F = z;
    }

    public void BjZ(C202189lD r3, Object obj, boolean z, boolean z2) {
        this.A0G = z2;
        this.A0A = SystemClock.elapsedRealtime();
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0233 A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0254 A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0271 A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x028e A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0293 A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02a5 A[Catch:{ all -> 0x02f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02c5 A[Catch:{ all -> 0x02f2 }] */
    private void A00(boolean r34) {
        /*
            r33 = this;
            long r7 = android.os.SystemClock.elapsedRealtime()
            r2 = r33
            long r0 = r2.A04
            r10 = 0
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0010
            long r0 = r2.A09
        L_0x0010:
            long r5 = r2.A0A
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x007a
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x007a
            boolean r3 = r2.A0D
            if (r3 == 0) goto L_0x002d
            boolean r3 = r2.A0C
            if (r3 == 0) goto L_0x002d
            int r3 = r2.A00
            if (r3 == 0) goto L_0x002d
            long r3 = r2.A08
            int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r10 = 1
            if (r9 != 0) goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            long r3 = r2.A09
            long r0 = r0 - r3
            int r9 = (int) r0
            long r0 = r5 - r3
            int r11 = (int) r0
            if (r10 == 0) goto L_0x0039
            long r7 = r2.A08
        L_0x0039:
            long r7 = r7 - r5
            int r6 = (int) r7
            if (r10 == 0) goto L_0x02e7
            int r8 = r2.A00
        L_0x003f:
            r16 = 0
            boolean r7 = r2.A0E
            if (r34 != 0) goto L_0x004b
            int r0 = r2.A02
            r28 = 0
            if (r0 > 0) goto L_0x004d
        L_0x004b:
            r28 = 1
        L_0x004d:
            boolean r5 = r2.A0G
            long r0 = r2.A03
            X.9O2 r10 = new X.9O2
            r18 = r10
            r19 = r9
            r20 = r11
            r21 = r6
            r22 = r8
            r23 = r3
            r25 = r0
            r27 = r7
            r29 = r5
            r18.<init>(r19, r20, r21, r22, r23, r25, r27, r28, r29)
            X.A0B r5 = r2.A0J
            boolean r3 = r10.A08
            if (r3 == 0) goto L_0x0092
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r0 = r5.A03
            X.AUF r1 = r0.abrSetting
            boolean r0 = r1.enableBwOnlyEstimationForLongPoll
            if (r0 != 0) goto L_0x0092
            boolean r0 = r1.removeCDNResponseTimeForLongPoll
            if (r0 != 0) goto L_0x0092
        L_0x007a:
            r4 = 0
            r2.A09 = r4
            r2.A0A = r4
            r3 = 0
            r2.A02 = r3
            r2.A0E = r3
            r2.A01 = r3
            r0 = -1
            r2.A04 = r0
            r2.A00 = r3
            r2.A0C = r3
            r2.A08 = r4
            return
        L_0x0092:
            r20 = r3 ^ 1
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r0 = r5.A03
            r32 = r0
            X.AUF r3 = r0.abrSetting
            int r0 = r3.maxNumberSmallBwSamplesIgnored
            r1 = 0
            if (r0 <= 0) goto L_0x00bc
            monitor-enter(r5)
            int r12 = r10.A02     // Catch:{ all -> 0x02f7 }
            r0 = r32
            X.AUF r3 = r0.abrSetting     // Catch:{ all -> 0x02f7 }
            int r0 = r3.initSegmentBandwidthExclusionLimitBytes     // Catch:{ all -> 0x02f7 }
            if (r12 < r0) goto L_0x00b1
            int r0 = r5.A00     // Catch:{ all -> 0x02f7 }
            if (r0 <= 0) goto L_0x00f5
            r5.A00 = r1     // Catch:{ all -> 0x02f7 }
            goto L_0x00f5
        L_0x00b1:
            int r1 = r5.A00     // Catch:{ all -> 0x02f7 }
            int r0 = r3.maxNumberSmallBwSamplesIgnored     // Catch:{ all -> 0x02f7 }
            if (r1 >= r0) goto L_0x00c3
            int r1 = r1 + 1
            r5.A00 = r1     // Catch:{ all -> 0x02f7 }
            goto L_0x00c3
        L_0x00bc:
            int r12 = r10.A02
            int r0 = r3.initSegmentBandwidthExclusionLimitBytes
            if (r12 < r0) goto L_0x00c6
            goto L_0x00f6
        L_0x00c3:
            if (r1 >= r0) goto L_0x00f5
            monitor-exit(r5)
        L_0x00c6:
            r15 = 0
            r0 = r32
            X.AUF r0 = r0.abrSetting
            boolean r0 = r0.enableTtfbOnlyEstimation
            if (r0 != 0) goto L_0x00d1
            r20 = 0
        L_0x00d1:
            r0 = r32
            X.AUF r0 = r0.abrSetting
            boolean r0 = r0.removeCDNResponseTimeForLongPoll
            if (r0 == 0) goto L_0x00f0
            long r3 = r10.A03
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            int r0 = r10.A00
            long r0 = (long) r0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x00f0
            long r0 = r0 - r3
            int r3 = (int) r0
            r10.A00 = r3
            r20 = 1
        L_0x00ec:
            X.9j4 r5 = r5.A02
            monitor-enter(r5)
            goto L_0x00f8
        L_0x00f0:
            if (r20 != 0) goto L_0x00ec
            if (r15 == 0) goto L_0x007a
            goto L_0x00ec
        L_0x00f5:
            monitor-exit(r5)
        L_0x00f6:
            r15 = 1
            goto L_0x00d1
        L_0x00f8:
            java.lang.String r0 = "onTransferFinished"
            X.C196289Yq.A01(r0)     // Catch:{ all -> 0x02f2 }
            int r0 = r5.A01     // Catch:{ all -> 0x02f0 }
            int r0 = r0 + 1
            r5.A01 = r0     // Catch:{ all -> 0x02f0 }
            long r8 = r10.A05     // Catch:{ all -> 0x02f0 }
            r3 = 0
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d1
            boolean r0 = r10.A06     // Catch:{ all -> 0x02f0 }
            if (r0 != 0) goto L_0x01d1
            boolean r0 = r10.A07     // Catch:{ all -> 0x02f0 }
            if (r0 != 0) goto L_0x01d1
            int r0 = r10.A00     // Catch:{ all -> 0x02f0 }
            long r0 = (long) r0     // Catch:{ all -> 0x02f0 }
            long r6 = r10.A04     // Catch:{ all -> 0x02f0 }
            long r0 = r0 - r6
            int r10 = r10.A01     // Catch:{ all -> 0x02f0 }
            long r10 = (long) r10     // Catch:{ all -> 0x02f0 }
            long r18 = r0 + r10
            long r8 = r8 + r18
            long r6 = r6 + r8
            r9 = 8000(0x1f40, double:3.9525E-320)
            int r8 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x012b
            long r3 = (long) r12     // Catch:{ all -> 0x02f0 }
            long r3 = r3 * r9
            long r3 = r3 / r18
        L_0x012b:
            if (r12 <= 0) goto L_0x012e
            goto L_0x0130
        L_0x012e:
            r14 = 0
            goto L_0x0136
        L_0x0130:
            double r8 = (double) r12     // Catch:{ all -> 0x02f0 }
            double r8 = java.lang.Math.sqrt(r8)     // Catch:{ all -> 0x02f0 }
            int r14 = (int) r8     // Catch:{ all -> 0x02f0 }
        L_0x0136:
            long r9 = (long) r12     // Catch:{ all -> 0x02f0 }
            X.9cg r8 = r5.A05     // Catch:{ all -> 0x02f0 }
            r30 = 0
            monitor-enter(r8)     // Catch:{ all -> 0x02f0 }
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x01a4
            int r11 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x01a4
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x01a4
            if (r20 == 0) goto L_0x0172
            java.util.Deque r13 = r8.A02     // Catch:{ all -> 0x02ed }
            boolean r11 = r13.isEmpty()     // Catch:{ all -> 0x02ed }
            if (r11 != 0) goto L_0x016f
            java.lang.Object r11 = r13.getLast()     // Catch:{ all -> 0x02ed }
            X.84J r11 = (X.AnonymousClass84J) r11     // Catch:{ all -> 0x02ed }
            long r11 = r11.A01     // Catch:{ all -> 0x02ed }
            long r28 = r0 - r11
        L_0x015c:
            long r26 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02ed }
            X.84J r11 = new X.84J     // Catch:{ all -> 0x02ed }
            r21 = r11
            r22 = r0
            r24 = r9
            r21.<init>(r22, r24, r26, r28)     // Catch:{ all -> 0x02ed }
            r13.add(r11)     // Catch:{ all -> 0x02ed }
            goto L_0x0172
        L_0x016f:
            r28 = 0
            goto L_0x015c
        L_0x0172:
            if (r15 == 0) goto L_0x019e
            r24 = 8000(0x1f40, double:3.9525E-320)
            long r24 = r24 * r9
            long r18 = r18 - r0
            long r24 = r24 / r18
            java.util.Deque r11 = r8.A01     // Catch:{ all -> 0x02ed }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x02ed }
            if (r0 != 0) goto L_0x018e
            java.lang.Object r0 = r11.getLast()     // Catch:{ all -> 0x02ed }
            X.84I r0 = (X.AnonymousClass84I) r0     // Catch:{ all -> 0x02ed }
            long r0 = r0.A00     // Catch:{ all -> 0x02ed }
            long r30 = r24 - r0
        L_0x018e:
            long r28 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x02ed }
            X.84I r0 = new X.84I     // Catch:{ all -> 0x02ed }
            r23 = r0
            r26 = r9
            r23.<init>(r24, r26, r28, r30)     // Catch:{ all -> 0x02ed }
            r11.add(r0)     // Catch:{ all -> 0x02ed }
        L_0x019e:
            X.C197969cg.A00(r8)     // Catch:{ all -> 0x02ed }
            r0 = 1
            r8.A03 = r0     // Catch:{ all -> 0x02ed }
        L_0x01a4:
            monitor-exit(r8)     // Catch:{ all -> 0x02f0 }
            if (r20 == 0) goto L_0x01d1
            if (r15 == 0) goto L_0x01d1
            long r0 = r5.A03     // Catch:{ all -> 0x02eb }
            long r0 = java.lang.Math.max(r0, r6)     // Catch:{ all -> 0x02eb }
            r5.A03 = r0     // Catch:{ all -> 0x02eb }
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d1
            X.9fT r1 = r5.A04     // Catch:{ all -> 0x02eb }
            float r0 = (float) r3     // Catch:{ all -> 0x02eb }
            r1.A01(r14, r0)     // Catch:{ all -> 0x02eb }
            float r1 = r1.A00()     // Catch:{ all -> 0x02eb }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x01c8
            r0 = -1
            goto L_0x01c9
        L_0x01c8:
            long r0 = (long) r1     // Catch:{ all -> 0x02eb }
        L_0x01c9:
            r5.A02 = r0     // Catch:{ all -> 0x02eb }
            int r0 = r5.A00     // Catch:{ all -> 0x02eb }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x02eb }
        L_0x01d1:
            com.facebook.http.historical.NetworkInfoMap r19 = com.facebook.http.historical.NetworkInfoMap.A01     // Catch:{ all -> 0x02f2 }
            monitor-enter(r19)     // Catch:{ all -> 0x02f2 }
            monitor-exit(r19)     // Catch:{ all -> 0x02f2 }
            r0 = r32
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r10 = r5.A00(r0)     // Catch:{ all -> 0x02f2 }
            long r6 = r10.A05     // Catch:{ all -> 0x02f2 }
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x02e1
            long r3 = r10.A00     // Catch:{ all -> 0x02f2 }
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e1
            r0 = r32
            X.AUF r0 = r0.abrSetting     // Catch:{ all -> 0x02f2 }
            boolean r0 = r0.enableConfRiskBwCache     // Catch:{ all -> 0x02f2 }
            if (r0 == 0) goto L_0x02d7
            X.8yy r18 = X.C188058yy.UNDEFINED     // Catch:{ all -> 0x02f2 }
            r1 = r32
            r0 = r18
            int r1 = r1.getHighBwRiskConfPct(r0)     // Catch:{ all -> 0x02f2 }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r8 = r10.A01     // Catch:{ all -> 0x02f2 }
            r13 = 0
            if (r8 == 0) goto L_0x0217
            float r12 = r8.getMinBandwidthMultiplier()     // Catch:{ all -> 0x02f2 }
            int r0 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0217
        L_0x0206:
            float r11 = r8.getMaxBandwidthMultiplier()     // Catch:{ all -> 0x02f2 }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x021d
        L_0x020e:
            X.AUF r0 = r8.abrSetting     // Catch:{ all -> 0x02f2 }
            float r9 = r0.bwWeightLimitForBWEDampening     // Catch:{ all -> 0x02f2 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0222
            goto L_0x0224
        L_0x0217:
            r12 = 1050253722(0x3e99999a, float:0.3)
            if (r8 == 0) goto L_0x021d
            goto L_0x0206
        L_0x021d:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x0222
            goto L_0x020e
        L_0x0222:
            r9 = 1145569280(0x44480000, float:800.0)
        L_0x0224:
            r14 = 1
            if (r1 <= 0) goto L_0x0266
            r0 = 100
            if (r1 >= r0) goto L_0x0266
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0266
            r0 = 50
            if (r1 >= r0) goto L_0x0236
            r14 = -1
            int r1 = 100 - r1
        L_0x0236:
            float r15 = (float) r14     // Catch:{ all -> 0x02f2 }
            java.util.Map r0 = com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.A08     // Catch:{ all -> 0x02f2 }
            java.lang.Object r0 = X.C36371kC.A0r(r0, r1)     // Catch:{ all -> 0x02f2 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x02f2 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x02f2 }
            float r15 = r15 * r0
            long r0 = r10.A03     // Catch:{ all -> 0x02f2 }
            float r14 = (float) r0     // Catch:{ all -> 0x02f2 }
            float r15 = r15 * r14
            float r14 = (float) r3     // Catch:{ all -> 0x02f2 }
            float r15 = r15 / r14
            r4 = 1065353216(0x3f800000, float:1.0)
            float r15 = r4 - r15
            long r0 = r10.A04     // Catch:{ all -> 0x02f2 }
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x025b
            float r3 = (float) r0     // Catch:{ all -> 0x02f2 }
            float r3 = r3 / r9
            float r4 = r4 - r3
            float r13 = java.lang.Math.max(r4, r13)     // Catch:{ all -> 0x02f2 }
        L_0x025b:
            float r15 = r15 - r13
            float r0 = java.lang.Math.max(r15, r12)     // Catch:{ all -> 0x02f2 }
            float r0 = java.lang.Math.min(r0, r11)     // Catch:{ all -> 0x02f2 }
            float r14 = r14 * r0
            long r3 = (long) r14     // Catch:{ all -> 0x02f2 }
        L_0x0266:
            r1 = r32
            r0 = r18
            int r0 = r1.getHighBwRiskConfPct(r0)     // Catch:{ all -> 0x02f2 }
            r13 = 0
            if (r8 == 0) goto L_0x028a
            float r12 = r8.getMaxTTFBMultiplier()     // Catch:{ all -> 0x02f2 }
            int r1 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x028a
        L_0x0279:
            float r11 = r8.getMinTTFBMultiplier()     // Catch:{ all -> 0x02f2 }
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x028f
        L_0x0281:
            X.AUF r1 = r8.abrSetting     // Catch:{ all -> 0x02f2 }
            float r9 = r1.ttfbWeightLimitForBWEDampening     // Catch:{ all -> 0x02f2 }
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0294
            goto L_0x0296
        L_0x028a:
            r12 = 1077936128(0x40400000, float:3.0)
            if (r8 == 0) goto L_0x028f
            goto L_0x0279
        L_0x028f:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r8 == 0) goto L_0x0294
            goto L_0x0281
        L_0x0294:
            r9 = 1133903872(0x43960000, float:300.0)
        L_0x0296:
            r8 = 1
            if (r0 <= 0) goto L_0x02d7
            r1 = 100
            if (r0 >= r1) goto L_0x02d7
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x02d7
            r1 = 50
            if (r0 >= r1) goto L_0x02a8
            r8 = -1
            int r0 = 100 - r0
        L_0x02a8:
            float r8 = (float) r8     // Catch:{ all -> 0x02f2 }
            java.util.Map r1 = com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.A08     // Catch:{ all -> 0x02f2 }
            java.lang.Object r0 = X.C36371kC.A0r(r1, r0)     // Catch:{ all -> 0x02f2 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ all -> 0x02f2 }
            float r0 = r0.floatValue()     // Catch:{ all -> 0x02f2 }
            float r8 = r8 * r0
            long r0 = r10.A06     // Catch:{ all -> 0x02f2 }
            float r14 = (float) r0     // Catch:{ all -> 0x02f2 }
            float r8 = r8 * r14
            float r14 = (float) r6     // Catch:{ all -> 0x02f2 }
            float r8 = r8 / r14
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 + r7
            long r0 = r10.A07     // Catch:{ all -> 0x02f2 }
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x02cc
            float r6 = (float) r0     // Catch:{ all -> 0x02f2 }
            float r6 = r6 / r9
            float r7 = r7 - r6
            float r13 = java.lang.Math.max(r7, r13)     // Catch:{ all -> 0x02f2 }
        L_0x02cc:
            float r8 = r8 + r13
            float r0 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x02f2 }
            float r0 = java.lang.Math.max(r0, r11)     // Catch:{ all -> 0x02f2 }
            float r14 = r14 * r0
            long r6 = (long) r14     // Catch:{ all -> 0x02f2 }
        L_0x02d7:
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x02e1
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e1
            monitor-enter(r19)     // Catch:{ all -> 0x02f2 }
            monitor-exit(r19)     // Catch:{ all -> 0x02f2 }
        L_0x02e1:
            X.C196289Yq.A00()     // Catch:{ all -> 0x02f7 }
            monitor-exit(r5)
            goto L_0x007a
        L_0x02e7:
            int r8 = r2.A02
            goto L_0x003f
        L_0x02eb:
            r0 = move-exception
            goto L_0x02ef
        L_0x02ed:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x02f0 }
        L_0x02ef:
            throw r0     // Catch:{ all -> 0x02f0 }
        L_0x02f0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02f2 }
        L_0x02f2:
            r0 = move-exception
            X.C196289Yq.A00()     // Catch:{ all -> 0x02f7 }
            throw r0     // Catch:{ all -> 0x02f7 }
        L_0x02f7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1D.A00(boolean):void");
    }
}
