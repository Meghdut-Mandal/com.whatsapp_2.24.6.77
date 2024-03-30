package X;

import android.view.View;

/* renamed from: X.73v  reason: invalid class name and case insensitive filesystem */
public final class C1500673v implements Runnable {
    public float A00;
    public float A01;
    public long A02 = -1;
    public boolean A03;
    public boolean A04;
    public final View A05;
    public final C135346cY A06;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r1 < 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r1 > 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r2 > 0.0f) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r2 < 0.0f) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x0061
            long r1 = java.lang.System.currentTimeMillis()
            long r6 = r9.A02
            r3 = -1
            r8 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            long r3 = r1 - r6
            float r6 = (float) r3
            float r6 = r6 / r8
        L_0x0017:
            X.6cY r4 = r9.A06
            float r3 = r9.A00
            float r3 = r3 * r6
            float r0 = r9.A01
            float r0 = r0 * r6
            boolean r3 = X.C135346cY.A03(r4, r3, r0)
            r9.A02 = r1
            float r6 = r6 * r8
            float r2 = r9.A00
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x006d
            float r2 = r2 - r6
            r9.A00 = r2
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
        L_0x0033:
            r9.A00 = r5
            r2 = 0
        L_0x0036:
            float r1 = r9.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0065
            float r1 = r1 - r6
            r9.A01 = r1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
        L_0x0043:
            r9.A01 = r5
            r1 = 0
        L_0x0046:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
        L_0x004e:
            r0 = 0
            r9.A03 = r0
            r0 = 1
            r9.A04 = r0
            r0 = 0
            X.C135346cY.A02(r4, r0)
        L_0x0058:
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x0061
            android.view.View r0 = r9.A05
            r0.post(r9)
        L_0x0061:
            return
        L_0x0062:
            if (r3 != 0) goto L_0x0058
            goto L_0x004e
        L_0x0065:
            float r1 = r1 + r6
            r9.A01 = r1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
            goto L_0x0043
        L_0x006d:
            float r2 = r2 + r6
            r9.A00 = r2
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            goto L_0x0033
        L_0x0075:
            r6 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1500673v.run():void");
    }

    public C1500673v(View view, C135346cY r4) {
        this.A05 = view;
        this.A06 = r4;
    }
}
