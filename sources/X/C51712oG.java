package X;

import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.registration.email.VerifyEmail;
import com.whatsapp.util.Log;

/* renamed from: X.2oG  reason: invalid class name and case insensitive filesystem */
public class C51712oG implements B11 {
    public Object A00;
    public final int A01;

    public C51712oG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXO(Integer num, Long l) {
        C19650wI r3;
        Runnable r2;
        int i = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i != 0) {
            A0u.append("VerifyEmail/executeSendEmailOtpRequest/onFailure/code: ");
            A0u.append(num);
            C36321k7.A1J(l, "; waitTime: ", A0u);
            VerifyEmail verifyEmail = (VerifyEmail) this.A00;
            r3 = verifyEmail.A3j();
            r2 = new AnonymousClass737(verifyEmail, num, l, 0);
        } else {
            A0u.append("VerifyEmailActivity/executeSendEmailOtpRequest/onFailure/code: ");
            A0u.append(num);
            C36321k7.A1J(l, "; waitTime: ", A0u);
            VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A00;
            r3 = verifyEmailActivity.A08;
            if (r3 != null) {
                r2 = new C80403vL(verifyEmailActivity, num, l, 35);
            } else {
                throw C36331k8.A0d("mainThreadHandler");
            }
        }
        r3.Bp3(r2);
    }

    public void Bi1(long j) {
        C19650wI r3;
        Runnable r2;
        if (this.A01 != 0) {
            Log.i("VerifyEmail/executeSendEmailOtpRequest/onSuccess");
            VerifyEmail verifyEmail = (VerifyEmail) this.A00;
            r3 = verifyEmail.A3j();
            r2 = C81143wX.A00(verifyEmail, 45);
        } else {
            Log.i("VerifyEmailActivity/executeSendEmailOtpRequest/onSuccess/");
            VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A00;
            r3 = verifyEmailActivity.A08;
            if (r3 != null) {
                r2 = new C81113wU((Object) verifyEmailActivity, 46);
            } else {
                throw C36331k8.A0d("mainThreadHandler");
            }
        }
        r3.Bp3(r2);
    }
}
