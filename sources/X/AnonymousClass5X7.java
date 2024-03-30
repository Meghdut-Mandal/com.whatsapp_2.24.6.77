package X;

/* renamed from: X.5X7  reason: invalid class name */
public abstract class AnonymousClass5X7 {
    public static final boolean A00(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = f2;
        float A01 = C90514aH.A01(f, f6, f17, f5);
        float A012 = C90514aH.A01(f, f7, f3, f5);
        float A013 = C90514aH.A01(f, f8, f4, f5);
        float f18 = f17;
        float f19 = f6;
        float A014 = C90514aH.A01(f18, f7, f3, f19);
        float A015 = C90514aH.A01(f18, f8, f4, f19);
        float A016 = C90514aH.A01(f3, f8, f4, f7);
        float A017 = C90514aH.A01(f9, f14, f10, f13);
        float f20 = f11;
        float A018 = C90514aH.A01(f9, f15, f20, f13);
        float A019 = C90514aH.A01(f9, f16, f12, f13);
        float f21 = f10;
        float f22 = f20;
        float f23 = f14;
        float A0110 = C90514aH.A01(f21, f15, f22, f23);
        float A0111 = C90514aH.A01(f21, f16, f12, f23);
        float A0112 = C90514aH.A01(f11, f16, f12, f15);
        float f24 = A012;
        float A02 = C90504aG.A02(A015, A018, C90504aG.A02(f24, A0111, A01 * A0112, A013, A0110) + (A014 * A019), A016, A017);
        if (A02 == 0.0f) {
            return false;
        }
        float f25 = 1.0f / A02;
        float f26 = A0111;
        fArr2[0] = C90504aG.A02(f7, f26, f6 * A0112, f8, A0110) * f25;
        fArr2[1] = (C90514aH.A00(-f2, A0112, f3, f26) - (f4 * A0110)) * f25;
        fArr2[2] = C90504aG.A02(f15, A015, f14 * A016, f16, A014) * f25;
        fArr2[3] = (C90514aH.A00(-f10, A016, f11, A015) - (f12 * A014)) * f25;
        float f27 = -f5;
        float f28 = f27;
        fArr2[4] = (C90514aH.A00(f27, A0112, f7, A019) - (f8 * A018)) * f25;
        fArr2[5] = C90504aG.A02(f3, A019, A0112 * f, f4, A018) * f25;
        float f29 = -f13;
        fArr2[6] = (C90514aH.A00(f29, A016, f15, A013) - (f16 * A012)) * f25;
        float f30 = f11;
        fArr2[7] = C90504aG.A02(f30, A013, A016 * f9, f12, f24) * f25;
        float f31 = f6;
        fArr2[8] = C90504aG.A02(f31, A019, f5 * A0111, f8, A017) * f25;
        fArr2[9] = (C90514aH.A00(-f, A0111, A019, f2) - (f4 * A017)) * f25;
        float f32 = f14;
        fArr2[10] = C90504aG.A02(f32, A013, f13 * A015, f16, A01) * f25;
        fArr2[11] = (C90514aH.A00(-f9, A015, A013, f10) - (f12 * A01)) * f25;
        float f33 = A018;
        fArr2[12] = (C90514aH.A00(f28, A0110, f6, f33) - (f7 * A017)) * f25;
        fArr2[13] = C90504aG.A02(f2, f33, f * A0110, f3, A017) * f25;
        float f34 = A012;
        fArr2[14] = (C90514aH.A00(f29, A014, f14, f34) - (f15 * A01)) * f25;
        float f35 = f10;
        fArr2[15] = C90504aG.A02(f35, f34, f9 * A014, f11, A01) * f25;
        return true;
    }
}
