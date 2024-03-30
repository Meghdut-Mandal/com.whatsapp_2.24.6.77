package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.19O  reason: invalid class name */
public final class AnonymousClass19O implements AnonymousClass19N, AnonymousClass0z8 {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public Integer A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public long A07 = -1;
    public long A08;
    public long A09;
    public final C19420v0 A0A;
    public final C20810yC A0B;
    public final XmppConnectionMetricsWorkManager A0C;
    public final AnonymousClass19W A0D;
    public final AtomicBoolean A0E = new AtomicBoolean();
    public final AtomicInteger A0F = new AtomicInteger();
    public final AtomicInteger A0G = new AtomicInteger();
    public final AtomicInteger A0H = new AtomicInteger();
    public final AnonymousClass00T A0I = new AnonymousClass00U(new AnonymousClass19X(this));
    public final AnonymousClass00T A0J = new AnonymousClass00U(new AnonymousClass19Y(this));
    public final C19970wo A0K;
    public final C21010yW A0L;
    public final AtomicInteger A0M = new AtomicInteger();

    public AnonymousClass19O(C19970wo r3, C19420v0 r4, C20810yC r5, C21010yW r6, XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager, AnonymousClass19W r8) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(xmppConnectionMetricsWorkManager, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r4, 6);
        this.A0K = r3;
        this.A0L = r6;
        this.A0C = xmppConnectionMetricsWorkManager;
        this.A0B = r5;
        this.A0D = r8;
        this.A0A = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r0 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWI(X.C201579ju r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.Integer r0 = r5.A07
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0M
            int r0 = r1.decrementAndGet()
            if (r0 >= 0) goto L_0x0010
            r1.set(r3)
        L_0x0010:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A0F
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x0048
            r2.set(r3)
        L_0x001b:
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A08 = r0
        L_0x0021:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XmppConnectionMetrics/onDuplicateStanzaRemoved incoming stanza duplicate incoming:"
            r1.append(r0)
            int r0 = r2.get()
            r1.append(r0)
            java.lang.String r0 = " unacked_offline:"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0M
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0048:
            if (r0 > 0) goto L_0x0021
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19O.BWI(X.9ju):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r0 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bh4(X.C201579ju r5) {
        /*
            r4 = this;
            r3 = 0
            java.lang.Integer r0 = r5.A07
            if (r0 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0M
            int r0 = r1.decrementAndGet()
            if (r0 >= 0) goto L_0x0010
            r1.set(r3)
        L_0x0010:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A0F
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x0048
            r2.set(r3)
        L_0x001b:
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A08 = r0
        L_0x0021:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XmppConnectionMetrics/onStanzaAcked incoming stanza processing finished incoming=:"
            r1.append(r0)
            int r0 = r2.get()
            r1.append(r0)
            java.lang.String r0 = " unacked_offline=:"
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0M
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0048:
            if (r0 > 0) goto L_0x0021
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19O.Bh4(X.9ju):void");
    }

    public /* synthetic */ void Bh5(C201579ju r1) {
    }

    private final long A00(String str, long j) {
        if (j == -1) {
            return 0;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - j);
        C21010yW r3 = this.A0L;
        AnonymousClass135 r2 = new AnonymousClass135();
        r2.A02 = str;
        r2.A00 = Long.valueOf(seconds);
        r3.Bls(r2, (C18950u5) null, false);
        return seconds;
    }

    public static final void A01(AnonymousClass19O r3) {
        if (C20800yB.A01(C21000yV.A02, r3.A0B, 3206)) {
            r3.A0C.A02();
        }
    }

    public static final boolean A02(AnonymousClass19O r8, String str) {
        if (r8.A07 == -1) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C21010yW r6 = r8.A0L;
        AnonymousClass135 r5 = new AnonymousClass135();
        r5.A02 = str;
        r5.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime - r8.A07));
        r6.Bls(r5, (C18950u5) null, false);
        return true;
    }

