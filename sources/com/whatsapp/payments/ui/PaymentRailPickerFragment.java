package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.C18740tg;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36421kH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class PaymentRailPickerFragment extends Hilt_PaymentRailPickerFragment {
    public static PaymentRailPickerFragment A00(int i, boolean z) {
        String str;
        PaymentRailPickerFragment paymentRailPickerFragment = new PaymentRailPickerFragment();
        Bundle A07 = AnonymousClass001.A07();
        if (i != 0) {
            str = "debit";
        } else {
            str = "credit";
        }
        A07.putString("arg_type", str);
        A07.putBoolean("arg_is_p2p", z);
        paymentRailPickerFragment.A17(A07);
        return paymentRailPickerFragment;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        Bundle A0b = A0b();
        String string = A0b.getString("arg_type", "credit");
        C18740tg.A06(string);
        boolean equals = string.equals("credit");
        View findViewById = view.findViewById(R.id.credit_card_check);
        if (equals) {
            findViewById.setVisibility(0);
            C36341k9.A10(view, R.id.debit_card_check, 4);
        } else {
            findViewById.setVisibility(4);
            C36341k9.A10(view, R.id.debit_card_check, 0);
        }
        View findViewById2 = view.findViewById(R.id.payment_rail_credit_card_container);
        C18740tg.A04(findViewById2);
        C36421kH.A13(findViewById2, this, 31);
        if (A0b.getBoolean("arg_is_p2p")) {
            findViewById2.setEnabled(false);
            View findViewById3 = findViewById2.findViewById(R.id.payment_rail_credit_card_text);
            C18740tg.A04(findViewById3);
            C36351kA.A15(C36341k9.A0G(this), (TextView) findViewById3, R.color.f6nameremoved);
            View findViewById4 = findViewById2.findViewById(R.id.payment_rail_credit_card_education);
            C18740tg.A04(findViewById4);
            findViewById4.setVisibility(0);
        }
        C36421kH.A13(view.findViewById(R.id.payment_rail_debit_card_container), this, 32);
        C36421kH.A13(view.findViewById(R.id.back), this, 33);
    }
}
