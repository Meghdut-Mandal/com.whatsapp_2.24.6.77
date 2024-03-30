package X;

import java.util.Arrays;
import java.util.Random;

public class A05 implements B3L {
    public final Random A00;
    public final int[] A01;
    public final int[] A02;

    public B3L B2y() {
        return new A05(new Random(this.A00.nextLong()), new int[0]);
    }

    public B3L B2z(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            Random random = this.A00;
            iArr[i3] = random.nextInt(this.A02.length + 1);
            int i4 = i3 + 1;
            int nextInt = random.nextInt(i4);
            iArr2[i3] = iArr2[nextInt];
            iArr2[nextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.A02;
        int length = iArr3.length + i2;
        int[] iArr4 = new int[length];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (i5 >= i2 || i6 != iArr[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr3[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = iArr4[i7] + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr2[i5];
                i5++;
            }
        }
        return new A05(new Random(this.A00.nextLong()), iArr4);
    }

    public B3L B30(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = this.A02;
        int length = iArr.length;
        int[] iArr2 = new int[(length - i3)];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (iArr[i5] < i || iArr[i5] >= i2) {
                int i6 = i5 - i4;
                int i7 = iArr[i5];
                if (i7 >= i) {
                    i7 -= i3;
                }
                iArr2[i6] = i7;
            } else {
                i4++;
            }
        }
        return new A05(new Random(this.A00.nextLong()), iArr2);
    }

    public int BBt() {
        int[] iArr = this.A02;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public int BDQ() {
        int[] iArr = this.A02;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public int BEV(int i) {
        int i2 = this.A01[i] + 1;
        int[] iArr = this.A02;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public int BGD(int i) {
        int i2 = this.A01[i] - 1;
        if (i2 >= 0) {
            return this.A02[i2];
        }
        return -1;
    }

    public int getLength() {
        return this.A02.length;
    }

    public A05(Random random, int[] iArr) {
        this.A02 = iArr;
        this.A00 = random;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        this.A01 = iArr2;
        for (int i = 0; i < length; i++) {
            iArr2[iArr[i]] = i;
        }
    }
}
