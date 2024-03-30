package X;

/* renamed from: X.6HX  reason: invalid class name */
public abstract class AnonymousClass6HX {
    public static final float[] A00;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float[] fArr = new float[101];
        A00 = fArr;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f7 = ((float) i) / ((float) 100);
            float f8 = 1.0f;
            while (true) {
                f = ((f8 - f5) / 2.0f) + f5;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f9 = (((f2 * 0.175f) + (0.35000002f * f)) * f3) + f4;
                if (((double) C90494aF.A01(f9, f7)) < 1.0E-5d) {
                    break;
                } else if (f9 > f7) {
                    f8 = f;
                } else {
                    f5 = f;
                }
            }
            float f10 = 0.5f;
            fArr[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f11 = 1.0f;
            while (true) {
                float f12 = ((f11 - f6) / 2.0f) + f6;
                float f13 = 1.0f - f12;
                float f14 = (((f13 * f10) + f12) * 3.0f * f12 * f13) + (f12 * f12 * f12);
                if (((double) C90494aF.A01(f14, f7)) < 1.0E-5d) {
                    break;
                }
                if (f14 > f7) {
                    f11 = f12;
                } else {
                    f6 = f12;
                }
                f10 = 0.5f;
            }
        }
        fArr[100] = 1.0f;
    }

    public static final AnonymousClass699 A00(float f) {
        float f2;
        float f3;
        float f4 = (float) 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = ((float) i) / f4;
            int i2 = i + 1;
            float[] fArr = A00;
            float f6 = fArr[i];
            f3 = (fArr[i2] - f6) / ((((float) i2) / f4) - f5);
            f2 = f6 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new AnonymousClass699(f2, f3);
    }
}
