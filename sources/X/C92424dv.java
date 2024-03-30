package X;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ComposeView;
import java.lang.ref.WeakReference;

/* renamed from: X.4dv  reason: invalid class name and case insensitive filesystem */
public abstract class C92424dv extends ViewGroup {
    public C158777iD A00;
    public C129136Fi A01;
    public WeakReference A02;
    public IBinder A03;
    public AnonymousClass00S A04 = C137986h4.A00.BKn(this);
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public void A02(C161337ma r4, int i) {
        ComposeView composeView = (ComposeView) this;
        r4.Bun(420213850);
        C009003v r1 = (C009003v) composeView.A01.getValue();
        if (r1 != null) {
            r1.invoke(r4, C36381kD.A0m());
        }
        C136976fO B6Z = r4.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new AnonymousClass7YI(composeView, i);
        }
    }

    public abstract boolean getShouldCreateCompositionOnAttachedToWindow();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private final void A00() {
        if (!this.A05) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Cannot add views to ");
            AnonymousClass000.A1C(this, A0u);
            throw AnonymousClass001.A0E(AnonymousClass000.A0q("; only Compose content is supported", A0u));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f2, code lost:
        r0 = X.AnonymousClass001.A09("root viewTreeParentCompositionContext is not a Recomposer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f9, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("Cannot locate windowRecomposer; View ");
        r1.append(r11);
        r0 = X.AnonymousClass000.A0g(" is not attached to a window", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r0 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        r8 = (X.C129136Fi) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r8 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r0 = r8 instanceof androidx.compose.runtime.Recomposer;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r0 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r0 = X.C108185Sm.A00((androidx.compose.runtime.Recomposer) r8);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r0 <= 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r11.isAttachedToWindow() == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        r3 = r11.getParent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if ((r3 instanceof android.view.View) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r3 = (android.view.View) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        if (r3.getId() == 16908290) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        r6 = r3;
        r3 = r3.getParent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        r8 = X.C63963Mc.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r8 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        r5 = X.C008903u.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        r0 = (X.C005102h) X.C156727aR.A0B.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        r3 = r0.plus(r5);
        r0 = (X.C162267oJ) r3.get(X.C162267oJ.A00);
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
        if (r0 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ca, code lost:
        r7 = new androidx.compose.runtime.PausableMonotonicFrameClock(r0);
        r0 = r7.A00;
        r2 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        r0 = (X.C005102h) X.C156727aR.A0A.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dd, code lost:
        if (r0 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        r0 = X.AnonymousClass001.A09("no AndroidUiDispatcher for this thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0.A02 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ea, code lost:
        r9 = new X.C10810fG();
        r2 = (X.C162277oK) r3.get(X.C162277oK.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f7, code lost:
        if (r2 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        r2 = new X.C137316fw();
        r9.element = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (r7 == null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0103, code lost:
        r0 = r3.plus(r5).plus(r2);
        r8 = new androidx.compose.runtime.Recomposer(r0);
        r2 = r8.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0114, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r8.A07 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011a, code lost:
        if ((r8 instanceof androidx.compose.runtime.Recomposer) == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011c, code lost:
        r8 = (androidx.compose.runtime.Recomposer) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0120, code lost:
        r10 = X.C009403z.A02(r0);
        r0 = X.AnonymousClass0QD.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0128, code lost:
        if (r0 == null) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012a, code lost:
        r2 = r0.getLifecycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        if (r2 == null) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0130, code lost:
        r6.addOnAttachStateChangeListener(new X.C163647qX(r6, r8, 0));
        r2.A04(new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(r6, r7, r8, r9, r10));
        r6.setTag(com.whatsapp.R.id.androidx_compose_ui_view_composition_context, r8);
        r5 = X.C12870in.A00;
        r3 = r6.getHandler();
        r0 = X.AnonymousClass03O.choreographer;
        r6.addOnAttachStateChangeListener(new X.C163397q8(X.AnonymousClass0A2.A02(X.C023109s.A00, new X.AnonymousClass03R(r3, "windowRecomposer cleanup", false).A01, new androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(r6, r8, (X.C023509x) null), r5), 1));
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a0, code lost:
        if (r5 != null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e7, code lost:
        r0 = X.AnonymousClass000.A0f(r6, "ViewTreeLifecycleOwner not found from ", X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C92424dv r11) {
        /*
            X.7iD r0 = r11.A00
            if (r0 != 0) goto L_0x0212
            r4 = 0
            r1 = 1
            r11.A05 = r1     // Catch:{ all -> 0x020c }
            X.6Fi r8 = r11.A01     // Catch:{ all -> 0x020c }
            if (r8 != 0) goto L_0x0041
            X.6Fi r8 = X.C63963Mc.A00(r11)     // Catch:{ all -> 0x020c }
            if (r8 != 0) goto L_0x016b
            android.view.ViewParent r2 = r11.getParent()     // Catch:{ all -> 0x020c }
        L_0x0016:
            boolean r0 = r2 instanceof android.view.View     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0028
            r0 = r2
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x020c }
            X.6Fi r8 = X.C63963Mc.A00(r0)     // Catch:{ all -> 0x020c }
            android.view.ViewParent r2 = r2.getParent()     // Catch:{ all -> 0x020c }
            if (r8 != 0) goto L_0x016b
            goto L_0x0016
        L_0x0028:
            java.lang.ref.WeakReference r0 = r11.A02     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r8 = r0.get()     // Catch:{ all -> 0x020c }
            X.6Fi r8 = (X.C129136Fi) r8     // Catch:{ all -> 0x020c }
            if (r8 == 0) goto L_0x0080
            boolean r0 = r8 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0041
            r0 = r8
            androidx.compose.runtime.Recomposer r0 = (androidx.compose.runtime.Recomposer) r0     // Catch:{ all -> 0x020c }
            int r0 = X.C108185Sm.A00(r0)     // Catch:{ all -> 0x020c }
            if (r0 <= 0) goto L_0x0080
        L_0x0041:
            X.7Y1 r2 = new X.7Y1     // Catch:{ all -> 0x020c }
            r2.<init>(r11)     // Catch:{ all -> 0x020c }
            r0 = -656146368(0xffffffffd8e40040, float:-2.0055178E15)
            X.77p r6 = new X.77p     // Catch:{ all -> 0x020c }
            r6.<init>(r0, r2, r1)     // Catch:{ all -> 0x020c }
            android.view.ViewGroup$LayoutParams r0 = X.C112465dw.A00     // Catch:{ all -> 0x020c }
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C113575fl.A01     // Catch:{ all -> 0x020c }
            boolean r0 = r0.compareAndSet(r4, r1)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0190
            r7 = 0
            java.lang.Integer r5 = X.C023109s.A00     // Catch:{ all -> 0x020c }
            X.0iw r3 = new X.0iw     // Catch:{ all -> 0x020c }
            r3.<init>(r1)     // Catch:{ all -> 0x020c }
            X.00T r0 = X.C156727aR.A0B     // Catch:{ all -> 0x020c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x020c }
            X.02h r0 = (X.C005102h) r0     // Catch:{ all -> 0x020c }
            X.041 r2 = X.C009403z.A02(r0)     // Catch:{ all -> 0x020c }
            androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 r1 = new androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1     // Catch:{ all -> 0x020c }
            r1.<init>(r7, r3)     // Catch:{ all -> 0x020c }
            X.03u r0 = X.C008903u.A00     // Catch:{ all -> 0x020c }
            X.AnonymousClass0A2.A02(r5, r0, r1, r2)     // Catch:{ all -> 0x020c }
            X.7Re r1 = new X.7Re     // Catch:{ all -> 0x020c }
            r1.<init>(r3)     // Catch:{ all -> 0x020c }
            java.lang.Object r2 = X.AnonymousClass6YQ.A07     // Catch:{ all -> 0x020c }
            monitor-enter(r2)     // Catch:{ all -> 0x020c }
            goto L_0x0182
        L_0x0080:
            r6 = r11
            boolean r0 = r11.isAttachedToWindow()     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01f9
            android.view.ViewParent r3 = r11.getParent()     // Catch:{ all -> 0x020c }
        L_0x008b:
            boolean r0 = r3 instanceof android.view.View     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x00a1
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x020c }
            int r2 = r3.getId()     // Catch:{ all -> 0x020c }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 == r0) goto L_0x00a1
            android.view.ViewParent r0 = r3.getParent()     // Catch:{ all -> 0x020c }
            r6 = r3
            r3 = r0
            goto L_0x008b
        L_0x00a1:
            X.6Fi r8 = X.C63963Mc.A00(r6)     // Catch:{ all -> 0x020c }
            if (r8 != 0) goto L_0x0118
            X.03u r5 = X.C008903u.A00     // Catch:{ all -> 0x020c }
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ all -> 0x020c }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x020c }
            if (r2 != r0) goto L_0x00d5
            X.00T r0 = X.C156727aR.A0B     // Catch:{ all -> 0x020c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x020c }
            X.02h r0 = (X.C005102h) r0     // Catch:{ all -> 0x020c }
        L_0x00bb:
            X.02h r3 = r0.plus(r5)     // Catch:{ all -> 0x020c }
            X.77h r0 = X.C162267oJ.A00     // Catch:{ all -> 0x020c }
            X.02i r0 = r3.get(r0)     // Catch:{ all -> 0x020c }
            X.7oJ r0 = (X.C162267oJ) r0     // Catch:{ all -> 0x020c }
            r7 = 0
            if (r0 == 0) goto L_0x00ea
            androidx.compose.runtime.PausableMonotonicFrameClock r7 = new androidx.compose.runtime.PausableMonotonicFrameClock     // Catch:{ all -> 0x020c }
            r7.<init>(r0)     // Catch:{ all -> 0x020c }
            X.5uC r0 = r7.A00     // Catch:{ all -> 0x020c }
            java.lang.Object r2 = r0.A03     // Catch:{ all -> 0x020c }
            monitor-enter(r2)     // Catch:{ all -> 0x020c }
            goto L_0x00e7
        L_0x00d5:
            java.lang.ThreadLocal r0 = X.C156727aR.A0A     // Catch:{ all -> 0x020c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x020c }
            X.02h r0 = (X.C005102h) r0     // Catch:{ all -> 0x020c }
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "no AndroidUiDispatcher for this thread"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x020c }
            goto L_0x020b
        L_0x00e7:
            r0.A02 = r4     // Catch:{ all -> 0x01e4 }
            monitor-exit(r2)     // Catch:{ all -> 0x020c }
        L_0x00ea:
            X.0fG r9 = new X.0fG     // Catch:{ all -> 0x020c }
            r9.<init>()     // Catch:{ all -> 0x020c }
            X.77i r0 = X.C162277oK.A00     // Catch:{ all -> 0x020c }
            X.02i r2 = r3.get(r0)     // Catch:{ all -> 0x020c }
            X.7oK r2 = (X.C162277oK) r2     // Catch:{ all -> 0x020c }
            if (r2 != 0) goto L_0x0100
            X.6fw r2 = new X.6fw     // Catch:{ all -> 0x020c }
            r2.<init>()     // Catch:{ all -> 0x020c }
            r9.element = r2     // Catch:{ all -> 0x020c }
        L_0x0100:
            if (r7 == 0) goto L_0x0103
            r5 = r7
        L_0x0103:
            X.02h r5 = (X.C005102h) r5     // Catch:{ all -> 0x020c }
            X.02h r0 = r3.plus(r5)     // Catch:{ all -> 0x020c }
            X.02h r0 = r0.plus(r2)     // Catch:{ all -> 0x020c }
            androidx.compose.runtime.Recomposer r8 = new androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x020c }
            r8.<init>(r0)     // Catch:{ all -> 0x020c }
            java.lang.Object r2 = r8.A0C     // Catch:{ all -> 0x020c }
            monitor-enter(r2)     // Catch:{ all -> 0x020c }
            r8.A07 = r1     // Catch:{ all -> 0x01e4 }
            goto L_0x011f
        L_0x0118:
            boolean r0 = r8 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01f2
            androidx.compose.runtime.Recomposer r8 = (androidx.compose.runtime.Recomposer) r8     // Catch:{ all -> 0x020c }
            goto L_0x016b
        L_0x011f:
            monitor-exit(r2)     // Catch:{ all -> 0x020c }
            X.041 r10 = X.C009403z.A02(r0)     // Catch:{ all -> 0x020c }
            X.012 r0 = X.AnonymousClass0QD.A00(r6)     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01e7
            X.01M r2 = r0.getLifecycle()     // Catch:{ all -> 0x020c }
            if (r2 == 0) goto L_0x01e7
            X.7qX r0 = new X.7qX     // Catch:{ all -> 0x020c }
            r0.<init>(r6, r8, r4)     // Catch:{ all -> 0x020c }
            r6.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x020c }
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r5 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2     // Catch:{ all -> 0x020c }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x020c }
            r2.A04(r5)     // Catch:{ all -> 0x020c }
            r0 = 2131427727(0x7f0b018f, float:1.8477078E38)
            r6.setTag(r0, r8)     // Catch:{ all -> 0x020c }
            X.0in r5 = X.C12870in.A00     // Catch:{ all -> 0x020c }
            android.os.Handler r3 = r6.getHandler()     // Catch:{ all -> 0x020c }
            java.lang.String r2 = "windowRecomposer cleanup"
            android.view.Choreographer r0 = X.AnonymousClass03O.choreographer     // Catch:{ all -> 0x020c }
            X.03R r0 = new X.03R     // Catch:{ all -> 0x020c }
            r0.<init>(r3, r2, r4)     // Catch:{ all -> 0x020c }
            X.03R r3 = r0.A01     // Catch:{ all -> 0x020c }
            r0 = 0
            androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 r2 = new androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1     // Catch:{ all -> 0x020c }
            r2.<init>(r6, r8, r0)     // Catch:{ all -> 0x020c }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x020c }
            X.0A6 r2 = X.AnonymousClass0A2.A02(r0, r3, r2, r5)     // Catch:{ all -> 0x020c }
            X.7q8 r0 = new X.7q8     // Catch:{ all -> 0x020c }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x020c }
            r6.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x020c }
        L_0x016b:
            boolean r0 = r8 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x0178
            r0 = r8
            androidx.compose.runtime.Recomposer r0 = (androidx.compose.runtime.Recomposer) r0     // Catch:{ all -> 0x020c }
            int r0 = X.C108185Sm.A00(r0)     // Catch:{ all -> 0x020c }
            if (r0 <= 0) goto L_0x0041
        L_0x0178:
            if (r8 == 0) goto L_0x0041
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r8)     // Catch:{ all -> 0x020c }
            r11.A02 = r0     // Catch:{ all -> 0x020c }
            goto L_0x0041
        L_0x0182:
            java.util.List r0 = X.AnonymousClass6YQ.A03     // Catch:{ all -> 0x01e4 }
            java.util.ArrayList r0 = X.C007103b.A0T(r1, r0)     // Catch:{ all -> 0x01e4 }
            X.AnonymousClass6YQ.A03 = r0     // Catch:{ all -> 0x01e4 }
            monitor-exit(r2)     // Catch:{ all -> 0x020c }
            X.7WL r0 = X.AnonymousClass7WL.A00     // Catch:{ all -> 0x020c }
            X.AnonymousClass6YQ.A09(r0)     // Catch:{ all -> 0x020c }
        L_0x0190:
            int r0 = r11.getChildCount()     // Catch:{ all -> 0x020c }
            if (r0 <= 0) goto L_0x01e0
            android.view.View r5 = r11.getChildAt(r4)     // Catch:{ all -> 0x020c }
            boolean r0 = r5 instanceof androidx.compose.ui.platform.AndroidComposeView     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01a2
            androidx.compose.ui.platform.AndroidComposeView r5 = (androidx.compose.ui.platform.AndroidComposeView) r5     // Catch:{ all -> 0x020c }
            if (r5 != 0) goto L_0x01b4
        L_0x01a2:
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x020c }
            X.02h r0 = r8.A07()     // Catch:{ all -> 0x020c }
            androidx.compose.ui.platform.AndroidComposeView r5 = new androidx.compose.ui.platform.AndroidComposeView     // Catch:{ all -> 0x020c }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x020c }
            android.view.ViewGroup$LayoutParams r0 = X.C112465dw.A00     // Catch:{ all -> 0x020c }
            r11.addView((android.view.View) r5, (android.view.ViewGroup.LayoutParams) r0)     // Catch:{ all -> 0x020c }
        L_0x01b4:
            X.6gp r1 = r5.A0W     // Catch:{ all -> 0x020c }
            X.6fD r0 = new X.6fD     // Catch:{ all -> 0x020c }
            r0.<init>(r1)     // Catch:{ all -> 0x020c }
            X.6fP r3 = new X.6fP     // Catch:{ all -> 0x020c }
            r3.<init>(r0, r8)     // Catch:{ all -> 0x020c }
            r0 = 2131435387(0x7f0b1f7b, float:1.8492615E38)
            r2 = 2131435387(0x7f0b1f7b, float:1.8492615E38)
            java.lang.Object r1 = r5.getTag(r0)     // Catch:{ all -> 0x020c }
            boolean r0 = r1 instanceof androidx.compose.ui.platform.WrappedComposition     // Catch:{ all -> 0x020c }
            if (r0 == 0) goto L_0x01d2
            androidx.compose.ui.platform.WrappedComposition r1 = (androidx.compose.ui.platform.WrappedComposition) r1     // Catch:{ all -> 0x020c }
            if (r1 != 0) goto L_0x01da
        L_0x01d2:
            androidx.compose.ui.platform.WrappedComposition r1 = new androidx.compose.ui.platform.WrappedComposition     // Catch:{ all -> 0x020c }
            r1.<init>(r3, r5)     // Catch:{ all -> 0x020c }
            r5.setTag(r2, r1)     // Catch:{ all -> 0x020c }
        L_0x01da:
            r1.Bqa(r6)     // Catch:{ all -> 0x020c }
            r11.A00 = r1     // Catch:{ all -> 0x020c }
            goto L_0x0210
        L_0x01e0:
            r11.removeAllViews()     // Catch:{ all -> 0x020c }
            goto L_0x01a2
        L_0x01e4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x020c }
            goto L_0x020b
        L_0x01e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "ViewTreeLifecycleOwner not found from "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r6, r0, r1)     // Catch:{ all -> 0x020c }
            goto L_0x020b
        L_0x01f2:
            java.lang.String r0 = "root viewTreeParentCompositionContext is not a Recomposer"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x020c }
            goto L_0x020b
        L_0x01f9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x020c }
            java.lang.String r0 = "Cannot locate windowRecomposer; View "
            r1.append(r0)     // Catch:{ all -> 0x020c }
            r1.append(r11)     // Catch:{ all -> 0x020c }
            java.lang.String r0 = " is not attached to a window"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x020c }
        L_0x020b:
            throw r0     // Catch:{ all -> 0x020c }
        L_0x020c:
            r0 = move-exception
            r11.A05 = r4
            throw r0
        L_0x0210:
            r11.A05 = r4
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92424dv.A01(X.4dv):void");
    }

    private final void setParentContext(C129136Fi r3) {
        if (this.A01 != r3) {
            this.A01 = r3;
            if (r3 != null) {
                this.A02 = null;
            }
            C158777iD r0 = this.A00;
            if (r0 != null) {
                r0.dispose();
                this.A00 = null;
                if (isAttachedToWindow()) {
                    A01(this);
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.A03 != iBinder) {
            this.A03 = iBinder;
            this.A02 = null;
        }
    }

    public final boolean getHasComposition() {
        return AnonymousClass000.A1V(this.A00);
    }

    public boolean isTransitionGroup() {
        if (!this.A06 || super.isTransitionGroup()) {
            return true;
        }
        return false;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.A07 = z;
        View A0L = C36411kG.A0L(this);
        if (A0L != null) {
            ((AndroidComposeView) ((C161327mZ) A0L)).A08 = z;
        }
    }

    public final void setViewCompositionStrategy(C161197mM r2) {
        AnonymousClass00S r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
        this.A04 = r2.BKn(this);
    }

    public C92424dv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public void addView(View view, int i, int i2) {
        A00();
        super.addView(view, i, i2);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final boolean getShowLayoutBounds() {
        return this.A07;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (((ComposeView) this).A00) {
            A01(this);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View A0L = C36411kG.A0L(this);
        if (A0L != null) {
            A0L.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final void onMeasure(int i, int i2) {
        A01(this);
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        int max = Math.max(0, C36331k8.A00(this, View.MeasureSpec.getSize(i)));
        AnonymousClass000.A16(childAt, Math.max(0, AnonymousClass000.A0D(this, View.MeasureSpec.getSize(i2))), View.MeasureSpec.getMode(i2), View.MeasureSpec.makeMeasureSpec(max, View.MeasureSpec.getMode(i)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public void onRtlPropertiesChanged(int i) {
        View A0L = C36411kG.A0L(this);
        if (A0L != null) {
            A0L.setLayoutDirection(i);
        }
    }

    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A06 = true;
    }

    public final void setParentCompositionContext(C129136Fi r1) {
        setParentContext(r1);
    }

    public void addView(View view, int i) {
        A00();
        super.addView(view, i);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A00();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, layoutParams);
    }

    public void addView(View view) {
        A00();
        super.addView(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, i, layoutParams);
    }
}
