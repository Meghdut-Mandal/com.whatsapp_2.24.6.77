package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;

/* renamed from: X.9hL  reason: invalid class name and case insensitive filesystem */
public class C200399hL implements C22965AzH {
    public Object A00;
    public final int A01;

    public C200399hL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BcL(C202059ky r4) {
        if (this.A01 != 0) {
            IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = (IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel) this.A00;
            if (r4 == null) {
                C165597tg.A1E(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A08, indiaUpiPaymentTransactionConfirmationBottomSheetViewModel, 6);
            } else {
                C36341k9.A16(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0F.A00, 3);
            }
        } else {
            C178848hw.A1I(r4, (C178848hw) this.A00, false);
        }
    }
}
