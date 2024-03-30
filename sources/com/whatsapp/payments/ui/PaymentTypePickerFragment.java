package com.whatsapp.payments.ui;

import X.C18740tg;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36421kH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public abstract class PaymentTypePickerFragment extends Hilt_PaymentTypePickerFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        String string = A0b().getString("arg_type", "goodAndServices");
        C18740tg.A06(string);
        C36391kE.A0P(view, R.id.buying_goods_and_services_text).setText(R.string.f12nameremoved);
        C36391kE.A0P(view, R.id.buying_goods_and_services_hint_text).setText(A0n(R.string.f12nameremoved));
        C36391kE.A0P(view, R.id.sending_to_friends_and_family_text).setText(R.string.f12nameremoved);
        C36391kE.A0P(view, R.id.sending_to_friends_and_family_hint_text).setText(A0n(R.string.f12nameremoved));
        boolean equals = string.equals("goodAndServices");
        View findViewById = view.findViewById(R.id.buying_goods_and_services_check);
        if (equals) {
            findViewById.setVisibility(0);
            C36341k9.A10(view, R.id.sending_to_friends_and_family_check, 4);
        } else {
            findViewById.setVisibility(4);
            C36341k9.A10(view, R.id.sending_to_friends_and_family_check, 0);
        }
        C36421kH.A13(view.findViewById(R.id.sending_to_friends_and_family_container), this, 38);
        C36421kH.A13(view.findViewById(R.id.buying_goods_and_services_container), this, 39);
        C36421kH.A13(view.findViewById(R.id.back), this, 40);
    }
}
