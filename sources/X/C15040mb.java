package X;

import java.util.NoSuchElementException;

/* renamed from: X.0mb  reason: invalid class name and case insensitive filesystem */
public abstract class C15040mb extends AnonymousClass0P0 {
    public static final int A03(AnonymousClass0XG r3, C15020mZ r4) {
        AnonymousClass00C.A0D(r3, 1);
        try {
            if (!r4.A01()) {
                int i = r4.A01;
                int i2 = r4.A00;
                if (i < Integer.MAX_VALUE) {
                    return r3.A03(i2, i + 1);
                }
                if (i2 > Integer.MIN_VALUE) {
                    return r3.A03(i2 - 1, i) + 1;
                }
                return r3.A00();
            }
            throw AnonymousClass001.A08(AnonymousClass000.A0l(r4, "Cannot get random in empty range: ", AnonymousClass000.A0u()));
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final double A00(double d, double d2, double d3) {
        if (d2 > d3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Cannot coerce value to an empty range: maximum ");
            A0u.append(d3);
            A0u.append(" is less than minimum ");
            A0u.append(d2);
            A0u.append('.');
            throw AnonymousClass000.A0b(A0u);
        } else if (d < d2) {
            return d2;
        } else {
            if (d > d3) {
                return d3;
            }
            return d;
        }
    }

    public static final float A01(float f, float f2, float f3) {
        if (f2 > f3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Cannot coerce value to an empty range: maximum ");
            A0u.append(f3);
            A0u.append(" is less than minimum ");
            A0u.append(f2);
            A0u.append('.');
            throw AnonymousClass000.A0b(A0u);
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }

    public static final int A02(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Cannot coerce value to an empty range: maximum ");
            A0u.append(i3);
            A0u.append(" is less than minimum ");
            A0u.append(i2);
            A0u.append('.');
            throw AnonymousClass000.A0b(A0u);
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static final long A04(long j, long j2, long j3) {
        if (j2 > j3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Cannot coerce value to an empty range: maximum ");
            A0u.append(j3);
            A0u.append(" is less than minimum ");
            A0u.append(j2);
            A0u.append('.');
            throw AnonymousClass000.A0b(A0u);
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }

    public static final C15020mZ A05(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C15020mZ.A00;
        }
        return new C15020mZ(i, i2 - 1);
    }
}
