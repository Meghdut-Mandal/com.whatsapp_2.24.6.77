package X;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0zf  reason: invalid class name and case insensitive filesystem */
public class C21700zf {
    public long A00;
    public C45682Sh A01;
    public boolean A02;
    public final long A03;
    public final C21710zg A04;
    public final C21690ze A05;
    public final C21430zE A06;
    public final String A07;
    public final C19970wo A08;
    public final C19630wG A09;
    public final C21010yW A0A;
    public final C21670zc A0B;
    public final C19770wU A0C;

    private void A00() {
        C45682Sh r8 = this.A01;
        if (r8 != null && !this.A02) {
            C21710zg r1 = this.A04;
            r8.A05 = Integer.valueOf(r1.A00);
            r8.A0C = r1.A01;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = this.A00;
            if (j <= 0) {
                j = this.A03;
            }
            r8.A0B = Long.valueOf(timeUnit.convert(elapsedRealtimeNanos - j, TimeUnit.NANOSECONDS));
            this.A0A.Bly(this.A01);
            this.A02 = true;
        }
    }

    public void A01(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        A03(i, sb.toString());
    }

    public void A02(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        A03(i, sb.toString());
    }

    public void A03(int i, String str) {
        C21710zg r2 = this.A04;
        if (r2.A01()) {
            this.A06.markerPoint(r2.A06, i, str);
        }
    }

    public void A04(int i, short s) {
        C21710zg r2 = this.A04;
        if (r2.A01()) {
            this.A06.markerEnd(r2.A06, i, s);
        }
        if (r2.A05) {
            A00();
        }
    }

    public void A05(long j) {
        C21430zE r4 = this.A06;
        int i = this.A04.A06;
        StringBuilder sb = new StringBuilder();
        sb.append("launch_2_");
        String str = this.A07;
        sb.append(str);
        sb.append("_start");
        String obj = sb.toString();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        r4.markerPoint(i, obj, j, timeUnit);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("launch_2_");
        sb2.append(str);
        sb2.append("_end");
        String obj2 = sb2.toString();
        long j2 = this.A03;
        r4.markerPoint(i, obj2, j2, timeUnit);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("init_2_");
        sb3.append(str);
        sb3.append("_start");
        r4.markerPoint(i, sb3.toString(), j2, timeUnit);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("init_2_");
        sb4.append(str);
        A06(sb4.toString());
    }

    public void A06(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        A08(sb.toString());
    }

    public void A07(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        A08(sb.toString());
    }

    public void A08(String str) {
        C21710zg r2 = this.A04;
        if (r2.A01()) {
            this.A06.markerPoint(r2.A06, str);
        }
    }

    public void A09(String str, int i, boolean z) {
        C21710zg r1 = this.A04;
        if (r1.A01() || r1.A05) {
            this.A00 = -1;
            if (r1.A05) {
                this.A01 = new C45682Sh();
            }
            if (r1.A01()) {
                C21690ze r2 = this.A05;
                int i2 = r1.A06;
                boolean z2 = r1.A03;
                String str2 = "Censored";
                if (!C21690ze.A00(r2)) {
                    str2 = str;
                } else if (!z2) {
                    return;
                }
                r2.A01.BPP("perf_origin", str2, i2, i, z);
            }
        }
    }

    public void A0A(String str, String str2, boolean z) {
        if (z) {
            this.A06.markerAnnotate(this.A04.A06, str, str2);
        } else {
            this.A05.markerAnnotate(this.A04.A06, str, str2);
        }
    }

    public void A0B(String str, boolean z, boolean z2) {
        if (z2) {
            this.A06.markerAnnotate(this.A04.A06, str, z);
        } else {
            this.A05.markerAnnotate(this.A04.A06, str, z);
        }
    }

    public void A0C(short s) {
        C21710zg r2 = this.A04;
        if (r2.A01()) {
            this.A06.markerEnd(r2.A06, s);
        }
        if (r2.A05) {
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r1 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(java.lang.String r11, long r12) {
        /*
            r10 = this;
            X.0zg r3 = r10.A04
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            r7 = r12
            r10.A00 = r12
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x001c
            X.2Sh r0 = new X.2Sh
            r0.<init>()
            r10.A01 = r0
        L_0x001c:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0044
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0048
            X.0ze r2 = r10.A05
            int r4 = r3.A06
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r1 = r3.A03
            java.lang.String r5 = "perf_origin"
            java.lang.String r6 = "Censored"
            boolean r0 = X.C21690ze.A00(r2)
            if (r0 == 0) goto L_0x0046
            if (r1 == 0) goto L_0x0041
        L_0x003c:
            X.0zE r3 = r2.A01
            r3.BPN(r4, r5, r6, r7, r9)
        L_0x0041:
            r10.A05(r12)
        L_0x0044:
            r0 = 1
            return r0
        L_0x0046:
            r6 = r11
            goto L_0x003c
        L_0x0048:
            X.0ze r5 = r10.A05
            int r4 = r3.A06
            boolean r3 = r3.A03
            java.lang.String r2 = "perf_origin"
            java.lang.String r1 = "Censored"
            boolean r0 = X.C21690ze.A00(r5)
            if (r0 == 0) goto L_0x005b
            if (r3 == 0) goto L_0x0044
            r11 = r1
        L_0x005b:
            X.0zE r0 = r5.A01
            r0.markerStart(r4, r2, r11)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21700zf.A0D(java.lang.String, long):boolean");
    }

    public C21700zf(C19970wo r3, C19630wG r4, C21010yW r5, C21710zg r6, C21670zc r7, C21690ze r8, C21430zE r9, C19770wU r10, String str) {
        this.A00 = -1;
        this.A02 = false;
        this.A06 = r9;
        this.A07 = str;
        this.A08 = r3;
        this.A09 = r4;
        this.A0C = r10;
        this.A0A = r5;
        this.A04 = r6;
        this.A0B = r7;
        this.A03 = SystemClock.elapsedRealtimeNanos();
        this.A05 = r8;
    }

    public C21700zf(C19970wo r11, C19630wG r12, C21010yW r13, C21670zc r14, C21690ze r15, C21430zE r16, C19770wU r17, String str, int i) {
        this(r11, r12, r13, new C21710zg(i), r14, r15, r16, r17, str);
    }
}
