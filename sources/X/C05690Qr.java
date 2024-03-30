package X;

/* renamed from: X.0Qr  reason: invalid class name and case insensitive filesystem */
public abstract class C05690Qr {
    public static final C10910fQ A00(String str) {
        String str2 = str;
        AnonymousClass00C.A0D(str2, 0);
        C06780Vb.A00(10);
        int length = str2.length();
        if (length != 0) {
            int i = 0;
            char charAt = str2.charAt(0);
            if (AnonymousClass00C.A00(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i = 1;
                }
            }
            long j = (long) 10;
            long j2 = 0;
            long j3 = 512409557603043100L;
            while (i < length) {
                int digit = Character.digit(str2.charAt(i), 10);
                if (digit >= 0) {
                    if (Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) > 0) {
                        if (j3 == 512409557603043100L) {
                            if (j >= 0) {
                                int i2 = 1;
                                long j4 = ((-1 >>> 1) / j) << 1;
                                if (((-1 - (j4 * j)) ^ Long.MIN_VALUE) < (j ^ Long.MIN_VALUE)) {
                                    i2 = 0;
                                }
                                j3 = j4 + ((long) i2);
                            } else if (Long.MAX_VALUE < (j ^ Long.MIN_VALUE)) {
                                j3 = 0;
                            } else {
                                j3 = 1;
                            }
                            if (Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) > 0) {
                            }
                        }
                    }
                    long j5 = j2 * j;
                    long j6 = (((long) digit) & 4294967295L) + j5;
                    if (Long.compare(j6 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) >= 0) {
                        i++;
                        j2 = j6;
                    }
                }
            }
            return new C10910fQ(j2);
        }
        return null;
    }
}
