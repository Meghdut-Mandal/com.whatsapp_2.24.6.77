package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.common.GlobalPlayerStateMonitor;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9nm  reason: invalid class name and case insensitive filesystem */
public class C203319nm {
    public C22869AxO A00;
    public A18 A01;
    public final Context A02;
    public final AnonymousClass6LE A03;
    public final C201619jy A04;
    public final AnonymousClass9D2 A05;
    public final AnonymousClass9D4 A06;
    public final AUR A07;
    public final C1896394p A08;
    public final Object A09 = C36441kJ.A11();
    public final AnonymousClass94C A0A;
    public final C202509m3 A0B;
    public final Map A0C;
    public final Map A0D;
    public final Queue A0E;
    public final AtomicReference A0F;
    public final AtomicReference A0G;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: X.9Xo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: X.9JE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: X.92f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: X.9GZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: X.92j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: X.9GZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: X.9Xo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: X.9Xo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: X.9Xo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: X.9Xo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: X.9Xo} */
    /* JADX WARNING: type inference failed for: r29v0, types: [X.92j, X.9uf, X.B3i] */
    /* JADX WARNING: type inference failed for: r30v4, types: [X.Avk] */
    /* JADX WARNING: type inference failed for: r2v36, types: [X.AxO] */
    /* JADX WARNING: type inference failed for: r2v63, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r27v12, types: [X.A18] */
    /* JADX WARNING: type inference failed for: r27v13, types: [X.A17] */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0308, code lost:
        r19 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0537, code lost:
        if (r5.contains(r12) != false) goto L_0x0539;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x070d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:469:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.facebook.exoplayer.monitor.VpsEventCallback r70, X.C207169uf r71, X.C203319nm r72) {
        /*
            r7 = 0
            r3 = r71
            X.9um r9 = r3.A0D     // Catch:{ 91X -> 0x07b2 }
            if (r9 == 0) goto L_0x0009
            java.lang.String r7 = r9.A0H     // Catch:{ 91X -> 0x07b2 }
        L_0x0009:
            r1 = r72
            X.AUR r0 = r1.A07     // Catch:{ 91X -> 0x07b2 }
            boolean r6 = r0.parseManifestIdentifier     // Catch:{ 91X -> 0x07b2 }
            boolean r4 = r0.enableDashManifestPool     // Catch:{ 91X -> 0x07b2 }
            int r2 = r0.dashManifestPoolSize     // Catch:{ 91X -> 0x07b2 }
            X.Av0 r5 = new X.Av0     // Catch:{ 91X -> 0x07b2 }
            r5.<init>(r7, r2, r6, r4)     // Catch:{ 91X -> 0x07b2 }
            android.net.Uri r4 = r9.A05     // Catch:{ 91X -> 0x07b2 }
            java.lang.String r2 = r9.A0A     // Catch:{ 91X -> 0x07b2 }
            X.9XZ r4 = X.AnonymousClass9Z1.A01(r4, r5, r2)     // Catch:{ 91X -> 0x07b2 }
            if (r4 == 0) goto L_0x07bd
            java.lang.String r2 = r9.A0H
            r20 = r2
            r72 = r70
            X.9D4 r7 = r1.A06     // Catch:{ 924 -> 0x003c }
            boolean r6 = r0.proxyDrmProvisioningRequests     // Catch:{ 924 -> 0x003c }
            boolean r5 = r0.enableDrmProvisioningRetry     // Catch:{ 924 -> 0x003c }
            boolean r2 = r0.removeGifPrefixForDRMKeyRequest     // Catch:{ 924 -> 0x003c }
            r10 = r4
            r11 = r7
            r12 = r20
            r13 = r6
            r14 = r5
            r15 = r2
            X.9gf r24 = X.C200589hg.A00(r10, r11, r12, r13, r14, r15)     // Catch:{ 924 -> 0x003c }
            goto L_0x0060
        L_0x003c:
            r6 = move-exception
            java.lang.String r8 = "DRM"
            java.lang.String r7 = "CANT_INITIALIZE_DRM_WITH_MANIFEST"
            java.lang.String r2 = "Device: "
            java.lang.StringBuilder r5 = X.C90524aI.A0i(r2)
            java.lang.String r2 = android.os.Build.MODEL
            r5.append(r2)
            java.lang.String r2 = "; Exception: "
            java.lang.String r6 = X.C36331k8.A0i(r2, r5, r6)
            X.89B r5 = new X.89B
            r2 = r20
            r5.<init>(r2, r8, r7, r6)
            r2 = r72
            r2.B2I(r5)
            r24 = 0
        L_0x0060:
            X.AUF r2 = r0.abrSetting
            boolean r2 = r2.shouldFilterHardwareCapabilities
            if (r2 == 0) goto L_0x00d6
            android.content.Context r14 = r1.A02
        L_0x0068:
            boolean r13 = r0.prefetchBypassFilter
            X.B4Y r26 = X.B4Y.A00
            boolean r15 = r0.ignoreEmptyProfileLevels
            X.9RK r12 = new X.9RK
            r2 = r72
            r12.<init>(r2, r3, r1)
            boolean r2 = r0.enableMixedCodecManifestSupport
            if (r2 == 0) goto L_0x011d
            r19 = 0
            java.util.List r2 = r4.A0A
            r39 = r2
            int r2 = r39.size()
            r11 = 1
            if (r2 < r11) goto L_0x07bd
            r10 = 0
            r2 = r39
            X.9RE r2 = X.C165617ti.A0B(r2, r10)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.List r2 = r2.A01
            java.util.Iterator r16 = r2.iterator()
        L_0x009b:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x00d8
            java.lang.Object r6 = r16.next()
            X.9O1 r6 = (X.AnonymousClass9O1) r6
            int r5 = r6.A00
            if (r5 == r11) goto L_0x00c2
            r2 = 2
            if (r5 != r2) goto L_0x009b
            java.util.List r2 = r6.A05
            java.util.Iterator r5 = r2.iterator()
        L_0x00b4:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x009b
            java.lang.Object r2 = r5.next()
            r8.add(r2)
            goto L_0x00b4
        L_0x00c2:
            java.util.List r2 = r6.A05
            java.util.Iterator r5 = r2.iterator()
        L_0x00c8:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x009b
            java.lang.Object r2 = r5.next()
            r7.add(r2)
            goto L_0x00c8
        L_0x00d6:
            r14 = 0
            goto L_0x0068
        L_0x00d8:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x0108
            if (r13 != 0) goto L_0x0108
            if (r14 == 0) goto L_0x0108
            r25 = r14
            r27 = r4
            r28 = r12
            r29 = r8
            r30 = r15
            int[] r11 = A06(r25, r26, r27, r28, r29, r30)
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            if (r11 == 0) goto L_0x0107
            int r5 = r11.length
            if (r5 <= 0) goto L_0x0107
        L_0x00f9:
            r2 = r11[r10]
            java.lang.Object r2 = r8.get(r2)
            r6.add(r2)
            int r10 = r10 + 1
            if (r10 >= r5) goto L_0x0107
            goto L_0x00f9
        L_0x0107:
            r8 = r6
        L_0x0108:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0110
            r8 = r19
        L_0x0110:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x0118
            r7 = r19
        L_0x0118:
            if (r8 != 0) goto L_0x01af
            if (r7 != 0) goto L_0x01af
            return
        L_0x011d:
            r19 = 0
            java.util.List r2 = r4.A0A
            r39 = r2
            int r2 = r39.size()
            r11 = 1
            if (r2 < r11) goto L_0x07bd
            r10 = 0
            r2 = r39
            X.9RE r2 = X.C165617ti.A0B(r2, r10)
            java.util.List r2 = r2.A01
            java.util.Iterator r16 = r2.iterator()
            r8 = r19
            r7 = r8
        L_0x013a:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0155
            java.lang.Object r6 = r16.next()
            X.9O1 r6 = (X.AnonymousClass9O1) r6
            int r5 = r6.A00
            if (r5 == r11) goto L_0x0151
            r2 = 2
            if (r5 != r2) goto L_0x013a
            if (r8 != 0) goto L_0x013a
            r8 = r6
            goto L_0x013a
        L_0x0151:
            if (r7 != 0) goto L_0x013a
            r7 = r6
            goto L_0x013a
        L_0x0155:
            if (r8 == 0) goto L_0x018a
            java.util.List r5 = r8.A05
            if (r5 == 0) goto L_0x018a
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x018a
            if (r13 != 0) goto L_0x018d
            if (r14 == 0) goto L_0x018d
            r25 = r14
            r27 = r4
            r28 = r12
            r29 = r5
            r30 = r15
            int[] r8 = A06(r25, r26, r27, r28, r29, r30)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            if (r8 == 0) goto L_0x018e
            int r6 = r8.length
            if (r6 <= 0) goto L_0x018e
        L_0x017c:
            r2 = r8[r10]
            java.lang.Object r2 = r5.get(r2)
            r11.add(r2)
            int r10 = r10 + 1
            if (r10 >= r6) goto L_0x018e
            goto L_0x017c
        L_0x018a:
            r11 = r19
            goto L_0x018e
        L_0x018d:
            r11 = r5
        L_0x018e:
            if (r7 == 0) goto L_0x019a
            java.util.List r5 = r7.A05
            if (r5 == 0) goto L_0x019a
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x019c
        L_0x019a:
            r5 = r19
        L_0x019c:
            if (r11 == 0) goto L_0x01a6
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x01a9
            r11 = r19
        L_0x01a6:
            if (r5 != 0) goto L_0x01a9
            return
        L_0x01a9:
            X.9Gv r2 = new X.9Gv
            r2.<init>(r11, r5)
            goto L_0x01b4
        L_0x01af:
            X.9Gv r2 = new X.9Gv
            r2.<init>(r8, r7)
        L_0x01b4:
            java.util.List r5 = r2.A01
            r21 = r5
            if (r5 == 0) goto L_0x01c0
            boolean r5 = r21.isEmpty()
            if (r5 == 0) goto L_0x01e8
        L_0x01c0:
            boolean r5 = r0.enableProgressivePrefetchWhenNoRepresentations
            if (r5 == 0) goto L_0x01e8
            java.lang.String r4 = "UnifiedPrefetchManager"
            java.lang.Object[] r2 = X.AnonymousClass000.A1b(r20)
            java.lang.String r0 = "video: %s has no valid video rep. Falling back to progressive"
            X.C131916Rh.A01(r4, r0, r2)
            java.lang.Integer r0 = X.C023109s.A0C
            r9.A07 = r0
            X.B5W r0 = r3.A0A
            r12 = 0
            X.5SY r6 = X.AnonymousClass5SY.HIGH
            r11 = r19
            r13 = 0
            r14 = 0
            r4 = r1
            r5 = r11
            r7 = r72
            r8 = r0
            r9 = r3
            r10 = r20
            r4.A09(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x01e8:
            boolean r5 = r0.getPlaybackPrefFromPrefetchRequest
            X.9XE r6 = new X.9XE
            r6.<init>()
            boolean r10 = r9.A0O
            if (r5 == 0) goto L_0x0213
            r6.A00(r10)
            if (r20 == 0) goto L_0x01fa
            monitor-enter(r6)
            monitor-exit(r6)
        L_0x01fa:
            boolean r5 = r9.A0P
            monitor-enter(r6)
            r6.A05 = r5     // Catch:{ all -> 0x07af }
            monitor-exit(r6)
            java.lang.String r5 = r9.A0B
            if (r5 == 0) goto L_0x0208
            monitor-enter(r6)
            r6.A00 = r5     // Catch:{ all -> 0x07af }
            monitor-exit(r6)
        L_0x0208:
            java.lang.String r5 = r9.A0C
            if (r5 == 0) goto L_0x0210
            monitor-enter(r6)
            r6.A01 = r5     // Catch:{ all -> 0x07af }
            monitor-exit(r6)
        L_0x0210:
            android.net.Uri r5 = r9.A05
            goto L_0x0218
        L_0x0213:
            r6.A00(r10)
            android.net.Uri r5 = r9.A05
        L_0x0218:
            if (r5 == 0) goto L_0x021f
            r5.getHost()
            monitor-enter(r6)
            monitor-exit(r6)
        L_0x021f:
            int r13 = r3.A04
            X.904[] r12 = X.AnonymousClass904.values()
            int r11 = r12.length
            r8 = 0
        L_0x0227:
            if (r8 >= r11) goto L_0x0232
            r7 = r12[r8]
            int r5 = r7.value
            if (r5 == r13) goto L_0x0234
            int r8 = r8 + 1
            goto L_0x0227
        L_0x0232:
            X.904 r7 = X.AnonymousClass904.UNKNOWN
        L_0x0234:
            X.904 r5 = X.AnonymousClass904.DASH_VIDEO
            if (r7 == r5) goto L_0x0240
            X.904 r5 = X.AnonymousClass904.PROGRESSIVE
            if (r7 == r5) goto L_0x0240
            X.904 r5 = X.AnonymousClass904.LIVE_VIDEO
            if (r7 != r5) goto L_0x0242
        L_0x0240:
            monitor-enter(r6)
            monitor-exit(r6)
        L_0x0242:
            boolean r5 = r3.A0S
            r51 = r5
            monitor-enter(r6)
            r6.A06 = r5     // Catch:{ all -> 0x07af }
            monitor-exit(r6)
            boolean r5 = r3.A0R
            r52 = r5
            monitor-enter(r6)
            r6.A03 = r5     // Catch:{ all -> 0x07af }
            monitor-exit(r6)
            boolean r5 = r3.A0Q
            r53 = r5
            r6.A02 = r5
            X.AUF r5 = r0.abrSetting
            r26 = 0
            r7 = 0
            r17 = 0
            r16 = 1
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r8 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration
            r31 = 0
            r32 = 1
            r27 = r8
            r28 = r5
            r29 = r19
            r30 = r6
            r27.<init>(r28, r29, r30, r31, r32)
            X.94p r5 = r1.A08
            X.A0B r11 = new X.A0B
            r11.<init>(r8, r5)
            java.util.List r13 = r2.A00
            X.6LE r5 = r1.A03
            java.util.LinkedList r2 = r5.A04
            monitor-enter(r2)
            r2.size()     // Catch:{ all -> 0x07ac }
            monitor-exit(r2)     // Catch:{ all -> 0x07ac }
            java.lang.String r12 = r9.A0B
            r38 = r12
            java.lang.String r12 = r9.A0C
            if (r21 == 0) goto L_0x03f6
            boolean r14 = r21.isEmpty()
            if (r14 != 0) goto L_0x03f6
            int r8 = r3.A02
            r37 = r8
            int r3 = r3.A03
            r36 = r3
            long r14 = r4.A01
            boolean r3 = r9.A0P
            r35 = r3
            boolean r3 = r9.A0J
            r34 = r3
            monitor-enter(r6)
            boolean r3 = r6.A06     // Catch:{ all -> 0x07af }
            r23 = r3
            monitor-exit(r6)
            X.9jy r3 = r1.A04
            r18 = r3
            r8 = 0
            if (r3 == 0) goto L_0x03b9
            X.B5Y r3 = r18.A03()
            if (r3 == 0) goto L_0x03b9
            X.AUF r3 = r0.abrSetting
            boolean r3 = r3.hashUrlForUnique
            r22 = r3
            X.5SY r28 = X.AnonymousClass5SY.NONE
            X.9YW r3 = new X.9YW
            r31 = r19
            r27 = r3
            r30 = r20
            r27.<init>(r28, r29, r30, r31, r32)
            X.69O r9 = new X.69O
            r9.<init>(r3, r7)
            monitor-enter(r2)
            java.util.HashSet r3 = r5.A03     // Catch:{ all -> 0x03b6 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x03b6 }
        L_0x02d6:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x03b6 }
            if (r3 == 0) goto L_0x02ec
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x03b6 }
            X.69O r5 = (X.AnonymousClass69O) r5     // Catch:{ all -> 0x03b6 }
            boolean r3 = r5.equals(r9)     // Catch:{ all -> 0x03b6 }
            if (r3 == 0) goto L_0x02d6
            X.9YW r3 = r5.A00     // Catch:{ all -> 0x03b6 }
            monitor-exit(r2)     // Catch:{ all -> 0x03b6 }
            goto L_0x0308
        L_0x02ec:
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x03b6 }
        L_0x02f0:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x03b6 }
            if (r3 == 0) goto L_0x0306
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x03b6 }
            X.69O r5 = (X.AnonymousClass69O) r5     // Catch:{ all -> 0x03b6 }
            boolean r3 = r5.equals(r9)     // Catch:{ all -> 0x03b6 }
            if (r3 == 0) goto L_0x02f0
            X.9YW r3 = r5.A00     // Catch:{ all -> 0x03b6 }
            monitor-exit(r2)     // Catch:{ all -> 0x03b6 }
            goto L_0x0308
        L_0x0306:
            monitor-exit(r2)     // Catch:{ all -> 0x03b6 }
            goto L_0x030c
        L_0x0308:
            java.lang.String r2 = r3.A02
            r19 = r2
        L_0x030c:
            java.util.Iterator r17 = r21.iterator()
        L_0x0310:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x03b9
            java.lang.Object r10 = r17.next()
            X.9Xo r10 = (X.C196079Xo) r10
            X.9uY r9 = r10.A00
            java.lang.String r3 = r9.A0Q
            r2 = r19
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x03a9
            boolean r2 = r10 instanceof X.C1690382z
            if (r2 == 0) goto L_0x0310
            r13 = r10
            X.82z r13 = (X.C1690382z) r13
            X.9WU r2 = r13.A01
            if (r2 == 0) goto L_0x0310
            java.lang.String r7 = r10.A02
            android.net.Uri r2 = A02(r2, r7)
            if (r2 == 0) goto L_0x0310
            X.9DA r2 = new X.9DA
            r2.<init>(r1)
            r24 = r1
            r25 = r10
            r27 = r72
            r28 = r20
            r29 = r38
            r30 = r37
            r31 = r36
            r32 = r35
            r33 = r34
            X.9Gx r2 = r24.A08(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r2 = r2.A01
            long r11 = (long) r2
            int r2 = r0.numMsToPrefetch
            double r5 = (double) r2
            double r2 = (double) r14
            int r16 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r16 <= 0) goto L_0x0363
            r11 = 100
        L_0x0363:
            X.A06 r5 = r13.A02
            X.9WU r2 = r10.A01
            if (r5 == 0) goto L_0x03a1
            if (r2 == 0) goto L_0x0310
            android.net.Uri r28 = A02(r2, r7)
            long r2 = r2.A01
            r27 = r18
            r29 = r20
            r30 = r2
            r32 = r22
            r33 = r23
            boolean r2 = r27.A06(r28, r29, r30, r32, r33)
            if (r2 == 0) goto L_0x0310
            long r2 = r5.BBu()
            X.9WU r2 = r5.BH9(r2)
            if (r2 == 0) goto L_0x03a9
            android.net.Uri r28 = A02(r2, r7)
        L_0x038f:
            r27 = r18
            r29 = r20
            r30 = r11
            r32 = r22
            r33 = r23
            boolean r2 = r27.A06(r28, r29, r30, r32, r33)
            if (r2 != 0) goto L_0x03a9
            goto L_0x0310
        L_0x03a1:
            android.net.Uri r28 = A02(r2, r7)
            if (r28 != 0) goto L_0x038f
            goto L_0x0310
        L_0x03a9:
            if (r8 == 0) goto L_0x03b3
            X.9uY r2 = r8.A00
            int r3 = r2.A04
            int r2 = r9.A04
            if (r3 >= r2) goto L_0x0310
        L_0x03b3:
            r8 = r10
            goto L_0x0310
        L_0x03b6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03b6 }
            throw r0
        L_0x03b9:
            X.A18 r0 = new X.A18
            r0.<init>()
            r1.A01 = r0
            r21.size()
            r1 = 0
        L_0x03c4:
            int r0 = r21.size()
            if (r1 >= r0) goto L_0x03d2
            r0 = r21
            r0.get(r1)
            int r1 = r1 + 1
            goto L_0x03c4
        L_0x03d2:
            r4.A01()
            r4.A00()
            int r0 = r39.size()
            if (r0 == 0) goto L_0x03ef
            java.lang.Object r2 = X.C36391kE.A0t(r39)
            X.9RE r2 = (X.AnonymousClass9RE) r2
            r0 = 2
            int r1 = r2.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x03ef
            X.AnonymousClass9RE.A00(r2, r1)
        L_0x03ef:
            java.lang.String r0 = "mFormat"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x03f6:
            if (r13 == 0) goto L_0x04dc
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x04dc
            monitor-enter(r6)
            boolean r2 = r6.A06     // Catch:{ all -> 0x07af }
            monitor-exit(r6)
            if (r2 != 0) goto L_0x04dc
            boolean r2 = r0.enableBitrateAwareAudioPrefetch
            if (r2 != 0) goto L_0x041a
            X.AUF r5 = r0.abrSetting
            boolean r2 = r5.enableAudioAbrEvaluator
            if (r2 != 0) goto L_0x041a
            boolean r2 = r5.enableAudioIbrEvaluator
            if (r2 != 0) goto L_0x041a
            java.lang.Object r2 = r13.get(r7)
            X.9Xo r2 = (X.C196079Xo) r2
            goto L_0x04de
        L_0x041a:
            X.AxO r2 = r1.A00
            if (r2 != 0) goto L_0x046e
            java.lang.Object r6 = r1.A09
            monitor-enter(r6)
            X.AxO r2 = r1.A00     // Catch:{ all -> 0x046b }
            if (r2 != 0) goto L_0x043f
            X.AUF r5 = r0.abrSetting     // Catch:{ all -> 0x046b }
            boolean r2 = r5.enableAudioAbrEvaluator     // Catch:{ all -> 0x046b }
            if (r2 == 0) goto L_0x0441
            X.9XE r30 = new X.9XE     // Catch:{ all -> 0x046b }
            r30.<init>()     // Catch:{ all -> 0x046b }
            X.A17 r2 = new X.A17     // Catch:{ all -> 0x046b }
            r31 = r19
            r27 = r2
            r28 = r11
            r32 = r5
            r27.<init>(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x046b }
        L_0x043d:
            r1.A00 = r2     // Catch:{ all -> 0x046b }
        L_0x043f:
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            goto L_0x046e
        L_0x0441:
            boolean r2 = r5.enableMultiAudioSupport     // Catch:{ all -> 0x046b }
            if (r2 != 0) goto L_0x0449
            boolean r2 = r5.enableAudioIbrEvaluator     // Catch:{ all -> 0x046b }
            if (r2 == 0) goto L_0x043f
        L_0x0449:
            android.content.Context r15 = r1.A02     // Catch:{ all -> 0x046b }
            X.A18 r14 = r1.A01     // Catch:{ all -> 0x046b }
            boolean r5 = r5.forceUpdateFormatListIfFormatSizeChanged     // Catch:{ all -> 0x046b }
            X.A18 r2 = new X.A18     // Catch:{ all -> 0x046b }
            r31 = r19
            r33 = r19
            r35 = r19
            r36 = r19
            r27 = r2
            r28 = r15
            r29 = r11
            r30 = r19
            r32 = r14
            r34 = r8
            r37 = r5
            r27.<init>((android.content.Context) r28, (X.C22774Avk) r29, (X.C22774Avk) r30, (X.AnonymousClass9JE) r31, (X.A18) r32, (X.AnonymousClass92f) r33, (com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration) r34, (X.AnonymousClass9GZ) r35, (X.C1891392j) r36, (boolean) r37)     // Catch:{ all -> 0x046b }
            goto L_0x043d
        L_0x046b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x046b }
            throw r0
        L_0x046e:
            X.AxO r15 = r1.A00
            r5 = 0
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L_0x04c0
            X.9uY[] r14 = new X.C207099uY[r7]
        L_0x0479:
            boolean r11 = r4.A01()
            android.util.Pair r8 = r4.A00()
            int r2 = r39.size()
            if (r2 == 0) goto L_0x0498
            java.lang.Object r6 = X.C36391kE.A0t(r39)
            X.9RE r6 = (X.AnonymousClass9RE) r6
            r2 = 2
            int r5 = r6.A01(r2)
            r2 = -1
            if (r5 == r2) goto L_0x0498
            X.AnonymousClass9RE.A00(r6, r5)
        L_0x0498:
            X.9GX r2 = new X.9GX
            r2.<init>(r8, r11)
            X.9uY r8 = r15.Bpc(r2, r14)
            if (r8 == 0) goto L_0x04d9
            java.util.Iterator r11 = r13.iterator()
        L_0x04a7:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x04d9
            java.lang.Object r2 = r11.next()
            X.9Xo r2 = (X.C196079Xo) r2
            X.9uY r5 = r2.A00
            java.lang.String r6 = r5.A0Q
            java.lang.String r5 = r8.A0Q
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x04a7
            goto L_0x04de
        L_0x04c0:
            int r2 = r13.size()
            X.9uY[] r14 = new X.C207099uY[r2]
        L_0x04c6:
            int r2 = r13.size()
            if (r5 >= r2) goto L_0x0479
            java.lang.Object r2 = r13.get(r5)
            X.9Xo r2 = (X.C196079Xo) r2
            X.9uY r2 = r2.A00
            r14[r5] = r2
            int r5 = r5 + 1
            goto L_0x04c6
        L_0x04d9:
            r2 = r19
            goto L_0x04de
        L_0x04dc:
            r2 = r19
        L_0x04de:
            X.9DA r5 = new X.9DA
            r5.<init>(r1)
            int r11 = r3.A02
            int r8 = r3.A03
            boolean r6 = r9.A0P
            boolean r5 = r9.A0J
            r27 = r1
            r28 = r19
            r29 = r2
            r30 = r72
            r31 = r20
            r32 = r38
            r33 = r11
            r34 = r8
            r35 = r6
            r36 = r5
            X.9Gx r9 = r27.A08(r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r11 = 0
            X.9Gx r8 = new X.9Gx
            r8.<init>(r7, r7)
            if (r2 == 0) goto L_0x050d
            r17 = 1
        L_0x050d:
            boolean r5 = r0.skipAudioPrefetch
            if (r5 == 0) goto L_0x0518
            boolean r5 = r3.A0I
            if (r5 != 0) goto L_0x0518
            if (r10 != 0) goto L_0x0518
            r11 = 1
        L_0x0518:
            r1.A05(r3)
            boolean r5 = r1.A05(r3)
            if (r5 == 0) goto L_0x0539
            if (r2 == 0) goto L_0x0539
            java.lang.String r6 = r0.prefetchSubOriginBlockList
            if (r6 == 0) goto L_0x0638
            java.lang.String r5 = ";"
            java.lang.String[] r5 = r6.split(r5)
            java.util.List r5 = java.util.Arrays.asList(r5)
            if (r12 == 0) goto L_0x0638
            boolean r5 = r5.contains(r12)
            if (r5 == 0) goto L_0x0638
        L_0x0539:
            boolean r5 = r0.prefetchAudioFirst
            if (r17 == 0) goto L_0x0709
            if (r11 != 0) goto L_0x0709
            long r5 = r4.A01
            int r7 = (int) r5
            r71 = r7
            int r5 = r9.A00
            r25 = r5
            boolean r5 = r4.A0E
            r70 = r5
            boolean r5 = r4.A0F
            r69 = r5
            boolean r4 = r4.A0B
            r68 = r4
            int r4 = r8.A00
            long r4 = (long) r4
            r66 = r4
            X.9um r5 = r3.A0D
            java.lang.String r4 = r5.A0B
            r23 = r4
            java.lang.String r4 = r5.A0C
            r65 = r4
            java.lang.String r4 = r5.A0D
            r64 = r4
            java.lang.String r4 = r5.A0H
            r22 = r4
            if (r4 == 0) goto L_0x0709
            boolean r4 = r5.A0O
            r63 = r4
            boolean r4 = r5.A0P
            r62 = r4
            java.lang.Integer r4 = r3.A0E
            r61 = r4
            long r4 = r3.A09
            r59 = r4
            boolean r4 = r3.A0K
            r58 = r4
            long r4 = r3.A08
            r19 = r4
            long r4 = r3.A06
            r56 = r4
            java.lang.String r4 = r3.A0P
            r55 = r4
            java.lang.String r3 = r3.A0O
            r54 = r3
            long r3 = (long) r7
            int r5 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0598
            r19 = -1
        L_0x0598:
            java.lang.String r18 = "UnifiedPrefetchManager"
            r5 = 6
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r38 = 0
            r7[r38] = r22
            X.9uY r11 = r2.A00
            java.lang.String r5 = r11.A0Q
            r17 = r5
            r7[r16] = r5
            int r5 = r11.A0I
            X.C36331k8.A1V(r7, r5)
            r5 = 3
            r7[r5] = r23
            r6 = r65
            r5 = r55
            X.C36381kD.A1L(r6, r5, r7)
            java.lang.String r6 = "video: %s representation id: %s, width: %d from origin %s and suborigin %s and source(tag) %s is being prefetched"
            r5 = r18
            X.C131916Rh.A01(r5, r6, r7)
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            boolean r5 = r2 instanceof X.C1690382z
            if (r5 == 0) goto L_0x0634
            r5 = r2
            X.82z r5 = (X.C1690382z) r5
            X.A06 r7 = r5.A02
        L_0x05cc:
            X.9WU r5 = r2.A01
            if (r5 == 0) goto L_0x0662
            if (r7 == 0) goto L_0x0653
            java.lang.String r15 = r2.A02
            android.net.Uri r9 = A02(r5, r15)
            long r5 = r5.A01
            int r8 = (int) r5
            android.util.Pair r5 = X.C36341k9.A0I(r9, r8)
            r12.add(r5)
            long r5 = r7.BBu()
            int r8 = (int) r5
            int r3 = r7.BH8(r3)
            int r3 = r3 + r8
            int r14 = r3 + -1
            r3 = -1
            if (r14 != r3) goto L_0x05f2
            r14 = r8
        L_0x05f2:
            r10 = r25
        L_0x05f4:
            if (r8 > r14) goto L_0x0662
            long r3 = (long) r8
            X.9WU r13 = r7.BH9(r3)
            long r5 = r13.A01
            int r9 = (int) r5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r3 = r7.BBL(r3, r5)
            if (r9 >= 0) goto L_0x0616
            float r6 = (float) r3
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r6 = r6 / r5
            int r5 = r11.A04
            float r5 = (float) r5
            float r6 = r6 * r5
            r5 = 1090519040(0x41000000, float:8.0)
            float r6 = r6 / r5
            int r9 = (int) r6
        L_0x0616:
            long r5 = r0.maxDurationUsForFullSegmentPrefetch
            int r16 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r16 > 0) goto L_0x062e
            r4 = -1
        L_0x061d:
            android.net.Uri r3 = A02(r13, r15)
            android.util.Pair r3 = X.C36341k9.A0I(r3, r4)
            r12.add(r3)
            int r10 = r10 - r9
            if (r10 < 0) goto L_0x0662
            int r8 = r8 + 1
            goto L_0x05f4
        L_0x062e:
            r4 = r25
            if (r10 >= r9) goto L_0x061d
            r4 = r10
            goto L_0x061d
        L_0x0634:
            r7 = r2
            X.830 r7 = (X.AnonymousClass830) r7
            goto L_0x05cc
        L_0x0638:
            boolean r5 = r0.avoidSecondPhaseOnCell
            if (r5 != 0) goto L_0x0539
            boolean r5 = r0.enableSecondPhasePrefetchWebm
            if (r5 != 0) goto L_0x064c
            java.lang.String r6 = r2.A02
            java.lang.String r5 = "webm"
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x064c
            goto L_0x0539
        L_0x064c:
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            goto L_0x0539
        L_0x0653:
            java.lang.String r3 = r2.A02
            android.net.Uri r4 = A02(r5, r3)
            r3 = r25
            android.util.Pair r3 = X.C36341k9.A0I(r4, r3)
            r12.add(r3)
        L_0x0662:
            java.util.Iterator r8 = r12.iterator()
        L_0x0666:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0709
            java.lang.Object r7 = r8.next()
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.Object r6 = r7.second
            java.lang.Number r6 = (java.lang.Number) r6
            int r36 = r6.intValue()
            java.lang.Object[] r5 = X.C36441kJ.A1Q()
            r5[r38] = r22
            java.lang.Object r4 = r7.first
            r3 = 1
            X.C36411kG.A1Q(r4, r6, r5, r3)
            java.lang.String r4 = "video prefetch: %s url: %s %d"
            r3 = r18
            X.C131916Rh.A01(r3, r4, r5)
            java.lang.Object r3 = r7.first
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Integer r43 = X.C023109s.A00
            java.util.Map r48 = java.util.Collections.emptyMap()
            X.8yO r42 = X.C187698yO.GENERAL
            X.9um r29 = new X.9um
            r39 = r29
            r40 = r3
            r41 = r26
            r44 = r22
            r45 = r23
            r46 = r65
            r47 = r64
            r49 = r63
            r50 = r62
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            int r5 = r11.A04
            X.9tI r3 = r11.A0K
            java.lang.String r3 = r3.A05
            if (r3 != 0) goto L_0x06bd
            java.lang.String r3 = new java.lang.String
            r3.<init>()
        L_0x06bd:
            X.5RZ r27 = X.AnonymousClass5RZ.PREFETCH
            X.9u6 r28 = new X.9u6
            r28.<init>()
            X.9uf r4 = new X.9uf
            r37 = 1
            r50 = 0
            r25 = r4
            r30 = r61
            r31 = r26
            r32 = r3
            r33 = r18
            r34 = r55
            r35 = r54
            r39 = r5
            r40 = r71
            r41 = r66
            r43 = r59
            r45 = r19
            r47 = r56
            r49 = r58
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47, r49, r50, r51, r52, r53)
            r1.A05(r4)
            java.lang.Integer r3 = r4.A0E
            X.5SY r29 = r1.A07(r3)
            r27 = r1
            r28 = r2
            r30 = r72
            r32 = r4
            r33 = r22
            r34 = r17
            r35 = r70
            r36 = r69
            r37 = r68
            r27.A09(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0666
        L_0x0709:
            boolean r0 = r0.enableVodDrmPrefetch
            if (r0 == 0) goto L_0x07bd
            if (r21 == 0) goto L_0x07bd
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x07bd
            java.lang.Object r0 = X.C36391kE.A0t(r21)
            X.9Xo r0 = (X.C196079Xo) r0
            X.9uY r0 = r0.A00
            X.AXg r5 = r0.A0L
            if (r5 == 0) goto L_0x07bd
            X.9uV[] r7 = r5.A03
            int r1 = r7.length
            r0 = 1
            if (r1 < r0) goto L_0x07bd
            X.9iD r2 = X.C200779iD.A00()
            android.os.Looper r4 = android.os.Looper.myLooper()
            monitor-enter(r2)
            android.util.LruCache r0 = r2.A00     // Catch:{ all -> 0x07a9 }
            if (r0 == 0) goto L_0x07a7
            if (r4 == 0) goto L_0x07a7
            if (r24 == 0) goto L_0x07a7
            r0 = r24
            java.util.UUID r6 = r0.A05     // Catch:{ all -> 0x07a9 }
            r0 = 1
            X.9uV r0 = X.C200129gf.A00(r5, r6, r0)     // Catch:{ all -> 0x07a9 }
            r3 = 0
            if (r0 != 0) goto L_0x0762
            int r1 = r5.A01     // Catch:{ all -> 0x07a9 }
            r0 = 1
            if (r1 != r0) goto L_0x07a7
            r1 = r7[r3]     // Catch:{ all -> 0x07a9 }
            java.util.UUID r0 = X.AnonymousClass9B7.A01     // Catch:{ all -> 0x07a9 }
            boolean r0 = r1.A00(r0)     // Catch:{ all -> 0x07a9 }
            if (r0 == 0) goto L_0x07a7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x07a9 }
            java.lang.String r0 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ all -> 0x07a9 }
            java.lang.String r0 = "DefaultDrmSessionMgr"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x07a9 }
        L_0x0762:
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x07a9 }
            if (r1 == 0) goto L_0x078c
            java.lang.String r0 = "cenc"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07a9 }
            if (r0 != 0) goto L_0x078c
            java.lang.String r0 = "cbc1"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07a9 }
            if (r0 != 0) goto L_0x0786
            java.lang.String r0 = "cbcs"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07a9 }
            if (r0 != 0) goto L_0x0786
            java.lang.String r0 = "cens"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x07a9 }
            if (r0 == 0) goto L_0x078c
        L_0x0786:
            int r1 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x07a9 }
            r0 = 25
            if (r1 < r0) goto L_0x07a7
        L_0x078c:
            java.util.UUID r0 = X.AnonymousClass9B7.A04     // Catch:{ all -> 0x07a9 }
            X.9uV r3 = X.C200129gf.A00(r5, r0, r3)     // Catch:{ all -> 0x07a9 }
            if (r3 == 0) goto L_0x07a7
            android.util.LruCache r0 = r2.A00     // Catch:{ all -> 0x07a9 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x07a9 }
            if (r0 != 0) goto L_0x07a7
            r0 = r24
            X.B28 r1 = r0.A01(r4, r5)     // Catch:{ all -> 0x07a9 }
            android.util.LruCache r0 = r2.A00     // Catch:{ all -> 0x07a9 }
            r0.put(r3, r1)     // Catch:{ all -> 0x07a9 }
        L_0x07a7:
            monitor-exit(r2)
            return
        L_0x07a9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x07ac:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07ac }
            throw r0
        L_0x07af:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x07b2:
            java.lang.String r2 = "ServiceEventCallbackImpl"
            java.lang.Object[] r1 = X.C90524aI.A0w()
            java.lang.String r0 = "skipping log because listener is null for event type: "
            X.C131916Rh.A01(r2, r0, r1)
        L_0x07bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203319nm.A03(com.facebook.exoplayer.monitor.VpsEventCallback, X.9uf, X.9nm):void");
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:42|43|(2:45|(1:48))|49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r1.equals("TPM171E") == false) goto L_0x00fe;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f1 */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0254  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A06(android.content.Context r18, X.B4Y r19, X.AnonymousClass9XZ r20, X.AnonymousClass9RK r21, java.util.List r22, boolean r23) {
        /*
            r7 = 0
            r4 = 1
            r17 = r20
            r6 = r21
            java.lang.String r0 = "window"
            r9 = r18
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch:{ 5UT -> 0x0234 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ 5UT -> 0x0234 }
            if (r0 != 0) goto L_0x0028
            r0 = -1
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ 5UT -> 0x0234 }
            r10.<init>(r0, r0)     // Catch:{ 5UT -> 0x0234 }
        L_0x0018:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ 5UT -> 0x0234 }
            r16 = r22
            int r9 = r16.size()     // Catch:{ 5UT -> 0x0234 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ 5UT -> 0x0234 }
            goto L_0x0111
        L_0x0028:
            android.view.Display r5 = r0.getDefaultDisplay()     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r8 = "Util"
            if (r5 != 0) goto L_0x0037
            r0 = -1
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ 5UT -> 0x0234 }
            r10.<init>(r0, r0)     // Catch:{ 5UT -> 0x0234 }
            goto L_0x0018
        L_0x0037:
            int r3 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ 5UT -> 0x0234 }
            r0 = 25
            if (r3 >= r0) goto L_0x00fe
            int r0 = r5.getDisplayId()     // Catch:{ 5UT -> 0x0234 }
            if (r0 != 0) goto L_0x00fe
            java.lang.String r2 = com.facebook.android.exoplayer2.util.Util.A03     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r0 = "Sony"
            boolean r0 = r0.equals(r2)     // Catch:{ 5UT -> 0x0234 }
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r0 = "BRAVIA"
            boolean r0 = r1.startsWith(r0)     // Catch:{ 5UT -> 0x0234 }
            if (r0 == 0) goto L_0x006d
            android.content.pm.PackageManager r1 = r9.getPackageManager()     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r0 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ 5UT -> 0x0234 }
            if (r0 == 0) goto L_0x006d
            r1 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ 5UT -> 0x0234 }
            r10.<init>(r1, r0)     // Catch:{ 5UT -> 0x0234 }
            goto L_0x0018
        L_0x006d:
            java.lang.String r0 = "NVIDIA"
            boolean r0 = r0.equals(r2)     // Catch:{ 5UT -> 0x0234 }
            if (r0 == 0) goto L_0x007f
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r0 = "SHIELD"
            boolean r0 = r1.contains(r0)     // Catch:{ 5UT -> 0x0234 }
            if (r0 != 0) goto L_0x00a5
        L_0x007f:
            java.lang.String r1 = X.C1897495k.A00(r2)     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r0 = "philips"
            boolean r0 = r0.equals(r1)     // Catch:{ 5UT -> 0x0234 }
            if (r0 == 0) goto L_0x00fe
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r0 = "QM1"
            boolean r0 = r1.startsWith(r0)     // Catch:{ 5UT -> 0x0234 }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "QV151E"
            boolean r0 = r1.equals(r0)     // Catch:{ 5UT -> 0x0234 }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "TPM171E"
            boolean r0 = r1.equals(r0)     // Catch:{ 5UT -> 0x0234 }
            if (r0 == 0) goto L_0x00fe
        L_0x00a5:
            r9 = 0
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r10 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r2 = "get"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00c4 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.reflect.Method r2 = X.AnonymousClass001.A0G(r10, r0, r2, r1, r7)     // Catch:{ Exception -> 0x00c4 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = "sys.display-size"
            r1[r7] = r0     // Catch:{ Exception -> 0x00c4 }
            java.lang.Object r0 = r2.invoke(r10, r1)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00c4 }
            r9 = r0
            goto L_0x00ca
        L_0x00c4:
            r1 = move-exception
            java.lang.String r0 = "Failed to read sys.display-size"
            android.util.Log.e(r8, r0, r1)     // Catch:{ 5UT -> 0x0234 }
        L_0x00ca:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ 5UT -> 0x0234 }
            if (r0 != 0) goto L_0x00fe
            java.lang.String r1 = r9.trim()     // Catch:{ NumberFormatException -> 0x00f1 }
            java.lang.String r0 = "x"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ NumberFormatException -> 0x00f1 }
            int r1 = r2.length     // Catch:{ NumberFormatException -> 0x00f1 }
            r0 = 2
            if (r1 != r0) goto L_0x00f1
            int r1 = X.C165617ti.A08(r2, r7)     // Catch:{ NumberFormatException -> 0x00f1 }
            int r0 = X.C165617ti.A08(r2, r4)     // Catch:{ NumberFormatException -> 0x00f1 }
            if (r1 <= 0) goto L_0x00f1
            if (r0 <= 0) goto L_0x00f1
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ NumberFormatException -> 0x00f1 }
            r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00f1 }
            goto L_0x0018
        L_0x00f1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r0 = "Invalid sys.display-size: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r9, r1)     // Catch:{ 5UT -> 0x0234 }
            android.util.Log.e(r8, r0)     // Catch:{ 5UT -> 0x0234 }
        L_0x00fe:
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ 5UT -> 0x0234 }
            r10.<init>()     // Catch:{ 5UT -> 0x0234 }
            r0 = 23
            if (r3 < r0) goto L_0x010c
            com.facebook.android.exoplayer2.util.Util.A0A(r10, r5)     // Catch:{ 5UT -> 0x0234 }
            goto L_0x0018
        L_0x010c:
            r5.getRealSize(r10)     // Catch:{ 5UT -> 0x0234 }
            goto L_0x0018
        L_0x0111:
            r2 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x0115:
            if (r2 >= r9) goto L_0x01bc
            r0 = r16
            java.lang.Object r0 = r0.get(r2)     // Catch:{ 5UT -> 0x0234 }
            X.9Xo r0 = (X.C196079Xo) r0     // Catch:{ 5UT -> 0x0234 }
            X.9uY r11 = r0.A00     // Catch:{ 5UT -> 0x0234 }
            r0 = r23
            r1 = r19
            int r12 = X.C1688982l.A01(r11, r1, r0, r7)     // Catch:{ 5UT -> 0x0234 }
            r7 = r12 & 7
            r1 = 4
            r0 = 1
            if (r7 == r1) goto L_0x0130
            r0 = 0
        L_0x0130:
            if (r0 == 0) goto L_0x018a
            X.AnonymousClass000.A1F(r5, r2)     // Catch:{ 5UT -> 0x0234 }
            int r0 = r11.A0I     // Catch:{ 5UT -> 0x0234 }
            if (r0 <= 0) goto L_0x01b7
            int r0 = r11.A09     // Catch:{ 5UT -> 0x0234 }
            if (r0 <= 0) goto L_0x01b7
            int r14 = r10.x     // Catch:{ 5UT -> 0x0234 }
            if (r14 <= 0) goto L_0x01b7
            int r15 = r10.y     // Catch:{ 5UT -> 0x0234 }
            if (r15 <= 0) goto L_0x01b7
            int r13 = r11.A0I     // Catch:{ 5UT -> 0x0234 }
            int r12 = r11.A09     // Catch:{ 5UT -> 0x0234 }
            r7 = r15
            r1 = 1
            boolean r0 = X.C90474aD.A1T(r13, r12)
            if (r14 > r15) goto L_0x0152
            r1 = 0
        L_0x0152:
            if (r0 != r1) goto L_0x0156
            r7 = r14
            r14 = r15
        L_0x0156:
            int r1 = r13 * r14
            int r0 = r12 * r7
            if (r1 < r0) goto L_0x0166
            int r0 = r0 + r13
            int r0 = r0 + -1
            int r0 = r0 / r13
            android.graphics.Point r13 = new android.graphics.Point     // Catch:{ 5UT -> 0x0234 }
            r13.<init>(r7, r0)     // Catch:{ 5UT -> 0x0234 }
            goto L_0x016f
        L_0x0166:
            int r1 = r1 + r12
            int r0 = r1 + -1
            int r0 = r0 / r12
            android.graphics.Point r13 = new android.graphics.Point     // Catch:{ 5UT -> 0x0234 }
            r13.<init>(r0, r14)     // Catch:{ 5UT -> 0x0234 }
        L_0x016f:
            int r12 = r11.A0I     // Catch:{ 5UT -> 0x0234 }
            int r0 = r11.A09     // Catch:{ 5UT -> 0x0234 }
            int r12 = r12 * r0
            int r1 = r11.A0I     // Catch:{ 5UT -> 0x0234 }
            int r0 = r13.x     // Catch:{ 5UT -> 0x0234 }
            float r0 = (float) r0     // Catch:{ 5UT -> 0x0234 }
            r7 = 1065017672(0x3f7ae148, float:0.98)
            float r0 = r0 * r7
            int r0 = (int) r0     // Catch:{ 5UT -> 0x0234 }
            if (r1 < r0) goto L_0x01b7
            int r1 = r11.A09     // Catch:{ 5UT -> 0x0234 }
            int r0 = r13.y     // Catch:{ 5UT -> 0x0234 }
            float r0 = (float) r0     // Catch:{ 5UT -> 0x0234 }
            float r0 = r0 * r7
            int r0 = (int) r0     // Catch:{ 5UT -> 0x0234 }
            if (r1 < r0) goto L_0x01b7
            goto L_0x01b4
        L_0x018a:
            java.lang.String r7 = "rendererSupportsFormatResult=%s, Format=%s"
            java.lang.String r1 = ""
            if (r12 == 0) goto L_0x019f
            if (r12 == r4) goto L_0x019c
            r0 = 2
            if (r12 == r0) goto L_0x0199
            r0 = 3
            if (r12 != r0) goto L_0x01a4
            goto L_0x01a2
        L_0x0199:
            java.lang.String r1 = "FORMAT_UNSUPPORTED_DRM"
            goto L_0x01a4
        L_0x019c:
            java.lang.String r1 = "FORMAT_UNSUPPORTED_SUBTYPE"
            goto L_0x01a4
        L_0x019f:
            java.lang.String r1 = "FORMAT_UNSUPPORTED_TYPE"
            goto L_0x01a4
        L_0x01a2:
            java.lang.String r1 = "FORMAT_EXCEEDS_CAPABILITIES"
        L_0x01a4:
            r0 = 2
            java.lang.Object[] r0 = X.C36431kI.A1Z(r1, r0)     // Catch:{ 5UT -> 0x0234 }
            X.C90514aH.A1Q(r11, r0, r4)     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r0 = java.lang.String.format(r7, r0)     // Catch:{ 5UT -> 0x0234 }
            r3.add(r0)     // Catch:{ 5UT -> 0x0234 }
            goto L_0x01b7
        L_0x01b4:
            if (r12 >= r8) goto L_0x01b7
            r8 = r12
        L_0x01b7:
            int r2 = r2 + 1
            r7 = 0
            goto L_0x0115
        L_0x01bc:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == r0) goto L_0x01f0
            int r9 = r5.size()     // Catch:{ 5UT -> 0x0234 }
            int r9 = r9 - r4
        L_0x01c6:
            if (r9 < 0) goto L_0x01f0
            java.lang.Object r0 = r5.get(r9)     // Catch:{ 5UT -> 0x0234 }
            int r1 = X.AnonymousClass000.A0I(r0)     // Catch:{ 5UT -> 0x0234 }
            r0 = r16
            java.lang.Object r0 = r0.get(r1)     // Catch:{ 5UT -> 0x0234 }
            X.9Xo r0 = (X.C196079Xo) r0     // Catch:{ 5UT -> 0x0234 }
            X.9uY r0 = r0.A00     // Catch:{ 5UT -> 0x0234 }
            int r2 = r0.A0I     // Catch:{ 5UT -> 0x0234 }
            r1 = -1
            if (r2 == r1) goto L_0x01e5
            int r0 = r0.A09     // Catch:{ 5UT -> 0x0234 }
            if (r0 == r1) goto L_0x01e5
            int r1 = r2 * r0
        L_0x01e5:
            r0 = -1
            if (r1 == r0) goto L_0x01ea
            if (r1 <= r8) goto L_0x01ed
        L_0x01ea:
            r5.remove(r9)     // Catch:{ 5UT -> 0x0234 }
        L_0x01ed:
            int r9 = r9 + -1
            goto L_0x01c6
        L_0x01f0:
            boolean r0 = r5.isEmpty()     // Catch:{ 5UT -> 0x0234 }
            if (r0 == 0) goto L_0x021e
            java.lang.String r2 = "manifestId=%s, errors=%s"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ 5UT -> 0x0237 }
            r0 = r17
            java.lang.String r0 = r0.A07     // Catch:{ 5UT -> 0x0234 }
            r1[r7] = r0     // Catch:{ 5UT -> 0x0234 }
            X.C90514aH.A1Q(r3, r1, r4)     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r8 = java.lang.String.format(r2, r1)     // Catch:{ 5UT -> 0x0234 }
            com.facebook.exoplayer.monitor.VpsEventCallback r7 = r6.A01     // Catch:{ 5UT -> 0x0234 }
            X.9uf r0 = r6.A02     // Catch:{ 5UT -> 0x0234 }
            X.9um r0 = r0.A0D     // Catch:{ 5UT -> 0x0234 }
            java.lang.String r3 = r0.A0H     // Catch:{ 5UT -> 0x0234 }
            if (r3 == 0) goto L_0x021e
            java.lang.String r2 = "MANIFEST"
            java.lang.String r1 = "FALLBACK_TRIGGERED"
            X.89B r0 = new X.89B     // Catch:{ 5UT -> 0x0234 }
            r0.<init>(r3, r2, r1, r8)     // Catch:{ 5UT -> 0x0234 }
            r7.B2I(r0)     // Catch:{ 5UT -> 0x0234 }
        L_0x021e:
            int r3 = r5.size()     // Catch:{ 5UT -> 0x0234 }
            int[] r2 = new int[r3]     // Catch:{ 5UT -> 0x0234 }
            r1 = 0
        L_0x0225:
            if (r1 >= r3) goto L_0x0261
            java.lang.Object r0 = r5.get(r1)     // Catch:{ 5UT -> 0x0234 }
            int r0 = X.AnonymousClass000.A0I(r0)     // Catch:{ 5UT -> 0x0234 }
            r2[r1] = r0     // Catch:{ 5UT -> 0x0234 }
            int r1 = r1 + 1
            goto L_0x0225
        L_0x0234:
            r3 = move-exception
            r0 = 2
            goto L_0x0238
        L_0x0237:
            r3 = move-exception
        L_0x0238:
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = r17
            java.lang.String r1 = r0.A07
            r0 = 0
            r2[r0] = r1
            X.C90514aH.A1Q(r3, r2, r4)
            java.lang.String r0 = "manifestId=%s, exception=%s"
            java.lang.String r5 = java.lang.String.format(r0, r2)
            com.facebook.exoplayer.monitor.VpsEventCallback r4 = r6.A01
            X.9uf r0 = r6.A02
            X.9um r0 = r0.A0D
            java.lang.String r3 = r0.A0H
            if (r3 == 0) goto L_0x0260
            java.lang.String r2 = "MANIFEST"
            java.lang.String r1 = "FALLBACK_TRIGGERED"
            X.89B r0 = new X.89B
            r0.<init>(r3, r2, r1, r5)
            r4.B2I(r0)
        L_0x0260:
            r2 = 0
        L_0x0261:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203319nm.A06(android.content.Context, X.B4Y, X.9XZ, X.9RK, java.util.List, boolean):int[]");
    }

    public void A09(C196079Xo r22, AnonymousClass5SY r23, VpsEventCallback vpsEventCallback, B5W b5w, C207169uf r26, String str, String str2, boolean z, boolean z2, boolean z3) {
        Integer num = C023109s.A0C;
        C207169uf r13 = r26;
        C207239um r5 = r13.A0D;
        if (num == r5.A07 && r13.A02 == 0) {
            r13.A02 = this.A07.progressivePrefetchBytesCell;
        }
        AUR aur = this.A07;
        AnonymousClass89G r7 = new AnonymousClass89G(r22, r23, vpsEventCallback, b5w, this.A04, r13, aur, this.A08, str, str2, z, z2, z3);
        C131916Rh.A01("UnifiedPrefetchManager", "video: %s queuing prefetch task, from origin %s subOrigin %s with tag %s and module %s", str, r5.A0B, r5.A0C, r13.A0P, r13.A0O);
        if (aur.abrSetting.enableDelayedPrefetchQualitySelection) {
            r7.A03();
            r7.A02();
            return;
        }
        A04(this, r7, r13.A0E);
    }

    private int A00(C196079Xo r8, int i) {
        long j;
        AnonymousClass9WU r0;
        if (r8 == null) {
            return 0;
        }
        int i2 = this.A07.maxBytesToPrefetchCellVOD;
        if (!(r8 instanceof C1690382z) || (r0 = ((C1690382z) r8).A01) == null) {
            j = 0;
        } else {
            j = r0.A02 + r0.A01;
        }
        return Math.min((int) (j + ((long) (((((double) r8.A00.A04) / 8.0d) * ((double) i)) / 1000.0d))), i2);
    }

    public static int A01(C196079Xo r7, int i, int i2) {
        long j;
        AnonymousClass9WU r0;
        if (r7 == null) {
            return 0;
        }
        if (!(r7 instanceof C1690382z) || (r0 = ((C1690382z) r7).A01) == null) {
            j = 0;
        } else {
            j = r0.A02 + r0.A01;
        }
        return Math.min((int) (j + ((long) ((((double) r7.A00.A04) / 8.0d) * (((double) i2) / 1000.0d)))), i);
    }

    public static Uri A02(AnonymousClass9WU r0, String str) {
        return Uri.parse(C131676Qa.A00(str, r0.A03));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r7 == X.C023109s.A0S) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C203319nm r5, X.AnonymousClass9YW r6, java.lang.Integer r7) {
        /*
            X.AUR r4 = r5.A07
            boolean r0 = r4.isVideoQplPipelineEnabled
            if (r0 == 0) goto L_0x0026
            X.9D2 r3 = r5.A05
            if (r3 == 0) goto L_0x0026
            X.9uf r2 = r6.A01
            X.6LE r0 = r5.A03
            java.util.LinkedList r1 = r0.A04
            monitor-enter(r1)
            int r0 = r1.size()     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            X.89F r1 = new X.89F
            r1.<init>(r2, r0)
            X.9lT r0 = r3.A00
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r0 = r0.A0A
            r0.B2I(r1)
        L_0x0026:
            boolean r3 = r4.prefetchTaskQueuePutInFront
            java.lang.Integer r0 = X.C023109s.A00
            if (r7 == r0) goto L_0x0036
            java.lang.Integer r0 = X.C023109s.A01
            if (r7 == r0) goto L_0x0035
            java.lang.Integer r0 = X.C023109s.A0S
            r3 = 0
            if (r7 != r0) goto L_0x0036
        L_0x0035:
            r3 = 1
        L_0x0036:
            X.6LE r2 = r5.A03
            int r1 = r4.prefetchTaskQueueRetryNumber
            X.69O r0 = new X.69O
            r0.<init>(r6, r1)
            X.AnonymousClass6LE.A00(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203319nm.A04(X.9nm, X.9YW, java.lang.Integer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r5.A07.disableSecondPhasePrefetchForReels == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r6.A0P.contains("UnifiedPlayer") != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(X.C207169uf r6) {
        /*
            r5 = this;
            X.9um r0 = r6.A0D
            java.lang.String r1 = r0.A0D
            java.lang.String r0 = "FB_SHORTS_UNIFIED_PLAYER"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r6.A0O
            java.lang.String r0 = "unified_video_player"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "reels_tab"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r6.A0P
            java.lang.String r0 = "UnifiedPlayer"
            boolean r1 = r1.contains(r0)
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            r4 = 0
            if (r0 == 0) goto L_0x0034
            X.AUR r0 = r5.A07
            boolean r0 = r0.disableSecondPhasePrefetchForReels
            r3 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            X.AUR r2 = r5.A07
            X.9m3 r1 = r5.A0B
            if (r1 == 0) goto L_0x0040
            r0 = 16
            X.C202509m3.A00(r1, r0)
        L_0x0040:
            boolean r0 = r2.enableSecondPhasePrefetch
            if (r0 == 0) goto L_0x0049
            if (r3 != 0) goto L_0x0049
        L_0x0046:
            r0 = r4 ^ 1
            return r0
        L_0x0049:
            r4 = 1
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203319nm.A05(X.9uf):boolean");
    }

    public C192419Gx A08(C196079Xo r8, C196079Xo r9, VpsEventCallback vpsEventCallback, String str, String str2, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        long j;
        AnonymousClass9WU r0;
        int A002;
        int A003;
        int i5;
        int i6;
        AUR aur = this.A07;
        int i7 = 0;
        if (aur.usePrefetchSegmentOffset) {
            C165597tg.A1H("Manifest for videoId %s is missing prefetch segment range", "UnifiedPrefetchManager", new Object[]{str});
            vpsEventCallback.B2I(new AnonymousClass89B(str, "MANIFEST", "MANIFEST_MISSING_PREFETCH_SEGMENT_RANGE", "Manifest is missing prefetch segment range"));
        }
        if (i <= 0) {
            if (z2 && aur.enableAdBreakEnhancedPrefetch) {
                i5 = aur.maxBytesToPrefetchCellVOD;
                i6 = aur.adBreakEnahncedPrefetchDurationMs;
            } else if (z && aur.enableAllLongerPrefetchAds) {
                i5 = aur.maxWifiBytesToPrefetchAds;
                i6 = aur.maxWifiPrefetchDurationMsAds;
            } else if (i2 >= 0) {
                return new C192419Gx(0, 0);
            } else {
                int i8 = aur.numMsToPrefetch;
                A002 = A00(r8, i8);
                A003 = A00(r9, i8);
                return new C192419Gx(A002, A003);
            }
            A002 = A01(r8, i5, i6);
            A003 = A01(r9, i5, i6);
            return new C192419Gx(A002, A003);
        }
        if (r8 != null) {
            i3 = r8.A00.A04;
        } else {
            i3 = 0;
        }
        if (r9 != null) {
            i4 = r9.A00.A04;
        } else {
            i4 = 0;
        }
        int i9 = i3 + i4;
        if (i9 <= 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("The sum of bitrates from all representations must be greater than 0, videoId: ");
            A0u.append(str);
            A0u.append(" ,playOrigin: ");
            A0u.append(str2);
            A0u.append(" ,sponsored: ");
            A0u.append(z);
            vpsEventCallback.B2I(new AnonymousClass89B(str, "PREFETCH_MANAGER", "ZERO_AUDIO_VIDEO_BITRATE", AnonymousClass000.A0r(" ,optionalPrefetchBudgetInBytes: ", A0u, i)));
            if (r9 != null) {
                i7 = i / 10;
            }
            return new C192419Gx(i - i7, i7);
        }
        if (r9 == null || !(r9 instanceof C1690382z) || (r0 = ((C1690382z) r9).A01) == null) {
            j = 0;
        } else {
            j = r0.A02 + r0.A01;
        }
        int i10 = ((int) ((((float) i4) * ((float) i)) / ((float) i9))) + ((int) j);
        return new C192419Gx(i - i10, i10);
    }

    public C203319nm(Context context, AnonymousClass94C r4, C201619jy r5, AnonymousClass9D2 r6, AnonymousClass9D4 r7, C202509m3 r8, AUR aur, C1896394p r10, Map map, AtomicReference atomicReference) {
        this.A03 = new AnonymousClass6LE(new C120975sO(r8, this, aur));
        this.A04 = r5;
        this.A0D = map;
        this.A07 = aur;
        this.A0A = r4;
        this.A08 = r10;
        this.A05 = r6;
        this.A02 = context;
        this.A06 = r7;
        AtomicReference atomicReference2 = new AtomicReference();
        this.A0G = atomicReference2;
        atomicReference2.set(C36381kD.A0j());
        this.A0F = atomicReference;
        this.A0C = AnonymousClass001.A0J();
        this.A0B = r8;
        AnonymousClass9D1 r1 = (AnonymousClass9D1) atomicReference.get();
        if (aur.disableSecondPhasePrefetchOnAppScrolling && r1 != null) {
            r1.A00.add(this);
        }
        this.A0E = new ArrayDeque();
        GlobalPlayerStateMonitor globalPlayerStateMonitor = GlobalPlayerStateMonitor.A02;
        globalPlayerStateMonitor.A00.add(new AnonymousClass9D9(this));
    }

    public AnonymousClass5SY A07(Integer num) {
        switch (num.intValue()) {
            case 3:
                return AnonymousClass5SY.LOW;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return AnonymousClass5SY.URGENT;
            default:
                return AnonymousClass5SY.HIGH;
        }
    }
}
