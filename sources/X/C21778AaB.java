package X;

import java.security.SecureRandom;

/* renamed from: X.AaB  reason: case insensitive filesystem */
public class C21778AaB implements C23060B2g {
    public int B0e(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length - i;
        while (i < length) {
            bArr[i] = 0;
            i++;
        }
        return i2;
    }

    public void BKN(SecureRandom secureRandom) {
    }

    public int BlA(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return i - length;
    }
}
