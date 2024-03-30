package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

/* renamed from: X.AEt  reason: case insensitive filesystem */
public class C21263AEt implements B1S {
    public final /* synthetic */ IndiaUpiPaymentTransactionDetailsActivity A00;

    public C21263AEt(IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity) {
        this.A00 = indiaUpiPaymentTransactionDetailsActivity;
    }

    public void BVz(boolean z) {
        IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = this.A00;
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = indiaUpiPaymentTransactionDetailsActivity.A06;
        if (indiaUpiDobPickerBottomSheet != null) {
            indiaUpiDobPickerBottomSheet.A1c();
        }
        indiaUpiPaymentTransactionDetailsActivity.finish();
    }

    public void BWg(C202059ky r4) {
        IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = this.A00;
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = indiaUpiPaymentTransactionDetailsActivity.A06;
        if (indiaUpiDobPickerBottomSheet != null) {
            indiaUpiDobPickerBottomSheet.A1c();
        }
        if (!indiaUpiPaymentTransactionDetailsActivity.A04.A00(indiaUpiPaymentTransactionDetailsActivity, r4) && r4.A00 == 10755) {
            indiaUpiPaymentTransactionDetailsActivity.Btm(PaymentsUnavailableDialogFragment.A03());
        }
    }
}
