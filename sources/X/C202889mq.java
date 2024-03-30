package X;

import java.util.Arrays;

/* renamed from: X.9mq  reason: invalid class name and case insensitive filesystem */
public final class C202889mq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public static short[] A04(C202889mq r1, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = r1.A0G;
        int i4 = length / i3;
        if (i + i2 > i4) {
            return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
        }
        return sArr;
    }

    private int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0G;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += AnonymousClass000.A05(sArr[i4 + i10], sArr[i4 + i2 + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.A02 = i5 / i7;
        this.A01 = i8 / i6;
        return i7;
    }

    public static void A01(C202889mq r24) {
        int i;
        int A002;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C202889mq r10 = r24;
        int i10 = r10.A05;
        float f = r10.A0F;
        float f2 = r10.A0D;
        float f3 = f / f2;
        float f4 = r10.A0E * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = r10.A00;
            int i12 = r10.A0J;
            int i13 = i12;
            if (i11 >= i12) {
                int i14 = 0;
                do {
                    int i15 = r10.A09;
                    if (i15 > 0) {
                        i4 = Math.min(i13, i15);
                        r10.A02(r10.A0A, i14, i4);
                        r10.A09 -= i4;
                    } else {
                        short[] sArr = r10.A0A;
                        int i16 = r10.A0H;
                        if (i16 > 4000) {
                            i = i16 / 4000;
                        } else {
                            i = 1;
                        }
                        int i17 = r10.A0G;
                        if (i17 == 1 && i == 1) {
                            A002 = r10.A00(sArr, i14, r10.A0K, r10.A0I);
                        } else {
                            r10.A03(sArr, i14, i);
                            short[] sArr2 = r10.A0L;
                            int i18 = r10.A0K;
                            int i19 = i18;
                            int i20 = r10.A0I;
                            A002 = r10.A00(sArr2, 0, i18 / i, i20 / i);
                            if (i != 1) {
                                int i21 = A002 * i;
                                int i22 = i * 4;
                                int i23 = i21 - i22;
                                int i24 = i21 + i22;
                                int i25 = i19;
                                if (i23 < i25) {
                                    i23 = i25;
                                }
                                if (i24 > i20) {
                                    i24 = i20;
                                }
                                if (i17 == 1) {
                                    A002 = r10.A00(sArr, i14, i23, i24);
                                } else {
                                    r10.A03(sArr, i14, 1);
                                    A002 = r10.A00(sArr2, 0, i23, i24);
                                }
                            }
                        }
                        int i26 = r10.A02;
                        int i27 = r10.A01;
                        if (i26 == 0 || (i2 = r10.A08) == 0 || i27 > i26 * 3 || i26 * 2 <= r10.A07 * 3) {
                            i2 = A002;
                        }
                        r10.A07 = i26;
                        r10.A08 = A002;
                        if (d > 1.0d) {
                            float f5 = (float) i2;
                            if (f3 >= 2.0f) {
                                i5 = (int) (f5 / (f3 - 1.0f));
                            } else {
                                r10.A09 = (int) ((f5 * (2.0f - f3)) / (f3 - 1.0f));
                                i5 = i2;
                            }
                            short[] A042 = A04(r10, r10.A0B, r10.A05, i5);
                            r10.A0B = A042;
                            int i28 = r10.A05;
                            int i29 = i14 + i2;
                            for (int i30 = 0; i30 < i17; i30++) {
                                int i31 = (i28 * i17) + i30;
                                int i32 = (i29 * i17) + i30;
                                int i33 = (i14 * i17) + i30;
                                for (int i34 = 0; i34 < i5; i34++) {
                                    A042[i31] = (short) (((sArr[i33] * (i5 - i34)) + (sArr[i32] * i34)) / i5);
                                    i31 += i17;
                                    i33 += i17;
                                    i32 += i17;
                                }
                            }
                            r10.A05 = i28 + i5;
                            i4 = i2 + i5;
                        } else {
                            float f6 = (float) i2;
                            if (f3 < 0.5f) {
                                i3 = (int) ((f6 * f3) / (1.0f - f3));
                            } else {
                                r10.A09 = (int) ((f6 * ((2.0f * f3) - 1.0f)) / (1.0f - f3));
                                i3 = i2;
                            }
                            int i35 = i2 + i3;
                            short[] A043 = A04(r10, r10.A0B, r10.A05, i35);
                            r10.A0B = A043;
                            int i36 = i14 * i17;
                            System.arraycopy(sArr, i36, A043, r10.A05 * i17, i17 * i2);
                            short[] sArr3 = r10.A0B;
                            int i37 = r10.A05;
                            int i38 = i37 + i2;
                            int i39 = i14 + i2;
                            for (int i40 = 0; i40 < i17; i40++) {
                                int i41 = (i38 * i17) + i40;
                                int i42 = i36 + i40;
                                int i43 = (i39 * i17) + i40;
                                for (int i44 = 0; i44 < i3; i44++) {
                                    sArr3[i41] = (short) (((sArr[i43] * (i3 - i44)) + (sArr[i42] * i44)) / i3);
                                    i41 += i17;
                                    i43 += i17;
                                    i42 += i17;
                                }
                            }
                            r10.A05 = i37 + i35;
                            i4 = i3;
                        }
                    }
                    i14 += i4;
                } while (i13 + i14 <= i11);
                int i45 = r10.A00 - i14;
                short[] sArr4 = r10.A0A;
                int i46 = r10.A0G;
                System.arraycopy(sArr4, i14 * i46, sArr4, 0, i46 * i45);
                r10.A00 = i45;
            }
        } else {
            r10.A02(r10.A0A, 0, r10.A00);
            r10.A00 = 0;
        }
        if (f4 != 1.0f && (i6 = r10.A05) != i10) {
            int i47 = r10.A0H;
            int i48 = (int) (((float) i47) / f4);
            while (true) {
                if (i48 <= 16384 && i47 <= 16384) {
                    break;
                }
                i48 /= 2;
                i47 /= 2;
            }
            int i49 = i6 - i10;
            short[] A044 = A04(r10, r10.A0C, r10.A06, i49);
            r10.A0C = A044;
            short[] sArr5 = r10.A0B;
            int i50 = r10.A0G;
            System.arraycopy(sArr5, i10 * i50, A044, r10.A06 * i50, i50 * i49);
            r10.A05 = i10;
            r10.A06 += i49;
            int i51 = 0;
            while (true) {
                i7 = r10.A06;
                boolean z = true;
                if (i51 >= i7 - 1) {
                    break;
                }
                while (true) {
                    i8 = r10.A04 + 1;
                    int i52 = i8 * i48;
                    i9 = r10.A03;
                    if (i52 <= i9 * i47) {
                        break;
                    }
                    short[] A045 = A04(r10, r10.A0B, i10, 1);
                    r10.A0B = A045;
                    for (int i53 = 0; i53 < i50; i53++) {
                        short[] sArr6 = r10.A0C;
                        int i54 = (i50 * i51) + i53;
                        short s = sArr6[i54];
                        short s2 = sArr6[i54 + i50];
                        int i55 = r10.A04;
                        int i56 = i55 * i48;
                        int i57 = (i55 + 1) * i48;
                        int i58 = i57 - (r10.A03 * i47);
                        int i59 = i57 - i56;
                        A045[(r10.A05 * i50) + i53] = (short) (((s * i58) + ((i59 - i58) * s2)) / i59);
                    }
                    r10.A03++;
                    i10 = r10.A05 + 1;
                    r10.A05 = i10;
                }
                r10.A04 = i8;
                if (i8 == i47) {
                    r10.A04 = 0;
                    if (i9 != i48) {
                        z = false;
                    }
                    C200319h9.A02(z);
                    r10.A03 = 0;
                }
                i51++;
            }
            int i60 = i7 - 1;
            if (i60 != 0) {
                short[] sArr7 = r10.A0C;
                System.arraycopy(sArr7, i60 * i50, sArr7, 0, (i7 - i60) * i50);
                r10.A06 -= i60;
            }
        }
    }

    private void A02(short[] sArr, int i, int i2) {
        short[] A042 = A04(this, this.A0B, this.A05, i2);
        this.A0B = A042;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, A042, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int i4 = this.A0G;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0L[i7] = (short) (i8 / i5);
        }
    }

    public C202889mq(float f, float f2, int i, int i2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = ((float) i) / ((float) i3);
        this.A0K = i / 400;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 * 2;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0A = new short[i6];
        this.A0B = new short[i6];
        this.A0C = new short[i6];
    }
}
