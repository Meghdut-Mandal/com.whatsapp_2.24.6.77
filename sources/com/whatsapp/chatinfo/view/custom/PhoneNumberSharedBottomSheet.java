package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3TE;
import X.C20380xT;
import X.C24801Dv;
import X.C36331k8;
import X.C36341k9;
import X.C36401kF;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class PhoneNumberSharedBottomSheet extends Hilt_PhoneNumberSharedBottomSheet {
    public C24801Dv A00;
    public C20380xT A01;
    public final AnonymousClass00T A02 = AnonymousClass3TE.A03(this, "arg_is_business", false);
    public final AnonymousClass00T A03 = AnonymousClass3TE.A01(this, "arg_my_phone_number");
    public final boolean A04 = true;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        TextView textView = this.A02;
        if (textView != null) {
            C36401kF.A1A(textView, this.A03);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(R.string.f12nameremoved);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            boolean A1b = C36331k8.A1b(this.A02);
            int i = R.string.f12nameremoved;
            if (A1b) {
                i = R.string.f12nameremoved;
            }
            textView3.setText(i);
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
        AnonymousClass00C.A0D(view, 0);
        int id = view.getId();
        if (id == R.id.share_pn_close_button || id == R.id.share_pn_cta_positive) {
            A1c();
        } else if (id == R.id.share_pn_cta_negative) {
            C20380xT r1 = this.A01;
            if (r1 != null) {
                Intent A0D = C36341k9.A0D(r1, "626403979060997");
                C24801Dv r12 = this.A00;
                if (r12 != null) {
                    r12.A06(A0a(), A0D);
                    return;
                }
                throw C36331k8.A0d("activityUtils");
            }
            throw C36331k8.A0d("faqLinkFactory");
        }
    }
}
