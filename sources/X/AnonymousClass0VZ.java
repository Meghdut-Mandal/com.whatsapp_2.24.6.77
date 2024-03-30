package X;

/* renamed from: X.0VZ  reason: invalid class name */
public abstract class AnonymousClass0VZ {
    public static final double A00(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2));
    }

    public static final String A01(long j) {
        if (j >= 0) {
            C06780Vb.A00(10);
            String l = Long.toString(j, 10);
            AnonymousClass00C.A08(l);
            return l;
        }
        long j2 = (long) 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C06780Vb.A00(10);
        String l2 = Long.toString(j3, 10);
        AnonymousClass00C.A08(l2);
        A0u.append(l2);
        C06780Vb.A00(10);
        String l3 = Long.toString(j4, 10);
        AnonymousClass00C.A08(l3);
        return AnonymousClass000.A0q(l3, A0u);
    }
}
