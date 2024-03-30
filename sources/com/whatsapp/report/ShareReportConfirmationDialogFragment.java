package com.whatsapp.report;

import X.AnonymousClass3LW;
import X.C39001qm;
import X.C88054Rf;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ShareReportConfirmationDialogFragment extends Hilt_ShareReportConfirmationDialogFragment {
    public C88054Rf A00;

    public Dialog A1a(Bundle bundle) {
        C39001qm A03 = AnonymousClass3LW.A03(this);
        A03.A0c(R.string.f12nameremoved);
        C39001qm.A07(A03);
        C39001qm.A0F(A03, this, 35, R.string.f12nameremoved);
        return A03.create();
    }
}
