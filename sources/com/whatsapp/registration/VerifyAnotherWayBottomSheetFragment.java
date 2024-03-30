package com.whatsapp.registration;

import X.AnonymousClass3Y6;
import X.C012005e;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class VerifyAnotherWayBottomSheetFragment extends Hilt_VerifyAnotherWayBottomSheetFragment {
    public WDSButton A00;
    public WDSButton A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        ViewGroup A0O = C36411kG.A0O(inflate, R.id.request_otp_code_buttons_layout);
        this.A01 = (WDSButton) layoutInflater.inflate(R.layout.f9nameremoved, A0O, false);
        this.A00 = (WDSButton) layoutInflater.inflate(R.layout.f9nameremoved, A0O, false);
        A0O.addView(this.A01);
        A0O.addView(this.A00);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        AnonymousClass3Y6.A00(C012005e.A02(view, R.id.request_otp_code_bottom_sheet_close_button), this, 35);
        C36351kA.A19(view, R.id.request_otp_code_bottom_sheet_icon);
        TextView A0O = C36391kE.A0O(view, R.id.request_otp_code_bottom_sheet_title);
        TextView A0O2 = C36391kE.A0O(view, R.id.request_otp_code_bottom_sheet_description);
        A0O.setText(R.string.f12nameremoved);
        A0O2.setText(R.string.f12nameremoved);
        this.A01.setText(R.string.f12nameremoved);
        this.A01.setIcon((int) R.drawable.ic_reg_sms_normal);
        AnonymousClass3Y6.A00(this.A01, this, 34);
        this.A00.setText(R.string.f12nameremoved);
        this.A00.setIcon((int) R.drawable.ic_reg_call_normal);
        AnonymousClass3Y6.A00(this.A00, this, 33);
    }
}
