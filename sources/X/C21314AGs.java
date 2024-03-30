package X;

import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;

/* renamed from: X.AGs  reason: case insensitive filesystem */
public final /* synthetic */ class C21314AGs implements C22987Azd {
    public final /* synthetic */ C207119ua A00;
    public final /* synthetic */ AnonymousClass11F A01;
    public final /* synthetic */ BrazilOrderDetailsActivity A02;
    public final /* synthetic */ C206349tD A03;
    public final /* synthetic */ AnonymousClass9SC A04;
    public final /* synthetic */ AnonymousClass9SC A05;
    public final /* synthetic */ C23043B1o A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ C21314AGs(C207119ua r1, AnonymousClass11F r2, BrazilOrderDetailsActivity brazilOrderDetailsActivity, C206349tD r4, AnonymousClass9SC r5, AnonymousClass9SC r6, C23043B1o b1o, String str) {
        this.A02 = brazilOrderDetailsActivity;
        this.A00 = r1;
        this.A06 = b1o;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A07 = str;
        this.A05 = r6;
    }

    public final void Azh(String str) {
        C206909uC r2;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A02;
        C207119ua r6 = this.A00;
        C23043B1o b1o = this.A06;
        C206349tD r4 = this.A03;
        AnonymousClass9SC r3 = this.A04;
        AnonymousClass11F r7 = this.A01;
        String str2 = this.A07;
        AnonymousClass9SC r22 = this.A05;
        short s = -1;
        switch (str.hashCode()) {
            case -2032781930:
                s = C90504aG.A0y("WhatsappPay", str);
                break;
            case -611537030:
                s = C90514aH.A1B("CustomPaymentInstructions", str);
                break;
            case 111007:
                s = C90514aH.A1C("pix", str);
                break;
        }
        switch (s) {
            case 0:
                BrazilOrderDetailsActivity.A11(r6, brazilOrderDetailsActivity, r4, b1o, "payment_options_prompt");
                return;
            case 1:
                for (C206369tH r1 : r3.A04) {
                    if (r1.A0A.equals(str)) {
                        C18740tg.A06(r7);
                        BrazilOrderDetailsActivity.A12(r7, brazilOrderDetailsActivity, r1.A06, "payment_options_prompt", str2);
                    }
                }
                return;
            case 2:
                if (r22 != null && (r2 = r22.A03) != null) {
                    String str3 = r2.A01;
                    if ("pix_static_code".equals(str3) || "pix_dynamic_code".equals(str3)) {
                        B5M b5m = r2.A00;
                        if (b5m instanceof C21335AHn) {
                            C18740tg.A06(r7);
                            C18740tg.A06(str2);
                            C18740tg.A06(r6);
                            BrazilOrderDetailsActivity.A10(r6, r7, brazilOrderDetailsActivity, (C21335AHn) b5m, str2, "payment_options_prompt");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C165577te.A1M("BrazilOrderDetailsActivity", "Bottom sheet click callback - This payment method is not supported");
                return;
        }
    }
}
