package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00C;
import X.AnonymousClass3Y3;
import X.AnonymousClass4XY;
import X.C19600wD;
import X.C33761ft;
import X.C36331k8;
import X.C36411kG;
import X.C36441kJ;
import X.C65263Rj;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.wds.components.button.WDSButton;

public final class SupportNegativeFeedbackBottomSheet extends Hilt_SupportNegativeFeedbackBottomSheet {
    public CheckBox A00;
    public CheckBox A01;
    public CheckBox A02;
    public CheckBox A03;
    public CheckBox A04;
    public WaImageButton A05;
    public C19600wD A06;
    public C65263Rj A07;
    public C33761ft A08;
    public WDSButton A09;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0J = C36411kG.A0J(LayoutInflater.from(A0h()), viewGroup, R.layout.f9nameremoved);
        AnonymousClass00C.A0B(A0J);
        CheckBox checkBox = (CheckBox) A0J.findViewById(R.id.checkbox_not_relevant);
        checkBox.setText(R.string.f12nameremoved);
        AnonymousClass4XY.A00(checkBox, this, 12);
        this.A02 = checkBox;
        CheckBox checkBox2 = (CheckBox) A0J.findViewById(R.id.checkbox_not_accurate);
        checkBox2.setText(R.string.f12nameremoved);
        AnonymousClass4XY.A00(checkBox2, this, 10);
        this.A01 = checkBox2;
        CheckBox checkBox3 = (CheckBox) A0J.findViewById(R.id.checkbox_too_repetitive);
        checkBox3.setText(R.string.f12nameremoved);
        AnonymousClass4XY.A00(checkBox3, this, 14);
        this.A04 = checkBox3;
        CheckBox checkBox4 = (CheckBox) A0J.findViewById(R.id.checkbox_harmful);
        checkBox4.setText(R.string.f12nameremoved);
        AnonymousClass4XY.A00(checkBox4, this, 13);
        this.A00 = checkBox4;
        CheckBox checkBox5 = (CheckBox) A0J.findViewById(R.id.checkbox_other);
        checkBox5.setText(R.string.f12nameremoved);
        AnonymousClass4XY.A00(checkBox5, this, 11);
        this.A03 = checkBox5;
        WaImageButton waImageButton = (WaImageButton) A0J.findViewById(R.id.close_button);
        AnonymousClass3Y3.A00(waImageButton, this, 25);
        this.A05 = waImageButton;
        WDSButton A0u = C36441kJ.A0u(A0J, R.id.submit_button);
        A0u.setEnabled(false);
        AnonymousClass3Y3.A00(A0u, this, 24);
        this.A09 = A0u;
        C33761ft r1 = this.A08;
        if (r1 != null) {
            r1.A01(16);
            return A0J;
        }
        throw C36331k8.A0d("supportLogger");
    }

    public void A1H() {
        super.A1H();
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A00 = null;
        this.A03 = null;
        this.A05 = null;
        this.A09 = null;
    }
}
