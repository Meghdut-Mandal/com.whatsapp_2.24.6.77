package com.whatsapp.report;

import X.AnonymousClass3LW;
import X.C39001qm;
import X.C88044Re;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import com.whatsapp.R;

public class DeleteReportConfirmationDialogFragment extends Hilt_DeleteReportConfirmationDialogFragment {
    public C88044Re A00;

    public Dialog A1a(Bundle bundle) {
        C39001qm A03 = AnonymousClass3LW.A03(this);
        A03.A0p(Html.fromHtml(A0n(R.string.f12nameremoved)));
        C39001qm.A07(A03);
        C39001qm.A0F(A03, this, 34, R.string.f12nameremoved);
        return A03.create();
    }
}
