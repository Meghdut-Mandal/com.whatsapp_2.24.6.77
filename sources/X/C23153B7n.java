package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity;

/* renamed from: X.B7n  reason: case insensitive filesystem */
public class C23153B7n implements AnonymousClass4PI {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23153B7n(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BfK(boolean z) {
        switch (this.A02) {
            case 0:
                C195029Se r5 = (C195029Se) this.A00;
                C135086c7 r3 = (C135086c7) this.A01;
                if (z) {
                    String str = r5.A07;
                    Bundle A07 = AnonymousClass001.A07();
                    A07.putParcelable("extra_payment_handle", r3);
                    A07.putString("extra_referral_screen", str);
                    IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = new IndiaUpiSendPaymentToVpaFragment();
                    indiaUpiSendPaymentToVpaFragment.A17(A07);
                    r5.A00 = indiaUpiSendPaymentToVpaFragment;
                    r5.A00((PaymentBottomSheet) null);
                    return;
                }
                C225014r r4 = r5.A04;
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = r5.A03.getString(R.string.f12nameremoved);
                r4.BO9(A0L, 0, R.string.f12nameremoved);
                return;
            case 1:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
                Runnable runnable = (Runnable) this.A01;
                if (z) {
                    runnable.run();
                    return;
                } else if (indiaUpiSendPaymentActivity.A0K) {
                    indiaUpiSendPaymentActivity.A00 = 3;
                    IndiaUpiSendPaymentActivity.A12(indiaUpiSendPaymentActivity);
                    return;
                } else {
                    AnonymousClass3SJ.A01(indiaUpiSendPaymentActivity, 22);
                    return;
                }
            default:
                C167797yq r42 = ((PaymentTransactionDetailsListActivity) this.A00).A0O;
                String str2 = ((C194139Og) this.A01).A0F;
                C194139Og r2 = new C194139Og(8);
                Context context = r42.A0P.A00;
                int i = R.string.f12nameremoved;
                if (z) {
                    i = R.string.f12nameremoved;
                }
                r2.A0C = C36321k7.A0A(context, str2, i);
                r42.A08.A0D(r2);
                return;
        }
    }
}
