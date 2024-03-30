package X;

/* renamed from: X.7r2  reason: invalid class name and case insensitive filesystem */
public class C163957r2 implements C157667du {
    public double A00;
    public final int A01;

    public C163957r2(int i, double d) {
        this.A01 = i;
        this.A00 = d;
    }

    public final double BKs(double d) {
        int i = this.A01;
        double d2 = this.A00;
        int i2 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i != 0) {
            if (i2 < 0) {
                d = 0.0d;
            }
            return Math.pow(d, d2);
        }
        if (i2 < 0) {
            d = 0.0d;
        }
        return Math.pow(d, 1.0d / d2);
    }
}
