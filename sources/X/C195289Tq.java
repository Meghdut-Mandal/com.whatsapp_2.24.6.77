package X;

import java.lang.reflect.Array;

/* renamed from: X.9Tq  reason: invalid class name and case insensitive filesystem */
public final class C195289Tq {
    public AUY A00;
    public final AnonymousClass9DL A01;

    public AUY A00() {
        int[] iArr;
        int i;
        AUY auy = this.A00;
        AUY auy2 = auy;
        if (auy == null) {
            C173608Si r2 = (C173608Si) this.A01;
            AUY auy3 = r2.A00;
            auy2 = auy3;
            if (auy3 == null) {
                AnonymousClass9VP r10 = r2.A00;
                int i2 = r10.A01;
                int i3 = r10.A00;
                if (i2 < 40 || i3 < 40) {
                    auy2 = new AUY(i2, i3);
                    if (r2.A01.length < i2) {
                        r2.A01 = new byte[i2];
                    }
                    int i4 = 0;
                    int i5 = 0;
                    do {
                        iArr = r2.A02;
                        iArr[i5] = 0;
                        i5++;
                    } while (i5 < 32);
                    for (int i6 = 1; i6 < 5; i6++) {
                        byte[] A012 = r10.A01(r2.A01, (i3 * i6) / 5);
                        int i7 = (i2 << 2) / 5;
                        for (int i8 = i2 / 5; i8 < i7; i8++) {
                            C165587tf.A1V(iArr, (A012[i8] & 255) >> 3);
                        }
                    }
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    do {
                        if (iArr[i9] > i10) {
                            i10 = iArr[i9];
                            i12 = i9;
                        }
                        if (iArr[i9] > i11) {
                            i11 = iArr[i9];
                        }
                        i9++;
                    } while (i9 < 32);
                    int i13 = 0;
                    int i14 = 0;
                    do {
                        int i15 = i4 - i12;
                        int i16 = iArr[i4] * i15 * i15;
                        if (i16 > i14) {
                            i13 = i4;
                            i14 = i16;
                        }
                        i4++;
                    } while (i4 < 32);
                    if (i12 <= i13) {
                        int i17 = i12;
                        i12 = i13;
                        i13 = i17;
                    }
                    if (i12 - i13 > 2) {
                        int i18 = i12 - 1;
                        int i19 = i18;
                        int i20 = -1;
                        while (i18 > i13) {
                            int i21 = i18 - i13;
                            int i22 = i21 * i21 * (i12 - i18) * (i11 - iArr[i18]);
                            if (i22 > i20) {
                                i19 = i18;
                                i20 = i22;
                            }
                            i18--;
                        }
                        int i23 = i19 << 3;
                        byte[] A002 = r10.A00();
                        for (int i24 = 0; i24 < i3; i24++) {
                            int i25 = i24 * i2;
                            for (int i26 = 0; i26 < i2; i26++) {
                                if ((A002[i25 + i26] & 255) < i23) {
                                    auy2.A01(i26, i24);
                                }
                            }
                        }
                    } else {
                        throw C173658Sn.A00;
                    }
                } else {
                    byte[] A003 = r10.A00();
                    int i27 = i2 >> 3;
                    if ((i2 & 7) != 0) {
                        i27++;
                    }
                    int i28 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i28++;
                    }
                    int i29 = i3 - 8;
                    int i30 = i2 - 8;
                    int[] A1O = C36441kJ.A1O();
                    A1O[1] = i27;
                    A1O[0] = i28;
                    int[][] iArr2 = (int[][]) Array.newInstance(int.class, A1O);
                    for (int i31 = 0; i31 < i28; i31++) {
                        int i32 = i31 << 3;
                        int i33 = i29;
                        if (i32 > i33) {
                            i32 = i33;
                        }
                        for (int i34 = 0; i34 < i27; i34++) {
                            int i35 = i34 << 3;
                            int i36 = i30;
                            if (i35 > i36) {
                                i35 = i36;
                            }
                            int i37 = (i32 * i2) + i35;
                            byte b = 255;
                            int i38 = 0;
                            int i39 = 0;
                            byte b2 = 0;
                            do {
                                int i40 = 0;
                                do {
                                    byte b3 = A003[i37 + i40] & 255;
                                    i39 += b3;
                                    if (b3 < b) {
                                        b = b3;
                                    }
                                    if (b3 > b2) {
                                        b2 = b3;
                                    }
                                    i40++;
                                } while (i40 < 8);
                                i = b2 - b;
                                if (i > 24) {
                                    while (true) {
                                        i38++;
                                        i37 += i2;
                                        if (i38 >= 8) {
                                            break;
                                        }
                                        int i41 = 0;
                                        do {
                                            i39 += A003[i37 + i41] & 255;
                                            i41++;
                                        } while (i41 < 8);
                                    }
                                }
                                i38++;
                                i37 += i2;
                            } while (i38 < 8);
                            int i42 = i39 >> 6;
                            if (i <= 24) {
                                i42 = b / 2;
                                if (i31 > 0 && i34 > 0) {
                                    int[] iArr3 = iArr2[i31 - 1];
                                    int i43 = i34 - 1;
                                    int i44 = ((iArr3[i34] + (iArr2[i31][i43] * 2)) + iArr3[i43]) / 4;
                                    if (b < i44) {
                                        i42 = i44;
                                    }
                                }
                            }
                            iArr2[i31][i34] = i42;
                        }
                    }
                    auy2 = new AUY(i2, i3);
                    for (int i45 = 0; i45 < i28; i45++) {
                        int i46 = i45 << 3;
                        int i47 = i29;
                        if (i46 > i47) {
                            i46 = i47;
                        }
                        int i48 = i28 - 3;
                        if (i45 < 2) {
                            i48 = 2;
                        } else if (i45 <= i48) {
                            i48 = i45;
                        }
                        for (int i49 = 0; i49 < i27; i49++) {
                            int i50 = i49 << 3;
                            int i51 = i30;
                            if (i50 > i51) {
                                i50 = i51;
                            }
                            int i52 = i27 - 3;
                            if (i49 < 2) {
                                i52 = 2;
                            } else if (i49 <= i52) {
                                i52 = i49;
                            }
                            int i53 = -2;
                            int i54 = 0;
                            do {
                                int[] iArr4 = iArr2[i48 + i53];
                                i54 = C165607th.A0C(iArr4, i52 + 2, iArr4[i52 - 2] + iArr4[i52 - 1] + iArr4[i52] + iArr4[i52 + 1], i54);
                                i53++;
                            } while (i53 <= 2);
                            int i55 = i54 / 25;
                            int i56 = (i46 * i2) + i50;
                            int i57 = 0;
                            do {
                                int i58 = 0;
                                do {
                                    if ((A003[i56 + i58] & 255) <= i55) {
                                        auy2.A01(i50 + i58, i46 + i57);
                                    }
                                    i58++;
                                } while (i58 < 8);
                                i57++;
                                i56 += i2;
                            } while (i57 < 8);
                        }
                    }
                }
                auy3 = auy2;
                r2.A00 = auy3;
            }
            this.A00 = auy3;
        }
        return auy2;
    }

    public C195289Tq(AnonymousClass9DL r1) {
        this.A01 = r1;
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (C173658Sn unused) {
            return "";
        }
    }
}
