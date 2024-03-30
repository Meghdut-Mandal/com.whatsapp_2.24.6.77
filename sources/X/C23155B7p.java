package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.B7p  reason: case insensitive filesystem */
public class C23155B7p implements AnonymousClass4PI {
    public Object A00;
    public final int A01;

    public C23155B7p(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BfK(boolean z) {
        if (this.A01 != 0) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
            if (z) {
                IndiaUpiSendPaymentActivity.A14(indiaUpiSendPaymentActivity);
            } else {
                AnonymousClass3SJ.A01(indiaUpiSendPaymentActivity, 22);
            }
        } else {
            B1G b1g = (B1G) this.A00;
            if (z) {
                b1g.onSuccess();
            } else {
                b1g.BXH();
            }
        }
    }
}
