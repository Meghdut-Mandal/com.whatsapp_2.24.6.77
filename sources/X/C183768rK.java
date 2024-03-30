package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.8rK  reason: invalid class name and case insensitive filesystem */
public class C183768rK extends C132446Tt {
    public final boolean A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C183768rK(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, boolean z) {
        super(indiaUpiSendPaymentActivity, true);
        this.A01 = indiaUpiSendPaymentActivity;
        this.A00 = z;
    }

    private void A00(UserJid userJid, C23054B2a b2a) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C165567td.A16(indiaUpiSendPaymentActivity.A0g, userJid, "sendGetContactInfoForJid: ", AnonymousClass000.A0u());
        indiaUpiSendPaymentActivity.A06.A00(indiaUpiSendPaymentActivity, userJid, indiaUpiSendPaymentActivity.A04, b2a, indiaUpiSendPaymentActivity.A0P.A05());
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C175698au r4 = (C175698au) C165617ti.A0O(indiaUpiSendPaymentActivity.A0P).A05(indiaUpiSendPaymentActivity.A0E);
        C165567td.A16(indiaUpiSendPaymentActivity.A0g, r4, "got contact vpa: ", AnonymousClass000.A0u());
        if (r4 == null || C202349ld.A02(r4.A01)) {
            A00(indiaUpiSendPaymentActivity.A0E, new C23156B7q(indiaUpiSendPaymentActivity, 1));
            indiaUpiSendPaymentActivity.A0a = true;
            indiaUpiSendPaymentActivity.Bu1(R.string.f12nameremoved);
            return null;
        }
        if (C202349ld.A02(r4.A00)) {
            A00(indiaUpiSendPaymentActivity.A0E, new C23156B7q(indiaUpiSendPaymentActivity, 2));
        }
        return r4;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C175698au r3 = (C175698au) obj;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        if (r3 != null) {
            indiaUpiSendPaymentActivity.A0I = r3.A01;
            indiaUpiSendPaymentActivity.A0h = r3.A02;
            if (!C202349ld.A02(r3.A00)) {
                indiaUpiSendPaymentActivity.A0G = r3.A00;
            }
        } else {
            indiaUpiSendPaymentActivity.A0I = null;
            indiaUpiSendPaymentActivity.A0h = null;
        }
        IndiaUpiSendPaymentActivity.A17(indiaUpiSendPaymentActivity, this.A00);
    }
}
