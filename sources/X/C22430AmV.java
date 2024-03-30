package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity;
import com.whatsapp.payments.ui.BrazilPixInfoAddedBottomSheet;

/* renamed from: X.AmV  reason: case insensitive filesystem */
public final class C22430AmV extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BrazilPaymentPixOnboardingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22430AmV(BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity) {
        super(1);
        this.this$0 = brazilPaymentPixOnboardingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass000.A0I(obj) == 3) {
            if (AnonymousClass00C.A0J(this.this$0.A00, "in_app_banner") || AnonymousClass00C.A0J(this.this$0.A00, "orders_home_banner")) {
                String str = this.this$0.A00;
                BrazilPixInfoAddedBottomSheet brazilPixInfoAddedBottomSheet = new BrazilPixInfoAddedBottomSheet();
                Bundle A07 = AnonymousClass001.A07();
                A07.putInt("payment_account_type", 6);
                A07.putString("referral_screen", str);
                brazilPixInfoAddedBottomSheet.A17(A07);
                brazilPixInfoAddedBottomSheet.A1g(false);
                C65443Sb.A03(brazilPixInfoAddedBottomSheet, this.this$0.getSupportFragmentManager(), "BrazilPixInfoAddedBottomSheet");
            } else {
                BrazilPaymentPixOnboardingActivity.A01(this.this$0);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
