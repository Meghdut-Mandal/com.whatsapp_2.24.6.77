package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;

public class AEQ implements B1J {
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A00;

    public AEQ(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity) {
        this.A00 = brazilPaymentCardDetailsActivity;
    }

    public void BTB(C175798b4 r3) {
        Log.i("PAY: BrazilPaymentCardDetailsActivity BrazilGetVerificationMethods - onCardVerified");
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.Bnv();
        AnonymousClass9YB.A01(brazilPaymentCardDetailsActivity.A09.A01(), r3, this, 16);
    }

    public void BfN(C202059ky r9, List list) {
        int i;
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.Bnv();
        if (r9 == null) {
            if (list != null && !list.isEmpty()) {
                int A04 = C165587tf.A04(brazilPaymentCardDetailsActivity, list);
                JSONArray A02 = brazilPaymentCardDetailsActivity.A03.A02(list);
                if (A02 != null && !C201269jE.A01(list)) {
                    int A07 = BrazilPayBloksActivity.A07(list);
                    Intent A03 = brazilPaymentCardDetailsActivity.A0C.A03(brazilPaymentCardDetailsActivity, (C175798b4) brazilPaymentCardDetailsActivity.A04, C165597tg.A0R(brazilPaymentCardDetailsActivity.A0D, list, A04, A07), A02.toString(), A07);
                    C1025050g.A01(A03, "referral_screen", "payment_method_details");
                    brazilPaymentCardDetailsActivity.BuO(A03, 1);
                    return;
                }
            }
            i = 0;
        } else {
            int i2 = r9.A00;
            if (i2 == 443 || i2 == 10229 || (list != null && !list.isEmpty())) {
                i = r9.A00;
            } else {
                i = -233;
            }
        }
        C36321k7.A1T("PAY: BrazilGetVerificationMethods Error: ", AnonymousClass000.A0u(), i);
        brazilPaymentCardDetailsActivity.A04.A01(brazilPaymentCardDetailsActivity, brazilPaymentCardDetailsActivity.A0D, brazilPaymentCardDetailsActivity.A07, i, R.string.f12nameremoved).show();
    }
}
