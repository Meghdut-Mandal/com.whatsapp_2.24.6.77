package X;

/* renamed from: X.6VX  reason: invalid class name */
public abstract class AnonymousClass6VX {
    public static final void A02(float[] fArr) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                float f = 0.0f;
                if (i == i2) {
                    f = 1.0f;
                }
                fArr[(i2 * 4) + i] = f;
                i2++;
            } while (i2 < 4);
        }
    }

    public static final void A03(float[] fArr, float f, float f2) {
        float A02 = C90524aI.A02(fArr, 0.0f, C90524aI.A02(fArr, f2, fArr[0] * f, 4), 8) + fArr[12];
        float A022 = C90524aI.A02(fArr, 0.0f, C90524aI.A02(fArr, f2, fArr[1] * f, 5), 9) + fArr[13];
        float A023 = C90524aI.A02(fArr, 0.0f, C90524aI.A02(fArr, f2, fArr[2] * f, 6), 10) + fArr[14];
        fArr[12] = A02;
        fArr[13] = A022;
        fArr[14] = A023;
        fArr[15] = C90524aI.A02(fArr, 0.0f, C90524aI.A02(fArr, f2, fArr[3] * f, 7), 11) + fArr[15];
    }

    public static final void A01(AnonymousClass675 r11, float[] fArr) {
        float f = r11.A01;
        float f2 = r11.A03;
        long A0B = C90464aC.A0B(f, f2);
        long j = C133206Xf.A03;
        long A00 = A00(fArr, A0B);
        float f3 = r11.A00;
        long A002 = A00(fArr, C90464aC.A0B(f, f3));
        float f4 = r11.A02;
        long A003 = A00(fArr, C90464aC.A0B(f4, f2));
        long A004 = A00(fArr, C90464aC.A0B(f4, f3));
        r11.A01 = Math.min(Math.min(C133206Xf.A00(A00), C133206Xf.A00(A002)), Math.min(C133206Xf.A00(A003), C133206Xf.A00(A004)));
        r11.A03 = Math.min(Math.min(C133206Xf.A01(A00), C133206Xf.A01(A002)), Math.min(C133206Xf.A01(A003), C133206Xf.A01(A004)));
        r11.A02 = Math.max(Math.max(C133206Xf.A00(A00), C133206Xf.A00(A002)), Math.max(C133206Xf.A00(A003), C133206Xf.A00(A004)));
        r11.A00 = Math.max(Math.max(C133206Xf.A01(A00), C133206Xf.A01(A002)), Math.max(C133206Xf.A01(A003), C133206Xf.A01(A004)));
    }

    public static /* synthetic */ float[] A04() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long A00(float[] fArr, long j) {
        float A00 = C133206Xf.A00(j);
        float A01 = C133206Xf.A01(j);
        float A02 = ((float) 1) / (C90524aI.A02(fArr, A01, fArr[3] * A00, 7) + fArr[15]);
        if (Float.isInfinite(A02) || Float.isNaN(A02)) {
            A02 = 0.0f;
        }
        return C90464aC.A0B((C90524aI.A02(fArr, A01, fArr[0] * A00, 4) + fArr[12]) * A02, A02 * (C90524aI.A02(fArr, A01, fArr[1] * A00, 5) + fArr[13]));
    }
}
