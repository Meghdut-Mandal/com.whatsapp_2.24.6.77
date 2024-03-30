package X;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

/* renamed from: X.6UE  reason: invalid class name */
public abstract class AnonymousClass6UE {
    public static String A00() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder A0u = AnonymousClass000.A0u();
        int i = 0;
        do {
            C90514aH.A1R("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}", A0u, secureRandom.nextInt(76));
            i++;
        } while (i < 50);
        return A0u.toString();
    }

    public static KeyPair A04() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
        instance.initialize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        return instance.generateKeyPair();
    }

    public static PublicKey A05(String str) {
        if (str.startsWith("-----BEGIN PUBLIC KEY-----\n") && str.endsWith("\n-----END PUBLIC KEY-----\n")) {
            return C90464aC.A0l(Base64.decode(str.substring(26, str.length() - 26), 2));
        }
        throw new InvalidKeySpecException("malformed string");
    }

    public static String A01(KeyPair keyPair) {
        String A02 = A02(keyPair.getPublic());
        AnonymousClass00C.A08(A02);
        return A02;
    }

    public static String A02(PublicKey publicKey) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("-----BEGIN PUBLIC KEY-----\n");
        A0u.append(C36441kJ.A13(publicKey.getEncoded()));
        return AnonymousClass000.A0q("\n-----END PUBLIC KEY-----\n", A0u);
    }

    public static KeyPair A03() {
        KeyPair A04 = A04();
        AnonymousClass00C.A0B(A04);
        return A04;
    }
}
