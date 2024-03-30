package X;

import android.os.CountDownTimer;

/* renamed from: X.1tN  reason: invalid class name and case insensitive filesystem */
public final class C39711tN extends AnonymousClass04R {
    public CountDownTimer A00;
    public final C001700s A01 = C36441kJ.A0Z(C36381kD.A0j());
    public final C001700s A02 = C36441kJ.A0Z("idle");

    public final void A0S() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A00 = null;
        this.A02.A0C("idle");
        C36341k9.A19(this.A01, false);
    }
}
