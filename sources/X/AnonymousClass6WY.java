package X;

import android.graphics.Point;

/* renamed from: X.6WY  reason: invalid class name */
public final class AnonymousClass6WY {
    public final C139266jV A00;
    public final C130866Ms A01 = new C130866Ms();
    public final float[] A02 = C90524aI.A0v();

    public static double A01(double d) {
        return (d + 180.0d) / 360.0d;
    }

    public static double A02(double d) {
        return ((Math.atan(Math.exp((1.0d - (d * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d;
    }

    public double A03(float f) {
        C92794ej r0 = this.A00.A0Q;
        return (double) (f / (((float) r0.A0J) * r0.A02));
    }

    public Point A04(C134976bv r11) {
        double d = r11.A00;
        double d2 = r11.A01;
        float[] fArr = this.A02;
        A08(fArr, A01(d2), A00(d));
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public C134976bv A05(float f, float f2) {
        float[] fArr = this.A02;
        A0A(fArr, f, f2);
        return C134976bv.A00(A02((double) fArr[1]), (((double) fArr[0]) * 360.0d) - 180.0d);
    }

    public C128446Ch A06() {
        C139266jV r3 = this.A00;
        C92794ej r4 = r3.A0Q;
        float f = (float) 0;
        C134976bv A05 = A05(f, (float) (r4.A0E - r3.A05));
        C134976bv A052 = A05((float) (r4.A0F - r3.A06), (float) (r4.A0E - r3.A05));
        C134976bv A053 = A05(f, (float) r3.A07);
        C134976bv A054 = A05((float) (r4.A0F - r3.A06), (float) r3.A07);
        AnonymousClass6OA r0 = new AnonymousClass6OA();
        r0.A01(A05);
        r0.A01(A053);
        r0.A01(A052);
        r0.A01(A054);
        return new C128446Ch(A05, A052, A053, A054, r0.A00());
    }

    public final void A07(C130866Ms r9) {
        C92794ej r6 = this.A00.A0Q;
        double d = r6.A05;
        double d2 = r6.A01;
        r9.A03 = d - d2;
        r9.A00 = d + d2;
        double d3 = r6.A04;
        double d4 = r6.A00;
        double d5 = d3 - d4;
        r9.A01 = d5;
        double d6 = d3 + d4;
        r9.A02 = d6;
        if (d5 < 0.0d) {
            double ceil = (double) ((int) Math.ceil(-d5));
            r9.A01 = d5 + ceil;
            r9.A02 = d6 + ceil;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if ((r4 - r12) < (r2 - r8)) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(float[] r11, double r12, double r14) {
        /*
            r10 = this;
            X.6Ms r6 = r10.A01
            r10.A07(r6)
            double r4 = r6.A01
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0011
            double r1 = r6.A02
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
        L_0x0011:
            double r0 = r4 - r12
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            double r2 = (double) r0
            double r2 = r2 + r12
            double r8 = r6.A02
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            double r6 = r2 - r8
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r2 - r0
            double r4 = r4 - r12
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
        L_0x002b:
            r10.A09(r11, r12, r14)
            return
        L_0x002f:
            r12 = r2
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WY.A08(float[], double, double):void");
    }

    public void A09(float[] fArr, double d, double d2) {
        C92794ej r4 = this.A00.A0Q;
        double d3 = r4.A04;
        C130866Ms r6 = this.A01;
        A07(r6);
        double d4 = r6.A01;
        if (d4 > d3 || d3 > r6.A02) {
            d3 += (double) ((int) Math.ceil(d4 - d3));
        }
        float f = (float) r4.A0J;
        fArr[0] = ((float) (d - d3)) * f;
        fArr[1] = ((float) (d2 - r4.A05)) * f;
        r4.A0e.mapVectors(fArr);
        fArr[0] = fArr[0] + r4.A06;
        fArr[1] = fArr[1] + r4.A07;
    }

    public void A0A(float[] fArr, float f, float f2) {
        C92794ej r4 = this.A00.A0Q;
        fArr[0] = f - r4.A06;
        fArr[1] = f2 - r4.A07;
        r4.A0f.mapVectors(fArr);
        double d = r4.A04;
        double d2 = (double) fArr[0];
        double d3 = (double) r4.A0J;
        double d4 = d + (d2 / d3);
        double d5 = r4.A05 + (((double) fArr[1]) / d3);
        if (d4 > 1.0d) {
            d4 -= 1.0d;
        } else if (d4 < 0.0d) {
            d4 += 1.0d;
        }
        fArr[0] = (float) d4;
        fArr[1] = (float) d5;
    }

    public AnonymousClass6WY(C139266jV r2) {
        this.A00 = r2;
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
    }
}
