package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.9y9  reason: invalid class name and case insensitive filesystem */
public abstract class C208379y9 implements C22853Ax3, B5P, C17520rY {
    public float A00;
    public C196189Yb A01;
    public C196189Yb A02;
    public C208369y8 A03;
    public final Paint A04;
    public final Path A05 = C36441kJ.A0M();
    public final Path A06 = C36441kJ.A0M();
    public final PathMeasure A07 = new PathMeasure();
    public final C196189Yb A08;
    public final List A09;
    public final float[] A0A;
    public final RectF A0B = C36441kJ.A0N();
    public final C165737u4 A0C;
    public final C196189Yb A0D;
    public final C196189Yb A0E;
    public final List A0F = AnonymousClass001.A0I();
    public final C208409yC A0G;

    public void B0q(C199409fG r3, Object obj) {
        C208409yC r1;
        C196189Yb r0;
        C208369y8 r02;
        C196189Yb r03;
        C208369y8 r04;
        C208369y8 r05;
        C208369y8 r06;
        C208369y8 r07;
        if (obj == B4R.A0b) {
            r03 = this.A0D;
        } else if (obj == B4R.A0O) {
            r03 = this.A0E;
        } else {
            if (obj == B4R.A01) {
                C196189Yb r12 = this.A02;
                if (r12 != null) {
                    this.A0G.A0M.remove(r12);
                }
                if (r3 == null) {
                    this.A02 = null;
                    return;
                }
                C1684980v r08 = new C1684980v(r3, (Object) null);
                this.A02 = r08;
                r08.A09(this);
                r1 = this.A0G;
                r0 = this.A02;
            } else if (obj == B4R.A0A) {
                r03 = this.A01;
                if (r03 == null) {
                    C1684980v r09 = new C1684980v(r3, (Object) null);
                    this.A01 = r09;
                    r09.A09(this);
                    r1 = this.A0G;
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
        float f;
        float f2;
        float f3;
        BlurMaskFilter blurMaskFilter;
        float A012;
        float[] fArr = (float[]) C203079nF.A00.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        Matrix matrix2 = matrix;
        matrix2.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            AnonymousClass810 r2 = (AnonymousClass810) this.A0D;
            Paint paint = this.A04;
            int i2 = 0;
            PointF pointF = C200579hd.A00;
            paint.setAlpha(C165607th.A03(255, (int) ((((((float) i) / 255.0f) * ((float) r2.A0B(r2.A06.BAb(), r2.A03()))) / 100.0f) * 255.0f), 0));
            paint.setStrokeWidth(((AnonymousClass812) this.A0E).A0B() * C203079nF.A01(matrix2));
            if (paint.getStrokeWidth() > 0.0f) {
                List list = this.A09;
                if (!list.isEmpty()) {
                    float A013 = C203079nF.A01(matrix2);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        float[] fArr2 = this.A0A;
                        float A014 = C196189Yb.A01((C196189Yb) list.get(i3));
                        fArr2[i3] = A014;
                        float f4 = 0.1f;
                        if (i3 % 2 == 0) {
                            f4 = 1.0f;
                        }
                        if (A014 < f4) {
                            fArr2[i3] = f4;
                        }
                        fArr2[i3] = fArr2[i3] * A013;
                    }
                    C196189Yb r0 = this.A08;
                    if (r0 == null) {
                        A012 = 0.0f;
                    } else {
                        A012 = A013 * C196189Yb.A01(r0);
                    }
                    paint.setPathEffect(new DashPathEffect(this.A0A, A012));
                }
                C165587tf.A0w(paint, this.A02);
                C196189Yb r02 = this.A01;
                if (r02 != null) {
                    float A015 = C196189Yb.A01(r02);
                    if (A015 == 0.0f) {
                        blurMaskFilter = null;
                    } else {
                        if (A015 != this.A00) {
                            C208409yC r22 = this.A0G;
                            if (r22.A00 == A015) {
                                blurMaskFilter = r22.A01;
                            } else {
                                blurMaskFilter = new BlurMaskFilter(A015 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                                r22.A01 = blurMaskFilter;
                                r22.A00 = A015;
                            }
                        }
                        this.A00 = A015;
                    }
                    paint.setMaskFilter(blurMaskFilter);
                    this.A00 = A015;
                }
                C208369y8 r03 = this.A03;
                if (r03 != null) {
                    r03.A00(paint);
                }
                while (true) {
                    List list2 = this.A0F;
                    if (i2 < list2.size()) {
                        AnonymousClass9G6 r10 = (AnonymousClass9G6) list2.get(i2);
                        Canvas canvas2 = canvas;
                        if (r10.A00 != null) {
                            C208289xz r9 = r10.A00;
                            if (r9 != null) {
                                Path path = this.A05;
                                path.reset();
                                List list3 = r10.A01;
                                int size = list3.size();
                                while (true) {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                    C165577te.A0u(matrix2, path, list3, size);
                                }
                                float A016 = C196189Yb.A01(r9.A02) / 100.0f;
                                float A017 = C196189Yb.A01(r9.A00) / 100.0f;
                                float A018 = C196189Yb.A01(r9.A01) / 360.0f;
                                if (A016 >= 0.01f || A017 <= 0.99f) {
                                    PathMeasure pathMeasure = this.A07;
                                    pathMeasure.setPath(path, false);
                                    float length = pathMeasure.getLength();
                                    while (pathMeasure.nextContour()) {
                                        length += pathMeasure.getLength();
                                    }
                                    float f5 = A018 * length;
                                    float f6 = (A016 * length) + f5;
                                    float min = Math.min((A017 * length) + f5, (f6 + length) - 1.0f);
                                    float f7 = 0.0f;
                                    for (int A072 = C36431kI.A07(list3); A072 >= 0; A072--) {
                                        Path path2 = this.A06;
                                        path2.set(((B5O) list3.get(A072)).BFG());
                                        path2.transform(matrix2);
                                        pathMeasure.setPath(path2, false);
                                        float length2 = pathMeasure.getLength();
                                        if (min > length) {
                                            float f8 = min - length;
                                            if (f8 < f7 + length2 && f7 < f8) {
                                                if (f6 > length) {
                                                    f2 = (f6 - length) / length2;
                                                } else {
                                                    f2 = 0.0f;
                                                }
                                                f3 = Math.min(f8 / length2, 1.0f);
                                                C203079nF.A03(path2, f2, f3, 0.0f);
                                                canvas2.drawPath(path2, paint);
                                                f7 += length2;
                                            }
                                        }
                                        float f9 = f7 + length2;
                                        if (f9 >= f6 && f7 <= min) {
                                            if (f9 > min || f6 >= f7) {
                                                if (f6 < f7) {
                                                    f = 0.0f;
                                                } else {
                                                    f = (f6 - f7) / length2;
                                                }
                                                if (min > f9) {
                                                    f3 = 1.0f;
                                                } else {
                                                    f3 = (min - f7) / length2;
                                                }
                                                C203079nF.A03(path2, f2, f3, 0.0f);
                                            }
                                            canvas2.drawPath(path2, paint);
                                        }
                                        f7 += length2;
                                    }
                                } else {
                                    canvas2.drawPath(path, paint);
                                }
                            }
                        } else {
                            Path path3 = this.A05;
                            path3.reset();
                            int size2 = r10.A01.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                C165577te.A0u(matrix2, path3, r10.A01, size2);
                            }
                            canvas2.drawPath(path3, paint);
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A05;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A0F;
            if (i < list.size()) {
                AnonymousClass9G6 r2 = (AnonymousClass9G6) list.get(i);
                for (int i2 = 0; i2 < r2.A01.size(); i2++) {
                    C165577te.A0u(matrix, path, r2.A01, i2);
                }
                i++;
            } else {
                RectF rectF2 = this.A0B;
                path.computeBounds(rectF2, false);
                C165587tf.A0x(rectF2, rectF2.left, ((AnonymousClass812) this.A0E).A0B() / 2.0f);
                rectF.set(rectF2);
                C165587tf.A0x(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public void BkC() {
        this.A0C.invalidateSelf();
    }

    public C208379y9(Paint.Cap cap, Paint.Join join, C165737u4 r7, AnonymousClass815 r8, AnonymousClass815 r9, AnonymousClass817 r10, C208409yC r11, List list, float f) {
        AnonymousClass812 A002;
        C165717u2 r1 = new C165717u2(1);
        this.A04 = r1;
        this.A00 = 0.0f;
        this.A0C = r7;
        this.A0G = r11;
        r1.setStyle(Paint.Style.STROKE);
        r1.setStrokeCap(cap);
        r1.setStrokeJoin(join);
        r1.setStrokeMiter(f);
        this.A0D = new AnonymousClass810(r10.A00);
        this.A0E = C1684680s.A00(r8);
        if (r9 == null) {
            A002 = null;
        } else {
            A002 = C1684680s.A00(r9);
        }
        this.A08 = A002;
        this.A09 = C36361kB.A0r(list);
        this.A0A = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.A09.add(C1684680s.A00((C208459yH) list.get(i)));
        }
        r11.A0C(this.A0D);
        r11.A0C(this.A0E);
        for (int i2 = 0; i2 < this.A09.size(); i2++) {
            r11.A0C((C196189Yb) this.A09.get(i2));
        }
        C196189Yb r0 = this.A08;
        if (r0 != null) {
            r11.A0C(r0);
        }
        this.A0D.A09(this);
        this.A0E.A09(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C196189Yb) this.A09.get(i3)).A09(this);
        }
        C196189Yb r02 = this.A08;
        if (r02 != null) {
            r02.A09(this);
        }
        C190979Bc A082 = r11.A08();
        if (A082 != null) {
            AnonymousClass812 A003 = C1684680s.A00(A082.A00);
            this.A01 = A003;
            A003.A09(this);
            r11.A0C(this.A01);
        }
        AnonymousClass9M9 A092 = r11.A09();
        if (A092 != null) {
            this.A03 = new C208369y8(this, r11, A092);
        }
    }

    public void Bof(C201629k0 r1, C201629k0 r2, List list, int i) {
        C200579hd.A01(this, r1, r2, list, i);
    }

    public void Bqe(List list, List list2) {
        AnonymousClass9G6 r5 = null;
        C208289xz r6 = null;
        for (int A072 = C36431kI.A07(list); A072 >= 0; A072--) {
            B0T b0t = (B0T) list.get(A072);
            if (b0t instanceof C208289xz) {
                C208289xz r2 = (C208289xz) b0t;
                if (r2.A03 == C023109s.A01) {
                    r6 = r2;
                }
            }
        }
        if (r6 != null) {
            r6.A04.add(this);
        }
        for (int A073 = C36431kI.A07(list2); A073 >= 0; A073--) {
            B0T b0t2 = (B0T) list2.get(A073);
            if (b0t2 instanceof C208289xz) {
                C208289xz r22 = (C208289xz) b0t2;
                if (r22.A03 == C023109s.A01) {
                    if (r5 != null) {
                        this.A0F.add(r5);
                    }
                    r5 = new AnonymousClass9G6(r22);
                    r22.A04.add(this);
                }
            }
            if (b0t2 instanceof B5O) {
                if (r5 == null) {
                    r5 = new AnonymousClass9G6(r6);
                }
                r5.A01.add(b0t2);
            }
        }
        if (r5 != null) {
            this.A0F.add(r5);
        }
    }
}
