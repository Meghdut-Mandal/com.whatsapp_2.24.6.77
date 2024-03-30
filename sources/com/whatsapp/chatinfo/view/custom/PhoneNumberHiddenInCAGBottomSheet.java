package com.whatsapp.chatinfo.view.custom;

import X.C19730wQ;
import X.C20380xT;
import X.C24801Dv;
import X.C27981Qp;
import X.C36391kE;
import X.C36431kI;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class PhoneNumberHiddenInCAGBottomSheet extends Hilt_PhoneNumberHiddenInCAGBottomSheet {
    public C24801Dv A00;
    public C19730wQ A01;
    public C20380xT A02;

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        WDSButton A0y = C36431kI.A0y(view, R.id.share_pn_cta_positive);
        WDSButton A0y2 = C36431kI.A0y(view, R.id.share_pn_cta_negative);
        A0y.setVariant(C27981Qp.FILLED);
        A0y2.setVariant(C27981Qp.BORDERLESS);
        String A0C = this.A01.A0C();
        TextView textView = this.A02;
        if (!(A0C == null || textView == null)) {
            textView.setText(A0C);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(R.string.f12nameremoved);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            textView3.setText(R.string.f12nameremoved);
        }
        TextView textView4 = this.A01;
        if (textView4 != null) {
            textView4.setText(R.string.f12nameremoved);
        }
        TextView textView5 = this.A03;
        if (textView5 != null) {
            textView5.setText(R.string.f12nameremoved);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (!(id == R.id.share_pn_close_button || id == R.id.share_pn_cta_positive)) {
            if (id == R.id.share_pn_cta_negative) {
                this.A00.A06(A0i(), C36391kE.A0G(this.A02.A02("831150864932965")));
            } else {
                return;
            }
        }
        A1c();
    }
}
