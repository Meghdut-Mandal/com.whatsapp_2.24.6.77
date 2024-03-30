package X;

import android.app.usage.UsageStatsManager;
import android.os.SystemClock;

/* renamed from: X.1W5  reason: invalid class name */
public final class AnonymousClass1W5 {
    public int A00 = -1;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass6FQ A05;
    public final AnonymousClass19W A06;
    public final AnonymousClass00T A07 = new AnonymousClass00U(new AnonymousClass1W6(this));
    public final AnonymousClass00T A08 = new AnonymousClass00U(new AnonymousClass1W7(this));
    public final AnonymousClass1BN A09;
    public final C21060yb A0A;
    public final C19970wo A0B;
    public final C21010yW A0C;
    public final C28791Ub A0D;
    public final C28791Ub A0E;

    public AnonymousClass1W5(AnonymousClass1BN r3, C21060yb r4, C19970wo r5, C21010yW r6, AnonymousClass19W r7, C28791Ub r8, C28791Ub r9) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(r3, 6);
        AnonymousClass00C.A0D(r7, 7);
        this.A0B = r5;
        this.A0C = r6;
        this.A0A = r4;
        this.A0D = r8;
        this.A0E = r9;
        this.A09 = r3;
        this.A06 = r7;
    }

    public static final void A00(AnonymousClass1W5 r13, int i) {
        long j;
        AnonymousClass6FQ r0 = r13.A05;
        if (r0 != null) {
            int i2 = 12;
            if (r0.A02 != 12) {
                C45642Sd r2 = new C45642Sd();
                Integer num = null;
                switch (i) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 6;
                        break;
                    case 7:
                        i2 = 7;
                        break;
                    case 8:
                        i2 = 8;
                        break;
                    case 9:
                        i2 = 9;
                        break;
                    case 10:
                        i2 = 10;
                        break;
                    case 11:
                        i2 = 11;
                        break;
                    case 12:
                        break;
                    case 13:
                        i2 = 13;
                        break;
                    case 14:
                        i2 = 14;
                        break;
                    case 15:
                        i2 = 15;
                        break;
                    case 16:
                        i2 = 16;
                        break;
                    case 17:
                        i2 = 17;
                        break;
                    case 18:
                        i2 = 18;
                        break;
                    case 19:
                        i2 = 19;
                        break;
                }
                num = Integer.valueOf(i2);
                r2.A05 = num;
                AnonymousClass6FQ r3 = r13.A05;
                if (r3 != null) {
                    r2.A09 = Long.valueOf((long) r3.A04);
                    r2.A03 = AnonymousClass6V9.A01(r3.A02);
                    r2.A04 = Integer.valueOf(r3.A00());
                    r2.A02 = r3.A01();
                    r2.A01 = r3.A00;
                }
                if (C19550w8.A05()) {
                    UsageStatsManager A082 = r13.A0A.A08();
                    if (A082 != null) {
                        j = (long) A082.getAppStandbyBucket();
                    } else {
                        j = -1;
                    }
                    r2.A06 = Long.valueOf(j);
                }
                r2.A00 = Boolean.valueOf(r13.A09.A00());
                C28791Ub r1 = r13.A0D;
                long j2 = r1.A02;
                if (j2 != 0) {
                    long j3 = r1.A01;
                    if (j3 != 0) {
                        AnonymousClass3JT r6 = new AnonymousClass3JT(j3 - j2, r1.A03, r1.A04);
                        r2.A0A = Long.valueOf(r6.A02);
                        r2.A08 = Long.valueOf(r6.A01);
                        r2.A07 = Long.valueOf(r6.A00);
                    }
                }
                r2.A0B = Long.valueOf(r13.A02);
                r2.A0C = Long.valueOf(r13.A03);
                r13.A0C.Bly(r2);
            }
        }
        r13.A01 = 0;
        r13.A04 = 0;
        r13.A00 = -1;
        r13.A05 = null;
        r13.A02 = 0;
        r13.A03 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r1 != -1) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r1 == 7) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r9) {
        /*
            r8 = this;
            X.1Ub r6 = r8.A0E
            long r3 = r6.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            long r2 = android.os.SystemClock.uptimeMillis()
            r6.A01 = r2
            long r4 = r6.A02
            long r0 = r6.A00
            long r4 = java.lang.Math.max(r4, r0)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0089
            long r0 = r6.A04
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.A04 = r0
        L_0x0022:
            r0 = 1
            if (r9 == r0) goto L_0x0083
            r0 = 3
            r7 = -1
            if (r9 == r0) goto L_0x006d
            r0 = 4
            if (r9 != r0) goto L_0x0046
            long r1 = r8.A01
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r1
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0041
            r9 = 18
        L_0x0041:
            int r1 = r8.A00
            if (r1 == r7) goto L_0x0046
        L_0x0045:
            r9 = r1
        L_0x0046:
            r8.A00 = r9
            X.00T r3 = r8.A07
            java.lang.Object r2 = r3.getValue()
            android.os.Handler r2 = (android.os.Handler) r2
            X.00T r1 = r8.A08
            java.lang.Object r0 = r1.getValue()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.removeCallbacks(r0)
            java.lang.Object r3 = r3.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r2 = r1.getValue()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x006d:
            long r5 = r8.A04
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r5
            r1 = 12000(0x2ee0, double:5.929E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0041
            r9 = 19
            goto L_0x0041
        L_0x0083:
            int r1 = r8.A00
            r0 = 7
            if (r1 != r0) goto L_0x0046
            goto L_0x0045
        L_0x0089:
            long r0 = r6.A03
            long r2 = r2 - r4
            long r0 = r0 + r2
            r6.A03 = r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W5.A02(int):void");
    }

    public final void A01() {
        this.A04 = SystemClock.uptimeMillis();
    }

    public final void A03(AnonymousClass6FQ r1) {
        this.A05 = r1;
    }
}
