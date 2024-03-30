package X;

/* renamed from: X.6VY  reason: invalid class name */
public abstract class AnonymousClass6VY {
    public static final void A01(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = C90524aI.A02(fArr, f3, C90524aI.A02(fArr, f2, fArr[0] * f, 3), 6);
        fArr2[1] = C90524aI.A02(fArr, f3, C90524aI.A02(fArr, f2, fArr[1] * f, 4), 7);
        fArr2[2] = C90524aI.A02(fArr, f3, C90524aI.A02(fArr, f2, fArr[2] * f, 5), 8);
    }

    public static final boolean A02(AnonymousClass6EN r4, AnonymousClass6EN r5) {
        return r4 == r5 || (C90494aF.A01(r4.A00, r5.A00) < 0.001f && C90494aF.A01(r4.A01, r5.A01) < 0.001f);
    }

    public static float A00(float[] fArr, float[] fArr2, float f, int i, int i2) {
        return f + (fArr[i] * fArr2[i2]);
    }

    public static final float[] A03(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float A01 = C90514aH.A01(f5, f9, f6, f8);
        float A012 = C90514aH.A01(f6, f7, f4, f9);
        float A013 = C90514aH.A01(f4, f8, f5, f7);
        float A00 = C90514aH.A00(f, A01, f2, A012) + (f3 * A013);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = A01 / A00;
        fArr2[1] = A012 / A00;
        fArr2[2] = A013 / A00;
        fArr2[3] = C90514aH.A01(f3, f8, f2, f9) / A00;
        fArr2[4] = C90514aH.A01(f9, f, f3, f7) / A00;
        fArr2[5] = C90514aH.A01(f7, f2, f8, f) / A00;
        fArr2[6] = C90514aH.A01(f2, f6, f3, f5) / A00;
        fArr2[7] = C90514aH.A01(f3, f4, f6, f) / A00;
        fArr2[8] = C90514aH.A01(f, f5, f2, f4) / A00;
        return fArr2;
    }

    public static final float[] A04(float[] fArr, float[] fArr2) {
        return new float[]{(fArr[0] * fArr2[0]) + (fArr[3] * fArr2[1]) + (fArr[6] * fArr2[2]), A00(fArr, fArr2, A00(fArr, fArr2, fArr[1] * fArr2[0], 4, 1), 7, 2), A00(fArr, fArr2, A00(fArr, fArr2, fArr[2] * fArr2[0], 5, 1), 8, 2), A00(fArr, fArr2, A00(fArr, fArr2, fArr[0] * fArr2[3], 3, 4), 6, 5), A00(fArr, fArr2, (fArr[1] * fArr2[3]) + (fArr[4] * fArr2[4]), 7, 5), A00(fArr, fArr2, A00(fArr, fArr2, fArr[2] * fArr2[3], 5, 4), 8, 5), A00(fArr, fArr2, A00(fArr, fArr2, fArr[0] * fArr2[6], 3, 7), 6, 8), A00(fArr, fArr2, A00(fArr, fArr2, fArr[1] * fArr2[6], 4, 7), 7, 8), A00(fArr, fArr2, fArr[2] * fArr2[6], 5, 7) + (fArr[8] * fArr2[8])};
    }

    public static final float[] A05(float[] fArr, float[] fArr2, float[] fArr3) {
        A01(fArr, fArr2);
        A01(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        return A04(A03(fArr), new float[]{fArr4[0] * fArr[0], fArr4[1] * fArr[1], fArr4[2] * fArr[2], fArr4[0] * fArr[3], fArr4[1] * fArr[4], fArr4[2] * fArr[5], fArr4[0] * fArr[6], fArr4[1] * fArr[7], fArr4[2] * fArr[8]});
    }
}
