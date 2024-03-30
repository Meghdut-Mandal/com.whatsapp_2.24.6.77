package com.whatsapp.twofactor;

import X.AnonymousClass3Y9;
import X.C36361kB;
import X.C36391kE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class DoneFragment extends Hilt_DoneFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A0b().getString("primaryCTA", "DONE");
    }

    public void A1S(Bundle bundle, View view) {
        TextView A0O = C36391kE.A0O(view, R.id.done_button);
        A0O.setText(R.string.f12nameremoved);
        AnonymousClass3Y9.A00(A0O, this, 2);
        TwoFactorAuthActivity twoFactorAuthActivity = (TwoFactorAuthActivity) A0h();
        twoFactorAuthActivity.A3i(view, twoFactorAuthActivity.A07.length);
    }
}
