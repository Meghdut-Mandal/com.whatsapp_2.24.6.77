package X;

/* renamed from: X.0Wj  reason: invalid class name and case insensitive filesystem */
public class C07110Wj {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = 0;
    public long A06 = Long.MIN_VALUE;
    public long A07 = -1;

    public static float A00(C07110Wj r9, long j) {
        long j2 = r9.A06;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = r9.A07;
        if (j3 < 0 || j < j3) {
            float f = ((float) (j - j2)) / ((float) r9.A04);
            int i = C09140bt.A0G;
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            return f * 0.5f;
        }
        float f2 = r9.A00;
        float f3 = 1.0f - f2;
        float f4 = ((float) (j - j3)) / ((float) r9.A02);
        int i2 = C09140bt.A0G;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        return f3 + (f2 * f4);
    }
}
