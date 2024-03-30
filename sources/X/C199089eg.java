package X;

/* renamed from: X.9eg  reason: invalid class name and case insensitive filesystem */
public final class C199089eg {
    public int A00;
    public int A01 = 1000;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public C207099uY A07;
    public boolean A08 = true;
    public boolean A09 = true;
    public int[] A0A = new int[1000];
    public int[] A0B = new int[1000];
    public int[] A0C = new int[1000];
    public long[] A0D = new long[1000];
    public long[] A0E = new long[1000];
    public C207099uY[] A0F = new C207099uY[1000];
    public AnonymousClass9UL[] A0G = new AnonymousClass9UL[1000];

    public synchronized boolean A01() {
        return C36381kD.A1U(this.A03, this.A02);
    }

    public static long A00(C199089eg r10, int i) {
        int i2;
        long j = r10.A05;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int i3 = r10.A04 + (i - 1);
            int i4 = r10.A01;
            if (i3 >= i4) {
                i3 -= i4;
            }
            for (int i5 = 0; i5 < i; i5++) {
                j2 = Math.max(j2, r10.A0E[i2]);
                if ((r10.A0A[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i4 - 1;
                }
            }
        }
        r10.A05 = Math.max(j, j2);
        int i6 = r10.A02 - i;
        r10.A02 = i6;
        r10.A00 += i;
        int i7 = r10.A04 + i;
        r10.A04 = i7;
        int i8 = r10.A01;
        if (i7 >= i8) {
            i7 -= i8;
            r10.A04 = i7;
        }
        int i9 = r10.A03 - i;
        r10.A03 = i9;
        if (i9 < 0) {
            r10.A03 = 0;
        }
        if (i6 != 0) {
            return r10.A0D[i7];
        }
        if (i7 != 0) {
            i8 = i7;
        }
        int i10 = i8 - 1;
        return r10.A0D[i10] + ((long) r10.A0B[i10]);
    }
}
