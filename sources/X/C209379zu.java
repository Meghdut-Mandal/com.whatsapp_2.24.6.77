package X;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.9zu  reason: invalid class name and case insensitive filesystem */
public final class C209379zu implements B5S, B2D {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public B29 A07;
    public C161967nm A08;
    public C206419tN A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public C209179za[] A0H;
    public boolean[] A0I;
    public boolean[] A0J;
    public boolean[] A0K;
    public boolean A0L;
    public boolean A0M;
    public int[] A0N;
    public final long A0O = ((long) 1048576);
    public final Handler A0P;
    public final AnonymousClass9J1 A0Q;
    public final C1689682s A0R;
    public final C202249lP A0S;
    public final C198829eG A0T = new C198829eG("Loader:ExtractorMediaPeriod");
    public final C199339f9 A0U;
    public final Runnable A0V;
    public final Runnable A0W;
    public final Uri A0X;
    public final B39 A0Y;
    public final C195899Ws A0Z;

    public C209379zu(Uri uri, C1689682s r7, C202249lP r8, B39 b39, C195899Ws r10, B2h[] b2hArr) {
        this.A0X = uri;
        this.A0Y = b39;
        this.A0S = r8;
        this.A0R = r7;
        this.A0Z = r10;
        this.A0Q = new AnonymousClass9J1(this, b2hArr);
        this.A0U = new C199339f9();
        this.A0V = new AnonymousClass759(this, 35);
        this.A0W = new AnonymousClass759(this, 36);
        this.A0P = new Handler();
        this.A0N = new int[0];
        this.A0H = new C209179za[0];
        this.A06 = -9223372036854775807L;
        this.A05 = -1;
        this.A03 = -9223372036854775807L;
        this.A00 = 3;
        r8.A02();
    }

    public void B2Y(long j) {
    }

    public void Brc(boolean z) {
    }

    public void Bwk(byte b, boolean z) {
    }

