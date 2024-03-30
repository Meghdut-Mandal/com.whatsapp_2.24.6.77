package X;

/* renamed from: X.98E  reason: invalid class name */
public abstract class AnonymousClass98E {
    public static int A00(AnonymousClass604 r28, byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        long j2 = j;
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[64];
        byte[] bArr8 = new byte[32];
        AnonymousClass9M4 r3 = new AnonymousClass9M4();
        C193299Kx r24 = new C193299Kx();
        if (j >= 64) {
            byte[] bArr9 = bArr2;
            if ((bArr2[63] & 224) == 0) {
                int[] iArr = new int[10];
                int[] iArr2 = new int[10];
                int[] iArr3 = new int[10];
                int[] iArr4 = new int[10];
                int[] iArr5 = new int[10];
                int[] iArr6 = r3.A02;
                int[] iArr7 = iArr6;
                byte[] bArr10 = bArr3;
                C200509hW.A00(bArr10, iArr6);
                int[] iArr8 = r3.A03;
                iArr8[0] = 1;
                C165597tg.A1P(iArr8);
                AnonymousClass985.A00(iArr, iArr6);
                AnonymousClass983.A00(iArr2, iArr, C190849An.A00);
                AnonymousClass986.A00(iArr, iArr, iArr8);
                AnonymousClass980.A00(iArr2, iArr2, iArr8);
                AnonymousClass985.A00(iArr3, iArr2);
                AnonymousClass983.A00(iArr3, iArr3, iArr2);
                int[] iArr9 = r3.A01;
                AnonymousClass985.A00(iArr9, iArr3);
                AnonymousClass983.A00(iArr9, iArr9, iArr2);
                AnonymousClass983.A00(iArr9, iArr9, iArr);
                int[] iArr10 = new int[10];
                int[] iArr11 = new int[10];
                int[] iArr12 = new int[10];
                AnonymousClass985.A00(iArr10, iArr9);
                AnonymousClass985.A00(iArr11, iArr10);
                AnonymousClass985.A00(iArr11, iArr11);
                AnonymousClass983.A00(iArr11, iArr9, iArr11);
                AnonymousClass983.A00(iArr10, iArr10, iArr11);
                AnonymousClass985.A00(iArr10, iArr10);
                AnonymousClass983.A00(iArr10, iArr11, iArr10);
                AnonymousClass985.A00(iArr11, iArr10);
                int i = 1;
                do {
                    AnonymousClass985.A00(iArr11, iArr11);
                    i++;
                } while (i < 5);
                AnonymousClass983.A00(iArr10, iArr11, iArr10);
                AnonymousClass985.A00(iArr11, iArr10);
                int i2 = 1;
                do {
                    AnonymousClass985.A00(iArr11, iArr11);
                    i2++;
                } while (i2 < 10);
                AnonymousClass983.A00(iArr11, iArr11, iArr10);
                AnonymousClass985.A00(iArr12, iArr11);
                int i3 = 1;
                do {
                    AnonymousClass985.A00(iArr12, iArr12);
                    i3++;
                } while (i3 < 20);
                AnonymousClass983.A00(iArr11, iArr12, iArr11);
                AnonymousClass985.A00(iArr11, iArr11);
                int i4 = 1;
                do {
                    AnonymousClass985.A00(iArr11, iArr11);
                    i4++;
                } while (i4 < 10);
                AnonymousClass983.A00(iArr10, iArr11, iArr10);
                AnonymousClass985.A00(iArr11, iArr10);
                int i5 = 1;
                do {
                    AnonymousClass985.A00(iArr11, iArr11);
                    i5++;
                } while (i5 < 50);
                AnonymousClass983.A00(iArr11, iArr11, iArr10);
                AnonymousClass985.A00(iArr12, iArr11);
                int i6 = 1;
                do {
                    AnonymousClass985.A00(iArr12, iArr12);
                    i6++;
                } while (i6 < 100);
                AnonymousClass983.A00(iArr11, iArr12, iArr11);
                AnonymousClass985.A00(iArr11, iArr11);
                int i7 = 1;
                do {
                    AnonymousClass985.A00(iArr11, iArr11);
                    i7++;
                } while (i7 < 50);
                AnonymousClass983.A00(iArr10, iArr11, iArr10);
                AnonymousClass985.A00(iArr10, iArr10);
                AnonymousClass985.A00(iArr10, iArr10);
                AnonymousClass983.A00(iArr9, iArr10, iArr9);
                AnonymousClass983.A00(iArr9, iArr9, iArr3);
                AnonymousClass983.A00(iArr9, iArr9, iArr);
                AnonymousClass985.A00(iArr4, iArr9);
                AnonymousClass983.A00(iArr4, iArr4, iArr2);
                AnonymousClass986.A00(iArr5, iArr4, iArr);
                byte[] bArr11 = new byte[32];
                AnonymousClass987.A00(bArr11, iArr5);
                byte[] bArr12 = AnonymousClass9A3.A00;
                int i8 = 0;
                byte b = 0;
                do {
                    b |= bArr11[i8] ^ bArr12[i8];
                    i8++;
                } while (i8 < 32);
                if (b != 0) {
                    AnonymousClass980.A00(iArr5, iArr4, iArr);
                    byte[] bArr13 = new byte[32];
                    AnonymousClass987.A00(bArr13, iArr5);
                    int i9 = 0;
                    byte b2 = 0;
                    do {
                        b2 |= bArr13[i9] ^ bArr12[i9];
                        i9++;
                    } while (i9 < 32);
                    if (b2 == 0) {
                        AnonymousClass983.A00(iArr9, iArr9, C190849An.A01);
                    }
                }
                byte[] bArr14 = new byte[32];
                AnonymousClass987.A00(bArr14, iArr9);
                if ((bArr14[0] & 1) == ((bArr3[31] >>> 7) & 1)) {
                    AnonymousClass984.A00(iArr9, iArr9);
                }
                AnonymousClass983.A00(r3.A00, iArr9, iArr7);
                AnonymousClass604 r4 = r28;
                byte[] bArr15 = bArr10;
                r4.A00(new byte[64], bArr15, 32);
                System.arraycopy(bArr15, 0, bArr4, 0, 32);
                byte[] bArr16 = bArr9;
                System.arraycopy(bArr16, 0, bArr5, 0, 32);
                System.arraycopy(bArr16, 32, bArr6, 0, 32);
                byte[] bArr17 = bArr;
                System.arraycopy(bArr9, 0, bArr17, 0, (int) j2);
                System.arraycopy(bArr4, 0, bArr17, 32, 32);
                byte[] bArr18 = bArr7;
                r4.A00(bArr18, bArr17, j2);
                C200519hX.A01(bArr7);
                byte[] bArr19 = new byte[256];
                byte[] bArr20 = new byte[256];
                AnonymousClass9M2[] r11 = new AnonymousClass9M2[8];
                int i10 = 0;
                do {
                    r11[i10] = new AnonymousClass9M2();
                    i10++;
                } while (i10 < 8);
                AnonymousClass9M3 r8 = new AnonymousClass9M3();
                AnonymousClass9M4 r7 = new AnonymousClass9M4();
                AnonymousClass9M4 r42 = new AnonymousClass9M4();
                C196889ah.A00(bArr19, bArr18);
                C196889ah.A00(bArr20, bArr6);
                AnonymousClass9M2 r0 = r11[0];
                C196899ai.A00(r0, r3);
                AnonymousClass98D.A00(r8, r3);
                AnonymousClass98B.A00(r8, r42);
                AnonymousClass988.A00(r0, r8, r42);
                AnonymousClass98B.A00(r8, r7);
                A01(r8, r7, r42, r11, 1);
                A01(r8, r7, r42, r11, 2);
                A01(r8, r7, r42, r11, 3);
                A01(r8, r7, r42, r11, 4);
                A01(r8, r7, r42, r11, 5);
                A01(r8, r7, r42, r11, 6);
                C196899ai.A00(r11[7], r7);
                int[] iArr13 = r24.A00;
                int[] iArr14 = iArr13;
                iArr13[0] = 0;
                C165597tg.A1P(iArr14);
                int[] iArr15 = r24.A01;
                int[] iArr16 = iArr15;
                iArr15[0] = 1;
                C165597tg.A1P(iArr16);
                int[] iArr17 = r24.A02;
                int[] iArr18 = iArr17;
                iArr17[0] = 1;
                C165597tg.A1P(iArr18);
                int i11 = 255;
                while (true) {
                    if (bArr19[i11] == 0 && bArr20[i11] == 0) {
                        i11--;
                        if (i11 < 0) {
                            break;
                        }
                    }
                }
                do {
                    AnonymousClass98C.A00(r8, r24);
                    byte b3 = bArr19[i11];
                    if (b3 > 0) {
                        AnonymousClass98B.A00(r8, r7);
                        AnonymousClass988.A00(r11[b3 / 2], r8, r7);
                    } else if (b3 < 0) {
                        AnonymousClass98B.A00(r8, r7);
                        AnonymousClass9M2 r6 = r11[(-b3) / 2];
                        int[] iArr19 = new int[10];
                        int[] iArr20 = r8.A01;
                        int[] iArr21 = r7.A02;
                        int[] iArr22 = r7.A01;
                        AnonymousClass980.A00(iArr20, iArr21, iArr22);
                        int[] iArr23 = r8.A02;
                        AnonymousClass986.A00(iArr23, iArr21, iArr22);
                        int[] iArr24 = r8.A03;
                        AnonymousClass983.A00(iArr24, iArr20, r6.A01);
                        AnonymousClass983.A00(iArr23, iArr23, r6.A02);
                        int[] iArr25 = r8.A00;
                        AnonymousClass983.A00(iArr25, r6.A00, r7.A00);
                        AnonymousClass983.A00(iArr20, r7.A03, r6.A03);
                        AnonymousClass980.A00(iArr19, iArr20, iArr20);
                        AnonymousClass986.A00(iArr20, iArr24, iArr23);
                        AnonymousClass980.A00(iArr23, iArr24, iArr23);
                        AnonymousClass986.A00(iArr24, iArr19, iArr25);
                        AnonymousClass980.A00(iArr25, iArr19, iArr25);
                    }
                    byte b4 = bArr20[i11];
                    if (b4 > 0) {
                        AnonymousClass98B.A00(r8, r7);
                        AnonymousClass989.A00(r8, r7, C196889ah.A00[b4 / 2]);
                    } else if (b4 < 0) {
                        AnonymousClass98B.A00(r8, r7);
                        C197819cQ r02 = C196889ah.A00[(-b4) / 2];
                        int[] iArr26 = new int[10];
                        int[] iArr27 = r8.A01;
                        int[] iArr28 = r7.A02;
                        int[] iArr29 = r7.A01;
                        AnonymousClass980.A00(iArr27, iArr28, iArr29);
                        int[] iArr30 = r8.A02;
                        AnonymousClass986.A00(iArr30, iArr28, iArr29);
                        int[] iArr31 = r8.A03;
                        AnonymousClass983.A00(iArr31, iArr27, r02.A01);
                        AnonymousClass983.A00(iArr30, iArr30, r02.A02);
                        int[] iArr32 = r8.A00;
                        AnonymousClass983.A00(iArr32, r02.A00, r7.A00);
                        int[] iArr33 = r7.A03;
                        AnonymousClass980.A00(iArr26, iArr33, iArr33);
                        AnonymousClass986.A00(iArr27, iArr31, iArr30);
                        AnonymousClass980.A00(iArr30, iArr31, iArr30);
                        AnonymousClass986.A00(iArr31, iArr26, iArr32);
                        AnonymousClass980.A00(iArr32, iArr26, iArr32);
                    }
                    AnonymousClass98A.A00(r8, r24);
                    i11--;
                } while (i11 >= 0);
                int[] iArr34 = new int[10];
                int[] iArr35 = new int[10];
                int[] iArr36 = new int[10];
                AnonymousClass982.A00(iArr34, iArr18);
                AnonymousClass983.A00(iArr35, iArr14, iArr34);
                AnonymousClass983.A00(iArr36, iArr16, iArr34);
                AnonymousClass987.A00(bArr8, iArr36);
                byte b5 = bArr8[31];
                byte[] bArr21 = new byte[32];
                AnonymousClass987.A00(bArr21, iArr35);
                C165607th.A1R(bArr8, b5, (bArr21[0] & 1) << 7, 31);
                int i12 = 0;
                byte b6 = 0;
                do {
                    b6 |= bArr8[i12] ^ bArr5[i12];
                    i12++;
                } while (i12 < 32);
                if (b6 == 0) {
                    System.arraycopy(bArr17, 64, bArr17, 0, (int) (j - 64));
                    return 0;
                }
            }
        }
        return -1;
    }

    public static void A01(AnonymousClass9M3 r1, AnonymousClass9M4 r2, AnonymousClass9M4 r3, AnonymousClass9M2[] r4, int i) {
        AnonymousClass9M2 r0 = r4[i];
        C196899ai.A00(r0, r2);
        AnonymousClass988.A00(r0, r1, r3);
        AnonymousClass98B.A00(r1, r2);
    }
}
