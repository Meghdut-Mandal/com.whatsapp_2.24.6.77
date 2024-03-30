package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9ej  reason: invalid class name and case insensitive filesystem */
public class C199119ej {
    public C22774Avk A00;
    public A18 A01;
    public AnonymousClass9GZ A02;
    public final Context A03;
    public final C201619jy A04;
    public final C202509m3 A05;
    public final AnonymousClass9NV A06;
    public final AUR A07;
    public final C1896394p A08;
    public final AtomicBoolean A09;
    public final AtomicBoolean A0A;
    public final AnonymousClass94B A0B;
    public final AnonymousClass9D1 A0C;
    public final C22792Aw3 A0D;
    public final ServiceEventCallbackImpl A0E;
    public final AnonymousClass7cI A0F;
    public final Map A0G;
    public final AtomicReference A0H;
    public final AtomicReference A0I;

    public static AnonymousClass9XE A00(C195979Xa r3) {
        AnonymousClass9XE r2 = new AnonymousClass9XE();
        C207239um r1 = r3.A0F;
        r2.A00(C90504aG.A1T(r1.A0O ? 1 : 0));
        synchronized (r2) {
        }
        synchronized (r2) {
        }
        boolean z = r1.A0P;
        synchronized (r2) {
            r2.A05 = z;
        }
        String str = r1.A0B;
        synchronized (r2) {
            r2.A00 = str;
        }
        String str2 = r1.A0C;
        synchronized (r2) {
            r2.A01 = str2;
        }
        synchronized (r2) {
        }
        synchronized (r2) {
            r2.A06 = false;
        }
        Uri uri = r1.A05;
        if (uri != null) {
            uri.getHost();
            synchronized (r2) {
            }
        }
        synchronized (r2) {
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d1, code lost:
        if (X.C165587tf.A06("dash.use_play_when_ready_for_load_control", r2) == 0) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B3Y A01(X.C195979Xa r26, X.AUJ r27, java.util.concurrent.atomic.AtomicBoolean r28, java.util.concurrent.atomic.AtomicBoolean r29) {
        /*
            r25 = this;
            r9 = r26
            X.9um r7 = r9.A0F
            r6 = r25
            X.AUR r5 = r6.A07
            boolean r0 = r5.useWAPlayerPoolLoadControl
            if (r0 == 0) goto L_0x005a
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x005a
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x005a
            r0 = 32768(0x8000, float:4.5918E-41)
            X.9Ws r3 = new X.9Ws
            r3.<init>(r0)
            X.9Ua r4 = new X.9Ua
            r4.<init>()
            r2 = 700(0x2bc, float:9.81E-43)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 100
            r4.A00(r2, r1, r0, r0)
            boolean r0 = r4.A06
            r0 = r0 ^ 1
            X.C200319h9.A02(r0)
            r4.A05 = r3
        L_0x0033:
            boolean r0 = r4.A06
            r1 = 1
            r0 = r0 ^ 1
            X.C200319h9.A02(r0)
            r4.A06 = r1
            X.9Ws r5 = r4.A05
            if (r5 != 0) goto L_0x004a
            r0 = 65536(0x10000, float:9.18355E-41)
            X.9Ws r5 = new X.9Ws
            r5.<init>(r0)
            r4.A05 = r5
        L_0x004a:
            int r6 = r4.A03
            int r7 = r4.A02
            int r8 = r4.A01
            int r9 = r4.A00
            int r10 = r4.A04
            X.9zA r4 = new X.9zA
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x005a:
            int r8 = android.os.Build.VERSION.SDK_INT
            int r0 = r5.sdkVersionToUseDefaultLoadControl
            if (r8 >= r0) goto L_0x00ae
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x00a8
            int r0 = r5.sdkVersionToUseConservativeLoadControl
            if (r8 >= r0) goto L_0x00a8
            r4 = 32768(0x8000, float:4.5918E-41)
            r6 = 2000(0x7d0, float:2.803E-42)
            int r0 = r5.sdKVersionToUseCustomizedBuffering
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r8 > r0) goto L_0x00a3
            int r4 = r5.customizedWAIndividualAllocationSize
            int r3 = r5.minCustomizedWABufferMs
            int r6 = r5.maxCustomizedWABufferMs
            int r1 = r5.customizedWABufferForPlaybackMs
            int r0 = r5.customizedWARebufferMs
        L_0x007d:
            X.9Ws r2 = new X.9Ws
            r2.<init>(r4)
            X.9Ua r4 = new X.9Ua
            r4.<init>()
            r4.A00(r3, r6, r1, r0)
            boolean r0 = r4.A06
            r1 = r0 ^ 1
            X.C200319h9.A02(r1)
            r4.A05 = r2
            int r0 = r5.sdKVersionToUseTargetBufferOverwrite
            if (r0 <= 0) goto L_0x0033
            if (r8 > r0) goto L_0x0033
            int r0 = r5.targetBytesForOverwrite
            if (r0 <= 0) goto L_0x0033
            X.C200319h9.A02(r1)
            r4.A04 = r0
            goto L_0x0033
        L_0x00a3:
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x007d
        L_0x00a8:
            X.9zA r4 = new X.9zA
            r4.<init>()
            return r4
        L_0x00ae:
            X.9Sz r4 = new X.9Sz
            r4.<init>()
            r0 = r27
            int r1 = r0.minBufferMs
            int r0 = r0.minRebufferMs
            r4.A02 = r1
            r4.A01 = r0
            int r12 = r9.A02
            r3 = 1
            if (r12 > 0) goto L_0x00d3
            java.util.Map r2 = r6.A0G
            java.lang.String r1 = "dash.use_play_when_ready_for_load_control"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00d3
            int r1 = X.C165587tf.A06(r1, r2)
            r0 = 1
            if (r1 != 0) goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            r4.A0H = r0
            r24 = r28
            r0 = r24
            r4.A0B = r0
            r17 = r29
            r0 = r17
            r4.A0A = r0
            X.94B r0 = r6.A0B
            r4.A06 = r0
            X.9m3 r14 = r6.A05
            r4.A09 = r14
            X.9D1 r0 = r6.A0C
            r4.A08 = r0
            X.AUI r0 = r5.intentBasedBufferingConfig
            r16 = r0
            r2 = 0
            int r15 = r5.playerWarmUpWatermarkMs
            int r13 = r5.dashLowWatermarkMs
            int r10 = r5.dashHighWatermarkMs
            java.lang.Integer r1 = r9.A06
            boolean r0 = r5.useCellMaxWaterMarkMsConfig
            X.9eU r11 = new X.9eU
            r18 = r17
            r19 = r15
            r20 = r12
            r21 = r13
            r22 = r10
            r23 = r0
            r15 = r16
            r16 = r1
            r17 = r24
            r13 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            android.net.Uri r0 = r7.A05
            boolean r0 = X.AnonymousClass94D.A00(r0)
            if (r0 != 0) goto L_0x012e
            java.lang.Integer r1 = r7.A07
            java.lang.Integer r0 = X.C023109s.A01
            boolean r0 = X.C36371kC.A1W(r1, r0)
            X.C200319h9.A01(r0)
            java.lang.String r0 = r7.A0A
            if (r0 == 0) goto L_0x012e
            r4.A07 = r11
        L_0x012e:
            r1 = 65536(0x10000, float:9.18355E-41)
            int r0 = r5.sdKVersionToUseCustomizedBuffering
            boolean r10 = X.C90504aG.A1U(r8, r0)
            boolean r9 = r9.A0G
            if (r9 == 0) goto L_0x013e
            if (r10 == 0) goto L_0x0244
            int r1 = r5.customizedWAIndividualAllocationSize
        L_0x013e:
            X.9Ws r0 = new X.9Ws
            r0.<init>(r1)
            r4.A05 = r0
            java.lang.Integer r0 = r7.A07
            java.lang.Integer r1 = X.C023109s.A0C
            if (r0 != r1) goto L_0x0159
            boolean r0 = r5.useWatermarkEvaluatorForProgressive
            if (r0 == 0) goto L_0x0151
            r4.A07 = r11
        L_0x0151:
            boolean r0 = r5.useMaxBufferForProgressive
            if (r0 != 0) goto L_0x0159
            r0 = 2097152(0x200000, float:2.938736E-39)
            r4.A03 = r0
        L_0x0159:
            if (r9 == 0) goto L_0x0190
            int r0 = r5.sdkVersionToUseConservativeLoadControl
            if (r8 >= r0) goto L_0x0190
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r10 == 0) goto L_0x023e
            int r9 = r5.customizedWABufferForPlaybackMs
            int r0 = r5.customizedWARebufferMs
        L_0x0167:
            r4.A02 = r9
            r4.A01 = r0
            if (r10 == 0) goto L_0x023a
            int r8 = r5.minCustomizedWABufferMs
            int r0 = r5.maxCustomizedWABufferMs
        L_0x0171:
            java.util.concurrent.atomic.AtomicBoolean r13 = new java.util.concurrent.atomic.AtomicBoolean
            r13.<init>(r2)
            java.util.concurrent.atomic.AtomicBoolean r14 = new java.util.concurrent.atomic.AtomicBoolean
            r14.<init>(r2)
            java.lang.Integer r12 = X.C023109s.A00
            r10 = 0
            r16 = -1
            r15 = 1000(0x3e8, float:1.401E-42)
            X.9eU r9 = new X.9eU
            r19 = 0
            r11 = r10
            r17 = r8
            r18 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A07 = r9
        L_0x0190:
            boolean r0 = r5.disableCapBufferSizeLocalProgressive
            if (r0 == 0) goto L_0x0234
            java.lang.Integer r0 = r7.A07
            if (r0 == r1) goto L_0x01a0
            android.net.Uri r0 = r7.A05
            boolean r0 = X.AnonymousClass94D.A00(r0)
            if (r0 == 0) goto L_0x0234
        L_0x01a0:
            r4.A0F = r3
        L_0x01a2:
            int r11 = r5.videoBufferSize
            int r10 = r5.audioBufferSize
            boolean r0 = r5.enableMemoryAwareBufferSizeUsingRed
            if (r0 == 0) goto L_0x01c3
            java.util.concurrent.atomic.AtomicReference r0 = r6.A0I
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r1 = r0.get()
            X.909 r0 = X.AnonymousClass909.RED
            if (r1 == r0) goto L_0x01c2
        L_0x01b6:
            java.util.concurrent.atomic.AtomicReference r0 = r6.A0H
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r1 = r0.get()
            X.909 r0 = X.AnonymousClass909.RED
            if (r1 != r0) goto L_0x01c3
        L_0x01c2:
            r2 = 1
        L_0x01c3:
            boolean r0 = r5.enableMemoryAwareBufferSizeUsingYellow
            if (r0 == 0) goto L_0x0232
            java.util.concurrent.atomic.AtomicReference r0 = r6.A0I
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r1 = r0.get()
            X.909 r0 = X.AnonymousClass909.YELLOW
            if (r1 == r0) goto L_0x01df
        L_0x01d3:
            java.util.concurrent.atomic.AtomicReference r0 = r6.A0H
            if (r0 == 0) goto L_0x0232
            java.lang.Object r1 = r0.get()
            X.909 r0 = X.AnonymousClass909.YELLOW
            if (r1 != r0) goto L_0x0232
        L_0x01df:
            r0 = 1
        L_0x01e0:
            if (r2 != 0) goto L_0x01e4
            if (r0 == 0) goto L_0x01ec
        L_0x01e4:
            double r0 = (double) r11
            double r8 = r5.redMemoryBufferSizeMultiplier
            double r0 = r0 * r8
            int r11 = (int) r0
            double r0 = (double) r10
            double r0 = r0 * r8
            int r10 = (int) r0
        L_0x01ec:
            boolean r0 = r5.useHeroBufferSize
            r4.A0J = r0
            r4.A04 = r11
            r4.A00 = r10
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "fb_stories"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0204
            boolean r0 = r5.disableStoriesCustomizedUnstallBuffer
            if (r0 != 0) goto L_0x0204
            r4.A0E = r3
        L_0x0204:
            boolean r0 = r5.updateUnstallBufferDuringPlayback
            r4.A0I = r0
            boolean r0 = r5.reportUnexpectedStopLoading
            r4.A0G = r0
            boolean r0 = r5.forceMinWatermarkGreaterThanMinRebuffer
            r4.A0D = r0
            boolean r0 = r5.bypassGreaterThanMinRebufferWhenBeforePlay
            r4.A0C = r0
            boolean r0 = r5.useMaxOfLowWatermarkOrPrevHighWaterMarkWhenForced
            r4.A0K = r0
            java.lang.String r0 = r7.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0249
            boolean r0 = r5.useAdAwareLoadControl
            if (r0 == 0) goto L_0x0249
            X.9z9 r0 = X.AnonymousClass9z9.$redex_init_class
            X.9zB r2 = r4.A00()
            X.9ba r1 = X.C197359ba.A01
            X.9z9 r0 = new X.9z9
            r0.<init>(r2, r7, r1)
            return r0
        L_0x0232:
            r0 = 0
            goto L_0x01e0
        L_0x0234:
            boolean r0 = r5.prioritizeTimeOverSizeThresholds
            r4.A0F = r0
            goto L_0x01a2
        L_0x023a:
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L_0x0171
        L_0x023e:
            r9 = 1000(0x3e8, float:1.401E-42)
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0167
        L_0x0244:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x013e
        L_0x0249:
            X.9zB r0 = r4.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199119ej.A01(X.9Xa, X.AUJ, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean):X.B3Y");
    }

    public C199119ej(Context context, C201619jy r10, C22792Aw3 aw3, AnonymousClass9OD r12, ServiceEventCallbackImpl serviceEventCallbackImpl, AnonymousClass7cI r14, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A03 = context;
        this.A0G = map;
        AUR aur = r12.A05;
        this.A07 = aur;
        C202509m3 r4 = (C202509m3) r12.A08.get();
        this.A05 = r4;
        this.A0E = serviceEventCallbackImpl;
        C1896394p r7 = r12.A06;
        this.A08 = r7;
        this.A0F = r14;
        C201619jy r2 = r10;
        this.A06 = new AnonymousClass9NV(context, r2, new C20991A2f(), r4, serviceEventCallbackImpl, aur, r7);
        this.A0B = r12.A02;
        this.A04 = r10;
        this.A0A = atomicBoolean;
        this.A09 = atomicBoolean2;
        this.A0C = (AnonymousClass9D1) r12.A07.get();
        this.A0D = aw3;
        this.A0I = r12.A01;
        this.A0H = r12.A00;
    }
}
