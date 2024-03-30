package X;

/* renamed from: X.72V  reason: invalid class name */
public abstract class AnonymousClass72V implements Comparable {
    public static final float A00 = Float.intBitsToFloat(1056964608);

    public static final float A00(short s) {
        int i;
        short s2 = s & 65535;
        short s3 = 32768 & s2;
        int i2 = (s2 >>> 10) & 31;
        short s4 = s2 & 1023;
        int i3 = 0;
        if (i2 != 0) {
            i = s4 << 13;
            if (i2 == 31) {
                if (i != 0) {
                    i |= 4194304;
                }
                i3 = 255;
            } else {
                i3 = (i2 - 15) + 127;
            }
        } else if (s4 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s4 + 1056964608) - A00;
            if (s3 != 0) {
                return -intBitsToFloat;
            }
            return intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (s3 << 16) | (i3 << 23));
    }
}
