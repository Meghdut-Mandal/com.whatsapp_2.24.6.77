package X;

import java.security.SecureRandom;

/* renamed from: X.AaD  reason: case insensitive filesystem */
public class C21780AaD implements C23060B2g {
    public SecureRandom A00 = null;

    public int B0e(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = (byte) (length - i);
        while (i < length - 1) {
            SecureRandom secureRandom = this.A00;
            bArr[i] = secureRandom == null ? 0 : (byte) secureRandom.nextInt();
            i++;
        }
        bArr[i] = b;
        return b;
    }

    public void BKN(SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }

    public int BlA(byte[] bArr) {
        int length = bArr.length;
        byte b = bArr[length - 1] & 255;
        if (b <= length) {
            return b;
        }
        throw new C22696At0("pad block corrupted");
    }
}
