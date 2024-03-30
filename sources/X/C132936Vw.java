package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;

/* renamed from: X.6Vw  reason: invalid class name and case insensitive filesystem */
public abstract class C132936Vw {
    public static final Set A00 = C36421kH.A0g(new String[]{"123qwe", "1q2w3e4r", "1qaz2wsx", "Football", "Million2", "aa123456", "aaron431", "abc123", "access", "admin", "adobe123[a]", "ashley", "azerty", "bailey", "baseball", "batman", "charlie", "donald", "dragon", "flower", "football", "freedom", "hello", "hottie", "iloveyou", "jesus", "letmein", "login", "lovely", "loveme", "master", "michael", "monkey", "mustang", "ninja", "passw0rd", "password", "password1", "photoshop[a]", "picture1", "princess", "qazwsx", "qqww1122", "qwerty", "qwerty123", "qwertyuiop", "senha", "shadow", "solo", "starwars", "sunshine", "superman", "trustno1", "welcome", "whatever", "zaq1zaq1"});
    public static final String[] A01 = {"MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAjlh/7UEoTs3y0teyqbR70frEsSnRhkj1hYQS7oa26GlzDtsXrmlCMMdMHfYQsjGouKQ8JCsejtdw8FIIwt1aoaaS5IXtHFsE9rDbL6oROYU4g5TDvi9wZdm4/Q/hEUIopeymVl7LZvJh8LR+l5CsTyoSV0A8aED1e0vaFYN//6RGeNffdt1E86cficxTASORnl7V7QYksZehmvksPlqxzKq/N/2qQnqsSZgZGa2soMc+lxt4TW9JlBTkI3PJVvXdE4ZKiC56I4zDiTTT4rStp9ZA0rznVCN2jhZPBeXHHhUsvtDCTHPv/M83VGurWJmPdw0cf4FZzhTEvp1d7MzZb6+DRTlHQonj8p8NR/sAQBNm9KqzmKqbyPbe8AC6lljt+AvO1/XbxWKzChvXFH7zVbXfxjclm7dsXANgXGeCYGNsm4gHHxy4GcNaX1Vq1d3Q1n+aG5z+ks9BNNpvMX0V6mKQ+UZReCCqPbeP4p7lKN0e97xE/tAUSjPgZGnCcBFHAgMBAAE=", "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEA3jL8MW8+0NAy4RqiB8w57xRQOzZ9xSOJXDiOL0ycf1rOFjHVNvNRECKKf+9yEKFjD/lZLVx33/4vHHykqQW6mS1MH3eenw2du/hG9EKRWCaezIwgqxwYhhZbdDQ7SiM88LUcZxKBZLYgmgfLzJYQD0ycTcaH5VKvye6cpV2P2y3e/eiCSamybQplygLJtS54+mXWZ5cAbfI89WNwFeofXkXF9r6N0zJOvz03GweZQjzcN55xonfLErECMLM4F5MuPNdzLsaWb275A19NDTlcuppbXtqkOA6ZXKOGIwtLekCElv3/L+Xe4i2OkclXJYAQ2oBBm6onW24afaR4Yea5FhBlNsXkPgZ2CuC2k3diabqRAbVDH9c2RrExgH7FYamLeOiE2W/EtWJEEZthRDciXMHgoWr9ZzQNof3ZdSauV3rUHB5FaXQhLP1qA+JS7F/634PogKk0NlO/4qrFKeG6sIiNyRFmbE0I+RTitK8pvJHz7JNDGmTxIRCiDXBZDQ7RAgMBAAE="};

    public static boolean A02(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            AnonymousClass604 r4 = new AnonymousClass604();
            int length = bArr2.length;
            int length2 = bArr.length;
            int i = length + length2;
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr2, 0, bArr4, 0, length);
            System.arraycopy(bArr, 0, bArr4, length, length2);
            return AnonymousClass98E.A00(r4, new byte[i], bArr4, bArr3, (long) i) == 0;
        } catch (AnonymousClass78O | IllegalArgumentException e) {
            Log.e("EncryptedBackupUtils/verifyEd25519SignatureAgainstKey/exception.", e);
        }
    }

    public static boolean A01(byte[] bArr, byte[] bArr2) {
        String[] strArr = A01;
        int i = 0;
        do {
            byte[] decode = Base64.decode(strArr[i], 0);
            try {
                Signature instance = Signature.getInstance("SHA256withRSA");
                instance.initVerify(C90464aC.A0l(decode));
                instance.update(bArr);
                if (instance.verify(bArr2)) {
                    return true;
                }
            } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e) {
                Log.e("EncryptedBackupUtils/verifySignature/exception.", e);
            }
            i++;
        } while (i < 2);
        return false;
    }

    public static int A00(String str) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return 0;
        }
        if (trim.codePointCount(0, trim.length()) < 6) {
            return 1;
        }
        if (!trim.matches(".*\\p{L}+.*")) {
            return 2;
        }
        if (A00.contains(trim) || SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equalsIgnoreCase(trim) || TextUtils.isEmpty(trim)) {
            return 3;
        }
        String trim2 = trim.trim();
        int codePointCount = trim2.codePointCount(0, trim2.length());
        if (codePointCount < 3) {
            return 3;
        }
        HashSet hashSet = new HashSet(3);
        int i = 0;
        do {
            if (hashSet.add(Integer.valueOf(trim2.codePointAt(i))) && hashSet.size() >= 3) {
                return 4;
            }
            i++;
        } while (i < codePointCount);
        return 3;
    }

    public static byte[] A03(byte[] bArr, byte[] bArr2) {
        PublicKey A0l = C90464aC.A0l(bArr2);
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        instance.init(1, A0l);
        return instance.doFinal(bArr);
    }
}
