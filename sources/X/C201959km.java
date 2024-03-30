package X;

/* renamed from: X.9km  reason: invalid class name and case insensitive filesystem */
public class C201959km {
    public final AUY A00;

    public static float A00(C199679fm r5, C199679fm r6, C201959km r7) {
        int i = (int) r5.A00;
        int i2 = (int) r5.A01;
        int i3 = (int) r6.A00;
        int i4 = (int) r6.A01;
        float A02 = A02(r7, i, i2, i3, i4);
        float A022 = A02(r7, i3, i4, i, i2);
        if (Float.isNaN(A02)) {
            return A022 / 7.0f;
        }
        if (Float.isNaN(A022)) {
            return A02 / 7.0f;
        }
        return (A02 + A022) / 14.0f;
    }

    public static float A01(C201959km r19, int i, int i2, int i3, int i4) {
        double d;
        int i5 = i2;
        int i6 = i4;
        int i7 = i3;
        int i8 = i;
        boolean z = true;
        int i9 = i5;
        int i10 = i6;
        if (AnonymousClass000.A05(i6, i5) <= AnonymousClass000.A05(i7, i8)) {
            z = false;
            i9 = i8;
            i8 = i5;
            i10 = i7;
            i7 = i6;
        }
        int A05 = AnonymousClass000.A05(i10, i9);
        int i11 = i7 - i8;
        int abs = Math.abs(i11);
        int i12 = (-A05) / 2;
        int i13 = -1;
        int i14 = -1;
        if (i9 < i10) {
            i14 = 1;
        }
        if (i8 < i7) {
            i13 = 1;
        }
        int i15 = i10 + i14;
        int i16 = i9;
        int i17 = i8;
        int i18 = 0;
        while (true) {
            if (i16 == i15) {
                break;
            }
            int i19 = i16;
            int i20 = i17;
            if (z) {
                i19 = i17;
                i20 = i16;
            }
            if (AnonymousClass000.A1S(i18, 1) == r19.A00.A03(i19, i20)) {
                if (i18 == 2) {
                    int i21 = i16 - i9;
                    int i22 = i17 - i8;
                    d = (double) ((i21 * i21) + (i22 * i22));
                    break;
                }
                i18++;
            }
            i12 += abs;
            if (i12 > 0) {
                if (i17 == i7) {
                    break;
                }
                i17 += i13;
                i12 -= A05;
            }
            i16 += i14;
        }
        if (i18 != 2) {
            return Float.NaN;
        }
        int i23 = i15 - i9;
        d = (double) ((i23 * i23) + (i11 * i11));
        return (float) Math.sqrt(d);
    }

    public C201959km(AUY auy) {
        this.A00 = auy;
    }

    public static float A02(C201959km r8, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float A01 = A01(r8, i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else {
            int i7 = r8.A00.A02;
            f = 1.0f;
            if (i5 >= i7) {
                int i8 = i7 - 1;
                f = ((float) (i8 - i)) / ((float) (i5 - i));
                i5 = i8;
            }
        }
        float f4 = (float) i2;
        int i9 = (int) (f4 - (((float) (i4 - i2)) * f));
        if (i9 < 0) {
            f3 = (float) (i2 - i9);
        } else {
            int i10 = r8.A00.A00;
            i6 = i9;
            f2 = 1.0f;
            if (i9 >= i10) {
                i6 = i10 - 1;
                f4 = (float) (i6 - i2);
                f3 = (float) (i9 - i2);
            }
            return (A01 + A01(r8, i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i6)) - 1.0f;
        }
        f2 = f4 / f3;
        return (A01 + A01(r8, i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i6)) - 1.0f;
    }
}
