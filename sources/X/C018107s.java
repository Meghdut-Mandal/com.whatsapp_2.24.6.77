package X;

import android.graphics.Color;

/* renamed from: X.07s  reason: invalid class name and case insensitive filesystem */
public abstract class C018107s {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static void A07(int i, int i2, float[] fArr, int i3) {
        float f;
        float abs;
        float f2 = ((float) i) / 255.0f;
        float f3 = ((float) i2) / 255.0f;
        float f4 = ((float) i3) / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else if (max == f3) {
                f = ((f4 - f2) / f5) + 2.0f;
            } else {
                f = 4.0f + ((f2 - f3) / f5);
            }
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        float f8 = 0.0f;
        if (f7 >= 0.0f) {
            f8 = Math.min(f7, 360.0f);
        }
        fArr[0] = f8;
        float f9 = 0.0f;
        if (abs >= 0.0f) {
            f9 = Math.min(abs, 1.0f);
        }
        fArr[1] = f9;
        float f10 = 0.0f;
        if (f6 >= 0.0f) {
            f10 = Math.min(f6, 1.0f);
        }
        fArr[2] = f10;
    }

    public static double A00(int i) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal threadLocal = A00;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = ((double) red) / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = ((double) green) / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = ((double) blue) / 255.0d;
            if (d3 < 0.04045d) {
                pow3 = d3 / 12.92d;
            } else {
                pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int A03(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    public static int A06(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static double A01(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = A05(i, i2);
            }
            double A002 = A00(i) + 0.05d;
            double A003 = A00(i2) + 0.05d;
            return Math.max(A002, A003) / Math.min(A002, A003);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("background can not be translucent: #");
        sb.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(float r8, int r9, int r10) {
        /*
            int r0 = android.graphics.Color.alpha(r10)
            r7 = 255(0xff, float:3.57E-43)
            if (r0 != r7) goto L_0x0039
            int r0 = A06(r9, r7)
            double r4 = A01(r0, r10)
            double r2 = (double) r8
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            r0 = -1
            return r0
        L_0x0017:
            r8 = 0
            r6 = 0
        L_0x0019:
            int r0 = r6 + r7
            int r1 = r0 / 2
            int r0 = A06(r9, r1)
            double r4 = A01(r0, r10)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            r6 = r1
        L_0x002a:
            int r8 = r8 + 1
            r0 = 10
            if (r8 > r0) goto L_0x0038
            int r1 = r7 - r6
            r0 = 1
            if (r1 <= r0) goto L_0x0038
            goto L_0x0019
        L_0x0036:
            r7 = r1
            goto L_0x002a
        L_0x0038:
            return r7
        L_0x0039:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "background can not be translucent: #"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r10)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018107s.A04(float, int, int):int");
    }

    public static int A05(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i6 = 255 - alpha2;
        int i7 = 255 - (((255 - alpha) * i6) / 255);
        int red = Color.red(i);
        int red2 = Color.red(i2);
        if (i7 == 0) {
            i3 = 0;
        } else {
            i3 = (((red * 255) * alpha2) + ((red2 * alpha) * i6)) / (i7 * 255);
        }
        int green = Color.green(i);
        int green2 = Color.green(i2);
        if (i7 == 0) {
            i4 = 0;
        } else {
            i4 = (((green * 255) * alpha2) + ((green2 * alpha) * i6)) / (i7 * 255);
        }
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i7 == 0) {
            i5 = 0;
        } else {
            i5 = (((blue * 255) * alpha2) + ((blue2 * alpha) * i6)) / (i7 * 255);
        }
        return Color.argb(i7, i3, i4, i5);
    }

    public static int A02(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d8 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d9 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        int round = (int) Math.round(d4 * 255.0d);
        int i = 0;
        if (round >= 0) {
            i = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d5 * 255.0d);
        int i2 = 0;
        if (round2 >= 0) {
            i2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d6 * 255.0d);
        int i3 = 0;
        if (round3 >= 0) {
            i3 = Math.min(round3, 255);
        }
        return Color.rgb(i, i2, i3);
    }
}
