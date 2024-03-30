package X;

import android.graphics.Matrix;

/* renamed from: X.66p  reason: invalid class name and case insensitive filesystem */
public final class C1270166p {
    public final Matrix A00 = C90524aI.A0B();
    public final AnonymousClass6OT A01;
    public final float[] A02 = C90524aI.A0v();

    public C1270166p(AnonymousClass6OT r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PointF A01(android.graphics.PointF r10) {
        /*
            r9 = this;
            r8 = 0
            X.6OT r4 = r9.A01
            android.graphics.RectF r7 = r4.A08
            android.graphics.RectF r6 = r4.A07
            if (r7 == 0) goto L_0x00a4
            if (r6 == 0) goto L_0x00a4
            float[] r3 = r9.A02
            float r2 = r10.x
            float r1 = r7.left
            float r0 = r6.left
            float r1 = r1 - r0
            float r2 = r2 - r1
            float r5 = r4.A00
            float r2 = r2 * r5
            r3[r8] = r2
            float r2 = r10.y
            float r1 = r7.top
            float r0 = r6.top
            float r1 = r1 - r0
            float r2 = r2 - r1
            float r2 = r2 * r5
            r6 = 1
            r3[r6] = r2
            android.graphics.Matrix r5 = r9.A00
            r5.reset()
            int r2 = r4.A02
            r0 = 90
            r1 = 0
            if (r2 == r0) goto L_0x0043
            r0 = 180(0xb4, float:2.52E-43)
            if (r2 == r0) goto L_0x004c
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 == r0) goto L_0x005e
            if (r2 == 0) goto L_0x0069
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0043:
            android.graphics.RectF r0 = r4.A0B
            float r0 = r0.width()
            int r0 = (int) r0
            float r2 = (float) r0
            goto L_0x005a
        L_0x004c:
            android.graphics.RectF r1 = r4.A0B
            float r0 = r1.width()
            int r0 = (int) r0
            float r2 = (float) r0
            float r0 = r1.height()
            int r0 = (int) r0
            float r1 = (float) r0
        L_0x005a:
            r5.preTranslate(r2, r1)
            goto L_0x0069
        L_0x005e:
            android.graphics.RectF r0 = r4.A0B
            float r0 = r0.height()
            int r0 = (int) r0
            float r0 = (float) r0
            r5.preTranslate(r1, r0)
        L_0x0069:
            int r0 = r4.A02
            float r0 = (float) r0
            r5.preRotate(r0)
            r5.mapPoints(r3)
            r1 = r3[r8]
            android.graphics.RectF r5 = r4.A0B
            float r0 = r5.left
            float r1 = r1 + r0
            r2 = r3[r6]
            float r0 = r5.top
            float r2 = r2 + r0
            android.graphics.Rect r3 = r4.A06
            if (r3 == 0) goto L_0x009e
            int r0 = r3.left
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = r4.A04
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = r3.width()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r3.top
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = r4.A03
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = r3.height()
            float r0 = (float) r0
            float r2 = r2 / r0
        L_0x009e:
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r1, r2)
            return r0
        L_0x00a4:
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270166p.A01(android.graphics.PointF):android.graphics.PointF");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PointF A00(float r11, float r12) {
        /*
            r10 = this;
            X.6OT r6 = r10.A01
            android.graphics.RectF r5 = r6.A08
            android.graphics.RectF r4 = r6.A07
            if (r5 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00a5
            android.graphics.Matrix r3 = r10.A00
            r3.reset()
            int r0 = r6.A02
            float r0 = (float) r0
            float r0 = -r0
            r3.preRotate(r0)
            int r2 = r6.A02
            r0 = 90
            r1 = 0
            r9 = 1
            r8 = 0
            if (r2 == r0) goto L_0x0030
            r0 = 180(0xb4, float:2.52E-43)
            if (r2 == r0) goto L_0x003a
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 == r0) goto L_0x004e
            if (r2 == 0) goto L_0x005a
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0030:
            android.graphics.RectF r0 = r6.A0B
            float r0 = r0.width()
            int r0 = (int) r0
            float r0 = (float) r0
            float r2 = -r0
            goto L_0x004a
        L_0x003a:
            android.graphics.RectF r1 = r6.A0B
            float r0 = r1.width()
            int r0 = (int) r0
            float r0 = (float) r0
            float r2 = -r0
            float r0 = r1.height()
            int r0 = (int) r0
            float r0 = (float) r0
            float r1 = -r0
        L_0x004a:
            r3.preTranslate(r2, r1)
            goto L_0x005a
        L_0x004e:
            android.graphics.RectF r0 = r6.A0B
            float r0 = r0.height()
            int r0 = (int) r0
            float r0 = (float) r0
            float r0 = -r0
            r3.preTranslate(r1, r0)
        L_0x005a:
            android.graphics.Rect r1 = r6.A06
            if (r1 == 0) goto L_0x007a
            int r0 = r1.width()
            float r0 = (float) r0
            float r11 = r11 * r0
            int r0 = r6.A04
            float r0 = (float) r0
            float r11 = r11 / r0
            int r0 = r1.left
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r1.height()
            float r0 = (float) r0
            float r12 = r12 * r0
            int r0 = r6.A03
            float r0 = (float) r0
            float r12 = r12 / r0
            int r0 = r1.top
            float r0 = (float) r0
            float r12 = r12 + r0
        L_0x007a:
            float[] r7 = r10.A02
            android.graphics.RectF r1 = r6.A0B
            float r0 = r1.left
            float r11 = r11 - r0
            r7[r8] = r11
            float r0 = r1.top
            float r12 = r12 - r0
            r7[r9] = r12
            r3.mapPoints(r7)
            float r3 = r5.left
            float r0 = r4.left
            float r3 = r3 - r0
            r0 = r7[r8]
            float r2 = r6.A00
            float r0 = r0 / r2
            float r3 = r3 + r0
            float r1 = r5.top
            float r0 = r4.top
            float r1 = r1 - r0
            r0 = r7[r9]
            float r0 = r0 / r2
            float r1 = r1 + r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r1)
            return r0
        L_0x00a5:
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270166p.A00(float, float):android.graphics.PointF");
    }
}
