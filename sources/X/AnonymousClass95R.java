package X;

/* renamed from: X.95R  reason: invalid class name */
public abstract class AnonymousClass95R {
    public static int A04(int i) {
        return C170568Dy.A00(i << 3);
    }

    public static int A05(int i, int i2) {
        return i2 + C170568Dy.A00((i >> 31) ^ (i << 1));
    }

    public static void A06(C170568Dy r1, int i) {
        r1.A05((i << 3) | 2);
    }

    public static void A07(Object obj, int i, int i2) {
        C170568Dy r1 = ((A44) obj).A00;
        r1.A05((i << 3) | 5);
        r1.A06(i2);
    }

    public static void A08(Object obj, int i, long j) {
        C170568Dy r1 = ((A44) obj).A00;
        r1.A05((i << 3) | 1);
        r1.A0A(j);
    }

    public static void A09(Object obj, int i, long j) {
        C170568Dy r1 = ((A44) obj).A00;
        r1.A05(i << 3);
        r1.A09(j);
    }
}
