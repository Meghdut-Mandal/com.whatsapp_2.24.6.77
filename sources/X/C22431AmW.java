package X;

import com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity;

/* renamed from: X.AmW  reason: case insensitive filesystem */
public final class C22431AmW extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BrazilPaymentPixOnboardingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22431AmW(BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity) {
        super(1);
        this.this$0 = brazilPaymentPixOnboardingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        if (!str.equals("loaded") && str.equals("dismissed")) {
            BrazilPaymentPixOnboardingActivity.A01(this.this$0);
        }
        return AnonymousClass0AJ.A00;
    }
}
