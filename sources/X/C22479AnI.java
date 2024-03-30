package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet;

/* renamed from: X.AnI  reason: case insensitive filesystem */
public final class C22479AnI extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ WaButtonWithLoader $addPixAccountCta;
    public final /* synthetic */ BrazilPaymentMethodAddPixBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22479AnI(WaButtonWithLoader waButtonWithLoader, BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet) {
        super(1);
        this.$addPixAccountCta = waButtonWithLoader;
        this.this$0 = brazilPaymentMethodAddPixBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        if (A0I == 1) {
            this.$addPixAccountCta.A02();
        } else if (A0I == 2) {
            BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet = this.this$0;
            AnonymousClass17Y r2 = brazilPaymentMethodAddPixBottomSheet.A01;
            if (r2 != null) {
                r2.A0H(new AVX(brazilPaymentMethodAddPixBottomSheet, 21));
                this.$addPixAccountCta.A01();
            } else {
                throw C36331k8.A0d("globalUI");
            }
        } else if (A0I == 3) {
            this.this$0.A1b();
        }
        return AnonymousClass0AJ.A00;
    }
}
