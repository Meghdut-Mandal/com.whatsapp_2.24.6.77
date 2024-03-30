package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet;

/* renamed from: X.6x4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C147346x4 implements C22980AzW {
    public final /* synthetic */ C207119ua A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public /* synthetic */ C147346x4(C207119ua r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r1;
    }

    public final void Bby(C207199ui r7, AnonymousClass2bZ r8) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        C207119ua r4 = this.A00;
        if (r7.A07) {
            indiaUpiCheckOrderDetailsActivity.A4p(false);
            String BGY = indiaUpiCheckOrderDetailsActivity.BGY();
            AnonymousClass00C.A0D(BGY, 0);
            PaymentMayBeInProgressBottomSheet paymentMayBeInProgressBottomSheet = new PaymentMayBeInProgressBottomSheet();
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("arg_receiver_name", BGY);
            paymentMayBeInProgressBottomSheet.A17(A07);
            paymentMayBeInProgressBottomSheet.A00 = new C122735vL(r4, indiaUpiCheckOrderDetailsActivity, paymentMayBeInProgressBottomSheet, r7);
            indiaUpiCheckOrderDetailsActivity.Btl(paymentMayBeInProgressBottomSheet, "PaymentMayBeInProgressBottomSheet");
            return;
        }
        indiaUpiCheckOrderDetailsActivity.A4o(r4, r7);
    }
}
