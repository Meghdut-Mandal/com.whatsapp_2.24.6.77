package X;

/* renamed from: X.6MB  reason: invalid class name */
public final class AnonymousClass6MB {
    public static float A00;
    public static final AnonymousClass6MB A01 = new AnonymousClass6MB();
    public static final Object[] A02;
    public static volatile C10890fO A03 = new C10890fO(10);

    static {
        Object[] objArr = new Object[0];
        A02 = objArr;
        A00 = 1.05f;
        synchronized (objArr) {
            int i = (int) (1.15f * 100.0f);
            A03.A02(i, new C138256hZ(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            int i2 = (int) (1.3f * 100.0f);
            A03.A02(i2, new C138256hZ(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            int i3 = (int) (1.5f * 100.0f);
            A03.A02(i3, new C138256hZ(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            int i4 = (int) (1.8f * 100.0f);
            A03.A02(i4, new C138256hZ(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            int i5 = (int) (2.0f * 100.0f);
            A03.A02(i5, new C138256hZ(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        float f = (((float) A03.A01[0]) / 100.0f) - 0.02f;
        A00 = f;
        if (f <= 1.0f) {
            throw AnonymousClass001.A09("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public final C158897iQ A00(float f) {
        C138256hZ r5;
        float f2;
        if (f < A00) {
            return null;
        }
        int i = (int) (100.0f * f);
        C158897iQ r52 = (C158897iQ) C06840Vh.A00(A03, i);
        if (r52 != null) {
            return r52;
        }
        C10890fO r0 = A03;
        int A002 = AnonymousClass009.A00(r0.A01, r0.A00, i);
        if (A002 >= 0) {
            return (C158897iQ) A03.A02[A002];
        }
        int i2 = (-(A002 + 1)) - 1;
        int i3 = i2 + 1;
        if (i2 < 0 || i3 >= A03.A00) {
            r5 = new C138256hZ(new float[]{1.0f}, new float[]{f});
        } else {
            float f3 = ((float) A03.A01[i2]) / 100.0f;
            float f4 = ((float) A03.A01[i3]) / 100.0f;
            if (f3 == f4) {
                f2 = 0.0f;
            } else {
                f2 = (f - f3) / (f4 - f3);
            }
            float max = 0.0f + ((1.0f - 0.0f) * Math.max(0.0f, Math.min(1.0f, f2)));
            C158897iQ r7 = (C158897iQ) A03.A02[i2];
            C158897iQ r6 = (C158897iQ) A03.A02[i3];
            float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
            float[] fArr2 = new float[9];
            int i4 = 0;
            do {
                float f5 = fArr[i4];
                float B3f = r7.B3f(f5);
                fArr2[i4] = B3f + ((r6.B3f(f5) - B3f) * max);
                i4++;
            } while (i4 < 9);
            r5 = new C138256hZ(fArr, fArr2);
        }
        synchronized (A02) {
            C10890fO A003 = A03.clone();
            A003.A02(i, r5);
            A03 = A003;
        }
        return r5;
    }
}
