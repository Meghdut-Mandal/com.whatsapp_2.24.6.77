package X;

import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8hL  reason: invalid class name and case insensitive filesystem */
public final class C178778hL extends C196109Xr {
    public View A00;
    public final C178888i4 A01;
    public final boolean A02;

    public void A02(List list) {
        AnonymousClass00C.A0D(list, 0);
        super.A02(list);
        if (this.A02) {
            this.A00.setOnClickListener(this.A01);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C207249un r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.A02
            java.lang.String r3 = "defaultPaymentMethodSubTextView"
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentBankAccount"
            X.AnonymousClass00C.A0E(r5, r0)
            X.8bF r1 = r5.A08
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData"
            X.AnonymousClass00C.A0E(r1, r0)
            X.8b6 r1 = (X.C175818b6) r1
            boolean r2 = r1.A0G
            android.widget.ImageView r1 = r4.A01
            int r0 = r4.A03
            X.AnonymousClass3UF.A0E(r1, r0)
            android.widget.TextView r1 = r4.A02
            if (r2 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x0029
            r0 = 2131888661(0x7f120a15, float:1.9411964E38)
            r1.setText(r0)
        L_0x0029:
            android.widget.ImageView r1 = r4.A01
            if (r1 == 0) goto L_0x0033
            r0 = 2131232767(0x7f0807ff, float:1.8081653E38)
        L_0x0030:
            r1.setImageResource(r0)
        L_0x0033:
            android.view.View r1 = r4.A00
            if (r1 != 0) goto L_0x004c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x003c:
            if (r1 == 0) goto L_0x0044
            r0 = 2131888662(0x7f120a16, float:1.9411966E38)
            r1.setText(r0)
        L_0x0044:
            android.widget.ImageView r1 = r4.A01
            if (r1 == 0) goto L_0x0033
            r0 = 2131232777(0x7f080809, float:1.8081673E38)
            goto L_0x0030
        L_0x004c:
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r4.A00
            X.8i4 r0 = r4.A01
            r1.setOnClickListener(r0)
            return
        L_0x0058:
            super.A01(r5, r6)
            android.view.View r1 = r4.A00
            if (r1 != 0) goto L_0x0064
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0064:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178778hL.A01(X.9un, boolean):void");
    }

    public C178778hL(C178888i4 r1, boolean z) {
        super(r1);
        this.A01 = r1;
        this.A02 = z;
    }

    public void A00() {
        super.A00();
        this.A00 = C36361kB.A0G(this.A01.A00, R.id.default_payment_method_business_payments);
    }
}
