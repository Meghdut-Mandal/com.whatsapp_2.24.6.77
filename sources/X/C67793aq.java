package X;

import android.os.CountDownTimer;
import com.whatsapp.R;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.3aq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67793aq implements AnonymousClass04S {
    public final /* synthetic */ VerifyPhoneNumber A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C67793aq(VerifyPhoneNumber verifyPhoneNumber, String str) {
        this.A00 = verifyPhoneNumber;
        this.A01 = str;
    }

    public final void BTH(Object obj) {
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        String str = this.A01;
        if (Objects.equals(obj, "complete")) {
            if (str.equals("sms") && AnonymousClass3PP.A00(verifyPhoneNumber)) {
                verifyPhoneNumber.A3k(1);
            }
            if (verifyPhoneNumber.A1S) {
                verifyPhoneNumber.A0W.setClickable(true);
                C36351kA.A15(verifyPhoneNumber.getResources(), verifyPhoneNumber.A0W, C224514j.A00(verifyPhoneNumber.A0W.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                verifyPhoneNumber.A1B.A03(8);
            }
            RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = verifyPhoneNumber.A11;
            Map map = retryCodeCountdownTimersViewModel.A05;
            CountDownTimer countDownTimer = (CountDownTimer) map.get(str);
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            map.remove(str);
            retryCodeCountdownTimersViewModel.A03.remove(str);
        }
    }
}
