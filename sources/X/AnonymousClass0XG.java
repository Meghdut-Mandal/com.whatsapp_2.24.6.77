package X;

/* renamed from: X.0XG  reason: invalid class name */
public abstract class AnonymousClass0XG {
    public static final C15000mX A00 = new C15000mX();
    public static final AnonymousClass0XG A01;

    public abstract int A00();

    public abstract int A01(int i);

    public abstract int A02(int i);

    public abstract long A04();

    static {
        AnonymousClass0XG r0;
        Integer num = AnonymousClass0RU.A00;
        if (num == null || num.intValue() >= 34) {
            r0 = new C14980mV();
        } else {
            r0 = new C14970mU();
        }
        A01 = r0;
    }

    public int A03(int i, int i2) {
        int A002;
        int i3;
        if (i2 > i) {
            int i4 = i2 - i;
            if (i4 > 0 || i4 == Integer.MIN_VALUE) {
                if (((-i4) & i4) == i4) {
                    i3 = A01(31 - Integer.numberOfLeadingZeros(i4));
                } else {
                    do {
                        A002 = A00() >>> 1;
                        i3 = A002 % i4;
                    } while ((A002 - i3) + (i4 - 1) < 0);
                }
                return i + i3;
            }
            while (true) {
                int A003 = A00();
                if (i <= A003 && A003 < i2) {
                    return A003;
                }
            }
        } else {
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Random range is empty: [");
            A0u.append(valueOf);
            A0u.append(", ");
            A0u.append(valueOf2);
            throw AnonymousClass000.A0c(").", A0u);
        }
    }

    public long A06(long j, long j2) {
        long A04;
        long j3;
        int A002;
        if (((-Long.MAX_VALUE) & Long.MAX_VALUE) == Long.MAX_VALUE) {
            int i = (int) Long.MAX_VALUE;
            int i2 = (int) (Long.MAX_VALUE >>> 32);
            if (i != 0) {
                A002 = A01(31 - Integer.numberOfLeadingZeros(i));
            } else if (i2 == 1) {
                A002 = A00();
            } else {
                j3 = (((long) A01(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) A00()) & 4294967295L);
            }
            j3 = ((long) A002) & 4294967295L;
        } else {
            do {
                A04 = A04() >>> 1;
                j3 = A04 % Long.MAX_VALUE;
            } while ((A04 - j3) + 9223372036854775806L < 0);
        }
        return 0 + j3;
    }

    public long A05(long j) {
        return A06(0, Long.MAX_VALUE);
    }
}
