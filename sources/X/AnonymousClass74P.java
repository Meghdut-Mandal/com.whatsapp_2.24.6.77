package X;

import android.view.View;

/* renamed from: X.74P  reason: invalid class name */
public final class AnonymousClass74P implements Runnable {
    public boolean A00;
    public boolean A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public long A07;
    public boolean A08;
    public final View A09;
    public final C135346cY A0A;

    public final void A00(float f, float f2, float f3, float f4, long j) {
        if (!this.A00) {
            this.A02 = f3;
            this.A03 = f4;
            this.A05 = f2;
            this.A07 = System.currentTimeMillis();
            this.A04 = f;
            this.A08 = AnonymousClass000.A1R((f2 > f ? 1 : (f2 == f ? 0 : -1)));
            this.A06 = (f2 - f) / ((float) j);
            this.A00 = true;
            this.A01 = false;
            this.A09.post(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r1 == r2) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0041
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r7.A07
            long r2 = r2 - r0
            float r6 = r7.A04
            float r1 = r7.A06
            float r0 = (float) r2
            float r1 = r1 * r0
            float r6 = r6 + r1
            X.6cY r5 = r7.A0A
            float r1 = r7.A02
            float r0 = r7.A03
            r4 = 1
            X.C135346cY.A01(r5, r6, r1, r0)
            float r3 = r7.A05
            r2 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x002c
            boolean r1 = r7.A08
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
            r2 = 1
        L_0x002a:
            if (r1 != r2) goto L_0x0038
        L_0x002c:
            float r1 = r7.A02
            float r0 = r7.A03
            X.C135346cY.A01(r5, r3, r1, r0)
            r0 = 0
            r7.A00 = r0
            r7.A01 = r4
        L_0x0038:
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0041
            android.view.View r0 = r7.A09
            r0.post(r7)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74P.run():void");
    }

    public AnonymousClass74P(View view, C135346cY r2) {
        this.A09 = view;
        this.A0A = r2;
    }
}
