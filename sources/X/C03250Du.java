package X;

import android.hardware.fingerprint.FingerprintManager;

/* renamed from: X.0Du  reason: invalid class name and case insensitive filesystem */
public class C03250Du extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ C06640Ul A00;

    public C03250Du(C06640Ul r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A00();
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        this.A00.A02(i, charSequence);
    }

    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.A00.A03(new AnonymousClass0SH(C07610Yn.A03(C07660Yt.A01(authenticationResult))));
    }
}
