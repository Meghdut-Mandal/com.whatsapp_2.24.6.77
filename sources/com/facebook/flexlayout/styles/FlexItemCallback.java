package com.facebook.flexlayout.styles;

import X.AnonymousClass6KY;
import X.C90514aH;

public class FlexItemCallback {
    public final AnonymousClass6KY mMeasureFunction;

    public final float baseline(float f, float f2) {
        throw C90514aH.A0s("Baseline function isn't defined!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        if (java.lang.Float.isNaN(r12) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (java.lang.Float.isNaN(r2) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r9.A04 == 13320) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.flexlayout.layoutoutput.MeasureOutput measure(float r17, float r18, float r19, float r20, float r21, float r22) {
        /*
            r16 = this;
            r8 = r17
            r7 = r18
            r6 = r19
            r5 = r20
            r0 = r16
            X.6KY r4 = r0.mMeasureFunction
            if (r4 == 0) goto L_0x011b
            X.7ek r3 = r4.A01
            boolean r0 = r3 instanceof X.C140456lc
            if (r0 == 0) goto L_0x0118
            r9 = r3
            X.6lc r9 = (X.C140456lc) r9
            int r1 = r9.A04
            r0 = 13320(0x3408, float:1.8665E-41)
            if (r1 != r0) goto L_0x0118
        L_0x001d:
            r2 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1V(r9)
            X.6lc r10 = X.C133296Xs.A03(r3)
            r9 = 0
            if (r0 != 0) goto L_0x0074
            if (r10 == 0) goto L_0x0074
            r0 = 61
            float r15 = X.C133296Xs.A01(r10, r0)
            r0 = 57
            float r14 = X.C133296Xs.A01(r10, r0)
            r0 = 58
            float r13 = X.C133296Xs.A01(r10, r0)
            r0 = 55
            float r12 = X.C133296Xs.A01(r10, r0)
            r0 = 59
            float r11 = X.C133296Xs.A01(r10, r0)
            r0 = 56
            float r10 = X.C133296Xs.A01(r10, r0)
            boolean r0 = java.lang.Float.isNaN(r15)
            if (r0 == 0) goto L_0x0103
            boolean r0 = java.lang.Float.isNaN(r14)
            if (r0 == 0) goto L_0x0103
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 == 0) goto L_0x0103
            boolean r0 = java.lang.Float.isNaN(r12)
            if (r0 == 0) goto L_0x0103
            boolean r0 = java.lang.Float.isNaN(r11)
            if (r0 == 0) goto L_0x0103
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 == 0) goto L_0x0103
        L_0x0074:
            r10 = 2143289344(0x7fc00000, float:NaN)
            if (r9 != 0) goto L_0x009e
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 == 0) goto L_0x0080
            r7 = r21
        L_0x0080:
            X.5vp r2 = r4.A00
            int r1 = X.AnonymousClass6KY.A00(r8, r7)
            int r0 = X.AnonymousClass6KY.A00(r6, r5)
            X.7lx r3 = r3.B2C(r2, r1, r0)
            int r0 = r3.getWidth()
            float r2 = (float) r0
            int r0 = r3.getHeight()
        L_0x0097:
            float r1 = (float) r0
            com.facebook.flexlayout.layoutoutput.MeasureOutput r0 = new com.facebook.flexlayout.layoutoutput.MeasureOutput
            r0.<init>(r2, r1, r10, r3)
            return r0
        L_0x009e:
            boolean r11 = r4.A02
            if (r11 != 0) goto L_0x00fe
            r0 = 5
            r12 = r9[r0]
            boolean r0 = java.lang.Float.isNaN(r12)
            if (r0 != 0) goto L_0x00fe
        L_0x00ab:
            int r13 = java.lang.Math.round(r12)
            if (r11 == 0) goto L_0x00f8
            r0 = 5
            r2 = r9[r0]
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L_0x00f8
        L_0x00ba:
            int r0 = java.lang.Math.round(r2)
            int r13 = r13 + r0
            float r0 = X.C90484aE.A03(r9, r1)
            int r12 = java.lang.Math.round(r0)
            r0 = 3
            float r0 = X.C90484aE.A03(r9, r0)
            int r0 = java.lang.Math.round(r0)
            int r12 = r12 + r0
            X.5vp r2 = r4.A00
            float r0 = (float) r13
            float r8 = r17 - r0
            float r7 = r18 - r0
            int r1 = X.AnonymousClass6KY.A00(r8, r7)
            float r0 = (float) r12
            float r6 = r19 - r0
            float r5 = r20 - r0
            int r0 = X.AnonymousClass6KY.A00(r6, r5)
            X.7lx r0 = r3.B2C(r2, r1, r0)
            X.6lX r3 = new X.6lX
            r3.<init>(r0, r9, r11)
            int r0 = r3.getWidth()
            float r2 = (float) r0
            int r0 = r3.getHeight()
            goto L_0x0097
        L_0x00f8:
            r0 = 2
            float r2 = X.C90484aE.A03(r9, r0)
            goto L_0x00ba
        L_0x00fe:
            float r12 = X.C90484aE.A03(r9, r2)
            goto L_0x00ab
        L_0x0103:
            r0 = 6
            float[] r9 = new float[r0]
            r9[r1] = r15
            r9[r2] = r14
            r0 = 2
            r9[r0] = r13
            r0 = 3
            r9[r0] = r12
            r0 = 4
            r9[r0] = r11
            r0 = 5
            r9[r0] = r10
            goto L_0x0074
        L_0x0118:
            r9 = 0
            goto L_0x001d
        L_0x011b:
            java.lang.String r0 = "Measure function isn't defined!"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flexlayout.styles.FlexItemCallback.measure(float, float, float, float, float, float):com.facebook.flexlayout.layoutoutput.MeasureOutput");
    }

    public FlexItemCallback(AnonymousClass6KY r1) {
        this.mMeasureFunction = r1;
    }
}
