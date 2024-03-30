package X;

import java.util.Random;

/* renamed from: X.1Cm  reason: invalid class name and case insensitive filesystem */
public final class C24451Cm {
    public int A00;
    public boolean A01;
    public final long A02;
    public final long A03;
    public final Random A04;

    public C24451Cm(Random random, long j, long j2) {
        AnonymousClass00C.A0D(random, 1);
        this.A04 = random;
        this.A02 = j;
        this.A03 = j2;
    }

    public final synchronized Long A00() {
        Long l;
        int i = this.A00;
        if (((long) i) >= this.A02) {
            l = null;
        } else {
            int i2 = i + 1;
            this.A00 = i2;
            if (!this.A01) {
                if (i2 > 50) {
                    i2 = 50;
                }
                long j = (1 << i2) * 1000;
                long abs = (j / ((long) 2)) + Math.abs(this.A04.nextLong() % j);
                long j2 = this.A03;
                if (abs >= j2) {
                    this.A01 = true;
                    abs = j2;
                }
                l = Long.valueOf(abs);
            } else {
                l = Long.valueOf(this.A03);
            }
        }
        return l;
    }

    public final synchronized void A01() {
        this.A00 = 0;
    }
}
