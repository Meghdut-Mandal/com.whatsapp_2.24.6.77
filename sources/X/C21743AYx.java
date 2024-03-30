package X;

import javax.crypto.SecretKey;

/* renamed from: X.AYx  reason: case insensitive filesystem */
public class C21743AYx implements SecretKey {
    public final C23053B1z converter;
    public final char[] password;

    public C21743AYx(C23053B1z b1z, char[] cArr) {
        this.password = AnonymousClass124.A03(cArr);
        this.converter = b1z;
    }

    public String getAlgorithm() {
        return "PBKDF2";
    }

    public byte[] getEncoded() {
        C23053B1z b1z = this.converter;
        char[] cArr = this.password;
        if (((C22825Awa) b1z).A00 == 0) {
            if (cArr == null) {
                return new byte[0];
            }
            int length = cArr.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i = C165617ti.A07(bArr, cArr[i], i)) {
            }
            return bArr;
        } else if (cArr != null) {
            return AnonymousClass11q.A04(cArr);
        } else {
            return new byte[0];
        }
    }

    public String getFormat() {
        if (((C22825Awa) this.converter).A00 != 0) {
            return "UTF8";
        }
        return "ASCII";
    }
}
