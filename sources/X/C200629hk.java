package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.9hk  reason: invalid class name and case insensitive filesystem */
public class C200629hk implements C22979AzV {
    public Object A00;
    public Object A01;
    public final int A02;

    public C200629hk(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BUc(String str) {
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                C36431kI.A1N(this.A01);
                ((C178848hw) obj).A4e(str);
                return;
            case 1:
                C36431kI.A1N(this.A01);
                ((C21304AGi) obj).A01.A4e(str);
                return;
            default:
                C36431kI.A1N(this.A01);
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = ((AH4) obj).A00;
                indiaUpiSendPaymentActivity.A4S(indiaUpiSendPaymentActivity, str, true);
                return;
        }
    }
}
