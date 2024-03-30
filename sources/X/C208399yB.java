package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.9yB  reason: invalid class name and case insensitive filesystem */
public class C208399yB implements C22853Ax3, B5P, C17520rY {
    public float A00;
    public C196189Yb A01;
    public C196189Yb A02;
    public C208369y8 A03;
    public C1684980v A04;
    public final C000700i A05 = new C000700i();
    public final C000700i A06 = new C000700i();
    public final C196189Yb A07;
    public final C196189Yb A08;
    public final C196189Yb A09;
    public final int A0A;
    public final Paint A0B;
    public final Path A0C;
    public final RectF A0D;
    public final C165737u4 A0E;
    public final C196189Yb A0F;
    public final C208409yC A0G;
    public final Integer A0H;
    public final String A0I;
    public final List A0J;
    public final boolean A0K;

    public void Bqe(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof B5O) {
                this.A0J.add(obj);
            }
        }
    }

    private int A00() {
        float f = this.A09.A02;
        float f2 = (float) this.A0A;
        int A062 = C90514aH.A06(f, f2);
        int A063 = C90514aH.A06(this.A08.A02, f2);
        int A064 = C90514aH.A06(this.A07.A02, f2);
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
        C1684980v r0 = this.A04;
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

    public void B0q(C199409fG r4, Object obj) {
        C208409yC r1;
        C196189Yb r0;
        C208369y8 r02;
        C196189Yb r03;
        C208369y8 r04;
        C208369y8 r05;
        C208369y8 r06;
        C208369y8 r07;
        if (obj == B4R.A0b) {
            r03 = this.A0F;
        } else {
            if (obj == B4R.A01) {
                C196189Yb r12 = this.A02;
                if (r12 != null) {
                    this.A0G.A0M.remove(r12);
                }
                if (r4 == null) {
                    this.A02 = null;
                    return;
                }
                C1684980v r08 = new C1684980v(r4, (Object) null);
                this.A02 = r08;
                r08.A09(this);
                r1 = this.A0G;
                r0 = this.A02;
            } else if (obj == B4R.A0e) {
                C1684980v r13 = this.A04;
                if (r13 != null) {
                    this.A0G.A0M.remove(r13);
                }
                if (r4 == null) {
                    this.A04 = null;
                    return;
                }
                this.A05.A07();
                this.A06.A07();
                C1684980v r09 = new C1684980v(r4, (Object) null);
                this.A04 = r09;
                r09.A09(this);
                r1 = this.A0G;
                r0 = this.A04;
            } else if (obj == B4R.A0A) {
                r03 = this.A01;
                if (r03 == null) {
                    C1684980v r010 = new C1684980v(r4, (Object) null);
                    this.A01 = r010;
                    r010.A09(this);
                    r1 = this.A0G;
                    r0 = this.A01;
                }
            } else if (obj == B4R.A0a && (r07 = this.A03) != null) {
                r03 = r07.A01;
            } else if (obj == B4R.A0E && (r06 = this.A03) != null) {
                r06.A01(r4);
                return;
            } else if (obj == B4R.A0C && (r05 = this.A03) != null) {
                r03 = r05.A02;
            } else if (obj == B4R.A0D && (r04 = this.A03) != null) {
                r03 = r04.A03;
            } else if (obj == B4R.A0F && (r02 = this.A03) != null) {
                r03 = r02.A04;
            } else {
                return;
            }
            r1.A0C(r0);
            return;
        }
        r03.A0A(r4);
    }

    public void B5x(Canvas canvas, Matrix matrix, int i) {
        Matrix matrix2;
        Shader shader;
        BlurMaskFilter blurMaskFilter;
        if (!this.A0K) {
            Path path = this.A0C;
            path.reset();
            int i2 = 0;
            while (true) {
                List list = this.A0J;
                matrix2 = matrix;
                if (i2 >= list.size()) {
                    break;
                }
                C165577te.A0u(matrix2, path, list, i2);
                i2++;
            }
            path.computeBounds(this.A0D, false);
            Integer num = this.A0H;
            Integer num2 = C023109s.A00;
            int A002 = A00();
            if (num == num2) {
                C000700i r5 = this.A05;
                long j = (long) A002;
                shader = (Shader) r5.A05(j);
                if (shader == null) {
                    PointF A022 = C196189Yb.A02(this.A09);
                    PointF A023 = C196189Yb.A02(this.A08);
                    AnonymousClass9QB r4 = (AnonymousClass9QB) this.A07.A05();
                    int[] A012 = A01(r4.A01);
                    float[] fArr = r4.A00;
                    float f = A022.x;
                    float f2 = A022.y;
                    float f3 = A023.x;
                    float f4 = A023.y;
                    shader = new LinearGradient(f, f2, f3, f4, A012, fArr, Shader.TileMode.CLAMP);
                    r5.A0A(j, shader);
                }
            } else {
                C000700i r7 = this.A06;
                long j2 = (long) A002;
                shader = (Shader) r7.A05(j2);
                if (shader == null) {
                    PointF A024 = C196189Yb.A02(this.A09);
                    PointF A025 = C196189Yb.A02(this.A08);
                    AnonymousClass9QB r1 = (AnonymousClass9QB) this.A07.A05();
                    int[] A013 = A01(r1.A01);
                    float[] fArr2 = r1.A00;
                    float f5 = A024.x;
                    float f6 = A024.y;
                    float hypot = (float) Math.hypot((double) (A025.x - f5), (double) (A025.y - f6));
                    if (hypot <= 0.0f) {
                        hypot = 0.001f;
                    }
                    shader = new RadialGradient(f5, f6, hypot, A013, fArr2, Shader.TileMode.CLAMP);
                    r7.A0A(j2, shader);
                }
            }
            shader.setLocalMatrix(matrix2);
            Paint paint = this.A0B;
            paint.setShader(shader);
            C165587tf.A0w(paint, this.A02);
            C196189Yb r0 = this.A01;
            if (r0 != null) {
                float A014 = C196189Yb.A01(r0);
                if (A014 == 0.0f) {
                    blurMaskFilter = null;
                } else {
                    if (A014 != this.A00) {
                        blurMaskFilter = new BlurMaskFilter(A014, BlurMaskFilter.Blur.NORMAL);
                    }
                    this.A00 = A014;
                }
                paint.setMaskFilter(blurMaskFilter);
                this.A00 = A014;
            }
            C208369y8 r02 = this.A03;
            if (r02 != null) {
                r02.A00(paint);
            }
            PointF pointF = C200579hd.A00;
            paint.setAlpha(C165607th.A03(255, (int) ((((((float) i) / 255.0f) * ((float) AnonymousClass000.A0I(this.A0F.A05()))) / 100.0f) * 255.0f), 0));
            canvas.drawPath(path, paint);
        }
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A0C;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0J;
            if (i < list.size()) {
                C165577te.A0u(matrix, path, list, i);
                i++;
            } else {
                path.computeBounds(rectF, false);
                C165587tf.A0x(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public void BkC() {
        this.A0E.invalidateSelf();
    }

    public C208399yB(AnonymousClass9Y2 r4, C165737u4 r5, C208509yM r6, C208409yC r7) {
        Path A0M = C36441kJ.A0M();
        this.A0C = A0M;
        this.A0B = new C165717u2(1);
        this.A0D = C36441kJ.A0N();
        this.A0J = AnonymousClass001.A0I();
        this.A00 = 0.0f;
        this.A0G = r7;
        this.A0I = r6.A06;
        this.A0K = r6.A07;
        this.A0E = r5;
        this.A0H = r6.A05;
        A0M.setFillType(r6.A00);
        this.A0A = (int) (r4.A01() / 32.0f);
        C1685080w r0 = new C1685080w(r6.A01.A00);
        this.A07 = r0;
        r0.A09(this);
        r7.A0C(r0);
        AnonymousClass810 r02 = new AnonymousClass810(r6.A02.A00);
        this.A0F = r02;
        r02.A09(this);
        r7.A0C(r02);
        AnonymousClass813 r03 = new AnonymousClass813(r6.A04.A00);
        this.A09 = r03;
        r03.A09(this);
        r7.A0C(r03);
        AnonymousClass813 r04 = new AnonymousClass813(r6.A03.A00);
        this.A08 = r04;
        r04.A09(this);
        r7.A0C(r04);
        C190979Bc A082 = r7.A08();
        if (A082 != null) {
            AnonymousClass812 A002 = C1684680s.A00(A082.A00);
            this.A01 = A002;
            A002.A09(this);
            r7.A0C(this.A01);
        }
        AnonymousClass9M9 A092 = r7.A09();
        if (A092 != null) {
            this.A03 = new C208369y8(this, r7, A092);
        }
    }

    public void Bof(C201629k0 r1, C201629k0 r2, List list, int i) {
        C200579hd.A01(this, r1, r2, list, i);
    }

    public String getName() {
        return this.A0I;
    }
}
