package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

public class AH0 implements AnonymousClass4TR {
    public final /* synthetic */ AnonymousClass16X A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ C206349tD A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AH0(AnonymousClass16X r1, BrazilPaymentActivity brazilPaymentActivity, C206349tD r3, String str, String str2) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = r3;
    }

    public void BWY() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        brazilPaymentActivity.A05.A0L(brazilPaymentActivity.getString(R.string.f12nameremoved), brazilPaymentActivity.getString(R.string.f12nameremoved), 1);
    }

    public void BZ8() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        AnonymousClass16X r1 = this.A00;
        boolean z = brazilPaymentActivity.A0e;
        brazilPaymentActivity.A3y(r1, this.A02, this.A03, this.A04, z);
    }
}
