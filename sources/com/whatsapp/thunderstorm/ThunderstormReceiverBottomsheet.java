package com.whatsapp.thunderstorm;

import X.AnonymousClass00C;
import X.AnonymousClass3Y9;
import X.C36431kI;
import X.C67103Yn;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class ThunderstormReceiverBottomsheet extends Hilt_ThunderstormReceiverBottomsheet {
    public WDSButton A00;
    public WDSButton A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A00 = C36431kI.A0y(inflate, R.id.thunderstorm_accept_button);
        this.A01 = C36431kI.A0y(inflate, R.id.thunderstorm_deny_button);
        AnonymousClass00C.A0B(inflate);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        WDSButton wDSButton = this.A00;
        if (wDSButton != null) {
            AnonymousClass3Y9.A00(wDSButton, this, 0);
        }
        WDSButton wDSButton2 = this.A01;
        if (wDSButton2 != null) {
            C67103Yn.A00(wDSButton2, this, 49);
        }
    }
}
