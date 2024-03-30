package X;

import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

/* renamed from: X.B9y  reason: case insensitive filesystem */
public class C23216B9y implements C22955Az7 {
    public Object A00;
    public final int A01;

    public C23216B9y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BcP(C207249un r6, C203399nx r7) {
        if (this.A01 != 0) {
            PaymentMerchantAccountViewModel paymentMerchantAccountViewModel = (PaymentMerchantAccountViewModel) this.A00;
            AnonymousClass00C.A0D(paymentMerchantAccountViewModel, 0);
            paymentMerchantAccountViewModel.A0T(false);
            return;
        }
        C178888i4 r4 = (C178888i4) this.A00;
        C24611Dc r3 = r4.A0K;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("paymentMethodNotificationObserver is called ");
        boolean z = true;
        C165577te.A1E(r3, A0u, AnonymousClass000.A1V(r6));
        if (r4.A04 != null) {
            z = false;
        }
        r4.A3j(r6, z);
    }
}
