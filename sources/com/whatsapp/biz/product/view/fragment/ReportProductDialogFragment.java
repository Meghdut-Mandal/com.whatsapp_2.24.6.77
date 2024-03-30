package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass3LW;
import X.AnonymousClass4PH;
import X.AnonymousClass4XL;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ReportProductDialogFragment extends Hilt_ReportProductDialogFragment {
    public AnonymousClass4PH A00;

    public Dialog A1a(Bundle bundle) {
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0L(R.string.f12nameremoved);
        A04.A0K(R.string.f12nameremoved);
        A04.setPositiveButton(R.string.f12nameremoved, AnonymousClass4XL.A00(this, 21));
        return C36431kI.A0R(AnonymousClass4XL.A00(this, 22), A04, R.string.f12nameremoved);
    }
}
