package X;

import android.util.Log;
import androidx.biometric.BiometricFragment;
import java.util.concurrent.Executor;

/* renamed from: X.3FW  reason: invalid class name */
public class AnonymousClass3FW {
    public AnonymousClass01z A00;

    public void A00() {
        String str;
        AnonymousClass01z r1 = this.A00;
        if (r1 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else {
            BiometricFragment biometricFragment = (BiometricFragment) r1.A0N("androidx.biometric.BiometricFragment");
            if (biometricFragment == null) {
                str = "Unable to cancel authentication. BiometricFragment not found.";
            } else {
                biometricFragment.A1a(3);
                return;
            }
        }
        Log.e("BiometricPromptCompat", str);
    }

    public void A01(C193769Mu r4) {
        String str;
        if (r4 != null) {
            AnonymousClass01z r2 = this.A00;
            if (r2 == null) {
                str = "Unable to start authentication. Client fragment manager was null.";
            } else if (r2.A0r()) {
                str = "Unable to start authentication. Called after onSaveInstanceState().";
            } else {
                BiometricFragment biometricFragment = (BiometricFragment) r2.A0N("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    biometricFragment = new BiometricFragment();
                    C36381kD.A1F(biometricFragment, r2, "androidx.biometric.BiometricFragment");
                    r2.A0T();
                }
                biometricFragment.A1c(r4);
                return;
            }
            Log.e("BiometricPromptCompat", str);
            return;
        }
        throw AnonymousClass001.A08("PromptInfo cannot be null.");
    }

    public AnonymousClass3FW(AnonymousClass3HL r4, AnonymousClass01I r5, Executor executor) {
        if (executor != null) {
            AnonymousClass01z supportFragmentManager = r5.getSupportFragmentManager();
            C167717yg r0 = (C167717yg) C36441kJ.A0b(r5).A00(C167717yg.class);
            this.A00 = supportFragmentManager;
            if (r0 != null) {
                r0.A0H = executor;
                r0.A04 = r4;
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("Executor must not be null.");
    }
}
