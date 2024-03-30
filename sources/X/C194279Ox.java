package X;

/* renamed from: X.9Ox  reason: invalid class name and case insensitive filesystem */
public abstract class C194279Ox {
    public static int A02(int i) {
        return AnonymousClass8D7.A00(i << 3);
    }

    public static void A04(AnonymousClass8D7 r1, int i) {
        r1.A03((i << 3) | 2);
    }

    public static void A05(AnonymousClass8D7 r2, int i, int i2) {
        r2.A03(i2 << 3);
        r2.A03((i >> 31) ^ (i << 1));
    }

    public static void A06(AnonymousClass8D7 r1, int i, long j) {
        r1.A03(i << 3);
        r1.A09(j);
    }

    public static int A03(int i, int i2) {
        return i2 + AnonymousClass8D7.A00(i) + i;
    }
}
