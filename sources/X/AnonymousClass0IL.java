package X;

import android.view.View;

/* renamed from: X.0IL  reason: invalid class name */
public abstract class AnonymousClass0IL extends AnonymousClass0I9 {
    public AnonymousClass0CY A00;
    public AnonymousClass0CY A01;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(X.AnonymousClass0CY r12, X.AnonymousClass0CP r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = 2
            int[] r1 = new int[r0]
            android.widget.Scroller r2 = r11.A00
            r3 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r5 = r14
            r6 = r15
            r2.fling(r3, r4, r5, r6, r7, r8, r9, r10)
            android.widget.Scroller r0 = r11.A00
            int r0 = r0.getFinalX()
            r1[r3] = r0
            android.widget.Scroller r0 = r11.A00
            int r2 = r0.getFinalY()
            r0 = 1
            r1[r0] = r2
            int r10 = r13.A0L()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L_0x004f
            r8 = 0
            r7 = 0
            r4 = r7
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0037:
            if (r8 >= r10) goto L_0x0052
            android.view.View r3 = r13.A0R(r8)
            int r2 = X.AnonymousClass0CP.A02(r3)
            r0 = -1
            if (r2 == r0) goto L_0x004c
            if (r2 >= r6) goto L_0x0048
            r7 = r3
            r6 = r2
        L_0x0048:
            if (r2 <= r5) goto L_0x004c
            r4 = r3
            r5 = r2
        L_0x004c:
            int r8 = r8 + 1
            goto L_0x0037
        L_0x004f:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0078
        L_0x0052:
            if (r7 == 0) goto L_0x004f
            if (r4 == 0) goto L_0x004f
            int r2 = r12.A09(r7)
            int r0 = r12.A09(r4)
            int r3 = java.lang.Math.min(r2, r0)
            int r2 = r12.A06(r7)
            int r0 = r12.A06(r4)
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = r0 - r3
            if (r0 == 0) goto L_0x004f
            float r4 = (float) r0
            float r4 = r4 * r9
            int r5 = r5 - r6
            int r0 = r5 + 1
            float r0 = (float) r0
            float r4 = r4 / r0
        L_0x0078:
            r2 = 0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            return r2
        L_0x007f:
            r3 = r1[r2]
            int r2 = java.lang.Math.abs(r3)
            r0 = 1
            r1 = r1[r0]
            int r0 = java.lang.Math.abs(r1)
            if (r2 > r0) goto L_0x008f
            r3 = r1
        L_0x008f:
            float r0 = (float) r3
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IL.A01(X.0CY, X.0CP, int, int):int");
    }

    public int[] A08(View view, AnonymousClass0CP r7) {
        int[] iArr = new int[2];
        if (r7.A1N()) {
            AnonymousClass0CY r1 = this.A00;
            if (r1 == null || r1.A02 != r7) {
                r1 = new C18180sk(r7, 0);
                this.A00 = r1;
            }
            iArr[0] = AnonymousClass0I9.A00(view, r1);
        } else {
            iArr[0] = 0;
        }
        if (r7.A1O()) {
            AnonymousClass0CY r12 = this.A01;
            if (r12 == null || r12.A02 != r7) {
                r12 = new C18180sk(r7, 1);
                this.A01 = r12;
            }
            iArr[1] = AnonymousClass0I9.A00(view, r12);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(X.AnonymousClass0CP r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.AnonymousClass0CQ
            r6 = -1
            if (r0 == 0) goto L_0x007a
            int r5 = r11.A0M()
            if (r5 == 0) goto L_0x007a
            android.view.View r0 = r10.A04(r11)
            if (r0 == 0) goto L_0x007a
            int r4 = X.AnonymousClass0CP.A02(r0)
            if (r4 == r6) goto L_0x007a
            r0 = r11
            X.0CQ r0 = (X.AnonymousClass0CQ) r0
            int r3 = r5 + -1
            android.graphics.PointF r8 = r0.B3K(r3)
            if (r8 == 0) goto L_0x007a
            boolean r0 = r11.A1N()
            r9 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0077
            X.0CY r1 = r10.A00
            if (r1 == 0) goto L_0x0032
            X.0CP r0 = r1.A02
            if (r0 == r11) goto L_0x0039
        L_0x0032:
            X.0sk r1 = new X.0sk
            r1.<init>(r11, r2)
            r10.A00 = r1
        L_0x0039:
            int r7 = r10.A01(r1, r11, r12, r2)
            float r0 = r8.x
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            int r7 = -r7
        L_0x0044:
            boolean r0 = r11.A1O()
            if (r0 == 0) goto L_0x0075
            X.0CY r1 = r10.A01
            if (r1 == 0) goto L_0x0052
            X.0CP r0 = r1.A02
            if (r0 == r11) goto L_0x005a
        L_0x0052:
            r0 = 1
            X.0sk r1 = new X.0sk
            r1.<init>(r11, r0)
            r10.A01 = r1
        L_0x005a:
            int r1 = r10.A01(r1, r11, r2, r13)
            float r0 = r8.y
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0065
            int r1 = -r1
        L_0x0065:
            boolean r0 = r11.A1O()
            if (r0 == 0) goto L_0x006c
            r7 = r1
        L_0x006c:
            if (r7 == 0) goto L_0x007a
            int r4 = r4 + r7
            if (r4 < 0) goto L_0x0072
            r2 = r4
        L_0x0072:
            if (r2 >= r5) goto L_0x0079
            return r2
        L_0x0075:
            r1 = 0
            goto L_0x0065
        L_0x0077:
            r7 = 0
            goto L_0x0044
        L_0x0079:
            return r3
        L_0x007a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IL.A03(X.0CP, int, int):int");
    }

    public View A04(AnonymousClass0CP r10) {
        AnonymousClass0CY r7;
        if (r10.A1O()) {
            r7 = this.A01;
            if (r7 == null || r7.A02 != r10) {
                r7 = new C18180sk(r10, 1);
                this.A01 = r7;
            }
        } else if (!r10.A1N()) {
            return null;
        } else {
            r7 = this.A00;
            if (r7 == null || r7.A02 != r10) {
                r7 = new C18180sk(r10, 0);
                this.A00 = r7;
            }
        }
        int A0L = r10.A0L();
        View view = null;
        if (A0L == 0) {
            return null;
        }
        int A04 = r7.A04() + (r7.A05() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0L; i2++) {
            View A0R = r10.A0R(i2);
            int A05 = AnonymousClass000.A05(r7.A09(A0R) + (r7.A07(A0R) / 2), A04);
            if (A05 < i) {
                view = A0R;
                i = A05;
            }
        }
        return view;
    }
}
