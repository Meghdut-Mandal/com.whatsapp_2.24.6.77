package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.9Yo  reason: invalid class name and case insensitive filesystem */
public abstract class C196279Yo {
    public static final void A01(C161177mK r36, List list) {
        Path.FillType fillType;
        Object obj;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        boolean z;
        boolean z2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        C161177mK r20 = r36;
        Path path = ((C137426g7) r20).A02;
        boolean A1a = C36361kB.A1a(path.getFillType(), Path.FillType.EVEN_ODD);
        path.rewind();
        if (A1a) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
        if (list.isEmpty()) {
            obj = C166867ww.A00;
        } else {
            obj = list.get(0);
        }
        AnonymousClass9G3 r4 = (AnonymousClass9G3) obj;
        int size = list.size();
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        int i = 0;
        while (i < size) {
            AnonymousClass9G3 r7 = (AnonymousClass9G3) list.get(i);
            if (r7 instanceof C166867ww) {
                path.close();
                f14 = f16;
                float f18 = f17;
                path.moveTo(f14, f18);
                f12 = f14;
                f13 = f18;
                f15 = f18;
            } else {
                if (r7 instanceof C166767wm) {
                    C166767wm r0 = (C166767wm) r7;
                    float f19 = r0.A00;
                    f14 += f19;
                    float f20 = r0.A01;
                    f15 += f20;
                    path.rMoveTo(f19, f20);
                } else if (r7 instanceof C166737wj) {
                    C166737wj r02 = (C166737wj) r7;
                    f14 = r02.A00;
                    f15 = r02.A01;
                    path.moveTo(f14, f15);
                } else {
                    if (r7 instanceof C166757wl) {
                        C166757wl r1 = (C166757wl) r7;
                        float f21 = r1.A00;
                        f11 = r1.A01;
                        path.rLineTo(f21, f11);
                        f14 += f21;
                    } else {
                        if (r7 instanceof C166727wi) {
                            C166727wi r03 = (C166727wi) r7;
                            f14 = r03.A00;
                            f15 = r03.A01;
                        } else if (r7 instanceof C166697wf) {
                            float f22 = ((C166697wf) r7).A00;
                            path.rLineTo(f22, 0.0f);
                            f14 += f22;
                        } else if (r7 instanceof C166687we) {
                            f14 = ((C166687we) r7).A00;
                        } else if (r7 instanceof C166707wg) {
                            f11 = ((C166707wg) r7).A00;
                            path.rLineTo(0.0f, f11);
                        } else if (r7 instanceof C166717wh) {
                            f15 = ((C166717wh) r7).A00;
                        } else {
                            if (r7 instanceof C166837wt) {
                                C166837wt r04 = (C166837wt) r7;
                                f9 = r04.A00;
                                f10 = r04.A03;
                                f5 = r04.A01;
                                f6 = r04.A04;
                                f7 = r04.A02;
                                f8 = r04.A05;
                            } else if (r7 instanceof C166827ws) {
                                C166827ws r2 = (C166827ws) r7;
                                float f23 = r2.A00;
                                float f24 = r2.A03;
                                f12 = r2.A01;
                                f13 = r2.A04;
                                f14 = r2.A02;
                                f15 = r2.A05;
                                path.cubicTo(f23, f24, f12, f13, f14, f15);
                            } else if (r7 instanceof C166817wr) {
                                if (r4.A00) {
                                    f9 = f14 - f12;
                                    f10 = f15 - f13;
                                } else {
                                    f9 = 0.0f;
                                    f10 = 0.0f;
                                }
                                C166817wr r05 = (C166817wr) r7;
                                f5 = r05.A00;
                                f6 = r05.A02;
                                f7 = r05.A01;
                                f8 = r05.A03;
                            } else if (r7 instanceof C166797wp) {
                                boolean z3 = r4.A00;
                                float f25 = f15;
                                if (z3) {
                                    float f26 = (float) 2;
                                    f14 = (f14 * f26) - f12;
                                    f25 = (f26 * f15) - f13;
                                }
                                C166797wp r12 = (C166797wp) r7;
                                f12 = r12.A00;
                                f13 = r12.A02;
                                float f27 = r12.A01;
                                f15 = r12.A03;
                                path.cubicTo(f14, f25, f12, f13, f27, f15);
                                f14 = f27;
                            } else {
                                if (r7 instanceof C166807wq) {
                                    C166807wq r06 = (C166807wq) r7;
                                    f = r06.A00;
                                    f2 = r06.A02;
                                    f3 = r06.A01;
                                    f4 = r06.A03;
                                } else if (r7 instanceof C166787wo) {
                                    C166787wo r07 = (C166787wo) r7;
                                    f12 = r07.A00;
                                    f13 = r07.A02;
                                    f14 = r07.A01;
                                    f15 = r07.A03;
                                    path.quadTo(f12, f13, f14, f15);
                                } else if (r7 instanceof C166777wn) {
                                    if (r4.A01) {
                                        f = f14 - f12;
                                        f2 = f15 - f13;
                                    } else {
                                        f = 0.0f;
                                        f2 = 0.0f;
                                    }
                                    C166777wn r08 = (C166777wn) r7;
                                    f3 = r08.A00;
                                    f4 = r08.A01;
                                } else if (r7 instanceof C166747wk) {
                                    if (r4.A01) {
                                        float f28 = (float) 2;
                                        f14 = (f14 * f28) - f12;
                                        f15 = (f28 * f15) - f13;
                                    }
                                    C166747wk r09 = (C166747wk) r7;
                                    float f29 = r09.A00;
                                    float f30 = r09.A01;
                                    path.quadTo(f14, f15, f29, f30);
                                    f13 = f15;
                                    f15 = f30;
                                    f12 = f14;
                                    f14 = f29;
                                } else {
                                    if (r7 instanceof C166857wv) {
                                        C166857wv r42 = (C166857wv) r7;
                                        f12 = r42.A00 + f14;
                                        f13 = r42.A01 + f15;
                                        d = (double) f14;
                                        d2 = (double) f15;
                                        d3 = (double) f12;
                                        d4 = (double) f13;
                                        d5 = (double) r42.A02;
                                        d6 = (double) r42.A04;
                                        d7 = (double) r42.A03;
                                        z = r42.A05;
                                        z2 = r42.A06;
                                    } else if (r7 instanceof C166847wu) {
                                        d = (double) f14;
                                        d2 = (double) f15;
                                        C166847wu r14 = (C166847wu) r7;
                                        f12 = r14.A00;
                                        d3 = (double) f12;
                                        f13 = r14.A01;
                                        d4 = (double) f13;
                                        d5 = (double) r14.A02;
                                        d6 = (double) r14.A04;
                                        d7 = (double) r14.A03;
                                        z = r14.A05;
                                        z2 = r14.A06;
                                    }
                                    A00(r20, d, d2, d3, d4, d5, d6, d7, z, z2);
                                    f14 = f12;
                                    f15 = f13;
                                }
                                path.rQuadTo(f5, f6, f7, f8);
                                f12 = f5 + f14;
                                f13 = f6 + f15;
                                f14 += f7;
                                f15 += f8;
                            }
                            path.rCubicTo(f9, f10, f5, f6, f7, f8);
                            f12 = f5 + f14;
                            f13 = f6 + f15;
                            f14 += f7;
                            f15 += f8;
                        }
                        path.lineTo(f14, f15);
                    }
                    f15 += f11;
                }
                f16 = f14;
                f17 = f15;
            }
            i++;
            r4 = r7;
        }
    }

