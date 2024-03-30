package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;

/* renamed from: X.9Yb  reason: invalid class name and case insensitive filesystem */
public abstract class C196189Yb {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public C199409fG A03;
    public boolean A04 = false;
    public Object A05 = null;
    public final B36 A06;
    public final List A07 = C36441kJ.A14(1);

    public void A07() {
        int i = 0;
        while (true) {
            List list = this.A07;
            if (i < list.size()) {
                ((C22853Ax3) list.get(i)).BkC();
                i++;
            } else {
                return;
            }
        }
    }

    public float A03() {
        C202689mQ BAb = this.A06.BAb();
        if (BAb == null || BAb.A03()) {
            return 0.0f;
        }
        return BAb.A0B.getInterpolation(A04());
    }

    public float A04() {
        if (this.A04) {
            return 0.0f;
        }
        C202689mQ BAb = this.A06.BAb();
        if (!BAb.A03()) {
            return (this.A02 - BAb.A02()) / (BAb.A01() - BAb.A02());
        }
        return 0.0f;
    }

    public Object A05() {
        Object A062;
        Interpolator interpolator;
        if (this instanceof C1684980v) {
            C1684980v r0 = (C1684980v) this;
            C199409fG r1 = r0.A03;
            Object obj = r0.A00;
            float f = r0.A02;
            return r1.A01(obj, obj, 0.0f, 0.0f, f, f, f);
        } else if (this instanceof C1684880u) {
            return ((C1684880u) this).A0B(0.0f);
        } else {
            float A042 = A04();
            if (this.A03 == null && this.A06.BLJ(A042)) {
                return this.A05;
            }
            C202689mQ BAb = this.A06.BAb();
            Interpolator interpolator2 = BAb.A0C;
            if (interpolator2 == null || (interpolator = BAb.A0D) == null) {
                A062 = A06(BAb, A03());
            } else {
                float interpolation = interpolator2.getInterpolation(A042);
                float interpolation2 = interpolator.getInterpolation(A042);
                if (this instanceof AnonymousClass813) {
                    A062 = ((AnonymousClass813) this).A0B(BAb, A042, interpolation, interpolation2);
                } else {
                    throw AnonymousClass001.A0E("This animation does not support split dimensions!");
                }
            }
            this.A05 = A062;
            return A062;
        }
    }

