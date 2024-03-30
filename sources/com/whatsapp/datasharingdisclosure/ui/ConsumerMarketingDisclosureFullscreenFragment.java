package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00C;
import X.AnonymousClass09Y;
import X.AnonymousClass11F;
import X.AnonymousClass1RC;
import X.AnonymousClass4QN;
import X.AnonymousClass4T5;
import X.C30921az;
import X.C36411kG;
import X.C51612o6;
import X.C54182sX;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class ConsumerMarketingDisclosureFullscreenFragment extends Hilt_ConsumerMarketingDisclosureFullscreenFragment implements AnonymousClass4QN {
    public AnonymousClass4T5 A00;
    public final AnonymousClass11F A01;
    public final C30921az A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        ConsumerMarketingDisclosureFragment A002 = C54182sX.A00(this.A01, this.A02, C51612o6.BLOCKING_DISCLOSURE);
        AnonymousClass4T5 r0 = this.A00;
        if (r0 != null) {
            A002.A05 = r0;
        }
        AnonymousClass09Y A0S = C36411kG.A0S(this);
        A0S.A0B(A002, R.id.fullscreen_fragment_container);
        A0S.A03();
        Dialog dialog = this.A02;
        if (dialog != null) {
            AnonymousClass1RC.A02(R.color.f6nameremoved, dialog);
        }
    }

    public ConsumerMarketingDisclosureFullscreenFragment(AnonymousClass11F r1, C30921az r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
    }

    public void BqM(AnonymousClass4T5 r1) {
        this.A00 = r1;
    }
}
