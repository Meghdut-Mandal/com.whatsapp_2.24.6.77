package X;

/* renamed from: X.62M  reason: invalid class name */
public final class AnonymousClass62M {
    public double A00 = Math.sqrt(50.0d);
    public float A01 = 1.0f;
    public boolean A02;

    public final long A00(float f, float f2, long j) {
        if (!this.A02) {
            if (this.A01 == Float.MAX_VALUE) {
                throw AnonymousClass001.A09("Error: Final position of the spring must be set before the animation starts");
            }
            this.A02 = true;
        }
        float f3 = this.A01;
        double d = ((double) j) / 1000.0d;
        double d2 = this.A00;
        double d3 = (double) (f - f3);
        double d4 = ((double) f2) + (d2 * d3);
        double d5 = -d2;
        double exp = Math.exp(d5 * d);
        double d6 = exp * (d3 + (d4 * d));
        return C90464aC.A0B((float) (d6 + ((double) f3)), (float) ((d6 * d5) + (d4 * exp)));
    }
}
