package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.6Fv  reason: invalid class name and case insensitive filesystem */
public abstract class C129206Fv {
    public static BiometricPrompt.CryptoObject A00(C132626Uo r3) {
        IdentityCredential A00;
        if (r3 != null) {
            Cipher cipher = r3.A01;
            if (cipher != null) {
                return AnonymousClass6QP.A01(cipher);
            }
            Signature signature = r3.A00;
            if (signature != null) {
                return AnonymousClass6QP.A00(signature);
            }
            Mac mac = r3.A02;
            if (mac != null) {
                return AnonymousClass6QP.A02(mac);
            }
            if (Build.VERSION.SDK_INT >= 30 && (A00 = r3.A00()) != null) {
                return AnonymousClass6Fu.A00(A00);
            }
        }
        return null;
    }

    public static C132626Uo A01() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder A00 = C132486Tx.A00();
            C132486Tx.A02(A00);
            C132486Tx.A03(A00);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance2.init(C132486Tx.A01(A00));
            instance2.generateKey();
            Key key = instance.getKey("androidxBiometric", (char[]) null);
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, key);
            return new C132626Uo(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }
}
