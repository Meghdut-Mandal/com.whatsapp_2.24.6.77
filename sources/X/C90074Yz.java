package X;

import com.whatsapp.email.EmailVerificationActivity;

/* renamed from: X.4Yz  reason: invalid class name and case insensitive filesystem */
public class C90074Yz implements B10 {
    public Object A00;
    public final int A01;

    public C90074Yz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXN(Integer num) {
        int i = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i != 0) {
            C36321k7.A1J(num, "EmailVerificationManager/maybeCallGetEmailRequestAndUpdateEmailSharedPrefsAfterReg/onFailure/error code: ", A0u);
            C19420v0 r1 = ((AnonymousClass1DY) this.A00).A01;
            r1.A1X((String) null);
            r1.A23(false);
            return;
        }
        C36321k7.A1J(num, "EmailVerificationActivity/executeGetEmailCall/onFailure/error code: ", A0u);
        EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) this.A00;
        C19650wI r2 = emailVerificationActivity.A06;
        if (r2 != null) {
            r2.Bp3(new C81193wc(emailVerificationActivity, num, 31));
            return;
        }
        throw C36331k8.A0d("mainThreadHandler");
    }

    public void BiF(String str, boolean z) {
        int i = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i != 0) {
            C36321k7.A1X("EmailVerificationManager/maybeCallGetEmailRequestAndUpdateEmailSharedPrefsAfterReg/onSuccess/emailVerified: ", A0u, z);
            C19420v0 r0 = ((AnonymousClass1DY) this.A00).A01;
            r0.A1X(str);
            r0.A23(z);
            return;
        }
        C36321k7.A1X("EmailVerificationActivity/executeGetEmailCall/onSuccess/emailVerified: ", A0u, z);
        EmailVerificationActivity emailVerificationActivity = (EmailVerificationActivity) this.A00;
        C19650wI r2 = emailVerificationActivity.A06;
        if (r2 != null) {
            r2.Bp3(new C80383vJ(emailVerificationActivity, str, 3, z));
            return;
        }
        throw C36331k8.A0d("mainThreadHandler");
    }
}