    public static final void A00(C161177mK r47, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d2;
        double d11 = d;
        double d12 = d5;
        double d13 = (d7 / ((double) 180)) * 3.141592653589793d;
        double cos = Math.cos(d13);
        double sin = Math.sin(d13);
        double d14 = ((d * cos) + (d2 * sin)) / d5;
        double d15 = (((-d11) * sin) + (d2 * cos)) / d6;
        double d16 = ((d3 * cos) + (d4 * sin)) / d5;
        double d17 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d18 = d14 - d16;
        double d19 = d15 - d17;
        double d20 = (double) 2;
        double d21 = d20;
        double d22 = (d14 + d16) / d20;
        double d23 = (d15 + d17) / d20;
        double d24 = (d18 * d18) + (d19 * d19);
        if (d24 != 0.0d) {
            double d25 = (1.0d / d24) - 0.25d;
            boolean z3 = z;
            boolean z4 = z2;
            if (d25 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d24) / 1.99999d));
                A00(r47, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d25);
            double d26 = d18 * sqrt2;
            double d27 = sqrt2 * d19;
            if (z3 == z4) {
                d8 = d22 - d27;
                d9 = d23 + d26;
            } else {
                d8 = d22 + d27;
                d9 = d23 - d26;
            }
            double atan2 = Math.atan2(d15 - d9, d14 - d8);
            double atan22 = Math.atan2(d17 - d9, d16 - d8) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z4 != C36401kF.A1U(i)) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d28 = d8 * d5;
            double d29 = d9 * d6;
            double d30 = (d28 * cos) - (d29 * sin);
            double d31 = (d28 * sin) + (d29 * cos);
            double d32 = (double) 4;
            int ceil = (int) Math.ceil(Math.abs((atan22 * d32) / 3.141592653589793d));
            double cos2 = Math.cos(atan2);
            double sin2 = Math.sin(atan2);
            double d33 = -d12;
            double d34 = d33 * cos;
            double d35 = d6 * sin;
            double d36 = (d34 * sin2) - (d35 * cos2);
            double d37 = d33 * sin;
            double d38 = d6 * cos;
            double d39 = (sin2 * d37) + (cos2 * d38);
            double d40 = atan22 / ((double) ceil);
            int i2 = 0;
            while (i2 < ceil) {
                double d41 = atan2 + d40;
                double sin3 = Math.sin(d41);
                double cos3 = Math.cos(d41);
                double d42 = (d30 + ((d5 * cos) * cos3)) - (d35 * sin3);
                double d43 = d31 + (d5 * sin * cos3) + (d38 * sin3);
                double d44 = (d34 * sin3) - (d35 * cos3);
                double d45 = (sin3 * d37) + (cos3 * d38);
                double d46 = d41 - atan2;
                double tan = Math.tan(d46 / d21);
                double sin4 = (Math.sin(d46) * (Math.sqrt(d32 + ((3.0d * tan) * tan)) - ((double) 1))) / ((double) 3);
                double d47 = d11 + (d36 * sin4);
                double d48 = d42 - (sin4 * d44);
                double d49 = d43 - (sin4 * d45);
                ((C137426g7) r47).A02.cubicTo((float) d47, (float) (d10 + (d39 * sin4)), (float) d48, (float) d49, (float) d42, (float) d43);
                i2++;
                d11 = d42;
                atan2 = d41;
                d39 = d45;
                d36 = d44;
                d10 = d43;
            }
        }
    }
}
