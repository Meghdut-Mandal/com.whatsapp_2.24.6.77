package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass142;
import X.AnonymousClass3U8;
import X.C19730wQ;
import X.C20380xT;
import X.C24801Dv;
import X.C36351kA;
import X.C36391kE;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public class PhoneNumberSharedInCAGBottomSheet extends Hilt_PhoneNumberSharedInCAGBottomSheet {
    public C24801Dv A00;
    public C19730wQ A01;
    public C20380xT A02;

    public void A1S(Bundle bundle, View view) {
        String str;
        super.A1S(bundle, view);
        C19730wQ r0 = this.A01;
        r0.A0G();
        AnonymousClass142 r02 = r0.A0E;
        if (r02 != null) {
            str = AnonymousClass3U8.A04(C36351kA.A0j(r02));
        } else {
            str = null;
        }
        TextView textView = this.A02;
        if (!(str == null || textView == null)) {
            textView.setText(str);
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
