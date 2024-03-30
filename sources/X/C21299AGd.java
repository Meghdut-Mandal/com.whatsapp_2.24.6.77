package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.AGd  reason: case insensitive filesystem */
public class C21299AGd implements C23029B1a {
    public final /* synthetic */ IndiaUpiPaymentSettingsActivity A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public C21299AGd(IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = indiaUpiPaymentSettingsActivity;
        this.A01 = paymentBottomSheet;
    }

    public void BW0() {
        this.A00.A3D("IndiaUpiPaymentTransactionConfirmationFragment");
    }

    public void BkQ(String str) {
        IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = this.A00;
        indiaUpiPaymentSettingsActivity.A3D("IndiaUpiPaymentTransactionConfirmationFragment");
        Intent A0H = C36441kJ.A0H(indiaUpiPaymentSettingsActivity, IndiaUpiPaymentTransactionDetailsActivity.class);
        A0H.putExtra("extra_transaction_id", str);
        A0H.putExtra("referral_screen", "payments_transaction_confirmation");
        A0H.putExtra("extra_payment_flow_entry_point", "qr_code_scan_prompt");
        A0H.putExtra("extra_open_transaction_confirmation_fragment", false);
        A0H.setFlags(67108864);
        indiaUpiPaymentSettingsActivity.startActivity(A0H);
    }
}