    public Object A06(C202689mQ r15, float f) {
        Object A012;
        Object obj;
        Object A013;
        Object obj2;
        float floatValue;
        float f2 = f;
        if (this instanceof C1684980v) {
            return A05();
        }
        if (this instanceof C1684880u) {
            return ((C1684880u) this).A0B(f2);
        }
        if (this instanceof AnonymousClass811) {
            C199409fG r6 = this.A03;
            if (r6 != null) {
                float f3 = r15.A0A;
                Float f4 = r15.A07;
                if (f4 == null) {
                    floatValue = Float.MAX_VALUE;
                } else {
                    floatValue = f4.floatValue();
                }
                Object obj3 = r15.A0E;
                Object obj4 = r15.A08;
                if (obj4 == null) {
                    obj4 = obj3;
                }
                return r6.A01(obj3, obj4, f3, floatValue, f2, A03(), this.A02);
            } else if (f != 1.0f || (obj2 = r15.A08) == null) {
                return r15.A0E;
            } else {
                return obj2;
            }
        } else if (this instanceof C1685180x) {
            C1685180x r1 = (C1685180x) this;
            Object obj5 = r15.A0E;
            if (obj5 == null || (obj = r15.A08) == null) {
                throw AnonymousClass001.A09("Missing values for keyframe.");
            }
            C198639dx r7 = (C198639dx) obj5;
            C198639dx r8 = (C198639dx) obj;
            C199409fG r62 = r1.A03;
            if (r62 != null && (A013 = r62.A01(r7, r8, r15.A0A, r15.A07.floatValue(), f2, r1.A04(), r1.A02)) != null) {
                return A013;
            }
            C198639dx r3 = r1.A00;
            float f5 = r7.A00;
            float f6 = r8.A00;
            PointF pointF = C200579hd.A00;
            float A002 = AnonymousClass001.A00(f6, f5, f2);
            float A003 = AnonymousClass001.A00(r8.A01, r7.A01, f2);
            r3.A00 = A002;
            r3.A01 = A003;
            return r3;
        } else if (this instanceof AnonymousClass813) {
            return ((AnonymousClass813) this).A0B(r15, f2, f2, f2);
        } else {
            if (this instanceof C1685280y) {
                C1685280y r32 = (C1685280y) this;
                AnonymousClass81J r2 = (AnonymousClass81J) r15;
                Path path = r2.A00;
                if (path == null) {
                    return r15.A0E;
                }
                C199409fG r5 = r32.A03;
                if (r5 != null && (A012 = r5.A01(r2.A0E, r2.A08, r2.A0A, r2.A07.floatValue(), r32.A04(), f2, r32.A02)) != null) {
                    return A012;
                }
                if (r32.A00 != r2) {
                    r32.A01.setPath(path, false);
                    r32.A00 = r2;
                }
                PathMeasure pathMeasure = r32.A01;
                float[] fArr = r32.A03;
                pathMeasure.getPosTan(f * pathMeasure.getLength(), fArr, (float[]) null);
                PointF pointF2 = r32.A02;
                pointF2.set(fArr[0], fArr[1]);
                return pointF2;
            } else if (this instanceof AnonymousClass810) {
                return Integer.valueOf(((AnonymousClass810) this).A0B(r15, f2));
            } else {
                if (this instanceof C1685080w) {
                    AnonymousClass9QB r82 = ((C1685080w) this).A00;
                    AnonymousClass9QB r72 = (AnonymousClass9QB) r15.A0E;
                    AnonymousClass9QB r9 = (AnonymousClass9QB) r15.A08;
                    int[] iArr = r72.A01;
                    int length = iArr.length;
                    int[] iArr2 = r9.A01;
                    int length2 = iArr2.length;
                    if (length == length2) {
                        for (int i = 0; i < length; i++) {
                            float[] fArr2 = r82.A00;
                            float f7 = r72.A00[i];
                            float f8 = r9.A00[i];
                            PointF pointF3 = C200579hd.A00;
                            fArr2[i] = AnonymousClass001.A00(f8, f7, f2);
                            r82.A01[i] = C200309h8.A02(f2, iArr[i], iArr2[i]);
                        }
                        return r82;
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Cannot interpolate between gradients. Lengths vary (");
                    A0u.append(length);
                    A0u.append(" vs ");
                    A0u.append(length2);
                    throw AnonymousClass000.A0c(")", A0u);
                } else if (this instanceof AnonymousClass812) {
                    return Float.valueOf(((AnonymousClass812) this).A0C(r15, f2));
                } else {
                    return Integer.valueOf(((C1685380z) this).A0B(r15, f2));
                }
            }
        }
    }

    public void A08(float f) {
        if (this instanceof C1684980v) {
            this.A02 = f;
        } else if (this instanceof C1684880u) {
            C1684880u r3 = (C1684880u) this;
            C196189Yb r1 = r3.A03;
            r1.A08(f);
            C196189Yb r0 = r3.A04;
            r0.A08(f);
            r3.A02.set(A01(r1), A01(r0));
            int i = 0;
            while (true) {
                List list = r3.A07;
                if (i < list.size()) {
                    ((C22853Ax3) list.get(i)).BkC();
                    i++;
                } else {
                    return;
                }
            }
        } else {
            B36 b36 = this.A06;
            if (!b36.isEmpty()) {
                float f2 = this.A01;
                if (f2 == -1.0f) {
                    f2 = b36.BHs();
                    this.A01 = f2;
                }
                if (f < f2) {
                    if (f2 == -1.0f) {
                        f2 = b36.BHs();
                        this.A01 = f2;
                    }
                    f = f2;
                } else {
                    float f3 = this.A00;
                    if (f3 == -1.0f) {
                        f3 = b36.BBZ();
                        this.A00 = f3;
                    }
                    if (f > f3) {
                        f = this.A00;
                        if (f == -1.0f) {
                            f = b36.BBZ();
                            this.A00 = f;
                        }
                    }
                }
                if (f != this.A02) {
                    this.A02 = f;
                    if (b36.BNh(f)) {
                        A07();
                    }
                }
            }
        }
    }

    public void A09(C22853Ax3 ax3) {
        this.A07.add(ax3);
    }

    public void A0A(C199409fG r3) {
        C199409fG r1 = this.A03;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A03 = r3;
        if (r3 != null) {
            r3.A00 = this;
        }
    }

    public C196189Yb(List list) {
        B36 r0;
        if (list.isEmpty()) {
            r0 = new C208419yD();
        } else if (list.size() == 1) {
            r0 = new C208429yE(list);
        } else {
            r0 = new C208439yF(list);
        }
        this.A06 = r0;
    }

    public static float A01(C196189Yb r0) {
        return ((Number) r0.A05()).floatValue();
    }

    public static PointF A02(C196189Yb r0) {
        return (PointF) r0.A05();
    }
}
