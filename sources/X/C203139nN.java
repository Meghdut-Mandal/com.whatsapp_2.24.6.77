package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import exoplayer2.av1.src.Dav1dScalingMode;
import exoplayer2.av1.src.LibDav1dVideoRenderer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.9nN  reason: invalid class name and case insensitive filesystem */
public class C203139nN {
    public C200129gf A00;
    public String A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final C125125zM A05;
    public final AnonymousClass9D4 A06;
    public final C204369pt A07;
    public final C197179bG A08;
    public final ServiceEventCallbackImpl A09;
    public final C209409zx A0A;
    public final C199119ej A0B;
    public final AUR A0C;
    public final Map A0D;

    public static boolean A05(HashMap hashMap) {
        try {
            for (C202149l7 r1 : C203599oN.A03("video/av01", false)) {
                if (!r1.A08 && r1.A04) {
                    String str = r1.A02;
                    if (!(str == null || hashMap == null || hashMap.isEmpty())) {
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        if (hashMap.containsKey(lowerCase)) {
                            int A0I = AnonymousClass000.A0I(hashMap.get(lowerCase));
                            if (A0I == -1) {
                                continue;
                            } else if (Build.VERSION.SDK_INT < A0I) {
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (AnonymousClass5UT e) {
            Object[] objArr = new Object[1];
            C90514aH.A1U(e, objArr, 0);
            C165597tg.A1H("Failed to query AV1 decoders on device with exception %s. AV1 Hardware decoder will not be picked.", "HeroExo2InitHelper", objArr);
            return false;
        }
    }

    private C208949zD A00() {
        Dav1dScalingMode dav1dScalingMode = Dav1dScalingMode.ASPECT_FIT;
        AUR aur = this.A0C;
        long j = aur.rendererAllowedJoiningTimeMs;
        int i = aur.dav1dThreads;
        int i2 = aur.dav1dMaxFrameDelay;
        boolean z = aur.dav1dApplyGrain;
        boolean z2 = aur.av1ThrowExceptionOnPictureError;
        boolean z3 = aur.av1Dav1dEnableVpsLogging;
        boolean z4 = aur.av1Dav1dUseSurfaceViewSetFix;
        boolean z5 = aur.av1SetBuffersDataspace;
        boolean z6 = aur.av1UseMemoryCleanupFixes;
        boolean z7 = aur.av1UseDav1dSynchronizationFixes;
        boolean z8 = aur.av1FlushDav1dProperly;
        boolean z9 = z2;
        boolean z10 = z4;
        return new LibDav1dVideoRenderer(dav1dScalingMode, j, 0, i, i2, z, z9, z3, z10, z5, z6, z7, z8, this.A09, this.A04, aur.enableDav1dOpenGLRendering, this.A0A, true, aur.useForceSurfaceChange, aur.enableDav1dOpenGLIncorrectSurfaceSizeFix, false, aur.maxWidthForAV1SRShader, false, aur.saturationFactor, aur.enableOpenGLSurfaceSizeUpdateFix, aur.enableDav1dOpenGLRenderingHandleAspectRatio);
    }

    public static AnonymousClass9XZ A01(C195979Xa r5, AUR aur) {
        C207239um r52 = r5.A0F;
        AnonymousClass9XZ A012 = AnonymousClass9Z1.A01(r52.A05, new C22736Av0(r52.A0H, aur.dashManifestPoolSize, aur.parseManifestIdentifier, aur.enableDashManifestPool), r52.A0A);
        if (A012 != null) {
            return A012;
        }
        throw C90524aI.A0X("Missing manifest");
    }

    private C1688982l A02(B4Y b4y, C195979Xa r36) {
        Context context = this.A03;
        C125125zM r15 = this.A05;
        C197179bG r2 = this.A08;
        AUR aur = this.A0C;
        AnonymousClass9JW r11 = new AnonymousClass9JW(r2, aur.threadSleepMsForDecoderInitFailure, aur.appendReconfigurationDataForDrmContentFix);
        long j = aur.rendererAllowedJoiningTimeMs;
        C200129gf r12 = this.A00;
        Handler handler = this.A04;
        C209409zx r9 = this.A0A;
        boolean z = aur.useDummySurfaceExo2;
        boolean z2 = aur.isExo2AggresiveMicrostallFixEnabled;
        boolean z3 = aur.ignoreEmptyProfileLevels;
        int i = aur.decoderInitializationRetryTimeMs;
        int i2 = aur.decoderDequeueRetryTimeMs;
        int i3 = aur.renderRetryTimeMs;
        boolean z4 = aur.useOutputSurfaceWorkaround;
        boolean z5 = false;
        String str = r36.A0F.A0C;
        if (!TextUtils.isEmpty(str) && aur.originAllowlistForAlternateCodec.contains(str)) {
            z5 = true;
        }
        C125125zM r19 = r15;
        return new C1688982l(context, handler, r12, b4y, r11, r19, r9, (Object) null, i, i2, i3, j, z, z2, z3, z4, false, z5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r44 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C1688982l A03(X.B4Y r43, boolean r44) {
        /*
            r42 = this;
            exoplayer2.av1.src.Dav1dScalingMode r17 = exoplayer2.av1.src.Dav1dScalingMode.ASPECT_FIT
            r4 = r42
            X.AUR r3 = r4.A0C
            long r13 = r3.rendererAllowedJoiningTimeMs
            int r0 = r3.dav1dThreads
            r21 = r0
            int r0 = r3.dav1dMaxFrameDelay
            r22 = r0
            boolean r0 = r3.dav1dApplyGrain
            r23 = r0
            boolean r0 = r3.av1ThrowExceptionOnPictureError
            r19 = r0
            boolean r0 = r3.av1Dav1dEnableVpsLogging
            r18 = r0
            boolean r15 = r3.av1Dav1dUseSurfaceViewSetFix
            boolean r0 = r3.enableDav1dOpenGLRendering
            if (r0 != 0) goto L_0x0026
            r27 = 0
            if (r44 == 0) goto L_0x0028
        L_0x0026:
            r27 = 1
        L_0x0028:
            boolean r12 = r3.av1SetBuffersDataspace
            boolean r11 = r3.av1UseMemoryCleanupFixes
            boolean r10 = r3.av1UseDav1dSynchronizationFixes
            boolean r9 = r3.av1FlushDav1dProperly
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r8 = r4.A09
            boolean r7 = r3.useForceSurfaceChange
            boolean r6 = r3.enableDav1dOpenGLIncorrectSurfaceSizeFix
            r20 = 0
            int r5 = r3.maxWidthForAV1SRShader
            float r2 = r3.saturationFactor
            boolean r1 = r3.enableOpenGLSurfaceSizeUpdateFix
            boolean r0 = r3.enableDav1dOpenGLRenderingHandleAspectRatio
            r33 = 1
            exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting r16 = new exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting
            r36 = 0
            r38 = 0
            r28 = r12
            r29 = r11
            r30 = r10
            r31 = r9
            r32 = r8
            r34 = r7
            r35 = r6
            r37 = r5
            r39 = r2
            r40 = r1
            r41 = r0
            r24 = r19
            r25 = r18
            r26 = r15
            r18 = r13
            r16.<init>(r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            android.content.Context r15 = r4.A03
            X.5zM r13 = r4.A05
            X.9bG r2 = r4.A08
            boolean r1 = r3.appendReconfigurationDataForDrmContentFix
            int r0 = r3.threadSleepMsForDecoderInitFailure
            X.9JW r9 = new X.9JW
            r9.<init>(r2, r0, r1)
            long r0 = r3.rendererAllowedJoiningTimeMs
            X.9gf r12 = r4.A00
            android.os.Handler r11 = r4.A04
            X.9zx r10 = r4.A0A
            boolean r8 = r3.useDummySurfaceExo2
            boolean r7 = r3.isExo2AggresiveMicrostallFixEnabled
            boolean r6 = r3.ignoreEmptyProfileLevels
            int r5 = r3.decoderInitializationRetryTimeMs
            int r4 = r3.decoderDequeueRetryTimeMs
            int r2 = r3.renderRetryTimeMs
            boolean r3 = r3.useOutputSurfaceWorkaround
            X.82l r14 = new X.82l
            r32 = 1
            r33 = 0
            r18 = r43
            r17 = r12
            r19 = r9
            r20 = r13
            r21 = r10
            r22 = r16
            r23 = r5
            r24 = r4
            r25 = r2
            r26 = r0
            r28 = r8
            r29 = r7
            r30 = r6
            r31 = r3
            r16 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203139nN.A03(X.B4Y, boolean):X.82l");
    }

    public static void A04(C125145zO r1, AUR aur) {
        r1.A0F = aur.enableVodDrmPrefetch;
        r1.A0E = aur.enableCustomizedXHEAACConfig;
        r1.A06 = aur.xHEAACTargetReferenceLvl;
        r1.A05 = aur.xHEAACCEffectType;
        r1.A09 = aur.enableAsynchronousBufferQueueing;
        r1.A0N = aur.enableSynchronizeCodecInteractionsWithQueueing;
        r1.A0M = aur.enableSeamlessAudioCodecAdaptation;
        r1.A0C = aur.enableCustomizedDRCEffect;
        r1.A0D = aur.enableCustomizedDRCForHeadset;
        r1.A01 = aur.lateNightHourUpperThreshold;
        r1.A00 = aur.lateNightHourLowerThreshold;
        r1.A0G = aur.enableLowLatencyDecoding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e1, code lost:
        if (r0 == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        if (r11.A0D == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012b, code lost:
        if (A05(r7.blockListedHardwareDecoderMap) == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012d, code lost:
        r0 = A02(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0168, code lost:
        r2 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0168 A[ExcHandler: Exception | NoClassDefFoundError (e java.lang.Throwable), Splitter:B:40:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0189 A[SYNTHETIC, Splitter:B:92:0x0189] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B5Q[] A07(X.AnonymousClass9XZ r23, X.C195979Xa r24, X.C204369pt r25) {
        /*
            r22 = this;
            r10 = r24
            X.9um r9 = r10.A0F
            boolean r0 = r9.A01()
            r8 = r22
            X.AUR r7 = r8.A0C
            if (r0 == 0) goto L_0x0028
            boolean r1 = r7.prioritizeAv1HardwareDecoder
            java.lang.String r0 = "video/av01"
            if (r1 == 0) goto L_0x0031
            java.util.HashMap r0 = r7.blockListedHardwareDecoderMap
            X.9zk r6 = new X.9zk
            r6.<init>(r8, r0)
        L_0x001b:
            boolean r0 = r7.isExo2DrmEnabled
            r11 = r23
            if (r0 == 0) goto L_0x00c9
            java.lang.String r13 = "; Exception: "
            java.lang.String r14 = "Device: "
            if (r23 == 0) goto L_0x0056
            goto L_0x003a
        L_0x0028:
            boolean r0 = r7.allowRequestForSoftwareDecoder
            if (r0 == 0) goto L_0x0037
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0037
            r0 = 0
        L_0x0031:
            X.9zj r6 = new X.9zj
            r6.<init>(r8, r0)
            goto L_0x001b
        L_0x0037:
            X.B4Y r6 = X.B4Y.A00
            goto L_0x001b
        L_0x003a:
            java.lang.String r4 = r9.A0H     // Catch:{ 924 -> 0x0098 }
            X.9D4 r3 = r8.A06     // Catch:{ 924 -> 0x0098 }
            boolean r2 = r7.proxyDrmProvisioningRequests     // Catch:{ 924 -> 0x0098 }
            boolean r1 = r7.enableDrmProvisioningRetry     // Catch:{ 924 -> 0x0098 }
            boolean r0 = r7.removeGifPrefixForDRMKeyRequest     // Catch:{ 924 -> 0x0098 }
            r15 = r11
            r16 = r3
            r17 = r4
            r18 = r2
            r19 = r1
            r20 = r0
            X.9gf r0 = X.C200589hg.A00(r15, r16, r17, r18, r19, r20)     // Catch:{ 924 -> 0x0098 }
            r8.A00 = r0     // Catch:{ 924 -> 0x0098 }
            goto L_0x00ba
        L_0x0056:
            boolean r0 = r10.A00()
            if (r0 == 0) goto L_0x00ba
            java.lang.String r12 = r9.A0H     // Catch:{ 924 -> 0x008e }
            X.9D4 r5 = r8.A06     // Catch:{ 924 -> 0x008e }
            boolean r3 = r7.proxyDrmProvisioningRequests     // Catch:{ 924 -> 0x008e }
            boolean r2 = r7.enableDrmProvisioningRetry     // Catch:{ 924 -> 0x008e }
            boolean r1 = r7.removeGifPrefixForDRMKeyRequest     // Catch:{ 924 -> 0x008e }
            java.util.Set r0 = X.C200589hg.A00     // Catch:{ 924 -> 0x008e }
            X.9MN r4 = new X.9MN     // Catch:{ 924 -> 0x008e }
            r15 = r4
            r16 = r5
            r17 = r12
            r18 = r3
            r19 = r2
            r20 = r1
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ 924 -> 0x008e }
            java.util.UUID r3 = X.AnonymousClass9B7.A04     // Catch:{ 924 -> 0x008e }
            X.9k8 r2 = X.C201699k8.A00(r3)     // Catch:{ 924 -> 0x008e }
            r0 = 0
            int[] r0 = new int[r0]     // Catch:{ 924 -> 0x008e }
            X.9gf r1 = new X.9gf     // Catch:{ 924 -> 0x008e }
            r1.<init>(r2, r4, r3, r0)     // Catch:{ 924 -> 0x008e }
            X.9k8 r0 = r1.A02     // Catch:{ 924 -> 0x008e }
            r0.A05()     // Catch:{ 924 -> 0x008e }
            r8.A00 = r1     // Catch:{ 924 -> 0x008e }
            goto L_0x00ba
        L_0x008e:
            r12 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r5 = r8.A09
            java.lang.String r4 = r9.A0H
            java.lang.String r3 = "DRM"
            X.906 r0 = X.AnonymousClass906.A04
            goto L_0x00a1
        L_0x0098:
            r12 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r5 = r8.A09
            java.lang.String r4 = r9.A0H
            java.lang.String r3 = "DRM"
            X.906 r0 = X.AnonymousClass906.A03
        L_0x00a1:
            java.lang.String r2 = r0.name()
            java.lang.StringBuilder r1 = X.C90524aI.A0i(r14)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r1 = X.C36331k8.A0i(r13, r1, r12)
            X.89B r0 = new X.89B
            r0.<init>(r4, r3, r2, r1)
            r5.B2I(r0)
        L_0x00ba:
            X.9gf r1 = r8.A00
            if (r1 == 0) goto L_0x00c9
            boolean r0 = r7.enableActiveDrmSessionStoreRelease
            if (r0 == 0) goto L_0x00c9
            X.9D7 r0 = new X.9D7
            r0.<init>(r8)
            r1.A00 = r0
        L_0x00c9:
            r5 = 0
            r8.A02 = r5
            boolean r0 = r9.A01()
            r1 = 0
            r12 = 2
            java.lang.String r4 = "HeroExo2InitHelper"
            r3 = 1
            if (r0 == 0) goto L_0x01ce
            r0 = 4
            java.lang.Object[] r13 = new java.lang.Object[r0]
            java.lang.String r0 = r9.A0H
            r13[r5] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r13[r3] = r0
            r13[r12] = r0
            r2 = 3
            boolean r0 = r9.A0P
            boolean r0 = X.AnonymousClass000.A1P(r0)
            X.AnonymousClass000.A1N(r13, r2, r0)
            java.lang.String r0 = "VideoId: %s, NeedCentering: %b, ShouldCropToFit: %b, isSponsored: %b"
            X.C131916Rh.A01(r4, r0, r13)
            boolean r0 = r7.enableMixedCodecManifestSupport
            if (r0 == 0) goto L_0x0100
            if (r23 == 0) goto L_0x0100
            boolean r0 = r11.A0D
            r2 = 1
            if (r0 != 0) goto L_0x0101
        L_0x0100:
            r2 = 0
        L_0x0101:
            boolean r0 = r7.prioritizeAv1HardwareDecoder     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = "video/av01"
            java.util.List r0 = X.C203599oN.A03(r0, r5)     // Catch:{ 5UT -> 0x0132, Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 == 0) goto L_0x0132
            java.util.Iterator r14 = r0.iterator()     // Catch:{ 5UT -> 0x0132, Exception | NoClassDefFoundError -> 0x0168 }
        L_0x0111:
            boolean r0 = r14.hasNext()     // Catch:{ 5UT -> 0x0132, Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 == 0) goto L_0x0132
            java.lang.Object r13 = r14.next()     // Catch:{ 5UT -> 0x0132, Exception | NoClassDefFoundError -> 0x0168 }
            X.9l7 r13 = (X.C202149l7) r13     // Catch:{ 5UT -> 0x0132, Exception | NoClassDefFoundError -> 0x0168 }
            boolean r0 = r13.A08     // Catch:{ 5UT -> 0x0132, Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 != 0) goto L_0x0111
            boolean r0 = r13.A04     // Catch:{ 5UT -> 0x0132, Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 == 0) goto L_0x0111
            java.util.HashMap r0 = r7.blockListedHardwareDecoderMap     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            boolean r0 = A05(r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 == 0) goto L_0x0132
            X.82l r0 = r8.A02(r6, r10)     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            goto L_0x0165
        L_0x0132:
            boolean r0 = r7.prioritizeAv1Dav1dOverLibgav1     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 != 0) goto L_0x014b
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            r0 = 30
            if (r13 < r0) goto L_0x014b
            boolean r0 = r7.enableDav1dAsMediaCodecAdapter     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 != 0) goto L_0x014b
            boolean r0 = r7.enableDav1dOpenGLRendering     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 != 0) goto L_0x014b
            if (r2 != 0) goto L_0x014b
            X.82l r0 = r8.A02(r6, r10)     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            goto L_0x0165
        L_0x014b:
            boolean r0 = r7.enableDav1dAsMediaCodecAdapter     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            if (r0 != 0) goto L_0x015d
            if (r2 != 0) goto L_0x015d
            java.lang.String r2 = "Build AV1 renderer attempt with Dav1d start"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            X.C131916Rh.A01(r4, r2, r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            X.9zD r0 = r8.A00()     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            goto L_0x0163
        L_0x015d:
            X.82l r0 = r8.A03(r6, r2)     // Catch:{ Exception | NoClassDefFoundError -> 0x0168 }
            r8.A02 = r3     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
        L_0x0163:
            r8.A02 = r3     // Catch:{ Exception | NoClassDefFoundError -> 0x016a }
        L_0x0165:
            r2 = r1
            r1 = r0
            goto L_0x016c
        L_0x0168:
            r2 = move-exception
            goto L_0x016c
        L_0x016a:
            r2 = move-exception
            r1 = r0
        L_0x016c:
            java.lang.String r13 = "video/av01"
            java.lang.String r0 = "N/A"
            r8.A01 = r0
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = "LibDav1dDecoder"
            r8.A01 = r0
        L_0x017a:
            boolean r0 = r7.av1ThrowExceptionOnNonDav1dDecoder
            if (r0 == 0) goto L_0x02a4
            boolean r0 = r7.prioritizeAv1HardwareDecoder
            if (r0 != 0) goto L_0x02a4
            boolean r0 = r1 instanceof exoplayer2.av1.src.LibDav1dVideoRenderer
            if (r0 != 0) goto L_0x02a4
            java.lang.String r2 = ""
            goto L_0x01a9
        L_0x0189:
            java.util.List r14 = r6.BAq(r13, r5, r5)     // Catch:{ 5UT -> 0x017a }
            if (r14 == 0) goto L_0x017a
            boolean r0 = r14.isEmpty()     // Catch:{ 5UT -> 0x017a }
            if (r0 != 0) goto L_0x017a
            java.lang.Object r0 = r14.get(r5)     // Catch:{ 5UT -> 0x017a }
            X.9l7 r0 = (X.C202149l7) r0     // Catch:{ 5UT -> 0x017a }
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = "name"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ 5UT -> 0x017a }
            throw r0     // Catch:{ 5UT -> 0x017a }
        L_0x01a4:
            java.lang.String r0 = r0.A02     // Catch:{ 5UT -> 0x017a }
            r8.A01 = r0     // Catch:{ 5UT -> 0x017a }
            goto L_0x017a
        L_0x01a9:
            java.util.List r1 = X.C203599oN.A03(r13, r5)     // Catch:{ 5UT -> 0x01c2 }
            if (r1 == 0) goto L_0x01c2
            boolean r0 = r1.isEmpty()     // Catch:{ 5UT -> 0x01c2 }
            if (r0 != 0) goto L_0x01c2
            java.lang.Object r0 = r1.get(r5)     // Catch:{ 5UT -> 0x01c2 }
            if (r0 == 0) goto L_0x01c2
            java.lang.String r0 = r0.toString()     // Catch:{ 5UT -> 0x01c2 }
            if (r0 == 0) goto L_0x01c2
            r2 = r0
        L_0x01c2:
            java.lang.String r0 = "Expected Dav1d decoder but observing %s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object) r2)
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
            throw r1
        L_0x01ce:
            r2 = r1
        L_0x01cf:
            java.lang.String r1 = r9.A0G
            if (r1 == 0) goto L_0x0240
            java.lang.String r0 = "vp9"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = "vp09"
            boolean r0 = r1.startsWith(r0)
        L_0x01e1:
            if (r0 == 0) goto L_0x024b
        L_0x01e3:
            java.lang.String r1 = r7.vp9PlaybackDecoderName
            java.lang.String r0 = "libvpx"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x024b
            java.lang.String r0 = "com.facebook.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r13 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0374 }
            r1 = 7
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0374 }
            java.lang.Class r16 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0374 }
            r0[r5] = r16     // Catch:{ Exception -> 0x0374 }
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0374 }
            r0[r3] = r14     // Catch:{ Exception -> 0x0374 }
            java.lang.Class<android.os.Handler> r14 = android.os.Handler.class
            r0[r12] = r14     // Catch:{ Exception -> 0x0374 }
            java.lang.Class<X.9zx> r14 = X.C209409zx.class
            r17 = 3
            r0[r17] = r14     // Catch:{ Exception -> 0x0374 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0374 }
            r14 = 4
            r0[r14] = r15     // Catch:{ Exception -> 0x0374 }
            r15 = 5
            r0[r15] = r16     // Catch:{ Exception -> 0x0374 }
            r14 = 6
            r0[r14] = r16     // Catch:{ Exception -> 0x0374 }
            java.lang.reflect.Constructor r16 = r13.getConstructor(r0)     // Catch:{ Exception -> 0x0374 }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0374 }
            X.AnonymousClass000.A1N(r13, r5, r3)     // Catch:{ Exception -> 0x0374 }
            long r0 = r7.rendererAllowedJoiningTimeMs     // Catch:{ Exception -> 0x0374 }
            X.AnonymousClass000.A1M(r13, r3, r0)     // Catch:{ Exception -> 0x0374 }
            android.os.Handler r0 = r8.A04     // Catch:{ Exception -> 0x0374 }
            r13[r12] = r0     // Catch:{ Exception -> 0x0374 }
            X.9zx r0 = r8.A0A     // Catch:{ Exception -> 0x0374 }
            r13[r17] = r0     // Catch:{ Exception -> 0x0374 }
            r0 = 4
            X.AnonymousClass000.A1L(r13, r5, r0)     // Catch:{ Exception -> 0x0374 }
            boolean r0 = r7.exo2Vp9UseSurfaceRenderer     // Catch:{ Exception -> 0x0374 }
            X.AnonymousClass000.A1N(r13, r15, r0)     // Catch:{ Exception -> 0x0374 }
            boolean r0 = r7.vp9BlockingReleaseSurface     // Catch:{ Exception -> 0x0374 }
            X.AnonymousClass000.A1N(r13, r14, r0)     // Catch:{ Exception -> 0x0374 }
            r0 = r16
            java.lang.Object r1 = r0.newInstance(r13)     // Catch:{ Exception -> 0x0374 }
            X.9zD r1 = (X.C208949zD) r1     // Catch:{ Exception -> 0x0374 }
            goto L_0x024f
        L_0x0240:
            java.lang.String r1 = r9.A0A
            if (r1 == 0) goto L_0x024b
            java.lang.String r0 = "codecs=\"vp"
            boolean r0 = r1.contains(r0)
            goto L_0x01e1
        L_0x024b:
            X.82l r1 = r8.A02(r6, r10)
        L_0x024f:
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r0 = r8.A09
            r17 = r0
            java.lang.String r15 = ""
            if (r2 == 0) goto L_0x0286
            java.lang.String r0 = r9.A0H
            if (r0 == 0) goto L_0x025c
            r15 = r0
        L_0x025c:
            java.lang.String r14 = "AV1_INSTANTIATION"
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r16 = X.C90484aE.A0k(r2)
            r13[r5] = r16
            X.C90514aH.A1U(r2, r13, r3)
            java.lang.String r0 = "%s: %s"
            java.lang.String r0 = java.lang.String.format(r0, r13)
            X.89B r13 = new X.89B
            r13.<init>(r15, r14, r14, r0)
            r0 = r17
            r0.B2I(r13)
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r5] = r16
            X.C90514aH.A1U(r2, r12, r3)
            java.lang.String r0 = "Build AV1 renderer attempt with Dav1d failed with %s: %s"
        L_0x0282:
            X.C131916Rh.A01(r4, r0, r12)
            goto L_0x02af
        L_0x0286:
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x02af
            java.lang.String r0 = r9.A0H
            if (r0 == 0) goto L_0x0291
            r15 = r0
        L_0x0291:
            java.lang.String r12 = "AV1_INSTANTIATION"
            java.lang.String r0 = "Dav1d Voltron module is not available for AV1 video"
            X.89B r2 = new X.89B
            r2.<init>(r15, r12, r12, r0)
            r0 = r17
            r0.B2I(r2)
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r0 = "Build AV1 renderer attempt with Dav1d failed with voltron module unavailable"
            goto L_0x0282
        L_0x02a4:
            if (r1 == 0) goto L_0x01cf
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r5] = r1
            java.lang.String r0 = "Build AV1 renderer attempt with success, impl %s"
            X.C131916Rh.A01(r4, r0, r2)
        L_0x02af:
            int r0 = r10.A01
            if (r3 != r0) goto L_0x02d6
            X.82G r11 = new X.82G
            r11.<init>()
        L_0x02b8:
            X.A09 r4 = new X.A09
            r0 = r25
            r4.<init>(r0, r8)
            android.os.Handler r0 = r8.A04
            android.os.Looper r3 = r0.getLooper()
            X.9D8 r0 = new X.9D8
            r0.<init>(r7)
            X.82F r2 = new X.82F
            r2.<init>(r3, r4, r0)
            r0 = 3
            X.B5Q[] r0 = new X.B5Q[r0]
            X.AnonymousClass000.A19(r1, r11, r2, r0)
            return r0
        L_0x02d6:
            boolean r0 = r7.enableSpatialOpusRendererExo2
            if (r0 == 0) goto L_0x032a
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x032a
            if (r23 == 0) goto L_0x032a
            java.util.List r2 = r11.A0A
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x032a
            X.9RE r0 = X.C165617ti.A0B(r2, r5)
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x032a
            X.9RE r0 = X.C165617ti.A0B(r2, r5)
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x032a
            X.9RE r0 = X.C165617ti.A0B(r2, r5)
            X.9O1 r0 = X.AnonymousClass9RE.A00(r0, r3)
            java.util.List r0 = r0.A05
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x032a
            X.9RE r0 = X.C165617ti.A0B(r2, r5)
            X.9O1 r0 = X.AnonymousClass9RE.A00(r0, r3)
            java.util.List r0 = r0.A05
            java.lang.Object r0 = r0.get(r5)
            X.9Xo r0 = (X.C196079Xo) r0
            X.9uY r0 = r0.A00
            java.lang.String r2 = r0.A0P
            java.lang.String r0 = "audio/webm"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x032a
            r11 = 0
            goto L_0x02b8
        L_0x032a:
            android.content.Context r12 = r8.A03
            X.5zM r10 = r8.A05
            X.9bG r3 = r8.A08
            boolean r2 = r7.appendReconfigurationDataForDrmContentFix
            int r0 = r7.threadSleepMsForDecoderInitFailure
            X.9JW r5 = new X.9JW
            r5.<init>(r3, r0, r2)
            X.9gf r4 = r8.A00
            boolean r9 = r9.A0K
            boolean r3 = r7.isAudioDataSummaryEnabled
            android.os.Handler r13 = r8.A04
            X.9zx r2 = r8.A0A
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            boolean r0 = r7.enablePCMBufferListener
            if (r0 == 0) goto L_0x0353
            X.82S r0 = new X.82S
            r0.<init>(r2)
            r11.add(r0)
        L_0x0353:
            int r0 = r11.size()
            X.B4c[] r0 = new X.C23092B4c[r0]
            java.lang.Object[] r0 = r11.toArray(r0)
            X.B4c[] r0 = (X.C23092B4c[]) r0
            X.82m r11 = new X.82m
            r16 = r5
            r17 = r10
            r18 = r2
            r19 = r0
            r20 = r9
            r21 = r3
            r14 = r4
            r15 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x02b8
        L_0x0374:
            r0 = move-exception
            java.lang.RuntimeException r1 = X.AnonymousClass001.A0B(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203139nN.A07(X.9XZ, X.9Xa, X.9pt):X.B5Q[]");
    }

    public C203139nN(Context context, Handler handler, AnonymousClass9OD r10, C204369pt r11, ServiceEventCallbackImpl serviceEventCallbackImpl, C199119ej r13, Map map) {
        C125145zO r1;
        this.A03 = context;
        this.A0D = map;
        AUR aur = r10.A05;
        this.A0C = aur;
        this.A06 = r10.A04;
        this.A04 = handler;
        this.A09 = serviceEventCallbackImpl;
        this.A08 = new C197179bG(serviceEventCallbackImpl);
        this.A07 = r11;
        C200729i7.A01 = aur.enableSystrace;
        this.A0A = new C209409zx(r11, aur, aur.disableTextRendererOn404LoadError, aur.disableTextRendererOn404InitSegmentLoadError, aur.disableTextRendererOn500LoadError, aur.disableTextRendererOn500InitSegmentLoadError);
        if (aur.isExo2MediaCodecReuseEnabled) {
            r1.A0L = aur.enableMediaCodecPoolingForVodVideo;
            r1.A0K = aur.enableMediaCodecPoolingForVodAudio;
            r1.A02 = aur.maxMediaCodecInstancesPerCodecName;
            r1.A03 = aur.maxMediaCodecInstancesTotal;
            r1.A0P = aur.skipMediaCodecStopOnRelease;
            r1.A0O = aur.skipAudioMediaCodecStopOnRelease;
            r1.A0B = aur.enableCodecDeadlockFix;
            r1.A0I = aur.enableMediaCodecReuseOptimizeLock;
            r1.A0J = aur.enableMediaCodecReuseOptimizeRelease;
            r1.A07 = aur.useMediaCodecPoolingForCodecByName;
            r1.A0R = aur.useVersion2_18Workarounds;
            r1.A0Q = aur.useCodecNeedsEosBufferTimestampWorkaround;
            r1.A04 = aur.releaseThreadInterval;
            A04(r1, aur);
            r1.A08 = aur.disablePoolingForDav1dMediaCodec;
        } else {
            r1 = new C125145zO();
            r1.A0P = aur.skipMediaCodecStopOnRelease;
            r1.A0O = aur.skipAudioMediaCodecStopOnRelease;
            r1.A0B = aur.enableCodecDeadlockFix;
            A04(r1, aur);
            r1.A07 = aur.useMediaCodecPoolingForCodecByName;
            r1.A0R = aur.useVersion2_18Workarounds;
            r1.A0Q = aur.useCodecNeedsEosBufferTimestampWorkaround;
        }
        r1.A0A = aur.enableAudioTrackRetry;
        this.A05 = new C125125zM(r1);
        this.A0B = r13;
    }

    public void A06(C207239um r11) {
        ServiceEventCallbackImpl serviceEventCallbackImpl;
        String str;
        if (r11.A01()) {
            AUR aur = this.A0C;
            String str2 = "null";
            if (aur.prioritizeAv1HardwareDecoder && A05(aur.blockListedHardwareDecoderMap)) {
                serviceEventCallbackImpl = this.A09;
                str = "Hardware Decoder";
            } else if (this.A02) {
                serviceEventCallbackImpl = this.A09;
                str = "Dav1d";
            } else if (Build.VERSION.SDK_INT >= 30) {
                serviceEventCallbackImpl = this.A09;
                str = "LibGav1";
            } else {
                return;
            }
            String str3 = r11.A0H;
            if (str3 != null) {
                str2 = str3;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("AV1 decoding using ");
            A0u.append(str);
            A0u.append(";");
            String str4 = this.A01;
            if (str4 == null) {
                str4 = "N/A";
            }
            serviceEventCallbackImpl.B2I(new AnonymousClass89B(str2, "AV1_INSTANTIATION", "AV1_INSTANTIATION", AnonymousClass000.A0q(str4, A0u)));
            StringBuilder A0u2 = AnonymousClass000.A0u();
            AnonymousClass000.A1D("AV1 decoding using ", str, ";", A0u2);
            String str5 = this.A01;
            if (str5 == null) {
                str5 = "N/A";
            }
            C131916Rh.A01("HeroExo2InitHelper", AnonymousClass000.A0q(str5, A0u2), new Object[0]);
        }
    }
}
