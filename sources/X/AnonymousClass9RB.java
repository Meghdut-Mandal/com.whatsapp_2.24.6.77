package X;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: X.9RB  reason: invalid class name */
public class AnonymousClass9RB {
    public C06640Ul A00;
    public BiometricPrompt.AuthenticationCallback A01;
    public final C195529Uq A02;

    public BiometricPrompt.AuthenticationCallback A00() {
        BiometricPrompt.AuthenticationCallback authenticationCallback = this.A01;
        if (authenticationCallback != null) {
            return authenticationCallback;
        }
        C165757u6 A002 = AnonymousClass93D.A00(this.A02);
        this.A01 = A002;
        return A002;
    }

    public AnonymousClass9RB(C195529Uq r1) {
        this.A02 = r1;
    }
}
