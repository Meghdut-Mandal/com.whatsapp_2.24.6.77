package X;

import android.text.TextUtils;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6lO  reason: invalid class name and case insensitive filesystem */
public class C140316lO implements UserFlowLogger {
    public static final AtomicInteger A04 = C90514aH.A17();
    public final LightweightQuickPerformanceLogger A00;
    public final Set A01 = C36441kJ.A16();
    public final Set A02 = C36441kJ.A16();
    public final boolean A03;

    public void flowDrop(long j) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        synchronized (this) {
            Set set = this.A02;
            Long valueOf = Long.valueOf(j);
            if (set.contains(valueOf)) {
                this.A00.markerDropForUserFlow(i, A0D);
            }
            set.remove(valueOf);
            this.A01.remove(valueOf);
        }
    }

    public void flowEndAbort(long j) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        synchronized (this) {
            if (!this.A03 || A03(this, j)) {
                this.A00.markerEndForUserFlow(i, (String) null, A0D, 105);
            } else {
                A01("flowEndAbort", "", i, 10294);
            }
            A00(this, j);
        }
    }

    public void flowEndCancel(long j, String str, String str2) {
        flowCancelAtPoint(j, (String) null, str, str2);
    }

    public void flowMarkError(long j, String str, String str2) {
        int A0D = C90514aH.A0D(j);
        MarkerEditor withMarker = this.A00.withMarker((int) j, A0D);
        withMarker.annotate("uf_has_error", true);
        PointEditor pointEditor = withMarker.pointEditor(str);
        if (str2 != null) {
            pointEditor.addPointData("uf_debug_info", str2);
        }
        withMarker.markerEditingCompleted();
    }

    public void flowMarkPoint(long j, String str, String str2) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        if (!this.A03 || A03(this, j)) {
            MarkerEditor withMarker = this.A00.withMarker(i, A0D);
            withMarker.pointEditor(str).addPointData("uf_debug_info", str2);
            withMarker.markerEditingCompleted();
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        A01(str, str2, i, 10088);
    }

    public boolean flowStartIfNotOngoing(long j, String str, UserFlowConfig userFlowConfig) {
        return A02(userFlowConfig, str, j, true);
    }

    public synchronized boolean isOngoingFlow(long j) {
        return A03(this, j);
    }

    public PointEditor markPointWithEditor(long j, String str, String str2) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        if (!this.A03 || A03(this, j)) {
            return this.A00.withMarker(i, A0D).pointEditor(str);
        }
        A01(str, str2, i, 10088);
        return C98084qq.A00;
    }

    public synchronized void onAppBackgrounded() {
        Set set = this.A02;
        Set set2 = this.A01;
        set.removeAll(set2);
        set2.clear();
    }

    public MarkerEditor withFlow(long j) {
        int A0D = C90514aH.A0D(j);
        return this.A00.withMarker((int) j, A0D);
    }

    public static void A00(C140316lO r2, long j) {
        Set set = r2.A02;
        Long valueOf = Long.valueOf(j);
        set.remove(valueOf);
        r2.A01.remove(valueOf);
    }

    private void A01(String str, String str2, int i, short s) {
        EventBuilder annotate = this.A00.markEventBuilder(i, "user_flow_strict_mode").setActionId(s).annotate("uf_invalid_reason", str);
        if (!TextUtils.isEmpty(str2)) {
            annotate = annotate.annotate("uf_unstarted_debug_info", str2);
        }
        annotate.report();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r24 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean A02(com.facebook.quicklog.reliability.UserFlowConfig r20, java.lang.String r21, long r22, boolean r24) {
        /*
            r19 = this;
            r2 = r19
            monitor-enter(r2)
            java.util.Set r0 = r2.A02     // Catch:{ all -> 0x006c }
            r4 = r22
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x006c }
            boolean r0 = r0.add(r3)     // Catch:{ all -> 0x006c }
            r7 = 1
            r6 = 0
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            int r9 = (int) r4     // Catch:{ all -> 0x006c }
            int r10 = X.C90514aH.A0D(r4)     // Catch:{ all -> 0x006c }
            boolean r0 = r2.A03     // Catch:{ all -> 0x006c }
            r4 = r20
            if (r0 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x0039
            if (r24 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0025:
            if (r1 == 0) goto L_0x0039
            if (r24 == 0) goto L_0x0039
        L_0x0029:
            monitor-exit(r2)
            return r6
        L_0x002b:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = r2.A00     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "trigger_source_of_restart"
            java.lang.String r0 = r4.mTriggerSource     // Catch:{ all -> 0x006c }
            r5.markerAnnotate((int) r9, (int) r10, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x006c }
            r0 = 111(0x6f, float:1.56E-43)
            r5.markerEndForUserFlow(r9, r10, r0)     // Catch:{ all -> 0x006c }
        L_0x0039:
            boolean r12 = r4.mCancelOnBackground     // Catch:{ all -> 0x006c }
            r11 = r21
            if (r21 == 0) goto L_0x004e
            com.facebook.quicklog.LightweightQuickPerformanceLogger r8 = r2.A00     // Catch:{ all -> 0x006c }
            long r13 = r4.mTtlMs     // Catch:{ all -> 0x006c }
            r8.markerStartForUserFlow((int) r9, (int) r10, (java.lang.String) r11, (boolean) r12, (long) r13)     // Catch:{ all -> 0x006c }
        L_0x0046:
            java.lang.String r1 = "trigger_source"
            java.lang.String r0 = r4.mTriggerSource     // Catch:{ all -> 0x006c }
            r8.markerAnnotate((int) r9, (int) r10, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x006c }
            goto L_0x005d
        L_0x004e:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r8 = r2.A00     // Catch:{ all -> 0x006c }
            long r0 = r4.mTtlMs     // Catch:{ all -> 0x006c }
            r13 = r8
            r14 = r9
            r15 = r10
            r16 = r12
            r17 = r0
            r13.markerStartForUserFlow(r14, r15, r16, r17)     // Catch:{ all -> 0x006c }
            goto L_0x0046
        L_0x005d:
            if (r12 == 0) goto L_0x0065
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x006c }
            r0.add(r3)     // Catch:{ all -> 0x006c }
            goto L_0x006a
        L_0x0065:
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x006c }
            r0.remove(r3)     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r2)
            return r7
        L_0x006c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140316lO.A02(com.facebook.quicklog.reliability.UserFlowConfig, java.lang.String, long, boolean):boolean");
    }

    public static boolean A03(C140316lO r1, long j) {
        return r1.A02.contains(Long.valueOf(j));
    }

    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, int i) {
        flowAnnotateWithCrucialData(j, str, i, "");
    }

    public /* synthetic */ void flowCancelAtPoint(long j, String str, String str2) {
        flowCancelAtPoint(j, str, str2, "");
    }

    public /* synthetic */ void flowEndFail(long j, String str, String str2) {
        flowEndFail(j, str, str2, "");
    }

    public /* synthetic */ void flowEndSuccess(long j) {
        flowEndSuccess(j, "");
    }

    public void flowStart(long j, String str, boolean z) {
        A02(new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), (String) null, j, false);
    }

    public long flowStartForMarker(int i, String str, boolean z) {
        long A0A = C90474aD.A0A(A04.incrementAndGet(), i);
        A02(new UserFlowConfig.UserFlowConfigBuilder(str, z).build(), (String) null, A0A, false);
        return A0A;
    }

    public long generateNewFlowId(int i) {
        return C90474aD.A0A(A04.incrementAndGet(), i);
    }

    public C140316lO(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, boolean z) {
        Objects.requireNonNull(lightweightQuickPerformanceLogger);
        this.A00 = lightweightQuickPerformanceLogger;
        this.A03 = z;
    }

    public Long flowStartIfNotOngoingForMarker(int i, int i2, String str, boolean z, long j) {
        long A0A = C90474aD.A0A(i2, i);
        UserFlowConfig.UserFlowConfigBuilder userFlowConfigBuilder = new UserFlowConfig.UserFlowConfigBuilder(str, z);
        userFlowConfigBuilder.mTtlMs = j;
        if (A02(userFlowConfigBuilder.build(), (String) null, A0A, true)) {
            return Long.valueOf(A0A);
        }
        return null;
    }

    public long generateFlowId(int i, int i2) {
        return C90474aD.A0A(i2, i);
    }

    public /* synthetic */ void flowAnnotate(long j, String str, double d) {
        flowAnnotate(j, str, d, "");
    }

    public void flowAnnotate(long j, String str, double d, String str2) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        String str3 = str;
        if (!this.A03 || A03(this, j)) {
            this.A00.markerAnnotate(i, A0D, str3, d);
        } else {
            A01(str, str2, i, 10087);
        }
    }

    public /* synthetic */ void flowAnnotate(long j, String str, int i) {
        flowAnnotate(j, str, i, "");
    }

    public void flowAnnotate(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int A0D = C90514aH.A0D(j);
        if (!this.A03 || A03(this, j)) {
            this.A00.markerAnnotate(i2, A0D, str, i);
        } else {
            A01(str, str2, i2, 10087);
        }
    }

    public /* synthetic */ void flowAnnotate(long j, String str, long j2) {
        flowAnnotate(j, str, j2, "");
    }

    public void flowAnnotate(long j, String str, long j2, String str2) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        String str3 = str;
        if (!this.A03 || A03(this, j)) {
            this.A00.markerAnnotate(i, A0D, str3, j2);
        } else {
            A01(str, str2, i, 10087);
        }
    }

    public /* synthetic */ void flowAnnotate(long j, String str, String str2) {
        flowAnnotate(j, str, str2, "");
    }

    public void flowAnnotate(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        if (!this.A03 || A03(this, j)) {
            this.A00.markerAnnotate(i, A0D, str, str2);
        } else {
            A01(str, str3, i, 10087);
        }
    }

    public /* synthetic */ void flowAnnotate(long j, String str, boolean z) {
        flowAnnotate(j, str, z, "");
    }

    public void flowAnnotate(long j, String str, boolean z, String str2) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        if (!this.A03 || A03(this, j)) {
            this.A00.markerAnnotate(i, A0D, str, z);
        } else {
            A01(str, str2, i, 10087);
        }
    }

    public void flowAnnotateWithCrucialData(long j, String str, int i, String str2) {
        int i2 = (int) j;
        int A0D = C90514aH.A0D(j);
        if (!this.A03 || A03(this, j)) {
            this.A00.markerAnnotateCrucialForUserFlow(i2, A0D, str, i);
        } else {
            A01(str, str2, i2, 10087);
        }
    }

    public void flowCancelAtPoint(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        lightweightQuickPerformanceLogger.markerAnnotate(i, A0D, "cancel_reason", str2);
        synchronized (this) {
            if (!this.A03 || A03(this, j)) {
                lightweightQuickPerformanceLogger.markerEndForUserFlow(i, str, A0D, 4);
            } else {
                A01(AnonymousClass000.A0p("flowCancelAtPoint|", str2, AnonymousClass000.A0u()), str3, i, 10294);
            }
            A00(this, j);
        }
    }

    public /* synthetic */ void flowEndCancel(long j, String str) {
        flowEndCancel(j, str, "");
    }

    public void flowEndFail(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        flowMarkError(j, str, str2);
        synchronized (this) {
            if (!this.A03 || A03(this, j)) {
                this.A00.markerEndForUserFlow(i, A0D, 3);
            } else {
                A01(AnonymousClass000.A0p("flowEndFail|", str, AnonymousClass000.A0u()), str3, i, 10294);
            }
            A00(this, j);
        }
    }

    public void flowEndSuccess(long j, String str) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        synchronized (this) {
            if (!this.A03 || A03(this, j)) {
                this.A00.markerEndForUserFlow(i, A0D, 2);
            } else {
                A01("flowEndSuccess", str, i, 10294);
            }
            A00(this, j);
        }
    }

    public void flowMarkPoint(long j, String str) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        if (!this.A03 || A03(this, j)) {
            this.A00.markerPoint(i, A0D, str);
        } else {
            A01(str, "", i, 10088);
        }
    }

    public void flowStart(long j, String str, boolean z, long j2) {
        UserFlowConfig.UserFlowConfigBuilder userFlowConfigBuilder = new UserFlowConfig.UserFlowConfigBuilder(str, z);
        userFlowConfigBuilder.mTtlMs = j2;
        A02(userFlowConfigBuilder.build(), (String) null, j, false);
    }

    public boolean flowStartIfNotOngoing(long j, UserFlowConfig userFlowConfig) {
        return A02(userFlowConfig, (String) null, j, true);
    }

    public /* synthetic */ PointEditor markPointWithEditor(long j, String str) {
        return markPointWithEditor(j, str, "");
    }

    public void flowStart(long j, UserFlowConfig userFlowConfig) {
        A02(userFlowConfig, (String) null, j, false);
    }

    public void flowAnnotateWithCrucialData(long j, String str, String str2, String str3) {
        int i = (int) j;
        int A0D = C90514aH.A0D(j);
        if (!this.A03 || A03(this, j)) {
            this.A00.markerAnnotateCrucialForUserFlow(i, A0D, str, str2);
        } else {
            A01(str, str3, i, 10087);
        }
    }

    public /* synthetic */ void flowAnnotateWithCrucialData(long j, String str, String str2) {
        flowAnnotateWithCrucialData(j, str, str2, "");
    }

    public void flowStart(long j, String str, UserFlowConfig userFlowConfig) {
        UserFlowConfig userFlowConfig2 = userFlowConfig;
        A02(userFlowConfig2, str, j, false);
    }
}
