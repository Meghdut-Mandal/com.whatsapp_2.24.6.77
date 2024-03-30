package X;

import android.os.Build;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.61A  reason: invalid class name */
public class AnonymousClass61A {
    public final AnonymousClass77V A00 = new AnonymousClass77V(C1508777c.A00);

    public AnonymousClass00I A00() {
        KeyPair generateKeyPair;
        boolean z;
        AnonymousClass626 r2 = (AnonymousClass626) this.A00.get();
        if (Build.VERSION.SDK_INT < 23 || r2 == null || (generateKeyPair = r2.A00()) == null) {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            generateKeyPair = instance.generateKeyPair();
            z = false;
        } else {
            z = true;
        }
        return C36441kJ.A0W(generateKeyPair, Boolean.valueOf(z));
    }
}
