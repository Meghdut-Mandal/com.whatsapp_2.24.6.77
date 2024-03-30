package X;

/* renamed from: X.6U3  reason: invalid class name */
public abstract class AnonymousClass6U3 {
    public static final long A00(double d) {
        return A01((float) d, 4294967296L);
    }

    public static final long A02(int i) {
        return A01((float) i, 4294967296L);
    }

    public static final boolean A03(long j) {
        AnonymousClass68V[] r0 = AnonymousClass6WI.A02;
        return AnonymousClass000.A1Q(((j & 1095216660480L) > 0 ? 1 : ((j & 1095216660480L) == 0 ? 0 : -1)));
    }

    public static final long A01(float f, long j) {
        long floatToIntBits = j | (((long) Float.floatToIntBits(f)) & 4294967295L);
        AnonymousClass68V[] r0 = AnonymousClass6WI.A02;
        return floatToIntBits;
    }
}
