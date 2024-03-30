package com.whatsapp.calling.callhistory.view;

import X.AnonymousClass00C;
import X.AnonymousClass04S;
import X.AnonymousClass0FM;
import X.AnonymousClass17Y;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HP;
import X.AnonymousClass3LW;
import X.C165167sz;
import X.C19770wU;
import X.C19970wo;
import X.C26211Jh;
import X.C30541aN;
import X.C34061gO;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class CallsHistoryClearCallLogDialogFragment extends Hilt_CallsHistoryClearCallLogDialogFragment {
    public AnonymousClass17Y A00;
    public C30541aN A01;
    public C19970wo A02;
    public AnonymousClass1HJ A03;
    public C26211Jh A04;
    public C34061gO A05;
    public C19770wU A06;
    public AnonymousClass1HP A07;

    public Dialog A1a(Bundle bundle) {
        C165167sz r1 = new C165167sz(this, 43);
        C39001qm A052 = AnonymousClass3LW.A05(this);
        A052.A0c(R.string.f12nameremoved);
        A052.A0m(this, r1, R.string.f12nameremoved);
        A052.A0l(this, (AnonymousClass04S) null, R.string.f12nameremoved);
        AnonymousClass0FM create = A052.create();
        AnonymousClass00C.A08(create);
        return create;
    }
}
