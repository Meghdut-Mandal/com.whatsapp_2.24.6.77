package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.81G  reason: invalid class name */
public class AnonymousClass81G extends C208409yC {
    public float A00;
    public boolean A01 = true;
    public C196189Yb A02;
    public final Paint A03 = new Paint();
    public final RectF A04 = C36441kJ.A0N();
    public final List A05 = AnonymousClass001.A0I();
    public final RectF A06 = C36441kJ.A0N();

    public void A0A(float f) {
        this.A00 = f;
        super.A0A(f);
        C196189Yb r3 = this.A02;
        if (r3 != null) {
            AnonymousClass9Y2 r0 = this.A0J.A0F;
            AnonymousClass9Y2 r02 = this.A0L.A09;
            f = ((C196189Yb.A01(r3) * r02.A01) - r02.A02) / ((r0.A00 - r0.A02) + 0.01f);
        }
        if (this.A02 == null) {
            C195509Uo r03 = this.A0L;
            float f2 = r03.A02;
            AnonymousClass9Y2 r04 = r03.A09;
            f -= f2 / (r04.A00 - r04.A02);
        }
        C195509Uo r1 = this.A0L;
        float f3 = r1.A03;
        if (f3 != 0.0f && !"__container".equals(r1.A0I)) {
            f /= f3;
        }
        List list = this.A05;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C208409yC) list.get(size)).A0A(f);
            } else {
                return;
            }
        }
    }

    public AnonymousClass81G(AnonymousClass9Y2 r11, C165737u4 r12, C195509Uo r13, List list) {
        super(r12, r13);
        C208409yC r0;
        C208409yC r2;
        String str;
        AnonymousClass815 r02 = r13.A0A;
        if (r02 != null) {
            AnonymousClass812 A002 = C1684680s.A00(r02);
            this.A02 = A002;
            A0C(A002);
            this.A02.A09(this);
        } else {
            this.A02 = null;
        }
        C000700i r3 = new C000700i(r11.A07.size());
        int A062 = C36421kH.A06(list, 1);
        C208409yC r5 = null;
        while (true) {
            if (A062 >= 0) {
                C195509Uo r9 = (C195509Uo) list.get(A062);
                int intValue = r9.A0G.intValue();
                switch (intValue) {
                    case 0:
                        r2 = new AnonymousClass81G(r11, r12, r9, C90524aI.A0o(r9.A0J, r11.A0B));
                        break;
                    case 1:
                        r2 = new AnonymousClass81E(r12, r9);
                        break;
                    case 2:
                        r2 = new AnonymousClass81D(r12, r9);
                        break;
                    case 3:
                        r2 = new AnonymousClass81C(r12, r9);
                        break;
                    case 4:
                        r2 = new AnonymousClass81F(r11, r12, this, r9);
                        break;
                    case 5:
                        r2 = new AnonymousClass81H(r12, r9);
                        break;
                    default:
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Unknown layer type ");
                        switch (intValue) {
                            case 1:
                                str = "SOLID";
                                break;
                            case 2:
                                str = "IMAGE";
                                break;
                            case 3:
                                str = "NULL";
                                break;
                            case 4:
                                str = "SHAPE";
                                break;
                            case 5:
                                str = "TEXT";
                                break;
                            case 6:
                                str = "UNKNOWN";
                                break;
                            default:
                                str = "PRE_COMP";
                                break;
                        }
                        AnonymousClass6GP.A00(AnonymousClass000.A0q(str, A0u));
                        continue;
                }
                r3.A0A(r2.A0L.A07, r2);
                if (r5 != null) {
                    r5.A04 = r2;
                    r5 = null;
                } else {
                    this.A05.add(0, r2);
                    int intValue2 = r9.A0H.intValue();
                    if (intValue2 == 1 || intValue2 == 2) {
                        r5 = r2;
                    }
                }
                A062--;
            } else {
                for (int i = 0; i < r3.A00(); i++) {
                    C208409yC r22 = (C208409yC) r3.A05(r3.A02(i));
                    if (!(r22 == null || (r0 = (C208409yC) r3.A05(r22.A0L.A08)) == null)) {
                        r22.A05 = r0;
                    }
                }
                return;
            }
        }
    }

    public void A0E(boolean z) {
        super.A0E(z);
        for (C208409yC A0E : this.A05) {
            A0E.A0E(z);
        }
    }

    public void B0q(C199409fG r3, Object obj) {
        super.B0q(r3, obj);
        if (obj != B4R.A0R) {
            return;
        }
        if (r3 == null) {
            C196189Yb r1 = this.A02;
            if (r1 != null) {
                r1.A0A((C199409fG) null);
                return;
            }
            return;
        }
        C1684980v r0 = new C1684980v(r3, (Object) null);
        this.A02 = r0;
        r0.A09(this);
        A0C(this.A02);
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        super.B8v(matrix, rectF, z);
        List list = this.A05;
        for (int size = list.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A06;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((C208409yC) list.get(size)).B8v(this.A0A, rectF2, true);
            rectF.union(rectF2);
        }
    }
}
