package X;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.6Xa  reason: invalid class name and case insensitive filesystem */
public class C133166Xa {
    public Cipher A00 = Cipher.getInstance("AES/CBC/PKCS5Padding");

    public static byte[] A03(String str) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(DefaultCrypto.UTF_8));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
        }
        return messageDigest.digest();
    }

    public static String A01(String str, String str2) {
        String[] split = str.split("\\|");
        byte[] decode = Base64.decode(split[0], 2);
        byte[] decode2 = Base64.decode(str2, 2);
        Cipher A19 = C90514aH.A19();
        C90504aG.A1P(C90494aF.A0m(decode2), A19, Base64.decode(split[1], 2));
        return new String(A19.doFinal(decode));
    }

    public static SecretKey A02(String str) {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"GCM"}).setUserAuthenticationRequired(false).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            return instance.generateKey();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw C90524aI.A0e("Failed to create symmetric key ", e);
        }
    }

    public static String A00(Boolean bool, String str) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(1, 999);
        KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        if (Build.VERSION.SDK_INT >= 23) {
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 12);
            if (Build.VERSION.SDK_INT >= 30) {
                builder.setUserAuthenticationParameters(15, 3);
            } else {
                builder.setUserAuthenticationValidityDurationSeconds(15);
            }
            instance3.initialize(builder.setKeySize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH).setKeyValidityStart(instance.getTime()).setKeyValidityEnd(instance2.getTime()).setDigests(new String[]{"SHA-512"}).setUserAuthenticationRequired(bool.booleanValue()).setSignaturePaddings(new String[]{"PSS"}).setCertificateSubject(new X500Principal("CN=NPCI_CERT")).setCertificateSerialNumber(BigInteger.ONE).build());
        }
        KeyPair genKeyPair = instance3.genKeyPair();
        PrivateKey privateKey = genKeyPair.getPrivate();
        if (((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware()) {
            return C36441kJ.A13(genKeyPair.getPublic().getEncoded());
        }
        throw new InvalidKeySpecException("TEE is unavailable");
    }

    public static byte[] A04(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec A0m = C90494aF.A0m(bArr2);
        Cipher A19 = C90514aH.A19();
        A19.init(1, A0m, new GCMParameterSpec(128, bArr3));
        return A19.doFinal(bArr);
    }

    public static byte[] A05(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec A0m = C90494aF.A0m(bArr2);
        Cipher A19 = C90514aH.A19();
        A19.init(2, A0m, new GCMParameterSpec(128, bArr3));
        return A19.doFinal(bArr);
    }
}
