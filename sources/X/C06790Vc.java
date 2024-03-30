package X;

/* renamed from: X.0Vc  reason: invalid class name and case insensitive filesystem */
public abstract class C06790Vc {
    public static final long A00(AnonymousClass0Nh r4, int i) {
        long j = (long) i;
        if (r4.compareTo(AnonymousClass0Nh.SECONDS) <= 0) {
            return AnonymousClass0Nh.NANOSECONDS.timeUnit.convert(j, r4.timeUnit) << 1;
        }
        return A01(r4, j);
    }

    public static final long A01(AnonymousClass0Nh r7, long j) {
        AnonymousClass0Nh r6 = AnonymousClass0Nh.NANOSECONDS;
        long convert = r7.timeUnit.convert(4611686018426999999L, r6.timeUnit);
        C15030ma r3 = new C15030ma(-convert, convert);
        if (r3.A00 > j || j > r3.A01) {
            return (C15040mb.A04(AnonymousClass0Nh.MILLISECONDS.timeUnit.convert(j, r7.timeUnit), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        }
        return r6.timeUnit.convert(j, r7.timeUnit) << 1;
    }
}
