package com.whatsapp.components;

import X.AnonymousClass00C;
import X.C20380xT;
import X.C24801Dv;
import X.C36411kG;
import X.C36441kJ;
import X.C66943Xx;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class GroupHistoryBottomSheet extends Hilt_GroupHistoryBottomSheet {
    public C24801Dv A00;
    public C20380xT A01;
    public WDSButton A02;
    public WDSButton A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0J = C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
        WDSButton A0u = C36441kJ.A0u(A0J, R.id.ok_button);
        C66943Xx.A00(A0u, this, 24);
        this.A03 = A0u;
        WDSButton A0u2 = C36441kJ.A0u(A0J, R.id.learn_more_button);
        C66943Xx.A00(A0u2, this, 23);
        this.A02 = A0u2;
        return A0J;
    }

    public void A1H() {
        this.A03 = null;
        this.A02 = null;
        super.A1H();
    }
}
