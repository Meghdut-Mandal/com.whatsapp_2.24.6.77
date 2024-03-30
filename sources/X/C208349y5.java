package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.9y5  reason: invalid class name and case insensitive filesystem */
public class C208349y5 implements B5O, C22853Ax3, C17520rY {
    public boolean A00;
    public final Path A01 = C36441kJ.A0M();
    public final C165737u4 A02;
    public final C196189Yb A03;
    public final C196189Yb A04;
    public final C196189Yb A05;
    public final C196189Yb A06;
    public final C196189Yb A07;
    public final C196189Yb A08;
    public final C196189Yb A09;
    public final boolean A0A;
    public final AnonymousClass9P7 A0B = new AnonymousClass9P7();
    public final Integer A0C;
    public final String A0D;
    public final boolean A0E;

    public static double A00(float f, float f2) {
        return (double) ((float) (Math.atan2((double) f, (double) f2) - 1.5707963267948966d));
    }

    public void BkC() {
        this.A00 = false;
        this.A02.invalidateSelf();
    }

    public void Bqe(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            B0T b0t = (B0T) list.get(i);
            if (b0t instanceof C208289xz) {
                C208289xz r2 = (C208289xz) b0t;
                if (r2.A03 == C023109s.A00) {
                    this.A0B.A00.add(r2);
                    r2.A04.add(this);
                }
            }
        }
    }

    public void B0q(C199409fG r2, Object obj) {
        C196189Yb r0;
        if (obj == B4R.A0K) {
            r0 = this.A07;
        } else if (obj == B4R.A0L) {
            r0 = this.A09;
        } else if (obj == B4R.A03) {
            r0 = this.A08;
        } else if (obj != B4R.A0G || (r0 = this.A03) == null) {
            if (obj == B4R.A0I) {
                r0 = this.A05;
            } else if (obj != B4R.A0H || (r0 = this.A04) == null) {
                if (obj == B4R.A0J) {
                    r0 = this.A06;
                } else {
                    return;
                }
            }
        }
        r0.A0A(r2);
    }

    public Path BFG() {
        double A012;
        float f;
        float f2;
        float cos;
        float sin;
        double d;
        float f3;
        float f4;
        double A013;
        boolean z = this.A00;
        Path path = this.A01;
        if (!z) {
            path.reset();
            if (!this.A0E) {
                int intValue = this.A0C.intValue();
                if (intValue == 0) {
                    float A014 = C196189Yb.A01(this.A07);
                    C196189Yb r0 = this.A09;
                    if (r0 == null) {
                        A012 = 0.0d;
                    } else {
                        A012 = (double) C196189Yb.A01(r0);
                    }
                    double radians = Math.toRadians(A012 - 90.0d);
                    double d2 = (double) A014;
                    float f5 = (float) (6.283185307179586d / d2);
                    if (this.A0A) {
                        f5 *= -1.0f;
                    }
                    float f6 = f5 / 2.0f;
                    float f7 = A014 - ((float) ((int) A014));
                    int i = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i != 0) {
                        radians += (double) ((1.0f - f7) * f6);
                    }
                    float A015 = C196189Yb.A01(this.A05);
                    float A016 = C196189Yb.A01(this.A03);
                    C196189Yb r02 = this.A04;
                    if (r02 != null) {
                        f = C196189Yb.A01(r02) / 100.0f;
                    } else {
                        f = 0.0f;
                    }
                    C196189Yb r03 = this.A06;
                    if (r03 != null) {
                        f2 = C196189Yb.A01(r03) / 100.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (i != 0) {
                        f3 = ((A015 - A016) * f7) + A016;
                        double d3 = (double) f3;
                        cos = (float) (d3 * Math.cos(radians));
                        sin = (float) (d3 * Math.sin(radians));
                        path.moveTo(cos, sin);
                        d = radians + ((double) ((f5 * f7) / 2.0f));
                    } else {
                        i = 0;
                        double d4 = (double) A015;
                        cos = (float) (Math.cos(radians) * d4);
                        sin = (float) (d4 * Math.sin(radians));
                        path.moveTo(cos, sin);
                        d = radians + ((double) f6);
                        f3 = 0.0f;
                    }
                    double ceil = Math.ceil(d2) * 2.0d;
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        double d5 = (double) i2;
                        if (d5 >= ceil) {
                            break;
                        }
                        float f8 = A016;
                        if (z2) {
                            f8 = A015;
                        }
                        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                        if (i3 == 0 || d5 != ceil - 2.0d) {
                            f4 = f6;
                        } else {
                            f4 = (f5 * f7) / 2.0f;
                        }
                        if (i3 != 0 && d5 == ceil - 1.0d) {
                            f8 = f3;
                        }
                        double d6 = (double) f8;
                        float cos2 = (float) (d6 * Math.cos(d));
                        float f9 = cos2;
                        float sin2 = (float) (d6 * Math.sin(d));
                        if (f == 0.0f && f2 == 0.0f) {
                            path.lineTo(cos2, sin2);
                        } else {
                            double A002 = A00(sin, cos);
                            float cos3 = (float) Math.cos(A002);
                            float sin3 = (float) Math.sin(A002);
                            double A003 = A00(sin2, f9);
                            float cos4 = (float) Math.cos(A003);
                            float sin4 = (float) Math.sin(A003);
                            float f10 = f2;
                            float f11 = f;
                            float f12 = A015;
                            float f13 = A016;
                            if (z2) {
                                f10 = f11;
                                f11 = f2;
                                f12 = f13;
                                f13 = A015;
                            }
                            float f14 = f12 * f10 * 0.47829f;
                            float f15 = cos3 * f14;
                            float f16 = f14 * sin3;
                            float f17 = f13 * f11 * 0.47829f;
                            float f18 = cos4 * f17;
                            float f19 = f17 * sin4;
                            if (i != 0) {
                                if (i2 == 0) {
                                    f15 *= f7;
                                    f16 *= f7;
                                } else if (d5 == ceil - 1.0d) {
                                    f18 *= f7;
                                    f19 *= f7;
                                }
                            }
                            path.cubicTo(cos - f15, sin - f16, f9 + f18, sin2 + f19, f9, sin2);
                        }
                        d += (double) f4;
                        z2 = !z2;
                        i2++;
                        cos = f9;
                        sin = sin2;
                    }
                } else {
                    if (intValue == 1) {
                        int floor = (int) Math.floor((double) C196189Yb.A01(this.A07));
                        C196189Yb r04 = this.A09;
                        if (r04 == null) {
                            A013 = 0.0d;
                        } else {
                            A013 = (double) C196189Yb.A01(r04);
                        }
                        double radians2 = Math.toRadians(A013 - 90.0d);
                        double d7 = (double) floor;
                        float A017 = C196189Yb.A01(this.A06) / 100.0f;
                        float A018 = C196189Yb.A01(this.A05);
                        double d8 = (double) A018;
                        float cos5 = (float) (Math.cos(radians2) * d8);
                        float sin5 = (float) (Math.sin(radians2) * d8);
                        path.moveTo(cos5, sin5);
                        double d9 = (double) ((float) (6.283185307179586d / d7));
                        double d10 = radians2 + d9;
                        double ceil2 = Math.ceil(d7);
                        int i4 = 0;
                        while (((double) i4) < ceil2) {
                            float cos6 = (float) (Math.cos(d10) * d8);
                            float sin6 = (float) (d8 * Math.sin(d10));
                            if (A017 != 0.0f) {
                                double A004 = A00(sin5, cos5);
                                float cos7 = (float) Math.cos(A004);
                                float sin7 = (float) Math.sin(A004);
                                double A005 = A00(sin6, cos6);
                                float f20 = A018 * A017 * 0.25f;
                                path.cubicTo(cos5 - (cos7 * f20), sin5 - (sin7 * f20), cos6 + (((float) Math.cos(A005)) * f20), sin6 + (f20 * ((float) Math.sin(A005))), cos6, sin6);
                            } else {
                                path.lineTo(cos6, sin6);
                            }
                            d10 += d9;
                            i4++;
                            sin5 = sin6;
                            cos5 = cos6;
                        }
                    }
                    path.close();
                    this.A0B.A00(path);
                }
                PointF A022 = C196189Yb.A02(this.A08);
                path.offset(A022.x, A022.y);
                path.close();
                path.close();
                this.A0B.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    public C208349y5(C165737u4 r9, C208529yO r10, C208409yC r11) {
        AnonymousClass812 r0;
        this.A02 = r9;
        this.A0D = r10.A08;
        Integer num = r10.A07;
        this.A0C = num;
        this.A0E = r10.A09;
        this.A0A = r10.A0A;
        AnonymousClass812 A002 = C1684680s.A00(r10.A04);
        this.A07 = A002;
        C196189Yb B4M = r10.A06.B4M();
        this.A08 = B4M;
        AnonymousClass812 A003 = C1684680s.A00(r10.A05);
        this.A09 = A003;
        AnonymousClass812 A004 = C1684680s.A00(r10.A02);
        this.A05 = A004;
        AnonymousClass812 A005 = C1684680s.A00(r10.A03);
        this.A06 = A005;
        Integer num2 = C023109s.A00;
        if (num == num2) {
            this.A03 = C1684680s.A00(r10.A00);
            r0 = C1684680s.A00(r10.A01);
        } else {
            r0 = null;
            this.A03 = null;
        }
        this.A04 = r0;
        r11.A0C(A002);
        r11.A0C(B4M);
        r11.A0C(A003);
        r11.A0C(A004);
        r11.A0C(A005);
        if (num == num2) {
            r11.A0C(this.A03);
            r11.A0C(this.A04);
        }
        A002.A09(this);
        B4M.A09(this);
        A003.A09(this);
        A004.A09(this);
        A005.A09(this);
        if (num == num2) {
            this.A03.A09(this);
            this.A04.A09(this);
        }
    }

    public void Bof(C201629k0 r1, C201629k0 r2, List list, int i) {
        C200579hd.A01(this, r1, r2, list, i);
    }

    public String getName() {
        return this.A0D;
    }
}
