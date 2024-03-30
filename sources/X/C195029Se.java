package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9Se  reason: invalid class name and case insensitive filesystem */
public class C195029Se {
    public IndiaUpiSendPaymentToVpaFragment A00;
    public PaymentBottomSheet A01;
    public final Activity A02;
    public final Context A03;
    public final C225014r A04;
    public final A8P A05;
    public final AnonymousClass3EU A06;
    public final String A07;
    public final boolean A08;

    public void A00(PaymentBottomSheet paymentBottomSheet) {
        IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = this.A00;
        if (indiaUpiSendPaymentToVpaFragment == null) {
            String str = this.A07;
            Bundle A072 = AnonymousClass001.A07();
            A072.putParcelable("extra_payment_handle", (Parcelable) null);
            A072.putString("extra_referral_screen", str);
            indiaUpiSendPaymentToVpaFragment = new IndiaUpiSendPaymentToVpaFragment();
            indiaUpiSendPaymentToVpaFragment.A17(A072);
            this.A00 = indiaUpiSendPaymentToVpaFragment;
        }
        indiaUpiSendPaymentToVpaFragment.A0I = this;
        if (paymentBottomSheet != null) {
            this.A01 = paymentBottomSheet;
            paymentBottomSheet.A1n(indiaUpiSendPaymentToVpaFragment);
            return;
        }
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        this.A01 = paymentBottomSheet2;
        paymentBottomSheet2.A02 = this.A00;
        this.A04.Btm(paymentBottomSheet2);
    }

    public C195029Se(Activity activity, C225014r r2, A8P a8p, AnonymousClass3EU r4, String str, boolean z) {
        this.A02 = activity;
        this.A03 = activity;
        this.A07 = str;
        this.A04 = r2;
        this.A06 = r4;
        this.A05 = a8p;
        this.A08 = z;
    }
}
