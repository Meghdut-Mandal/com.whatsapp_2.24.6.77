package X;

import android.view.View;
import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;

/* renamed from: X.9v3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9v3 implements View.OnClickListener {
    public final /* synthetic */ PaymentsWarmWelcomeBottomSheet A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass9v3(PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet, String str, String str2) {
        this.A00 = paymentsWarmWelcomeBottomSheet;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void onClick(View view) {
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        C22984Aza aza = paymentsWarmWelcomeBottomSheet.A01;
        if (aza != null) {
            aza.Bda(paymentsWarmWelcomeBottomSheet);
        }
        C23075B3f b3f = paymentsWarmWelcomeBottomSheet.A00;
        if (b3f != null) {
            Integer A0i = C36361kB.A0i();
            if (str == null) {
                str = "";
            }
            b3f.BOm(A0i, 36, str, str2);
            return;
        }
        throw C36331k8.A0d("paymentUIEventLogger");
    }
}
