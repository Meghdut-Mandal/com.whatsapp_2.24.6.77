package X;

/* renamed from: X.0G9  reason: invalid class name */
public final class AnonymousClass0G9 extends C06700Us {
    public int A00;

    private final int A00(int i) {
        int i2 = this.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long A0R = AnonymousClass000.A0R(AnonymousClass000.A0S(this.A03, i3));
            if (A0R != 0) {
                return AnonymousClass000.A07(i3, i2, A0R);
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public static final int A01(AnonymousClass0G9 r24, Object obj) {
        Object obj2 = obj;
        int A04 = AnonymousClass000.A04(AnonymousClass000.A0J(obj2));
        int i = A04 >>> 7;
        int i2 = A04 & 127;
        AnonymousClass0G9 r13 = r24;
        int i3 = r13.A00;
        int i4 = i & i3;
        int i5 = 0;
        while (true) {
            long A0S = AnonymousClass000.A0S(r13.A03, i4);
            long j = (long) i2;
            long j2 = A0S ^ (j * 72340172838076673L);
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L; j3 != 0; j3 = AnonymousClass000.A0P(j3)) {
                int A07 = AnonymousClass000.A07(i4, i3, j3);
                if (AnonymousClass00C.A0J(r13.A04[A07], obj2)) {
                    return A07;
                }
            }
            if ((((~A0S) << 6) & A0S & -9187201950435737472L) != 0) {
                int A002 = r13.A00(i);
                if (r13.A00 == 0) {
                    long[] jArr = r13.A03;
                    long[] jArr2 = jArr;
                    if (AnonymousClass000.A0T(jArr, A002) != 254) {
                        int i6 = r13.A00;
                        AnonymousClass0GA r0 = C05860Ri.A01;
                        int i7 = 6;
                        if (i6 != 0) {
                            i7 = (i6 * 2) + 1;
                        }
                        Object[] objArr = r13.A04;
                        int[] iArr = r13.A02;
                        r13.A02(i7);
                        Object[] objArr2 = r13.A04;
                        int[] iArr2 = r13.A02;
                        for (int i8 = 0; i8 < i6; i8++) {
                            if (AnonymousClass000.A0T(jArr2, i8) < 128) {
                                Object obj3 = objArr[i8];
                                int A042 = AnonymousClass000.A04(AnonymousClass000.A0J(obj3));
                                int A003 = r13.A00(A042 >>> 7);
                                long j4 = (long) (A042 & 127);
                                long[] jArr3 = r13.A03;
                                int i9 = A003 >> 3;
                                int i10 = (A003 & 7) << 3;
                                jArr3[i9] = (jArr3[i9] & (~(255 << i10))) | (j4 << i10);
                                int A01 = AnonymousClass001.A01(A003, r13.A00);
                                int i11 = A01 >> 3;
                                int i12 = (A01 & 7) << 3;
                                jArr3[i11] = (jArr3[i11] & (~(255 << i12))) | (j4 << i12);
                                objArr2[A003] = obj3;
                                iArr2[A003] = iArr[i8];
                            }
                        }
                        A002 = r13.A00(i);
                    }
                }
                r13.A01++;
                int i13 = r13.A00;
                long[] jArr4 = r13.A03;
                int i14 = A002 >> 3;
                long j5 = jArr4[i14];
                int i15 = (A002 & 7) << 3;
                r13.A00 = i13 - (AnonymousClass000.A1Q((((j5 >> i15) & 255) > 128 ? 1 : (((j5 >> i15) & 255) == 128 ? 0 : -1))) ? 1 : 0);
                jArr4[i14] = (j5 & (~(255 << i15))) | (j << i15);
                int A012 = AnonymousClass001.A01(A002, r13.A00);
                int i16 = A012 >> 3;
                int i17 = (A012 & 7) << 3;
                jArr4[i16] = ((~(255 << i17)) & jArr4[i16]) | (j << i17);
                return ~A002;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void A04(int i) {
        this.A01--;
        long[] jArr = this.A03;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int A01 = AnonymousClass001.A01(i, this.A00);
        int i4 = A01 >> 3;
        int i5 = (A01 & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        this.A04[i] = null;
    }

    public AnonymousClass0G9(int i) {
        int i2;
        if (i >= 0) {
            AnonymousClass0GA r0 = C05860Ri.A01;
            if (i == 7) {
                i2 = 8;
            } else {
                i2 = i + ((i - 1) / 7);
            }
            A02(i2);
            return;
        }
        throw AnonymousClass001.A08("Capacity must be a positive value.");
    }

    private final void A02(int i) {
        int A03 = AnonymousClass000.A03(i);
        this.A00 = A03;
        long[] A1a = AnonymousClass000.A1a(A03);
        this.A03 = A1a;
        AnonymousClass000.A1H(A1a, A03);
        int i2 = this.A00;
        AnonymousClass0GA r0 = C05860Ri.A01;
        this.A00 = AnonymousClass000.A02(i2) - this.A01;
        this.A04 = new Object[A03];
        this.A02 = new int[A03];
    }

    public AnonymousClass0G9() {
        this(6);
    }
}
