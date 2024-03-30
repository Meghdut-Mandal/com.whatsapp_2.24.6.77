package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* renamed from: X.80q  reason: invalid class name and case insensitive filesystem */
public class C1684480q extends C208379y9 {
    public C196189Yb A00;
    public final C196189Yb A01;
    public final C208409yC A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1684480q(X.C165737u4 r13, X.C208519yN r14, X.C208409yC r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r14.A05
            int r1 = r0.intValue()
            r2 = 0
            if (r1 == r2) goto L_0x0055
            r0 = 1
            if (r1 == r0) goto L_0x0052
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000e:
            java.lang.Integer r0 = r14.A06
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x004f
            if (r1 == r2) goto L_0x004c
            r0 = 1
            if (r1 == r0) goto L_0x0049
            r4 = 0
        L_0x001d:
            float r11 = r14.A00
            X.817 r8 = r14.A04
            X.815 r6 = r14.A03
            java.util.List r10 = r14.A08
            X.815 r7 = r14.A02
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A02 = r15
            java.lang.String r0 = r14.A07
            r12.A03 = r0
            boolean r0 = r14.A09
            r12.A04 = r0
            X.814 r0 = r14.A01
            java.util.List r1 = r0.A00
            X.80z r0 = new X.80z
            r0.<init>(r1)
            r12.A01 = r0
            r0.A09(r12)
            r15.A0C(r0)
            return
        L_0x0049:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x001d
        L_0x004c:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L_0x001d
        L_0x004f:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x001d
        L_0x0052:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000e
        L_0x0055:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684480q.<init>(X.7u4, X.9yN, X.9yC):void");
    }

    public void B5x(Canvas canvas, Matrix matrix, int i) {
        if (!this.A04) {
            Paint paint = this.A04;
            C1685380z r2 = (C1685380z) this.A01;
            paint.setColor(r2.A0B(r2.A06.BAb(), r2.A03()));
            C165587tf.A0w(paint, this.A00);
            super.B5x(canvas, matrix, i);
        }
    }

    public void B0q(C199409fG r3, Object obj) {
        super.B0q(r3, obj);
        if (obj == B4R.A0c) {
            this.A01.A0A(r3);
        } else if (obj == B4R.A01) {
            C196189Yb r1 = this.A00;
            if (r1 != null) {
                this.A02.A0M.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            C1684980v r0 = new C1684980v(r3, (Object) null);
            this.A00 = r0;
            r0.A09(this);
            this.A02.A0C(this.A01);
        }
    }

    public String getName() {
        return this.A03;
    }
}
