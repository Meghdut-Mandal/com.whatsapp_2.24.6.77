package X;

import com.facebook.msys.mci.DefaultCrypto;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.5ao  reason: invalid class name and case insensitive filesystem */
public abstract class C110525ao {
    public static byte[] A00(byte[] bArr, byte[] bArr2) {
        Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
        instance.init(new SecretKeySpec(bArr2, DefaultCrypto.HMAC_SHA256));
        return instance.doFinal(bArr);
    }
}
