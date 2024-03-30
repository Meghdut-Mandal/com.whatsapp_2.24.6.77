package com.whatsapp.profile;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass088;
import X.AnonymousClass0FL;
import X.AnonymousClass3Y5;
import X.AnonymousClass4LD;
import X.C001700s;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C65973Ue;
import X.C84404Dc;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

public final class SetUsernameBottomSheet extends Hilt_SetUsernameBottomSheet {
    public EditText A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(new C84404Dc(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        View findViewById;
        BottomSheetBehavior A022;
        AnonymousClass00C.A0D(view, 0);
        this.A04 = C36391kE.A0P(view, R.id.set_username_dialog_title);
        EditText editText = (EditText) view.findViewById(R.id.set_username_dialog_input);
        AnonymousClass088.A01(C36431kI.A0G(editText.getContext(), R.color.f6nameremoved), editText);
        this.A00 = editText;
        this.A03 = C36391kE.A0P(view, R.id.set_username_dialog_positive_cta);
        this.A01 = (ProgressBar) view.findViewById(R.id.set_username_dialog_positive_progressbar);
        this.A02 = C36391kE.A0P(view, R.id.set_username_dialog_negative_cta);
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(R.string.f12nameremoved);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            textView2.setText(R.string.f12nameremoved);
        }
        TextView textView3 = this.A02;
        if (textView3 != null) {
            textView3.setText(R.string.f12nameremoved);
        }
        TextView textView4 = this.A03;
        if (textView4 != null) {
            AnonymousClass3Y5.A00(textView4, this, 39);
        }
        TextView textView5 = this.A02;
        if (textView5 != null) {
            AnonymousClass3Y5.A00(textView5, this, 38);
        }
        UsernameViewModel usernameViewModel = (UsernameViewModel) this.A05.getValue();
        C001700s r2 = usernameViewModel.A03;
        if (r2.A04() == null) {
            C36401kF.A1I(usernameViewModel, (Integer) null);
            usernameViewModel.A05.A00(usernameViewModel);
        }
        C65973Ue.A01(this, r2, new AnonymousClass4LD(this), 1);
        Dialog dialog = this.A02;
        if ((dialog instanceof AnonymousClass0FL) && dialog != null && (findViewById = dialog.findViewById(R.id.design_bottom_sheet)) != null && (A022 = BottomSheetBehavior.A02(findViewById)) != null) {
            A022.A0W(3);
        }
    }

    public void A1J() {
        super.A1J();
        UsernameViewModel usernameViewModel = (UsernameViewModel) this.A05.getValue();
        usernameViewModel.A01 = null;
        C36401kF.A1I(usernameViewModel, (Integer) null);
        this.A04 = null;
        this.A00 = null;
        TextView textView = this.A03;
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener) null);
        }
        this.A03 = null;
        this.A01 = null;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
    }

    public void A1L() {
        super.A1L();
        EditText editText = this.A00;
        if (editText != null) {
            editText.requestFocus();
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
    }
}
