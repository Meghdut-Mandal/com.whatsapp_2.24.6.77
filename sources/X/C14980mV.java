package X;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.0mV  reason: invalid class name and case insensitive filesystem */
public final class C14980mV extends C14990mW {
    public long A06(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE);
    }

    public int A03(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    public Random A07() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AnonymousClass00C.A08(current);
        return current;
    }

    public long A05(long j) {
        return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
    }
}
