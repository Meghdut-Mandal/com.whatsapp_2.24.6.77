package com.whatsapp.payments.ui.international;

import X.AF7;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.C012005e;
import X.C131606Ps;
import X.C203049nB;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public final class IndiaUpiInternationalExchangeDialogFragment extends Hilt_IndiaUpiInternationalExchangeDialogFragment {
    public AF7 A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        String str;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C36421kH.A12(C012005e.A02(view, R.id.close), this, 7);
        C36421kH.A12(C012005e.A02(view, R.id.continue_button), this, 8);
        TextView A0O = C36391kE.A0O(view, R.id.exchange_rate);
        Object[] A0M = AnonymousClass001.A0M();
        Bundle bundle2 = this.A0A;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("extra_base_currency");
        } else {
            str = null;
        }
        A0M[0] = str;
        Bundle bundle3 = this.A0A;
        if (bundle3 != null) {
            str2 = bundle3.getString("extra_exchange_rate");
        }
        A0M[1] = str2;
        C36381kD.A1E(A0O, this, A0M, R.string.f12nameremoved);
        AF7 af7 = this.A00;
        if (af7 != null) {
            C203049nB.A04((C131606Ps) null, af7, "currency_exchange_prompt", (String) null);
            return;
        }
        throw C36331k8.A0d("indiaUpiFieldStatsLogger");
    }
}
