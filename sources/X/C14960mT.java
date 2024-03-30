package X;

/* renamed from: X.0mT  reason: invalid class name and case insensitive filesystem */
public final class C14960mT extends C05670Qp {
    public static final int A00(double d) {
        if (Double.isNaN(d)) {
            throw AnonymousClass001.A08("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    public static final int A01(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw AnonymousClass001.A08("Cannot round NaN value.");
    }
}
