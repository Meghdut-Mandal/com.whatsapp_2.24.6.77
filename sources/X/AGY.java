package X;

import android.content.Context;
import com.whatsapp.payments.ui.PaymentBottomSheet;

public final /* synthetic */ class AGY implements C22979AzV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C178848hw A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public /* synthetic */ AGY(Context context, C178848hw r2, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = r2;
        this.A02 = paymentBottomSheet;
        this.A00 = context;
    }

    public final void BUc(String str) {
        C178848hw r2 = this.A01;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        Context context = this.A00;
        paymentBottomSheet.A1b();
        r2.A4S(context, str, true);
    }
}
