package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bm  reason: invalid class name and case insensitive filesystem */
public class C91294bm extends Drawable {
    public static final float[] A0L = {0.0f, 0.317f, 0.453f, 0.542f, 0.85f, 1.0f};
    public static final int[] A0M = {-15173646, -14298266, -668109, -37796, -6278145, -15173646};
    public Path A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Bitmap A04;
    public final Bitmap A05;
    public final RectF A06;
    public final Integer A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final Paint[] A0D;
    public final Paint[] A0E;
    public final Path[] A0F;
    public final float A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final RectF A0J;
    public final boolean A0K;

    public int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0125, code lost:
        if (r0.A09 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012a, code lost:
        if (r0.A0A != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x022b, code lost:
        if (r0.A09 != false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0230, code lost:
        if (r0.A0A != false) goto L_0x0181;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Integer r1 = r0.A07
            boolean r1 = A02(r1)
            r13 = r20
            if (r1 == 0) goto L_0x012e
            r3 = 2
            boolean[] r7 = new boolean[r3]
            boolean r6 = r0.A0B
            r10 = 0
            r7[r10] = r6
            boolean r2 = r0.A08
            r12 = 1
            r7[r12] = r2
            r5 = 0
            r1 = 0
        L_0x001b:
            boolean r4 = r7[r5]
            if (r4 == 0) goto L_0x0021
            int r1 = r1 + 1
        L_0x0021:
            int r5 = r5 + 1
            if (r5 < r3) goto L_0x001b
            r11 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x0128
            int r7 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r5 = r9.left
            float r8 = r0.A01
            float r5 = r5 + r8
            float r4 = r9.top
            float r4 = r4 + r8
            r13.translate(r5, r4)
            android.graphics.Path[] r4 = r0.A0F
            r5 = r4[r10]
            android.graphics.Paint[] r4 = r0.A0D
            r4 = r4[r10]
            r13.drawPath(r5, r4)
            r14 = 0
            float r5 = -r8
            float r4 = r0.A02
            float r15 = r5 - r4
            float r16 = r9.width()
            float r8 = r8 * r11
            float r16 = r16 - r8
            android.graphics.Paint[] r4 = r0.A0E
            r18 = r4[r10]
            r17 = r5
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r7)
        L_0x005e:
            int r5 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r10 = r8.right
            float r7 = r0.A01
            float r10 = r10 - r7
            float r9 = r8.top
            boolean r4 = X.AnonymousClass000.A1P(r6)
            float r4 = (float) r4
            float r4 = r4 * r7
            float r9 = r9 + r4
            r13.translate(r10, r9)
            if (r6 == 0) goto L_0x0082
            android.graphics.Path[] r4 = r0.A0F
            r6 = r4[r12]
            android.graphics.Paint[] r4 = r0.A0D
            r4 = r4[r12]
            r13.drawPath(r6, r4)
        L_0x0082:
            boolean r4 = r0.A0A
            if (r4 == 0) goto L_0x009b
            r14 = 0
            float r4 = r0.A02
            float r16 = r7 + r4
            float r17 = r8.height()
            float r4 = (float) r1
            float r4 = r4 * r7
            float r17 = r17 - r4
            android.graphics.Paint[] r4 = r0.A0E
            r18 = r4[r12]
            r15 = 0
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x009b:
            r13.restoreToCount(r5)
        L_0x009e:
            if (r2 == 0) goto L_0x0123
            int r6 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r7 = r8.right
            float r5 = r0.A01
            float r7 = r7 - r5
            float r4 = r8.bottom
            float r4 = r4 - r5
            r13.translate(r7, r4)
            android.graphics.Path[] r4 = r0.A0F
            r7 = r4[r3]
            android.graphics.Paint[] r4 = r0.A0D
            r4 = r4[r3]
            r13.drawPath(r7, r4)
            float r4 = r8.width()
            float r14 = -r4
            float r11 = r11 * r5
            float r14 = r14 + r11
            r15 = 0
            float r4 = r0.A02
            float r5 = r5 + r4
            android.graphics.Paint[] r4 = r0.A0E
            r18 = r4[r3]
            r16 = 0
            r17 = r5
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r6)
        L_0x00d5:
            int r3 = r13.save()
            android.graphics.RectF r7 = r0.A06
            float r8 = r7.left
            float r5 = r0.A01
            float r8 = r8 + r5
            float r6 = r7.bottom
            boolean r4 = X.AnonymousClass000.A1P(r2)
            float r4 = (float) r4
            float r4 = r4 * r5
            float r6 = r6 - r4
            r13.translate(r8, r6)
            r6 = 3
            if (r2 == 0) goto L_0x00fa
            android.graphics.Path[] r2 = r0.A0F
            r4 = r2[r6]
            android.graphics.Paint[] r2 = r0.A0D
            r2 = r2[r6]
            r13.drawPath(r4, r2)
        L_0x00fa:
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x0116
            float r14 = -r5
            float r2 = r0.A02
            float r14 = r14 - r2
            r15 = 0
            float r2 = r7.height()
            float r2 = -r2
            float r1 = (float) r1
            float r1 = r1 * r5
            float r2 = r2 + r1
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r6]
            r16 = 0
            r17 = r2
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0116:
            r13.restoreToCount(r3)
        L_0x0119:
            android.graphics.Path r1 = r0.A00
            if (r1 == 0) goto L_0x0234
            android.graphics.Paint r0 = r0.A0I
            r13.drawPath(r1, r0)
            return
        L_0x0123:
            boolean r3 = r0.A09
            if (r3 == 0) goto L_0x0119
            goto L_0x00d5
        L_0x0128:
            boolean r4 = r0.A0A
            if (r4 == 0) goto L_0x009e
            goto L_0x005e
        L_0x012e:
            android.graphics.Path[] r1 = r0.A0F
            r2 = 0
            r4 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0D
            r3 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r2]
            r1 = 2
            boolean[] r9 = new boolean[r1]
            boolean r6 = r0.A0B
            r9[r2] = r6
            boolean r2 = r0.A08
            r1 = 1
            r9[r1] = r2
            r8 = 2
            r7 = 0
            r1 = 0
        L_0x014a:
            boolean r5 = r9[r7]
            if (r5 == 0) goto L_0x0150
            int r1 = r1 + 1
        L_0x0150:
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x014a
            r12 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x022e
            int r9 = r13.save()
            android.graphics.RectF r10 = r0.A06
            float r7 = r10.left
            float r8 = r0.A01
            float r7 = r7 + r8
            float r5 = r10.top
            float r5 = r5 + r8
            r13.translate(r7, r5)
            r13.drawPath(r4, r3)
            r14 = 0
            float r7 = -r8
            float r5 = r0.A02
            float r15 = r7 - r5
            float r16 = r10.width()
            float r8 = r8 * r12
            float r16 = r16 - r8
            r17 = r7
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r9)
        L_0x0181:
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r11 = r9.right
            float r7 = r0.A01
            float r11 = r11 - r7
            float r10 = r9.top
            boolean r5 = X.AnonymousClass000.A1P(r6)
            float r5 = (float) r5
            float r5 = r5 * r7
            float r10 = r10 + r5
            r13.translate(r11, r10)
            r5 = 1119092736(0x42b40000, float:90.0)
            r13.rotate(r5)
            if (r6 == 0) goto L_0x01a2
            r13.drawPath(r4, r3)
        L_0x01a2:
            boolean r5 = r0.A0A
            if (r5 == 0) goto L_0x01b9
            r14 = 0
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.height()
            float r5 = (float) r1
            float r5 = r5 * r7
            float r16 = r16 - r5
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x01b9:
            r13.restoreToCount(r8)
        L_0x01bc:
            if (r2 == 0) goto L_0x0229
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r6 = r9.right
            float r7 = r0.A01
            float r6 = r6 - r7
            float r5 = r9.bottom
            float r5 = r5 - r7
            r13.translate(r6, r5)
            r5 = 1127481344(0x43340000, float:180.0)
            r13.rotate(r5)
            r13.drawPath(r4, r3)
            r14 = 0
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.width()
            float r12 = r12 * r7
            float r16 = r16 - r12
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r8)
        L_0x01ec:
            int r6 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r10 = r8.left
            float r5 = r0.A01
            float r10 = r10 + r5
            float r9 = r8.bottom
            boolean r7 = X.AnonymousClass000.A1P(r2)
            float r7 = (float) r7
            float r7 = r7 * r5
            float r9 = r9 - r7
            r13.translate(r10, r9)
            r7 = 1132920832(0x43870000, float:270.0)
            r13.rotate(r7)
            if (r2 == 0) goto L_0x020d
            r13.drawPath(r4, r3)
        L_0x020d:
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x0224
            r14 = 0
            float r3 = -r5
            float r2 = r0.A02
            float r15 = r3 - r2
            float r16 = r8.height()
            float r1 = (float) r1
            float r1 = r1 * r5
            float r16 = r16 - r1
            r17 = r3
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0224:
            r13.restoreToCount(r6)
            goto L_0x0119
        L_0x0229:
            boolean r5 = r0.A09
            if (r5 == 0) goto L_0x0119
            goto L_0x01ec
        L_0x022e:
            boolean r5 = r0.A0A
            if (r5 == 0) goto L_0x01bc
            goto L_0x0181
        L_0x0234:
            float r3 = r0.A01
            r2 = 0
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0257
            float r1 = r0.A0G
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x0254
            android.graphics.RectF r2 = r0.A06
            android.graphics.Paint r1 = r0.A0H
            r13.drawRoundRect(r2, r3, r3, r1)
            android.graphics.RectF r1 = r0.A0J
        L_0x024e:
            android.graphics.Paint r0 = r0.A0I
            r13.drawRoundRect(r1, r3, r3, r0)
            return
        L_0x0254:
            android.graphics.RectF r1 = r0.A06
            goto L_0x024e
        L_0x0257:
            android.graphics.RectF r1 = r0.A06
            android.graphics.Paint r0 = r0.A0I
            r13.drawRect(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91294bm.draw(android.graphics.Canvas):void");
    }

    public boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (this.A09) {
            f = this.A02;
        } else {
            f = 0.0f;
        }
        if (this.A0A) {
            f2 = this.A02;
        } else {
            f2 = 0.0f;
        }
        boolean z = this.A0B;
        if (z) {
            float f6 = this.A02;
            if (this.A0K) {
                f4 = 0.0f;
            } else {
                f4 = this.A01;
            }
            f3 = f6 + f4;
        } else {
            f3 = 0.0f;
        }
        if (this.A08) {
            float f7 = this.A02;
            if (!this.A0K) {
                f5 = this.A01;
            }
            f5 += f7;
            if (z) {
                float f8 = this.A0G;
                f3 -= f8;
                f5 += f8;
            }
        }
        rect.set((int) f, (int) f3, (int) f2, (int) f5);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v40, types: [android.graphics.BitmapShader] */
    /* JADX WARNING: type inference failed for: r1v44, types: [android.graphics.BitmapShader] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ee, code lost:
        if (r9 == false) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f0, code lost:
        r10 = r0.A04;
        r23 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f2, code lost:
        if (r10 == null) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f4, code lost:
        r10.eraseColor(0);
        r11 = X.C36441kJ.A0K();
        X.C36431kI.A1L(r11);
        r11.setDither(true);
        r11.setShader(r23);
        X.C90524aI.A0A(r10).drawRect(0.0f, 0.0f, 1.0f, r27, r11);
        r11 = android.graphics.Shader.TileMode.REPEAT;
        r1 = new android.graphics.BitmapShader(r10, r11, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01af, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01af, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBoundsChange(android.graphics.Rect r34) {
        /*
            r33 = this;
            r0 = r33
            r2 = r34
            super.onBoundsChange(r2)
            android.graphics.RectF r5 = r0.A06
            int r1 = r2.left
            float r9 = (float) r1
            float r3 = r0.A02
            float r9 = r9 + r3
            boolean r8 = r0.A0B
            int r1 = r2.top
            float r6 = (float) r1
            if (r8 == 0) goto L_0x0017
            float r6 = r6 + r3
        L_0x0017:
            int r1 = r2.right
            float r4 = (float) r1
            float r4 = r4 - r3
            boolean r7 = r0.A08
            int r1 = r2.bottom
            float r1 = (float) r1
            if (r7 == 0) goto L_0x0023
            float r1 = r1 - r3
        L_0x0023:
            r5.set(r9, r6, r4, r1)
            android.graphics.RectF r10 = r0.A0J
            int r1 = r2.left
            float r9 = (float) r1
            float r9 = r9 + r3
            int r1 = r2.top
            float r6 = (float) r1
            if (r8 == 0) goto L_0x0035
            float r6 = r6 + r3
            float r1 = r0.A0G
            float r6 = r6 - r1
        L_0x0035:
            int r1 = r2.right
            float r4 = (float) r1
            float r4 = r4 - r3
            int r1 = r2.bottom
            float r2 = (float) r1
            if (r7 == 0) goto L_0x0042
            float r2 = r2 - r3
            float r1 = r0.A0G
            float r2 = r2 - r1
        L_0x0042:
            r10.set(r9, r6, r4, r2)
            boolean r1 = r0.A09
            if (r1 == 0) goto L_0x0255
            if (r8 == 0) goto L_0x0255
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x0255
            if (r7 == 0) goto L_0x0255
            r1 = 0
            r0.A00 = r1
        L_0x0054:
            float r5 = r0.A01
            float r15 = -r5
            android.graphics.RectF r22 = new android.graphics.RectF
            r1 = r22
            r1.<init>(r15, r15, r5, r5)
            android.graphics.RectF r21 = new android.graphics.RectF
            r2 = r21
            r2.<init>(r1)
            float r12 = -r3
            r2.inset(r12, r12)
            java.lang.Integer r1 = r0.A07
            r32 = r1
            boolean r7 = r0.A0C
            float r8 = A00(r1, r7)
            int[] r2 = A0M
            r1 = 6
            int[] r28 = java.util.Arrays.copyOf(r2, r1)
            r4 = 3
            int[] r6 = new int[r4]
            r6 = {-15173646, -15173646, -15173646} // fill-array
            if (r7 == 0) goto L_0x008e
            boolean r1 = A02(r32)
            if (r1 == 0) goto L_0x008e
            A01(r6)
            A01(r28)
        L_0x008e:
            int[] r1 = new int[r4]
            r31 = r1
            r7 = 0
            r2 = r6[r7]
            r10 = 1050253722(0x3e99999a, float:0.3)
            float r10 = r10 * r8
            X.C109515Xw.A01(r1, r10, r2, r7)
            r9 = 1
            r11 = r6[r9]
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 * r8
            X.C109515Xw.A01(r1, r2, r11, r9)
            r11 = 2
            r6 = r6[r11]
            r13 = 0
            X.C109515Xw.A01(r1, r13, r6, r11)
            boolean r20 = A02(r32)
            r1 = 4
            if (r20 == 0) goto L_0x0235
            int[] r6 = new int[r4]
            int r1 = r0.A03
            X.C109515Xw.A01(r6, r10, r1, r7)
            X.C109515Xw.A01(r6, r2, r1, r9)
            X.C109515Xw.A01(r6, r13, r1, r11)
            float[] r1 = new float[r4]
            r19 = r1
            r1 = {0, 1056964608, 1065353216} // fill-array
            int r1 = X.C36421kH.A03(r0)
            float r2 = (float) r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r3 + r5
            float r1 = r1 * r4
            float r2 = r2 - r1
            float[] r29 = A0L
            android.graphics.Shader$TileMode r30 = android.graphics.Shader.TileMode.REPEAT
            r1 = 0
            android.graphics.LinearGradient r18 = new android.graphics.LinearGradient
            r24 = 0
            r25 = 0
            r27 = 0
            r23 = r18
            r26 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
        L_0x00e7:
            float r17 = r5 + r3
            r27 = r6
            if (r20 == 0) goto L_0x00ef
            r27 = r31
        L_0x00ef:
            android.graphics.Shader$TileMode r30 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RadialGradient r16 = new android.graphics.RadialGradient
            r24 = 0
            r25 = 0
            r23 = r16
            r26 = r17
            r28 = r19
            r29 = r30
            r23.<init>(r24, r25, r26, r27, r28, r29)
            boolean r2 = A02(r32)
            if (r2 == 0) goto L_0x0232
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 >= r2) goto L_0x0232
        L_0x010e:
            r8 = 0
            r4 = 0
        L_0x0110:
            android.graphics.Path[] r10 = r0.A0F
            int r2 = r10.length
            if (r8 >= r2) goto L_0x0297
            r2 = r10[r8]
            r2.reset()
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.EVEN_ODD
            r2.setFillType(r10)
            android.graphics.Paint[] r10 = r0.A0D
            r11 = r10[r8]
            r10 = r16
            r11.setShader(r10)
            r11 = 180(0xb4, float:2.52E-43)
            r10 = 90
            if (r4 == r10) goto L_0x0219
            if (r4 == r11) goto L_0x01d5
            r10 = 270(0x10e, float:3.78E-43)
            if (r4 == r10) goto L_0x01bd
            r2.moveTo(r15, r1)
            r2.rLineTo(r12, r1)
            float r27 = r12 - r5
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r25 = 0
            r26 = 0
            r23 = r1
            r28 = r6
            r29 = r19
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            if (r20 == 0) goto L_0x0183
            if (r9 == 0) goto L_0x0183
            android.graphics.Bitmap r11 = r0.A05
            if (r11 == 0) goto L_0x0183
            r11.eraseColor(r7)
            android.graphics.Paint r10 = X.C36441kJ.A0K()
            X.C36431kI.A1L(r10)
            r13 = 1
            r10.setDither(r13)
            r10.setShader(r1)
            android.graphics.Canvas r1 = X.C90524aI.A0A(r11)
            r14 = 0
            r13 = r17
            r1.translate(r14, r13)
            float r13 = -r13
            r26 = 1065353216(0x3f800000, float:1.0)
            r27 = 0
            r23 = r1
            r25 = r13
            r28 = r10
            r23.drawRect(r24, r25, r26, r27, r28)
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            r1.<init>(r11, r10, r10)
        L_0x0183:
            r14 = 1127481344(0x43340000, float:180.0)
            float r13 = (float) r4
            float r14 = r14 + r13
            r11 = 1119092736(0x42b40000, float:90.0)
            r10 = r21
            r2.arcTo(r10, r14, r11, r7)
            r10 = 1132920832(0x43870000, float:270.0)
            float r13 = r13 + r10
            r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r10 = r22
            r2.arcTo(r10, r13, r11, r7)
            r2.close()
            if (r20 == 0) goto L_0x01af
            if (r18 == 0) goto L_0x01af
            r2 = 180(0xb4, float:2.52E-43)
            if (r4 == r2) goto L_0x01a5
            if (r4 != 0) goto L_0x01af
        L_0x01a5:
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.ComposeShader r10 = new android.graphics.ComposeShader
            r2 = r18
            r10.<init>(r1, r2, r11)
            r1 = r10
        L_0x01af:
            android.graphics.Paint[] r2 = r0.A0E
            r2 = r2[r8]
            r2.setShader(r1)
            int r4 = r4 + 90
            int r8 = r8 + 1
            r1 = 0
            goto L_0x0110
        L_0x01bd:
            r2.moveTo(r1, r5)
            r2.rLineTo(r1, r3)
            float r26 = r12 - r5
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r25 = 0
            r27 = 0
            r23 = r1
            r28 = r31
            r29 = r19
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0183
        L_0x01d5:
            r2.moveTo(r5, r1)
            r2.rLineTo(r3, r1)
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r25 = 0
            r26 = 0
            r23 = r1
            r27 = r17
            r28 = r6
            r29 = r19
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            if (r20 == 0) goto L_0x0183
            if (r9 == 0) goto L_0x0183
            android.graphics.Bitmap r10 = r0.A04
            if (r10 == 0) goto L_0x0183
            r10.eraseColor(r7)
            android.graphics.Paint r11 = X.C36441kJ.A0K()
            X.C36431kI.A1L(r11)
            r13 = 1
            r11.setDither(r13)
            r11.setShader(r1)
            android.graphics.Canvas r23 = X.C90524aI.A0A(r10)
            r26 = 1065353216(0x3f800000, float:1.0)
            r28 = r11
            r23.drawRect(r24, r25, r26, r27, r28)
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            r1.<init>(r10, r11, r11)
            goto L_0x0183
        L_0x0219:
            r2.moveTo(r1, r15)
            r2.rLineTo(r1, r12)
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r25 = 0
            r27 = 0
            r23 = r1
            r26 = r17
            r28 = r31
            r29 = r19
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0183
        L_0x0232:
            r9 = 0
            goto L_0x010e
        L_0x0235:
            int[] r6 = new int[r1]
            int r14 = r0.A03
            r16 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r16
            X.C109515Xw.A01(r6, r8, r14, r7)
            X.C109515Xw.A01(r6, r10, r14, r9)
            X.C109515Xw.A01(r6, r2, r14, r11)
            X.C109515Xw.A01(r6, r13, r14, r4)
            float[] r1 = new float[r1]
            r19 = r1
            r1 = {0, 1048576000, 1061158912, 1065353216} // fill-array
            r1 = 0
            r18 = 0
            goto L_0x00e7
        L_0x0255:
            android.graphics.Path r1 = r0.A00
            if (r1 != 0) goto L_0x025f
            android.graphics.Path r1 = X.C36441kJ.A0M()
            r0.A00 = r1
        L_0x025f:
            r1.reset()
            r6 = 0
            if (r8 == 0) goto L_0x0295
            float r2 = r0.A01
        L_0x0267:
            if (r7 == 0) goto L_0x026b
            float r6 = r0.A01
        L_0x026b:
            r1 = 8
            float[] r4 = new float[r1]
            r1 = 0
            r4[r1] = r2
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r2
            r1 = 3
            r4[r1] = r2
            r1 = 4
            r4[r1] = r6
            r1 = 5
            r4[r1] = r6
            r1 = 6
            r4[r1] = r6
            r1 = 7
            r4[r1] = r6
            android.graphics.Path r2 = r0.A00
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r2.addRoundRect(r5, r4, r1)
            android.graphics.Path r1 = r0.A00
            r1.close()
            goto L_0x0054
        L_0x0295:
            r2 = 0
            goto L_0x0267
        L_0x0297:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91294bm.onBoundsChange(android.graphics.Rect):void");
    }

    public void setAlpha(int i) {
        for (Paint alpha : this.A0D) {
            alpha.setAlpha(i);
        }
        for (Paint alpha2 : this.A0E) {
            alpha2.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        for (Paint colorFilter2 : this.A0D) {
            colorFilter2.setColorFilter(colorFilter);
        }
        for (Paint colorFilter3 : this.A0E) {
            colorFilter3.setColorFilter(colorFilter);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009e, code lost:
        if (r1 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91294bm(android.content.Context r11, X.C1271967i r12, java.lang.Integer r13, int r14, int r15) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 1094713344(0x41400000, float:12.0)
            float r5 = X.C109525Xx.A00(r11, r0)
            r0 = 1082130432(0x40800000, float:4.0)
            float r3 = X.C109525Xx.A00(r11, r0)
            boolean r0 = A02(r13)
            if (r0 == 0) goto L_0x001c
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 < r1) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0031
            float r5 = r5 + r3
            int r3 = (int) r5
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x002f }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r0)     // Catch:{ all -> 0x002f }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r0)     // Catch:{ all -> 0x002f }
            r4 = r1
            goto L_0x0032
        L_0x002f:
            java.lang.Integer r13 = X.C023109s.A01
        L_0x0031:
            r0 = r4
        L_0x0032:
            r10.A05 = r4
            r10.A04 = r0
            r10.A07 = r13
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.C109525Xx.A00(r11, r0)
            r1 = 0
            float r0 = java.lang.Math.max(r1, r0)
            r10.A01 = r0
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.C109525Xx.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A02 = r0
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto L_0x011f;
                case 1: goto L_0x011f;
                default: goto L_0x0058;
            }
        L_0x0058:
            r0 = 5
        L_0x0059:
            float r0 = (float) r0
            float r0 = X.C109525Xx.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A0G = r0
            boolean r6 = r12.A03
            r10.A0C = r6
            r7 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            if (r6 == 0) goto L_0x0070
            r7 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
        L_0x0070:
            r10.A03 = r7
            r0 = r15 & 1
            boolean r9 = X.AnonymousClass000.A1S(r0, r2)
            r10.A0B = r9
            r1 = 2
            r0 = r15 & 2
            boolean r8 = X.AnonymousClass000.A1S(r0, r1)
            r10.A09 = r8
            r3 = 4
            r0 = r15 & 4
            boolean r5 = X.AnonymousClass000.A1S(r0, r3)
            r10.A0A = r5
            r1 = 8
            r0 = r15 & 8
            boolean r1 = X.AnonymousClass000.A1S(r0, r1)
            r10.A08 = r1
            r4 = 0
            if (r9 == 0) goto L_0x00a0
            if (r8 == 0) goto L_0x00a0
            if (r5 == 0) goto L_0x00a0
            r0 = 1
            if (r1 != 0) goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r10.A0K = r0
            android.graphics.Paint r1 = X.C36441kJ.A0K()
            r10.A0I = r1
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            r1.setColor(r14)
            r1.setAntiAlias(r2)
            android.graphics.Paint r5 = X.C36441kJ.A0K()
            r10.A0H = r5
            r5.setStyle(r0)
            r5.setColor(r7)
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r1 = A00(r13, r6)
            float r1 = r1 * r0
            r0 = 1132396544(0x437f0000, float:255.0)
            int r0 = X.C90514aH.A06(r1, r0)
            r5.setAlpha(r0)
            r5.setAntiAlias(r2)
            boolean r0 = A02(r13)
            if (r0 != 0) goto L_0x00db
            r3 = 1
        L_0x00db:
            android.graphics.Path[] r0 = new android.graphics.Path[r3]
            r10.A0F = r0
            android.graphics.RectF r0 = X.C36441kJ.A0N()
            r10.A06 = r0
            android.graphics.RectF r0 = X.C36441kJ.A0N()
            r10.A0J = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r3]
            r10.A0D = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r3]
            r10.A0E = r0
        L_0x00f3:
            android.graphics.Path[] r1 = r10.A0F
            android.graphics.Path r0 = X.C36441kJ.A0M()
            r1[r4] = r0
            android.graphics.Paint[] r1 = r10.A0D
            r0 = 4
            android.graphics.Paint r0 = X.C36441kJ.A0L(r0)
            X.C36431kI.A1L(r0)
            r1[r4] = r0
            android.graphics.Paint[] r0 = r10.A0D
            r0 = r0[r4]
            r0.setAntiAlias(r2)
            android.graphics.Paint[] r1 = r10.A0E
            r0 = 4
            android.graphics.Paint r0 = X.C36441kJ.A0L(r0)
            X.C36431kI.A1L(r0)
            r1[r4] = r0
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x00f3
            return
        L_0x011f:
            r0 = 0
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91294bm.<init>(android.content.Context, X.67i, java.lang.Integer, int, int):void");
    }

    public static float A00(Integer num, boolean z) {
        int intValue = num.intValue();
        if (z) {
            switch (intValue) {
                case 1:
                    return 0.2f;
                case 2:
                    return 1.0f;
                case 3:
                    return 0.6f;
                default:
                    return 0.1f;
            }
        } else {
            switch (intValue) {
                case 1:
                case 3:
                    return 0.05f;
                case 2:
                    return 0.2f;
                default:
                    return 0.1f;
            }
        }
    }

    public static void A01(int[] iArr) {
        int A002 = C109515Xw.A00(-14931149, 0.2f);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int alpha = Color.alpha(i2);
            int alpha2 = Color.alpha(A002);
            int i3 = (255 - alpha2) * alpha;
            int i4 = i3 + alpha2;
            iArr[i] = Color.argb(Math.min(255, i4), ((Color.red(i2) * i3) + (Color.red(A002) * alpha2)) / i4, ((Color.green(i2) * i3) + (Color.green(A002) * alpha2)) / i4, ((i3 * Color.blue(i2)) + (Color.blue(A002) * alpha2)) / i4);
        }
    }

    public static boolean A02(Integer num) {
        switch (num.intValue()) {
            case 1:
            case 2:
            case 3:
                return false;
            default:
                return true;
        }
    }
}
