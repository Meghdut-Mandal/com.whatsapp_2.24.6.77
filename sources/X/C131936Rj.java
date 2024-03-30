package X;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.6Rj  reason: invalid class name and case insensitive filesystem */
public abstract class C131936Rj {
    public static Set A00 = Collections.singleton("Crypto");
    public static final Set A01;

    public static Object A00(Object obj, String str, String str2) {
        if (Build.VERSION.SDK_INT < 28) {
            Iterator it = A01.iterator();
            while (true) {
                if (!it.hasNext()) {
                    A00.contains(str2);
                    break;
                }
                String A0C = AnonymousClass001.A0C(it);
                try {
                    if (!A0C.equals(str2)) {
                        if (obj instanceof SecureRandom) {
                            return SecureRandom.getInstance(str, A0C);
                        }
                        if (obj instanceof Cipher) {
                            return Cipher.getInstance(str, A0C);
                        }
                        if (obj instanceof KeyGenerator) {
                            return KeyGenerator.getInstance(str, A0C);
                        }
                        throw AnonymousClass001.A08("Unknown instance type");
                    }
                } catch (IllegalArgumentException | NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException e) {
                    e.getMessage();
                }
            }
        }
        return obj;
    }

    public static SecureRandom A01() {
        if (Build.VERSION.SDK_INT >= 26) {
            return SecureRandom.getInstanceStrong();
        }
        SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
        return (SecureRandom) A00(instance, "SHA1PRNG", instance.getProvider().getName());
    }

    static {
        LinkedHashSet A17 = C36441kJ.A17();
        A01 = A17;
        A17.add("GmsCore_OpenSSL");
        A17.add("AndroidOpenSSL");
    }
}
