package X;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.626  reason: invalid class name */
public class AnonymousClass626 {
    public final KeyStore A00;
    public final C24611Dc A01 = C24611Dc.A00("Secp256r1KeyStoreHelper", "infra", "COMMON");

    public KeyPair A00() {
        try {
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("alias-payments-br-trusted-device-key", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeySize(256).setDigests(new String[]{"SHA-256"}).build();
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            instance.initialize(build);
            return instance.generateKeyPair();
        } catch (Exception e) {
            this.A01.A0A("", e);
            return null;
        }
    }

    public AnonymousClass626(KeyStore keyStore) {
        this.A00 = keyStore;
    }
}
