package X;

import android.os.Handler;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.registration.VerifyCaptcha;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.email.VerifyEmail;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.twofactor.SetCodeFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4Yw  reason: invalid class name and case insensitive filesystem */
public class C90044Yw implements C88294Sd {
    public Object A00;
    public final int A01;

    public C90044Yw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTv(String str) {
        WDSButton wDSButton;
        switch (this.A01) {
            case 0:
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A00;
                verifyTwoFactorAuthCodeDialogFragment.A03.setEnabled(false);
                verifyTwoFactorAuthCodeDialogFragment.A01.setProgress(0);
                Handler handler = verifyTwoFactorAuthCodeDialogFragment.A08;
                handler.removeMessages(0);
                handler.sendMessageDelayed(handler.obtainMessage(0, str), 400);
                return;
            case 1:
                if (str.length() == 6) {
                    VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A00;
                    if (C36431kI.A08(verifyEmailActivity) >= verifyEmailActivity.A01) {
                        wDSButton = verifyEmailActivity.A09;
                        if (wDSButton == null) {
                            throw C36331k8.A0d("verifyBtn");
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 2:
                wDSButton = ((VerifyCaptcha) this.A00).A0S;
                if (wDSButton == null) {
                    throw C36331k8.A0d("captchaSubmitButton");
                }
                break;
            case 3:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A00;
                VerifyTwoFactorAuth.A0G(verifyTwoFactorAuth, verifyTwoFactorAuth.A0C.getCode(), 0, false);
                return;
            case 4:
                if (str.length() == 6) {
                    VerifyEmail verifyEmail = (VerifyEmail) this.A00;
                    if (C36431kI.A08(verifyEmail) >= verifyEmail.A01) {
                        wDSButton = verifyEmail.A0D;
                        if (wDSButton == null) {
                            throw C36331k8.A0d("nextButton");
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 5:
                ((VerifyPhoneNumber) this.A00).A3n(str);
                return;
            default:
                SetCodeFragment setCodeFragment = (SetCodeFragment) this.A00;
                if (setCodeFragment.A08 >= 7) {
                    SetCodeFragment.A03(setCodeFragment);
                    int i = setCodeFragment.A00;
                    if (i == 1) {
                        setCodeFragment.A07.A02 = str;
                    } else if (i == 2) {
                        setCodeFragment.A07.A03 = str;
                    }
                    if (!SetCodeFragment.A05(setCodeFragment, str)) {
                        return;
                    }
                    if (setCodeFragment.A00 != 2 || !setCodeFragment.A07.A3l(setCodeFragment)) {
                        SetCodeFragment.A00(setCodeFragment);
                        return;
                    }
                    return;
                }
                return;
        }
        wDSButton.setEnabled(true);
    }

    public void Bbi(String str) {
        WDSButton wDSButton;
        switch (this.A01) {
            case 0:
                C36391kE.A1K(((VerifyTwoFactorAuthCodeDialogFragment) this.A00).A02);
                return;
            case 1:
                wDSButton = ((VerifyEmailActivity) this.A00).A09;
                if (wDSButton == null) {
                    throw C36331k8.A0d("verifyBtn");
                }
                break;
            case 2:
                VerifyCaptcha verifyCaptcha = (VerifyCaptcha) this.A00;
                WDSButton wDSButton2 = verifyCaptcha.A0S;
                if (wDSButton2 == null) {
                    throw C36331k8.A0d("captchaSubmitButton");
                } else if (wDSButton2.isEnabled()) {
                    wDSButton = verifyCaptcha.A0S;
                    if (wDSButton == null) {
                        throw C36331k8.A0d("captchaSubmitButton");
                    }
                } else {
                    return;
                }
                break;
            case 4:
                wDSButton = ((VerifyEmail) this.A00).A0D;
                if (wDSButton == null) {
                    throw C36331k8.A0d("nextButton");
                }
                break;
            case 6:
                SetCodeFragment setCodeFragment = (SetCodeFragment) this.A00;
                if (setCodeFragment.A08 >= 7) {
                    int i = setCodeFragment.A00;
                    if (i == 1) {
                        setCodeFragment.A07.A02 = str;
                    } else if (i == 2) {
                        setCodeFragment.A07.A03 = str;
                    }
                    C36391kE.A1K(setCodeFragment.A01);
                    SetCodeFragment.A03(setCodeFragment);
                    return;
                }
                return;
            default:
                return;
        }
        wDSButton.setEnabled(false);
    }
}
