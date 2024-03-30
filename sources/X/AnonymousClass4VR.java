package X;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.authentication.FingerprintView;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.entercode.EnterCodeViewModel;

/* renamed from: X.4VR  reason: invalid class name */
public class AnonymousClass4VR extends CountDownTimer {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4VR(Object obj, int i, long j, long j2) {
        super(j2, 1000);
        this.A02 = i;
        this.A01 = obj;
        this.A00 = j;
    }

    public void onFinish() {
        switch (this.A02) {
            case 0:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A01;
                fingerprintBottomSheet.A08 = null;
                if (this.A00 <= C19970wo.A00(fingerprintBottomSheet.A1h())) {
                    FingerprintBottomSheet.A0A(fingerprintBottomSheet);
                    return;
                }
                return;
            case 1:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A01;
                CountDownTimer countDownTimer = verifyTwoFactorAuth.A06;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    verifyTwoFactorAuth.A06 = null;
                }
                verifyTwoFactorAuth.A0C.setEnabled(true);
                verifyTwoFactorAuth.A07.setProgress(100);
                verifyTwoFactorAuth.A08.setVisibility(4);
                TextView textView = verifyTwoFactorAuth.A08;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1J(objArr, 6);
                C36341k9.A0s(verifyTwoFactorAuth, textView, objArr, R.string.f12nameremoved);
                C36341k9.A0u(verifyTwoFactorAuth.getPreferences(0).edit(), "code_retry_time");
                return;
            case 2:
                EnterCodeViewModel enterCodeViewModel = (EnterCodeViewModel) this.A01;
                enterCodeViewModel.A00 = null;
                enterCodeViewModel.A04.A0C("complete");
                C36331k8.A13(enterCodeViewModel.A02);
                AnonymousClass3LA r0 = enterCodeViewModel.A01;
                if (r0 == null) {
                    throw C36331k8.A0d("verifyPhoneNumberPrefs");
                }
                r0.A04();
                return;
            default:
                C39711tN r1 = (C39711tN) this.A01;
                r1.A00 = null;
                r1.A02.A0C("complete");
                return;
        }
    }

    public void onTick(long j) {
        switch (this.A02) {
            case 0:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A01;
                FingerprintView A03 = fingerprintBottomSheet.A03;
                if (A03 != null) {
                    String A0q = C36401kF.A0q(fingerprintBottomSheet, AnonymousClass3UY.A07(fingerprintBottomSheet.A1i(), C36391kE.A0B(j)), AnonymousClass001.A0L(), 0, R.string.f12nameremoved);
                    AnonymousClass00C.A08(A0q);
                    A03.A02(A0q);
                    return;
                }
                return;
            case 1:
                ProgressBar progressBar = ((VerifyTwoFactorAuth) this.A01).A07;
                long j2 = this.A00;
                progressBar.setProgress((int) ((((double) (j2 - j)) * 100.0d) / ((double) j2)));
                return;
            case 2:
                C001700s r6 = ((EnterCodeViewModel) this.A01).A03;
                long j3 = this.A00;
                r6.A0C(Double.valueOf((((double) (j3 - j)) * 100.0d) / ((double) j3)));
                return;
            default:
                C001700s r3 = ((C39711tN) this.A01).A01;
                Boolean bool = (Boolean) r3.A04();
                if (bool == null) {
                    bool = C36381kD.A0j();
                }
                if (!bool.booleanValue() && j - this.A00 <= 500) {
                    C36341k9.A18(r3, true);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4VR(EnterCodeViewModel enterCodeViewModel, long j) {
        super(j, 1000);
        this.A02 = 2;
        this.A00 = j;
        this.A01 = enterCodeViewModel;
    }
}
