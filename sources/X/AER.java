package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;

public class AER implements B1J {
    public final /* synthetic */ String A00;
    public final /* synthetic */ BrazilPaymentActivity A01;

    public AER(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A01 = brazilPaymentActivity;
        this.A00 = str;
    }

    public void BTB(C175798b4 r4) {
        Log.i("PAY: BrazilPaymentActivity BrazilGetVerificationMethods - onCardVerified");
        this.A01.A0P.A01().A04(new AnonymousClass96A(this, 5), r4);
    }

    public void BfN(C202059ky r12, List list) {
        int i;
        C20810yC r7;
        AE9 ae9;
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        brazilPaymentActivity.Bnv();
        if (r12 == null) {
            if (list == null || list.isEmpty()) {
                brazilPaymentActivity.A0M.A06("error_code", (long) 0, brazilPaymentActivity.A00);
                ae9 = brazilPaymentActivity.A09;
                r7 = brazilPaymentActivity.A0D;
                i = R.string.f12nameremoved;
                ae9.A01(brazilPaymentActivity, r7, brazilPaymentActivity.A0I, 0, i).show();
            }
            int A04 = C165587tf.A04(brazilPaymentActivity, list);
            JSONArray A02 = brazilPaymentActivity.A08.A02(list);
            if (A02 != null && !C201269jE.A01(list)) {
                int A07 = BrazilPayBloksActivity.A07(list);
                C21669AUm A0R = C165597tg.A0R(brazilPaymentActivity.A0D, list, A04, A07);
                String str = this.A00;
                String obj = A02.toString();
                C175798b4 r72 = (C175798b4) C165617ti.A0O(brazilPaymentActivity.A0P).A07(str);
                if (r72 != null) {
                    Intent A03 = brazilPaymentActivity.A0Q.A03(brazilPaymentActivity, r72, A0R, obj, A07);
                    C1025050g.A01(A03, "referral_screen", "verify_to_pay");
                    brazilPaymentActivity.BuO(A03, 1);
                    return;
                }
                return;
            }
        }
        C36321k7.A1T("PAY: BrazilGetVerificationMethods Error: ", AnonymousClass000.A0u(), 0);
        brazilPaymentActivity.A0M.A06("error_code", (long) 0, brazilPaymentActivity.A00);
        ae9 = brazilPaymentActivity.A09;
        r7 = brazilPaymentActivity.A0D;
        i = R.string.f12nameremoved;
        ae9.A01(brazilPaymentActivity, r7, brazilPaymentActivity.A0I, 0, i).show();
    }
}
