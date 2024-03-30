package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass17Y;
import X.AnonymousClass6YV;
import X.B5A;
import X.C012005e;
import X.C165567td;
import X.C199499fP;
import X.C201659k4;
import X.C207249un;
import X.C207359uy;
import X.C20810yC;
import X.C21060yb;
import X.C23055B2b;
import X.C24801Dv;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class IndiaUpiForgotPinDialogFragment extends Hilt_IndiaUpiForgotPinDialogFragment {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C21060yb A02;
    public C20810yC A03;
    public C199499fP A04;
    public C201659k4 A05;
    public AF7 A06;
    public C23055B2b A07;

    public void A1S(Bundle bundle, View view) {
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            C207249un r7 = (C207249un) bundle2.getParcelable("extra_bank_account");
            if (!(r7 == null || r7.A08 == null)) {
                C36391kE.A0O(view, R.id.desc).setText(C36411kG.A0w(C36341k9.A0G(this), this.A05.A04(r7), new Object[1], 0, R.string.f12nameremoved));
            }
            Context context = view.getContext();
            C20810yC r10 = this.A03;
            AnonymousClass17Y r72 = this.A01;
            C24801Dv r6 = this.A00;
            C21060yb r9 = this.A02;
            AnonymousClass6YV.A0E(context, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r6, r72, C36401kF.A0O(view, R.id.note), r9, r10, A0o(R.string.f12nameremoved, "learn-more"), "learn-more");
        }
        C207359uy.A00(C012005e.A02(view, R.id.continue_button), this, 16);
        C207359uy.A00(C012005e.A02(view, R.id.close), this, 17);
        C207359uy.A00(C012005e.A02(view, R.id.forgot_pin_button), this, 18);
        this.A06.BOm(0, (Integer) null, "forgot_pin_prompt", (String) null);
    }

    public void A19() {
        super.A19();
        this.A07 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C165567td.A0j(A0i());
        this.A04.A01(new B5A(this, 2));
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }
}
