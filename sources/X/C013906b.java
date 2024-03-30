package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.06b  reason: invalid class name and case insensitive filesystem */
public class C013906b {
    public final Path A00 = new Path();
    public final Path A01 = new Path();
    public final Path A02 = new Path();
    public final PointF A03 = new PointF();
    public final C014006c A04 = new C014006c();
    public final float[] A05 = new float[2];
    public final float[] A06 = new float[2];
    public final Matrix[] A07 = new Matrix[4];
    public final Matrix[] A08 = new Matrix[4];
    public final C014006c[] A09 = new C014006c[4];
    public final Path A0A = new Path();

    private boolean A00(Path path, int i) {
        Path path2 = this.A0A;
        path2.reset();
        this.A09[i].A03(this.A07[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c2 A[EDGE_INSN: B:59:0x00c2->B:33:0x00c2 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.graphics.Path r19, android.graphics.RectF r20, X.AnonymousClass06J r21, X.C014206e r22, float r23) {
        /*
            r18 = this;
            r13 = r19
            r13.rewind()
            r11 = r18
            android.graphics.Path r10 = r11.A02
            r10.rewind()
            android.graphics.Path r0 = r11.A00
            r17 = r0
            r17.rewind()
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r12 = r20
            r0.addRect(r12, r1)
            r9 = 0
            r4 = 0
        L_0x001c:
            r14 = r21
            X.06K r5 = r14.A07
            r0 = 1
            if (r4 == r0) goto L_0x00be
            r0 = 2
            if (r4 == r0) goto L_0x00b8
            r0 = 3
            if (r4 == r0) goto L_0x00a8
            X.06N r3 = r14.A0B
        L_0x002b:
            X.06c[] r8 = r11.A09
            r2 = r8[r4]
            r1 = 1119092736(0x42b40000, float:90.0)
            float r0 = r5.BAD(r12)
            r5 = r23
            r3.A00(r2, r1, r5, r0)
            int r3 = r4 + 1
            int r0 = r3 % 4
            int r0 = r0 * 90
            float r5 = (float) r0
            android.graphics.Matrix[] r7 = r11.A07
            r0 = r7[r4]
            r0.reset()
            android.graphics.PointF r6 = r11.A03
            r0 = 1
            if (r4 == r0) goto L_0x00b1
            r0 = 2
            if (r4 == r0) goto L_0x00ae
            r0 = 3
            if (r4 == r0) goto L_0x00ab
            float r1 = r12.right
        L_0x0055:
            float r0 = r12.top
        L_0x0057:
            r6.set(r1, r0)
            r2 = r7[r4]
            float r1 = r6.x
            float r0 = r6.y
            r2.setTranslate(r1, r0)
            r0 = r7[r4]
            r0.preRotate(r5)
            float[] r6 = r11.A05
            r1 = r8[r4]
            float r0 = r1.A02
            r6[r9] = r0
            float r0 = r1.A03
            r2 = 1
            r6[r2] = r0
            r0 = r7[r4]
            r0.mapPoints(r6)
            int r0 = r4 + 1
            int r0 = r0 % 4
            int r0 = r0 * 90
            float r0 = (float) r0
            r16 = r0
            android.graphics.Matrix[] r5 = r11.A08
            r0 = r5[r4]
            r0.reset()
            r15 = r5[r4]
            r1 = r6[r9]
            r0 = r6[r2]
            r15.setTranslate(r1, r0)
            r1 = r5[r4]
            r0 = r16
            r1.preRotate(r0)
            r4 = r3
            r0 = 4
            if (r3 >= r0) goto L_0x00c2
            if (r3 == r2) goto L_0x00bc
            r0 = 2
            if (r3 == r0) goto L_0x00b6
            r0 = 3
            if (r3 != r0) goto L_0x001c
            X.06K r5 = r14.A06
        L_0x00a8:
            X.06N r3 = r14.A0A
            goto L_0x002b
        L_0x00ab:
            float r1 = r12.left
            goto L_0x0055
        L_0x00ae:
            float r1 = r12.left
            goto L_0x00b3
        L_0x00b1:
            float r1 = r12.right
        L_0x00b3:
            float r0 = r12.bottom
            goto L_0x0057
        L_0x00b6:
            X.06K r5 = r14.A04
        L_0x00b8:
            X.06N r3 = r14.A08
            goto L_0x002b
        L_0x00bc:
            X.06K r5 = r14.A05
        L_0x00be:
            X.06N r3 = r14.A09
            goto L_0x002b
        L_0x00c2:
            r2 = r8[r9]
            r0 = 0
            r1 = 0
            r6[r1] = r0
            float r0 = r2.A04
            r4 = 1
            r6[r4] = r0
            r0 = r7[r9]
            r0.mapPoints(r6)
            r1 = r6[r1]
            r0 = r6[r4]
            if (r9 != 0) goto L_0x01f4
            r13.moveTo(r1, r0)
        L_0x00db:
            r1 = r8[r9]
            r0 = r7[r9]
            r1.A03(r0, r13)
            if (r22 == 0) goto L_0x0110
            r14 = r8[r9]
            r1 = r7[r9]
            r0 = r22
            X.06f r0 = (X.C014306f) r0
            X.05l r3 = r0.A00
            android.graphics.Paint r0 = X.C012505l.A0N
            java.util.BitSet r2 = r3.A0G
            r0 = 0
            r2.set(r9, r0)
            X.06Y[] r3 = r3.A0H
            float r0 = r14.A01
            X.C014006c.A00(r14, r0)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>(r1)
            java.util.List r0 = r14.A06
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            X.0DD r0 = new X.0DD
            r0.<init>(r2, r14, r1)
            r3[r9] = r0
        L_0x0110:
            int r0 = r9 + 1
            int r3 = r0 % 4
            r1 = r8[r9]
            float r0 = r1.A02
            r2 = 0
            r6[r2] = r0
            float r0 = r1.A03
            r6[r4] = r0
            r0 = r7[r9]
            r0.mapPoints(r6)
            float[] r1 = r11.A06
            r14 = r8[r3]
            r0 = 0
            r1[r2] = r0
            float r0 = r14.A04
            r1[r4] = r0
            r0 = r7[r3]
            r0.mapPoints(r1)
            r14 = r6[r2]
            r0 = r1[r2]
            float r14 = r14 - r0
            double r14 = (double) r14
            r0 = r6[r4]
            r1 = r1[r4]
            float r0 = r0 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.hypot(r14, r0)
            float r14 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r14 = r14 - r0
            r1 = 0
            float r15 = java.lang.Math.max(r14, r1)
            r14 = r8[r9]
            float r0 = r14.A02
            r6[r2] = r0
            float r0 = r14.A03
            r6[r4] = r0
            r0 = r7[r9]
            r0.mapPoints(r6)
            if (r9 == r4) goto L_0x01ef
            r0 = 3
            if (r9 == r0) goto L_0x01ef
            r12.centerY()
        L_0x0165:
            X.06c r14 = r11.A04
            r16 = 0
            r0 = 1132920832(0x43870000, float:270.0)
            r14.A02(r1, r0, r1)
            r14.A01(r15, r1)
            android.graphics.Path r1 = r11.A01
            r1.reset()
            r0 = r5[r9]
            r14.A03(r0, r1)
            boolean r0 = r11.A00(r1, r9)
            if (r0 != 0) goto L_0x01d0
            boolean r0 = r11.A00(r1, r3)
            if (r0 != 0) goto L_0x01d0
            r0 = r5[r9]
            r14.A03(r0, r13)
        L_0x018c:
            if (r22 == 0) goto L_0x01b9
            r1 = r5[r9]
            r0 = r22
            X.06f r0 = (X.C014306f) r0
            X.05l r4 = r0.A00
            android.graphics.Paint r0 = X.C012505l.A0N
            java.util.BitSet r3 = r4.A0G
            int r0 = r9 + 4
            r3.set(r0, r2)
            X.06Y[] r3 = r4.A0I
            float r0 = r14.A01
            X.C014006c.A00(r14, r0)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>(r1)
            java.util.List r0 = r14.A06
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            X.0DD r0 = new X.0DD
            r0.<init>(r2, r14, r1)
            r3[r9] = r0
        L_0x01b9:
            int r9 = r9 + 1
            r0 = 4
            if (r9 < r0) goto L_0x00c2
            r13.close()
            r10.close()
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x01cf
            android.graphics.Path$Op r0 = android.graphics.Path.Op.UNION
            r13.op(r10, r0)
        L_0x01cf:
            return
        L_0x01d0:
            android.graphics.Path$Op r3 = android.graphics.Path.Op.DIFFERENCE
            r0 = r17
            r1.op(r1, r0, r3)
            r6[r2] = r16
            float r0 = r14.A04
            r6[r4] = r0
            r0 = r5[r9]
            r0.mapPoints(r6)
            r1 = r6[r2]
            r0 = r6[r4]
            r10.moveTo(r1, r0)
            r0 = r5[r9]
            r14.A03(r0, r10)
            goto L_0x018c
        L_0x01ef:
            r12.centerX()
            goto L_0x0165
        L_0x01f4:
            r13.lineTo(r1, r0)
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013906b.A01(android.graphics.Path, android.graphics.RectF, X.06J, X.06e, float):void");
    }

    public C013906b() {
        int i = 0;
        do {
            this.A09[i] = new C014006c();
            this.A07[i] = new Matrix();
            this.A08[i] = new Matrix();
            i++;
        } while (i < 4);
    }
}
