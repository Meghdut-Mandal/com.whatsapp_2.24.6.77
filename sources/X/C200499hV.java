package X;

/* renamed from: X.9hV  reason: invalid class name and case insensitive filesystem */
public abstract class C200499hV {
    public static void A00(int[] iArr, int[] iArr2, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            if (i4 < Math.min(30, i)) {
                j |= C165597tg.A0C(iArr[i2]) << i4;
                i4 += 32;
                i2++;
            }
            iArr2[i3] = ((int) j) & 1073741823;
            j >>>= 30;
            i4 -= 30;
            i -= 30;
            i3++;
        }
    }

    public static void A01(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        int i2 = i;
        int i3 = iArr3[0];
        int i4 = iArr3[1];
        int i5 = iArr3[2];
        int i6 = iArr3[3];
        long j = (long) i3;
        long j2 = (long) iArr[0];
        long j3 = (long) i4;
        long j4 = (long) iArr2[0];
        long j5 = (long) i5;
        long j6 = (long) i6;
        long j7 = ((j * j2) + (j3 * j4)) >> 30;
        long j8 = ((j2 * j5) + (j4 * j6)) >> 30;
        for (int i7 = 1; i7 < i2; i7++) {
            long j9 = (long) iArr[i7];
            long j10 = (long) iArr2[i7];
            long j11 = j7 + (j * j9) + (j3 * j10);
            long j12 = j8 + (j9 * j5) + (j10 * j6);
            int i8 = i7 - 1;
            iArr[i8] = ((int) j11) & 1073741823;
            j7 = j11 >> 30;
            iArr2[i8] = 1073741823 & ((int) j12);
            j8 = j12 >> 30;
        }
        int i9 = i - 1;
        iArr[i9] = (int) j7;
        iArr2[i9] = (int) j8;
    }

    public static void A02(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i, int i2) {
        int i3 = iArr3[0];
        int i4 = iArr3[1];
        int i5 = iArr3[2];
        int i6 = iArr3[3];
        int i7 = i;
        int i8 = i - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i3 & i9) + (i4 & i10);
        int i12 = (i9 & i5) + (i10 & i6);
        int i13 = iArr4[0];
        long j = (long) i3;
        long j2 = j;
        long j3 = (long) iArr[0];
        long j4 = j * j3;
        long j5 = (long) i4;
        long j6 = j5;
        long j7 = (long) iArr2[0];
        long j8 = j4 + (j5 * j7);
        long j9 = (long) i5;
        long j10 = j9;
        long j11 = (long) i6;
        long j12 = (j3 * j9) + (j7 * j11);
        long j13 = (long) i13;
        long j14 = (long) (i11 - (((((int) j8) * i2) + i11) & 1073741823));
        long j15 = (long) (i12 - (((((int) j12) * i2) + i12) & 1073741823));
        long j16 = (j8 + (j13 * j14)) >> 30;
        long j17 = (j12 + (j13 * j15)) >> 30;
        for (int i14 = 1; i14 < i7; i14++) {
            int i15 = iArr4[i14];
            long j18 = (long) iArr[i14];
            long j19 = (long) iArr2[i14];
            long j20 = (long) i15;
            long j21 = j16 + (j2 * j18) + (j6 * j19) + (j20 * j14);
            long j22 = j17 + (j18 * j10) + (j19 * j11) + (j20 * j15);
            int i16 = i14 - 1;
            iArr[i16] = ((int) j21) & 1073741823;
            j16 = j21 >> 30;
            iArr2[i16] = ((int) j22) & 1073741823;
            j17 = j22 >> 30;
        }
        iArr[i8] = (int) j16;
        iArr2[i8] = (int) j17;
    }
}
