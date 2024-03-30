package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass3YM;
import X.B6J;
import X.C013105r;
import X.C207249un;
import X.C207349ux;
import X.C22979AzV;
import X.C36331k8;
import X.C36361kB;
import X.C36391kE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public final class IndiaUpiAccountTypeSelectionFragment extends Hilt_IndiaUpiAccountTypeSelectionFragment implements B6J {
    public AF7 A00;
    public String A01;
    public String A02;
    public final C22979AzV A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        String str;
        AnonymousClass00C.A0D(view, 0);
        ImageView imageView = (ImageView) C36361kB.A0G(view, R.id.nav_icon);
        AnonymousClass02E r0 = this.A0I;
        if (r0 == null || r0.A0k().A0I() <= 1) {
            imageView.setImageDrawable(C013105r.A01(view.getContext(), R.drawable.ic_close));
            i = 42;
        } else {
            imageView.setImageDrawable(C013105r.A01(view.getContext(), R.drawable.ic_back));
            i = 43;
        }
        C36391kE.A1I(imageView, this, i);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            str = bundle2.getString("referral_screen");
        } else {
            str = null;
        }
        this.A02 = str;
        PaymentMethodRow paymentMethodRow = (PaymentMethodRow) C36361kB.A0G(view, R.id.bank_account_row);
        PaymentMethodRow paymentMethodRow2 = (PaymentMethodRow) C36361kB.A0G(view, R.id.credit_card_row);
        View findViewById = paymentMethodRow.findViewById(R.id.payment_method_radio_button);
        View findViewById2 = paymentMethodRow2.findViewById(R.id.payment_method_radio_button);
        paymentMethodRow.A02.setText(A0n(R.string.f12nameremoved));
        paymentMethodRow.A03(A0n(R.string.f12nameremoved));
        paymentMethodRow.A00.setImageResource(R.drawable.av_bank);
        paymentMethodRow.A00();
        paymentMethodRow.setRadioButtonChecked(true);
        AnonymousClass3YM.A00(paymentMethodRow, this, findViewById, findViewById2, 11);
        paymentMethodRow2.A02.setText(A0n(R.string.f12nameremoved));
        paymentMethodRow2.A03(A0n(R.string.f12nameremoved));
        paymentMethodRow2.A00.setImageResource(R.drawable.av_card);
        paymentMethodRow2.A00();
        paymentMethodRow2.A05(false);
        AnonymousClass3YM.A00(paymentMethodRow2, this, findViewById, findViewById2, 10);
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C36361kB.A0G(view, R.id.continue_button);
        waButtonWithLoader.setButtonText((int) R.string.f12nameremoved);
        waButtonWithLoader.A00 = new C207349ux(this, 44);
        AF7 af7 = this.A00;
        if (af7 != null) {
            af7.BOm(0, (Integer) null, "available_payment_methods_prompt", this.A02);
            return;
        }
        throw C36331k8.A0d("indiaUpiFieldStatsLogger");
    }

    public String BEC(C207249un r2) {
        return null;
    }

    public boolean BtK() {
        return false;
    }

    public /* synthetic */ void Bti(C207249un r1, PaymentMethodRow paymentMethodRow) {
    }

    public IndiaUpiAccountTypeSelectionFragment(C22979AzV azV) {
        this.A03 = azV;
    }

    public /* synthetic */ boolean BtO() {
        return false;
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
}
