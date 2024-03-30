package X;

import java.util.Arrays;

public final class AUZ implements Cloneable {
    public int A00;
    public int[] A01;

    public static void A00(AUZ auz, int i) {
        int[] iArr = auz.A01;
        int length = iArr.length;
        if (i > (length << 5)) {
            int[] iArr2 = new int[((i + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            auz.A01 = iArr2;
        }
    }

    public void A01(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw AnonymousClass001.A08("Num bits must be between 0 and 32");
        }
        A00(this, this.A00 + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            A02(z);
            i2--;
        }
    }

    public void A02(boolean z) {
        A00(this, this.A00 + 1);
        if (z) {
            int[] iArr = this.A01;
            int i = this.A00;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.A00++;
    }

    public boolean A03(int i) {
        if (((1 << (i & 31)) & this.A01[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return new AUZ((int[]) this.A01.clone(), this.A00);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AUZ) {
            AUZ auz = (AUZ) obj;
            if (this.A00 != auz.A00 || !Arrays.equals(this.A01, auz.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        int i = this.A00;
        StringBuilder A0h = C90524aI.A0h((i / 8) + i + 1);
        for (int i2 = 0; i2 < i; i2++) {
            if ((i2 & 7) == 0) {
                A0h.append(' ');
            }
            char c = '.';
            if (A03(i2)) {
                c = 'X';
            }
            A0h.append(c);
        }
        return A0h.toString();
    }

    public AUZ(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public AUZ() {
        this.A00 = 0;
        this.A01 = new int[1];
    }
}
