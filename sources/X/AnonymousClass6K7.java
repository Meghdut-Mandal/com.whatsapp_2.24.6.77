package X;

/* renamed from: X.6K7  reason: invalid class name */
public final class AnonymousClass6K7 {
    public final int A00;
    public final long[] A01;
    public final Object[] A02;

    public static final int A00(AnonymousClass6K7 r8, long j) {
        int i = r8.A00 - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = r8.A01[0];
            if (j2 == j) {
                return 0;
            }
            if (j2 > j) {
                return -2;
            }
            return -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int i4 = ((r8.A01[i3] - j) > 0 ? 1 : ((r8.A01[i3] - j) == 0 ? 0 : -1));
            if (i4 < 0) {
                i2 = i3 + 1;
            } else if (i4 <= 0) {
                return i3;
            } else {
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public AnonymousClass6K7(long[] jArr, Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = jArr;
        this.A02 = objArr;
    }
}
