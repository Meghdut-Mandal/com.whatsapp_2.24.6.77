package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: X.9YD  reason: invalid class name */
public class AnonymousClass9YD {
    public C196189Yb A00;
    public C196189Yb A01;
    public C196189Yb A02;
    public C196189Yb A03;
    public C196189Yb A04;
    public C196189Yb A05;
    public C196189Yb A06;
    public AnonymousClass812 A07;
    public AnonymousClass812 A08;
    public final float[] A09;
    public final Matrix A0A = C90524aI.A0B();
    public final Matrix A0B;
    public final Matrix A0C;
    public final Matrix A0D;

    public Matrix A00() {
        PointF A022;
        float cos;
        float sin;
        float[] fArr;
        float A0B2;
        PointF A023;
        Matrix matrix = this.A0A;
        matrix.reset();
        C196189Yb r0 = this.A03;
        if (!(r0 == null || (A023 = C196189Yb.A02(r0)) == null)) {
            float f = A023.x;
            if (!(f == 0.0f && A023.y == 0.0f)) {
                matrix.preTranslate(f, A023.y);
            }
        }
        C196189Yb r1 = this.A04;
        if (r1 != null) {
            if (r1 instanceof C1684980v) {
                A0B2 = C196189Yb.A01(r1);
            } else {
                A0B2 = ((AnonymousClass812) r1).A0B();
            }
            if (A0B2 != 0.0f) {
                matrix.preRotate(A0B2);
            }
        }
        AnonymousClass812 r2 = this.A07;
        if (r2 != null) {
            AnonymousClass812 r02 = this.A08;
            if (r02 == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((double) ((-r02.A0B()) + 90.0f)));
            }
            AnonymousClass812 r03 = this.A08;
            if (r03 == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((double) ((-r03.A0B()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) r2.A0B()));
            int i = 0;
            do {
                fArr = this.A09;
                fArr[i] = 0.0f;
                i++;
            } while (i < 9);
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.A0B;
            matrix2.setValues(fArr);
            int i2 = 0;
            do {
                fArr[i2] = 0.0f;
                i2++;
            } while (i2 < 9);
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.A0C;
            matrix3.setValues(fArr);
            int i3 = 0;
            do {
                fArr[i3] = 0.0f;
                i3++;
            } while (i3 < 9);
            fArr[0] = cos;
            fArr[1] = f2;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.A0D;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        C196189Yb r04 = this.A05;
        if (r04 != null) {
            C198639dx r22 = (C198639dx) r04.A05();
            float f3 = r22.A00;
            if (!(f3 == 1.0f && r22.A01 == 1.0f)) {
                matrix.preScale(f3, r22.A01);
            }
        }
        C196189Yb r05 = this.A00;
        if (!(r05 == null || (((A022 = C196189Yb.A02(r05)) == null || A022.x == 0.0f) && A022.y == 0.0f))) {
            matrix.preTranslate(-A022.x, -A022.y);
        }
        return matrix;
    }

    public Matrix A01(float f) {
        PointF A022;
        C198639dx r0;
        float f2;
        C196189Yb r02 = this.A03;
        PointF pointF = null;
        if (r02 == null) {
            A022 = null;
        } else {
            A022 = C196189Yb.A02(r02);
        }
        C196189Yb r03 = this.A05;
        if (r03 == null) {
            r0 = null;
        } else {
            r0 = (C198639dx) r03.A05();
        }
        Matrix matrix = this.A0A;
        matrix.reset();
        if (A022 != null) {
            matrix.preTranslate(A022.x * f, A022.y * f);
        }
        if (r0 != null) {
            double d = (double) f;
            matrix.preScale((float) Math.pow((double) r0.A00, d), (float) Math.pow((double) r0.A01, d));
        }
        C196189Yb r04 = this.A04;
        if (r04 != null) {
            float A012 = C196189Yb.A01(r04);
            C196189Yb r05 = this.A00;
            if (r05 != null) {
                pointF = C196189Yb.A02(r05);
            }
            float f3 = A012 * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return matrix;
    }

    public void A02(C22853Ax3 ax3) {
        C196189Yb r0 = this.A02;
        if (r0 != null) {
            r0.A09(ax3);
        }
        C196189Yb r02 = this.A06;
        if (r02 != null) {
            r02.A09(ax3);
        }
        C196189Yb r03 = this.A01;
        if (r03 != null) {
            r03.A09(ax3);
        }
        C196189Yb r04 = this.A00;
        if (r04 != null) {
            r04.A09(ax3);
        }
        C196189Yb r05 = this.A03;
        if (r05 != null) {
            r05.A09(ax3);
        }
        C196189Yb r06 = this.A05;
        if (r06 != null) {
            r06.A09(ax3);
        }
        C196189Yb r07 = this.A04;
        if (r07 != null) {
            r07.A09(ax3);
        }
        AnonymousClass812 r08 = this.A07;
        if (r08 != null) {
            r08.A09(ax3);
        }
        AnonymousClass812 r09 = this.A08;
        if (r09 != null) {
            r09.A09(ax3);
        }
    }

    public void A03(C208409yC r2) {
        r2.A0C(this.A02);
        r2.A0C(this.A06);
        r2.A0C(this.A01);
        r2.A0C(this.A00);
        r2.A0C(this.A03);
        r2.A0C(this.A05);
        r2.A0C(this.A04);
        r2.A0C(this.A07);
        r2.A0C(this.A08);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C199409fG r4, java.lang.Object r5) {
        /*
            r3 = this;
            android.graphics.PointF r0 = X.B4R.A05
            if (r5 != r0) goto L_0x0016
            X.9Yb r0 = r3.A00
            if (r0 != 0) goto L_0x00c8
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.80v r0 = new X.80v
            r0.<init>(r4, r1)
            r3.A00 = r0
        L_0x0014:
            r0 = 1
            return r0
        L_0x0016:
            android.graphics.PointF r0 = X.B4R.A06
            if (r5 != r0) goto L_0x002b
            X.9Yb r0 = r3.A03
            if (r0 != 0) goto L_0x00c8
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            X.80v r0 = new X.80v
            r0.<init>(r4, r1)
            r3.A03 = r0
            goto L_0x0014
        L_0x002b:
            java.lang.Float r0 = X.B4R.A0T
            if (r5 != r0) goto L_0x0045
            X.9Yb r2 = r3.A03
            boolean r0 = r2 instanceof X.C1684880u
            if (r0 == 0) goto L_0x0045
            X.80u r2 = (X.C1684880u) r2
            X.9fG r1 = r2.A00
            if (r1 == 0) goto L_0x003e
            r0 = 0
            r1.A00 = r0
        L_0x003e:
            r2.A00 = r4
        L_0x0040:
            if (r4 == 0) goto L_0x0014
            r4.A00 = r2
            goto L_0x0014
        L_0x0045:
            java.lang.Float r0 = X.B4R.A0U
            if (r5 != r0) goto L_0x005b
            X.9Yb r2 = r3.A03
            boolean r0 = r2 instanceof X.C1684880u
            if (r0 == 0) goto L_0x005b
            X.80u r2 = (X.C1684880u) r2
            X.9fG r1 = r2.A01
            if (r1 == 0) goto L_0x0058
            r0 = 0
            r1.A00 = r0
        L_0x0058:
            r2.A01 = r4
            goto L_0x0040
        L_0x005b:
            X.9dx r0 = X.B4R.A08
            if (r5 != r0) goto L_0x0070
            X.9Yb r0 = r3.A05
            if (r0 != 0) goto L_0x00c8
            X.9dx r1 = new X.9dx
            r1.<init>()
            X.80v r0 = new X.80v
            r0.<init>(r4, r1)
            r3.A05 = r0
            goto L_0x0014
        L_0x0070:
            java.lang.Float r0 = X.B4R.A0V
            r2 = 0
            if (r5 != r0) goto L_0x0085
            X.9Yb r0 = r3.A04
            if (r0 != 0) goto L_0x00c8
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.80v r0 = new X.80v
            r0.<init>(r4, r1)
            r3.A04 = r0
            goto L_0x0014
        L_0x0085:
            java.lang.Integer r0 = X.B4R.A0d
            if (r5 != r0) goto L_0x009c
            X.9Yb r0 = r3.A02
            if (r0 != 0) goto L_0x00c8
            r0 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.80v r0 = new X.80v
            r0.<init>(r4, r1)
            r3.A02 = r0
            goto L_0x0014
        L_0x009c:
            java.lang.Float r0 = X.B4R.A0Y
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r5 != r0) goto L_0x00b3
            X.9Yb r0 = r3.A06
            if (r0 != 0) goto L_0x00c8
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.80v r0 = new X.80v
            r0.<init>(r4, r1)
            r3.A06 = r0
            goto L_0x0014
        L_0x00b3:
            java.lang.Float r0 = X.B4R.A0S
            if (r5 != r0) goto L_0x00cd
            X.9Yb r0 = r3.A01
            if (r0 != 0) goto L_0x00c8
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            X.80v r0 = new X.80v
            r0.<init>(r4, r1)
            r3.A01 = r0
            goto L_0x0014
        L_0x00c8:
            r0.A0A(r4)
            goto L_0x0014
        L_0x00cd:
            java.lang.Float r0 = X.B4R.A0W
            if (r5 != r0) goto L_0x00ee
            X.812 r1 = r3.A07
            if (r1 != 0) goto L_0x00e9
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.9mQ r0 = new X.9mQ
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.812 r1 = new X.812
            r1.<init>(r0)
            r3.A07 = r1
        L_0x00e9:
            r1.A0A(r4)
            goto L_0x0014
        L_0x00ee:
            java.lang.Float r0 = X.B4R.A0X
            if (r5 != r0) goto L_0x010b
            X.812 r1 = r3.A08
            if (r1 != 0) goto L_0x00e9
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            X.9mQ r0 = new X.9mQ
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.812 r1 = new X.812
            r1.<init>(r0)
            r3.A08 = r1
            goto L_0x00e9
        L_0x010b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YD.A04(X.9fG, java.lang.Object):boolean");
    }

    public AnonymousClass9YD(C208599yW r4) {
        C196189Yb B4M;
        C196189Yb B4M2;
        C1685180x r1;
        AnonymousClass812 A002;
        AnonymousClass812 A003;
        AnonymousClass812 A004;
        C208449yG r0 = r4.A06;
        if (r0 == null) {
            B4M = null;
        } else {
            B4M = r0.B4M();
        }
        this.A00 = B4M;
        B25 b25 = r4.A08;
        if (b25 == null) {
            B4M2 = null;
        } else {
            B4M2 = b25.B4M();
        }
        this.A03 = B4M2;
        AnonymousClass819 r02 = r4.A07;
        if (r02 == null) {
            r1 = null;
        } else {
            r1 = new C1685180x(r02.A00);
        }
        this.A05 = r1;
        AnonymousClass815 r03 = r4.A01;
        if (r03 == null) {
            A002 = null;
        } else {
            A002 = C1684680s.A00(r03);
        }
        this.A04 = A002;
        AnonymousClass815 r04 = r4.A02;
        if (r04 == null) {
            A003 = null;
        } else {
            A003 = C1684680s.A00(r04);
        }
        this.A07 = A003;
        if (A003 != null) {
            this.A0B = C90524aI.A0B();
            this.A0C = C90524aI.A0B();
            this.A0D = C90524aI.A0B();
            this.A09 = new float[9];
        }
        AnonymousClass815 r05 = r4.A03;
        if (r05 == null) {
            A004 = null;
        } else {
            A004 = C1684680s.A00(r05);
        }
        this.A08 = A004;
        AnonymousClass817 r06 = r4.A05;
        if (r06 != null) {
            this.A02 = new AnonymousClass810(r06.A00);
        }
        AnonymousClass815 r07 = r4.A04;
        if (r07 != null) {
            this.A06 = C1684680s.A00(r07);
        } else {
            this.A06 = null;
        }
        AnonymousClass815 r08 = r4.A00;
        if (r08 != null) {
            this.A01 = C1684680s.A00(r08);
        } else {
            this.A01 = null;
        }
    }
}
