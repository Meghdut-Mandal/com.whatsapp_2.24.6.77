package X;

import java.math.RoundingMode;
import java.util.Objects;

/* renamed from: X.0QZ  reason: invalid class name */
public abstract class AnonymousClass0QZ {
    public static int A00(int i, int i2, RoundingMode roundingMode) {
        Objects.requireNonNull(roundingMode);
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (AnonymousClass0RR.A00[roundingMode.ordinal()]) {
                case 1:
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                case 2:
                    return i3;
                case 3:
                    if (i5 >= 0) {
                        return i3;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i5 <= 0) {
                        return i3;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0) {
                        if ((0 & i3 & 1) == 0) {
                            return i3;
                        }
                    } else if (abs2 <= 0) {
                        return i3;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            return i3 + i5;
        }
        throw new ArithmeticException("/ by zero");
    }
}