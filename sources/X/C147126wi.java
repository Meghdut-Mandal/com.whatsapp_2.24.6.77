package X;

import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.6wi  reason: invalid class name and case insensitive filesystem */
public final class C147126wi implements AnonymousClass1XD {
    public final /* synthetic */ PaymentMerchantAccountViewModel A00;

    public C147126wi(PaymentMerchantAccountViewModel paymentMerchantAccountViewModel) {
        this.A00 = paymentMerchantAccountViewModel;
    }

    public void Bf1(AnonymousClass9KX r5) {
        Log.i("PAY: BusinessHubViewModel unlinkMerchantAccount/onResponseSuccess");
        ((C001600r) this.A00.A08.getValue()).A0C(new C121835tn((Object) null, (Throwable) null, 0));
    }

    public void Bes(C202059ky r5) {
        StringBuilder A0i = C36341k9.A0i(r5);
        A0i.append("PAY: BusinessHubViewModel unlinkMerchantAccount/onRequestError paymentNetworkError: [");
        A0i.append(r5.A00);
        A0i.append("] ");
        C36321k7.A1Z(A0i, r5.A06);
        C121835tn.A00((C001600r) this.A00.A08.getValue(), (Object) null, C90514aH.A0s(r5.A06), 1);
    }

    public void Bf0(C202059ky r5) {
        StringBuilder A0i = C36341k9.A0i(r5);
        A0i.append("PAY: BusinessHubViewModel unlinkMerchantAccount/onRequestError paymentNetworkError: [");
        A0i.append(r5.A00);
        A0i.append("] ");
        C36321k7.A1Z(A0i, r5.A06);
        C121835tn.A00((C001600r) this.A00.A08.getValue(), (Object) null, C90514aH.A0s(r5.A06), 1);
    }
}
