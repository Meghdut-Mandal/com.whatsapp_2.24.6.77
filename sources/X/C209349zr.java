package X;

import java.util.Objects;

/* renamed from: X.9zr  reason: invalid class name and case insensitive filesystem */
public final class C209349zr implements B5S, C161967nm {
    public long A00;
    public long A01 = 0;
    public C161967nm A02;
    public A01[] A03 = new A01[0];
    public final B5S A04;

    public C209349zr(B5S b5s, long j) {
        this.A04 = b5s;
        this.A00 = j;
    }

    public void B2Y(long j) {
        this.A04.B2Y(j);
    }

    public boolean B3Y(long j, long j2) {
        return this.A04.B3Y(j, j2);
    }

    public void B5V(long j, boolean z) {
        this.A04.B5V(j, z);
    }

    public long B8K(C199399fF r18, long j) {
        long j2;
        C199399fF r10 = r18;
        long j3 = j;
        if (j == 0) {
            return 0;
        }
        long j4 = r10.A01;
        long max = Math.max(0, Math.min(j4, j - 0));
        long j5 = r10.A00;
        long j6 = this.A00;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long max2 = Math.max(0, Math.min(j5, j2));
        if (!(max == j4 && max2 == j5)) {
            r10 = new C199399fF(max, max2);
        }
        return this.A04.B8K(r10, j3);
    }

    public long B92(long j) {
        return this.A04.B92(j);
    }

    public long B93() {
        long B93 = this.A04.B93();
        if (B93 != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || B93 < j) {
                return B93;
            }
        }
        return Long.MIN_VALUE;
    }

    public long BEW() {
        long BEW = this.A04.BEW();
        if (BEW != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || BEW < j) {
                return BEW;
            }
        }
        return Long.MIN_VALUE;
    }

    public C206419tN BIW() {
        return this.A04.BIW();
    }

    public void BPe() {
        this.A04.BPe();
    }

    public /* bridge */ /* synthetic */ void BUd(B3I b3i) {
        C161967nm r0 = this.A02;
        Objects.requireNonNull(r0);
        r0.BUd(this);
    }

    public void BdO(B5S b5s) {
        C161967nm r0 = this.A02;
        Objects.requireNonNull(r0);
        r0.BdO(this);
    }

    public void Bm4(C161967nm r2, long j) {
        this.A02 = r2;
        this.A04.Bm4(this, j);
    }

    public long Bmt() {
        if (AnonymousClass000.A1P((this.A01 > -9223372036854775807L ? 1 : (this.A01 == -9223372036854775807L ? 0 : -1)))) {
            long j = this.A01;
            this.A01 = -9223372036854775807L;
            long Bmt = Bmt();
            if (Bmt != -9223372036854775807L) {
                return Bmt;
            }
            return j;
        }
        long Bmt2 = this.A04.Bmt();
        if (Bmt2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C200319h9.A02(C36401kF.A1U((Bmt2 > 0 ? 1 : (Bmt2 == 0 ? 0 : -1))));
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && Bmt2 > j2) {
            z = false;
        }
        C200319h9.A02(z);
        return Bmt2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r10 > r0) goto L_0x007b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bpe(X.B2j[] r19, X.B5T[] r20, boolean[] r21, boolean[] r22, long r23) {
        /*
            r18 = this;
            r6 = r19
            int r5 = r6.length
            X.A01[] r7 = new X.A01[r5]
            r4 = r18
            r4.A03 = r7
            X.B2j[] r12 = new X.B2j[r5]
            r3 = 0
            r1 = 0
        L_0x000d:
            r2 = 0
            if (r1 >= r5) goto L_0x0021
            r0 = r19[r1]
            r7[r1] = r0
            r0 = r7[r1]
            if (r0 == 0) goto L_0x001c
            r0 = r7[r1]
            X.B2j r2 = r0.A01
        L_0x001c:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0021:
            X.B5S r11 = r4.A04
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r23
            long r10 = r11.Bpe(r12, r13, r14, r15, r16)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A01 = r0
            int r0 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x004c
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
            long r0 = r4.A00
            r8 = -9223372036854775808
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x004c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x007b
        L_0x004c:
            r0 = 1
        L_0x004d:
            X.C200319h9.A02(r0)
        L_0x0050:
            if (r3 >= r5) goto L_0x007d
            r0 = r12[r3]
            if (r0 != 0) goto L_0x0061
            X.A01[] r7 = r4.A03
            r7[r3] = r2
        L_0x005a:
            r0 = r7[r3]
            r19[r3] = r0
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0061:
            r0 = r19[r3]
            if (r0 == 0) goto L_0x006f
            X.A01[] r7 = r4.A03
            r0 = r7[r3]
            X.B2j r1 = r0.A01
            r0 = r12[r3]
            if (r1 == r0) goto L_0x005a
        L_0x006f:
            X.A01[] r7 = r4.A03
            r1 = r12[r3]
            X.A01 r0 = new X.A01
            r0.<init>(r4, r1)
            r7[r3] = r0
            goto L_0x005a
        L_0x007b:
            r0 = 0
            goto L_0x004d
        L_0x007d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209349zr.Bpe(X.B2j[], X.B5T[], boolean[], boolean[], long):long");
    }

    public void Brc(boolean z) {
        this.A04.Brc(z);
    }

    public void Bwk(byte b, boolean z) {
        this.A04.Bwk(b, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r6 > r3) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bpa(long r9, boolean r11) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A01 = r0
            X.A01[] r3 = r8.A03
            int r2 = r3.length
            r5 = 0
            r1 = 0
        L_0x000c:
            if (r1 >= r2) goto L_0x0017
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0014
            r0.A00 = r5
        L_0x0014:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0017:
            X.B5S r0 = r8.A04
            long r6 = r0.Bpa(r9, r11)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0034
        L_0x0033:
            r5 = 1
        L_0x0034:
            X.C200319h9.A02(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209349zr.Bpa(long, boolean):long");
    }
}