    public final String A03() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("incoming count: ");
        sb.append(this.A0F.get());
        sb.append("; outgoing count: ");
        sb.append(this.A0G.get());
        sb.append("; pushes count: ");
        sb.append(this.A0H.get());
        sb.append("; offlineResume: {");
        sb.append(this.A0E.get());
        sb.append("}; ");
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed with reason: ");
            sb2.append(intValue);
            str = sb2.toString();
        } else {
            str = null;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void A04() {
        long A002 = A00("xmpp-combined-worker-time", this.A00);
        this.A00 = -1;
        C19420v0 r6 = this.A0A;
        C19420v0.A00(r6).putLong("xmpp:combined_worker_runtime_seconds", A002 + ((SharedPreferences) r6.A00.get()).getLong("xmpp:combined_worker_runtime_seconds", 0)).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r0 <= 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r2 = r3.A0G
            int r0 = r2.decrementAndGet()
            if (r0 >= 0) goto L_0x002b
            r0 = 0
            r2.set(r0)
        L_0x000c:
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.A09 = r0
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XmppConnectionMetrics outgoing stanza processing finished counter:"
            r1.append(r0)
            int r0 = r2.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x002b:
            if (r0 > 0) goto L_0x0012
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19O.A05():void");
    }

    public final void A06() {
        long A002 = A00("xmpp-lifecycle-time", this.A01);
        this.A02 = -1;
        C19420v0 r6 = this.A0A;
        C19420v0.A00(r6).putLong("xmpp:lifecycle_worker_runtime_seconds", A002 + ((SharedPreferences) r6.A00.get()).getLong("xmpp:lifecycle_worker_runtime_seconds", 0)).apply();
    }

    public final void A07() {
        long A002 = A00("xmpp-logout-time", this.A02);
        this.A02 = -1;
        C19420v0 r6 = this.A0A;
        C19420v0.A00(r6).putLong("xmpp:logout_worker_runtime_seconds", A002 + ((SharedPreferences) r6.A00.get()).getLong("xmpp:logout_worker_runtime_seconds", 0)).apply();
    }

    public final void A09(Integer num) {
        C20810yC r6 = this.A0B;
        C21000yV r5 = C21000yV.A02;
        if (C20800yB.A01(r5, r6, 3206) && Build.VERSION.SDK_INT >= 29) {
            if ((num != null && num.intValue() == 1) || !C20800yB.A01(r5, r6, 4966)) {
                AtomicInteger atomicInteger = this.A0H;
                if (atomicInteger.incrementAndGet() == 1 || this.A03 != null) {
                    A01(this);
                }
                AnonymousClass00T r3 = this.A0I;
                AnonymousClass00T r1 = this.A0J;
                ((Handler) r3.getValue()).removeCallbacks((Runnable) r1.getValue());
                ((Handler) r3.getValue()).postDelayed((Runnable) r1.getValue(), C10920fR.A00(C06790Vc.A00(AnonymousClass0Nh.SECONDS, C20800yB.A00(r5, r6, 4965))));
                StringBuilder sb = new StringBuilder();
                sb.append("XmppConnectionMetrics push processing started counter:");
                sb.append(atomicInteger.get());
                Log.i(sb.toString());
            }
        }
    }

    public final boolean A0A() {
        if (this.A0F.get() > 0 || this.A0G.get() > 0 || this.A0H.get() > 0 || this.A0E.get()) {
            return true;
        }
        return false;
    }

    public final boolean A0B(long j) {
        if (!this.A0E.get()) {
            if (this.A0F.get() > 0 && SystemClock.uptimeMillis() - this.A08 >= j) {
                return true;
            }
            if (this.A0G.get() <= 0 || SystemClock.uptimeMillis() - this.A09 < j) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BRC() {
        this.A07 = -1;
    }

    public void BVp() {
        StringBuilder sb = new StringBuilder();
        sb.append("XmppConnectionMetrics/onDisconnect all incoming stanza processing finished incoming:");
        AtomicInteger atomicInteger = this.A0F;
        sb.append(atomicInteger.get());
        sb.append(" unacked_offline:");
        AtomicInteger atomicInteger2 = this.A0M;
        sb.append(atomicInteger2.get());
        sb.append(" offlineResume: {");
        AtomicBoolean atomicBoolean = this.A0E;
        sb.append(atomicBoolean.get());
        sb.append("}; ");
        Log.i(sb.toString());
        atomicInteger.set(0);
        atomicInteger2.set(0);
        atomicBoolean.set(false);
    }

    public void Bh6(C201579ju r4) {
        if (r4.A07 != null) {
            this.A0M.incrementAndGet();
        }
        AtomicInteger atomicInteger = this.A0F;
        if (atomicInteger.incrementAndGet() == 1 || this.A03 != null) {
            A01(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("XmppConnectionMetrics/onStanzaReceived incoming stanza processing started incoming=:");
        sb.append(atomicInteger.get());
        sb.append(" unacked_offline=:");
        sb.append(this.A0M.get());
        Log.i(sb.toString());
    }

    public final void A08(int i) {
        this.A03 = Integer.valueOf(i);
        if (i == 3) {
            this.A0G.set(0);
            this.A0F.set(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("XmppConnectionMetrics/reportLastWorkerFailed with reason: ");
        sb.append(i);
        Log.i(sb.toString());
    }

    public void onAppBackgrounded() {
        this.A07 = SystemClock.elapsedRealtime();
        this.A05 = false;
        this.A06 = false;
        C20810yC r2 = this.A0B;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 4027) && C20800yB.A01(r1, r2, 3206)) {
            this.A0C.A03(true);
        }
    }
}
