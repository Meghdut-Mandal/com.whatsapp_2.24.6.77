package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.android.exoplayer2.util.Util;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9n2  reason: invalid class name and case insensitive filesystem */
public class C202979n2 {
    public static final C199399fF[] A0a = {C199399fF.A02, C199399fF.A05, C199399fF.A06};
    public float A00 = 1.0f;
    public C202709mU A01;
    public B3Y A02;
    public C199519fS A03 = C199519fS.A05;
    public B38 A04;
    public AnonymousClass9XZ A05;
    public AnonymousClass83B A06;
    public C197169bF A07;
    public C195979Xa A08;
    public ServiceEventCallbackImpl A09;
    public C203139nN A0A;
    public C199119ej A0B;
    public String A0C = "";
    public B5Q[] A0D;
    public C201619jy A0E;
    public C22792Aw3 A0F;
    public C123675wt A0G;
    public AnonymousClass9UY A0H;
    public AtomicReference A0I;
    public final Context A0J;
    public final Handler A0K;
    public final AnonymousClass9D5 A0L;
    public final C204369pt A0M;
    public final C209409zx A0N;
    public final AUR A0O;
    public final List A0P = new CopyOnWriteArrayList();
    public final boolean A0Q;
    public final C199399fF A0R;
    public final C109585Yd A0S;
    public final AnonymousClass9OD A0T;
    public final AUJ A0U;
    public final AnonymousClass7cI A0V;
    public final Map A0W;
    public final AtomicBoolean A0X;
    public final AtomicBoolean A0Y;
    public final AtomicBoolean A0Z;

