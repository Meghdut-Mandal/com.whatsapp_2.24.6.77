package androidx.compose.ui.platform;

import X.AnonymousClass012;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C10810fG;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {394}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Recomposer $recomposer;
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 $self;
    public final /* synthetic */ AnonymousClass012 $source;
    public final /* synthetic */ C10810fG $systemDurationScaleSettingConsumer;
    public final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(View view, Recomposer recomposer, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, AnonymousClass012 r5, C023509x r6, C10810fG r7) {
        super(2, r6);
        this.$systemDurationScaleSettingConsumer = r7;
        this.$recomposer = recomposer;
        this.$source = r5;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    public final C023509x create(Object obj, C023509x r9) {
        C10810fG r6 = this.$systemDurationScaleSettingConsumer;
        Recomposer recomposer = this.$recomposer;
        AnonymousClass012 r4 = this.$source;
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$this_createLifecycleAwareWindowRecomposer, recomposer, this.$self, r4, r9, r6);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        r8.B2S((java.util.concurrent.CancellationException) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r3 = r19
            int r0 = r3.label
            r4 = 1
            r6 = 0
            if (r0 == 0) goto L_0x001d
            if (r0 != r4) goto L_0x0018
            java.lang.Object r8 = r3.L$0
            X.03e r8 = (X.C007403e) r8
            X.AnonymousClass0AN.A00(r20)     // Catch:{ all -> 0x0015 }
            goto L_0x00db
        L_0x0015:
            r2 = move-exception
            goto L_0x00f9
        L_0x0018:
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0e()
            throw r2
        L_0x001d:
            X.AnonymousClass0AN.A00(r20)
            java.lang.Object r5 = r3.L$0
            X.040 r5 = (X.AnonymousClass040) r5
            X.0fG r0 = r3.$systemDurationScaleSettingConsumer     // Catch:{ all -> 0x00f5 }
            java.lang.Object r2 = r0.element     // Catch:{ all -> 0x00f5 }
            X.6fw r2 = (X.C137316fw) r2     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x00ab
            android.view.View r0 = r3.$this_createLifecycleAwareWindowRecomposer     // Catch:{ all -> 0x00f5 }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x00f5 }
            android.content.Context r14 = r0.getApplicationContext()     // Catch:{ all -> 0x00f5 }
            java.util.Map r8 = X.C63963Mc.A00     // Catch:{ all -> 0x00f5 }
            monitor-enter(r8)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r9 = r8.get(r14)     // Catch:{ all -> 0x00a8 }
            if (r9 != 0) goto L_0x008e
            android.content.ContentResolver r13 = r14.getContentResolver()     // Catch:{ all -> 0x00a8 }
            java.lang.String r11 = "animator_duration_scale"
            android.net.Uri r15 = android.provider.Settings.Global.getUriFor(r11)     // Catch:{ all -> 0x00a8 }
            r1 = -1
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x00a8 }
            X.0iw r10 = X.C05750Qx.A00(r0, r1)     // Catch:{ all -> 0x00a8 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00a8 }
            android.os.Handler r9 = X.C05450Pt.A00(r0)     // Catch:{ all -> 0x00a8 }
            r1 = 0
            X.4VO r0 = new X.4VO     // Catch:{ all -> 0x00a8 }
            r0.<init>(r9, r10, r1)     // Catch:{ all -> 0x00a8 }
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 r12 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1     // Catch:{ all -> 0x00a8 }
            r17 = r6
            r18 = r10
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00a8 }
            X.0nA r10 = new X.0nA     // Catch:{ all -> 0x00a8 }
            r10.<init>(r12)     // Catch:{ all -> 0x00a8 }
            X.041 r12 = X.C009403z.A01()     // Catch:{ all -> 0x00a8 }
            r0 = 0
            X.0jC r9 = new X.0jC     // Catch:{ all -> 0x00a8 }
            r9.<init>(r0)     // Catch:{ all -> 0x00a8 }
            android.content.ContentResolver r1 = r14.getContentResolver()     // Catch:{ all -> 0x00a8 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = android.provider.Settings.Global.getFloat(r1, r11, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x00a8 }
            X.0j1 r9 = X.C07360Xi.A01(r0, r12, r10, r9)     // Catch:{ all -> 0x00a8 }
            r8.put(r14, r9)     // Catch:{ all -> 0x00a8 }
        L_0x008e:
            X.05K r9 = (X.AnonymousClass05K) r9     // Catch:{ all -> 0x00a8 }
            monitor-exit(r8)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x00f5 }
            float r1 = X.C36441kJ.A03(r0)     // Catch:{ all -> 0x00f5 }
            X.7n0 r0 = r2.A00     // Catch:{ all -> 0x00f5 }
            r0.Bqu(r1)     // Catch:{ all -> 0x00f5 }
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r0 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch:{ all -> 0x00f5 }
            r0.<init>(r2, r6, r9)     // Catch:{ all -> 0x00f5 }
            X.0A6 r8 = X.C36391kE.A12(r0, r5)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00ab:
            r8 = r6
        L_0x00ac:
            androidx.compose.runtime.Recomposer r5 = r3.$recomposer     // Catch:{ all -> 0x00f8 }
            r3.L$0 = r8     // Catch:{ all -> 0x00f8 }
            r3.label = r4     // Catch:{ all -> 0x00f8 }
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 r4 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2     // Catch:{ all -> 0x00f8 }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x00f8 }
            X.02h r1 = r3.getContext()     // Catch:{ all -> 0x00f8 }
            X.77h r0 = X.C162267oJ.A00     // Catch:{ all -> 0x00f8 }
            X.02i r2 = r1.get(r0)     // Catch:{ all -> 0x00f8 }
            X.7oJ r2 = (X.C162267oJ) r2     // Catch:{ all -> 0x00f8 }
            if (r2 == 0) goto L_0x00ee
            X.6fM r1 = r5.A0A     // Catch:{ all -> 0x00f8 }
            androidx.compose.runtime.Recomposer$recompositionRunner$2 r0 = new androidx.compose.runtime.Recomposer$recompositionRunner$2     // Catch:{ all -> 0x00f8 }
            r0.<init>(r2, r5, r6, r4)     // Catch:{ all -> 0x00f8 }
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r3, r1, r0)     // Catch:{ all -> 0x00f8 }
            if (r0 == r7) goto L_0x00d4
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x00f8 }
        L_0x00d4:
            if (r0 == r7) goto L_0x00d8
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x00f8 }
        L_0x00d8:
            if (r0 != r7) goto L_0x00db
            return r7
        L_0x00db:
            if (r8 == 0) goto L_0x00e0
            r8.B2S(r6)
        L_0x00e0:
            X.012 r0 = r3.$source
            X.01M r1 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r3.$self
            r1.A05(r0)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00ee:
            java.lang.String r0 = "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x00f8 }
            throw r0     // Catch:{ all -> 0x00f8 }
        L_0x00f5:
            r2 = move-exception
            r8 = r6
            goto L_0x00f9
        L_0x00f8:
            r2 = move-exception
        L_0x00f9:
            if (r8 == 0) goto L_0x00fe
            r8.B2S(r6)
        L_0x00fe:
            X.012 r0 = r3.$source
            X.01M r1 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r3.$self
            r1.A05(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
