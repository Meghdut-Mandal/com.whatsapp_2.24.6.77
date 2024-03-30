package com.whatsapp.payments.ui.bottomsheet;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass3NG;
import X.AnonymousClass5ZJ;
import X.C012005e;
import X.C135086c7;
import X.C152877Me;
import X.C18820ts;
import X.C199849g7;
import X.C224914p;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C54932tn;
import X.C93154fy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Calendar;

public final class IndiaUpiDobPickerBottomSheet extends Hilt_IndiaUpiDobPickerBottomSheet {
    public C18820ts A00;
    public C199849g7 A01;
    public WDSButton A02;
    public final AnonymousClass00T A03 = C36431kI.A1I(new C152877Me(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        boolean z = A0b().getBoolean("BUNDLE_KEY_SHOW_TOOLBAR", false);
        View A022 = C012005e.A02(view, R.id.toolbar);
        if (z) {
            A022.setVisibility(0);
            AnonymousClass01I A0i = A0i();
            AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
            C54932tn.A00((C224914p) A0i, R.drawable.onboarding_actionbar_home_close);
        } else {
            A022.setVisibility(8);
        }
        TextInputLayout textInputLayout = (TextInputLayout) C36361kB.A0G(view, R.id.enter_dob_layout);
        C135086c7 r5 = (C135086c7) A0b().getParcelable("BUNDLE_BANK_ACCOUNT");
        if (r5 != null) {
            TextView A0M = C36341k9.A0M(view, R.id.enter_dob_description);
            Object[] A0L = AnonymousClass001.A0L();
            if (this.A01 != null) {
                A0M.setText(C36401kF.A0q(this, C199849g7.A00(r5), A0L, 0, R.string.f12nameremoved));
            } else {
                throw C36331k8.A0d("paymentMethodPresenter");
            }
        }
        WDSButton A0y = C36431kI.A0y(view, R.id.continue_cta);
        this.A02 = A0y;
        if (A0y != null) {
            A0y.setEnabled(false);
        }
        EditText editText = textInputLayout.A0B;
        if (editText != null) {
            Calendar instance = Calendar.getInstance();
            AnonymousClass00C.A08(instance);
            C93154fy r4 = new C93154fy(new AnonymousClass5ZJ(editText, this, 1), A0a(), (Calendar) null, R.style.f13nameremoved, instance.get(1), instance.get(2), instance.get(5));
            C36421kH.A12(editText, r4, 0);
            DatePicker datePicker = r4.A01;
            AnonymousClass00C.A08(datePicker);
            WDSButton wDSButton = this.A02;
            if (wDSButton != null) {
                C36371kC.A1F(wDSButton, this, datePicker, 38);
                return;
            }
            return;
        }
        throw C36381kD.A0l();
    }

    public void A1k(AnonymousClass3NG r4) {
        AnonymousClass00C.A0D(r4, 0);
        r4.A00.A06 = A0b().getBoolean("BUNDLE_KEY_SHOW_HANDLE", false);
    }
}
