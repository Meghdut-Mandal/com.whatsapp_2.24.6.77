package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.80r  reason: invalid class name and case insensitive filesystem */
public class C1684580r extends C208379y9 {
    public C1684980v A00;
    public final C000700i A01;
    public final C000700i A02;
    public final C196189Yb A03;
    public final C196189Yb A04;
    public final C196189Yb A05;
    public final int A06;
    public final RectF A07;
    public final Integer A08;
    public final String A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1684580r(X.C165737u4 r13, X.AnonymousClass9yP r14, X.C208409yC r15) {
        /*
            r12 = this;
            java.lang.Integer r0 = r14.A07
            int r1 = r0.intValue()
            r2 = 0
            if (r1 == r2) goto L_0x009a
            r0 = 1
            if (r1 == r0) goto L_0x0096
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
        L_0x000e:
            java.lang.Integer r0 = r14.A09
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0093
            if (r1 == r2) goto L_0x0090
            r0 = 1
            if (r1 == r0) goto L_0x008d
            r4 = 0
        L_0x001d:
            float r11 = r14.A00
            X.817 r8 = r14.A04
            X.815 r6 = r14.A02
            java.util.List r10 = r14.A0B
            X.815 r7 = r14.A01
            r2 = r12
            r5 = r13
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.00i r0 = new X.00i
            r0.<init>()
            r12.A01 = r0
            X.00i r0 = new X.00i
            r0.<init>()
            r12.A02 = r0
            android.graphics.RectF r0 = X.C36441kJ.A0N()
            r12.A07 = r0
            java.lang.String r0 = r14.A0A
            r12.A09 = r0
            java.lang.Integer r0 = r14.A08
            r12.A08 = r0
            boolean r0 = r14.A0C
            r12.A0A = r0
            X.9Y2 r0 = r13.A0F
            float r1 = r0.A01()
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            r12.A06 = r0
            X.816 r0 = r14.A03
            java.util.List r1 = r0.A00
            X.80w r0 = new X.80w
            r0.<init>(r1)
            r12.A03 = r0
            r0.A09(r12)
            r15.A0C(r0)
            X.818 r0 = r14.A06
            java.util.List r1 = r0.A00
            X.813 r0 = new X.813
            r0.<init>(r1)
            r12.A05 = r0
            r0.A09(r12)
            r15.A0C(r0)
            X.818 r0 = r14.A05
            java.util.List r1 = r0.A00
            X.813 r0 = new X.813
            r0.<init>(r1)
            r12.A04 = r0
            r0.A09(r12)
            r15.A0C(r0)
            return
        L_0x008d:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x001d
        L_0x0090:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
            goto L_0x001d
        L_0x0093:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x001d
        L_0x0096:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L_0x000e
        L_0x009a:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684580r.<init>(X.7u4, X.9yP, X.9yC):void");
    }

    private int A00() {
        float f = this.A05.A02;
        float f2 = (float) this.A06;
        int A062 = C90514aH.A06(f, f2);
        int A063 = C90514aH.A06(this.A04.A02, f2);
        int A064 = C90514aH.A06(this.A03.A02, f2);
        int i = 17;
        if (A062 != 0) {
            i = 527 * A062;
        }
        if (A063 != 0) {
            i = i * 31 * A063;
        }
        if (A064 != 0) {
            return i * 31 * A064;
        }
        return i;
    }

    private int[] A01(int[] iArr) {
        C1684980v r0 = this.A00;
        if (r0 != null) {
            Integer[] numArr = (Integer[]) r0.A05();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < length2) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (i < length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public void B5x(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.A0A) {
            Matrix matrix2 = matrix;
            B8v(matrix2, this.A07, false);
            Integer num = this.A08;
            Integer num2 = C023109s.A00;
            int A002 = A00();
            if (num == num2) {
                C000700i r5 = this.A01;
                long j = (long) A002;
                shader = (Shader) r5.A05(j);
                if (shader == null) {
                    PointF A022 = C196189Yb.A02(this.A05);
                    PointF A023 = C196189Yb.A02(this.A04);
                    AnonymousClass9QB r4 = (AnonymousClass9QB) this.A03.A05();
                    shader = new LinearGradient(A022.x, A022.y, A023.x, A023.y, A01(r4.A01), r4.A00, Shader.TileMode.CLAMP);
                    r5.A0A(j, shader);
                }
            } else {
                C000700i r7 = this.A02;
                long j2 = (long) A002;
                shader = (Shader) r7.A05(j2);
                if (shader == null) {
                    PointF A024 = C196189Yb.A02(this.A05);
                    PointF A025 = C196189Yb.A02(this.A04);
                    AnonymousClass9QB r2 = (AnonymousClass9QB) this.A03.A05();
                    int[] A012 = A01(r2.A01);
                    float[] fArr = r2.A00;
                    float f = A024.x;
                    float f2 = A024.y;
                    shader = new RadialGradient(f, f2, (float) Math.hypot((double) (A025.x - f), (double) (A025.y - f2)), A012, fArr, Shader.TileMode.CLAMP);
                    r7.A0A(j2, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            this.A04.setShader(shader);
            super.B5x(canvas, matrix2, i);
        }
    }

    public void B0q(C199409fG r3, Object obj) {
        super.B0q(r3, obj);
        if (obj == B4R.A0e) {
            C1684980v r1 = this.A00;
            if (r1 != null) {
                this.A0G.A0M.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            C1684980v r0 = new C1684980v(r3, (Object) null);
            this.A00 = r0;
            r0.A09(this);
            this.A0G.A0C(this.A00);
        }
    }

    public String getName() {
        return this.A09;
    }
}
