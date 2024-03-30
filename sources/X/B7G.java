package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

public class B7G extends C61233Bb {
    public Object A00;
    public final int A01;

    public B7G(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        C79593ty r3;
        C25711Hj r2;
        AnonymousClass17Y r0;
        switch (this.A01) {
            case 0:
                BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
                brazilPaymentActivity.A03.A0E();
                brazilPaymentActivity.A03 = AnonymousClass9YB.A00(brazilPaymentActivity.A0P);
                return;
            case 1:
                ConfirmReceivePaymentFragment confirmReceivePaymentFragment = (ConfirmReceivePaymentFragment) this.A00;
                C79593ty r02 = confirmReceivePaymentFragment.A00;
                if (r02 != null) {
                    r02.A0E();
                }
                confirmReceivePaymentFragment.A00 = AnonymousClass9YB.A00(confirmReceivePaymentFragment.A03);
                return;
            case 2:
                HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = (HybridPaymentMethodPickerFragment) this.A00;
                AnonymousClass1EU r03 = hybridPaymentMethodPickerFragment.A09;
                if (r03 != null) {
                    r3 = AnonymousClass9YB.A00(r03);
                    r2 = new C23209B9r(hybridPaymentMethodPickerFragment, this, 8);
                    r0 = hybridPaymentMethodPickerFragment.A00;
                    if (r0 == null) {
                        throw C36331k8.A0d("globalUI");
                    }
                } else {
                    throw C36331k8.A0d("paymentsManager");
                }
                break;
            case 3:
                C179098jA r5 = (C179098jA) this.A00;
                r5.A4Q(r5.A09, "ConfirmPaymentFragment");
                AVX avx = new AVX(this, 38);
                r5.Bu1(R.string.f12nameremoved);
                r5.A04.Boy(new AnonymousClass752(r5, avx, 29, true));
                return;
            case 4:
                C178848hw r22 = (C178848hw) this.A00;
                C183418ql r1 = r22.A0J;
                if (r1 != null) {
                    r1.A0D(true);
                    r22.A0J = null;
                }
                if (C173858Tk.A0x(r22)) {
                    C183418ql r12 = new C183418ql(r22);
                    r22.A0J = r12;
                    C36331k8.A1F(r12, r22.A04);
                    return;
                }
                return;
            case 5:
                PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = (PaymentMethodsListPickerFragment) this.A00;
                r3 = AnonymousClass9YB.A00(paymentMethodsListPickerFragment.A03);
                r2 = new C23207B9p(this, 9);
                r0 = paymentMethodsListPickerFragment.A00;
                break;
            default:
                PaymentMerchantAccountViewModel paymentMerchantAccountViewModel = (PaymentMerchantAccountViewModel) this.A00;
                paymentMerchantAccountViewModel.A0T(false);
                paymentMerchantAccountViewModel.A04.Bp1(new C1497372o(paymentMerchantAccountViewModel, 10));
                return;
        }
        r3.A0B(r2, r0.A04);
    }
}
