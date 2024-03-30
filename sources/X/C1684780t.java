package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.80t  reason: invalid class name and case insensitive filesystem */
public class C1684780t extends C196189Yb {
    public List A00;
    public final Path A01 = C36441kJ.A0M();
    public final C198769eA A02 = new C198769eA();

    public static int A00(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) >= 0 || i2 * i3 == i) {
            return i3;
        }
        return i3 - 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0180, code lost:
        if (r11 == X.C36421kH.A06(r14, 1)) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r3.A01 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0236, code lost:
        if (r8 == X.C36431kI.A07(r14)) goto L_0x0239;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A06(X.C202689mQ r26, float r27) {
        /*
            r25 = this;
            r0 = r26
            java.lang.Object r5 = r0.A0E
            X.9eA r5 = (X.C198769eA) r5
            java.lang.Object r3 = r0.A08
            X.9eA r3 = (X.C198769eA) r3
            r24 = r25
            r0 = r24
            X.9eA r4 = r0.A02
            android.graphics.PointF r0 = r4.A00
            if (r0 != 0) goto L_0x001b
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.A00 = r0
        L_0x001b:
            boolean r0 = r5.A01
            r10 = 1
            if (r0 != 0) goto L_0x0025
            boolean r1 = r3.A01
            r0 = 0
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            r4.A01 = r0
            java.util.List r8 = r5.A02
            int r1 = r8.size()
            java.util.List r7 = r3.A02
            int r0 = r7.size()
            if (r1 == r0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Curves must have the same number of control points. Shape 1: "
            X.C36371kC.A1R(r0, r1, r8)
            java.lang.String r0 = "\tShape 2: "
            X.C36371kC.A1R(r0, r1, r7)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass6GP.A00(r0)
        L_0x004b:
            int r1 = r8.size()
            int r0 = r7.size()
            int r2 = java.lang.Math.min(r1, r0)
            java.util.List r6 = r4.A02
            int r0 = r6.size()
            int r1 = r6.size()
            if (r0 < r2) goto L_0x0075
            if (r1 <= r2) goto L_0x0082
            int r1 = X.C36421kH.A06(r6, r10)
        L_0x0069:
            if (r1 < r2) goto L_0x0082
            int r0 = X.C36421kH.A06(r6, r10)
            r6.remove(r0)
            int r1 = r1 + -1
            goto L_0x0069
        L_0x0075:
            if (r1 >= r2) goto L_0x0082
            X.9e9 r0 = new X.9e9
            r0.<init>()
            r6.add(r0)
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0082:
            android.graphics.PointF r5 = r5.A00
            android.graphics.PointF r3 = r3.A00
            float r2 = r5.x
            float r1 = r3.x
            android.graphics.PointF r0 = X.C200579hd.A00
            r9 = r27
            float r2 = X.AnonymousClass001.A00(r1, r2, r9)
            float r1 = r5.y
            float r0 = r3.y
            float r1 = X.AnonymousClass001.A00(r0, r1, r9)
            android.graphics.PointF r0 = r4.A00
            if (r0 != 0) goto L_0x00a5
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r4.A00 = r0
        L_0x00a5:
            r0.set(r2, r1)
            int r5 = X.C36421kH.A06(r6, r10)
        L_0x00ac:
            if (r5 < 0) goto L_0x011a
            java.lang.Object r1 = r8.get(r5)
            X.9e9 r1 = (X.C198759e9) r1
            java.lang.Object r0 = r7.get(r5)
            X.9e9 r0 = (X.C198759e9) r0
            android.graphics.PointF r15 = r1.A00
            android.graphics.PointF r13 = r1.A01
            android.graphics.PointF r11 = r1.A02
            android.graphics.PointF r14 = r0.A00
            android.graphics.PointF r12 = r0.A01
            android.graphics.PointF r10 = r0.A02
            java.lang.Object r3 = r6.get(r5)
            X.9e9 r3 = (X.C198759e9) r3
            float r1 = r15.x
            float r0 = r14.x
            float r2 = X.AnonymousClass001.A00(r0, r1, r9)
            float r1 = r15.y
            float r0 = r14.y
            float r1 = X.AnonymousClass001.A00(r0, r1, r9)
            android.graphics.PointF r0 = r3.A00
            r0.set(r2, r1)
            java.lang.Object r3 = r6.get(r5)
            X.9e9 r3 = (X.C198759e9) r3
            float r1 = r13.x
            float r0 = r12.x
            float r2 = X.AnonymousClass001.A00(r0, r1, r9)
            float r1 = r13.y
            float r0 = r12.y
            float r1 = X.AnonymousClass001.A00(r0, r1, r9)
            android.graphics.PointF r0 = r3.A01
            r0.set(r2, r1)
            java.lang.Object r3 = r6.get(r5)
            X.9e9 r3 = (X.C198759e9) r3
            float r1 = r11.x
            float r0 = r10.x
            float r2 = X.AnonymousClass001.A00(r0, r1, r9)
            float r1 = r11.y
            float r0 = r10.y
            float r1 = X.AnonymousClass001.A00(r0, r1, r9)
            android.graphics.PointF r0 = r3.A02
            r0.set(r2, r1)
            int r5 = r5 + -1
            goto L_0x00ac
        L_0x011a:
            r0 = r24
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0344
            int r19 = r0.size()
        L_0x0124:
            int r19 = r19 + -1
            if (r19 < 0) goto L_0x0344
            r0 = r24
            java.util.List r1 = r0.A00
            r0 = r19
            java.lang.Object r6 = r1.get(r0)
            X.9xy r6 = (X.C208279xy) r6
            java.util.List r14 = r4.A02
            int r1 = r14.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0124
            X.9Yb r0 = r6.A01
            float r18 = X.C196189Yb.A01(r0)
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0124
            boolean r5 = r4.A01
            int r11 = r14.size()
            r10 = 1
            int r11 = r11 - r10
            r3 = 0
            r7 = 0
        L_0x0152:
            if (r11 < 0) goto L_0x01a3
            java.lang.Object r12 = r14.get(r11)
            X.9e9 r12 = (X.C198759e9) r12
            int r2 = r11 + -1
            int r1 = r14.size()
            int r0 = A00(r2, r1)
            int r0 = r0 * r1
            int r2 = r2 - r0
            java.lang.Object r0 = r14.get(r2)
            X.9e9 r0 = (X.C198759e9) r0
            if (r11 != 0) goto L_0x0199
            if (r5 != 0) goto L_0x0199
            android.graphics.PointF r9 = r4.A00
        L_0x0172:
            r8 = r9
        L_0x0173:
            android.graphics.PointF r2 = r12.A00
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0182
            if (r11 != 0) goto L_0x0182
            int r0 = X.C36421kH.A06(r14, r10)
            r1 = 1
            if (r11 == r0) goto L_0x0183
        L_0x0182:
            r1 = 0
        L_0x0183:
            boolean r0 = r8.equals(r9)
            if (r0 == 0) goto L_0x0196
            boolean r0 = r2.equals(r9)
            if (r0 == 0) goto L_0x0196
            if (r1 != 0) goto L_0x0196
            int r7 = r7 + 2
        L_0x0193:
            int r11 = r11 + -1
            goto L_0x0152
        L_0x0196:
            int r7 = r7 + 1
            goto L_0x0193
        L_0x0199:
            android.graphics.PointF r9 = r0.A02
            if (r11 != 0) goto L_0x01a0
            if (r5 != 0) goto L_0x01a0
            goto L_0x0172
        L_0x01a0:
            android.graphics.PointF r8 = r0.A01
            goto L_0x0173
        L_0x01a3:
            X.9eA r0 = r6.A00
            if (r0 == 0) goto L_0x01af
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            if (r0 == r7) goto L_0x01ce
        L_0x01af:
            java.util.ArrayList r2 = X.C36441kJ.A14(r7)
            r1 = 0
        L_0x01b4:
            if (r1 >= r7) goto L_0x01c1
            X.9e9 r0 = new X.9e9
            r0.<init>()
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x01b4
        L_0x01c1:
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r0, r0)
            X.9eA r0 = new X.9eA
            r0.<init>(r1, r2, r3)
            r6.A00 = r0
        L_0x01ce:
            X.9eA r13 = r6.A00
            r13.A01 = r5
            android.graphics.PointF r0 = r4.A00
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.PointF r0 = r13.A00
            if (r0 != 0) goto L_0x01e3
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r13.A00 = r0
        L_0x01e3:
            r0.set(r2, r1)
            java.util.List r15 = r13.A02
            boolean r0 = r4.A01
            r17 = r0
            r8 = 0
            r7 = 0
        L_0x01ee:
            int r0 = r14.size()
            if (r8 >= r0) goto L_0x0341
            java.lang.Object r5 = r14.get(r8)
            X.9e9 r5 = (X.C198759e9) r5
            int r2 = r8 + -1
            int r1 = r14.size()
            int r0 = A00(r2, r1)
            int r0 = r0 * r1
            int r2 = r2 - r0
            java.lang.Object r9 = r14.get(r2)
            X.9e9 r9 = (X.C198759e9) r9
            int r2 = r8 + -2
            int r1 = r14.size()
            int r0 = A00(r2, r1)
            int r0 = r0 * r1
            int r2 = r2 - r0
            java.lang.Object r0 = r14.get(r2)
            X.9e9 r0 = (X.C198759e9) r0
            if (r8 != 0) goto L_0x0335
            if (r17 != 0) goto L_0x0335
            android.graphics.PointF r3 = r4.A00
        L_0x0224:
            r11 = r3
        L_0x0225:
            android.graphics.PointF r10 = r5.A00
            android.graphics.PointF r2 = r0.A02
            android.graphics.PointF r1 = r5.A02
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0238
            if (r8 != 0) goto L_0x0238
            int r0 = X.C36431kI.A07(r14)
            r6 = 1
            if (r8 == r0) goto L_0x0239
        L_0x0238:
            r6 = 0
        L_0x0239:
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L_0x02fb
            boolean r0 = r10.equals(r3)
            if (r0 == 0) goto L_0x02fb
            if (r6 != 0) goto L_0x02fb
            float r6 = r3.x
            float r12 = r2.x
            float r0 = r6 - r12
            float r5 = r3.y
            float r11 = r2.y
            float r2 = r5 - r11
            float r10 = r1.x
            float r10 = r10 - r6
            float r9 = r1.y
            float r9 = r9 - r5
            double r0 = (double) r0
            r22 = r0
            double r0 = (double) r2
            r2 = r22
            double r0 = java.lang.Math.hypot(r2, r0)
            float r2 = (float) r0
            r16 = r2
            double r0 = (double) r10
            r22 = r0
            double r0 = (double) r9
            r2 = r22
            double r0 = java.lang.Math.hypot(r2, r0)
            float r2 = (float) r0
            r3 = r2
            float r0 = r18 / r16
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = java.lang.Math.min(r0, r1)
            float r0 = r18 / r3
            float r1 = java.lang.Math.min(r0, r1)
            float r12 = r12 - r6
            float r12 = r12 * r2
            float r0 = r6 + r12
            float r11 = r11 - r5
            float r11 = r11 * r2
            float r3 = r5 + r11
            float r10 = r10 * r1
            float r2 = r6 + r10
            float r9 = r9 * r1
            float r16 = r5 + r9
            float r1 = r0 - r6
            r10 = 1057835346(0x3f0d4952, float:0.5519)
            float r1 = r1 * r10
            float r12 = r0 - r1
            float r1 = r3 - r5
            float r1 = r1 * r10
            float r9 = r3 - r1
            float r1 = r2 - r6
            float r1 = r1 * r10
            float r6 = r2 - r1
            float r1 = r16 - r5
            float r1 = r1 * r10
            float r5 = r16 - r1
            int r11 = r7 + -1
            int r10 = r15.size()
            int r1 = A00(r11, r10)
            int r1 = r1 * r10
            int r11 = r11 - r1
            java.lang.Object r11 = r15.get(r11)
            X.9e9 r11 = (X.C198759e9) r11
            java.lang.Object r1 = r15.get(r7)
            X.9e9 r1 = (X.C198759e9) r1
            android.graphics.PointF r10 = r11.A01
            r10.set(r0, r3)
            android.graphics.PointF r10 = r11.A02
            r10.set(r0, r3)
            if (r8 != 0) goto L_0x02d7
            android.graphics.PointF r10 = r13.A00
            if (r10 != 0) goto L_0x02d4
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>()
            r13.A00 = r10
        L_0x02d4:
            r10.set(r0, r3)
        L_0x02d7:
            android.graphics.PointF r3 = r1.A00
            r3.set(r12, r9)
            int r7 = r7 + 1
            java.lang.Object r3 = r15.get(r7)
            X.9e9 r3 = (X.C198759e9) r3
            android.graphics.PointF r0 = r1.A01
            r0.set(r6, r5)
            android.graphics.PointF r1 = r1.A02
            r0 = r16
            r1.set(r2, r0)
            android.graphics.PointF r1 = r3.A00
            r1.set(r2, r0)
        L_0x02f5:
            int r7 = r7 + 1
            int r8 = r8 + 1
            goto L_0x01ee
        L_0x02fb:
            int r2 = r7 + -1
            int r1 = r15.size()
            int r0 = A00(r2, r1)
            int r0 = r0 * r1
            int r2 = r2 - r0
            java.lang.Object r6 = r15.get(r2)
            X.9e9 r6 = (X.C198759e9) r6
            java.lang.Object r3 = r15.get(r7)
            X.9e9 r3 = (X.C198759e9) r3
            android.graphics.PointF r0 = r9.A01
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.PointF r0 = r6.A01
            r0.set(r2, r1)
            android.graphics.PointF r0 = r9.A02
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.PointF r0 = r6.A02
            r0.set(r2, r1)
            android.graphics.PointF r0 = r5.A00
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.PointF r0 = r3.A00
            r0.set(r2, r1)
            goto L_0x02f5
        L_0x0335:
            android.graphics.PointF r3 = r9.A02
            if (r8 != 0) goto L_0x033d
            if (r17 != 0) goto L_0x033d
            goto L_0x0224
        L_0x033d:
            android.graphics.PointF r11 = r9.A01
            goto L_0x0225
        L_0x0341:
            r4 = r13
            goto L_0x0124
        L_0x0344:
            r0 = r24
            android.graphics.Path r7 = r0.A01
            r7.reset()
            android.graphics.PointF r2 = r4.A00
            float r1 = r2.x
            float r0 = r2.y
            r7.moveTo(r1, r0)
            android.graphics.PointF r3 = X.C200579hd.A00
            float r1 = r2.x
            float r0 = r2.y
            r3.set(r1, r0)
            r2 = 0
        L_0x035e:
            java.util.List r1 = r4.A02
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x039f
            java.lang.Object r0 = r1.get(r2)
            X.9e9 r0 = (X.C198759e9) r0
            android.graphics.PointF r6 = r0.A00
            android.graphics.PointF r1 = r0.A01
            android.graphics.PointF r5 = r0.A02
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L_0x038f
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x038f
            float r1 = r5.x
            float r0 = r5.y
            r7.lineTo(r1, r0)
        L_0x0385:
            float r1 = r5.x
            float r0 = r5.y
            r3.set(r1, r0)
            int r2 = r2 + 1
            goto L_0x035e
        L_0x038f:
            float r8 = r6.x
            float r9 = r6.y
            float r10 = r1.x
            float r11 = r1.y
            float r12 = r5.x
            float r13 = r5.y
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            goto L_0x0385
        L_0x039f:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x03a6
            r7.close()
        L_0x03a6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684780t.A06(X.9mQ, float):java.lang.Object");
    }

    public C1684780t(List list) {
        super(list);
    }
}
