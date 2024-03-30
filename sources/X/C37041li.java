package X;

import android.os.CountDownTimer;
import com.whatsapp.registration.timers.RetryCodeCountdownTimersViewModel;

/* renamed from: X.1li  reason: invalid class name and case insensitive filesystem */
public final class C37041li extends CountDownTimer {
    public final /* synthetic */ C001700s A00;
    public final /* synthetic */ RetryCodeCountdownTimersViewModel A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37041li(C001700s r3, RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel, String str, long j) {
        super(j, 1000);
        this.A01 = retryCodeCountdownTimersViewModel;
        this.A02 = str;
        this.A00 = r3;
    }

    public void onFinish() {
        this.A01.A03.put(this.A02, C36411kG.A0t());
        this.A00.A0C("complete");
    }

    public void onTick(long j) {
        String str;
        Long valueOf = Long.valueOf(j);
        RetryCodeCountdownTimersViewModel retryCodeCountdownTimersViewModel = this.A01;
        retryCodeCountdownTimersViewModel.A03.put(this.A02, valueOf);
        C001700s r3 = retryCodeCountdownTimersViewModel.A01;
        long A0S = retryCodeCountdownTimersViewModel.A0S("sms");
        long A0S2 = retryCodeCountdownTimersViewModel.A0S("voice");
        long j2 = Long.MAX_VALUE;
        if (A0S < 0) {
            A0S = Long.MAX_VALUE;
        }
        if (A0S2 < 0) {
            A0S2 = Long.MAX_VALUE;
        }
        if (A0S > A0S2) {
            A0S = A0S2;
        }
        AnonymousClass12U r2 = retryCodeCountdownTimersViewModel.A02;
        if (r2.A00() == 15) {
            str = "wa_old";
        } else {
            if (r2.A00() == 17) {
                str = "email_otp";
            }
            r3.A0C(Long.valueOf(A0S));
        }
        long A0S3 = retryCodeCountdownTimersViewModel.A0S(str);
        if (A0S3 >= 0) {
            j2 = A0S3;
        }
        if (A0S > j2) {
            A0S = j2;
        }
        r3.A0C(Long.valueOf(A0S));
    }
}
