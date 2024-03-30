package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass4OT;
import X.C012005e;
import X.C207359uy;
import X.C36361kB;
import X.C36381kD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class IndiaUpiPaymentRaiseComplaintFragment extends Hilt_IndiaUpiPaymentRaiseComplaintFragment {
    public AF7 A00;
    public AnonymousClass4OT A01;

    public void A19() {
        super.A19();
        this.A01 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        C012005e.A02(view, R.id.complaint_button).setOnClickListener(new C207359uy(this, 33));
        C012005e.A02(view, R.id.close).setOnClickListener(new C207359uy(this, 34));
        this.A00.BOm(C36381kD.A0m(), (Integer) null, "raise_complaint_prompt", (String) null);
    }
}
