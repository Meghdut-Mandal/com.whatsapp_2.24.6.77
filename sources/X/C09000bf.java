package X;

import android.view.View;

/* renamed from: X.0bf  reason: invalid class name and case insensitive filesystem */
public class C09000bf implements View.OnApplyWindowInsetsListener {
    public AnonymousClass09H A00;
    public final C06650Um A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowInsets onApplyWindowInsets(android.view.View r22, android.view.WindowInsets r23) {
        /*
            r21 = this;
            r4 = r22
            r3 = r23
            boolean r0 = r4.isLaidOut()
            r2 = r21
            X.09H r18 = X.AnonymousClass09H.A01(r4, r3)
            if (r0 == 0) goto L_0x001c
            X.09H r0 = r2.A00
            if (r0 != 0) goto L_0x0030
            X.09H r0 = X.C012005e.A08(r4)
            r2.A00 = r0
            if (r0 != 0) goto L_0x0030
        L_0x001c:
            r0 = r18
            r2.A00 = r0
        L_0x0020:
            android.view.animation.Interpolator r0 = X.AnonymousClass0Gz.A00
            r0 = 2131434561(0x7f0b1c41, float:1.849094E38)
            java.lang.Object r0 = r4.getTag(r0)
            if (r0 != 0) goto L_0x002f
            android.view.WindowInsets r3 = r4.onApplyWindowInsets(r3)
        L_0x002f:
            return r3
        L_0x0030:
            X.0Um r0 = X.AnonymousClass0Gz.A00(r4)
            if (r0 == 0) goto L_0x003f
            android.view.WindowInsets r0 = r0.A00
            boolean r0 = java.util.Objects.equals(r0, r3)
            if (r0 == 0) goto L_0x003f
            goto L_0x0020
        L_0x003f:
            X.09H r7 = r2.A00
            r6 = 1
            r5 = 0
        L_0x0043:
            r0 = r18
            X.09I r8 = r0.A00
            X.09T r1 = r8.A0C(r6)
            X.09I r0 = r7.A00
            X.09T r0 = r0.A0C(r6)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0058
            r5 = r5 | r6
        L_0x0058:
            int r6 = r6 << 1
            r0 = 256(0x100, float:3.59E-43)
            if (r6 <= r0) goto L_0x0043
            if (r5 == 0) goto L_0x0020
            X.09H r0 = r2.A00
            r20 = r0
            r0 = r5 & 8
            if (r0 == 0) goto L_0x0124
            r6 = 8
            X.09T r0 = r8.A0C(r6)
            int r1 = r0.A00
            r0 = r20
            X.09I r0 = r0.A00
            X.09T r0 = r0.A0C(r6)
            int r0 = r0.A00
            if (r1 <= r0) goto L_0x0120
            android.view.animation.Interpolator r7 = X.AnonymousClass0Gz.A02
        L_0x007e:
            r0 = 160(0xa0, double:7.9E-322)
            X.0Xt r6 = new X.0Xt
            r6.<init>(r5, r7, r0)
            r1 = 0
            X.0Up r0 = r6.A00
            r0.A08(r1)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r0)
            X.0Up r0 = r6.A00
            long r0 = r0.A07()
            android.animation.ValueAnimator r17 = r7.setDuration(r0)
            X.09T r8 = r8.A0C(r5)
            r0 = r20
            X.09I r0 = r0.A00
            X.09T r7 = r0.A0C(r5)
            int r0 = r8.A01
            r19 = r0
            int r13 = r7.A01
            int r15 = java.lang.Math.min(r0, r13)
            int r14 = r8.A03
            int r12 = r7.A03
            int r16 = java.lang.Math.min(r14, r12)
            int r11 = r8.A02
            int r10 = r7.A02
            int r1 = java.lang.Math.min(r11, r10)
            int r9 = r8.A00
            int r8 = r7.A00
            int r0 = java.lang.Math.min(r9, r8)
            r7 = r16
            X.09T r15 = X.AnonymousClass09T.A00(r15, r7, r1, r0)
            r0 = r19
            int r13 = java.lang.Math.max(r0, r13)
            int r7 = java.lang.Math.max(r14, r12)
            int r1 = java.lang.Math.max(r11, r10)
            int r0 = java.lang.Math.max(r9, r8)
            X.09T r1 = X.AnonymousClass09T.A00(r13, r7, r1, r0)
            X.0Y8 r7 = new X.0Y8
            r7.<init>(r15, r1)
            r0 = 0
            X.AnonymousClass0Gz.A01(r4, r3, r6, r0)
            X.0ZM r8 = new X.0ZM
            r13 = r20
            r14 = r5
            r9 = r4
            r10 = r2
            r11 = r6
            r12 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r17
            r0.addUpdateListener(r8)
            r0 = 1
            X.0sW r1 = new X.0sW
            r1.<init>(r4, r2, r6, r0)
            r0 = r17
            r0.addListener(r1)
            X.0hM r0 = new X.0hM
            r8 = r0
            r9 = r17
            r10 = r4
            r11 = r7
            r12 = r2
            r13 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            X.C09020bh.A00(r4, r0)
            goto L_0x001c
        L_0x0120:
            android.view.animation.Interpolator r7 = X.AnonymousClass0Gz.A01
            goto L_0x007e
        L_0x0124:
            android.view.animation.Interpolator r7 = X.AnonymousClass0Gz.A00
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09000bf.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
    }

    public C09000bf(View view, C06650Um r4) {
        AnonymousClass09H r0;
        this.A01 = r4;
        AnonymousClass09H A08 = C012005e.A08(view);
        if (A08 != null) {
            r0 = new AnonymousClass09O(A08).A00.A00();
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
