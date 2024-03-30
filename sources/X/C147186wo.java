package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.6wo  reason: invalid class name and case insensitive filesystem */
public class C147186wo implements B1F {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ PaymentIncentiveViewModel A01;

    public C147186wo(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        this.A01 = paymentIncentiveViewModel;
        this.A00 = userJid;
    }

    public void BWY() {
        Log.e("PAY: PaymentIncentiveViewModel/syncIncentiveData/on-error");
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        C121835tn.A00(paymentIncentiveViewModel.A00, paymentIncentiveViewModel.A06.A01(), C90514aH.A0s("Failed syncing incentive"), 1);
    }

    public void Bi7(AnonymousClass6O3 r6) {
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A01;
        UserJid userJid = this.A00;
        C001700s r4 = paymentIncentiveViewModel.A00;
        int A012 = PaymentIncentiveViewModel.A01(userJid, paymentIncentiveViewModel);
        AnonymousClass1YQ r0 = paymentIncentiveViewModel.A06;
        C121835tn.A00(r4, new AnonymousClass6O3(r0.A02(), r0.A03(), A012), (Throwable) null, 0);
    }
}
