package X;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.5ZX  reason: invalid class name */
public abstract class AnonymousClass5ZX {
    public static PublicKey A00() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder("payment_bio_key_alias", 4).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(0, 2);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(-1);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(true);
            }
            instance.initialize(userAuthenticationRequired.build());
            return instance.generateKeyPair().getPublic();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("FingerprintHelper/generateKey generateKey: api=");
            throw C90524aI.A0e(C36381kD.A10(A0u, Build.VERSION.SDK_INT), e);
        }
    }
}
