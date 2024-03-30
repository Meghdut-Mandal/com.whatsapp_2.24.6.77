package X;

import java.security.Permission;
import java.security.SecureRandom;

/* renamed from: X.AaC  reason: case insensitive filesystem */
public class C21779AaC implements C23060B2g {
    public SecureRandom A00;

    public int B0e(byte[] bArr, int i) {
        int length = bArr.length;
        byte b = (byte) (length - i);
        while (i < length - 1) {
            i = C165617ti.A07(bArr, this.A00.nextInt(), i);
        }
        bArr[i] = b;
        return b;
    }

    public int BlA(byte[] bArr) {
        int length = bArr.length;
        byte b = bArr[length - 1] & 255;
        if (b <= length) {
            return b;
        }
        throw new C22696At0("pad block corrupted");
    }

    public void BKN(SecureRandom secureRandom) {
        Permission permission = C201939kk.A03;
        if (secureRandom == null) {
            secureRandom = C201939kk.A00();
        }
        this.A00 = secureRandom;
    }
}
