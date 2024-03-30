package X;

import com.whatsapp.util.Log;

/* renamed from: X.3lG  reason: invalid class name and case insensitive filesystem */
public final class C74223lG implements B10 {
    public final /* synthetic */ AnonymousClass1DY A00;
    public final /* synthetic */ C006302t A01;

    public C74223lG(AnonymousClass1DY r1, C006302t r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BXN(Integer num) {
        C36321k7.A1J(num, "EmailVerificationManager/maybeCallGetEmailRequestAndUpdateEmailSharedPrefsAfterReg/onFailure/error code: ", AnonymousClass000.A0u());
        C19420v0 r1 = this.A00.A01;
        r1.A1X((String) null);
        r1.A23(false);
        this.A01.invoke(0);
    }

    public void BiF(String str, boolean z) {
        C36321k7.A1X("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/onSuccess/emailVerified: ", AnonymousClass000.A0u(), z);
        C19420v0 r0 = this.A00.A01;
        r0.A1X(str);
        r0.A23(z);
        C006302t r2 = this.A01;
        int i = 1;
        if (str == null || str.length() == 0) {
            Log.i("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/email does not exist");
            i = 2;
        } else {
            Log.i("EmailVerificationManager/maybeShowRegistrationEmailCaptureScreenAfterRegName/email exists");
        }
        r2.invoke(Integer.valueOf(i));
    }
}
