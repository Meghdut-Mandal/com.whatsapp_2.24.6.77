package X;

/* renamed from: X.9h8  reason: invalid class name and case insensitive filesystem */
public abstract class C200309h8 {
    public static int A02(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float A00 = A00(((float) ((i >> 16) & 255)) / 255.0f);
        float A002 = A00(((float) ((i >> 8) & 255)) / 255.0f);
        float A003 = A00(((float) (i & 255)) / 255.0f);
        float A004 = A00(((float) ((i2 >> 16) & 255)) / 255.0f);
        float A005 = A002 + ((A00(((float) ((i2 >> 8) & 255)) / 255.0f) - A002) * f);
        float A006 = AnonymousClass001.A00(A00(((float) (i2 & 255)) / 255.0f), A003, f);
        return (Math.round(A01(A00 + ((A004 - A00) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((i2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(A01(A005) * 255.0f) << 8) | Math.round(A01(A006) * 255.0f);
    }

    public static float A00(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static float A01(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
