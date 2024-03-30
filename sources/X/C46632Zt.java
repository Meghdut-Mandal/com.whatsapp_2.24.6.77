package X;

import com.whatsapp.payments.ui.MessageWithLinkWebViewActivity;
import com.whatsapp.payments.ui.PaymentWebViewActivity;

/* renamed from: X.2Zt  reason: invalid class name and case insensitive filesystem */
public abstract class C46632Zt extends PaymentWebViewActivity {
    public boolean A00 = false;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            MessageWithLinkWebViewActivity messageWithLinkWebViewActivity = (MessageWithLinkWebViewActivity) this;
            C18800tq r2 = ((C27111My) C36421kH.A0H(this)).A5g;
            C36321k7.A0c(r2, messageWithLinkWebViewActivity);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, messageWithLinkWebViewActivity, C36321k7.A05(r2, r1, messageWithLinkWebViewActivity));
            AnonymousClass24Z.A01(r2, r1, messageWithLinkWebViewActivity);
            messageWithLinkWebViewActivity.A01 = (AnonymousClass3PX) r2.ATW.get();
            messageWithLinkWebViewActivity.A00 = C36381kD.A0f(r2);
        }
    }

    public C46632Zt() {
        C89354Wf.A00(this, 0);
    }
}
