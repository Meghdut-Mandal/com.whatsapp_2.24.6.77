package X;

import com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity;

/* renamed from: X.4lf  reason: invalid class name and case insensitive filesystem */
public class C95524lf extends AnonymousClass04N {
    public final /* synthetic */ MerchantPayoutTransactionHistoryActivity A00;
    public final /* synthetic */ C194199Om A01;

    public C95524lf(MerchantPayoutTransactionHistoryActivity merchantPayoutTransactionHistoryActivity, C194199Om r2) {
        this.A01 = r2;
        this.A00 = merchantPayoutTransactionHistoryActivity;
    }

    public AnonymousClass04R B3o(Class cls) {
        if (cls.isAssignableFrom(C95454l5.class)) {
            MerchantPayoutTransactionHistoryActivity merchantPayoutTransactionHistoryActivity = this.A00;
            C194199Om r0 = this.A01;
            C19970wo r2 = r0.A06;
            C19770wU r7 = r0.A0T;
            return new C95454l5(merchantPayoutTransactionHistoryActivity, r2, r0.A08, r0.A0C, r0.A0R, r0.A0S, r7);
        }
        throw AnonymousClass001.A08("Invalid viewModel");
    }
}
