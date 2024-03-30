package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.9y2  reason: invalid class name and case insensitive filesystem */
public class C208319y2 implements B5O, C22853Ax3, B5P, Ax2, C17520rY {
    public C208359y6 A00;
    public final Matrix A01 = C90524aI.A0B();
    public final Path A02 = C36441kJ.A0M();
    public final C165737u4 A03;
    public final C196189Yb A04;
    public final C196189Yb A05;
    public final AnonymousClass9YD A06;
    public final C208409yC A07;
    public final String A08;
    public final boolean A09;

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Azr(java.util.ListIterator r8) {
        /*
            r7 = this;
            X.9y6 r0 = r7.A00
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r8.previous()
            if (r0 == r7) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x0016:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r8.previous()
            r5.add(r0)
            r8.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r5)
            X.7u4 r1 = r7.A03
            X.9yC r3 = r7.A07
            boolean r6 = r7.A09
            r2 = 0
            java.lang.String r4 = "Repeater"
            X.9y6 r0 = new X.9y6
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208319y2.Azr(java.util.ListIterator):void");
    }

    public void B0q(C199409fG r2, Object obj) {
        C196189Yb r0;
        if (!this.A06.A04(r2, obj)) {
            if (obj == B4R.A0M) {
                r0 = this.A04;
            } else if (obj == B4R.A0N) {
                r0 = this.A05;
            } else {
                return;
            }
            r0.A0A(r2);
        }
    }

    public void B5x(Canvas canvas, Matrix matrix, int i) {
        float A012 = C196189Yb.A01(this.A04);
        float A013 = C196189Yb.A01(this.A05);
        AnonymousClass9YD r7 = this.A06;
        float A014 = C196189Yb.A01(r7.A06) / 100.0f;
        float A015 = C196189Yb.A01(r7.A01) / 100.0f;
        int i2 = (int) A012;
        while (true) {
            i2--;
            if (i2 >= 0) {
                Matrix matrix2 = this.A01;
                matrix2.set(matrix);
                float f = (float) i2;
                matrix2.preConcat(r7.A01(f + A013));
                PointF pointF = C200579hd.A00;
                this.A00.B5x(canvas, matrix2, (int) (((float) i) * AnonymousClass001.A00(A015, A014, f / A012)));
            } else {
                return;
            }
        }
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        this.A00.B8v(matrix, rectF, z);
    }

    public Path BFG() {
        Path BFG = this.A00.BFG();
        Path path = this.A02;
        path.reset();
        float A012 = C196189Yb.A01(this.A04);
        float A013 = C196189Yb.A01(this.A05);
        int i = (int) A012;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.A01;
            matrix.set(this.A06.A01(((float) i) + A013));
            path.addPath(BFG, matrix);
        }
    }

    public void BkC() {
        this.A03.invalidateSelf();
    }

    public void Bqe(List list, List list2) {
        this.A00.Bqe(list, list2);
    }

    public C208319y2(C165737u4 r3, C208499yL r4, C208409yC r5) {
        this.A03 = r3;
        this.A07 = r5;
        this.A08 = r4.A03;
        this.A09 = r4.A04;
        AnonymousClass812 A002 = C1684680s.A00(r4.A00);
        this.A04 = A002;
        r5.A0C(A002);
        A002.A09(this);
        AnonymousClass812 A003 = C1684680s.A00(r4.A01);
        this.A05 = A003;
        r5.A0C(A003);
        A003.A09(this);
        AnonymousClass9YD r0 = new AnonymousClass9YD(r4.A02);
        this.A06 = r0;
        r0.A03(r5);
        r0.A02(this);
    }

    public void Bof(C201629k0 r4, C201629k0 r5, List list, int i) {
        C200579hd.A01(this, r4, r5, list, i);
        for (int i2 = 0; i2 < this.A00.A04.size(); i2++) {
            B0T b0t = (B0T) this.A00.A04.get(i2);
            if (b0t instanceof C17520rY) {
                C200579hd.A01((C17520rY) b0t, r4, r5, list, i);
            }
        }
    }

    public String getName() {
        return this.A08;
    }
}
