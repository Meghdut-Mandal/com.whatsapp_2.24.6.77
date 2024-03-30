package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.Map;

/* renamed from: X.89G  reason: invalid class name */
public class AnonymousClass89G extends AnonymousClass9YW {
    public final VpsEventCallback A00;
    public final C201619jy A01;
    public final AUR A02;
    public final C196079Xo A03;
    public final B5W A04;
    public final C1896394p A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public AnonymousClass89G(C196079Xo r8, AnonymousClass5SY r9, VpsEventCallback vpsEventCallback, B5W b5w, C201619jy r12, C207169uf r13, AUR aur, C1896394p r15, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(r9, r13, str, str2, false);
        this.A02 = aur;
        this.A01 = r12;
        this.A04 = b5w;
        this.A00 = vpsEventCallback;
        this.A05 = r15;
        this.A08 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A03 = r8;
    }

    public static void A00(AnonymousClass89G r4) {
        VpsEventCallback vpsEventCallback;
        C207169uf r0;
        C207239um r02;
        String str;
        if (r4.A02.isVideoQplPipelineEnabled && (vpsEventCallback = r4.A00) != null && (r0 = r4.A01) != null && (r02 = r0.A0D) != null && (str = r02.A0H) != null) {
            vpsEventCallback.B2I(new AnonymousClass898(str, true));
        }
    }

