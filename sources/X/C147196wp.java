package X;

import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.6wp  reason: invalid class name and case insensitive filesystem */
public class C147196wp implements B1F {
    public final /* synthetic */ PaymentIncentiveViewModel A00;
    public final /* synthetic */ boolean A01;

    public C147196wp(PaymentIncentiveViewModel paymentIncentiveViewModel, boolean z) {
        this.A00 = paymentIncentiveViewModel;
        this.A01 = z;
    }

    public void BWY() {
        Log.e("PAY: PaymentIncentiveViewModel/syncIncentiveData/on-error");
        if (this.A01) {
            PaymentIncentiveViewModel paymentIncentiveViewModel = this.A00;
            C121835tn.A00(paymentIncentiveViewModel.A01, paymentIncentiveViewModel.A06.A01(), C90514aH.A0s("Failed syncing incentive"), 1);
        }
    }

    public void Bi7(AnonymousClass6O3 r4) {
        if (this.A01) {
            C121835tn.A00(this.A00.A01, r4, (Throwable) null, 0);
        }
    }
}
