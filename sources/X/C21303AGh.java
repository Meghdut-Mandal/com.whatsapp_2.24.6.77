package X;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.AGh  reason: case insensitive filesystem */
public class C21303AGh implements C23078B3k {
    public final /* synthetic */ AGW A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ void BQt() {
    }

    public /* synthetic */ void BRn() {
    }

    public boolean BtO() {
        return true;
    }

    public C21303AGh(AGW agw, String str) {
        this.A00 = agw;
        this.A01 = str;
    }

    public String BEC(C207249un r2) {
        return this.A00.A07.A0S.A01(r2);
    }

    public void BQp() {
        BrazilPaymentActivity brazilPaymentActivity = this.A00.A07;
        String A012 = C201649k3.A01(brazilPaymentActivity.A0Q, "p2p_context", false);
        Intent A0F = C165597tg.A0F(brazilPaymentActivity);
        if (A012 == null) {
            A012 = "brpay_p_add_card";
        }
        A0F.putExtra("screen_name", A012);
        C1025050g.A01(A0F, "referral_screen", "payment_method_picker");
        C1025050g.A01(A0F, "onboarding_context", this.A01);
        brazilPaymentActivity.startActivity(A0F);
    }

    public /* synthetic */ boolean BtM() {
        return true;
    }

    public /* synthetic */ boolean BtW() {
        return true;
    }

    public void Bti(C207249un r2, PaymentMethodRow paymentMethodRow) {
        if (C203449o2.A08(r2)) {
            this.A00.A07.A0P.A02(r2, paymentMethodRow);
        }
    }

    public /* synthetic */ int BEA(C207249un r2) {
        return 0;
    }

    public /* synthetic */ String BED(C207249un r2) {
        return null;
    }

    public /* synthetic */ boolean Bt7(C207249un r2) {
        return false;
    }

    public /* synthetic */ View B8I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public /* synthetic */ View BC1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return null;
    }

    public /* synthetic */ View BFd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }
}
