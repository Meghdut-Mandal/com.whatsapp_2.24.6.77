package com.whatsapp.registration.entercode;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass3LA;
import X.AnonymousClass4VR;
import X.C001700s;
import X.C19970wo;
import X.C28201Rs;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36441kJ;
import android.os.CountDownTimer;

public final class EnterCodeViewModel extends AnonymousClass04R {
    public CountDownTimer A00;
    public AnonymousClass3LA A01;
    public final C001700s A02 = C36441kJ.A0Z(C36381kD.A0j());
    public final C001700s A03 = C36441kJ.A0Z(Double.valueOf(0.0d));
    public final C28201Rs A04 = new C28201Rs("idle");
    public final C19970wo A05;

    public EnterCodeViewModel(C19970wo r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A05 = r3;
    }

    public final void A0S() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A00 = null;
        this.A04.A0C("idle");
        this.A03.A0C(Double.valueOf(0.0d));
        C36341k9.A19(this.A02, false);
    }

    public final void A0T(long j) {
        A0S();
        if (j < 1000) {
            AnonymousClass3LA r0 = this.A01;
            if (r0 == null) {
                throw C36331k8.A0d("verifyPhoneNumberPrefs");
            }
            r0.A04();
            return;
        }
        C36331k8.A13(this.A02);
        this.A03.A0C(Double.valueOf(0.0d));
        this.A04.A0C("running");
        AnonymousClass3LA r02 = this.A01;
        if (r02 == null) {
            throw C36331k8.A0d("verifyPhoneNumberPrefs");
        }
        C36341k9.A0w(r02.A00.edit(), "com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time", System.currentTimeMillis() + j);
        this.A00 = new AnonymousClass4VR(this, j).start();
    }
}
