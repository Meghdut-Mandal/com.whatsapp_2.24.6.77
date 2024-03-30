package com.whatsapp.report;

import X.AnonymousClass001;
import X.AnonymousClass00S;
import X.AnonymousClass3LW;
import X.AnonymousClass3TF;
import X.C36371kC;
import X.C36401kF;
import X.C39001qm;
import X.C65973Ue;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class DownloadLargeNewsletterReportFileConfirmationDialogFragment extends Hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment {
    public final AnonymousClass00S A00;
    public final long A01;

    public DownloadLargeNewsletterReportFileConfirmationDialogFragment(AnonymousClass00S r1, long j) {
        this.A01 = j;
        this.A00 = r1;
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A05 = AnonymousClass3LW.A05(this);
        A05.A0q(C36401kF.A0q(this, AnonymousClass3TF.A02(this.A01, this.A01), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
        A05.A0c(R.string.f12nameremoved);
        A05.A0l(this, new C65973Ue(this, 34), R.string.f12nameremoved);
        C39001qm.A04(this, A05);
        return C36371kC.A0O(A05);
    }
}
