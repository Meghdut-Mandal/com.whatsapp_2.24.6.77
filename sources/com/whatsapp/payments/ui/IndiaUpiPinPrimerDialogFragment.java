package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass17Y;
import X.AnonymousClass6YV;
import X.C012005e;
import X.C201659k4;
import X.C207249un;
import X.C20810yC;
import X.C21060yb;
import X.C23030B1b;
import X.C24801Dv;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class IndiaUpiPinPrimerDialogFragment extends Hilt_IndiaUpiPinPrimerDialogFragment {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C21060yb A02;
    public C20810yC A03;
    public C201659k4 A04;
    public AF7 A05;
    public C23030B1b A06;

    public void A1S(Bundle bundle, View view) {
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            C207249un r7 = (C207249un) bundle2.getParcelable("extra_bank_account");
            if (!(r7 == null || r7.A08 == null)) {
                C36391kE.A0O(view, R.id.desc).setText(C36411kG.A0w(C36341k9.A0G(this), this.A04.A04(r7), new Object[1], 0, R.string.f12nameremoved));
            }
            Context context = view.getContext();
            C20810yC r10 = this.A03;
            AnonymousClass17Y r72 = this.A01;
            C24801Dv r6 = this.A00;
            C21060yb r9 = this.A02;
            AnonymousClass6YV.A0E(context, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r6, r72, C36401kF.A0O(view, R.id.note), r9, r10, A0o(R.string.f12nameremoved, "learn-more"), "learn-more");
        }
        C36421kH.A13(C012005e.A02(view, R.id.continue_button), this, 1);
        C36421kH.A13(C012005e.A02(view, R.id.close), this, 2);
        this.A05.BOm(0, (Integer) null, "setup_pin_prompt", (String) null);
    }

    public void A19() {
        super.A19();
        this.A06 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }
}
