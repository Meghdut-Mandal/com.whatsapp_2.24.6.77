package X;

/* renamed from: X.0fR  reason: invalid class name and case insensitive filesystem */
public abstract class C10920fR implements Comparable {
    public static final long A00 = ((4611686018427387903L << 1) + 1);
    public static final long A01 = ((-4611686018427387903L << 1) + 1);

    public static final long A00(long j) {
        AnonymousClass0Nh r0;
        int i = ((int) j) & 1;
        if (i == 1 && j != A00 && j != A01) {
            return j >> 1;
        }
        AnonymousClass0Nh r3 = AnonymousClass0Nh.MILLISECONDS;
        if (j == A00) {
            return Long.MAX_VALUE;
        }
        if (j == A01) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if (i == 0) {
            r0 = AnonymousClass0Nh.NANOSECONDS;
        } else {
            r0 = r3;
        }
        return r3.timeUnit.convert(j2, r0.timeUnit);
    }
}
