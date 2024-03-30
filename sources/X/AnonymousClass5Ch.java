package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.5Ch  reason: invalid class name */
public final class AnonymousClass5Ch extends C129196Ft {
    public final PointF A00;
    public final PointF A01;
    public final RectF A02;
    public final PointF[] A03;
    public final Paint A04;
    public final Path A05 = C36441kJ.A0M();
    public final RectF A06;

    public static RectF A00(C129196Ft r1, Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        RectF rectF = r1.A02;
        rectF.sort();
        return rectF;
    }

    public void A0F(float f) {
        super.A0F((((float) 2) * f) / ((float) 3));
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        AnonymousClass00C.A0D(rectF, 0);
        float f5 = (float) 2;
        float f6 = (f2 + f4) / f5;
        float f7 = (((f3 - f) * f5) / ((float) 3)) / f5;
        super.A0J(rectF, f, f6 - f7, f3, f6 + f7);
    }

    public static void A01(PointF pointF, RectF rectF) {
        pointF.y = rectF.top + rectF.height();
    }

    public static void A03(RectF rectF, PointF[] pointFArr, int i) {
        pointFArr[i].x = rectF.left + rectF.width();
    }

    public static void A04(RectF rectF, PointF[] pointFArr, int i, int i2) {
        pointFArr[i].x = rectF.left + rectF.width();
        pointFArr[i].y = rectF.top + rectF.height();
        PointF pointF = pointFArr[i2];
        pointF.x = rectF.left;
        pointF.y = rectF.top + rectF.height();
    }

