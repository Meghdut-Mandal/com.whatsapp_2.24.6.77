package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

public final /* synthetic */ class AGZ implements C22979AzV {
    public final /* synthetic */ IndiaUpiPaymentSettingsFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AGZ(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, PaymentBottomSheet paymentBottomSheet, boolean z) {
        this.A00 = indiaUpiPaymentSettingsFragment;
        this.A01 = paymentBottomSheet;
        this.A02 = z;
    }

    public final void BUc(String str) {
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A01;
        boolean z = this.A02;
        paymentBottomSheet.A1b();
        String str2 = str;
        if (z || indiaUpiPaymentSettingsFragment.A0C.A0O()) {
            IndiaUpiPaymentSettingsFragment.A08(indiaUpiPaymentSettingsFragment, "settingsAddPayment", str2, 2, 5, z, true);
        } else {
            IndiaUpiPaymentSettingsFragment.A07(indiaUpiPaymentSettingsFragment, str);
        }
    }
}
