package X;

import java.util.Arrays;

/* renamed from: X.6Wp  reason: invalid class name and case insensitive filesystem */
public final class C133086Wp {
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
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final short[] A0J;

    public static short[] A04(C133086Wp r1, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = r1.A0E;
        int i4 = length / i3;
        if (i + i2 > i4) {
            return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
        }
        return sArr;
    }

    private int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0E;
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

    public static void A01(C133086Wp r24) {
        int i;
        int A002;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C133086Wp r10 = r24;
        int i9 = r10.A05;
        float f = 1.0f / 1.0f;
        float f2 = r10.A0D * 1.0f;
        double d = (double) f;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = r10.A00;
            int i11 = r10.A0H;
            int i12 = i11;
            if (i10 >= i11) {
                int i13 = 0;
                do {
                    int i14 = r10.A09;
                    if (i14 > 0) {
                        i4 = Math.min(i12, i14);
                        r10.A02(r10.A0A, i13, i4);
                        r10.A09 -= i4;
                    } else {
                        short[] sArr = r10.A0A;
                        int i15 = r10.A0F;
                        if (i15 > 4000) {
                            i = i15 / 4000;
                        } else {
                            i = 1;
                        }
                        int i16 = r10.A0E;
                        if (i16 == 1 && i == 1) {
                            A002 = r10.A00(sArr, i13, r10.A0I, r10.A0G);
                        } else {
                            r10.A03(sArr, i13, i);
                            short[] sArr2 = r10.A0J;
                            int i17 = r10.A0I;
                            int i18 = i17;
                            int i19 = r10.A0G;
                            A002 = r10.A00(sArr2, 0, i17 / i, i19 / i);
                            if (i != 1) {
                                int i20 = A002 * i;
                                int i21 = i * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                int i24 = i18;
                                if (i22 < i24) {
                                    i22 = i24;
                                }
                                if (i23 > i19) {
                                    i23 = i19;
                                }
                                if (i16 == 1) {
                                    A002 = r10.A00(sArr, i13, i22, i23);
                                } else {
                                    r10.A03(sArr, i13, 1);
                                    A002 = r10.A00(sArr2, 0, i22, i23);
                                }
                            }
                        }
                        int i25 = r10.A02;
                        int i26 = r10.A01;
                        if (i25 == 0 || (i2 = r10.A08) == 0 || i26 > i25 * 3 || i25 * 2 <= r10.A07 * 3) {
                            i2 = A002;
                        }
                        r10.A07 = i25;
                        r10.A08 = A002;
                        if (d > 1.0d) {
                            float f3 = (float) i2;
                            if (f >= 2.0f) {
                                i5 = (int) (f3 / (f - 1.0f));
                            } else {
                                r10.A09 = (int) ((f3 * (2.0f - f)) / (f - 1.0f));
                                i5 = i2;
                            }
                            short[] A042 = A04(r10, r10.A0B, r10.A05, i5);
                            r10.A0B = A042;
                            int i27 = r10.A05;
                            int i28 = i13 + i2;
                            for (int i29 = 0; i29 < i16; i29++) {
                                int i30 = (i27 * i16) + i29;
                                int i31 = (i28 * i16) + i29;
                                int i32 = (i13 * i16) + i29;
                                for (int i33 = 0; i33 < i5; i33++) {
                                    A042[i30] = (short) (((sArr[i32] * (i5 - i33)) + (sArr[i31] * i33)) / i5);
                                    i30 += i16;
                                    i32 += i16;
                                    i31 += i16;
                                }
                            }
                            r10.A05 = i27 + i5;
                            i4 = i2 + i5;
                        } else {
                            float f4 = (float) i2;
                            if (f < 0.5f) {
                                i3 = (int) ((f4 * f) / (1.0f - f));
                            } else {
                                r10.A09 = (int) ((f4 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i3 = i2;
                            }
                            int i34 = i2 + i3;
                            short[] A043 = A04(r10, r10.A0B, r10.A05, i34);
                            r10.A0B = A043;
                            int i35 = i13 * i16;
                            System.arraycopy(sArr, i35, A043, r10.A05 * i16, i16 * i2);
                            short[] sArr3 = r10.A0B;
                            int i36 = r10.A05;
                            int i37 = i36 + i2;
                            int i38 = i13 + i2;
                            for (int i39 = 0; i39 < i16; i39++) {
                                int i40 = (i37 * i16) + i39;
                                int i41 = i35 + i39;
                                int i42 = (i38 * i16) + i39;
                                for (int i43 = 0; i43 < i3; i43++) {
                                    sArr3[i40] = (short) (((sArr[i42] * (i3 - i43)) + (sArr[i41] * i43)) / i3);
                                    i40 += i16;
                                    i42 += i16;
                                    i41 += i16;
                                }
                            }
                            r10.A05 = i36 + i34;
                            i4 = i3;
                        }
                    }
                    i13 += i4;
                } while (i12 + i13 <= i10);
                int i44 = r10.A00 - i13;
                short[] sArr4 = r10.A0A;
                int i45 = r10.A0E;
                System.arraycopy(sArr4, i13 * i45, sArr4, 0, i45 * i44);
                r10.A00 = i44;
            }
        } else {
            r10.A02(r10.A0A, 0, r10.A00);
            r10.A00 = 0;
        }
        if (f2 != 1.0f && (i6 = r10.A05) != i9) {
            int i46 = r10.A0F;
            int i47 = (int) (((float) i46) / f2);
            while (true) {
                if (i47 <= 16384 && i46 <= 16384) {
                    break;
                }
                i47 /= 2;
                i46 /= 2;
            }
            int i48 = i6 - i9;
            short[] A044 = A04(r10, r10.A0C, r10.A06, i48);
            r10.A0C = A044;
            short[] sArr5 = r10.A0B;
            int i49 = r10.A0E;
            System.arraycopy(sArr5, i9 * i49, A044, r10.A06 * i49, i49 * i48);
            r10.A05 = i9;
            r10.A06 += i48;
            int i50 = 0;
            while (true) {
                int i51 = r10.A06;
                if (i50 >= i51 - 1) {
                    int i52 = i51 - 1;
                    if (i52 != 0) {
                        short[] sArr6 = r10.A0C;
                        System.arraycopy(sArr6, i52 * i49, sArr6, 0, (i51 - i52) * i49);
                        r10.A06 -= i52;
                        return;
                    }
                    return;
                }
                while (true) {
                    i7 = r10.A04 + 1;
                    int i53 = i7 * i47;
                    i8 = r10.A03;
                    if (i53 <= i8 * i46) {
                        break;
                    }
                    short[] A045 = A04(r10, r10.A0B, i9, 1);
                    r10.A0B = A045;
                    for (int i54 = 0; i54 < i49; i54++) {
                        short[] sArr7 = r10.A0C;
                        int i55 = (i49 * i50) + i54;
                        short s = sArr7[i55];
                        short s2 = sArr7[i55 + i49];
                        int i56 = r10.A04;
                        int i57 = i56 * i47;
                        int i58 = (i56 + 1) * i47;
                        int i59 = i58 - (r10.A03 * i46);
                        int i60 = i58 - i57;
                        A045[(r10.A05 * i49) + i54] = (short) (((s * i59) + ((i60 - i59) * s2)) / i60);
                    }
                    r10.A03++;
                    i9 = r10.A05 + 1;
                    r10.A05 = i9;
                }
                r10.A04 = i7;
                if (i7 == i46) {
                    r10.A04 = 0;
                    if (i8 == i47) {
                        r10.A03 = 0;
                    } else {
                        throw AnonymousClass001.A09("Wrong sample rate");
                    }
                }
                i50++;
            }
        }
    }

    private void A02(short[] sArr, int i, int i2) {
        short[] A042 = A04(this, this.A0B, this.A05, i2);
        this.A0B = A042;
        int i3 = this.A0E;
        System.arraycopy(sArr, i * i3, A042, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0H / i2;
        int i4 = this.A0E;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0J[i7] = (short) (i8 / i5);
        }
    }

    public C133086Wp(int i, int i2) {
        this.A0F = i;
        this.A0E = i2;
        this.A0D = ((float) i) / ((float) 44100);
        this.A0I = i / 400;
        int i3 = i / 65;
        this.A0G = i3;
        int i4 = i3 * 2;
        this.A0H = i4;
        this.A0J = new short[i4];
        int i5 = i4 * i2;
        this.A0A = new short[i5];
        this.A0B = new short[i5];
        this.A0C = new short[i5];
    }
}