    public static void A05(RectF rectF, PointF[] pointFArr, int i, int i2) {
        PointF pointF = pointFArr[i];
        float f = rectF.left;
        pointF.x = f;
        pointF.y = rectF.top;
        pointFArr[i2].x = f + rectF.width();
        pointFArr[i2].y = rectF.top;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r4 = r22
            r21 = r23
            r0 = r21
            android.graphics.RectF r10 = A00(r4, r0)
            android.graphics.Path r3 = r4.A05
            r3.reset()
            float r9 = r10.centerX()
            float r0 = r4.A00
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            float r2 = r10.width()
            double r5 = (double) r2
            double r0 = r0 * r5
            r2 = 1063675494(0x3f666666, float:0.9)
            double r7 = (double) r2
            double r0 = r0 * r7
            float r2 = (float) r0
            float r9 = r9 + r2
            float r2 = r10.centerY()
            float r0 = r4.A00
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r5 = java.lang.Math.sin(r0)
            float r0 = r10.height()
            double r0 = (double) r0
            double r5 = r5 * r0
            double r5 = r5 * r7
            float r0 = (float) r5
            float r2 = r2 + r0
            android.graphics.RectF r7 = r4.A06
            r7.set(r10)
            float r0 = r7.left
            float r0 = r9 - r0
            float r1 = r7.width()
            r13 = 2
            float r12 = (float) r13
            float r1 = r1 / r12
            float r0 = r0 - r1
            float r1 = r7.top
            float r20 = r2 - r1
            float r1 = r7.height()
            float r1 = r1 / r12
            float r20 = r20 - r1
            float r19 = r7.height()
            float r1 = r7.width()
            float r19 = r19 / r1
            float r5 = r7.width()
            r10 = 6
            float r11 = (float) r10
            float r5 = r5 / r11
            float r1 = r7.height()
            float r18 = X.C90524aI.A00(r1, r11, r5)
            r17 = 1073741824(0x40000000, float:2.0)
            float r17 = r17 * r18
            android.graphics.PointF[] r6 = r4.A03
            r1 = 0
            r1 = r6[r1]
            r1.x = r9
            r1.y = r2
            r5 = 0
            r9 = 5
            r8 = 4
            r2 = 3
            r15 = 1
            int r16 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r16 >= 0) goto L_0x0241
            int r1 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0241
            float r0 = -r0
            float r0 = r0 * r19
            int r1 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            r14 = r6[r15]
            float r0 = r7.left
            if (r1 >= 0) goto L_0x0222
            A02(r14, r7, r12, r11, r0)
            r0 = r6[r15]
            A01(r0, r7)
            r1 = r6[r13]
            float r0 = r7.left
            r1.x = r0
            A01(r1, r7)
            A05(r7, r6, r2, r8)
            A03(r7, r6, r9)
            r0 = r6[r9]
            A01(r0, r7)
            r9 = r6[r10]
            float r1 = r7.left
            float r0 = (float) r2
        L_0x00be:
            A02(r9, r7, r0, r11, r1)
            r9 = r6[r10]
            float r1 = r7.top
            float r12 = r7.height()
        L_0x00c9:
            float r1 = r1 + r12
        L_0x00ca:
            r9.y = r1
        L_0x00cc:
            r0 = 0
            r0 = r6[r0]
            float r1 = r0.x
            float r0 = r0.y
            r3.moveTo(r1, r0)
            r8 = 0
        L_0x00d7:
            android.graphics.PointF r12 = r4.A00
            r0 = r6[r8]
            float r1 = r0.x
            float r0 = r0.y
            r12.set(r1, r0)
            android.graphics.PointF r9 = r4.A01
            int r8 = r8 + 1
            int r0 = r8 % 7
            r0 = r6[r0]
            float r1 = r0.x
            float r0 = r0.y
            r9.set(r1, r0)
            float r10 = r12.x
            float r0 = r7.left
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r13 = 1119092736(0x42b40000, float:90.0)
            if (r0 == 0) goto L_0x011c
            float r11 = r12.y
            float r0 = r7.top
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x011c
            float r1 = r10 + r17
            float r0 = r11 + r17
            android.graphics.RectF r2 = r4.A02
            r2.set(r10, r11, r1, r0)
            r1 = 1127481344(0x43340000, float:180.0)
            r0 = 0
            r3.arcTo(r2, r1, r13, r0)
            float r10 = r12.x
            float r10 = r10 + r18
            r12.x = r10
        L_0x011c:
            float r0 = r9.x
            float r2 = r7.left
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0130
            float r1 = r9.y
            float r0 = r7.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0130
            float r1 = r1 + r18
            r9.y = r1
        L_0x0130:
            float r0 = r7.width()
            float r2 = r2 + r0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0158
            float r11 = r12.y
            float r0 = r7.top
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0158
            float r10 = r12.x
            float r1 = r10 - r17
            float r0 = r11 + r17
            android.graphics.RectF r2 = r4.A02
            r2.set(r1, r11, r10, r0)
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0 = 0
            r3.arcTo(r2, r1, r13, r0)
            float r0 = r12.y
            float r0 = r0 + r18
            r12.y = r0
        L_0x0158:
            float r2 = r9.x
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0173
            float r1 = r9.y
            float r0 = r7.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0173
            float r0 = r9.x
            float r0 = r0 - r18
            r9.x = r0
        L_0x0173:
            float r2 = r12.x
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01a4
            float r2 = r12.y
            float r1 = r7.top
            float r0 = r7.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01a4
            float r11 = r12.x
            float r10 = r11 - r17
            float r2 = r12.y
            float r0 = r2 - r17
            android.graphics.RectF r1 = r4.A02
            r1.set(r10, r0, r11, r2)
            r0 = 0
            r3.arcTo(r1, r5, r13, r0)
            float r0 = r12.x
            float r0 = r0 - r18
            r12.x = r0
        L_0x01a4:
            float r2 = r9.x
            float r1 = r7.left
            float r0 = r7.width()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01c4
            float r2 = r9.y
            float r1 = r7.top
            float r0 = r7.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01c4
            float r0 = r9.y
            float r0 = r0 - r18
            r9.y = r0
        L_0x01c4:
            float r1 = r12.x
            float r0 = r7.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01f0
            float r2 = r12.y
            float r1 = r7.top
            float r0 = r7.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01f0
            float r11 = r12.x
            float r10 = r12.y
            float r2 = r10 - r17
            float r0 = r11 + r17
            android.graphics.RectF r1 = r4.A02
            r1.set(r11, r2, r0, r10)
            r0 = 0
            r3.arcTo(r1, r13, r13, r0)
            float r0 = r12.y
            float r0 = r0 - r18
            r12.y = r0
        L_0x01f0:
            float r1 = r9.x
            float r0 = r7.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x020b
            float r2 = r9.y
            float r1 = r7.top
            float r0 = r7.height()
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x020b
            float r0 = r9.x
            float r0 = r0 + r18
            r9.x = r0
        L_0x020b:
            float r1 = r9.x
            float r0 = r9.y
            r3.lineTo(r1, r0)
            r0 = 7
            if (r8 < r0) goto L_0x00d7
            android.graphics.Paint r1 = r4.A04
            r0 = r21
            r0.drawPath(r3, r1)
            android.graphics.Paint r1 = r4.A01
            r0.drawPath(r3, r1)
            return
        L_0x0222:
            r14.x = r0
            float r12 = r7.top
            float r1 = (float) r2
            float r0 = r7.height()
            float r1 = r1 * r0
            float r1 = r1 / r11
            float r12 = r12 + r1
            r14.y = r12
            A05(r7, r6, r13, r2)
            A04(r7, r6, r8, r9)
            r9 = r6[r10]
            float r0 = r7.left
            r9.x = r0
            float r1 = r7.top
            float r12 = (float) r8
            goto L_0x034a
        L_0x0241:
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 < 0) goto L_0x0299
            int r1 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0299
            float r0 = r0 * r19
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            r12 = r6[r15]
            float r1 = r7.left
            if (r0 >= 0) goto L_0x0277
            float r0 = (float) r2
            A02(r12, r7, r0, r11, r1)
            r0 = r6[r15]
            A01(r0, r7)
            r1 = r6[r13]
            float r0 = r7.left
            r1.x = r0
            A01(r1, r7)
            A05(r7, r6, r2, r8)
            A03(r7, r6, r9)
            r0 = r6[r9]
            A01(r0, r7)
            r9 = r6[r10]
            float r1 = r7.left
            float r0 = (float) r8
            goto L_0x00be
        L_0x0277:
            float r0 = r7.width()
            float r1 = r1 + r0
            r12.x = r1
            r14 = r6[r15]
            float r12 = r7.top
            float r1 = (float) r8
            float r0 = r7.height()
            float r1 = r1 * r0
            float r1 = r1 / r11
            float r12 = r12 + r1
            r14.y = r12
            A04(r7, r6, r13, r2)
            A05(r7, r6, r8, r9)
            A03(r7, r6, r10)
            r9 = r6[r10]
            goto L_0x0347
        L_0x0299:
            if (r16 >= 0) goto L_0x02d4
            int r1 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d4
            float r0 = r0 * r19
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            r14 = r6[r15]
            if (r0 < 0) goto L_0x032c
            float r1 = r7.left
            float r0 = (float) r2
            A02(r14, r7, r0, r11, r1)
            r1 = r6[r15]
            float r0 = r7.top
            r1.y = r0
            A03(r7, r6, r13)
            r1 = r6[r13]
            float r0 = r7.top
            r1.y = r0
            A04(r7, r6, r2, r8)
            r1 = r6[r9]
            float r8 = r7.left
            r1.x = r8
            float r0 = r7.top
            r1.y = r0
            r0 = r6[r10]
        L_0x02cb:
            A02(r0, r7, r12, r11, r8)
            r9 = r6[r10]
            float r1 = r7.top
            goto L_0x00ca
        L_0x02d4:
            if (r14 < 0) goto L_0x0352
            int r1 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0352
            float r0 = -r0
            float r0 = r0 * r19
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            r14 = r6[r15]
            float r1 = r7.left
            if (r0 < 0) goto L_0x0309
            float r0 = (float) r8
            A02(r14, r7, r0, r11, r1)
            r1 = r6[r15]
            float r0 = r7.top
            r1.y = r0
            A03(r7, r6, r13)
            r1 = r6[r13]
            float r0 = r7.top
            r1.y = r0
            A04(r7, r6, r2, r8)
            r1 = r6[r9]
            float r8 = r7.left
            r1.x = r8
            float r0 = r7.top
            r1.y = r0
            r0 = r6[r10]
            float r12 = (float) r2
            goto L_0x02cb
        L_0x0309:
            float r0 = r7.width()
            float r1 = r1 + r0
            r14.x = r1
            r15 = r6[r15]
            float r14 = r7.top
            float r1 = (float) r2
            float r0 = r7.height()
            float r1 = r1 * r0
            float r1 = r1 / r11
            float r14 = r14 + r1
            r15.y = r14
            A04(r7, r6, r13, r2)
            A05(r7, r6, r8, r9)
            A03(r7, r6, r10)
            r9 = r6[r10]
            float r1 = r7.top
            goto L_0x034a
        L_0x032c:
            float r0 = r7.left
            r14.x = r0
            float r1 = r7.top
            float r0 = r7.height()
            float r12 = r12 * r0
            float r12 = r12 / r11
            float r1 = r1 + r12
            r14.y = r1
            A05(r7, r6, r13, r2)
            A04(r7, r6, r8, r9)
            r9 = r6[r10]
            float r0 = r7.left
            r9.x = r0
        L_0x0347:
            float r1 = r7.top
            float r12 = (float) r2
        L_0x034a:
            float r0 = r7.height()
            float r12 = r12 * r0
            float r12 = r12 / r11
            goto L_0x00c9
        L_0x0352:
            A05(r7, r6, r15, r13)
            A04(r7, r6, r2, r8)
            r0 = r6[r9]
            float r2 = r7.left
            r0.x = r2
            float r1 = r7.top
            r0.y = r1
            r0 = r6[r10]
            r0.x = r2
            r0.y = r1
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Ch.A0I(android.graphics.Canvas):void");
    }

    public AnonymousClass5Ch() {
        Paint A0L = C36441kJ.A0L(1);
        this.A04 = A0L;
        this.A06 = C36441kJ.A0N();
        this.A03 = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF(), new PointF()};
        this.A02 = C36441kJ.A0N();
        this.A00 = new PointF();
        this.A01 = new PointF();
        this.A00 = 110.0f;
        C36431kI.A1L(A0L);
        A0L.setColor(-31);
        C36421kH.A0q(this.A01);
    }

    public static void A02(PointF pointF, RectF rectF, float f, float f2, float f3) {
        pointF.x = f3 + ((f * rectF.width()) / f2);
    }
}
