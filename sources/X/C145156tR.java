package X;

/* renamed from: X.6tR  reason: invalid class name and case insensitive filesystem */
public final class C145156tR implements AnonymousClass00M {
    public int A01(int i, boolean z) {
        int i2 = 2;
        if (z) {
            if (i > 2) {
                if (i > 8) {
                    i2 = 3;
                }
                return ((i + i2) - 1) / i2;
            } else if (i <= 0) {
                return 0;
            } else {
                return i;
            }
        } else if (i <= 2) {
            return 1;
        } else {
            return i > 8 ? 3 : 2;
        }
    }

    public int A02(int i, boolean z) {
        int i2 = 2;
        if (z) {
            if (i <= 2) {
                return 1;
            }
            return i > 8 ? 3 : 2;
        } else if (i > 2) {
            if (i > 8) {
                i2 = 3;
            }
            return ((i + i2) - 1) / i2;
        } else if (i <= 0) {
            return 0;
        } else {
            return i;
        }
    }

    public /* synthetic */ int A00(int i, int i2, boolean z) {
        double d;
        int A02 = A02(i, z);
        int i3 = 4;
        if (4 > A02) {
            i3 = A02;
            if (A02 <= 0) {
                return 0;
            }
        }
        double d2 = (double) i2;
        if (i > 12) {
            d = ((double) 1) - 0.04d;
        } else {
            d = 1.0d;
        }
        return (int) ((d2 * d) / ((double) i3));
    }
}
