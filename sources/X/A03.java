package X;

public class A03 implements B3I {
    public final B3I[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r4 > r17) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean B3Y(long r17, long r19) {
        /*
            r16 = this;
            r15 = 0
        L_0x0001:
            r0 = r16
            X.B3I[] r8 = r0.A00
            int r7 = r8.length
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = -9223372036854775808
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r9 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -9223372036854775808
        L_0x0019:
            if (r9 >= r7) goto L_0x0030
            r0 = r8[r9]
            long r0 = r0.BEW()
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x002d
            long r4 = java.lang.Math.min(r4, r0)
            long r2 = java.lang.Math.max(r2, r0)
        L_0x002d:
            int r9 = r9 + 1
            goto L_0x0019
        L_0x0030:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r10, r10)
        L_0x0039:
            java.lang.Object r0 = r0.first
            long r11 = X.C36431kI.A09(r0)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0080
            r0 = 0
        L_0x0044:
            if (r0 >= r7) goto L_0x0056
            int r0 = r0 + 1
            goto L_0x0044
        L_0x0049:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            goto L_0x0039
        L_0x0056:
            r10 = 0
            r9 = 0
        L_0x0058:
            if (r10 >= r7) goto L_0x007d
            r6 = r8[r10]
            long r4 = r6.BEW()
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r2 = r17
            if (r0 == 0) goto L_0x006b
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0075
        L_0x0072:
            int r10 = r10 + 1
            goto L_0x0058
        L_0x0075:
            r0 = r19
            boolean r0 = r6.B3Y(r2, r0)
            r9 = r9 | r0
            goto L_0x0072
        L_0x007d:
            r15 = r15 | r9
            if (r9 != 0) goto L_0x0001
        L_0x0080:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A03.B3Y(long, long):boolean");
    }

    public void B2Y(long j) {
        for (B3I B2Y : this.A00) {
            B2Y.B2Y(j);
        }
    }

    public final long B92(long j) {
        long j2 = Long.MAX_VALUE;
        for (B3I B92 : this.A00) {
            long B922 = B92.B92(j);
            if (B922 != Long.MIN_VALUE) {
                if (B922 <= 0) {
                    return 0;
                }
                j2 = Math.min(j2, B922);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return 0;
        }
        return j2;
    }

    public final long B93() {
        long j = Long.MAX_VALUE;
        for (B3I B93 : this.A00) {
            long B932 = B93.B93();
            if (B932 != Long.MIN_VALUE) {
                j = Math.min(j, B932);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long BEW() {
        long j = Long.MAX_VALUE;
        for (B3I BEW : this.A00) {
            long BEW2 = BEW.BEW();
            if (BEW2 != Long.MIN_VALUE) {
                j = Math.min(j, BEW2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public void Brc(boolean z) {
        for (B3I Brc : this.A00) {
            Brc.Brc(z);
        }
    }

    public void Bwk(byte b, boolean z) {
        for (B3I Bwk : this.A00) {
            Bwk.Bwk(b, z);
        }
    }

    public A03(B3I[] b3iArr) {
        this.A00 = b3iArr;
    }
}
