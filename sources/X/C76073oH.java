package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.3oH  reason: invalid class name and case insensitive filesystem */
public class C76073oH implements B1G {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C202319lY A02;
    public final /* synthetic */ C178398fs A03;
    public final /* synthetic */ String A04;

    public C76073oH(Context context, C202319lY r2, C178398fs r3, String str, int i) {
        this.A03 = r3;
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = str;
    }

    public void BXH() {
        this.A03.A05.A03(this.A01, this.A02);
    }

    public void onSuccess() {
        Context context = this.A01;
        context.startActivity(IndiaUpiMandatePaymentActivity.A0z(context, this.A02, this.A04, this.A00));
    }
}
