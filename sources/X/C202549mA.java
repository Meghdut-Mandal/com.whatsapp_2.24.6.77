package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.crypto.Mac;

/* renamed from: X.9mA  reason: invalid class name and case insensitive filesystem */
public class C202549mA {
    public final int A00;
    public final byte[][] A01;

    public static void A00(byte[][] bArr, int i) {
        int length;
        if (i == 0 && (length = bArr.length) > 1) {
            int i2 = 2;
            if (bArr[1].length == 0) {
                while (i2 < length) {
                    if (bArr[i2].length <= 0) {
                        i2++;
                    } else {
                        throw AnonymousClass001.A08("Invalid chain key values for starting iteration");
                    }
                }
                return;
            }
        }
        int i3 = 0;
        while (i3 < bArr.length) {
            if (bArr[i3].length != 0) {
                i3++;
            } else {
                throw AnonymousClass001.A08("Invalid chain key values");
            }
        }
    }

    public C202549mA A02(int i) {
        if (i > 0) {
            int i2 = this.A00;
            int i3 = i + i2;
            int length = this.A01.length;
            int[] A002 = AnonymousClass98F.A00(i2, length);
            int[] A003 = AnonymousClass98F.A00(i3, length);
            byte[][] A03 = A03();
            int i4 = 0;
            while (true) {
                int length2 = A03.length;
                if (i4 >= length2) {
                    return new C202549mA(A03, i3);
                }
                while (A003[i4] > A002[i4]) {
                    if (i4 < length2 - 1 && A003[i4] - 1 == A002[i4]) {
                        int i5 = i4 + 1;
                        A03[i5] = A01(A03[i4], (byte) (i4 + 2 + 1));
                        A002[i5] = 0;
                    }
                    A03[i4] = A01(A03[i4], (byte) (i4 + 2));
                    C165587tf.A1V(A002, i4);
                }
                i4++;
            }
        } else {
            throw AnonymousClass000.A0d("count must be a positive number: ", AnonymousClass000.A0u(), i);
        }
    }

    public byte[][] A03() {
        byte[] bArr;
        byte[][] bArr2 = this.A01;
        int length = bArr2.length;
        byte[][] bArr3 = new byte[length][];
        if (this.A00 == 0 && length > 1 && bArr2[1].length == 0) {
            int i = 0;
            while (i < length - 1) {
                if (i == 0) {
                    bArr = bArr2[0];
                } else {
                    bArr = bArr3[i];
                }
                int i2 = i + 1;
                int i3 = i + 2;
                bArr3[i2] = A01(bArr, (byte) (i3 + 1));
                bArr3[i] = A01(bArr, (byte) i3);
                i = i2;
            }
        } else {
            for (int i4 = 0; i4 < length; i4++) {
                bArr3[i4] = new byte[bArr2[i4].length];
                byte[] bArr4 = bArr2[i4];
                System.arraycopy(bArr4, 0, bArr3[i4], 0, bArr4.length);
            }
        }
        return bArr3;
    }

    public C202549mA(byte[][] bArr, int i) {
        int length = bArr.length;
        if (length == 0 || 32 % length != 0) {
            throw AnonymousClass000.A0d("Invalid number of chain keys: ", AnonymousClass000.A0u(), length);
        }
        A00(bArr, i);
        this.A00 = i;
        this.A01 = bArr;
    }

    public static byte[] A01(byte[] bArr, byte b) {
        try {
            Mac A0q = C165587tf.A0q(bArr);
            A0q.update(b);
            return A0q.doFinal();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public C202549mA(List list) {
        int i;
        if (list.isEmpty() || 32 % list.size() != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36371kC.A1R("Invalid number of chain keys: ", A0u, list);
            throw AnonymousClass001.A08(A0u.toString());
        }
        int size = list.size();
        int[] iArr = new int[size];
        this.A01 = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((C172748Pa) list.get(i2)).iteration_;
            this.A01[i2] = ((C172748Pa) list.get(i2)).seed_.A06();
        }
        int[] iArr2 = new int[size];
        int i3 = 0;
        while (true) {
            i = size - 1;
            if (i3 >= i) {
                break;
            }
            iArr2[i3] = iArr[i3] - 1;
            i3++;
        }
        iArr2[i] = iArr[i];
        int i4 = 32 / size;
        int i5 = (int) ((1 << i4) - 1);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += (iArr2[(size - i7) - 1] & i5) << (i4 * i7);
        }
        this.A00 = i6;
        A00(this.A01, i6);
    }

    public C202549mA(byte[] bArr) {
        int i = 1 << 3;
        this.A00 = 0;
        byte[][] bArr2 = new byte[i][];
        this.A01 = bArr2;
        bArr2[0] = bArr;
        for (int i2 = 1; i2 < i; i2++) {
            bArr2[i2] = new byte[0];
        }
    }
}
