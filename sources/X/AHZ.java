package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

public final /* synthetic */ class AHZ implements C22990Azg {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AHZ(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }

    public final void BmO(C203399nx r6) {
        C203399nx A0c;
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        String str = this.A01;
        C203399nx A0c2 = r6.A0c("pay");
        if (A0c2 != null && (A0c = A0c2.A0c("card")) != null) {
            brazilPaymentActivity.A0P.A01().A05(AAM.A00, C175898bF.A02(brazilPaymentActivity.A06, new AnonymousClass8b7(), A0c), str);
        }
    }
}
