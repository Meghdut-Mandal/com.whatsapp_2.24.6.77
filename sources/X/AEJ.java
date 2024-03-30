package X;

import android.content.Context;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.util.HashMap;

public final /* synthetic */ class AEJ implements AnonymousClass7hE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PaymentCheckoutOrderDetailsViewV2 A01;
    public final /* synthetic */ AnonymousClass9SC A02;
    public final /* synthetic */ C194219Oo A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AEJ(Context context, PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2, AnonymousClass9SC r3, C194219Oo r4, String str) {
        this.A01 = paymentCheckoutOrderDetailsViewV2;
        this.A00 = context;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = str;
    }

    public final void BQc(String str, String str2, boolean z) {
        PaymentCheckoutOrderDetailsViewV2 paymentCheckoutOrderDetailsViewV2 = this.A01;
        Context context = this.A00;
        C194219Oo r0 = this.A03;
        AnonymousClass9SC r5 = this.A02;
        String str3 = this.A04;
        if (z) {
            AnonymousClass1Z2 r1 = paymentCheckoutOrderDetailsViewV2.A0U;
            C18740tg.A06(str);
            C18740tg.A06(str2);
            r1.A01(context, (Runnable) null, str, str2);
            return;
        }
        C88874Uj r12 = r0.A0A;
        C23043B1o b1o = r0.A0B;
        AnonymousClass11F r3 = r0.A08;
        C207119ua r2 = r0.A06;
        String str4 = r0.A0L;
        C206349tD r4 = r0.A09;
        String str5 = r0.A0D;
        HashMap hashMap = r0.A0M;
        if (str3 == null) {
            str3 = "order_details";
        }
        r12.BTU(r2, r3, r4, r5, b1o, str4, str5, str3, hashMap);
    }
}
