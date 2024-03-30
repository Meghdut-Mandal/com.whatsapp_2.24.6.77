package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass3L5;
import X.AnonymousClass4WJ;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C603737p;
import X.C66933Xw;
import X.C67413Zs;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;

public final class SecretCodeAuthenticationBottomSheet extends WDSBottomSheetDialogFragment {
    public TextInputEditText A00;
    public C603737p A01;
    public WDSButton A02;
    public String A03 = "";
    public TextInputLayout A04;
    public WDSButton A05;
    public final AnonymousClass3L5 A06;
    public final boolean A07;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        int i = 0;
        this.A06.A04((AnonymousClass11F) null, (Integer) null, 0, 17);
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.secret_code_input_layout);
        this.A04 = textInputLayout;
        if (textInputLayout != null) {
            textInputLayout.setHint((int) R.string.f12nameremoved);
        }
        TextInputLayout textInputLayout2 = this.A04;
        if (textInputLayout2 != null) {
            textInputLayout2.setEndIconMode(1);
        }
        View findViewById = view.findViewById(R.id.text_input_end_icon);
        if (findViewById != null) {
            findViewById.performClick();
        }
        ColorStateList A0G = C36431kI.A0G(view.getContext(), R.color.f6nameremoved);
        AnonymousClass00C.A08(A0G);
        TextInputLayout textInputLayout3 = this.A04;
        if (textInputLayout3 != null) {
            textInputLayout3.setHintTextColor(A0G);
        }
        TextInputLayout textInputLayout4 = this.A04;
        if (textInputLayout4 != null) {
            textInputLayout4.setBoxStrokeColorStateList(A0G);
        }
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(R.id.secret_code_edit_text);
        this.A00 = textInputEditText;
        if (textInputEditText != null) {
            AnonymousClass4WJ.A00(textInputEditText, this, 1);
            textInputEditText.setImeOptions(2);
            textInputEditText.setOnEditorActionListener(new C67413Zs(textInputEditText, this));
        }
        TextInputLayout textInputLayout5 = this.A04;
        if (textInputLayout5 != null) {
            textInputLayout5.requestFocus();
        }
        WDSButton A0u = C36441kJ.A0u(view, R.id.secret_code_authenticate_button);
        this.A02 = A0u;
        if (A0u != null) {
            C66933Xw.A00(A0u, this, 28);
        }
        WDSButton A0u2 = C36441kJ.A0u(view, R.id.secret_code_forgot_button);
        this.A05 = A0u2;
        if (A0u2 != null) {
            C66933Xw.A00(A0u2, this, 27);
        }
        WDSButton wDSButton = this.A05;
        if (wDSButton != null) {
            if (!(!this.A07)) {
                i = 8;
            }
            wDSButton.setVisibility(i);
        }
    }

    public SecretCodeAuthenticationBottomSheet(AnonymousClass3L5 r2, boolean z) {
        this.A06 = r2;
        this.A07 = z;
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }
}
