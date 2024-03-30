package X;

import android.content.SharedPreferences;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.3Gd  reason: invalid class name and case insensitive filesystem */
public final class C62433Gd {
    public static int A04;
    public final SharedPreferences A00;
    public final AnonymousClass3PP A01;
    public final C37141ls A02;
    public final AnonymousClass3LA A03;

    public C62433Gd(SharedPreferences sharedPreferences, C19970wo r3, AnonymousClass3PP r4, C37141ls r5) {
        C36331k8.A1G(r3, 1, sharedPreferences);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = sharedPreferences;
        this.A03 = new AnonymousClass3LA(sharedPreferences, r3);
    }

    public static void A00(VerifyPhoneNumber verifyPhoneNumber) {
        verifyPhoneNumber.A15.A02(0);
    }

    public final void A01() {
        Log.i("VerificationStateManager/resetAllVerificationState");
        A02(0);
        C37141ls r2 = this.A02;
        if (r2.hasMessages(1)) {
            r2.removeMessages(1);
        }
        AnonymousClass3LA r1 = this.A03;
        r1.A06("voice");
        r1.A06("sms");
        r1.A06("wa_old");
        r1.A06("email_otp");
        r1.A04();
        this.A01.A01.A00();
    }

    public final void A02(int i) {
        A04 = i;
        C36341k9.A0v(this.A00.edit(), "com.whatsapp.registration.VerifyPhoneNumber.verification_state", A04);
    }
}
