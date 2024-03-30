package X;

import java.util.Arrays;

/* renamed from: X.0GA  reason: invalid class name */
public final class AnonymousClass0GA extends AnonymousClass0V0 {
    public int A00;

    public final void A05() {
        this.A01 = 0;
        long[] jArr = this.A02;
        if (jArr != C05860Ri.A00) {
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
            AnonymousClass000.A1H(this.A02, this.A00);
        }
        AnonymousClass02Q.A04(this.A04, 0, this.A00);
        AnonymousClass02Q.A04(this.A03, 0, this.A00);
        this.A00 = AnonymousClass000.A02(this.A00) - this.A01;
    }

    private final int A00(int i) {
        int i2 = this.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long A0R = AnonymousClass000.A0R(AnonymousClass000.A0S(this.A02, i3));
            if (A0R != 0) {
                return AnonymousClass000.A07(i3, i2, A0R);
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int A04(Object obj) {
        Object obj2 = obj;
        int A04 = AnonymousClass000.A04(AnonymousClass000.A0J(obj2));
        int i = A04 >>> 7;
        int i2 = A04 & 127;
        int i3 = this.A00;
        int i4 = i & i3;
        int i5 = 0;
        while (true) {
            long A0S = AnonymousClass000.A0S(this.A02, i4);
            long j = (long) i2;
            long j2 = A0S ^ (j * 72340172838076673L);
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L; j3 != 0; j3 = AnonymousClass000.A0P(j3)) {
                int A07 = AnonymousClass000.A07(i4, i3, j3);
                if (AnonymousClass00C.A0J(this.A03[A07], obj2)) {
                    return A07;
                }
            }
            if ((((~A0S) << 6) & A0S & -9187201950435737472L) != 0) {
                int A002 = A00(i);
                if (this.A00 == 0) {
                    long[] jArr = this.A02;
                    if (AnonymousClass000.A0T(jArr, A002) != 254) {
                        int i6 = this.A00;
                        AnonymousClass0GA r0 = C05860Ri.A01;
                        int i7 = 6;
                        if (i6 != 0) {
                            i7 = (i6 * 2) + 1;
                        }
                        Object[] objArr = this.A03;
                        Object[] objArr2 = this.A04;
                        A01(i7);
                        Object[] objArr3 = this.A03;
                        Object[] objArr4 = this.A04;
                        for (int i8 = 0; i8 < i6; i8++) {
                            if (AnonymousClass000.A0T(jArr, i8) < 128) {
                                Object obj3 = objArr[i8];
                                int A042 = AnonymousClass000.A04(AnonymousClass000.A0J(obj3));
                                int A003 = A00(A042 >>> 7);
                                long j4 = (long) (A042 & 127);
                                long[] jArr2 = this.A02;
                                int i9 = A003 >> 3;
                                int i10 = (A003 & 7) << 3;
                                jArr2[i9] = (jArr2[i9] & (~(255 << i10))) | (j4 << i10);
                                int A01 = AnonymousClass001.A01(A003, this.A00);
                                int i11 = A01 >> 3;
                                int i12 = (A01 & 7) << 3;
                                jArr2[i11] = (jArr2[i11] & (~(255 << i12))) | (j4 << i12);
                                objArr3[A003] = obj3;
                                objArr4[A003] = objArr2[i8];
                            }
                        }
                        A002 = A00(i);
                    }
                }
                this.A01++;
                int i13 = this.A00;
                long[] jArr3 = this.A02;
                int i14 = A002 >> 3;
                long j5 = jArr3[i14];
                int i15 = (A002 & 7) << 3;
                this.A00 = i13 - (AnonymousClass000.A1Q((((j5 >> i15) & 255) > 128 ? 1 : (((j5 >> i15) & 255) == 128 ? 0 : -1))) ? 1 : 0);
                jArr3[i14] = (j5 & (~(255 << i15))) | (j << i15);
                int A012 = AnonymousClass001.A01(A002, this.A00);
                int i16 = A012 >> 3;
                int i17 = (A012 & 7) << 3;
                jArr3[i16] = ((~(255 << i17)) & jArr3[i16]) | (j << i17);
                return ~A002;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void A06(int i) {
        this.A01--;
        long[] jArr = this.A02;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int A01 = AnonymousClass001.A01(i, this.A00);
        int i4 = A01 >> 3;
        int i5 = (A01 & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        this.A03[i] = null;
        this.A04[i] = null;
    }

    public AnonymousClass0GA(int i) {
        AnonymousClass0GA r0 = C05860Ri.A01;
        A01(i + ((i - 1) / 7));
    }

    private final void A01(int i) {
        int A03 = AnonymousClass000.A03(i);
        this.A00 = A03;
        long[] A1a = AnonymousClass000.A1a(A03);
        this.A02 = A1a;
        AnonymousClass000.A1H(A1a, A03);
        int i2 = this.A00;
        AnonymousClass0GA r0 = C05860Ri.A01;
        this.A00 = AnonymousClass000.A02(i2) - this.A01;
        this.A03 = new Object[A03];
        this.A04 = new Object[A03];
    }

    public final void A07(Object obj) {
        int A04 = AnonymousClass000.A04(AnonymousClass000.A0J(obj));
        int i = A04 & 127;
        int i2 = this.A00;
        int i3 = (A04 >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long A0S = AnonymousClass000.A0S(this.A02, i3);
            long A0N = AnonymousClass000.A0N(i, A0S) & -9187201950435737472L;
            while (A0N != 0) {
                int A06 = AnonymousClass000.A06(i3, i2, A0N);
                if (!AnonymousClass00C.A0J(this.A03[A06], obj)) {
                    A0N = AnonymousClass000.A0P(A0N);
                } else if (A06 >= 0) {
                    A06(A06);
                    return;
                } else {
                    return;
                }
            }
            if (AnonymousClass000.A0O(A0S) == 0) {
                i4 += 8;
                i3 = (i3 + i4) & i2;
            } else {
                return;
            }
        }
    }

    public final void A08(Object obj, Object obj2) {
        int A04 = A04(obj);
        if (A04 < 0) {
            A04 = ~A04;
        }
        this.A03[A04] = obj;
        this.A04[A04] = obj2;
    }

    public AnonymousClass0GA() {
        this(6);
    }
}
