package com.whatsapp.inappsupport.ui.nux;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1LY;
import X.AnonymousClass3Y3;
import X.C19600wD;
import X.C33751fs;
import X.C36331k8;
import X.C36411kG;
import X.C36441kJ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class SupportAiNuxBottomSheet extends Hilt_SupportAiNuxBottomSheet {
    public C19600wD A00;
    public C33751fs A01;
    public AnonymousClass1LY A02;
    public boolean A03;
    public WDSButton A04;
    public WDSButton A05;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        AnonymousClass1LY r2 = this.A02;
        if (r2 != null) {
            r2.A00("support_ai", (Object) null);
            boolean z = this.A03;
            Bundle A07 = AnonymousClass001.A07();
            A07.putBoolean("start_chat", z);
            A0l().A0o("request_start_chat", A07);
            super.onDismiss(dialogInterface);
            return;
        }
        throw C36331k8.A0d("nuxManager");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0J = C36411kG.A0J(LayoutInflater.from(A0h()), viewGroup, R.layout.f9nameremoved);
        WDSButton A0u = C36441kJ.A0u(A0J, R.id.learn_more_button);
        AnonymousClass3Y3.A00(A0u, this, 30);
        this.A05 = A0u;
        WDSButton A0u2 = C36441kJ.A0u(A0J, R.id.button_continue);
        AnonymousClass3Y3.A00(A0u2, this, 29);
        this.A04 = A0u2;
        return A0J;
    }

    public void A1H() {
        super.A1H();
        this.A05 = null;
        this.A04 = null;
    }
}
