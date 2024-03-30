package X;

import java.util.Iterator;

/* renamed from: X.0fa  reason: invalid class name and case insensitive filesystem */
public abstract class C11010fa implements Iterable, AnonymousClass00W {
    public final long A00;
    public final long A01;

    public C11010fa(long j, long j2) {
        long j3;
        long j4;
        long j5 = j2;
        long j6 = j;
        this.A00 = j6;
        if (Long.compare(j6 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) < 0) {
            long j7 = 1;
            if (j2 >= 0) {
                j3 = j2 % 1;
            } else {
                long j8 = j2 - ((((j2 >>> 1) / 1) << 1) * 1);
                j3 = j8 - ((j8 ^ Long.MIN_VALUE) < -9223372036854775807L ? 0 : j7);
            }
            long j9 = 1;
            if (j >= 0) {
                j4 = j % 1;
            } else {
                long j10 = j - ((((j >>> 1) / 1) << 1) * 1);
                j4 = j10 - ((j10 ^ Long.MIN_VALUE) < -9223372036854775807L ? 0 : j9);
            }
            int A002 = Long.compare(j3 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
            long j11 = j3 - j4;
            j5 = j2 - (A002 < 0 ? j11 + 1 : j11);
        }
        this.A01 = j5;
    }

    public final Iterator iterator() {
        return new C12330hs(this.A00, this.A01);
    }
}
