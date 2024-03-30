package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;

/* renamed from: X.6x5  reason: invalid class name and case insensitive filesystem */
public class C147356x5 implements C23029B1a {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;

    public C147356x5(IndiaUpiQrTabActivity indiaUpiQrTabActivity) {
        this.A00 = indiaUpiQrTabActivity;
    }

    public void BW0() {
        this.A00.finish();
    }

    public void BkQ(String str) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        indiaUpiQrTabActivity.A3D("IndiaUpiPaymentTransactionConfirmationFragment");
        Intent A0H = C36441kJ.A0H(indiaUpiQrTabActivity, IndiaUpiPaymentTransactionDetailsActivity.class);
        A0H.putExtra("extra_transaction_id", str);
        A0H.putExtra("referral_screen", "payments_transaction_confirmation");
        A0H.putExtra("extra_payment_flow_entry_point", "qr_code_scan_prompt");
        A0H.putExtra("extra_action_bar_display_close", true);
        A0H.putExtra("extra_open_transaction_confirmation_fragment", false);
        A0H.setFlags(67108864);
        indiaUpiQrTabActivity.A33(A0H, true);
    }
}
