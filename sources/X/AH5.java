package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.math.BigDecimal;

public class AH5 implements C160477l4 {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public AH5(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public String BFW() {
        Object obj;
        C135086c7 r0 = this.A00.A0I;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.A00;
        }
        return (String) obj;
    }

    public boolean BMe() {
        String str;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (indiaUpiSendPaymentActivity.A0m != null || (str = indiaUpiSendPaymentActivity.A0k) == null) {
            return true;
        }
        if (indiaUpiSendPaymentActivity.A0U == null || BigDecimal.ZERO.compareTo(C165617ti.A0b(str)) != 0) {
            return false;
        }
        return true;
    }

    public boolean BND() {
        return this.A00.A45();
    }

    public AnonymousClass01L B8E() {
        return this.A00;
    }
}
