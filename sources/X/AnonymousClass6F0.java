package X;

/* renamed from: X.6F0  reason: invalid class name */
public abstract class AnonymousClass6F0 {
    public final int A00;
    public final C15020mZ A01;

    public static int A00(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public int A01(long j) {
        if (this instanceof C98234r6) {
            return A00(j);
        }
        if (!(this instanceof C98224r5)) {
            return A00(j);
        }
        int i = ((int) j) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public int A02(long j) {
        if (this instanceof C98234r6) {
            return A00(j >>> 32);
        }
        if (!(this instanceof C98224r5)) {
            return A00(j >>> 32);
        }
        int A0D = C90514aH.A0D(j) & 1073741823 & 262143;
        int i = A0D - 1;
        if (A0D == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public int A03(long j) {
        if (this instanceof C98234r6) {
            return 0;
        }
        if (!(this instanceof C98224r5)) {
            return A00(j);
        }
        int i = (((int) j) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public int A04(long j) {
        if (this instanceof C98234r6) {
            return 0;
        }
        if (!(this instanceof C98224r5)) {
            return A00(j >>> 32);
        }
        int A0D = (C90514aH.A0D(j) & Integer.MAX_VALUE) >>> 18;
        int i = A0D - 1;
        if (A0D == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public long A05(int i, int i2) {
        long j;
        if ((this instanceof C98234r6) || !(this instanceof C98224r5)) {
            int i3 = i2 + 1;
            if (i2 == Integer.MAX_VALUE) {
                i3 = 0;
            }
            j = (long) ((i3 & 1073741823) | (this.A00 << 30));
        } else {
            int i4 = 0;
            int i5 = i + 1;
            if (i == Integer.MAX_VALUE) {
                i5 = 0;
            }
            if (i2 != Integer.MAX_VALUE) {
                i4 = i2 + 1;
            }
            j = (long) (((i5 & 8191) << 18) | (this.A00 << 30) | (262143 & i4));
        }
        return j & 4294967295L;
    }

    public AnonymousClass6F0(C15020mZ r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
