package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.9yA  reason: invalid class name and case insensitive filesystem */
public class C208389yA implements C22853Ax3, B5P, C17520rY {
    public float A00;
    public C196189Yb A01;
    public C196189Yb A02;
    public C208369y8 A03;
    public final Paint A04 = new C165717u2(1);
    public final Path A05;
    public final C165737u4 A06;
    public final C196189Yb A07;
    public final C196189Yb A08;
    public final C208409yC A09;
    public final String A0A;
    public final List A0B = AnonymousClass001.A0I();
    public final boolean A0C;

    public void Bqe(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof B5O) {
                this.A0B.add(obj);
            }
        }
    }

    public void B0q(C199409fG r3, Object obj) {
        C208409yC r1;
        C196189Yb r0;
        C208369y8 r02;
        C196189Yb r03;
        C208369y8 r04;
        C208369y8 r05;
        C208369y8 r06;
        C208369y8 r07;
        if (obj == B4R.A0Z) {
            r03 = this.A07;
        } else if (obj == B4R.A0b) {
            r03 = this.A08;
        } else {
            if (obj == B4R.A01) {
                C196189Yb r12 = this.A02;
                if (r12 != null) {
                    this.A09.A0M.remove(r12);
                }
                if (r3 == null) {
                    this.A02 = null;
                    return;
                }
                C1684980v r08 = new C1684980v(r3, (Object) null);
                this.A02 = r08;
                r08.A09(this);
                r1 = this.A09;
                r0 = this.A02;
            } else if (obj == B4R.A0A) {
                r03 = this.A01;
                if (r03 == null) {
                    C1684980v r09 = new C1684980v(r3, (Object) null);
                    this.A01 = r09;
                    r09.A09(this);
                    r1 = this.A09;
                    r0 = this.A01;
                }
            } else if (obj == B4R.A0a && (r07 = this.A03) != null) {
                r03 = r07.A01;
            } else if (obj == B4R.A0E && (r06 = this.A03) != null) {
                r06.A01(r3);
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
        r03.A0A(r3);
    }

    public void B5x(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (!this.A0C) {
            C1685380z r2 = (C1685380z) this.A07;
            int A0B2 = r2.A0B(r2.A06.BAb(), r2.A03());
            Paint paint = this.A04;
            int i2 = 0;
            PointF pointF = C200579hd.A00;
            paint.setColor((C165607th.A03(255, (int) ((((((float) i) / 255.0f) * ((float) AnonymousClass000.A0I(this.A08.A05()))) / 100.0f) * 255.0f), 0) << 24) | (A0B2 & 16777215));
            C165587tf.A0w(paint, this.A02);
            C196189Yb r0 = this.A01;
            if (r0 != null) {
                float A012 = C196189Yb.A01(r0);
                if (A012 == 0.0f) {
                    blurMaskFilter = null;
                } else {
                    if (A012 != this.A00) {
                        C208409yC r22 = this.A09;
                        if (r22.A00 == A012) {
                            blurMaskFilter = r22.A01;
                        } else {
                            blurMaskFilter = new BlurMaskFilter(A012 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                            r22.A01 = blurMaskFilter;
                            r22.A00 = A012;
                        }
                    }
                    this.A00 = A012;
                }
                paint.setMaskFilter(blurMaskFilter);
                this.A00 = A012;
            }
            C208369y8 r02 = this.A03;
            if (r02 != null) {
                r02.A00(paint);
            }
            Path path = this.A05;
            path.reset();
            while (true) {
                List list = this.A0B;
                if (i2 < list.size()) {
                    C165577te.A0u(matrix, path, list, i2);
                    i2++;
                } else {
                    canvas.drawPath(path, paint);
                    return;
                }
            }
        }
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0B;
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
        this.A06.invalidateSelf();
    }

    public C208389yA(C165737u4 r5, C208589yV r6, C208409yC r7) {
        Path A0M = C36441kJ.A0M();
        this.A05 = A0M;
        this.A09 = r7;
        this.A0A = r6.A03;
        this.A0C = r6.A04;
        this.A06 = r5;
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
        AnonymousClass814 r1 = r6.A01;
        if (r1 != null) {
            AnonymousClass817 r2 = r6.A02;
            A0M.setFillType(r6.A00);
            C1685380z r0 = new C1685380z(r1.A00);
            this.A07 = r0;
            r0.A09(this);
            r7.A0C(r0);
            AnonymousClass810 r02 = new AnonymousClass810(r2.A00);
            this.A08 = r02;
            r02.A09(this);
            r7.A0C(r02);
            return;
        }
        this.A07 = null;
        this.A08 = null;
    }

    public void Bof(C201629k0 r1, C201629k0 r2, List list, int i) {
        C200579hd.A01(this, r1, r2, list, i);
    }

    public String getName() {
        return this.A0A;
    }
}