    public static boolean A01(Map map) {
        if (!map.containsKey("update_prefetch_priority") || C165587tf.A06("update_prefetch_priority", map) == 0) {
            return false;
        }
        return true;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0440 A[Catch:{ Exception -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0445 A[Catch:{ Exception -> 0x04ae }] */
    public void A03() {
        /*
            r66 = this;
            r4 = r66
            X.AUR r0 = r4.A02
            boolean r0 = r0.isVideoQplPipelineEnabled
            if (r0 == 0) goto L_0x0016
            com.facebook.exoplayer.monitor.VpsEventCallback r2 = r4.A00
            if (r2 == 0) goto L_0x0016
            X.9uf r1 = r4.A01
            X.89D r0 = new X.89D
            r0.<init>((X.C207169uf) r1)
            r2.B2I(r0)
        L_0x0016:
            X.9jy r3 = r4.A01
            X.9uf r2 = r4.A01
            X.B5W r0 = r4.A04
            r49 = r0
            com.facebook.exoplayer.monitor.VpsEventCallback r0 = r4.A00
            r26 = r0
            X.94p r0 = r4.A05
            r25 = r0
            r27 = 0
            int r1 = r2.A02     // Catch:{ Exception -> 0x04ae }
            long r6 = (long) r1     // Catch:{ Exception -> 0x04ae }
            int r0 = r3.A01     // Catch:{ Exception -> 0x04ae }
            long r4 = (long) r0     // Catch:{ Exception -> 0x04ae }
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x005f
            java.lang.String r6 = "CacheManager_default"
            java.lang.Object[] r5 = X.C36441kJ.A1Q()     // Catch:{ Exception -> 0x04ae }
            r1 = 0
            X.9um r0 = r2.A0D     // Catch:{ Exception -> 0x04ae }
            android.net.Uri r0 = r0.A05     // Catch:{ Exception -> 0x04ae }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04ae }
        L_0x0043:
            r5[r1] = r0     // Catch:{ Exception -> 0x04ae }
            r1 = 1
            int r0 = r2.A02     // Catch:{ Exception -> 0x04ae }
            X.AnonymousClass000.A1L(r5, r0, r1)     // Catch:{ Exception -> 0x04ae }
            r4 = 2
            int r0 = r3.A01     // Catch:{ Exception -> 0x04ae }
            long r0 = (long) r0     // Catch:{ Exception -> 0x04ae }
            X.AnonymousClass000.A1M(r5, r4, r0)     // Catch:{ Exception -> 0x04ae }
            java.lang.String r0 = "Attempting to prefetch more bytes than the prefetch size %s %d %d"
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ Exception -> 0x04ae }
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x04ae }
            goto L_0x0480
        L_0x005d:
            r0 = 0
            goto L_0x0043
        L_0x005f:
            r14 = 0
            if (r1 == 0) goto L_0x0480
            java.lang.String r0 = r2.A0F     // Catch:{ Exception -> 0x04ae }
            r22 = r0
            X.9um r8 = r2.A0D     // Catch:{ Exception -> 0x04ae }
            java.lang.String r7 = r8.A0H     // Catch:{ Exception -> 0x04ae }
            android.net.Uri r9 = r8.A05     // Catch:{ Exception -> 0x04ae }
            X.AUR r4 = r3.A0C     // Catch:{ Exception -> 0x04ae }
            X.AUF r0 = r4.abrSetting     // Catch:{ Exception -> 0x04ae }
            boolean r6 = r0.hashUrlForUnique     // Catch:{ Exception -> 0x04ae }
            boolean r5 = r4.useShortKey     // Catch:{ Exception -> 0x04ae }
            boolean r0 = r2.A0S     // Catch:{ Exception -> 0x04ae }
            r24 = r0
            boolean r1 = r4.splitLastSegmentCachekey     // Catch:{ Exception -> 0x04ae }
            boolean r0 = r4.skipThumbnailCacheKey     // Catch:{ Exception -> 0x04ae }
            r28 = r9
            r29 = r22
            r30 = r7
            r31 = r6
            r32 = r5
            r33 = r24
            r34 = r1
            r35 = r0
            java.lang.String r6 = X.C131916Rh.A00(r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ Exception -> 0x04ae }
            boolean r0 = r4.skipPrefetchInCacheManager     // Catch:{ Exception -> 0x04ae }
            r13 = 2
            r5 = 0
            r12 = 1
            if (r0 == 0) goto L_0x00a7
            java.util.Map r1 = r3.A0D     // Catch:{ Exception -> 0x04ae }
            monitor-enter(r1)     // Catch:{ Exception -> 0x04ae }
            boolean r0 = r1.containsKey(r6)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x00a7
            goto L_0x0119
        L_0x00a3:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a3 }
            goto L_0x047f
        L_0x00a7:
            int r1 = r2.A02     // Catch:{ Exception -> 0x04ae }
            X.A0T r21 = new X.A0T     // Catch:{ Exception -> 0x04ae }
            r0 = r21
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x04ae }
            X.B5Y r11 = r3.A03()     // Catch:{ Exception -> 0x04ae }
            X.904 r20 = X.AnonymousClass904.A05     // Catch:{ Exception -> 0x04ae }
            r23 = r20
            int r0 = r2.A04     // Catch:{ Exception -> 0x04ae }
            if (r0 != r12) goto L_0x00bf
            X.904 r20 = X.AnonymousClass904.A01     // Catch:{ Exception -> 0x04ae }
            goto L_0x00c3
        L_0x00bf:
            if (r0 != r13) goto L_0x00c3
            X.904 r20 = X.AnonymousClass904.A03     // Catch:{ Exception -> 0x04ae }
        L_0x00c3:
            r10 = 3
            if (r11 == 0) goto L_0x0130
            boolean r0 = r4.skipPrefetchInCacheManager     // Catch:{ Exception -> 0x04ae }
            if (r0 == 0) goto L_0x012b
            boolean r0 = r4.enableCacheLookUp     // Catch:{ Exception -> 0x04ae }
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r4.usePerVideoLookupToCheckCache     // Catch:{ Exception -> 0x04ae }
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r3.A07(r7)     // Catch:{ Exception -> 0x04ae }
            goto L_0x00fb
        L_0x00d7:
            boolean r9 = r4.useIsCachedSkipInit     // Catch:{ Exception -> 0x04ae }
            long r0 = r2.A07     // Catch:{ Exception -> 0x04ae }
            r16 = r0
            int r0 = r2.A02     // Catch:{ Exception -> 0x04ae }
            long r0 = (long) r0     // Catch:{ Exception -> 0x04ae }
            if (r9 == 0) goto L_0x00ef
            r28 = r11
            r29 = r6
            r30 = r16
            r32 = r0
            boolean r0 = r28.BLI(r29, r30, r32)     // Catch:{ Exception -> 0x04ae }
            goto L_0x00fb
        L_0x00ef:
            r28 = r11
            r29 = r6
            r30 = r16
            r32 = r0
            boolean r0 = r28.BLH(r29, r30, r32)     // Catch:{ Exception -> 0x04ae }
        L_0x00fb:
            if (r0 == 0) goto L_0x012b
            X.60H r3 = r3.A0A     // Catch:{ Exception -> 0x04ae }
            java.lang.String r1 = "Cache"
            X.89E r0 = new X.89E     // Catch:{ Exception -> 0x04ae }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x04ae }
            r3.A00(r0)     // Catch:{ Exception -> 0x04ae }
            java.lang.String r4 = "CacheManager_default"
            java.lang.String r3 = "prefetch request for Vid:%s with length:%d is skipped because it is already in cache %s"
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x04ae }
            r1[r5] = r7     // Catch:{ Exception -> 0x04ae }
            int r0 = r2.A02     // Catch:{ Exception -> 0x04ae }
            X.AnonymousClass000.A1L(r1, r0, r12)     // Catch:{ Exception -> 0x04ae }
            r1[r13] = r6     // Catch:{ Exception -> 0x04ae }
            goto L_0x0126
        L_0x0119:
            java.lang.String r4 = "CacheManager_default"
            java.lang.String r3 = "prefetch request for Vid:%s with length:%d is skipped because a prefetch request with the same vid is already in progress"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x04ae }
            r1[r5] = r7     // Catch:{ Exception -> 0x04ae }
            int r0 = r2.A02     // Catch:{ Exception -> 0x04ae }
            X.AnonymousClass000.A1L(r1, r0, r12)     // Catch:{ Exception -> 0x04ae }
        L_0x0126:
            X.C131916Rh.A01(r4, r3, r1)     // Catch:{ Exception -> 0x04ae }
            goto L_0x0480
        L_0x012b:
            r0 = r21
            r11.B0R(r0, r6)     // Catch:{ Exception -> 0x04ae }
        L_0x0130:
            if (r7 == 0) goto L_0x014a
            X.60H r9 = r3.A0A     // Catch:{ Exception -> 0x04ae }
            java.lang.String r1 = r20.toString()     // Catch:{ Exception -> 0x04ae }
            X.899 r0 = new X.899     // Catch:{ Exception -> 0x04ae }
            r0.<init>(r7, r1)     // Catch:{ Exception -> 0x04ae }
            r9.A00(r0)     // Catch:{ Exception -> 0x04ae }
            java.lang.String r1 = "Network"
            X.89E r0 = new X.89E     // Catch:{ Exception -> 0x04ae }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x04ae }
            r9.A00(r0)     // Catch:{ Exception -> 0x04ae }
        L_0x014a:
            java.lang.String r19 = "CacheManager_default"
            java.lang.String r9 = "Prefetch Vid:%s from %s, Format:%s, PrefetchLength:%d, RequestKey:%s, AugmentedKey: %s"
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x04ae }
            r0[r5] = r7     // Catch:{ Exception -> 0x04ae }
            java.lang.String r1 = r8.A0B     // Catch:{ Exception -> 0x04ae }
            r0[r12] = r1     // Catch:{ Exception -> 0x04ae }
            java.lang.Integer r11 = r8.A07     // Catch:{ Exception -> 0x04ae }
            java.lang.String r11 = X.C1895794j.A00(r11)     // Catch:{ Exception -> 0x04ae }
            r0[r13] = r11     // Catch:{ Exception -> 0x04ae }
            int r11 = r2.A02     // Catch:{ Exception -> 0x04ae }
            X.AnonymousClass000.A1L(r0, r11, r10)     // Catch:{ Exception -> 0x04ae }
            r18 = 4
            r0[r18] = r22     // Catch:{ Exception -> 0x04ae }
            r10 = 5
            r0[r10] = r6     // Catch:{ Exception -> 0x04ae }
            r10 = r19
            X.C131916Rh.A01(r10, r9, r0)     // Catch:{ Exception -> 0x04ae }
            boolean r0 = r2.A0K     // Catch:{ Exception -> 0x04ae }
            r36 = r0 ^ 1
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x04ae }
            r0.<init>(r5)     // Catch:{ Exception -> 0x04ae }
            java.lang.String r9 = r8.A0C     // Catch:{ Exception -> 0x04ae }
            r16 = r9
            X.5RZ r9 = r2.A0B     // Catch:{ Exception -> 0x04ae }
            r65 = r9
            X.8yO r13 = r8.A06     // Catch:{ Exception -> 0x04ae }
            boolean r12 = r8.A0M     // Catch:{ Exception -> 0x04ae }
            java.lang.String r11 = r2.A0P     // Catch:{ Exception -> 0x04ae }
            java.lang.String r10 = r2.A0O     // Catch:{ Exception -> 0x04ae }
            boolean r9 = r2.A0J     // Catch:{ Exception -> 0x04ae }
            X.9jQ r32 = new X.9jQ     // Catch:{ Exception -> 0x04ae }
            r37 = r32
            r38 = r65
            r39 = r13
            r40 = r7
            r41 = r1
            r42 = r16
            r43 = r11
            r44 = r10
            r45 = r0
            r46 = r12
            r47 = r24
            r48 = r9
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)     // Catch:{ Exception -> 0x04ae }
            r9 = r20
            r1 = r23
            if (r9 != r1) goto L_0x01af
            r5 = 1
        L_0x01af:
            java.util.HashMap r34 = X.AnonymousClass001.A0J()     // Catch:{ Exception -> 0x04ae }
            X.9m3 r9 = r3.A0B     // Catch:{ Exception -> 0x04ae }
            r1 = 8
            int r37 = X.C202509m3.A00(r9, r1)     // Catch:{ Exception -> 0x04ae }
            r1 = 0
            int r38 = X.C202509m3.A00(r9, r1)     // Catch:{ Exception -> 0x04ae }
            r13 = 0
            r17 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x04ae }
            r1.<init>(r13)     // Catch:{ Exception -> 0x04ae }
            r11 = -1
            r10 = 1
            r1 = 6
            r39 = 1
            r41 = 0
            r28 = r3
            r29 = r26
            r30 = r49
            r31 = r20
            r33 = r25
            r35 = r0
            r40 = r5
            X.B5U r9 = r28.A02(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x04ae }
            X.9iO r16 = new X.9iO     // Catch:{ Exception -> 0x04ae }
            r0 = r16
            r0.<init>(r7, r10)     // Catch:{ Exception -> 0x04ae }
            int r0 = r2.A02     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            if (r0 > 0) goto L_0x01ee
            if (r0 != r11) goto L_0x0379
        L_0x01ee:
            boolean r5 = r4.enableHttpPriorityForPrefetch     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            if (r5 == 0) goto L_0x0215
            java.lang.Integer r5 = r2.A0E     // Catch:{ 83K -> 0x0450, IOException -> 0x0210, all -> 0x03a9 }
            int r11 = r5.intValue()     // Catch:{ 83K -> 0x0450, IOException -> 0x0210, all -> 0x03a9 }
            r10 = 7
            r5 = 8
            if (r11 == r1) goto L_0x020b
            if (r11 == r10) goto L_0x020b
            if (r11 == r5) goto L_0x0206
            X.8y6 r1 = X.C187558y6.A02     // Catch:{ 83K -> 0x0450, IOException -> 0x0210, all -> 0x03a9 }
            X.9jH r5 = r1.mHttpPriority     // Catch:{ 83K -> 0x0450, IOException -> 0x0210, all -> 0x03a9 }
            goto L_0x0219
        L_0x0206:
            X.8y6 r1 = X.C187558y6.A04     // Catch:{ 83K -> 0x0450, IOException -> 0x0210, all -> 0x03a9 }
            X.9jH r5 = r1.mHttpPriority     // Catch:{ 83K -> 0x0450, IOException -> 0x0210, all -> 0x03a9 }
            goto L_0x0219
        L_0x020b:
            X.8y6 r1 = X.C187558y6.A01     // Catch:{ 83K -> 0x0450, IOException -> 0x0210, all -> 0x03a9 }
            X.9jH r5 = r1.mHttpPriority     // Catch:{ 83K -> 0x0450, IOException -> 0x0210, all -> 0x03a9 }
            goto L_0x0219
        L_0x0210:
            r11 = move-exception
            r0 = 0
            goto L_0x03b3
        L_0x0215:
            X.8y6 r1 = X.C187558y6.A00     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            X.9jH r5 = r1.mHttpPriority     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
        L_0x0219:
            X.9lD r1 = X.C202189lD.A09     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            android.net.Uri r1 = r8.A05     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            r64 = r1
            long r10 = r2.A07     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            r57 = r10
            int r1 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x0229
            r10 = 0
        L_0x0229:
            int r1 = (r57 > r14 ? 1 : (r57 == r14 ? 0 : -1))
            if (r1 > 0) goto L_0x022f
            r57 = 0
        L_0x022f:
            long r0 = (long) r0     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            r62 = r0
            java.lang.String r12 = r2.A0H     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            int r0 = r2.A01     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            r61 = r0
            long r0 = (long) r0     // Catch:{ 83K -> 0x0450, IOException -> 0x03ae, all -> 0x03a9 }
            r59 = r0
            r0 = r20
            int r0 = r0.value     // Catch:{ 83K -> 0x0450, IOException -> 0x03a7, all -> 0x03a9 }
            r45 = -1
            java.lang.String r30 = ""
            r39 = -1
            r29 = r27
            r32 = r27
            r33 = r27
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 1
            r40 = -1
            r41 = -1
            r42 = -1
            r47 = -1
            r49 = -1
            r51 = -1
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            X.9em r23 = new X.9em     // Catch:{ 83K -> 0x0450, IOException -> 0x03a7, all -> 0x03a9 }
            r24 = r5
            r25 = r16
            r26 = r12
            r28 = r27
            r31 = r30
            r37 = r0
            r43 = r59
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r49, r51, r53, r54, r55, r56)     // Catch:{ 83K -> 0x0450, IOException -> 0x03a7, all -> 0x03a9 }
            X.9lD r0 = new X.9lD     // Catch:{ 83K -> 0x0450, IOException -> 0x03a7, all -> 0x03a9 }
            r49 = r0
            r50 = r64
            r51 = r23
            r52 = r22
            r53 = r27
            r55 = r10
            r59 = r62
            r49.<init>(r50, r51, r52, r53, r54, r55, r57, r59)     // Catch:{ 83K -> 0x0450, IOException -> 0x03a7, all -> 0x03a9 }
            boolean r1 = r4.enableCDNDebugHeaders     // Catch:{ 83K -> 0x0450, IOException -> 0x03a7, all -> 0x03a9 }
            if (r1 == 0) goto L_0x02ce
            if (r7 == 0) goto L_0x029c
            java.lang.String r4 = "x-fb-abr-video-id"
            X.9em r1 = r0.A05     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            java.util.Map r1 = r1.A0N     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            r1.put(r4, r7)     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
        L_0x029c:
            java.lang.String r5 = "x-fb-abr-is-prefetch"
            java.lang.String r4 = "1"
            X.9em r1 = r0.A05     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            java.util.Map r1 = r1.A0N     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            r1.put(r5, r4)     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            if (r12 == 0) goto L_0x02ae
            java.lang.String r4 = "x-fb-abr-quality-label"
            r1.put(r4, r12)     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
        L_0x02ae:
            java.lang.String r5 = "x-fb-abr-bitrate"
            java.lang.String r4 = java.lang.Integer.toString(r61)     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            if (r4 == 0) goto L_0x02b9
            r1.put(r5, r4)     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
        L_0x02b9:
            java.lang.String r5 = "x-fb-abr-track-type"
            r4 = r20
            int r4 = r4.value     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            if (r4 == 0) goto L_0x02ce
            r1.put(r5, r4)     // Catch:{ 83K -> 0x0450, IOException -> 0x02c9, all -> 0x03a9 }
            goto L_0x02ce
        L_0x02c9:
            r11 = move-exception
            r0 = 0
            goto L_0x03b3
        L_0x02ce:
            java.util.Map r1 = r3.A0E     // Catch:{ 83K -> 0x0450, IOException -> 0x03a7, all -> 0x03a9 }
            r23 = r1
            boolean r1 = A01(r23)     // Catch:{ 83K -> 0x0450, IOException -> 0x03a7, all -> 0x03a9 }
            if (r1 == 0) goto L_0x02e5
            if (r6 == 0) goto L_0x02e5
            java.util.Map r1 = r3.A0D     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
            monitor-enter(r1)     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
            r1.put(r6, r9)     // Catch:{ all -> 0x02e2 }
            monitor-exit(r1)     // Catch:{ all -> 0x02e2 }
            goto L_0x02e5
        L_0x02e2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02e2 }
            throw r0     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
        L_0x02e5:
            long r0 = r9.Bks(r0)     // Catch:{ 83K -> 0x0450, IOException -> 0x03b0, all -> 0x03a9 }
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x02fb
            int r5 = r2.A02     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
            if (r5 <= 0) goto L_0x02f9
            int r4 = (int) r0     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
            int r4 = java.lang.Math.min(r5, r4)     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
        L_0x02f6:
            r2.A02 = r4     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
            goto L_0x02fb
        L_0x02f9:
            int r4 = (int) r0     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
            goto L_0x02f6
        L_0x02fb:
            int r10 = r2.A02     // Catch:{ 83K -> 0x0450, IOException -> 0x03b0, all -> 0x03a9 }
            long r4 = (long) r10     // Catch:{ 83K -> 0x0450, IOException -> 0x03b0, all -> 0x03a9 }
            int r0 = r3.A01     // Catch:{ 83K -> 0x0450, IOException -> 0x03b0, all -> 0x03a9 }
            long r0 = (long) r0     // Catch:{ 83K -> 0x0450, IOException -> 0x03b0, all -> 0x03a9 }
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0337
            java.lang.String r5 = "Attempting to completed unbounded prefetch with more bytes than the prefetch size %s %d %d"
            java.lang.Object[] r4 = X.C36441kJ.A1Q()     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            android.net.Uri r0 = r8.A05     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            if (r0 == 0) goto L_0x0319
            java.lang.String r17 = r0.toString()     // Catch:{ 83K -> 0x0450, IOException -> 0x0314, all -> 0x03a9 }
            goto L_0x0319
        L_0x0314:
            r11 = move-exception
            r0 = 0
            goto L_0x03b3
        L_0x0319:
            r4[r13] = r17     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            int r1 = r2.A02     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            r0 = 1
            X.AnonymousClass000.A1L(r4, r1, r0)     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            int r0 = r3.A01     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            long r0 = (long) r0     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            X.C36361kB.A1W(r4, r0)     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            java.lang.String r1 = java.lang.String.format(r5, r4)     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            r0 = r19
            android.util.Log.e(r0, r1)     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            java.lang.String r0 = "Attempting to cache amount greater than CacheSize"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            throw r0     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
        L_0x0337:
            if (r10 <= 0) goto L_0x0379
            r10 = 65536(0x10000, float:9.18355E-41)
            byte[] r11 = new byte[r10]     // Catch:{ 83K -> 0x0450, IOException -> 0x0375, all -> 0x03a9 }
            r0 = 0
        L_0x033f:
            int r12 = r2.A02     // Catch:{ 83K -> 0x0359, IOException -> 0x0357 }
            long r4 = (long) r12     // Catch:{ 83K -> 0x0359, IOException -> 0x0357 }
            int r16 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x037b
            int r4 = (int) r0     // Catch:{ 83K -> 0x0359, IOException -> 0x0357 }
            int r12 = r12 - r4
            int r4 = java.lang.Math.min(r10, r12)     // Catch:{ 83K -> 0x0359, IOException -> 0x0357 }
            int r4 = r9.read(r11, r13, r4)     // Catch:{ 83K -> 0x0359, IOException -> 0x0357 }
            long r4 = (long) r4     // Catch:{ 83K -> 0x0359, IOException -> 0x0357 }
            int r12 = (r4 > r45 ? 1 : (r4 == r45 ? 0 : -1))
            if (r12 == 0) goto L_0x037b
            long r0 = r0 + r4
            goto L_0x033f
        L_0x0357:
            r11 = move-exception
            goto L_0x03b3
        L_0x0359:
            r5 = move-exception
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0453
            r9.close()     // Catch:{ Exception -> 0x04ae }
            boolean r4 = A01(r23)     // Catch:{ Exception -> 0x04ae }
            if (r4 == 0) goto L_0x03ee
            if (r6 == 0) goto L_0x03ee
            java.util.Map r4 = r3.A0D     // Catch:{ Exception -> 0x04ae }
            monitor-enter(r4)     // Catch:{ Exception -> 0x04ae }
            r4.remove(r6)     // Catch:{ all -> 0x0371 }
            monitor-exit(r4)     // Catch:{ all -> 0x0371 }
            goto L_0x03ee
        L_0x0371:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0371 }
            goto L_0x047f
        L_0x0375:
            r11 = move-exception
            r0 = 0
            goto L_0x03b3
        L_0x0379:
            r0 = 0
        L_0x037b:
            r9.close()     // Catch:{ Exception -> 0x04ae }
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x0391
            X.B5Y r4 = r3.A03()     // Catch:{ Exception -> 0x04ae }
            if (r4 == 0) goto L_0x0391
            X.B5Y r5 = r3.A03()     // Catch:{ Exception -> 0x04ae }
            r4 = r21
            r5.Bnn(r4, r6)     // Catch:{ Exception -> 0x04ae }
        L_0x0391:
            java.util.Map r4 = r3.A0E     // Catch:{ Exception -> 0x04ae }
            boolean r4 = A01(r4)     // Catch:{ Exception -> 0x04ae }
            if (r4 == 0) goto L_0x03ee
            if (r6 == 0) goto L_0x03ee
            java.util.Map r4 = r3.A0D     // Catch:{ Exception -> 0x04ae }
            monitor-enter(r4)     // Catch:{ Exception -> 0x04ae }
            r4.remove(r6)     // Catch:{ all -> 0x03a3 }
            monitor-exit(r4)     // Catch:{ all -> 0x03a3 }
            goto L_0x03ee
        L_0x03a3:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03a3 }
            goto L_0x047f
        L_0x03a7:
            r11 = move-exception
            goto L_0x03b1
        L_0x03a9:
            r5 = move-exception
            r0 = 0
            goto L_0x0455
        L_0x03ae:
            r11 = move-exception
            goto L_0x03b1
        L_0x03b0:
            r11 = move-exception
        L_0x03b1:
            r0 = 0
        L_0x03b3:
            java.lang.String r10 = "IO Exception prefetching CacheKey:%s, Read:%d"
            java.lang.Object[] r5 = X.C36411kG.A1b(r22)     // Catch:{ all -> 0x0454 }
            r4 = 1
            X.AnonymousClass000.A1M(r5, r4, r0)     // Catch:{ all -> 0x0454 }
            r4 = r19
            X.C165607th.A1L(r10, r4, r11, r5)     // Catch:{ all -> 0x0454 }
            r9.close()     // Catch:{ Exception -> 0x04ae }
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x03d8
            X.B5Y r4 = r3.A03()     // Catch:{ Exception -> 0x04ae }
            if (r4 == 0) goto L_0x03d8
            X.B5Y r5 = r3.A03()     // Catch:{ Exception -> 0x04ae }
            r4 = r21
            r5.Bnn(r4, r6)     // Catch:{ Exception -> 0x04ae }
        L_0x03d8:
            java.util.Map r4 = r3.A0E     // Catch:{ Exception -> 0x04ae }
            boolean r4 = A01(r4)     // Catch:{ Exception -> 0x04ae }
            if (r4 == 0) goto L_0x03ee
            if (r6 == 0) goto L_0x03ee
            java.util.Map r4 = r3.A0D     // Catch:{ Exception -> 0x04ae }
            monitor-enter(r4)     // Catch:{ Exception -> 0x04ae }
            r4.remove(r6)     // Catch:{ all -> 0x03ea }
            monitor-exit(r4)     // Catch:{ all -> 0x03ea }
            goto L_0x03ee
        L_0x03ea:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03ea }
            goto L_0x047f
        L_0x03ee:
            X.9jQ r5 = new X.9jQ     // Catch:{ Exception -> 0x04ae }
            r4 = r65
            r5.<init>(r4, r7)     // Catch:{ Exception -> 0x04ae }
            java.util.HashMap r32 = X.AnonymousClass001.A0J()     // Catch:{ Exception -> 0x04ae }
            X.904 r29 = X.AnonymousClass904.A03     // Catch:{ Exception -> 0x04ae }
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x04ae }
            r4.<init>(r13)     // Catch:{ Exception -> 0x04ae }
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ Exception -> 0x04ae }
            r10.<init>(r13)     // Catch:{ Exception -> 0x04ae }
            r28 = r27
            r31 = r27
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 1
            r26 = r3
            r30 = r5
            r33 = r4
            r26.A02(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ Exception -> 0x04ae }
            java.lang.String r11 = "Prefetched VideoId %s, PrefetchLength %d, total read %d, fetched length from network %d, CacheKey %s"
            r4 = 5
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04ae }
            r10[r13] = r7     // Catch:{ Exception -> 0x04ae }
            int r5 = r2.A02     // Catch:{ Exception -> 0x04ae }
            r4 = 1
            X.AnonymousClass000.A1L(r10, r5, r4)     // Catch:{ Exception -> 0x04ae }
            X.C36361kB.A1W(r10, r0)     // Catch:{ Exception -> 0x04ae }
            r4 = r21
            long r4 = r4.A00     // Catch:{ Exception -> 0x04ae }
            X.C165587tf.A1W(r10, r4)     // Catch:{ Exception -> 0x04ae }
            r10[r18] = r6     // Catch:{ Exception -> 0x04ae }
            r4 = r19
            X.C131916Rh.A01(r4, r11, r10)     // Catch:{ Exception -> 0x04ae }
            boolean r4 = r9 instanceof X.A0Z     // Catch:{ Exception -> 0x04ae }
            if (r4 == 0) goto L_0x0445
            X.A0Z r9 = (X.A0Z) r9     // Catch:{ Exception -> 0x04ae }
            long r4 = r9.A01     // Catch:{ Exception -> 0x04ae }
            goto L_0x0447
        L_0x0445:
            r4 = 0
        L_0x0447:
            int r6 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0492
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0492
            goto L_0x0483
        L_0x0450:
            r5 = move-exception
            r0 = 0
        L_0x0453:
            throw r5     // Catch:{ all -> 0x0454 }
        L_0x0454:
            r5 = move-exception
        L_0x0455:
            r9.close()     // Catch:{ Exception -> 0x04ae }
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x046b
            X.B5Y r0 = r3.A03()     // Catch:{ Exception -> 0x04ae }
            if (r0 == 0) goto L_0x046b
            X.B5Y r1 = r3.A03()     // Catch:{ Exception -> 0x04ae }
            r0 = r21
            r1.Bnn(r0, r6)     // Catch:{ Exception -> 0x04ae }
        L_0x046b:
            java.util.Map r0 = r3.A0E     // Catch:{ Exception -> 0x04ae }
            boolean r0 = A01(r0)     // Catch:{ Exception -> 0x04ae }
            if (r0 == 0) goto L_0x047f
            if (r6 == 0) goto L_0x047f
            java.util.Map r0 = r3.A0D     // Catch:{ Exception -> 0x04ae }
            monitor-enter(r0)     // Catch:{ Exception -> 0x04ae }
            r0.remove(r6)     // Catch:{ all -> 0x047d }
            monitor-exit(r0)     // Catch:{ all -> 0x047d }
            goto L_0x047f
        L_0x047d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x047d }
        L_0x047f:
            throw r5     // Catch:{ Exception -> 0x04ae }
        L_0x0480:
            r3 = 0
            goto L_0x04a6
        L_0x0483:
            java.lang.String r6 = "resourceLength of videoId %s is %d"
            java.lang.Object[] r1 = X.C36411kG.A1b(r7)     // Catch:{ Exception -> 0x04ae }
            r0 = 1
            X.AnonymousClass000.A1M(r1, r0, r4)     // Catch:{ Exception -> 0x04ae }
            r0 = r19
            X.C131916Rh.A01(r0, r6, r1)     // Catch:{ Exception -> 0x04ae }
        L_0x0492:
            X.60H r4 = r3.A0A     // Catch:{ Exception -> 0x04ae }
            java.lang.String r3 = r20.toString()     // Catch:{ Exception -> 0x04ae }
            java.lang.String r1 = r8.A0E     // Catch:{ Exception -> 0x04ae }
            X.89A r0 = new X.89A     // Catch:{ Exception -> 0x04ae }
            r0.<init>(r7, r3, r1)     // Catch:{ Exception -> 0x04ae }
            r4.A00(r0)     // Catch:{ Exception -> 0x04ae }
            r0 = r21
            long r3 = r0.A00     // Catch:{ Exception -> 0x04ae }
        L_0x04a6:
            X.6Nk r1 = X.C131026Nk.A01     // Catch:{ Exception -> 0x04ae }
            X.9um r0 = r2.A0D     // Catch:{ Exception -> 0x04ae }
            r1.A01(r0, r3)     // Catch:{ Exception -> 0x04ae }
            return
        L_0x04ae:
            r3 = move-exception
            java.lang.Object[] r2 = X.C90524aI.A0w()
            java.lang.String r1 = "VodUriPrefetchTask"
            java.lang.String r0 = "prefetch sync failed with exception"
            X.C165607th.A1L(r0, r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass89G.A03():void");
    }
}
