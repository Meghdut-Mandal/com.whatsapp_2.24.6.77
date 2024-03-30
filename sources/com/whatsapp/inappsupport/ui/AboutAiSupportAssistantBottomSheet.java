package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00C;
import X.AnonymousClass3Y3;
import X.C33751fs;
import X.C36411kG;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class AboutAiSupportAssistantBottomSheet extends Hilt_AboutAiSupportAssistantBottomSheet {
    public C33751fs A00;
    public WDSButton A01;
    public WDSButton A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0J = C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
        WDSButton A0u = C36441kJ.A0u(A0J, R.id.ok_button);
        AnonymousClass3Y3.A00(A0u, this, 13);
        this.A02 = A0u;
        WDSButton A0u2 = C36441kJ.A0u(A0J, R.id.learn_more_button);
        AnonymousClass3Y3.A00(A0u2, this, 14);
        this.A01 = A0u2;
        return A0J;
    }

    public void A1H() {
        super.A1H();
        this.A02 = null;
        this.A01 = null;
    }
}
