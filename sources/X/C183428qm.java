package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.8qm  reason: invalid class name and case insensitive filesystem */
public class C183428qm extends C132446Tt {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0g.A04("Background VPA verification done.");
        indiaUpiSendPaymentActivity.A09 = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C183428qm(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        super(indiaUpiSendPaymentActivity, true);
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0g.A04("Verifying VPA in background...");
        indiaUpiSendPaymentActivity.A00 = 1;
        indiaUpiSendPaymentActivity.A0E.A01(indiaUpiSendPaymentActivity.A0I, (C135086c7) null, new B9U(new AVY(this, 21), indiaUpiSendPaymentActivity, 1));
        return null;
    }
}
