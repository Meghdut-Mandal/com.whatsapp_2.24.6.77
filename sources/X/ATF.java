package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class ATF implements C25711Hj {
    public final /* synthetic */ AnonymousClass16X A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ ATF(AnonymousClass16X r1, BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void accept(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        AnonymousClass16X r5 = this.A00;
        String str = this.A02;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C175888bE r0 = (C175888bE) C165607th.A0S(it).A08;
                if (r0 != null && (r0.A01 & 1) > 0) {
                    brazilPaymentActivity.A3x(r5);
                    return;
                }
            }
        }
        if (str == null) {
            brazilPaymentActivity.A03.A0A(new C23209B9r(r5, brazilPaymentActivity, 7));
        } else if ("brpay_p_account_recovery_eligibility_screen".equals(str)) {
            brazilPaymentActivity.A0V.A02(brazilPaymentActivity, "p2p_context", "request_flow");
        } else {
            BrazilPaymentActivity.A1A(brazilPaymentActivity, str, "p2p_context", brazilPaymentActivity.A0b, true);
        }
    }
}