    public static String A00(AnonymousClass9XZ r5) {
        AnonymousClass9RE A0B2;
        List<AnonymousClass9O1> list;
        String str;
        if (r5 == null) {
            return null;
        }
        List list2 = r5.A0A;
        if (list2.size() < 1 || (A0B2 = C165617ti.A0B(list2, 0)) == null || (list = A0B2.A01) == null) {
            return null;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (AnonymousClass9O1 r2 : list) {
            if (r2.A00 == 3) {
                A0I2.add(r2);
            }
        }
        ArrayList A0I3 = AnonymousClass001.A0I();
        Iterator it = A0I2.iterator();
        while (it.hasNext()) {
            List list3 = ((AnonymousClass9O1) it.next()).A05;
            if (list3 != null && !list3.isEmpty()) {
                A0I3.add(list3.get(0));
            }
        }
        if (A0I3.size() != 1 || (str = ((C196079Xo) A0I3.get(0)).A00.A0R) == null) {
            return null;
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r21v1, types: [X.A18] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:74|75|(2:77|(2:80|93))|81|82) */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0467, code lost:
        if (r1.A0B != false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r1.A0D == false) goto L_0x0024;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0211 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0298 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ab A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02c5 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d4 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0328 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x034c A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0359 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0363 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x036c A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0382 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x043f A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016f A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b9 A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bc A[Catch:{ Exception -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f0 A[SYNTHETIC, Splitter:B:74:0x01f0] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0283 A[Catch:{ Exception -> 0x01d9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A01(X.C195979Xa r37, X.C202979n2 r38, boolean r39) {
        /*
            r0 = r38
            monitor-enter(r0)
            X.9ej r4 = r0.A0B     // Catch:{ all -> 0x04d5 }
            X.AUJ r3 = r0.A0U     // Catch:{ all -> 0x04d5 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A0Z     // Catch:{ all -> 0x04d5 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0X     // Catch:{ all -> 0x04d5 }
            r5 = 0
            r14 = r37
            X.B3Y r1 = r4.A01(r14, r3, r2, r1)     // Catch:{ all -> 0x04d5 }
            r0.A02 = r1     // Catch:{ all -> 0x04d5 }
            X.AUR r2 = r0.A0O     // Catch:{ all -> 0x04d5 }
            boolean r1 = r2.enableMixedCodecManifestSupport     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0024
            X.9XZ r1 = r0.A05     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0024
            boolean r1 = r1.A0D     // Catch:{ all -> 0x04d5 }
            r17 = 1
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r17 = 0
        L_0x0026:
            boolean r1 = r2.useDefaultTrackSelector     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0082
            r1 = 0
            X.83B r9 = new X.83B     // Catch:{ all -> 0x04d5 }
            r9.<init>(r1)     // Catch:{ all -> 0x04d5 }
        L_0x0030:
            r0.A06 = r9     // Catch:{ all -> 0x04d5 }
            boolean r1 = r2.useExoPlayerBuilder     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0443
            android.content.Context r1 = r0.A0J     // Catch:{ all -> 0x04d5 }
            X.9OO r6 = new X.9OO     // Catch:{ all -> 0x04d5 }
            r6.<init>(r1)     // Catch:{ all -> 0x04d5 }
            X.9zF r3 = new X.9zF     // Catch:{ all -> 0x04d5 }
            r3.<init>(r0)     // Catch:{ all -> 0x04d5 }
            boolean r1 = r6.A0A     // Catch:{ all -> 0x04d5 }
            r16 = r1 ^ 1
            X.C200319h9.A02(r16)     // Catch:{ all -> 0x04d5 }
            r1 = 4
            X.9ox r10 = new X.9ox     // Catch:{ all -> 0x04d5 }
            r10.<init>(r3, r1)     // Catch:{ all -> 0x04d5 }
            r6.A08 = r10     // Catch:{ all -> 0x04d5 }
            X.83B r3 = r0.A06     // Catch:{ all -> 0x04d5 }
            X.C200319h9.A02(r16)     // Catch:{ all -> 0x04d5 }
            X.9ox r1 = new X.9ox     // Catch:{ all -> 0x04d5 }
            r1.<init>(r3, r5)     // Catch:{ all -> 0x04d5 }
            r6.A09 = r1     // Catch:{ all -> 0x04d5 }
            X.B3Y r4 = r0.A02     // Catch:{ all -> 0x04d5 }
            X.C200319h9.A02(r16)     // Catch:{ all -> 0x04d5 }
            r3 = 3
            X.9ox r1 = new X.9ox     // Catch:{ all -> 0x04d5 }
            r1.<init>(r4, r3)     // Catch:{ all -> 0x04d5 }
            r6.A06 = r1     // Catch:{ all -> 0x04d5 }
            boolean r1 = r2.updateLoadingPriorityExo2     // Catch:{ all -> 0x04d5 }
            r20 = r1
            boolean r1 = r2.checkReadToEndBeforeUpdatingFinalState     // Catch:{ all -> 0x04d5 }
            r19 = r1
            boolean r1 = r2.continueLoadingOnSeekbarExo2     // Catch:{ all -> 0x04d5 }
            r18 = r1
            X.9XZ r1 = r0.A05     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0374
            boolean r1 = r1.A0B     // Catch:{ all -> 0x04d5 }
            r24 = 0
            if (r1 == 0) goto L_0x0376
            goto L_0x0374
        L_0x0082:
            X.9nN r9 = r0.A0A     // Catch:{ all -> 0x04d5 }
            r21 = 0
            X.AUR r4 = r9.A0C     // Catch:{ all -> 0x04d5 }
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r6 = r9.A09     // Catch:{ all -> 0x04d5 }
            X.9um r3 = r14.A0F     // Catch:{ all -> 0x04d5 }
            java.lang.String r11 = r3.A0H     // Catch:{ all -> 0x04d5 }
            if (r11 != 0) goto L_0x009a
            java.lang.String r8 = "AbrMonitorFactory"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "request.mVideoSource.mVideoId is null"
            X.C165597tg.A1H(r1, r8, r7)     // Catch:{ all -> 0x04d5 }
            goto L_0x00a4
        L_0x009a:
            boolean r1 = r4.abrMonitorEnabled     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x00a4
            X.9GZ r10 = new X.9GZ     // Catch:{ all -> 0x04d5 }
            r10.<init>(r6)     // Catch:{ all -> 0x04d5 }
            goto L_0x00a6
        L_0x00a4:
            r10 = r21
        L_0x00a6:
            if (r11 != 0) goto L_0x00b3
            java.lang.String r7 = "AbrMonitorFactory"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "request.mVideoSource.mVideoId is null"
            X.C165597tg.A1H(r1, r7, r6)     // Catch:{ all -> 0x04d5 }
            goto L_0x02ba
        L_0x00b3:
            boolean r1 = r4.abrMonitorEnabled     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x02ba
            X.9GZ r16 = new X.9GZ     // Catch:{ all -> 0x04d5 }
            r1 = r16
            r1.<init>(r6)     // Catch:{ all -> 0x04d5 }
        L_0x00be:
            X.9ej r7 = r9.A0B     // Catch:{ all -> 0x04d5 }
            X.9XE r22 = X.C199119ej.A00(r14)     // Catch:{ all -> 0x04d5 }
            X.AUR r6 = r7.A07     // Catch:{ all -> 0x04d5 }
            X.AUF r8 = r6.abrSetting     // Catch:{ all -> 0x04d5 }
            X.9jy r1 = r7.A04     // Catch:{ all -> 0x04d5 }
            r7.A02 = r10     // Catch:{ all -> 0x04d5 }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r13 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration     // Catch:{ all -> 0x04d5 }
            r23 = 0
            r24 = 0
            r19 = r13
            r20 = r8
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x04d5 }
            X.94p r8 = r7.A08     // Catch:{ all -> 0x04d5 }
            X.A0B r12 = new X.A0B     // Catch:{ all -> 0x04d5 }
            r12.<init>(r13, r8)     // Catch:{ all -> 0x04d5 }
            r7.A00 = r12     // Catch:{ all -> 0x04d5 }
            android.content.Context r11 = r7.A03     // Catch:{ all -> 0x04d5 }
            r19 = r11
            X.AUF r11 = r6.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r11 = r11.forceUpdateFormatListIfFormatSizeChanged     // Catch:{ all -> 0x04d5 }
            X.A18 r15 = new X.A18     // Catch:{ all -> 0x04d5 }
            r24 = r21
            r27 = r21
            r23 = r21
            r25 = r13
            r26 = r10
            r28 = r11
            r18 = r15
            r20 = r12
            r18.<init>((android.content.Context) r19, (X.C22774Avk) r20, (X.C22774Avk) r21, (X.AnonymousClass9XE) r22, (X.A18) r23, (X.AnonymousClass92f) r24, (com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration) r25, (X.AnonymousClass9GZ) r26, (X.C1891392j) r27, (boolean) r28)     // Catch:{ all -> 0x04d5 }
            r7.A01 = r15     // Catch:{ all -> 0x04d5 }
            X.AUQ r11 = X.AUQ.A00     // Catch:{ all -> 0x04d5 }
            X.94g r7 = new X.94g     // Catch:{ all -> 0x04d5 }
            r7.<init>()     // Catch:{ all -> 0x04d5 }
            X.AUE r7 = new X.AUE     // Catch:{ all -> 0x04d5 }
            r7.<init>()     // Catch:{ all -> 0x04d5 }
            X.9bs r10 = new X.9bs     // Catch:{ all -> 0x04d5 }
            r10.<init>(r7, r11)     // Catch:{ all -> 0x04d5 }
            X.A1A r7 = new X.A1A     // Catch:{ all -> 0x04d5 }
            r7.<init>(r10)     // Catch:{ all -> 0x04d5 }
            X.A19 r22 = new X.A19     // Catch:{ all -> 0x04d5 }
            r22.<init>()     // Catch:{ all -> 0x04d5 }
            java.util.Map r12 = r9.A0D     // Catch:{ all -> 0x04d5 }
            X.AUF r10 = r6.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r9 = r10.enableAudioIbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r9 != 0) goto L_0x0268
            boolean r9 = r10.enableAudioAbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r9 != 0) goto L_0x0268
            boolean r9 = r10.enableMultiAudioSupport     // Catch:{ all -> 0x04d5 }
            if (r9 != 0) goto L_0x0268
        L_0x012c:
            X.9SG r1 = new X.9SG     // Catch:{ all -> 0x04d5 }
            r18 = r1
            r19 = r15
            r20 = r21
            r21 = r7
            r23 = r4
            r24 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x04d5 }
            X.83B r9 = new X.83B     // Catch:{ all -> 0x04d5 }
            r9.<init>(r1)     // Catch:{ all -> 0x04d5 }
            java.util.concurrent.atomic.AtomicReference r1 = r9.A02     // Catch:{ all -> 0x04d5 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x04d5 }
            X.83A r1 = (X.AnonymousClass83A) r1     // Catch:{ all -> 0x04d5 }
            X.839 r6 = new X.839     // Catch:{ all -> 0x04d5 }
            r6.<init>(r1)     // Catch:{ all -> 0x04d5 }
            boolean r1 = r14.A00()     // Catch:{ all -> 0x04d5 }
            r4 = 1
            if (r1 == 0) goto L_0x0171
            X.AUF r1 = r2.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r1 = r1.liveShouldFilterHardwareCapabilities     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x0177
        L_0x015c:
            boolean r1 = r2.exceedRendererCapabilitiesIfAllFilteredOut     // Catch:{ all -> 0x04d5 }
            r6.A04 = r1     // Catch:{ all -> 0x04d5 }
            X.AUF r7 = r2.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r1 = r7.enableAudioAbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x02be
            boolean r1 = r7.enableAudioIbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x02be
            boolean r7 = r7.enableMultiAudioSupport     // Catch:{ all -> 0x04d5 }
            r1 = 0
            if (r7 == 0) goto L_0x02bf
            goto L_0x02be
        L_0x0171:
            X.AUF r1 = r2.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r1 = r1.shouldFilterHardwareCapabilities     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x015c
        L_0x0177:
            android.content.Context r11 = r0.A0J     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "display"
            java.lang.Object r1 = r11.getSystemService(r1)     // Catch:{ all -> 0x04d5 }
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0189
            android.view.Display r8 = r1.getDisplay(r5)     // Catch:{ all -> 0x04d5 }
            if (r8 != 0) goto L_0x0198
        L_0x0189:
            java.lang.String r1 = "window"
            java.lang.Object r1 = r11.getSystemService(r1)     // Catch:{ all -> 0x04d5 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x04d5 }
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch:{ all -> 0x04d5 }
            android.view.Display r8 = r1.getDefaultDisplay()     // Catch:{ all -> 0x04d5 }
        L_0x0198:
            int r1 = r8.getDisplayId()     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x024a
            android.content.Context r7 = r11.getApplicationContext()     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "uimode"
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch:{ all -> 0x04d5 }
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x024a
            int r7 = r1.getCurrentModeType()     // Catch:{ all -> 0x04d5 }
            r1 = 4
            if (r7 != r1) goto L_0x024a
            int r7 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x04d5 }
            r1 = 28
            if (r7 >= r1) goto L_0x01bc
            java.lang.String r13 = "sys.display-size"
            goto L_0x01be
        L_0x01bc:
            java.lang.String r13 = "vendor.display-size"
        L_0x01be:
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r10 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r12 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01d9 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.reflect.Method r7 = X.AnonymousClass001.A0G(r10, r1, r12, r7, r5)     // Catch:{ Exception -> 0x01d9 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01d9 }
            r1[r5] = r13     // Catch:{ Exception -> 0x01d9 }
            java.lang.Object r12 = r7.invoke(r10, r1)     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01d9 }
            goto L_0x01ea
        L_0x01d9:
            r10 = move-exception
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "Failed to read system property "
            java.lang.String r7 = X.AnonymousClass000.A0p(r1, r13, r7)     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "Util"
            android.util.Log.e(r1, r7, r10)     // Catch:{ all -> 0x04d5 }
            r12 = 0
        L_0x01ea:
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x0220
            java.lang.String r10 = r12.trim()     // Catch:{ NumberFormatException -> 0x0211 }
            java.lang.String r7 = "x"
            r1 = -1
            java.lang.String[] r10 = r10.split(r7, r1)     // Catch:{ NumberFormatException -> 0x0211 }
            int r7 = r10.length     // Catch:{ NumberFormatException -> 0x0211 }
            r1 = 2
            if (r7 != r1) goto L_0x0211
            int r7 = X.C165617ti.A08(r10, r5)     // Catch:{ NumberFormatException -> 0x0211 }
            int r1 = X.C165617ti.A08(r10, r4)     // Catch:{ NumberFormatException -> 0x0211 }
            if (r7 <= 0) goto L_0x0211
            if (r1 <= 0) goto L_0x0211
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ NumberFormatException -> 0x0211 }
            r10.<init>(r7, r1)     // Catch:{ NumberFormatException -> 0x0211 }
            goto L_0x0258
        L_0x0211:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "Invalid display size: "
            java.lang.String r7 = X.AnonymousClass000.A0p(r1, r12, r7)     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "Util"
            android.util.Log.e(r1, r7)     // Catch:{ all -> 0x04d5 }
        L_0x0220:
            java.lang.String r7 = com.facebook.android.exoplayer2.util.Util.A03     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "Sony"
            boolean r1 = r1.equals(r7)     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x024a
            java.lang.String r7 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "BRAVIA"
            boolean r1 = r7.startsWith(r1)     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x024a
            android.content.pm.PackageManager r7 = r11.getPackageManager()     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r1 = r7.hasSystemFeature(r1)     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x024a
            r7 = 3840(0xf00, float:5.381E-42)
            r1 = 2160(0x870, float:3.027E-42)
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ all -> 0x04d5 }
            r10.<init>(r7, r1)     // Catch:{ all -> 0x04d5 }
            goto L_0x0258
        L_0x024a:
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ all -> 0x04d5 }
            r10.<init>()     // Catch:{ all -> 0x04d5 }
            int r7 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x04d5 }
            r1 = 23
            if (r7 < r1) goto L_0x0264
            com.facebook.android.exoplayer2.util.Util.A0A(r10, r8)     // Catch:{ all -> 0x04d5 }
        L_0x0258:
            int r7 = r10.x     // Catch:{ all -> 0x04d5 }
            int r1 = r10.y     // Catch:{ all -> 0x04d5 }
            r6.A0F = r7     // Catch:{ all -> 0x04d5 }
            r6.A0E = r1     // Catch:{ all -> 0x04d5 }
            r6.A0P = r4     // Catch:{ all -> 0x04d5 }
            goto L_0x015c
        L_0x0264:
            r8.getRealSize(r10)     // Catch:{ all -> 0x04d5 }
            goto L_0x0258
        L_0x0268:
            X.9XE r26 = X.C199119ej.A00(r14)     // Catch:{ all -> 0x04d5 }
            X.AUF r10 = r6.abrSetting     // Catch:{ all -> 0x04d5 }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r9 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration     // Catch:{ all -> 0x04d5 }
            r27 = 0
            r28 = 0
            r23 = r9
            r24 = r10
            r25 = r21
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04d5 }
            boolean r10 = r9.getShouldEnableAudioIbrCache()     // Catch:{ all -> 0x04d5 }
            if (r10 == 0) goto L_0x028d
            X.9CC r11 = new X.9CC     // Catch:{ all -> 0x04d5 }
            r11.<init>(r1)     // Catch:{ all -> 0x04d5 }
            X.9JE r10 = new X.9JE     // Catch:{ all -> 0x04d5 }
            r10.<init>(r11, r1, r6)     // Catch:{ all -> 0x04d5 }
        L_0x028d:
            X.A0B r10 = new X.A0B     // Catch:{ all -> 0x04d5 }
            r10.<init>(r9, r8)     // Catch:{ all -> 0x04d5 }
            X.AUF r6 = r6.abrSetting     // Catch:{ all -> 0x04d5 }
            boolean r8 = r6.enableAudioAbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r8 == 0) goto L_0x02ab
            X.B5Y r25 = r1.A03()     // Catch:{ all -> 0x04d5 }
            X.A17 r21 = new X.A17     // Catch:{ all -> 0x04d5 }
            r23 = r21
            r24 = r10
            r27 = r16
            r28 = r6
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04d5 }
            goto L_0x012c
        L_0x02ab:
            boolean r1 = r6.enableMultiAudioSupport     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x02b3
            boolean r1 = r6.enableAudioIbrEvaluator     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x012c
        L_0x02b3:
            X.A18 r21 = new X.A18     // Catch:{ all -> 0x04d5 }
            r21.<init>()     // Catch:{ all -> 0x04d5 }
            goto L_0x012c
        L_0x02ba:
            r16 = r21
            goto L_0x00be
        L_0x02be:
            r1 = 1
        L_0x02bf:
            r6.A01 = r1     // Catch:{ all -> 0x04d5 }
            r6.A0O = r4     // Catch:{ all -> 0x04d5 }
            if (r17 == 0) goto L_0x02c7
            r6.A02 = r4     // Catch:{ all -> 0x04d5 }
        L_0x02c7:
            int r7 = r14.A01     // Catch:{ all -> 0x04d5 }
            r1 = 3
            java.lang.Integer[] r1 = X.C023109s.A00(r1)     // Catch:{ all -> 0x04d5 }
            r12 = r1[r7]     // Catch:{ all -> 0x04d5 }
            android.net.Uri r1 = r3.A04     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x0307
            X.9XZ r3 = r0.A05     // Catch:{ all -> 0x04d5 }
            if (r3 == 0) goto L_0x0305
            java.util.List r7 = r3.A0A     // Catch:{ all -> 0x04d5 }
            int r1 = r7.size()     // Catch:{ all -> 0x04d5 }
            if (r1 <= 0) goto L_0x02fc
            X.9RE r1 = X.C165617ti.A0B(r7, r5)     // Catch:{ all -> 0x04d5 }
            java.util.List r1 = r1.A01     // Catch:{ all -> 0x04d5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x02fc
            X.9RE r1 = X.C165617ti.A0B(r7, r5)     // Catch:{ all -> 0x04d5 }
            X.9O1 r1 = X.AnonymousClass9RE.A00(r1, r5)     // Catch:{ all -> 0x04d5 }
            java.util.List r1 = r1.A04     // Catch:{ all -> 0x04d5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0307
        L_0x02fc:
            boolean r1 = r3.A0H     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0305
            boolean r1 = r2.enableUsingASRCaptions     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0305
            goto L_0x0307
        L_0x0305:
            r7 = 0
            goto L_0x0308
        L_0x0307:
            r7 = 1
        L_0x0308:
            boolean r1 = r2.enableEmsgTrackForAll     // Catch:{ all -> 0x04d5 }
            boolean r11 = X.C90504aG.A1T(r1)
            X.9XZ r3 = r0.A05     // Catch:{ all -> 0x04d5 }
            if (r3 == 0) goto L_0x034d
            boolean r1 = r3.A0H     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x034d
            boolean r1 = r2.enableUsingASRCaptions     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x034d
            java.lang.String r7 = A00(r3)     // Catch:{ all -> 0x04d5 }
            if (r7 == 0) goto L_0x034c
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r7)     // Catch:{ all -> 0x04d5 }
            if (r1 != 0) goto L_0x034c
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x04d5 }
            r1[r5] = r7     // Catch:{ all -> 0x04d5 }
            r6.A01(r1)     // Catch:{ all -> 0x04d5 }
            X.9pt r10 = r0.A0M     // Catch:{ all -> 0x04d5 }
            java.util.List r3 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x04d5 }
            X.9fI r1 = new X.9fI     // Catch:{ all -> 0x04d5 }
            r1.<init>(r7, r3, r4)     // Catch:{ all -> 0x04d5 }
            android.os.Handler r8 = r10.A0l     // Catch:{ all -> 0x04d5 }
            java.util.List r7 = r1.A01     // Catch:{ all -> 0x04d5 }
            java.lang.String r1 = r1.A00     // Catch:{ all -> 0x04d5 }
            X.9fI r3 = new X.9fI     // Catch:{ all -> 0x04d5 }
            r3.<init>(r1, r7, r4)     // Catch:{ all -> 0x04d5 }
            r1 = 37
            X.C204369pt.A08(r8, r10, r3, r1)     // Catch:{ all -> 0x04d5 }
            r7 = 1
            goto L_0x034d
        L_0x034c:
            r7 = 0
        L_0x034d:
            r3 = 2
            if (r7 == 0) goto L_0x0354
            boolean r1 = r2.disableLiveCaptioningOnPlayerInit     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0357
        L_0x0354:
            r6.A00(r3, r4)     // Catch:{ all -> 0x04d5 }
        L_0x0357:
            if (r11 != 0) goto L_0x035d
            r1 = 3
            r6.A00(r1, r4)     // Catch:{ all -> 0x04d5 }
        L_0x035d:
            int r1 = r12.intValue()     // Catch:{ all -> 0x04d5 }
            if (r1 == r3) goto L_0x036c
            if (r1 != r4) goto L_0x036f
            r6.A00(r5, r4)     // Catch:{ all -> 0x04d5 }
            r6.A00(r3, r4)     // Catch:{ all -> 0x04d5 }
            goto L_0x036f
        L_0x036c:
            r6.A00(r4, r4)     // Catch:{ all -> 0x04d5 }
        L_0x036f:
            r9.A01(r6)     // Catch:{ all -> 0x04d5 }
            goto L_0x0030
        L_0x0374:
            r24 = 1
        L_0x0376:
            boolean r1 = r2.enableCancelOngoingRequestPause     // Catch:{ all -> 0x04d5 }
            r17 = r1
            boolean r15 = r2.reportUnexpectedStopLoading     // Catch:{ all -> 0x04d5 }
            boolean r1 = r14.A00()     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x043f
            long r3 = r2.ignoreLiveStreamErrorsTimeoutMs     // Catch:{ all -> 0x04d5 }
        L_0x0384:
            boolean r14 = r2.callbackFirstCaughtStreamError     // Catch:{ all -> 0x04d5 }
            int r13 = r2.microStallThresholdMsToUseMinBuffer     // Catch:{ all -> 0x04d5 }
            boolean r12 = r2.useMultiPeriodBufferCalculation     // Catch:{ all -> 0x04d5 }
            boolean r11 = r2.useThreadSafeStandaloneClock     // Catch:{ all -> 0x04d5 }
            boolean r9 = r2.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x04d5 }
            boolean r8 = r2.improveLooping     // Catch:{ all -> 0x04d5 }
            boolean r7 = r2.preventTextRendererDelay     // Catch:{ all -> 0x04d5 }
            boolean r5 = r2.fixPeriodTransitionWithNonZeroStartPosition     // Catch:{ all -> 0x04d5 }
            boolean r2 = r2.exoPlayerUpgrade218verifyApplicationThread     // Catch:{ all -> 0x04d5 }
            X.9dD r1 = new X.9dD     // Catch:{ all -> 0x04d5 }
            r26 = r15
            r27 = r14
            r28 = r12
            r29 = r11
            r30 = r9
            r31 = r8
            r32 = r7
            r33 = r5
            r34 = r2
            r21 = r20
            r22 = r19
            r23 = r18
            r25 = r17
            r17 = r1
            r18 = r13
            r19 = r3
            r17.<init>(r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x04d5 }
            r6.A04 = r1     // Catch:{ all -> 0x04d5 }
            r1 = 1
            X.C200319h9.A02(r16)     // Catch:{ all -> 0x04d5 }
            r6.A0A = r1     // Catch:{ all -> 0x04d5 }
            r8 = 0
            java.lang.Object r7 = r10.get()     // Catch:{ all -> 0x04d5 }
            X.B4U r7 = (X.B4U) r7     // Catch:{ all -> 0x04d5 }
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r9 = r8
            X.B5Q[] r19 = r7.B4r(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x04d5 }
            X.Ay9 r1 = r6.A09     // Catch:{ all -> 0x04d5 }
            java.lang.Object r13 = r1.get()     // Catch:{ all -> 0x04d5 }
            X.9GL r13 = (X.AnonymousClass9GL) r13     // Catch:{ all -> 0x04d5 }
            X.Ay9 r1 = r6.A06     // Catch:{ all -> 0x04d5 }
            java.lang.Object r12 = r1.get()     // Catch:{ all -> 0x04d5 }
            X.B3Y r12 = (X.B3Y) r12     // Catch:{ all -> 0x04d5 }
            X.Ay9 r1 = r6.A05     // Catch:{ all -> 0x04d5 }
            java.lang.Object r11 = r1.get()     // Catch:{ all -> 0x04d5 }
            X.Avk r11 = (X.C22774Avk) r11     // Catch:{ all -> 0x04d5 }
            X.B40 r1 = r6.A03     // Catch:{ all -> 0x04d5 }
            r18 = r1
            X.9dD r1 = r6.A04     // Catch:{ all -> 0x04d5 }
            boolean r2 = r1.A0C     // Catch:{ all -> 0x04d5 }
            r23 = r2
            boolean r2 = r1.A04     // Catch:{ all -> 0x04d5 }
            r24 = r2
            boolean r2 = r1.A02     // Catch:{ all -> 0x04d5 }
            r25 = r2
            boolean r2 = r1.A08     // Catch:{ all -> 0x04d5 }
            r26 = r2
            boolean r2 = r1.A05     // Catch:{ all -> 0x04d5 }
            r27 = r2
            boolean r2 = r1.A0B     // Catch:{ all -> 0x04d5 }
            r16 = r2
            long r3 = r1.A01     // Catch:{ all -> 0x04d5 }
            boolean r15 = r1.A03     // Catch:{ all -> 0x04d5 }
            int r14 = r1.A00     // Catch:{ all -> 0x04d5 }
            boolean r10 = r1.A0E     // Catch:{ all -> 0x04d5 }
            boolean r9 = r1.A0F     // Catch:{ all -> 0x04d5 }
            boolean r8 = r1.A0D     // Catch:{ all -> 0x04d5 }
            boolean r7 = r1.A09     // Catch:{ all -> 0x04d5 }
            boolean r6 = r1.A0A     // Catch:{ all -> 0x04d5 }
            boolean r5 = r1.A07     // Catch:{ all -> 0x04d5 }
            boolean r2 = r1.A06     // Catch:{ all -> 0x04d5 }
            X.9mU r1 = new X.9mU     // Catch:{ all -> 0x04d5 }
            r28 = r16
            r29 = r15
            r30 = r10
            r31 = r9
            r32 = r8
            r33 = r7
            r34 = r6
            r35 = r5
            r36 = r2
            r17 = r11
            r20 = r14
            r21 = r3
            r14 = r1
            r15 = r12
            r16 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x04d5 }
            goto L_0x04aa
        L_0x043f:
            long r3 = r2.ignoreStreamErrorsTimeoutMs     // Catch:{ all -> 0x04d5 }
            goto L_0x0384
        L_0x0443:
            X.B5Q[] r1 = r0.A0D     // Catch:{ all -> 0x04d5 }
            r21 = r1
            X.B3Y r1 = r0.A02     // Catch:{ all -> 0x04d5 }
            r17 = r1
            X.9ej r1 = r0.A0B     // Catch:{ all -> 0x04d5 }
            X.Avk r1 = r1.A00     // Catch:{ all -> 0x04d5 }
            r19 = r1
            X.B40 r20 = X.B40.A00     // Catch:{ all -> 0x04d5 }
            boolean r1 = r2.updateLoadingPriorityExo2     // Catch:{ all -> 0x04d5 }
            r25 = r1
            boolean r1 = r2.checkReadToEndBeforeUpdatingFinalState     // Catch:{ all -> 0x04d5 }
            r26 = r1
            boolean r1 = r2.continueLoadingOnSeekbarExo2     // Catch:{ all -> 0x04d5 }
            r27 = r1
            X.9XZ r1 = r0.A05     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x0469
            boolean r1 = r1.A0B     // Catch:{ all -> 0x04d5 }
            r28 = 0
            if (r1 == 0) goto L_0x046b
        L_0x0469:
            r28 = 1
        L_0x046b:
            boolean r1 = r2.enableCancelOngoingRequestPause     // Catch:{ all -> 0x04d5 }
            r29 = r1
            boolean r15 = r2.reportUnexpectedStopLoading     // Catch:{ all -> 0x04d5 }
            boolean r1 = r14.A00()     // Catch:{ all -> 0x04d5 }
            if (r1 == 0) goto L_0x04ad
            long r3 = r2.ignoreLiveStreamErrorsTimeoutMs     // Catch:{ all -> 0x04d5 }
        L_0x0479:
            boolean r13 = r2.callbackFirstCaughtStreamError     // Catch:{ all -> 0x04d5 }
            int r12 = r2.microStallThresholdMsToUseMinBuffer     // Catch:{ all -> 0x04d5 }
            boolean r11 = r2.useMultiPeriodBufferCalculation     // Catch:{ all -> 0x04d5 }
            boolean r10 = r2.useThreadSafeStandaloneClock     // Catch:{ all -> 0x04d5 }
            boolean r8 = r2.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x04d5 }
            boolean r7 = r2.improveLooping     // Catch:{ all -> 0x04d5 }
            boolean r6 = r2.preventTextRendererDelay     // Catch:{ all -> 0x04d5 }
            boolean r5 = r2.fixPeriodTransitionWithNonZeroStartPosition     // Catch:{ all -> 0x04d5 }
            boolean r2 = r2.exoPlayerUpgrade218verifyApplicationThread     // Catch:{ all -> 0x04d5 }
            X.9mU r1 = new X.9mU     // Catch:{ all -> 0x04d5 }
            r16 = r1
            r18 = r9
            r22 = r12
            r23 = r3
            r30 = r15
            r31 = r13
            r32 = r11
            r33 = r10
            r34 = r8
            r35 = r7
            r36 = r6
            r37 = r5
            r38 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x04d5 }
        L_0x04aa:
            r0.A01 = r1     // Catch:{ all -> 0x04d5 }
            goto L_0x04b0
        L_0x04ad:
            long r3 = r2.ignoreStreamErrorsTimeoutMs     // Catch:{ all -> 0x04d5 }
            goto L_0x0479
        L_0x04b0:
            if (r39 == 0) goto L_0x04b9
            X.9UY r2 = r0.A0H     // Catch:{ all -> 0x04d5 }
            java.util.concurrent.CopyOnWriteArraySet r1 = r1.A0M     // Catch:{ all -> 0x04d5 }
            r1.add(r2)     // Catch:{ all -> 0x04d5 }
        L_0x04b9:
            X.9mU r3 = r0.A01     // Catch:{ all -> 0x04d5 }
            X.B5Q[] r2 = r0.A0D     // Catch:{ all -> 0x04d5 }
            r1 = 0
            r1 = r2[r1]     // Catch:{ all -> 0x04d5 }
            X.9Xx r2 = r3.A06(r1)     // Catch:{ all -> 0x04d5 }
            r1 = 7
            r2.A01(r1)     // Catch:{ all -> 0x04d5 }
            X.9D6 r1 = new X.9D6     // Catch:{ all -> 0x04d5 }
            r1.<init>(r0)     // Catch:{ all -> 0x04d5 }
            r2.A02(r1)     // Catch:{ all -> 0x04d5 }
            r2.A00()     // Catch:{ all -> 0x04d5 }
            monitor-exit(r0)
            return
        L_0x04d5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202979n2.A01(X.9Xa, X.9n2, boolean):void");
    }

    public static void A02(C202979n2 r6) {
        int i = r6.A0O.playbackAboutToFinishCallbackTriggeringRemainingDuration;
        if (i <= 0) {
            i = 2000;
        }
        long A052 = r6.A01.A05() - ((long) i);
        if (A052 > r6.A01.A05()) {
            A052 = r6.A01.A05() / 2;
        }
        C196149Xx A062 = r6.A01.A06(new C208939zC(r6));
        C200319h9.A02(!A062.A07);
        A062.A02 = A052;
        A062.A00();
    }

    public int A03(int i) {
        if (((AnonymousClass83A) this.A06.A02.get()).A02.get(i)) {
            return -1;
        }
        return 0;
    }

    public long A04() {
        if (this.A0O.isExo2UseAbsolutePosition) {
            C202709mU r1 = this.A01;
            if (C202709mU.A03(r1)) {
                return r1.A04;
            }
            long j = r1.A07.A0D;
            UUID uuid = AnonymousClass9B7.A04;
            return Util.A05(j);
        }
        C202709mU r2 = this.A01;
        if (C202709mU.A03(r2)) {
            return r2.A05;
        }
        return C202709mU.A00(r2, r2.A07.A0D);
    }

    public void A05() {
        Context context = this.A0J;
        Map map = this.A0W;
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A09;
        C201619jy r3 = this.A0E;
        AtomicBoolean atomicBoolean = this.A0Z;
        AtomicBoolean atomicBoolean2 = this.A0Y;
        AnonymousClass9OD r5 = this.A0T;
        C199119ej r1 = new C199119ej(context, r3, this.A0F, r5, serviceEventCallbackImpl, this.A0V, map, atomicBoolean, atomicBoolean2);
        this.A0B = r1;
        this.A0A = new C203139nN(context, this.A0K, r5, this.A0M, serviceEventCallbackImpl, r1, map);
    }

    public void A06(int i, int i2) {
        AnonymousClass839 r1 = new AnonymousClass839((AnonymousClass83A) this.A06.A02.get());
        r1.A00(i, AnonymousClass000.A1S(i2, -1));
        this.A06.A01(r1);
    }

    public void A07(long j) {
        C195979Xa r0 = this.A08;
        if (r0 != null && r0.A0F.A01() && !this.A0O.skipAV1PreviousKeyFrameSeek) {
            C202709mU r02 = this.A01;
            AnonymousClass9QI.A00(r02.A0I.A0g, C199399fF.A06, 5);
        }
        if (this.A0O.isExo2UseAbsolutePosition) {
            this.A01.A0A(j);
            return;
        }
        C202709mU r1 = this.A01;
        r1.A09(r1.A04(), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r5 >= 12000) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(long r10, boolean r12) {
        /*
            r9 = this;
            X.9Xa r0 = r9.A08
            if (r0 == 0) goto L_0x002e
            X.9um r0 = r0.A0F
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x002e
            X.AUR r0 = r9.A0O
            boolean r0 = r0.skipAV1PreviousKeyFrameSeek
            if (r0 != 0) goto L_0x002e
            X.9mU r0 = r9.A01
            X.9fF r1 = X.C199399fF.A06
        L_0x0016:
            if (r1 != 0) goto L_0x001a
            X.9fF r1 = X.C199399fF.A03
        L_0x001a:
            X.9zp r0 = r0.A0I
            X.9ik r0 = r0.A0g
            r4 = 5
            X.AnonymousClass9QI.A00(r0, r1, r4)
            X.AUR r7 = r9.A0O
            boolean r0 = r7.isExo2UseAbsolutePosition
            if (r0 == 0) goto L_0x0038
            X.9mU r0 = r9.A01
            r0.A0A(r10)
            return
        L_0x002e:
            X.9mU r0 = r9.A01
            if (r12 == 0) goto L_0x0035
            X.9fF r1 = r9.A0R
            goto L_0x0016
        L_0x0035:
            X.9fF r1 = X.C199399fF.A03
            goto L_0x0016
        L_0x0038:
            boolean r0 = r7.enableBackwardJumpSeekKeyframeSync
            if (r0 == 0) goto L_0x0079
            long r1 = r9.A04()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            boolean r8 = X.AnonymousClass000.A1R(r0)
            long r0 = r9.A04()
            long r0 = r0 - r10
            long r5 = java.lang.Math.abs(r0)
            r1 = 8000(0x1f40, double:3.9525E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            r1 = 12000(0x2ee0, double:5.929E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r3 = 1
            if (r0 < 0) goto L_0x005d
        L_0x005c:
            r3 = 0
        L_0x005d:
            int r2 = r7.seekParameterOptionIndex
            if (r2 < 0) goto L_0x0079
            X.9fF[] r1 = A0a
            r0 = 3
            if (r2 >= r0) goto L_0x0079
            if (r8 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0079
            r1 = r1[r2]
            X.9mU r0 = r9.A01
            if (r1 != 0) goto L_0x0072
            X.9fF r1 = X.C199399fF.A03
        L_0x0072:
            X.9zp r0 = r0.A0I
            X.9ik r0 = r0.A0g
            X.AnonymousClass9QI.A00(r0, r1, r4)
        L_0x0079:
            X.9mU r1 = r9.A01
            int r0 = r1.A04()
            r1.A09(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202979n2.A08(long, boolean):void");
    }

    public void A09(B3J b3j) {
        List list = this.A0P;
        if (list.isEmpty()) {
            AnonymousClass9UY r1 = new AnonymousClass9UY(this);
            this.A0H = r1;
            this.A01.A0M.add(r1);
        }
        list.add(b3j);
    }

    public void A0A(boolean z) {
        List list;
        int size;
        C202979n2 r1;
        C195979Xa r0;
        C202709mU r6 = this.A01;
        if (r6.A0E != z) {
            r6.A0E = z;
            r6.A03++;
            C201079ik r3 = r6.A0I.A0g;
            AnonymousClass9QI A002 = C201079ik.A00();
            A002.A00 = r3.A00.obtainMessage(1, z ? 1 : 0, 0);
            A002.A01 = r3;
            A002.A01();
            C201399jS r4 = r6.A07;
            if (!z) {
                r6.A0F = z;
                Iterator it = r6.A0M.iterator();
                while (it.hasNext()) {
                    AnonymousClass9UY r32 = (AnonymousClass9UY) it.next();
                    if (r32 != null) {
                        int i = r4.A00;
                        if (i == 3 && (r0 = r1.A08) != null && r0.A0F.A0R) {
                            A02((r1 = r32.A05));
                        }
                        for (B3J Bct : r32.A05.A0P) {
                            Bct.Bct(i, false, false);
                        }
                    } else {
                        throw AnonymousClass001.A0A("onPlayerStateChanged");
                    }
                }
            }
        }
        B38 b38 = this.A04;
        if (b38 instanceof C1689982v) {
            C1689982v r33 = (C1689982v) b38;
            int i2 = 0;
            while (true) {
                synchronized (b38) {
                    list = r33.A08;
                    size = list.size();
                }
                if (i2 < size) {
                    synchronized (b38) {
                        list.get(i2);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public C202979n2(Context context, Handler handler, C201619jy r17, C22792Aw3 aw3, C109585Yd r19, C123675wt r20, C195979Xa r21, AnonymousClass9OD r22, AnonymousClass9D5 r23, C204369pt r24, ServiceEventCallbackImpl serviceEventCallbackImpl, AUJ auj, AnonymousClass7cI r27, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, AtomicReference atomicReference) {
        AnonymousClass9OD r0 = r22;
        this.A0T = r0;
        C204369pt r8 = r24;
        this.A0M = r8;
        AUR aur = r0.A05;
        this.A0O = aur;
        this.A0J = context;
        this.A0K = handler;
        this.A0I = atomicReference;
        this.A0E = r17;
        this.A0W = map;
        this.A09 = serviceEventCallbackImpl;
        this.A0G = r20;
        this.A0S = r19;
        this.A0F = aw3;
        this.A0V = r27;
        this.A0N = new C209409zx(r8, aur, aur.disableTextRendererOn404LoadError, aur.disableTextRendererOn404InitSegmentLoadError, aur.disableTextRendererOn500LoadError, aur.disableTextRendererOn500InitSegmentLoadError);
        this.A0Z = atomicBoolean;
        this.A0Y = atomicBoolean3;
        A05();
        this.A05 = null;
        C195979Xa r3 = r21;
        try {
            if (r3.A0F.A0A != null) {
                this.A05 = C203139nN.A01(r3, aur);
            }
        } catch (AnonymousClass91X | IOException e) {
            this.A09.B2I(new AnonymousClass89B(r3.A0F.A0H, "MANIFEST", "MANIFEST_PARSE_ERROR", AnonymousClass000.A0q(e.getMessage(), C90524aI.A0i("Exception: "))));
        }
        if (this.A0O.exo2ReuseManifestAfterInitialParse) {
            this.A08 = r3;
        }
        this.A0D = this.A0A.A07(this.A05, r3, r8);
        boolean z = false;
        this.A0U = auj;
        this.A0X = atomicBoolean2;
        this.A0L = r23;
        A01(r3, this, false);
        this.A0R = new C199399fF(2000000, 0);
        Random random = new Random();
        AUR aur2 = this.A0O;
        if (aur2.enableSecondaryChannelLoggingForLite && (aur2.secondaryChannelLoggingSamplingFactor <= 0 || Double.compare(random.nextDouble(), 1.0d / ((double) this.A0O.secondaryChannelLoggingSamplingFactor)) < 0)) {
            z = true;
        }
        this.A0Q = z;
        if (z) {
            this.A07 = new C197169bF();
        }
    }
}