    private long A00() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (C209179za r0 : this.A0H) {
            C199089eg r2 = r0.A09;
            synchronized (r2) {
                j = r2.A06;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    private void A01() {
        A0R a0r = new A0R(this.A0X, this.A0Q, this, this.A0Y, this.A0U);
        if (this.A0E) {
            long j = this.A06;
            C200319h9.A02(AnonymousClass000.A1P((j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1))));
            long j2 = this.A03;
            if (j2 == -9223372036854775807L || j < j2) {
                long j3 = this.A07.BH7(j).A00.A00;
                long j4 = this.A06;
                a0r.A05.A00 = j3;
                a0r.A02 = j4;
                a0r.A04 = true;
                this.A06 = -9223372036854775807L;
            } else {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
        }
        int i = 0;
        for (C209179za r0 : this.A0H) {
            C199089eg r02 = r0.A09;
            i += r02.A00 + r02.A02;
        }
        this.A02 = i;
        this.A0T.A00(this, a0r, this.A00);
        this.A0S.A07(new C191069Bl(a0r.A03), new AnonymousClass9NR((C207099uY) null, (Object) null, 1, -1, 0, C202249lP.A00(a0r.A02), C202249lP.A00(this.A03)));
    }

    public static void A02(C207099uY r5, C209379zu r6, int i) {
        C207099uY r1 = C165597tg.A0H(r6.A09, i).A02[0];
        if (!r6.A0J[i] || !r1.equals(r5)) {
            C165597tg.A0H(r6.A09, i).A02[0] = r5;
            r6.A0S.A05(r5, C203249nb.A01(r5.A0S), r6.A04);
            r6.A0J[i] = true;
        }
    }

    public static void A03(C209379zu r4, int i) {
        if (r4.A0D && r4.A0K[i] && !r4.A0H[i].A09.A01()) {
            r4.A06 = 0;
            r4.A0D = false;
            r4.A0C = true;
            r4.A04 = 0;
            r4.A02 = 0;
            for (C209179za A052 : r4.A0H) {
                A052.A05();
            }
            r4.A08.BUd(r4);
        }
    }

    public static boolean A04(C209379zu r5) {
        if (r5.A0C || r5.A06 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public C23061B2i A05(int i) {
        C209179za[] r2 = this.A0H;
        int length = r2.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.A0N[i2] == i) {
                return r2[i2];
            }
        }
        C209179za r22 = new C209179za(this.A0Z);
        r22.A03 = this;
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.A0N, i3);
        this.A0N = copyOf;
        copyOf[length] = i;
        C209179za[] r0 = (C209179za[]) Arrays.copyOf(this.A0H, i3);
        this.A0H = r0;
        r0[length] = r22;
        return r22;
    }

    public boolean B3Y(long j, long j2) {
        if (this.A0B || this.A0D || (this.A0E && this.A01 == 0)) {
            return false;
        }
        boolean A012 = this.A0U.A01();
        if (this.A0T.A00 != null) {
            return A012;
        }
        A01();
        return true;
    }

    public void B5V(long j, boolean z) {
        long j2;
        int i;
        int length = this.A0H.length;
        for (int i2 = 0; i2 < length; i2++) {
            C209179za r4 = this.A0H[i2];
            boolean z2 = this.A0I[i2];
            C199089eg r3 = r4.A09;
            synchronized (r3) {
                int i3 = r3.A02;
                if (i3 != 0) {
                    long[] jArr = r3.A0E;
                    int i4 = r3.A04;
                    if (j >= jArr[i4]) {
                        if (z2 && (i = r3.A03) != i3) {
                            i3 = i + 1;
                        }
                        int i5 = -1;
                        for (int i6 = 0; i6 < i3 && jArr[i4] <= j; i6++) {
                            if (!z || (r3.A0A[i4] & 1) != 0) {
                                i5 = i6;
                            }
                            i4++;
                            if (i4 == r3.A01) {
                                i4 = 0;
                            }
                        }
                        if (i5 != -1) {
                            j2 = C199089eg.A00(r3, i5);
                        }
                    }
                }
                j2 = -1;
            }
            C209179za.A01(r4, j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r7 > r3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long B8K(X.C199399fF r18, long r19) {
        /*
            r17 = this;
            r9 = r19
            r0 = r17
            X.B29 r1 = r0.A07
            boolean r0 = r1.BN9()
            if (r0 != 0) goto L_0x000f
            r9 = 0
            return r9
        L_0x000f:
            X.9VL r1 = r1.BH7(r9)
            X.9fu r0 = r1.A00
            long r7 = r0.A01
            X.9fu r0 = r1.A01
            long r5 = r0.A01
            r11 = r18
            long r3 = r11.A01
            r15 = 0
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            long r0 = r11.A00
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x002c
            return r9
        L_0x002c:
            long r13 = r19 - r3
            long r3 = r3 ^ r19
            long r1 = r19 ^ r13
            long r1 = r1 & r3
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            r13 = -9223372036854775808
        L_0x0039:
            long r11 = r11.A00
            long r3 = r19 + r11
            long r1 = r19 ^ r3
            long r11 = r11 ^ r3
            long r1 = r1 & r11
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x004a:
            r2 = 1
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
        L_0x005d:
            if (r1 == 0) goto L_0x0074
            if (r2 == 0) goto L_0x0071
            long r0 = r7 - r19
            long r3 = java.lang.Math.abs(r0)
            long r0 = r5 - r19
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
        L_0x0071:
            return r7
        L_0x0072:
            r2 = 0
            goto L_0x005d
        L_0x0074:
            if (r2 != 0) goto L_0x0077
            return r13
        L_0x0077:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209379zu.B8K(X.9fF, long):long");
    }

    public long B92(long j) {
        long B93;
        if (this.A0B) {
            B93 = this.A03;
        } else {
            B93 = B93();
        }
        return B93 - j;
    }

    public long B93() {
        long j;
        long j2;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        long j3 = this.A06;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        if (this.A0A) {
            j = Long.MAX_VALUE;
            int length = this.A0H.length;
            for (int i = 0; i < length; i++) {
                if (this.A0K[i]) {
                    C199089eg r2 = this.A0H[i].A09;
                    synchronized (r2) {
                        j2 = r2.A06;
                    }
                    j = Math.min(j, j2);
                }
            }
        } else {
            j = A00();
        }
        if (j == Long.MIN_VALUE) {
            return this.A04;
        }
        return j;
    }

    public long BEW() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return B93();
    }

    public void BPe() {
        IOException iOException;
        C198829eG r1 = this.A0T;
        int i = this.A00;
        IOException iOException2 = r1.A01;
        if (iOException2 == null) {
            C166117v3 r0 = r1.A00;
            if (r0 != null && (iOException = r0.A01) != null && r0.A00 > i) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public /* bridge */ /* synthetic */ void BZp(B0X b0x, long j, long j2, boolean z) {
        A0R a0r = (A0R) b0x;
        this.A0S.A06(new C191069Bl(a0r.A03), new AnonymousClass9NR((C207099uY) null, (Object) null, 1, -1, 0, C202249lP.A00(a0r.A02), C202249lP.A00(this.A03)));
        if (!z) {
            if (this.A05 == -1) {
                this.A05 = a0r.A01;
            }
            for (C209179za A052 : this.A0H) {
                A052.A05();
            }
            if (this.A01 > 0) {
                this.A08.BUd(this);
            }
        }
    }

    public /* bridge */ /* synthetic */ void BZr(B0X b0x, long j, long j2) {
        long j3;
        A0R a0r = (A0R) b0x;
        if (this.A03 == -9223372036854775807L) {
            long A002 = A00();
            if (A002 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = A002 + 10000;
            }
            this.A03 = j3;
            this.A0R.A07(j3, this.A07.BN9());
        }
        this.A0S.A09(new C191069Bl(a0r.A03), new AnonymousClass9NR((C207099uY) null, (Object) null, 1, -1, 0, C202249lP.A00(a0r.A02), C202249lP.A00(this.A03)), a0r);
        if (this.A05 == -1) {
            this.A05 = a0r.A01;
        }
        this.A0B = true;
        this.A08.BUd(this);
    }

    public /* bridge */ /* synthetic */ C191099Bo BZw(B0X b0x, IOException iOException, int i, long j, long j2) {
        boolean z;
        B29 b29;
        A0R a0r = (A0R) b0x;
        IOException iOException2 = iOException;
        if ((iOException2 instanceof AnonymousClass82I) || ((iOException2 instanceof AnonymousClass83K) && ((AnonymousClass83K) iOException2).responseCode == 410)) {
            z = true;
        } else {
            z = false;
        }
        this.A0S.A08(new C191069Bl(a0r.A03), new AnonymousClass9NR((C207099uY) null, (Object) null, 1, -1, 0, C202249lP.A00(a0r.A02), C202249lP.A00(this.A03)), iOException2, z);
        long j3 = this.A05;
        if (j3 == -1) {
            j3 = a0r.A01;
            this.A05 = j3;
        }
        if (z) {
            return C198829eG.A04;
        }
        C209179za[] r7 = this.A0H;
        int i2 = 0;
        for (C209179za r3 : r7) {
            C199089eg r32 = r3.A09;
            i2 += r32.A00 + r32.A02;
        }
        boolean A1T = C90474aD.A1T(i2, this.A02);
        if (j3 == -1 && ((b29 = this.A07) == null || b29.BBK() == -9223372036854775807L)) {
            boolean z2 = this.A0E;
            if (!z2 || A04(this)) {
                this.A0C = z2;
                this.A04 = 0;
                this.A02 = 0;
                for (C209179za A052 : r7) {
                    A052.A05();
                }
                a0r.A05.A00 = 0;
                a0r.A02 = 0;
                a0r.A04 = true;
            } else {
                this.A0D = true;
                return C198829eG.A03;
            }
        } else {
            this.A02 = i2;
        }
        if (A1T) {
            return C198829eG.A06;
        }
        return C198829eG.A05;
    }

    public void Bm4(C161967nm r2, long j) {
        this.A08 = r2;
        this.A0U.A01();
        A01();
    }

    public long Bmt() {
        if (!this.A0L) {
            this.A0S.A04();
            this.A0L = true;
        }
        if (!this.A0C) {
            return -9223372036854775807L;
        }
        if (!this.A0B) {
            int i = 0;
            for (C209179za r0 : this.A0H) {
                C199089eg r02 = r0.A09;
                i += r02.A00 + r02.A02;
            }
            if (i <= this.A02) {
                return -9223372036854775807L;
            }
        }
        this.A0C = false;
        return this.A04;
    }

    public long Bpa(long j, boolean z) {
        if (!this.A07.BN9()) {
            j = 0;
        }
        this.A04 = j;
        this.A0C = false;
        if (this.A06 == -9223372036854775807L) {
            int length = this.A0H.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C209179za r2 = this.A0H[i];
                C199089eg r1 = r2.A09;
                synchronized (r1) {
                    r1.A03 = 0;
                }
                r2.A05 = r2.A04;
                if (r2.A03(j, false) == -1 && (this.A0K[i] || !this.A0A)) {
                    break;
                }
                i++;
            }
            return j;
        }
        this.A0D = false;
        this.A06 = j;
        this.A0B = false;
        C166117v3 r0 = this.A0T.A00;
        if (r0 != null) {
            Objects.requireNonNull(r0);
            r0.A00(false);
        } else {
            for (C209179za A052 : this.A0H) {
                A052.A05();
            }
        }
        return j;
    }

    public long Bpe(B2j[] b2jArr, B5T[] b5tArr, boolean[] zArr, boolean[] zArr2, long j) {
        int length;
        boolean z;
        C200319h9.A02(this.A0E);
        int i = this.A01;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = b5tArr.length;
            if (i4 >= length) {
                break;
            }
            if (b2jArr[i4] != null && (b5tArr[i4] == null || !zArr[i4])) {
                int i5 = b2jArr[i4].A00;
                boolean[] zArr3 = this.A0I;
                C200319h9.A02(zArr3[i5]);
                i2--;
                this.A01 = i2;
                zArr3[i5] = false;
                b2jArr[i4] = null;
            }
            i4++;
        }
        if (!this.A0M ? j == 0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (b2jArr[i6] == null && b5tArr[i6] != null) {
                A0A a0a = b5tArr[i6];
                C200319h9.A02(AnonymousClass000.A1S(a0a.A03.length, 1));
                A0A a0a2 = a0a;
                C200319h9.A02(AnonymousClass000.A1Q(a0a2.A03[0]));
                int indexOf = this.A09.A02.indexOf(a0a2.A02);
                if (indexOf < 0) {
                    indexOf = -1;
                }
                boolean[] zArr4 = this.A0I;
                C200319h9.A02(!zArr4[indexOf]);
                this.A01++;
                zArr4[indexOf] = true;
                b2jArr[i6] = new A00(this, indexOf);
                zArr2[i6] = true;
                if (!z) {
                    C209179za r6 = this.A0H[indexOf];
                    C199089eg r1 = r6.A09;
                    synchronized (r1) {
                        r1.A03 = 0;
                    }
                    r6.A05 = r6.A04;
                    if (r6.A03(j, true) == -1) {
                        C199089eg r0 = r6.A09;
                        z = true;
                        if (r0.A00 + r0.A03 != 0) {
                        }
                    }
                    z = false;
                } else {
                    continue;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0D = false;
            this.A0C = false;
            C198829eG r5 = this.A0T;
            boolean A1V = AnonymousClass000.A1V(r5.A00);
            C209179za[] r2 = this.A0H;
            int length2 = r2.length;
            if (A1V) {
                while (i3 < length2) {
                    r2[i3].A04();
                    i3++;
                }
                C166117v3 r12 = r5.A00;
                Objects.requireNonNull(r12);
                r12.A00(false);
            } else {
                while (i3 < length2) {
                    r2[i3].A05();
                    i3++;
                }
            }
        } else if (z) {
            j = Bpa(j, false);
            while (i3 < b2jArr.length) {
                if (b2jArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.A0M = true;
        return j;
    }

    public C206419tN BIW() {
        return this.A09;
    }
}
