package X;

import java.security.SecureRandom;

/* renamed from: X.Aa8  reason: case insensitive filesystem */
public class C21775Aa8 implements C23060B2g {
    public int B0e(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length - i;
        byte b = Byte.MIN_VALUE;
        while (true) {
            bArr[i] = b;
            i++;
            if (i >= length) {
                return i2;
            }
            b = 0;
        }
    }

    public void BKN(SecureRandom secureRandom) {
    }

    public int BlA(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        do {
            length--;
            if (length <= 0 || bArr[length] != 0) {
            }
            length--;
            break;
        } while (bArr[length] != 0);
        if (bArr[length] == Byte.MIN_VALUE) {
            return i - length;
        }
        throw new C22696At0("pad block corrupted");
    }
}
