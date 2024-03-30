package com.whatsapp.report;

import X.AnonymousClass3LW;
import X.AnonymousClass3W2;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public class DownloadReportFailedDialogFragment extends WaDialogFragment {
    public Dialog A1a(Bundle bundle) {
        C39001qm A03 = AnonymousClass3LW.A03(this);
        A03.A0d(R.string.f12nameremoved);
        A03.A0c(R.string.f12nameremoved);
        A03.A0h(AnonymousClass3W2.A00, R.string.f12nameremoved);
        return A03.create();
    }
}
