package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.6Ua  reason: invalid class name and case insensitive filesystem */
public class C132506Ua {
    public Cipher A00 = Cipher.getInstance("AES/CBC/PKCS5Padding");

    public static byte[] A00(String str, String str2) {
        byte[] A01 = AnonymousClass6HS.A01(str2.getBytes());
        MessageDigest A0s = C90504aG.A0s();
        A0s.update(A01);
        return A0s.digest(str.getBytes(DefaultCrypto.UTF_8));
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec A0m = C90494aF.A0m(bArr2);
        Cipher A19 = C90514aH.A19();
        A19.init(1, A0m, new GCMParameterSpec(128, bArr3));
        return A19.doFinal(bArr);
    }
}
