package X;

import java.util.Random;

/* renamed from: X.6KC  reason: invalid class name */
public class AnonymousClass6KC {
    public final C21100yf A00;
    public final Random A01;
    public final C20810yC A02;

    public static long A00(AnonymousClass6KC r3, int i, int i2) {
        int nextInt;
        C20810yC r1 = r3.A02;
        if (r1.A0E(i)) {
            int A07 = r1.A07(i2);
            if (A07 <= 0) {
                return 0;
            }
            nextInt = r3.A01.nextInt(A07);
        } else {
            C21100yf r2 = r3.A00;
            Random random = r3.A01;
            int A04 = r2.A04(C21100yf.A1i);
            if (A04 <= 0) {
                return 0;
            }
            nextInt = random.nextInt(A04 * 2);
        }
        return C36371kC.A07(nextInt);
    }

    public AnonymousClass6KC(C21100yf r1, C20810yC r2, Random random) {
        this.A01 = random;
        this.A00 = r1;
        this.A02 = r2;
    }
}
