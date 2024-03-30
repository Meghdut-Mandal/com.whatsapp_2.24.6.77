package X;

/* renamed from: X.6EG  reason: invalid class name */
public abstract class AnonymousClass6EG {
    public C006302t A00;

    public final void A03() {
        C006302t r0;
        if (this instanceof C94654iZ) {
            r0 = ((C94654iZ) this).A0B;
        } else {
            r0 = this.A00;
        }
        if (r0 != null) {
            r0.invoke(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0122, code lost:
        if (r3.A0G != false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C161927nh r25) {
        /*
            r24 = this;
            r3 = r24
            boolean r0 = r3 instanceof X.C94644iY
            r23 = r25
            if (r0 == 0) goto L_0x0013
            X.4iY r3 = (X.C94644iY) r3
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r0 = r23
            r3.A05(r1, r0, r2)
        L_0x0012:
            return
        L_0x0013:
            boolean r0 = r3 instanceof X.C94634iX
            if (r0 == 0) goto L_0x0126
            X.4iX r3 = (X.C94634iX) r3
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0120
            java.util.List r1 = r3.A0D
            X.7mK r0 = r3.A0H
            X.C196279Yo.A01(r0, r1)
        L_0x0024:
            float r0 = r3.A06
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0081
            float r0 = r3.A04
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            X.7mK r0 = r3.A0H
            r3.A0B = r0
        L_0x003b:
            r7 = 0
            r3.A0E = r7
            r3.A0G = r7
            X.5zS r2 = r3.A09
            if (r2 == 0) goto L_0x0054
            X.7mK r1 = r3.A0B
            float r0 = r3.A00
            r10 = 0
            X.4iU r12 = X.C94604iU.A00
            r14 = 3
            r8 = r23
            r9 = r2
            r11 = r1
            r13 = r0
            r8.B6B(r9, r10, r11, r12, r13, r14)
        L_0x0054:
            X.5zS r6 = r3.A0A
            if (r6 == 0) goto L_0x0012
            X.4iT r5 = r3.A0C
            boolean r0 = r3.A0F
            if (r0 != 0) goto L_0x0060
            if (r5 != 0) goto L_0x0071
        L_0x0060:
            float r4 = r3.A03
            float r2 = r3.A02
            int r1 = r3.A07
            int r0 = r3.A08
            X.4iT r5 = new X.4iT
            r5.<init>(r4, r2, r1, r0)
            r3.A0C = r5
            r3.A0F = r7
        L_0x0071:
            X.7mK r1 = r3.A0B
            float r0 = r3.A01
            r9 = 0
            r13 = 3
            r7 = r23
            r8 = r6
            r10 = r1
            r11 = r5
            r12 = r0
            r7.B6B(r8, r9, r10, r11, r12, r13)
            return
        L_0x0081:
            X.7mK r0 = r3.A0B
            X.7mK r5 = r3.A0H
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)
            if (r0 == 0) goto L_0x00ef
            r2 = 0
            r1 = 1
            X.6g7 r0 = new X.6g7
            r0.<init>(r2, r2, r1)
            r3.A0B = r0
        L_0x0094:
            X.00T r9 = r3.A0I
            java.lang.Object r0 = r9.getValue()
            X.7bS r0 = (X.AnonymousClass7bS) r0
            X.6g8 r0 = (X.C137436g8) r0
            r2 = 0
            android.graphics.PathMeasure r1 = r0.A00
            X.6g7 r5 = (X.C137426g7) r5
            android.graphics.Path r0 = r5.A02
            r1.setPath(r0, r2)
            java.lang.Object r0 = r9.getValue()
            X.7bS r0 = (X.AnonymousClass7bS) r0
            X.6g8 r0 = (X.C137436g8) r0
            android.graphics.PathMeasure r0 = r0.A00
            float r8 = r0.getLength()
            float r7 = r3.A06
            float r0 = r3.A05
            float r7 = r7 + r0
            float r7 = r7 % r10
            float r7 = r7 * r8
            float r6 = r3.A04
            float r6 = r6 + r0
            float r6 = r6 % r10
            float r6 = r6 * r8
            int r5 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            java.lang.Object r1 = r9.getValue()
            X.7bS r1 = (X.AnonymousClass7bS) r1
            X.7mK r0 = r3.A0B
            X.6g8 r1 = (X.C137436g8) r1
            r2 = 1
            android.graphics.PathMeasure r1 = r1.A00
            X.6g7 r0 = (X.C137426g7) r0
            android.graphics.Path r0 = r0.A02
            if (r5 <= 0) goto L_0x011b
            r1.getSegment(r7, r8, r0, r2)
            java.lang.Object r1 = r9.getValue()
            X.7bS r1 = (X.AnonymousClass7bS) r1
            X.7mK r0 = r3.A0B
            X.6g8 r1 = (X.C137436g8) r1
            android.graphics.PathMeasure r1 = r1.A00
            X.6g7 r0 = (X.C137426g7) r0
            android.graphics.Path r0 = r0.A02
            r1.getSegment(r4, r6, r0, r2)
            goto L_0x003b
        L_0x00ef:
            X.7mK r0 = r3.A0B
            X.6g7 r0 = (X.C137426g7) r0
            android.graphics.Path r0 = r0.A02
            android.graphics.Path$FillType r1 = r0.getFillType()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            boolean r2 = X.C36361kB.A1a(r1, r0)
            X.7mK r0 = r3.A0B
            X.6g7 r0 = (X.C137426g7) r0
            android.graphics.Path r0 = r0.A02
            r0.rewind()
            X.7mK r0 = r3.A0B
            X.6g7 r0 = (X.C137426g7) r0
            android.graphics.Path r1 = r0.A02
            r0 = 1
            if (r2 != r0) goto L_0x0118
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0113:
            r1.setFillType(r0)
            goto L_0x0094
        L_0x0118:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x0113
        L_0x011b:
            r1.getSegment(r7, r6, r0, r2)
            goto L_0x003b
        L_0x0120:
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x003b
            goto L_0x0024
        L_0x0126:
            X.4iZ r3 = (X.C94654iZ) r3
            boolean r0 = r3.A0D
            r7 = 0
            if (r0 == 0) goto L_0x01e1
            float[] r6 = r3.A0F
            if (r6 != 0) goto L_0x0252
            float[] r6 = X.AnonymousClass6VX.A04()
            r3.A0F = r6
        L_0x0137:
            float r0 = r3.A05
            float r9 = r3.A00
            float r1 = r9 + r0
            float r0 = r3.A06
            float r8 = r3.A01
            float r0 = r0 + r8
            X.AnonymousClass6VX.A03(r6, r1, r0)
            float r0 = r3.A02
            double r4 = (double) r0
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r4 = r4 * r0
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r4 = r4 / r0
            double r0 = java.lang.Math.cos(r4)
            float r2 = (float) r0
            double r0 = java.lang.Math.sin(r4)
            float r14 = (float) r0
            r1 = r6[r7]
            r13 = 4
            r0 = r6[r13]
            float r22 = X.C90514aH.A00(r2, r1, r14, r0)
            float r15 = -r14
            float r21 = X.C90514aH.A00(r1, r15, r0, r2)
            r12 = 1
            r1 = r6[r12]
            r11 = 5
            r0 = r6[r11]
            float r20 = X.C90514aH.A00(r2, r1, r14, r0)
            float r19 = X.C90514aH.A00(r1, r15, r0, r2)
            r10 = 2
            r1 = r6[r10]
            r5 = 6
            r0 = r6[r5]
            float r18 = X.C90514aH.A00(r2, r1, r14, r0)
            float r17 = X.C90514aH.A00(r1, r15, r0, r2)
            r4 = 3
            r1 = r6[r4]
            r16 = 7
            r0 = r6[r16]
            float r14 = X.C90514aH.A00(r2, r1, r14, r0)
            float r0 = X.C90514aH.A00(r15, r1, r2, r0)
            r6[r7] = r22
            r6[r12] = r20
            r6[r10] = r18
            r6[r4] = r14
            r6[r13] = r21
            r6[r11] = r19
            r6[r5] = r17
            r6[r16] = r0
            float r0 = r3.A03
            float r2 = r3.A04
            r1 = 1065353216(0x3f800000, float:1.0)
            X.C90504aG.A1R(r6, r0, r7)
            X.C90504aG.A1R(r6, r0, r12)
            X.C90504aG.A1R(r6, r0, r10)
            X.C90504aG.A1R(r6, r0, r4)
            X.C90504aG.A1R(r6, r2, r13)
            X.C90504aG.A1R(r6, r2, r11)
            X.C90504aG.A1R(r6, r2, r5)
            r0 = 7
            X.C90504aG.A1R(r6, r2, r0)
            r0 = 8
            X.C90504aG.A1R(r6, r1, r0)
            r0 = 9
            X.C90504aG.A1R(r6, r1, r0)
            r0 = 10
            X.C90504aG.A1R(r6, r1, r0)
            r0 = 11
            X.C90504aG.A1R(r6, r1, r0)
            float r1 = -r9
            float r0 = -r8
            X.AnonymousClass6VX.A03(r6, r1, r0)
            r3.A0D = r7
        L_0x01e1:
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0201
            java.util.List r0 = r3.A0A
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 == 0) goto L_0x01ff
            X.7mK r2 = r3.A08
            if (r2 != 0) goto L_0x01fa
            r1 = 0
            r0 = 1
            X.6g7 r2 = new X.6g7
            r2.<init>(r1, r1, r0)
            r3.A08 = r2
        L_0x01fa:
            java.util.List r0 = r3.A0A
            X.C196279Yo.A01(r2, r0)
        L_0x01ff:
            r3.A0C = r7
        L_0x0201:
            X.7bT r1 = r23.BBD()
            X.6gD r1 = (X.C137486gD) r1
            X.6gE r0 = r1.A01
            X.6Bs r6 = r0.A02
            long r4 = r6.A00
            X.7m3 r0 = r6.A01
            r0.BpF()
            X.7iJ r8 = r1.A00
            float[] r1 = r3.A0F
            if (r1 == 0) goto L_0x0224
            r0 = r8
            X.6gG r0 = (X.C137516gG) r0
            X.7bT r0 = r0.A00
            X.7m3 r0 = X.C128306Bs.A00(r0)
            r0.B3L(r1)
        L_0x0224:
            X.7mK r2 = r3.A08
            java.util.List r0 = r3.A0A
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 == 0) goto L_0x023c
            if (r2 == 0) goto L_0x023c
            X.6gG r8 = (X.C137516gG) r8
            r1 = 1
            X.7bT r0 = r8.A00
            X.7m3 r0 = X.C128306Bs.A00(r0)
            r0.B2w(r2, r1)
        L_0x023c:
            java.util.List r3 = r3.A0G
            int r2 = r3.size()
        L_0x0242:
            if (r7 >= r2) goto L_0x0257
            java.lang.Object r1 = r3.get(r7)
            X.6EG r1 = (X.AnonymousClass6EG) r1
            r0 = r23
            r1.A04(r0)
            int r7 = r7 + 1
            goto L_0x0242
        L_0x0252:
            X.AnonymousClass6VX.A02(r6)
            goto L_0x0137
        L_0x0257:
            X.7m3 r0 = r6.A01
            r0.Boi()
            r6.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EG.A04(X.7nh):void");
    }
}
