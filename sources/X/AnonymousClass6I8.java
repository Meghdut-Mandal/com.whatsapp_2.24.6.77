package X;

import java.util.Random;

/* renamed from: X.6I8  reason: invalid class name */
public abstract class AnonymousClass6I8 {
    public static final Random A00 = new Random();

    public static String A00(long j) {
        if (j < 0) {
            throw AnonymousClass001.A08(C36381kD.A0z("Cannot internalEncode negative integer ", AnonymousClass000.A0u(), j));
        } else if (j <= (1 << Math.min(63, 66)) - 1) {
            StringBuilder A0u = AnonymousClass000.A0u();
            int i = 0;
            do {
                C90514aH.A1R("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", A0u, (int) (j % 64));
                j >>= 6;
                i++;
            } while (i < 11);
            if (j <= 0) {
                A0u.reverse();
                return A0u.toString();
            }
            throw AnonymousClass001.A08("Number won't fit in string");
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Cannot internalEncode integer ");
            A0u2.append(j);
            A0u2.append(" in ");
            A0u2.append(11);
            throw AnonymousClass000.A0c(" chars", A0u2);
        }
    }
}
