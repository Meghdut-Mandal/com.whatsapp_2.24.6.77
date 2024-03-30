package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.7u6  reason: invalid class name and case insensitive filesystem */
public class C165757u6 extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ C195529Uq A00;

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public C165757u6(C195529Uq r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A00();
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        C132626Uo r3;
        IdentityCredential A01;
        if (authenticationResult != null) {
            BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            r3 = null;
            if (cryptoObject != null) {
                Cipher cipher = cryptoObject.getCipher();
                if (cipher != null) {
                    r3 = new C132626Uo(cipher);
                } else {
                    Signature signature = cryptoObject.getSignature();
                    if (signature != null) {
                        r3 = new C132626Uo(signature);
                    } else {
                        Mac mac = cryptoObject.getMac();
                        if (mac != null) {
                            r3 = new C132626Uo(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && (A01 = AnonymousClass6Fu.A01(cryptoObject)) != null) {
                            r3 = new C132626Uo(A01);
                        }
                    }
                }
            }
        } else {
            r3 = null;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = AnonymousClass93E.A00(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.A00.A02(new AnonymousClass9G0(r3, i2));
    }
}
