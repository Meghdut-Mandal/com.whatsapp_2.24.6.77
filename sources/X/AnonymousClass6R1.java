package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.6R1  reason: invalid class name */
public abstract class AnonymousClass6R1 {
    public static C121555tK A00(byte[] bArr) {
        int length = bArr.length;
        if (length == 80) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 16, bArr3, 0, 32);
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 48, bArr4, 0, 32);
            return new C121555tK(bArr3, bArr4, bArr2);
        }
        throw C90524aI.A0Y(AnonymousClass000.A0r("Invalid length of derived secret; length=", AnonymousClass000.A0u(), length));
    }

    public static Cipher A01(byte[] bArr, byte[] bArr2, int i) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, C90494aF.A0m(bArr2), new IvParameterSpec(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public static Mac A02(byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(bArr2, DefaultCrypto.HMAC_SHA256));
            instance.update(bArr);
            return instance;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }
}
