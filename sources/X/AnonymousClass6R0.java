package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.6R0  reason: invalid class name */
public abstract class AnonymousClass6R0 {
    public static byte[] A00(byte[] bArr, byte[] bArr2, int i) {
        try {
            return A01(C110525ao.A00(bArr, new byte[32]), bArr2, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2, int i) {
        try {
            int ceil = (int) Math.ceil(((double) i) / 32.0d);
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            for (int i2 = 1; i2 < ceil + 1; i2++) {
                Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
                instance.init(new SecretKeySpec(bArr, DefaultCrypto.HMAC_SHA256));
                instance.update(bArr3);
                if (bArr2 != null) {
                    instance.update(bArr2);
                }
                instance.update((byte) i2);
                bArr3 = instance.doFinal();
                int min = Math.min(i, bArr3.length);
                A0Q.write(bArr3, 0, min);
                i -= min;
            }
            return A0Q.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            return A01(C110525ao.A00(bArr, bArr2), bArr3, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }
}
